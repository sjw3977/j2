package com.j2.state.gumballstate;

public class ErrorState implements State {
  GumballMachine gumballMachine;
  
  public ErrorState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }
  
  public void insertQuarter() {
    System.out.println("Gumball machine error, you can't insert a quarter");
  }
  
  public void ejectQuarter() {
    System.out.println("Quarter returned");
    gumballMachine.setState(gumballMachine.getNoQuarterState());
  }
  
  public void turnCrank() {
    System.out.println("Sorry, machine error");
  }
  
  public void dispense() {
    System.out.println("No gumball dispensed");
  }
  
  public String toString() {
    return "machine error";
  }
}
  