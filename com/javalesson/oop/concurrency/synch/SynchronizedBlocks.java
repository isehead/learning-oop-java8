package com.javalesson.oop.concurrency.synch;

//Much copied code - for learning purposes only. Normally this code must not be written
// in prod environment

import java.util.ArrayList;
import java.util.List;

public class SynchronizedBlocks {

    private int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private int[] b = {0, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    private List<Integer> intList1 = new ArrayList<>();
    private List<Integer> intList2 = new ArrayList<>();

    public static void main(String[] args) {
        SynchronizedBlocks sb = new SynchronizedBlocks();
        sb.copy();
        System.out.println("test");
    }

    private void copy() {
        long start = System.currentTimeMillis();
    }

    private void copyArrayA() {
        for (int i = 0; i < a.length; i++) {
            intList1.add(a[i]);
            System.out.println(intList1);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void copyArrayB() {
        for (int i = 0; i < b.length; i++) {
            intList2.add(a[i]);
            System.out.println(intList2);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private class RunnerA implements Runnable {
        @Override
        public void run() {
            copyArrayA();
        }
    }

    private class RunnerB implements Runnable {
        @Override
        public void run() {
            copyArrayB();
        }
    }
}
