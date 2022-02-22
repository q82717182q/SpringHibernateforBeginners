package com.yao.s4inversionofcontrol;

import com.yao.s4inversionofcontrol.Coach;
import com.yao.s4inversionofcontrol.TrackCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Jack Yao on 2022/2/21 1:22 PM
 */
public class MyApp {
    public static void main(String[] args) {
        Coach theCoach = new TrackCoach();
        System.out.println(theCoach.getDailyWorkout());

    }


}
