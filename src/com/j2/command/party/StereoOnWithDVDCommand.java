package com.j2.command.party;

public class StereoOnWithDVDCommand implements Command {
  Stereo stereo;
  
  public StereoOnWithDVDCommand(Stereo stereo) {
    this.stereo = stereo;
  }
  
  public void execute() {
    stereo.on();
    stereo.setDVD();
    stereo.setVolume(11);
  }
  
  public void undo() {
    stereo.off();
  }
}