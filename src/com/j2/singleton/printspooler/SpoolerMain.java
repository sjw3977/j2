package com.j2.singleton.printspooler;

public class SpoolerMain {
  public static void main(String[] args) {
    PrinterSpooler spooler = PrinterSpooler.getInstance();
    spooler.start();
        
    synchronized(spooler) {
      try{
        System.out.println("Waiting for printing to complete...");
        spooler.wait();
      }catch(InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println("complete print");
    }    
  }
}