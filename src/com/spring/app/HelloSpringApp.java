package com.spring.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        //Load the Spring Configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container
       Coach thecoach =context.getBean("myCoach", Coach.class);

        //Call methods on beans
        System.out.println(thecoach.getDailyWorkout());

        //close the context
        context.close();


    }
    }

