package com.luv2code.springdemo;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class HelloSpringDemo {
    public static void main(String[] args) {
//load the spring configuration file
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("application.context.xml");

        //retrieve beans
        Coach theCoach=context.getBean("myCoach",Coach.class);
        //call to tha method
        System.out.println(theCoach.getDailyWorkout());

        //call to the fortune method
        System.out.println(theCoach.getDailyFortune());
     context.close();
    }
}
//Constructor injection done