package com.hfad.starbuuz;

public class Drink {
    private String name;
    private String description;
    private int imageResourceId;

    public static final Drink[] drinks = {
      new Drink("Late", "A couple of espresso shots with steamed milk", R.drawable.latte),
      new Drink("Cappuccino","Espresso, hot molk, and a steamed milk foam", R.drawable.cappuccino),
      new Drink("Filter","Highest quality beans roasted and brewed fresh", R.drawable.filter)
    };

    private Drink(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String toSring() {
        return this.name;
    }
}
