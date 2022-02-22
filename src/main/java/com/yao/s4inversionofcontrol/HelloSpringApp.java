package com.yao.s4inversionofcontrol;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Jack Yao on 2022/2/21 2:46 PM
 */
public class HelloSpringApp {
    public static void main(String[] args) {
        //load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        //call method on the bean
        System.out.println("----------------0--------------");
        System.out.println(theCoach.getDailyWorkout());


        System.out.println("----------------1--------------");
        System.out.println(theCoach.getFortune());

        //close the context
        context.close();
    }
}
