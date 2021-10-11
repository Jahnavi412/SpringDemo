package com.spring.app;

public class BaseballCoach implements Coach {
    // define private field for the dependency
    private FortuneService fortuneService;

    // define a constructor for a dependency injection
    public BaseballCoach(FortuneService fortuneService){
        fortuneService = fortuneService;

    }












    @Override
    public String getDailyWorkout() {
        return "spend 30 mintues on walking";

    }
    @Override
    public String getDailyFortune() {
        return "lucky day";
    }
}
