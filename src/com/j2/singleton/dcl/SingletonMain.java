package com.j2.singleton.dcl;

public class SingletonMain {
  public static void main(String[] args) {
    Singleton c1 = Singleton.getInstance();
    Singleton c2 = Singleton.getInstance();
  }
}