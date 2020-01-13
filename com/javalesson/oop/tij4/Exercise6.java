package com.javalesson.oop.tij4;

import java.util.Random;

public class Exercise6 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            Random coin = new Random();
            int j = coin.nextInt(2);
//            System.out.println(j);
            if (j == 0) {
                System.out.println("Орёл");
            } else {
                System.out.println("Решка");
            }
        }
    }
}

