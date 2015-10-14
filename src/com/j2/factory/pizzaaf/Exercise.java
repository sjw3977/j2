package com.j2.factory.pizzaaf;

public class Exercise {
  public static void main(String[] args) {
    PizzaStore smStore = new SMPizzaStore();
    
    Pizza pizza = smStore.orderPizza("potato");
    System.out.println("We ordered a " + pizza + "\n");
  }
}