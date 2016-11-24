package com.example.ami.bitsandpizzas;

public class Pizza {
    private String name;
    private int imageResourceId;

    public static final Pizza[] pizzas = new Pizza[]{
            new Pizza("Diavolo", R.drawable.diavolo),
            new Pizza("funghi", R.drawable.funghi)
    };

    public Pizza(String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
