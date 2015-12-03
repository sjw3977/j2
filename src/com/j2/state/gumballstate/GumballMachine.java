package com.j2.state.gumballstate;

public class GumballMachine {
  State soldOutState;
  State noQuarterState;
  State hasQuarterState;
  State soldState;
  State errorState;
  
  State state = soldOutState;
  int count = 0;
  
  public GumballMachine(int count) {
    soldOutState = new SoldOutState(this);
    noQuarterState = new NoQuarterState(this);
    hasQuarterState = new HasQuarterState(this);
    soldState = new SoldState(this);
    errorState = new ErrorState(this);
    
    this.count = count;
    if (count > 0) {
      state = noQuarterState;
    }
  }
  
  public void insertQuarter() {
    state.insertQuarter();
  }
  
  public void ejectQuarter() {
    state.ejectQuarter();
  }
  
  public void turnCrank() {
    state.turnCrank();
    state.dispense();
  }
  
  public void dispense() {
    state.dispense();
  }
  
  public void setState(State state) {
    this.state = state;
  }
  
  public void releaseBall() {
    System.out.println("A gumball comes rolling out the slot...");
    if (count != 0) {
      count -= 1;
    }
  }
  
  public int getCount() {
    return count;
  }
  
  public void refill(int count) {
    this.count = count;
    state = noQuarterState;
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
  
  public State getErrorState() {
    return errorState;
  }
  
  public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}