package com.j2.singleton.printspooler;

public class SpoolerMain {
  public static void main(String[] args) {
    PrinterSpooler spooler = PrinterSpooler.getInstance();
    spooler.fill();
    spooler.print();
    PrinterSpooler spooler2 = PrinterSpooler.getInstance();
  }
}