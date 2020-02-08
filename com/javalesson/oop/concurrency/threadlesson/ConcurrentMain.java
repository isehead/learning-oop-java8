package com.javalesson.oop.concurrency.threadlesson;

public class ConcurrentMain {

    public static void main(String[] args) {

        SimpleThread th1 = new SimpleThread();
        th1.start();

        SimpleThread th2 = new SimpleThread();
        th2.start();

        th2.interrupt();

        Thread th3 = new Thread(new SimpleRunner());
        th3.start();

        new Thread(() ->
                System.out.println("Hello from lambda Runnable")).start();

        System.out.println("Hello from main");
    }
}


class SimpleThread extends Thread {
    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(ColorScheme.YELLOW + "WARNING - " + currentThread().getName() + "was interrupted");
            }
            System.out.println(ColorScheme.GREEN + "INFO - " + currentThread().getName() + " - " + i);
        }
    }
}

class SimpleRunner implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(ColorScheme.YELLOW + "WARNING - " + Thread.currentThread().getName() + " was interrupted");
                return;
            }
            System.out.println(ColorScheme.GREEN + "INFO - Runnable - " + Thread.currentThread().getName() + " - " + i);
        }
        if(Thread.interrupted()){
            return;
        }
    }
}