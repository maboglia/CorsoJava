package com.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JButtonExample extends JFrame  {

  private JButton dialogButton;
  private JButton closeButton;

  public JButtonExample() {
    super("JButtonExample");
    closeButton = new JButton("Close");
    dialogButton = new JButton("Open Frame");
    dialogButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(closeButton, "Chiudi questa finestra per proseguire");
      }
    });
    closeButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        try {
          System.exit(0);
        }
        catch (Exception ex) {
        }
      }
    });
    getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
    getRootPane().setDefaultButton(closeButton);
    getContentPane().add(closeButton);
    getContentPane().add(dialogButton);
    pack();
  }

  public static void main(String argv[]) {
    JButtonExample x = new JButtonExample();
    x.setVisible(true);
  }
}
