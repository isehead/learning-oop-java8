package com.javalesson.oop.tij4;


public class Exercise11 {

    public static void main(String[] args) {
        double a = 0;
        for (int i = 1; i < 26; i++) {
            double number = Math.random();
            System.out.println("Current random #" + i + " is: " + number);
            if (i == 2) {
                a = number;
            }
            if (i > 2) {
                System.out.println("A = " + a);
                if (number > a) {
                    System.out.println("Value #" + i + " is greater, than the second value: " + a);
                    System.out.println();
                } else {
                    System.out.println("Value #" + i + " is less, than the second value: " + a);
                    System.out.println();
                }
            }

        }
    }
}
