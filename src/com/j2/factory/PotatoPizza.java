package com.j2.factory;

public class PotatoPizza extends Pizza {
  public PotatoPizza() {
    name = "Potato Pizza";
    dough = "Thick Crust";
    sauce = "Marinara Sauce";
    toppings.add("Potato");
    toppings.add("Sliced Bacon");
    toppings.add("Mozzarella");
  }
}