package com.lab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Employee e1 = context.getBean("devEmp", Employee.class);
        Employee e2 = context.getBean("leadEmp", Employee.class);
        System.out.println("--- Employee 1 ---");
        e1.printDetails();
        System.out.println("--- Employee 2 ---");
        e2.printDetails();
        ((ClassPathXmlApplicationContext) context).close();
    }
}
