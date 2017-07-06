package main.java;

/**
 * Created by miral on 7/6/2017.
 */
public class ExpressTea implements HotDrink {
    @Override
    public void prepareHotDrink() {
        System.out.println("I am ExpressTeas");
    }

    @Override
    public String toString() {
        return "ExpressTea{}";
    }
}
