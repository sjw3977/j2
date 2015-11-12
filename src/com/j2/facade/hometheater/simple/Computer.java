package com.j2.facade.hometheater.simple;

public class Computer {
  String description;
  
  public Computer(String description) {
    this.description = description;
  }
  
  public void on() {
    System.out.println(description + " on");
  }
  
  public void off() {
    System.out.println(description + " off");
  }
  
  public void search(String key) {
    System.out.println(description + " is searching " + key);
  }
  
  public String toString() {
    return description;
  }
}
     