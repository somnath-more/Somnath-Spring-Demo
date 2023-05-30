package com.luv2code.springdemo;

public class BaseballCoach implements  Coach{
    //define the private field for the dependancy
    private FortuneService fortuneService;///same type of a onject
    public BaseballCoach(FortuneService theFortuneService){
        fortuneService=theFortuneService;
    }
    public String getDailyWorkout(){
        return "Spend 30 min on batting practise";
    }

    @Override
    public String getDailyFortune() {
        //use my Fortune Service to get Fortune
        return fortuneService.getFortune();
    }

}
