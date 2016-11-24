package esempi.week6.GUI2D;

import javax.swing.JFrame;

/**
   This program displays a rectangle that can be moved with the mouse or keyboard.
*/
public class RectangleViewer3
{  
   public static void main(String[] args)
   {        
      JFrame frame = new RectangleFrame3();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
} 
