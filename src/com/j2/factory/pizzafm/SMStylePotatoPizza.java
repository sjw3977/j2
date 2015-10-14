package com.j2.factory.pizzafm;

public class SMStylePotatoPizza extends Pizza {
  public SMStylePotatoPizza() {
    name = "SM Style Potato Pizza";
    dough = "Thick Crust Dough";
    sauce = "Marinara Sauce";
    
    toppings.add("Potato");
    toppings.add("Sliced Bacon");
    toppings.add("Mozzarella");
  }
}