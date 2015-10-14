package com.j2.factory.pizzafm;

public class PizzaTestDrive {
  public static void main(String[] args) {
    PizzaStore nystore = new NYPizzaStore();
    Pizza pizza = nystore.orderPizza("cheese");
    System.out.println("We ordered a " + pizza.getName());
  }
}