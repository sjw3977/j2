package com.j2.templetemethod.simplebarista;

public class Coffee {
  
  public void prepareRecipe() {
    boilWater();
    brewCoffeeGrinds();
    pourInCup();
    addSugarAndMilk();
  }
  
  public void boilWater() {
    System.out.println("Boilng Water");
  }
  
  public void brewCoffeeGrinds() {
    System.out.println("Dripping Coffee through filter");
  }
  
  public void pourInCup() {
    System.out.println("Pouring into cup");
  }
  
  public void addSugarAndMilk() {
    System.out.println("Adding Sugar and Milk");
  }
}