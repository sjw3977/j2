package com.j2.singleton.classic;

public class SingletonMain {
  public static void main(String[] args) {
    //Singleton c1 = new Singleton(); (X)
    Singleton c1 = Singleton.getInstance();
    Singleton c2 = Singleton.getInstance();
    Singleton c3 = Singleton.getInstance();
  }
}
  