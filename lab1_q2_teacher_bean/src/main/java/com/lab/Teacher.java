package com.lab;

public class Teacher {
    private int teacherId;
    private String name;
    private String department;

    public void setTeacherId(int teacherId) { this.teacherId = teacherId; }
    public void setName(String name) { this.name = name; }
    public void setDepartment(String department) { this.department = department; }

    public void display() {
        System.out.println("Teacher ID   : " + teacherId);
        System.out.println("Teacher Name : " + name);
        System.out.println("Department   : " + department);
    }
}
