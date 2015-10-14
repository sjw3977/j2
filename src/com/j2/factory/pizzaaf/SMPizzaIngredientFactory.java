package com.j2.factory.pizzaaf;

public class SMPizzaIngredientFactory implements PizzaIngredientFactory {
  public Dough createDough() {
    return new ThickCrustDough();
  }
  
  public Cheese createCheese() {
    return new MozzarellaCheese();
  }
   
  public Potato createPotato() {
    return new SlicedPotato();
  }
}