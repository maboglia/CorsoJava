package esempi.week7.GUI2D;

import javax.swing.JFrame;

public class FaceViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.setSize(350, 550);
      frame.setTitle("An Alien Face");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      FaceComponent component = new FaceComponent();
      frame.add(component);
      
      FaceComponent component2 = new FaceComponent();
      frame.add(component2);

      frame.setVisible(true);
   }
}
