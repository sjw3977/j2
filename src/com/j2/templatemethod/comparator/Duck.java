package com.j2.templatemethod.comparator;
import java.util.Comparator;

public class Duck implements Comparator {
  String name;
  int weight;
  
  public Duck() {}
  
  public Duck(String name, int weight) {
    this.name = name;
    this.weight = weight;
  }
    
  public String toString() {
    return name + " weighs: " + weight;
  }
  
  public int compare(Object object1, Object object2) {
    Duck duck1 = (Duck)object1;
    Duck duck2 = (Duck)object2;
    if (duck1.weight < duck2.weight) {
      return -1;
    }else if (duck1.weight == duck2.weight) {
      return 0;
    }else {
      return 1;
    }
  }
}