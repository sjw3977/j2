package com.j2.observer;

import java.util.*;

public class WeatherData implements Subject {
  private ArrayList observers;
  private float temperature;
  private float humidity;
  private float pressure;
  
  public WeatherData() {
    observers = new ArrayList();
  }
  
  public void registerObseerver(Observer o) {
    observers.add(o);  
  }
  public void removeObserver(Observer o) {
    int i = observers.idexOf(o);
    if(i >= 0){
      observers.remove(i);
    }
  }
  public void notifyObservers() {
    for ( int i = 0; i < observers.size(); i++) {
      Observer observer = (Observer) observers.get(i);
      observers.update(temperature, humidity, pressure);
    }
  }
  
  public void setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
  }
  
  public void measurementsChanged() {
    notifyObservers();
  }
}
                                                                                