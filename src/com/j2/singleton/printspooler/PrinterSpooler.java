package com.j2.singleton.printspooler;

public class PrinterSpooler {
  private static PrinterSpooler uniqueInstance;
  private static int numCalled = 0;
  private boolean printed;
  
  private PrinterSpooler() { 
    printed = false;  
  }
  
  public static synchronized PrinterSpooler getInstance() {
    if (uniqueInstance == null) {
      System.out.println("Creating unique instance of Printer Spooler");
      uniqueInstance = new PrinterSpooler();
    }
    System.out.println("numCalled: " + numCalled++);
    return uniqueInstance;
  }
  
  public void print() {
    if (!isPrinted()) {
      printed = true;
    }
  }
  
  public boolean isPrint() {
    return printed;
  }
}
  