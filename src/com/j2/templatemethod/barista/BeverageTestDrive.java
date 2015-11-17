package com.j2.templatemethod.barista;

public class BeverageTestDrive {
  public static void main(String[] args) {
    Coffee coffee = new Coffee();
    Tea tea = new Tea();
    coffee.prepareRecipe();
    tea.prepareRecipe();
  }
}
    