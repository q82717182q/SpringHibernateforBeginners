package com.yao.app;

import com.yao.pojo.BaseballCoach;
import com.yao.pojo.Coach;

/**
 * Created by Jack Yao on 2022/2/21 1:22 PM
 */
public class MyApp {
    public static void main(String[] args) {
        Coach baseballCoach = new BaseballCoach();
        System.out.println(baseballCoach.getDailyWorkout());

    }
}
