package com.android.example.coffebazzz;



public class Drink {

    private String name;
    private String description;
    private int imageResourceId;

    public static final Drink[] drinks = {
            new Drink("Latte", "MMM LATTE", R.drawable.latte),
            new Drink("Cappuccino", "MMM Cappuccino", R.drawable.cappuccino),
            new Drink("Filter", "MMM Filter", R.drawable.filter)
    };

    private Drink(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription() {
        return description;
    }
    public String getName() {
        return name;
    }
    public int getImageResourceId() {
        return imageResourceId;
    }
    public String toString() {
        return this.name;
    }







}
