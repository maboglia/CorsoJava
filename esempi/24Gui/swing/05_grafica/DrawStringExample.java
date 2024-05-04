package com.example;

import java.awt.*;
import java.beans.*;
import javax.swing.*;
import com.mokabyte.mokabook2.pannelli.FontChooser;

public class DrawStringExample extends JComponent  {
  private String text;

  public DrawStringExample(String text) {
    this.text = text;
  }

  public void paintComponent(Graphics g) {
    FontMetrics metrics = g.getFontMetrics();
    Dimension size = getSize();
    int fontHeight = metrics.getHeight();
    int textWidth = metrics.stringWidth(text);
    
    int x = (size.width - textWidth) / 2;
    int y = (size.height + (fontHeight/2)) / 2;
    g.drawString(text,x,y);
  }

  public static void main(String argv[]) {
    if(argv.length != 1)
      throw new IllegalArgumentException("Use: java PaintImageExample <string>");
    JFrame f = new JFrame("ImageExample");
    f.getContentPane().setLayout(new BorderLayout());
    
    FontChooser fc = new FontChooser();
    final DrawStringExample dse = new DrawStringExample(argv[0]);

    fc.addPropertyChangeListener(new PropertyChangeListener() {
      public void propertyChange(PropertyChangeEvent e) {
        if(e.getPropertyName().equals("font"))
         dse.setFont((Font)e.getNewValue());
         dse.repaint();
      }
    });
    f.setSize(600, 500);
    f.getContentPane().add(BorderLayout.NORTH,fc);
    f.getContentPane().add(BorderLayout.CENTER,dse);
    
    fc.setFont(dse.getFont());
    f.setVisible(true);
  }
}
