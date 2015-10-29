package com.j2.singleton.chocolate;

public class ChocolateBoiler {
  private static ChocolateBoiler uniqueInstance;
  private static int numCalled = 0;
  private boolean empty;
  private boolean boiled;
  
  private ChocolateBoiler() { }
  
  public static synchronized ChocolateBoiler getInstance() {
    if (uniqueInstance == null) {
      System.out.println("Creating unique instance of Chocolate Boiler");
      uniqueInstance = new ChocolateBoiler();
    }   
    System.out.println("numCalled: " + numCalled++);
    return uniqueInstance;
  }
  
  public void fill() {
    if (isEmpty()) {
      empty = false;
      boiled = false;
    }
  }
  
  public void drain() {
    if (!isEmpty() && isBoiled()) {
      empty = true;
    }
  }
  
  public void boil() {
    if (!isEmpty() && !isBoiled()) {
      boiled = true;
    }
  }
  
  public boolean isEmpty() {
    return empty;
  }
  
  public boolean isBoiled() {
    return boiled;
  }    
}
        
      
    
    