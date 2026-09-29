package multiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceTask1 {
    static void main() {
        ExecutorService es = Executors.newFixedThreadPool(3);

        es.submit(() -> {
            System.out.println("Task 1  -->  " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interruption occurs on thread...");
            }
        });

        es.submit(() -> {
            System.out.println("Task 2  -->  " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interruption occurs on thread...");
            }
        });

        es.submit(() -> {
            System.out.println("Task 3  -->  " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interruption occurs on thread...");
            }
        });

        es.submit(() -> {
            System.out.println("Task 4  -->  " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interruption occurs on thread...");
            }
        });

        es.submit(() -> {
            System.out.println("Task 5  -->  " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interruption occurs on thread...");
            }
        });

        es.submit(() -> {
            System.out.println("Task 6  -->  " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interruption occurs on thread...");
            }
        });

        es.submit(() -> {
            System.out.println("Task 7  -->  " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interruption occurs on thread...");
            }
        });

        es.submit(() -> {
            System.out.println("Task 8  -->  " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interruption occurs on thread...");
            }
        });

        es.submit(() -> {
            System.out.println("Task 9  -->  " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interruption occurs on thread...");
            }
        });

        es.submit(() -> {
            System.out.println("Task 10 -->  " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interruption occurs on thread...");
            }
        });

        es.shutdown();
    }
}
