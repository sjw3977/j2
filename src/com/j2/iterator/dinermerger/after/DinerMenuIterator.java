package com.j2.iterator.dinermerger.after;

public class DinerMenuIterator implements Iterator {
  MenuItem[] items;
  int position;
  
  public DinerMenuIterator(MenuItem[] items) {
    this.items = items;
  }
    
  public boolean hasNext() {
    if (position >= items.length || items[position] == null) {
      return false;
    } else {
      return true;
    }
  }
  
  public Object next() {
    MenuItem menuItem = items[position];
    position += 1;
    return menuItem;
  }
}