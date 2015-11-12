package com.j2.facade.hometheater.simple;

public class HomeTheaterFacade {
  private Amplifier amp;
  private Tuner tuner;
  private DvdPlayer dvd;
  private Projector projector;
  private Stand stand;
  private Computer computer;
  
  public HomeTheaterFacade(Amplifier amp, Tuner tuner, DvdPlayer dvd, Projector projector, Stand stand, Computer computer) {
       this.amp = amp;
       this.tuner = tuner;
       this.dvd = dvd;
       this.projector = projector;
       this.stand = stand;
       this.computer = computer;
  }
  
  public void watchMovie(String movie) {
    System.out.println("Get ready to watch movie...");
    projector.on();
    projector.wideScreenMode();
    amp.on();
    amp.setDvd(dvd);
    amp.setVolume(5);
    dvd.on();
    dvd.playMovie(movie);
  }
  
  public void endMovie() {
    System.out.println("Shutting movie theater down...");
    projector.off();
    amp.off();
    dvd.stopMovie();
    dvd.eject();
    dvd.off();
  }
  
  public void beginStudy(String music) {
    System.out.println("Begining study...");
    stand.on();
    stand.setLevel(30);
    amp.on();
    amp.setDvd(dvd);
    amp.setVolume(2);
    dvd.on();
    dvd.playMusic(music);
    computer.on();
    computer.search("lecture");
  }
  
  public void endStudy() {
    System.out.println("Ending study...");
    amp.off();
    dvd.eject();
    dvd.off();
    computer.off();
    stand.off();
  }
}