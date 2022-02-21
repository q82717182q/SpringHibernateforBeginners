package com.yao.pojo;

/**
 * Created by Jack Yao on 2022/2/21 1:21 PM
 */
public class BaseballCoach implements Coach{
    @Override
    public String getDailyWorkout(){
        return "Spend 30 minutes on batting practice.";
    }
}
