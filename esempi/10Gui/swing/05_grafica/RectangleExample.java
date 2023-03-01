package com.example;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class RectangleExample extends JComponent  {
  private Point corner1 = new Point(0,0);
  private Point corner2 = new Point(0,0);
    
  public RectangleExample() {
    MouseInputAdapter m = new RectangleExampleMouseListener(); 
    addMouseListener(m);
    addMouseMotionListener(m);
  }
  public void paintComponent(Graphics g) {
    int x = Math.min(corner1.x,corner2.x);
    int y = Math.min(corner1.y,corner2.y);
    int width  = Math.abs(corner1.x - corner2.x);
    int height = Math.abs(corner1.y - corner2.y);

    g.fillRect(x, y, width, height);
  }  
  class RectangleExampleMouseListener extends MouseInputAdapter {
    public void mousePressed(MouseEvent e) {
      corner1 = e.getPoint();
      corner2 = corner1;
      repaint();
    }
    public void mouseDragged(MouseEvent e) {
      corner2 = e.getPoint();
      repaint();
    }
  }
  public static void main(String argv[]) {
    JFrame f = new JFrame("RectangleExample");
    f.setSize(500, 300);
    RectangleExample r = new RectangleExample();
    r.setForeground(Color.BLUE);
    f.getContentPane().add(r);
    f.setVisible(true);
  }
}

