package com.j2.state.videoplayer;

public class PlayState implements State {
  VideoPlayer videoPlayer;
  
  public PlayState(VideoPlayer videoPlayer) {
    this.videoPlayer = videoPlayer;
  }
  
  public void on() {
    System.out.println("Screen is already on");
  }
  
  public void play() {
    System.out.println("Video is playing");
  }
  
  public void stop() {
    System.out.println("Video stopped");
    videoPlayer.setState(videoPlayer.getSleepState());
  }
  
  public String toString() {
    return "playing video";
  }
}