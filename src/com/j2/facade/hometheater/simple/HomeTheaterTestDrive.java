package com.j2.facade.hometheater.simple;

public class HomeTheaterTestDrive {
  public static void main(String[] args) {
    Amplifier amp = new Amplifier("My Amplifier");
    Tuner tuner = new Tuner("My AM/FM Tuner", amp);
    DvdPlayer dvd = new DvdPlayer("My DVD Player", amp);
    Projector projector = new Projector("My Projector", dvd);
    Stand stand = new Stand("My Stand");
    Computer computer = new Computer("My Computer");
        
    HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, projector, stand, computer);
    homeTheater.watchMovie("My watching movie...");
    homeTheater.endMovie();
    homeTheater.beginStudy("study music");
    homeTheater.endStudy();
  }
}
    