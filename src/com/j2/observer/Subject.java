package com.j2.observer;

public interface Subject {
  public void registerObseerver(Observer o);
  public void removeObserver(Observer o);
  public void notifyObservers();
}