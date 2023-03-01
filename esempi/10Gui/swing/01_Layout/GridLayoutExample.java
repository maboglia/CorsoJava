package com.example;

import java.awt.*;
import javax.swing.*;

public class GridLayoutExample  {
  public static void main(String argv[]) {
    JFrame f = new JFrame("GridLayout");
    f.getContentPane().setLayout(new GridLayout(4, 4));
    for ( int i = 0; i < 14; i++)
      f.getContentPane().add(new JButton(String.valueOf(i)));
    f.pack();
    f.setVisible(true);
  }
}
