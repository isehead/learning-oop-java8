package com.javalesson.oop.testclass;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.*;
import java.time.LocalDateTime;
import java.time.Month;

import java.lang.StringBuilder;

class TestClass3 {
    static int count;
}

interface Movable {
    default int distance() {
        return 10;
    }
}
interface Jumpable {
    default int distance() {
        return 10;
    }
}

class Person implements Movable, Jumpable {
     public int distance() {
        return 10;
    }
}

class TestClass {


    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        boolean c = false;
        if (b > a)
            if (++a == 10)
                if (c != true) System.out.println(1);
                else System.out.println(2);
            else System.out.println(3);
    }
}
