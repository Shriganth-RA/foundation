package multiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample1 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.submit(() -> {
            try {
                Thread.sleep(1000);
                System.out.println("Print task1...");
            } catch (InterruptedException e) {
                System.out.println("Interruption occurs on thread...");
            }
        });
        executor.submit(() -> {
            try {
                Thread.sleep(1000);
                System.out.println("Print task2...");
            } catch (InterruptedException e) {
                System.out.println("Interruption occurs on thread...");
            }
        });
        executor.submit(() -> {
            try {
                Thread.sleep(1000);
                System.out.println("Print task3...");
            } catch (InterruptedException e) {
                System.out.println("Interruption occurs on thread...");
            }
        });
        executor.submit(() -> {
            try {
                Thread.sleep(1000);
                System.out.println("Print task4...");
            } catch (InterruptedException e) {
                System.out.println("Interruption occurs on thread...");
            }
        });

        executor.shutdown();
    }
}
