package com.yao.s4inversionofcontrol;

/**
 * Created by Jack Yao on 2022/2/22 9:18 AM
 */
public class HappyFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "Today is your lucky day in HappyFortuneService";
    }
}
