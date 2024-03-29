package com.luv2code.springdemo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class AnnotationDemoApp {
    public static void main(String[] args) {
        // read spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext.xml");

        // get the bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        // call a method from the bean
        System.out.println(theCoach.getDailyWorkout());

        // call method to get daily fortune
        System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();
    }

    @Configuration
    @Component("com.luv2code.springdemo")
    public static class SportConfig {

    }
}
