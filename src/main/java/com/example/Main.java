package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 2
        List<Employee> employees = new ArrayList<>();

        employees.add(new Developer("Anna", 8));
        employees.add(new Tester("Piotr", 6));
        employees.add(new Manager("Kasia", 7));

        int totalWork = 0;

        for (Employee e : employees) {

            // 3
            System.out.println("Class: " + e.getClass().getSimpleName());

            // 4
            System.out.println("Role: " + e.getRole());

            int workValue = e.work();
            System.out.println("Work: " + workValue);

            totalWork += workValue;
        }
        System.out.println("Total work: " + totalWork);
    }
}