package com.javalesson.oop.exceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.server.ExportException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsHandlingMain {

    public static void main(String[] args) {

        try {
            doEverything();
        } catch (InvalidInputParamException e) {
            System.out.println("InvalidInputParamException");
            e.printStackTrace();
        }
    }

    private static void doEverything() {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;

        do {
            try (PrintWriter writer = new PrintWriter(new FileWriter("out.txt"))){
                System.out.println("Please enter numerator: ");
                int numerator = scanner.nextInt();
                System.out.println("Please enter denominator: ");
                int denominator = scanner.nextInt();
//                System.out.println(divide(numerator, denominator));
//                int[] intArray = new int[1];
//                int i = intArray[2];
                writer.println("Result = " + divide(numerator, denominator));
                continueLoop = false;
            } catch (ArithmeticException | InputMismatchException e) {
                System.out.println("Exception : " + e);
                scanner.nextLine();
                System.out.println("Only non-zero integer parameters are allowed");
            } catch (IOException e) {
                System.out.println("Unable to open the file");
                e.printStackTrace();
            } catch (IndexOutOfBoundsException e) {
                System.out.println("All exceptions here");
                throw new InvalidInputParamException("Array index out of bounds, thrown in DoE" + "\n" + e);
            } finally {
                System.out.println("Finally block called");
            }
        } while (continueLoop);
    }

    private static int divide(int numerator, int denominator) throws ArithmeticException, NullPointerException {
        return numerator / denominator;
    }

    private static void saveToFile(int res) throws IOException {

    }

}
