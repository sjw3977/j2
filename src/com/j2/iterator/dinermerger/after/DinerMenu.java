package com.j2.iterator.dinermerger.after;

public class DinerMenu implements Menu {
  static final int MAX_ITEMS = 6;
  int numberOfItems = 0;
  MenuItem[] menuItems;
  
  public DinerMenu() {
    menuItems = new MenuItem[MAX_ITEMS];
    addItem("채식 BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
    addItem("그냥 BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99);
    addItem("오늘의 스프", "Soup of the day, with a side of potato salad", false, 3.29);
    addItem("핫도그", "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05);
    addItem("찐 채소와 현미밥", "Steamed vegetables over brown rice", true, 3.99);
    addItem("파스타", "Spaghetti with Marinara sauce, and a slice of sourdough bread", true, 3.89);
  }
  
  public void addItem(String name, String description, boolean vegetarian, double price) {
    MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
    if (numberOfItems >= MAX_ITEMS) {
      System.out.println("Sorry, menu is full! Can't add item to menu");
    } else {
      menuItems[numberOfItems] = menuItem;
      numberOfItems = numberOfItems + 1;
    }
  }
  
  public MenuItem[] getMenuItems() {
    return menuItems;
  }
  
  public Iterator createIterator() {
    return new DinerMenuIterator(menuItems);
  }
}