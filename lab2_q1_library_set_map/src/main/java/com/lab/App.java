package com.lab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Library lib = context.getBean("library", Library.class);
        lib.display();
        ((ClassPathXmlApplicationContext) context).close();
    }
}
