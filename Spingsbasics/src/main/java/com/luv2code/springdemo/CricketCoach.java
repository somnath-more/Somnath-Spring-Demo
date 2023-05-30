package com.luv2code.springdemo;

public class CricketCoach implements Coach {

    private String emailAddress;
    private String team;


    private  FortuneService fortuneService;
    public CricketCoach(){
        System.out.println("CricketCoach: inside no method");
    }
    //our setter method
    public void setFortuneService(FortuneService fortuneService){
        System.out.println("Cricket Coach :Ashish Nehara GT Coach");
        this.fortuneService=fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Practise some extra cicket in nets";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getEmailAddress(){
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress){
        System.out.println("Cricket Coach :Asshish email id GT Coach :setEmailAdrress");
        this.emailAddress=emailAddress;
    }
    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
