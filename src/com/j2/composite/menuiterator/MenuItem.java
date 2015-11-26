package com.j2.composite.menuiterator;
import java.util.Iterator;
import java.util.ArrayList;

public class MenuItem extends MenuComponent {
  String name;
  String description;
  boolean vegetarian;
  double price;
  
  public MenuItem(String n, String d, boolean v, double p) {
    this.name = n;
    this.description = d;
    this.vegetarian = v;
    this.price = p;
  }
  
  public String getName() {
    return name;
  }
  
  public String getDescription() {
    return description;
  }
  
  public double getPrice() {
    return price;
  }
  
  public boolean isVegetarian() {
    return vegetarian;
  }
  
  public Iterator createIterator() {
    return new NullIterator();
  }
  
  public void print() {
    System.out.print(" " + getName());
    if (isVegetarian()) {
      System.out.print("(v)");
    }
    System.out.println(", " + getPrice());
    System.out.println(" -- " + getDescription());
  }
}

