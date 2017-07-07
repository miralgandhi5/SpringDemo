package main.java;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by miral on 7/6/2017.
 */
public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("main/resources/spring-config.xml");

        System.out.println(applicationContext.isPrototype("restaurant"));



    }
}
