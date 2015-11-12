package com.j2.facade.hometheater.simple;

public class Stand {
  String description;
  int level;
  
  public Stand(String description) {
    this.description = description;
  }
  
  public void on() {
    System.out.println(description + " on");
  }
  
  public void off() {
    System.out.println(description + " off");
  }
  
  public void setLevel(int level) {
    this.level = level;
    System.out.println(description +" is setting " + level + "%");
  }
  
  public int getLevel() {
    return level;
  }
  
  public String toString() {
    return description;
  }
}