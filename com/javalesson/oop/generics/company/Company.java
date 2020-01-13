package com.javalesson.oop.generics.company;

import com.javalesson.oop.generics.company.employees.Employee;
import com.javalesson.oop.generics.company.employees.ITSpecialist;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private List<Department> departments = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();

    public <T extends Employee> void addDepartment(Department<T> dept) {
        departments.add(dept);
        List<T> employeeList = dept.getEmployees();
        giveRaise(employeeList);
        this.employees.addAll(employeeList);
    }

    private void giveRaise(List<? extends Employee> employees) {
        for (Employee employee : employees) {
            float raise = employee.getSalary() * 0.2f;
            employee.setSalary(employee.getSalary() + raise);
        }
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void print(List<?> list){
        System.out.println(list);
    }

    public void addToITemployees(List<? super ITSpecialist> list){
    list.add(new ITSpecialist("Joe", 3500.0f));
    }

    @Override

    public String toString() {
        return "Company{" +
                "departments =" + departments +
                "employees =" + employees +
                '}';

    }

}
