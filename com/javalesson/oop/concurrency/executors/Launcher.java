package com.javalesson.oop.concurrency.executors;

import java.util.concurrent.ExecutorService;

import static com.javalesson.oop.concurrency.threadlesson.ColorScheme.RED;

public class Launcher {

    private static final int POOL_SIZE = 2;

    public static void main(String[] args) throws InterruptedException {
        boolean isDaemon = true;
        System.out.println(RED + "Starting the main thread");
        GCDRunnable r = new GCDRunnable(isDaemon);
//        runInOneThread(r, isDaemon);
        Thread.sleep(100);
        System.out.println(RED + "Leaving the main thread");

    }

    private static void runInOneThread(GCDRunnable r, boolean isDaemon) throws InterruptedException {
        Thread th = new Thread(r);
        if (isDaemon)
            th.setDaemon(true);
        th.setDaemon(true);
        th.start();
//        th.sleep(100);
//        th.interrupt();
    }

    private static void runWithExecutors(GCDRunnable r, boolean isDaemon) throws InterruptedException {
        ExecutorService executorService = Executors.newF
    }
}
