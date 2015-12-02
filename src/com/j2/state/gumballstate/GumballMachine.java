package com.j2.state.gumballstate;

public class GumballMachine {
  State soldOutState;
  State noQuarterState;
  State hasQuarterState;
  State soldState;
  
  State state = soldOutState;
  int count = 0;
  
  public GumballMachine(int count) {
    soldOutState = new SoldOutState(this);
    noQuarterState = new NoQuarterState(this);
    hasQuarterState = new HasQuarterState(this);
    soldState = new SoldState(this);
    
    this.count = count;
    if (count > 0) {
      state = noQuarterState;
    }
  }
  
  public void insertQuarter() {
    state.insertState();
  }
  
  public void ejectQuarter() {
    state.ejectQuarter();
  }
  
  public void turnCrank() {
    state.turnCrank();
  }
  
  public void dispense() {
    state.dispense();
  }
  
  public void setState(State state) {
    this.state = state;
  }
  
  public State getState() {
    return state;
  }
  
  public State getSoldOutState() {
    return soldOutState;
  }
  
  public State getNoQuarterState() {
    return noQuarterState;
  }
  
  public State getHasQuarterState() {
    return hasQuarterState;
  }
  
  public State getSoldState() {
    return soldState;
  }