package com.example;

public class Employee {

    protected String name;
    protected int skill;

    public Employee(String name, int skill) {
        this.name = name;
        this.skill = skill;
    }

    public int work() {
        return skill;
    }

    public String getRole() {
        return "Employee";
    }
}