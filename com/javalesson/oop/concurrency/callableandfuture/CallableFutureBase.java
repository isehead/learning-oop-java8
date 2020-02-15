package com.javalesson.oop.concurrency.callableandfuture;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;


class Timer {
    public Instant start;
    public Instant end;

    public double timeInSeconds() {
        return Duration.between(start, end).toMillis() / 1000.0;
    }

}

public class CallableFutureBase {

    public static void main(String[] args) {
        List<Future<Double>> futures = new ArrayList<>();
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 30; i++) {
            futures.add(executorService.submit(() -> {
                Timer timer = new Timer();
                Random random = new Random();
                timer.start = Instant.now();
                int rand = random.nextInt(4000);
                Thread.sleep(rand);
                if (rand > 3000){
                    throw new RuntimeException("Thread is running for too long, terminating ...");
                }
                timer.end = Instant.now();
                return timer.timeInSeconds();
            }));
        }

        executorService.shutdown();

        futures.parallelStream()
                .map(f -> {
                    try {
                        return f.get();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        System.out.println(e.getCause());
//                        e.printStackTrace();
                    }
                    return 0;
                })
                .forEach(t -> System.out.println("Thread execution time " + t));
    }
}
