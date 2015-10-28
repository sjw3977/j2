package com.j2.singleton.subclass;

public class Singleton {
  protected static Singleton uniqueInstance;
  protected static int numCalled = 0;
  
  protected Singleton() { }
  
  public static synchronized Singleton getInstance() {
    if (uniqueInstance == null) {
      uniqueInstance = new Singleton();
    }   
    return uniqueInstance;
  }
}