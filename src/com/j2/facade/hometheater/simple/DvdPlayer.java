package com.j2.facade.hometheater.simple;

public class DvdPlayer {
  String description;
    Amplifier amplifier;
    String movie;
    String music;
 
    public DvdPlayer(String description, Amplifier amplifier) {
        this.description = description;
        this.amplifier = amplifier;
    }
    
    public void on() {
        System.out.println(description + " on");
    }
    
    public void off() {
        System.out.println(description + " off");
    }
    
    public void eject() {
        movie = null;
        music = null;
        System.out.println(description + " eject");
    }
    
    public void playMovie(String movie) {
        this.movie = movie;
        System.out.println(description + " playing \"" + movie + "\"");
    }
    
    public void playMusic(String music) {
      this.music = music;
      System.out.println(description + " playing \"" + music + "\"");
    }
    
    public void stopMovie() {
        System.out.println(description + " stopped \"" + movie + "\"");
    }
    
    public void stopMusic() {
        System.out.println(description + " stopped \"" + music + "\"");
    }
    
    public String toString() {
        return description;
    }
}