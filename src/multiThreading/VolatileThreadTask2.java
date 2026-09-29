package multiThreading;

class Server {
    volatile boolean isRunning = true;
    public void start() {
        while (isRunning) {
            System.out.println("Server is running...");
        }
    }
    public void stop() {
        try {
            Thread.sleep(3000);
            isRunning = false;
        } catch (InterruptedException e) {
            System.out.println("Interruption occurs on thread...");
        }
        System.out.println("Server stopped.");
    }
}

class Thread1 extends Thread {
    Server s;
    public Thread1(Server s) {
        this.s = s;
    }

    @Override
    public void run() {
        s.start();
    }
}

class Thread2 extends Thread {
    Server s;
    public Thread2(Server s) {
        this.s = s;
    }

    @Override
    public void run() {
        s.stop();
    }
}

public class VolatileThreadTask2 {
    static void main() {
        Server s = new Server();

        Thread1 t1 = new Thread1(s);
        Thread2 t2 = new Thread2(s);

        t1.start();
        t2.start();
    }
}
