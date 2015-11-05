package com.j2.command.party;

public class TV {
  String location;
  int chennel;
  
  public TV(String location) {
    this.location = location;
  }
  
  public void on() {
    System.out.println(location + " TV is on");
  }
  
  public void off() {
    System.out.println(location + " TV is off");
  }
  
  public void setInputChennel() {
    chennel = 3;
    System.out.println(location + " TV chennel is set for DVD");
  }
}
  
  