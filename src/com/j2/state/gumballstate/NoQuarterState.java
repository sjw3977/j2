package com.j2.state.gumballstate;
import java.util.Random;

public class NoQuarterState implements State {
  GumballMachine gumballMachine;
  
  public NoQuarterState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }
  
  public void insertQuarter() {
    Random insertQ = new Random(System.currentTimeMillis());
    int error = insertQ.nextInt(10);
    if (error == 0) {
      System.out.println("You insert a quarter wrong");
      gumballMachine.setState(gumballMachine.getErrorState());
    } else {
      System.out.println("You insert a quarter");
      gumballMachine.setState(gumballMachine.getHasQuarterState());
    }
  }
  
  public void ejectQuarter() {
    System.out.println("You haven't inserted a quarter");
  }
  
  public void turnCrank() {
    System.out.println("You turned but there's no quarter");
  }
  
  public void dispense() {
    System.out.println("You need to pay first");
  }
  
  public String toString() {
  return "waiting for quarter";
  }
}