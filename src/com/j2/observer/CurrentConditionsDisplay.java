package com.j2.observer;

public class CurrentConditionsDisplay implements Observer {
  private float temperature;
  private float humidity;
  private Subject weatherData;
  
  public CurrentConditionsDisplay(Subject weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }
  
  public void update(float t, float h, float p) {
    this.temperature = t;
    this.humidity = h;
    display();
  }
  
  public void display() {
    System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
  }
}