package com.javalesson.oop.tij4;

public class Exercise8 {
    public static void main(String[] args) {

        long a = 0x45bd0;
        long b = 0x39151;

        System.out.println("Int a = " + (int) (a));
        System.out.println("Int b = " + (int) (b));
        System.out.println("Int a & b = " + (int) (a & b));
        System.out.println("Int a | b = " + (int) (a | b));
        System.out.println("Int a ^ b = " + (int) (a ^ b));
        printNumbers(a,b);
        System.out.println("Binary a & b =       " + Integer.toBinaryString((int) (a & b)));
        printNumbers(a,b);
        System.out.println("Binary a | b = " + Integer.toBinaryString((int) (a | b)));
        printNumbers(a,b);
        System.out.println("Binary a ^ b = " + Integer.toBinaryString((int) (a ^ b)));
    }
    private static void printNumbers (long a, long b){
        System.out.println();
        System.out.println("Binary     a = " + Integer.toBinaryString((int) a));
        System.out.println("Binary     b =  " + Integer.toBinaryString((int) b));
    }
}
