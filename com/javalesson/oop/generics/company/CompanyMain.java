package com.javalesson.oop.generics.company;

import com.javalesson.oop.generics.company.employees.Accountant;
import com.javalesson.oop.generics.company.employees.ITSpecialist;
import com.javalesson.oop.generics.company.employees.Manager;

import java.util.ArrayList;
import java.util.List;

public class CompanyMain {

    public static void main(String[] args) {
        Company company = new Company();

        Department<Accountant> accounting = new Department<>("Accounting", 5);
        Department<Manager> management = new Department<>("Management", 2);
        Department<ITSpecialist> itGuys = new Department<>("Management", 2);

        Accountant accountant = new Accountant("Alex", 1000.0f);
        ITSpecialist it = new ITSpecialist("James", 2000.0f);
        Manager manager = new Manager("Mitchel", 4000.0f);

        accounting.addEmployee(accountant);
        itGuys.addEmployee(it);
        management.addEmployee(manager);

        company.addDepartment(accounting);
        company.addDepartment(itGuys);
        company.addDepartment(management);

        company.print(company.getDepartments());
        company.print(company.getEmployees());

        company.addToITemployees(itGuys.getEmployees());
        company.addToITemployees(company.getEmployees());
    }


}
