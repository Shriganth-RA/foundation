package multiThreading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Train {
    volatile List<String> availableTickets = Arrays.asList("1A", "2A", "3A", "4A", "5A", "6A", "7A", "8A", "9A", "10A");
    volatile List<String> bookedTickets = new ArrayList<>();

    public synchronized void booking(String seat) {
        if (bookedTickets.contains(seat)) {
            System.out.println(Thread.currentThread().getName() + " ==> " + seat + " seat is not available...");
        } else {
            bookedTickets.add(seat);
            System.out.println(Thread.currentThread().getName() + " ==> " + seat + " seat is booked successfully.");
        }
    }
}

class User1 extends Thread {
    Train train;
    String seat;
    public User1(Train train, String seat) {
        this.train = train;
        this.seat = seat;
    }

    @Override
    public void run() {
        train.booking(seat);
    }
}

class User2 extends Thread {
    Train train;
    String seat;
    public User2(Train train, String seat) {
        this.train = train;
        this.seat = seat;
    }

    @Override
    public void run() {
        train.booking(seat);
    }
}

public class Sample {
    static void main() {
        Train train = new Train();

        User1 user1 = new User1(train, "10A");
        User2 user2 = new User2(train, "10A");

        user1.start();
        user2.start();
    }
}