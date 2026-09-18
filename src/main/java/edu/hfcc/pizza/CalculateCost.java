package edu.hfcc.pizza;

import edu.hfcc.pizza.ingredient.Ingredient;

public class CalculateCost {

    public void calculateCost(Pizza pizza) {
        double cost = 5.0;

        for  (Ingredient ingredient : pizza.getIngredients()) {
            cost += ingredient.getPrice();
        }

        if(pizza.isDeliveryYn()){
            cost += 3.0;
        }

        pizza.setTotalCost(cost);
    }


}
