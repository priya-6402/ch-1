package com.lab;

public class Employee {
    private int id;
    private String name;
    private String designation;

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setDesignation(String designation) { this.designation = designation; }

    public void printDetails() {
        System.out.println("Emp ID: " + id + " | Name: " + name + " | Role: " + designation);
    }
}
