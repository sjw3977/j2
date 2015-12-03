package com.j2.iterator.dinermerger.after;
import java.util.*;

public class MenuTestDrive {
  public static void main(String[] args) {
    PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
    DinerMenu dinerMenu = new DinerMenu();
    
    Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
    
    waitress.printMenu();
    System.out.println(" --- Vegetarian Menu --- ");
    waitress.printVegetarianMenu();
  }
}