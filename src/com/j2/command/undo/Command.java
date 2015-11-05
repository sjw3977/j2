package com.j2.command.undo;

public interface Command {
  public void execute();
  public void undo();
}