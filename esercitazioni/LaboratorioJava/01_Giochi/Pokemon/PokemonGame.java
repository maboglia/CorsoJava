import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JFrame;
// Ken Kawano
public class PokemonGame {
   public static void main (String [] args){
   
// Creates pokemon frame
   JFrame frame = new JFrame ("Pokemon Game");
   
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
   frame.setSize(1200, 1200);
   frame.setMinimumSize( new Dimension (1200,1200));
   
//brings in PokemonPanel
   frame.getContentPane().add(new PokemonPanel());
   frame.pack();
   frame.setVisible(true);
   }
}      
