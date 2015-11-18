package com.j2.templatemethod.frame;

import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {
  
  public MyFrame(String title) {
    super(title);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(300, 300);
    this.setVisible(true);
  }
  
  public void paint(Graphics g) {
    super.paint(g);
    String msg = "Hello";
    g.drawString(msg, 100, 100);
  }
  
  public static void main(String[] args) {
    MyFrame myFrame = new MyFrame("Head First Design Patterns");
  }
}
    