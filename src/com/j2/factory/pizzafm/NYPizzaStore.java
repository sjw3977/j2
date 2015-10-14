package com.j2.factory.pizzafm;

public class NYPizzaStore extends PizzaStore {
   public Pizza createPizza(String item) {
    if (item.equals("cheese")) {
      return new NYStyleCheesePizza();
    }
    else return null;
   }
}