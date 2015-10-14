package com.j2.factory.pizzaaf;

public interface PizzaIngredientFactory {
  public Dough createDough();
  public Cheese createCheese();
  public Potato createPotato();
}