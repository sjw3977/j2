package com.j2.observer;

public void WeatherStation {
  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();
    
    CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
  }
}
    