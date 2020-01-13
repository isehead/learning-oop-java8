package com.javalesson.oop.tij4;

public class Exercise9 {

    public static void main(String[] args) {

        int a = 0x452d;
        int b = 0b111111111111111;
        System.out.println("Default a = " + Integer.toBinaryString(a));

        for (int i = Integer.toBinaryString(a).length(); i > 0; i--) {
            a >>= 1;
            System.out.println(Integer.toBinaryString(a));
        }

        System.out.println();
        System.out.println("Default b =      "+Integer.toBinaryString(b));
        System.out.println("Left shifted b = "+ Integer.toBinaryString(b<<1));

        for (int j = Integer.toBinaryString(b).length(); j > 0; j--) {
            b >>>= 1;
            System.out.println(Integer.toBinaryString(b));
        }

        System.out.println();
        char c = 'l';
        char d = '9';
        char e = '~';
        System.out.println(Integer.toBinaryString(c));
        System.out.println(Integer.toBinaryString(d));
        System.out.println(Integer.toBinaryString(e));
    }
}
