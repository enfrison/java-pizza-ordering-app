package edu.hfcc.pizza;

import edu.hfcc.pizza.ingredient.Ingredient;

import java.util.ArrayList;

public class Pizza {

    private ArrayList<Ingredient> ingredients;
    private boolean deliveryYn;
    private double totalCost;

    public Pizza() {
    this.ingredients = new ArrayList<>();
    this.totalCost = 5.0;
    }

    public ArrayList<Ingredient> getIngredients() {

        return this.ingredients;
    }

    public boolean isDeliveryYn() {

        return this.deliveryYn;
    }

    public double getTotalCost() {

        return this.totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public void setDeliveryYn(boolean deliveryYn) {
        this.deliveryYn = deliveryYn;
    }

    public void addIngredient(Ingredient ingredient) {
        this.ingredients.add(ingredient);
    }
}
