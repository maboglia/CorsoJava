package com.example;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EventHandlingExample extends JFrame implements ActionListener {

  public EventHandlingExample() {
    super("Eventi");
    setSize(400,300);
    JButton b = new JButton("Button");
    getContentPane().add(b);
    b.addActionListener(this);
  }
  public void actionPerformed(ActionEvent e) {
    JOptionPane.showMessageDialog(this,"pulsante premuto");
  }
  public static void main(String argv[]) {
    EventHandlingExample e = new EventHandlingExample();
    e.setVisible(true);
  }
}
