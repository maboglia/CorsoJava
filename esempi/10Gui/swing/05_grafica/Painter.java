package com.example;

import java.util.*;
import java.awt.*;  
import java.awt.event.*; 
import javax.swing.*;
import javax.swing.event.*;

public class Painter extends JComponent { 

  // contiene un Vector per ogni poly line
  private Vector polyLineList = new Vector();

  // Costruttore della classe principale 
  public Painter() { 
    super(); 
    MouseInputListener m = new MyMouseInputListener(); 
    addMouseListener(m); 
    addMouseMotionListener(m); 
  } 
  public void paintComponent(Graphics g) {
    // disegna ogni poly line
    Iterator polyLineIterator = polyLineList.iterator();
    while(polyLineIterator.hasNext()) {
      Vector polyLine = (Vector)polyLineIterator.next();
      Iterator pointIterator = polyLine.iterator();
      // disegna ogni linea della poly line
      Point oldPoint = (Point)pointIterator.next();
      while(pointIterator.hasNext()) {
        Point newPoint = (Point)pointIterator.next();
        g.drawLine(oldPoint.x,oldPoint.y,newPoint.x,newPoint.y);
        oldPoint = newPoint;
      }
    }
  }

  class MyMouseInputListener extends MouseInputAdapter {
    // pulsante premuto 
    public void mousePressed(MouseEvent e) {
      // crea una nuova Poly Line e la inserisce nella lista
      Vector polyLine = new Vector();
      polyLine.add(new Point(e.getX(),e.getY()));
      polyLineList.add(polyLine);
    }  
     public void mouseDragged(MouseEvent e) { 
       // aggiunge un punto alla poly line
       Vector polyLine = (Vector)polyLineList.lastElement();
       polyLine.add(e.getPoint());
       repaint();
    } 
  } 

  public static void main(String argv[]) { 
     Painter p = new Painter(); 
     JFrame f = new JFrame("Painter"); 
     f.getContentPane().add(p); 
     f.setSize(400,300); 
     f.setVisible(true); 
  } 
}  