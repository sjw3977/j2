package com.j2.command.party;

public class TVOnCommand implements Command {
  TV tv;
  
  public TVOnCommand(TV tv) {
    this.tv = tv;
  }
  
  public void execute() {
    tv.on();
    tv.setInputChennel();
  }
  
  public void undo() {
    tv.off();
  }
}