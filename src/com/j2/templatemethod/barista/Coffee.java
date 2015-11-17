package com.j2.templatemethod.barista;

public class Coffee extends CaffeinBeverage {
  public void brew() {
    System.out.println("dripping coffee through filter");
  }
  
  public void addCondiments() {
    System.out.println("Adding Sugar and Milk");
  }
}