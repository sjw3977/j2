package com.j2.factory;

import java.util.ArrayList;
  
public abstract class Pizza {
  String name;
  
  void prepare() {
    System.out.println("Preparing... ");
  }
  
  void bake() {
    System.out.println("Baking...");
  }
  
  void cut() {
    System.out.println("Cutting...");
  }
  
  void box() {
    System.out.println("Boxing...");
  }
  
  public String getName() {
    return name;
  }
  
  public String toString() {
    System.out.println("---" + name + "---");
    return name;
  }
}
  