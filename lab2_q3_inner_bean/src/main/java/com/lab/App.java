package com.lab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Car car = context.getBean("carBean", Car.class);
        car.display();

        System.out.println("\nAttempting to retrieve Engine bean directly by type...");
        try {
            context.getBean(Engine.class);
        } catch (NoSuchBeanDefinitionException e) {
            System.out.println("Caught Expected Exception: NoSuchBeanDefinitionException");
            System.out.println("Confirmed: Inner bean is NOT visible to ApplicationContext!");
        }
        ((ClassPathXmlApplicationContext) context).close();
    }
}
