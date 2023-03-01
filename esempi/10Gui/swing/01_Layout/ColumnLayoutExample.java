package com.example;

import java.awt.*;
import javax.swing.*;

public class ColumnLayoutExample  {
  public static void main(String argv[]) {
    JFrame f = new JFrame("Column");
    f.getContentPane().setLayout(new GridLayout(0, 1));
    for ( int i = 0; i < 5; i++)
      f.getContentPane().add(new JButton(String.valueOf(i)));
    f.pack();
    f.setVisible(true);
  }
}
