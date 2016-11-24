package esempi.week6.GUI2D;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

/*
   A component that draws two rectangles.
*/
public class RectangleComponent extends JComponent
{  
   public void paintComponent(Graphics g)
   {  
      // Recover Graphics2D
      Graphics2D g2 = (Graphics2D) g;

      // Construct a rectangle and draw it
      Rectangle box = new Rectangle(5, 10, 20, 30);
      g2.draw(box);

      // Move rectangle 15 units to the right and 25 units down
      box.translate(15, 25);

      // Draw moved rectangle
      g2.draw(box);
   }
}
