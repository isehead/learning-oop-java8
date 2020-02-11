package com.javalesson.oop.concurrency.executors;

import java.util.Random;

import static com.javalesson.oop.concurrency.threadlesson.ColorScheme.BLUE;
import static com.javalesson.oop.concurrency.threadlesson.ColorScheme.GREEN;


public class GCDRunnable extends Random implements Runnable {

    public GCDRunnable() {

    }

    @Override
    public void run() {
        String threadDescription = Thread.currentThread().getName();

        System.out.println(BLUE + "Starting " + threadDescription);
        for (int i = 0; i < 10000000; i++) {
            int a = nextInt();
            int b = nextInt();

            if (i % 10000 == 0) {
                int gcd = computeGCD(a, b);
                if (gcd > 5) {
                    System.out.println(GREEN + "Running in " + threadDescription +
                            ". The GCD of " + a + " and " + b + " is " + gcd);
                }
            }
        }
        System.out.println(BLUE + "Leaving thread " + threadDescription);
    }

    private int computeGCD(int number1, int number2) {
        if (number2 == 0) {
            return number1;
        } else {
            return computeGCD(number2, number1 % number2);
        }
    }


}
