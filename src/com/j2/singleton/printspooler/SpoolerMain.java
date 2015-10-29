package com.j2.singleton.printspooler;

public class SpoolerMain {
  public static void main(String[] args) {
    PrinterSpooler spooler1 = PrinterSpooler.getInstance();
    p1.print();
    
    PrinterSpooler spooler2 = PrinterSpooler.getInstance();
  }
}