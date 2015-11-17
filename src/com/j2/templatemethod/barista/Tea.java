package com.j2.templatemethod.barista;

public class Tea extends CaffeinBeverage {
  public void brew() {
    System.out.println("Steeping the tea");
  }
  
  public void addCondiments() {
    System.out.println("Adding Lemon");
  }
}