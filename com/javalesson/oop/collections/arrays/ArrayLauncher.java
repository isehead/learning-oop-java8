package com.javalesson.oop.collections.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLauncher {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myArray = new int[8];
        System.out.println("Please enter 8 array elements");
        for (int l = 0; l < myArray.length; l++) {
            myArray[l] = in.nextInt();
        }
int[] array = sort(myArray);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " = " + myArray[i]);
        }
    }

    private static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
