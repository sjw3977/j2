package com.j2.observer;

public class CurrentConditinosDisplay implements Observer {
  private float temperature;
  private float humidity;
  private Subject weatherData;
  public CurrentConditinosDisplay(Subject weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }
  
  public void update(float f, float h, float p) {
    this.temperature = t;
    this.humidity = h;
    this.pressure = p;
    display();
  }
  
  public void display() {
    System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
  }
}