package com.j2.facade.hometheater.simple;

public class HomeTheaterFacade {
  private Amplifier amp;
  private Tuner tuner;
  private DvdPlayer dvd;
  private Projector projector;
  public HomeTheaterFacade(Amplifier amp, Tuner tuner, DvdPlayer dvd, Projector projector) {
       this.amp = amp;
       this.tuner = tuner;
       this.dvd = dvd;
       this.projector = projector;
  }
  
  public void watchMovie(String description) {
    System.out.println("Get ready to watch movie...");
    projector.on();
    projector.wideScreenMode();
    amp.on();
    amp.setDvd(dvd);
    amp.setVolume(5);
    dvd.on();
    dvd.play("movie");
  }
  
  public void endMovie() {
    System.out.println("Shutting movie theater down...");
    projector.off();
    amp.off();
    dvd.stop();
    dvd.eject();
    dvd.off();
  }
}