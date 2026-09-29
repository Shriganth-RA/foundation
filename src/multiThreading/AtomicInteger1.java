package multiThreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicInteger1 {

    public static void main(String[] args) throws InterruptedException {
        AtomicInteger ai = new AtomicInteger(0);

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                ai.incrementAndGet();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                ai.decrementAndGet();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Value of count: " + ai.get());
    }
}
