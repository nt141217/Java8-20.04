package com.example;

public class Manager extends Employee {

    public Manager(String name, int skill) {
        super(name, skill);
    }

    @Override
    public int work() {
        return skill * 3; 
    }

    @Override
    public String getRole() {
        return "Manager";
    }
}