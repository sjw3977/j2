package com.j2.singleton.printspooler;

public class PrinterSpooler{
  private volatile static PrinterSpooler uniqueInstance;
  private static int numCalled = 0;
  private boolean printed;
  
  private PrinterSpooler() { 
    printed = false;  
  }
  
  public static PrinterSpooler getInstance() {
    if (uniqueInstance == null) {
      synchronized(PrinterSpooler.class) {
        if (uniqueInstance == null) {
          System.out.println("Creating unique instance of Printer Spooler");
          uniqueInstance = new PrinterSpooler();
        }
      }
    }
    System.out.println("numCalled: " + numCalled++);
    return uniqueInstance;
  }
  
  public void fill() {
    if (isPrint()) {
      printed = false;
    }
  }
  
  public void print() {
    if (!isPrint()) {
      printed = true;
    }
  }
  
  public boolean isPrint() {
    return printed;
  }
}
  