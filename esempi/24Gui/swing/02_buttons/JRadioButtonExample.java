package com.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JRadioButtonExample extends JFrame  {

private JRadioButton radioButton1;
  private JRadioButton radioButton2;
  private JRadioButton radioButton3;
  private JLabel label;

  public JRadioButtonExample() {
    // Imposta le propriet� del Top Level Container
    super("JRadiobuttonExample");
    setBounds(10, 35, 150, 150);
    getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
    // Crea i radiobutton e la label
    radioButton1 = new JRadioButton("RadioButton 1");
    radioButton2 = new JRadioButton("RadioButton 2");
    radioButton3 = new JRadioButton("RadioButton 3");
    label = new JLabel();
    // Crea l'ascoltatore e registra i JRadioButton
    ActionListener listener = new JRadioButtonListener();
    radioButton1.addActionListener(listener);
    radioButton2.addActionListener(listener);
    radioButton3.addActionListener(listener);
    // Crea il ButtonGroup e registra i RadioButton
    ButtonGroup group = new ButtonGroup();
    group.add(radioButton1);
    group.add(radioButton2);
    group.add(radioButton3);
    // Aggiunge i componenti al Top Level Container
    getContentPane().add(radioButton1);
    getContentPane().add(radioButton2);
    getContentPane().add(radioButton3);
    getContentPane().add(label);
    radioButton1.doClick();
    setVisible(true);
  }

  // Ascoltatore JRadioButton
  class JRadioButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      String target = e.getActionCommand();
      label.setText(target);
    }
  }

  public static void main(String argv[]) {
    JRadioButtonExample b = new JRadioButtonExample();
  }
}
