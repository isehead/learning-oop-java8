package com.javalesson.oop.streams;

import com.javalesson.oop.lambdas.model.Employee;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.*;
import java.io.IOException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsOverviewMain {

    private static List<Employee> employeeList = new ArrayList<>();
    private static Map<Integer, Employee> employeeMap = null;

    public static void main(String[] args) throws IOException {
        employeeList.add(new Employee("Alex", "Black", 50000));
        employeeList.add(new Employee("John", "Green", 75000));
        employeeList.add(new Employee("Sam", "Brown", 80000));
        employeeList.add(new Employee("Tony", "Grey", 90000));
        employeeList.add(new Employee("Mike", "Yellow", 60000));
        employeeList.add(new Employee("Victoria", "Pink", 75000));
        employeeList.add(new Employee("Sean", "Magenta", 80000));
        employeeList.add(new Employee("Kate", "Black", 88000));
        employeeList.add(new Employee("Tony", "Grey", 90000));
        employeeList.add(new Employee("Mike", "Yellow", 60000));
        employeeList.add(new Employee("Victoria", "Pink", 75000));

        testStreamFromList();
        testStreamFromFile();
    }

    private static void testStreamFromList() {
        employeeList.stream().filter(e -> e.getSalary() > 60000)
        Integer[] ids = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    }

    private static void testStreamFromFile() throws IOException {

    }

    private static Employee findById(int id) {
        return null;
    }
}
