package main.java;

/**
 * Created by miral on 7/6/2017.
 */
public class Tea implements HotDrink {
    @Override
    public void prepareHotDrink() {
        System.out.println("I am Tea");
    }

    @Override
    public String toString() {
        return "Tea{}";
    }
}
