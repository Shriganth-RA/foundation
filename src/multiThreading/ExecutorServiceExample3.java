package multiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable {
    private String message;
    public WorkerThread(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " (Start) message = " + message);
        processMessage();
        System.out.println(Thread.currentThread().getName() + " (End)");
    }

    public void processMessage() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Interruption occurs on thread...");
        }
    }
}

public class ExecutorServiceExample3 {
    static void main() {
        ExecutorService es = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 5; i++) {
            WorkerThread wt = new WorkerThread("" + i);
            es.execute(wt);
        }
        es.shutdown();
        while (!es.isTerminated()) {}
        System.out.println("Finished all threads.");
    }
}
