package com.j2.command.undo;

public class RemoteLoader {
  public static void main(String[] args) {
    RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
    
    Light livingRoomLight = new Light("Living Room");
    Stereo livingRoomStereo = new Stereo("Living Room");
    
    LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
    LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
    
    StereoOnCommand livingRoomStereoOn = new StereoOnCommand(livingRoomStereo);
    StereoOffCommand livingRoomStereoOff = new StereoOffCommand(livingRoomStereo);
    
    remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
    remoteControl.setCommand(1, livingRoomStereoOn, livingRoomStereoOff);
    
    remoteControl.onButtonWasPushed(0);
    remoteControl.offButtonWasPushed(0);
    System.out.println(remoteControl);
    remoteControl.undoButtonWasPushed();
    remoteControl.offButtonWasPushed(0);
    remoteControl.onButtonWasPushed(0);
    System.out.println(remoteControl);
    remoteControl.undoButtonWasPushed();
    
    remoteControl.onButtonWasPushed(1);
    remoteControl.offButtonWasPushed(1);
    System.out.println(remoteControl);
    remoteControl.undoButtonWasPushed();
    remoteControl.offButtonWasPushed(1);
    remoteControl.onButtonWasPushed(1);
    System.out.println(remoteControl);
    remoteControl.undoButtonWasPushed();
  }
}