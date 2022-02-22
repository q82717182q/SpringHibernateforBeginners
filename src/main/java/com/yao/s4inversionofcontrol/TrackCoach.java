package com.yao.s4inversionofcontrol;

/**
 * Created by Jack Yao on 2022/2/21 1:44 PM
 */
public class TrackCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getFortune() {
        return null;
    }
}
