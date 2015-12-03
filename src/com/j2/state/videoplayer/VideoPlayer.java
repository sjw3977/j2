package com.j2.state.videoplayer;

public class VideoPlayer {
  State onScreenState;
  State playState;
  State sleepState;
  
  State state;
  String video;
  
  public VideoPlayer(String video) {
    onScreenState = new OnScreenState(this);
    playState = new PlayState(this);
    sleepState = new SleepState(this);
    this.video = video;
    state = sleepState;
  }
  
  public void on() {
    state.on();
  }
  
  public void play() {
    state.play();
  }
  
  public void stop() {
    state.stop();
  }
  
  public void setState(State state) {
    this.state = state;
  }
  
  public State getState() {
    return state;
  }
  
  public State getOnScreenState() {
    return onScreenState;
  }
  
  public State getPlayState() {
    return playState;
  }
  
  public State getSleepState() {
    return sleepState;
  }
  
  public String toString() {
    StringBuffer result = new StringBuffer();
    result.append("\nvideo player");
    result.append("\nvideo : " + video);
    result.append("\nvideo player is " + state + "\n");
    return result.toString();
  }
}
  