package multiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExample2 {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Future<Integer> result1 = executor.submit(() -> 10 + 20);
        Future<Double> result2 = executor.submit(() -> 10.463 * 90.234);

        System.out.println("Value of result-1: " + result1.get());
        System.out.println("Value of result-2: " + result2.get());

        executor.shutdown();
    }
}
