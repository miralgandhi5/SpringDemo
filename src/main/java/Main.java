package main.java;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by miral on 7/6/2017.
 */
public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("main/resources/spring-config.xml");
        Database database = (Database) applicationContext.getBean("db");
        System.out.println(database);
        Restaurant teaRestaurant = (Restaurant) applicationContext.getBean("teaRestaurant");
        Restaurant expressTeaRestaurant = (Restaurant) applicationContext.getBean("expressTeaRestaurant");
        teaRestaurant.getHotDrink().prepareHotDrink();
        expressTeaRestaurant.getHotDrink().prepareHotDrink();
        Complex complex=(Complex)applicationContext.getBean("complex");
        System.out.println(complex);


    }
}
