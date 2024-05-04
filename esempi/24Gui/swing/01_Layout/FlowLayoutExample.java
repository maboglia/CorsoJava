package com.example;

import java.awt.*;
import javax.swing.*;

public class FlowLayoutExample  {
  public static void main(String argv[]) {
    JFrame f = new JFrame();
    f.getContentPane().setLayout(new FlowLayout());
    f.getContentPane().add(new JButton("Primo"));
    f.getContentPane().add(new JButton("Secondo"));
    f.getContentPane().add(new JButton("Terzo"));
    f.getContentPane().add(new JButton("Quarto"));
    f.getContentPane().add(new JButton("Quinto"));
    f.pack();
    f.setVisible(true);
  }
}
