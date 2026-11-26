package com.lab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        Counter s1 = context.getBean("singleCounter", Counter.class);
        Counter s2 = context.getBean("singleCounter", Counter.class);
        System.out.println("Checking Singleton Scope:");
        System.out.println("s1 HashCode = " + s1.hashCode());
        System.out.println("s2 HashCode = " + s2.hashCode());
        System.out.println("s1 == s2 ? " + (s1 == s2) + " (Same instance shared)");
        System.out.println();

        Counter p1 = context.getBean("protoCounter", Counter.class);
        Counter p2 = context.getBean("protoCounter", Counter.class);
        System.out.println("Checking Prototype Scope:");
        System.out.println("p1 HashCode = " + p1.hashCode());
        System.out.println("p2 HashCode = " + p2.hashCode());
        System.out.println("p1 == p2 ? " + (p1 == p2) + " (New instance created)");

        ((ClassPathXmlApplicationContext) context).close();
    }
}
