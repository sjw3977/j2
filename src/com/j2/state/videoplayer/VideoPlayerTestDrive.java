package com.j2.state.videoplayer;

public class VideoPlayerTestDrive {
  public static void main(String[] args) {
    VideoPlayer videoPlayer = new VideoPlayer("java");
    System.out.println(videoPlayer);  
    videoPlayer.on();
    System.out.println(videoPlayer);
    videoPlayer.play();
    System.out.println(videoPlayer);
    videoPlayer.stop();
    System.out.println(videoPlayer);
  }
}  