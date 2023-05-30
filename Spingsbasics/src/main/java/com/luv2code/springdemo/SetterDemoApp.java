package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {

        //load the sprin configuration file
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("application.context.xml");
        //retrive bean from spring container
         CricketCoach theCoach=context.getBean("myCricketCoach",CricketCoach.class);
         //call methods on the bean
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getDailyWorkout());
        //call our new methods in
        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());
        //close
         context.close();
    }
}
