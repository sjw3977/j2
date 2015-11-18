package com.j2.templatemethod.barista;

public class TeaWithHook extends CaffeinBeverageWithHook {
  public void brew() {
    System.out.println("Steeping the tea");
  }
  
  public void addCondiments() {
    System.out.println("Adding Lemon");
  }
  
  public boolean customerWantsCondiments() {
    String answer = "yes";
    if (answer.toLowerCase().startsWith("y")) {
      return true;
    }
    else {
      return false;
    }
  }
}