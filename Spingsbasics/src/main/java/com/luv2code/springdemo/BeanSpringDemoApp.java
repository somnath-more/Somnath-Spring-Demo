package com.luv2code.springdemo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanSpringDemoApp {
    public static void main(String[] args) {
//load the spring configuration file
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("bean-application.context.xml");

        //retrieve beans
        Coach theCoach=context.getBean("myCoach",Coach.class);
        Coach alphaCoach=context.getBean("myCoach",Coach.class);
        //call to tha method
        boolean result=(theCoach==alphaCoach);
        System.out.println("The result of single prototype : "+result);

        System.out.println("\nMemory location for theCoach: " + theCoach);

        System.out.println("\nMemory location for alphaCoach: " + alphaCoach + "\n");

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(alphaCoach.getDailyWorkout());
        //call to the fortune method
//        System.out.println(theCoach.getDailyFortune());
     context.close();
    }
}
//Constructor injection done