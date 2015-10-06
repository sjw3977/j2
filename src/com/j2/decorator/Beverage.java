package com.j2.decorator;

public abstract class Beverage {
  String description = "Unknowwn Beverage";
  
  public String getDescription() {
    return description;
  }
  
  public abstract double cost();
}