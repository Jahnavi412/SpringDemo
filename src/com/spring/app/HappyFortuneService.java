package com.spring.app;

public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "lucky day";
    }
}
