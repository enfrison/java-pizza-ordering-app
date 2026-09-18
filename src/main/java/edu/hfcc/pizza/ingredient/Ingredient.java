package edu.hfcc.pizza.ingredient;

public class Ingredient {

    protected String name;
    protected double price;

    public Ingredient(String name, double price) {
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
