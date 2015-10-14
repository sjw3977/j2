package com.j2.factory.pizzafm;

import java.util.ArrayList;

public abstract class Pizza {
  String name;
  String dough;
  String sauce;
  ArrayList toppings = new ArrayList();
  
  void prepare() {
    System.out.println("Preparing " + name);
  }
  
  void bake() {
    System.out.println("Baking " + name);
  }
  
  void cut() {
    System.out.println("Cutting " + name);
  }
  
  void box() {
    System.out.println("Boxing " + name);
  }
  
  public String getName() {
    return name;
  }
  
  public String toString() {
    StringBuffer display = new StringBuffer();
    display.append("--- " + name + " ----\n");
    display.append(dough + "\n");
    display.append(sauce + "\n");
    for (int i = 0; i < toppings.size(); i++) {
      display.append((String)toppings.get(i) + "\n");
    }
    return display.toString();
  }
}