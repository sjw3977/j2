package com.j2.templatemethod.barista;
import java.io.*;

public class CaramelMacchiatoWithHook extends CaffeineBeverageWithHook { 
  public void brew() {
    System.out.println("Dripping Espresso through filter");
  }
  
  public void addCondiments() {
    System.out.println("Adding Vanilla syrup, Milk and Caramel");
  }
  
  public boolean customerWantsCondiments() {
    String answer = getUserInput();
    
    if (answer.toLowerCase().startsWith("y")) {
      return true;
    } else {
      return false;
    }
  }
  
  private String getUserInput() {
    String answer = null;
    
    System.out.println("Would you like vanilla syrup, Milk, Caramel with your coffee (y/n)?");
    
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    try {
      answer = in.readLine();
    } catch (IOException ioe) {
      System.err.println("IO error trying to read your answer");
    }
    
    if (answer == null) {
      return "no";
    }
    return answer;
  }
}