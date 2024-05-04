package com.example;

import java.awt.*;
import javax.swing.*;

public class SampleComponent extends JComponent  {
  private Color[] colors = {Color.RED,Color.GREEN,Color.WHITE};
  public void paintComponent(Graphics g) {
    // Calcola il diametro a partire dalle dimensioni del componente
    Dimension size = getSize();
    int d = Math.min(size.width, size.height);
    // Disegna una serie di cerchi concentrici
    for ( int i = 1; i <10 ; i++) {
       // sceglie a rotazione il colore
      g.setColor(colors[i%3]);
      // Calcola le coordinate del cerchio
      int x = (size.width - d) / 2;
      int y = (size.height - d) / 2;      
      g.fillOval(x, y, d,d);
      // riduce le dimensioni del diametro
      d = d - (d / 10 * 2);
    }
  }
  public static void main(String argv[]) {
    JFrame f = new JFrame("SampleComponent");
    f.setSize(500, 300);
    f.getContentPane().add(new SampleComponent());
    f.setVisible(true);
  }
}
