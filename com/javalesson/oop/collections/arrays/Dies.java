package com.javalesson.oop.collections.arrays;

import java.security.SecureRandom;

public class Dies {

    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int[] frequency = new int[7];
        for (int i = 0; i < 1000; i++) {
            ++frequency[1 + random.nextInt(6)];
        }

//        for (int i = 1; i < frequency.length; i++) {
//            System.out.println("Side #" + i + " has been caught " + frequency[i] + " times");
//        }

//        multidimArrayLauncher();
    }

    private static void multidimArrayLauncher() {

        int[][] a = {{1, 2}, {3, 4, 5, 6}, {7, 8, 9}};
        int[][] b = new int[3][3];
        int[][] c = new int[2][];
        c[0] = new int[2];
        c[1] = new int[4];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println(a[i][j] + " ");
            }
            System.out.println();
        }
    }

}
