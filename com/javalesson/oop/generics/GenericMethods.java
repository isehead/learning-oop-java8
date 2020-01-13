package com.javalesson.oop.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericMethods {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 0, 8, 5, 6};
        Double[] doubleArray = {0.234, 6.45, 9.034, 1.345, 4.675};
        String[] stringArray = {"abc", "vfr", "rtw", "ert"};

        printArray(intArray);
        printArray(doubleArray);
        printArray(stringArray);

        Integer max = findMax(intArray);
        System.out.println("Max for Integers array: " + max);
        Double max1 = findMax(doubleArray);
        System.out.println("Max for Doubles array: " + max1);
//        System.out.println("Max for Strings array: " + findMax(stringArray));

        Number n = Integer.valueOf(20);

        List<Number> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        List<Integer> integers = Arrays.asList(intArray);
        List<Double> doubles = Arrays.asList(doubleArray);
        printElements(integers);
        printElements(doubles);

        MyBox<Integer> myBox = new MyBox<Integer>("");
        Double aDouble = MyBox.returnValue(0.03);
    }

    private static <S> void printArray(S[] arrayInts) {
        System.out.println("Generic method called");
        for (S element : arrayInts) {
            System.out.printf("%s, ", element);
        }
        System.out.println();
    }

    private static void printArray(Integer[] arrayInts) {
        System.out.println("Non-generic method called");
        for (Integer element : arrayInts) {
            System.out.printf("%s, ", element);
        }
        System.out.println();
    }

    private static <S extends Number & Comparable<S>> S findMax(S[] array) {
        S max = array[0];
        for (S e : array) {
            if (e.compareTo(max) > 0) {
                max = e;
            }
        }
        return max;
    }

    private static void printElements(List<? extends Number> list) {
        for (Number n : list) {
            System.out.println(n);
        }
    }

}
