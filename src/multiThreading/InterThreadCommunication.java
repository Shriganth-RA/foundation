package multiThreading;

class Restaurent {
    boolean isFoodReady = false;

    public synchronized void customer() throws InterruptedException {
        System.out.println("Customer entered the restaurent...");
        if (!isFoodReady) {
            wait();
        }
        System.out.println("Food is delicious...");
    }

    public synchronized void waiter() {

    }
}

public class InterThreadCommunication {
}
