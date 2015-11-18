package com.j2.templatemethod.barista;

public class CoffeeWithHook extends CaffeineBeverageWithHook {
  public void brew() {
    System.out.println("dripping coffee through filter");
  }
  
  public void addCondiments() {
    System.out.println("Adding Sugar and Milk");
  }
  
  public boolean customerWantsCondiments() {
    String answer = "yes";
    if (answer.toLowerCase().startsWith("y")) {
      return true;
    }
    else {
      return false;
    }
  }
}