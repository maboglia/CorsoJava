package com.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JTextFieldExample extends JFrame  {
  private JTextField textField;

  private JLabel label;

  public JTextFieldExample() {
    super("JTextField");
    setSize(200, 80);
    getContentPane().setLayout(new BorderLayout());
    textField = new JTextField();
    label = new JLabel();
    getContentPane().add(BorderLayout.NORTH, textField);
    textField.addActionListener(new EnterTextListener());
    getContentPane().add(BorderLayout.SOUTH, label);
    setVisible(true);
  }

  class EnterTextListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      label.setText("Testo inserito: " + textField.getText());
      textField.setText("");
    }
  }

  public static void main(String argv[]) {
    JTextFieldExample jtf = new JTextFieldExample();
  }
}
