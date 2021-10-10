package com.spring.app;

public class TrackCoach implements Coach
{

    @Override
    public String getDailyWorkout() {
        return "run hard";
    }

    @Override
    public String getDailyFortune() {
        return "lucky day";
    }
}
