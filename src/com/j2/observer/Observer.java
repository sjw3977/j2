package com.j2.observer;

public interface Observer {
  public void update(float temp, float humidity, float pressure);
}