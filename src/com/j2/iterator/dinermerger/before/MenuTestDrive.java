package com.j2.iterator.dinermerger.before;
import java.util.*;

public class MenuTestDrive {
  public static void main(String[] args) {
    printMenu();
  }
  
  public static void printMenu() {
    PancakeHouseMenu p = new PancakeHouseMenu();
    DinerMenu d = new DinerMenu();
    
    ArrayList breakfastItems = p.getMenuItems();
    
    for (int i = 0; i < breakfastItems.size(); i++) {
      MenuItem menuItem = (MenuItem)breakfastItems.get(i);
      System.out.print(menuItem.getName());
      System.out.println("\t\t" + menuItem.getPrice());
    }
    
    MenuItem[] dItems = d.getMenuItems();
        
    for (int i = 0; i < dItems.length; i++) {
      MenuItem menuItem = dItems[i];
      System.out.print(menuItem.getName());
      System.out.println("\t\t" + menuItem.getPrice());
    }
  }
}
