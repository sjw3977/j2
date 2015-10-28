package com.j2.singleton.threadsafe;

public class Singleton {
  private static Singleton uniqueInstance;
  private static int numCalled = 0;
  
  private Singleton() { }
  
  public static synchronized Singleton getInstance() {
    if (uniqueInstance == null) {
      uniqueInstance = new Singleton();
    }   
    System.out.println("numCalled: " + numCalled++);
    return uniqueInstance;
  }
}