package main.java;

/**
 * Created by miral on 7/6/2017.
 */
public class Restaurant {
    public Restaurant(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    HotDrink hotDrink;

    public HotDrink getHotDrink() {
        return hotDrink;
    }

    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }
}
