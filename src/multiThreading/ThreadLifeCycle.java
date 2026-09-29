package multiThreading;

public class ThreadLifeCycle extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is RUNNING");

        try {
            Thread.sleep(2000); // TIMED_WAITING
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread is RUNNABLE again");
    }

    public static void main(String[] args) throws InterruptedException {

        ThreadLifeCycle t = new ThreadLifeCycle();

        // 1. NEW
        System.out.println("After creation: " + t.getState());

        // 2. RUNNABLE
        t.start();
        System.out.println("After start(): " + t.getState());

        // Give thread time to enter sleep
        Thread.sleep(500);

        // 3. TIMED_WAITING
        System.out.println("During sleep(): " + t.getState());

        // Wait until thread finishes
        t.join();

        // 4. TERMINATED
        System.out.println("After completion: " + t.getState());
    }
}
