package com.j2.command.party;

public interface Command {
  public void execute();
  public void undo();
}