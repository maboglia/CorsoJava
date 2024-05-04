package com.example;

import java.awt.*;
import javax.swing.*;

public class PaintExample extends JComponent  {
  public void paintComponent(Graphics g) {
    g.setColor(Color.BLACK);
    g.fillRect(0,0,400,400);
    g.setColor(Color.GREEN);
    g.fillOval(0,0,400,400);
    g.setColor(Color.WHITE);
    g.fillOval(50,50,300,300);
    g.setColor(Color.RED);
    g.fillOval(100,100,200,200);    
  }

  public static void main(String argv[]) {
    JFrame f = new JFrame("PaintExample");
    f.setSize(410,430);
    f.getContentPane().add(new PaintExample());
    f.setVisible(true);
  }
}
