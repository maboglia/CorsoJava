```java

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {

 public static void main(String[] args) {

  // JFrame = a GUI window to add components to
  
  JFrame frame = new JFrame(); //creates a frame
  frame.setTitle("JFrame title goes here"); //sets title of frame
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit from application
  frame.setResizable(false); //prevent frame from being resized
  frame.setSize(420,420); //sets the x-dimension, and y-dimension of frame
  frame.setVisible(true); //make frame visible
  
  ImageIcon image = new ImageIcon("logo.png"); //create an ImageIcon
  frame.setIconImage(image.getImage()); //change icon of frame
  frame.getContentPane().setBackground(new Color(0x123456)); //change color of background
    
 }
}

//-------------------------------------

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI implements ActionListener {
    private int clicks = 0;
    private JLabel label = new JLabel("Number of clicks:  0     ");
    private JFrame frame = new JFrame();

    public GUI() {

        JButton button = new JButton("Click Me");
        button.addActionListener(this);

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("GUI");
        frame.pack();
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        clicks++;
        label.setText("Number of clicks:  " + clicks);
    }

    public static void main(String[] args) {
        new GUI();
    }
}


```

