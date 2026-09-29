package multiThreading;

import java.util.LinkedList;
import java.util.Queue;

class CabService {
    Queue<String> rideRequests = new LinkedList<>();

    public synchronized void rideRequest(String username) {
        rideRequests.add(username);
        System.out.println(username + " requested a ride.");
        notifyAll();
    }

    public synchronized String waitForRide(String driverName) {
        while (rideRequests.isEmpty()) {
            System.out.println(driverName + " is waiting for a ride request...");
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        if (rideRequests.isEmpty()) {
            return null;
        }

        return rideRequests.poll();
    }
}

class UserThread extends Thread {
    String userName;
    CabService cs;
    public UserThread(String userName, CabService cs) {
        this.userName = userName;
        this.cs = cs;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        cs.rideRequest(userName);
    }
}

class DriverThread extends Thread {
    String driverName;
    CabService cs;
    public DriverThread(String driverName, CabService cs) {
        this.driverName = driverName;
        this.cs = cs;
    }

    @Override
    public void run() {
        while (true) {
            String user = cs.waitForRide(driverName);

//            System.out.println(user);

            if (user == null) {
                break;
            }

            System.out.println(driverName + " accepted ride for " + user);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }

            System.out.println(driverName + " finished the ride...");
        }
    }
}

public class InterThreadCommTask1 {
    static void main() {
        CabService cs = new CabService();

        DriverThread driver1 = new DriverThread("Driver-1", cs);
        DriverThread driver2 = new DriverThread("Driver-2", cs);
        DriverThread driver3 = new DriverThread("Driver-3", cs);

        UserThread user1 = new UserThread("User-1", cs);
        UserThread user2 = new UserThread("User-2", cs);
        UserThread user3 = new UserThread("User-3", cs);
        UserThread user4 = new UserThread("User-4", cs);
        UserThread user5 = new UserThread("User-5", cs);

        user1.start();
        user2.start();
        user3.start();
        user4.start();
        user5.start();

        driver1.start();
        driver2.start();
        driver3.start();
    }
}
