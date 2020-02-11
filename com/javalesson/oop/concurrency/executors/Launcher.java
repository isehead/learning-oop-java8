package com.javalesson.oop.concurrency.executors;

import static com.javalesson.oop.concurrency.threadlesson.ColorScheme.RED;

public class Launcher {

    private static final int POOL_SIZE = 2;

    public static void main(String[] args) throws InterruptedException {
        System.out.println(RED + "Starting the main thread");
        GCDRunnable r = new GCDRunnable();


        System.out.println(RED + "Leaving the main thread");

    }
}
