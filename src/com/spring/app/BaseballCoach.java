package com.spring.app;

public class BaseballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "spend 30 mintues on walking";

    }

    @Override
    public String getDailyFortune() {
        return "lucky day";
    }
}
