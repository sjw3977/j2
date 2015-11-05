package com.j2.command.party;

public class StereoOnRadioCommand implements Command {
  Stereo stereo;
  
  public StereoOnRadioCommand(Stereo stereo) {
    this.stereo = stereo;
  }
  
  public void execute() {
    stereo.on();
    stereo.setRadio();
    stereo.setVolume(11);
  }
  
  public void undo() {
    stereo.off();
  }
}