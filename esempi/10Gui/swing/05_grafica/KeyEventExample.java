package com.example;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyEventExample extends JFrame {

  private int x = 30;
  private int y = 220;
  private String s = "A";
  
  public KeyEventExample() {
    super("KeyEventExample");
    getContentPane().add(new InnerComponent());
    setSize(500,400);
    addKeyListener(new KeyHandler());
  }
  class InnerComponent extends JComponent {
    public void paintComponent(Graphics g) {
      g.setFont(new Font("monospaced",5,180));
      if(!s.equals(""))
        g.drawString(s,x,y);
    }
  }
  class KeyHandler extends KeyAdapter {
    public void keyPressed(KeyEvent e) {
      int c = e.getKeyCode();
        switch(c) {
          case KeyEvent.VK_UP : 
            y--;
            break;
          case KeyEvent.VK_DOWN :
            y++;
            break;
          case KeyEvent.VK_LEFT : 
            x--;
            break;
          case KeyEvent.VK_RIGHT :
            x++;
            break;   
          case KeyEvent.VK_BACK_SPACE :
            int length = s.length() > 1 ? s.length()-1 : 0;
            s = s.substring(0,length);
            break;
          default :
            s = s+Character.toString(e.getKeyChar());
            break;
        }
        repaint();
    }
  }

  public static void main(String argv[]) {
    KeyEventExample k = new KeyEventExample();
    k.setVisible(true);
  }
}
