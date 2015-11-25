package com.j2.iterator.dinermerger.after;
import java.util.ArrayList;

public class PancakeHouseMenu implements Menu {
  ArrayList menuItems;
  
  public PancakeHouseMenu() {    
    menuItems = new ArrayList();
    addItem("K&B's ������ũ ��ħ �Ļ�", "Pancakes with scrambled egg, and toast", true, 2.99);
    addItem("���� ������ũ ��ħ �Ļ�", "Pancakes with fried eggs, sausage", false, 2.99);
    addItem("��纣�� ������ũ", "Pancakes made with fresh blueberries", true, 3.49);
    addItem("����", "Waffles, with your choice of blueberries or strawberries", true, 3.59);
  }
  
  public void addItem(String name, String description, boolean vegetarian, double price) {
    MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
    menuItems.add(menuItem);
  }
  
  public ArrayList getMenuItems() {
    return menuItems;
  }
  
  public Iterator createIterator() {
    return new PancakeHouseMenuIterator(menuItems);
  }
  
  public String toString() {
    return "Objectville Pancake House Menu";
  }
}