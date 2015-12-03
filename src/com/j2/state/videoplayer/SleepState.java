package com.j2.state.videoplayer;

public class SleepState implements State {
  VideoPlayer videoPlayer;
  
  public SleepState(VideoPlayer videoPlayer) {
    this.videoPlayer = videoPlayer;
  }
  
  public void on() {
    System.out.println("Screen is on");
    videoPlayer.setState(videoPlayer.getOnScreenState());
  }
  
  public void play() {  
    System.out.println("You can't play video");
  }
  
  public void stop() {
    System.out.println("Video is already stopped");
  }
  
  public String toString() {
    return "sleep";
  }
}
    