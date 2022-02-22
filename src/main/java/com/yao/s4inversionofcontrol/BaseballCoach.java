package com.yao.s4inversionofcontrol;

/**
 * Created by Jack Yao on 2022/2/21 1:21 PM
 */
public class BaseballCoach implements Coach{
    // define a private field for the dependency
    private FortuneService fortuneService;

    // define a constructor for dependency injection
    public BaseballCoach(FortuneService theFortuneService) {
        fortuneService =theFortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Spend 30 minutes on batting practice.";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }

}
