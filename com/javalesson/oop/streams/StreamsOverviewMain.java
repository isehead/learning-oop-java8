package com.javalesson.oop.streams;

import com.javalesson.oop.lambdas.model.Employee;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.io.IOException;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsOverviewMain {

    private static List<Employee> employeeList = new ArrayList<>();
    private static List<Employee> secondList = new ArrayList<>();
    private static Map<Integer, Employee> employeeMap = null;

    public static void main(String[] args) throws IOException {
        employeeList.add(new Employee(1, "Alex", "Black", 50000, "IT"));
        employeeList.add(new Employee(2, "John", "Green", 75000, "IT"));
        employeeList.add(new Employee(6, "Sam", "Brown", 80000, "IT"));
        employeeList.add(new Employee(9, "Tony", "Grey", 90000, "IT"));
        employeeList.add(new Employee(10, "Mike", "Yellow", 60000, "IT"));
        employeeList.add(new Employee(11, "Victoria", "Pink", 75000, "IT"));
        employeeList.add(new Employee(16, "Sean", "Magenta", 80000, "Finance"));
        employeeList.add(new Employee(19, "Kate", "Black", 88000, "Finance"));
        employeeList.add(new Employee(9, "Tony", "Grey", 90000, "Finance"));
        employeeList.add(new Employee(10, "Mike", "Yellow", 60000, "IT"));
        employeeList.add(new Employee(11, "Victoria", "Pink", 75000, "Finance"));

//        secondList.add(new Employee(1, "Alex", "Black", 50000));
//        secondList.add(new Employee(2, "John", "Green", 75000));
//        secondList.add(new Employee(6, "Sam", "Brown", 80000));
//        secondList.add(new Employee(9, "Tony", "Grey", 90000));
//        secondList.add(new Employee(10, "Mike", "Yellow", 60000));
//        secondList.add(new Employee(11, "Victoria", "Pink", 75000));
//        secondList.add(new Employee(16, "Sean", "Magenta", 80000));
//        secondList.add(new Employee(19, "Kate", "Black", 88000));
//        secondList.add(new Employee(9, "Tony", "Grey", 90000));
//        secondList.add(new Employee(10, "Mike", "Yellow", 60000));
//        secondList.add(new Employee(11, "Victoria", "Pink", 75000));

//        testStreamFromList();
//        testStreamFromFile();
//        testSortAndReduce();
        partitionByIncome();
    }

    private static <R> void groupByCriterion(Function<Employee, R> function) {
        Map<Object, List<Employee>> collectedEmployees = employeeList.stream().collect(Collectors.groupingBy(function));
        collectedEmployees.keySet().stream().forEach(e -> System.out.println(e + "\n" + collectedEmployees.get(e)));
    }

    private static void partitionByIncome() {
        Map<Boolean, List<Employee>> collectedEmployees = employeeList.stream().collect(Collectors.partitioningBy(e -> e.getSalary() > 70000));
        System.out.println("Poor employees");
        System.out.println(collectedEmployees.get(false));
        System.out.println("Rich employees");
        System.out.println(collectedEmployees.get(true));
    }

    private static void testSortAndReduce() {
        Employee employee = employeeList.stream()
                .max((e1, e2) -> e1.getId() - e2.getId()).get();

        employeeList.stream()
                .sorted(Comparator.comparing(Employee::getFirstName))
                .distinct()
                .collect(Collectors.toList()).forEach(System.out::println);

        Employee identity = new Employee(0, "", "", 0, "");
        Employee reducedEmployee = employeeList.stream()
                .reduce(identity, (e1, e2) -> {
                    e1.setId(e1.getId() + e2.getId());
                    e1.setSalary(e1.getSalary() + e2.getSalary());
                    return e1;
                });
        System.out.println(reducedEmployee);

//        System.out.println(employee);
    }

    private static void testStreamFromList() {
        employeeList.stream()
                .filter(e -> e.getSalary() > 60000)
                .filter(e -> e.getId() < 10)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        Integer[] ids = {1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        Optional<Employee> first = Stream.of(ids)
                .map(StreamsOverviewMain::findById)
                .filter(Objects::nonNull)
                .findFirst();

        Random r = new Random();

        Integer integer = Stream.of(ids)
                .filter(i -> i % 2 == 0)
                .filter(i -> i % 3 == 0)
                .skip(1)
                .findFirst()
                .orElseGet(r::nextInt);
        System.out.println(integer);


        Stream.of(ids)
                .map(StreamsOverviewMain::findById)
                .filter(Objects::nonNull)
                .mapToInt(Employee::getSalary)
                .max();

        List<List<Employee>> departments = new ArrayList<>();
        departments.add(employeeList);
        departments.add(secondList);

//        departments.stream().flatMap(l -> l.stream().map
//                (e -> e.getFirstName())).forEach(System.out::println);

//        Stream.of(ids)
//                .peek(e -> e = e * 2).forEach(System.out::println);

/*        int sum = 0;
        Consumer<Integer> c = e -> e = e * 2;
        Stream.of(ids)
                .forEach(c);*/
    }

    private static void testStreamFromFile() throws IOException {
        Files.lines(Paths.get("words.txt"))
                .filter(e -> e.length() > 4)
                .map(String::toUpperCase)
//                .distinct()
//                .sorted()
                .collect(Collectors.toCollection(TreeSet::new))
                .forEach(System.out::println);
    }

    private static Employee findById(int id) {
        if (employeeMap == null) {
            employeeMap = employeeList.stream().distinct().collect(Collectors.toMap(Employee::getId, e -> e));
        }
        return employeeMap.get(id);
    }
}
