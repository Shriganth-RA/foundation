package multiThreading;

class Running {
    volatile boolean running = true;

    public void threadRun() {
        while (running) {
            System.out.println("Thread is running...");
        }
    }

    public void threadStop() {
        System.out.println("Thread stop...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted occurs...");
        }
        running = false;
        System.out.println("Thread stopped...");
    }
}

public class VolatileThreadTask1 extends Thread {
    Running r;

    public VolatileThreadTask1(Running r) {
        this.r = r;
    }

    @Override
    public void run() {
        r.threadRun();
    }

    public static void main(String[] args) {
        Running r = new Running();

        VolatileThreadTask1 t1 = new VolatileThreadTask1(r);

        t1.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted occurs...");
        }
        r.threadStop();
    }
}
