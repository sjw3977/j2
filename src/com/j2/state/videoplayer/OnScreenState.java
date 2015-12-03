package com.j2.state.videoplayer;

public class OnScreenState implements State {
  VideoPlayer videoPlayer;
  
  public OnScreenState(VideoPlayer videoPlayer) {
    this.videoPlayer = videoPlayer;
  }
  
  public void on() {
    System.out.println("Screen is already on");
  }
  
  public void play() {
    System.out.println("Video is played");
    videoPlayer.setState(videoPlayer.getPlayState());
  }
  
  public void stop() {
    System.out.println("Video is not played");
  }
  
  public String toString() {
    return "waiting for playing video";
  }
}