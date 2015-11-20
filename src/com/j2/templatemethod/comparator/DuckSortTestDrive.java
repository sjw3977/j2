package com.j2.templatemethod.comparator;
import java.util.ArrayList;
import java.util.Arrays;

public class DuckSortTestDrive {
  public static void main(String[] args) {
    Duck[] ducks = {new Duck("Daffy", 8), new Duck("Dewey", 2), new Duck("Howard", 7), new Duck("Louie", 2), new Duck("Donald", 10), new Duck("Huey", 2)};
    
    System.out.println("Before sorting:");
    display(ducks);
    
    Arrays.sort(ducks, new Duck());
    
    System.out.println("\nAfter sorting:");
    display(ducks);
  }
  
  public static void display(Duck[] ducks) {
    for (int i = 0; i < ducks.length; i++) {
      System.out.println(ducks[i]);
    }
  }
}
