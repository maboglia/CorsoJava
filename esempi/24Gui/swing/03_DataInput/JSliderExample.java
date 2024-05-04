package com.example;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class JSliderExample extends JFrame  {
  private JSlider slider1;

  private JSlider slider2;

  private JSlider slider3;

  private JLabel label;

  public JSliderExample() {
    super("JSlider");
    setSize(220, 240);
    getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT));
    ChangeListener listener = new SliderChangeListener();
    slider1 = new JSlider(JSlider.HORIZONTAL, 0, 60, 15);
    slider1.setMajorTickSpacing(10);
    slider1.setMinorTickSpacing(5);
    slider1.setPaintTicks(true);
    slider1.setPaintLabels(true);
    slider1.addChangeListener(listener);
    slider2 = new JSlider(JSlider.HORIZONTAL, 0, 60, 10);
    slider2.setMajorTickSpacing(15);
    slider2.setMinorTickSpacing(5);
    slider2.setPaintTicks(true);
    slider2.setPaintLabels(true);
    slider2.addChangeListener(listener);
    slider3 = new JSlider(JSlider.HORIZONTAL, 0, 60, 30);
    slider3.setMajorTickSpacing(5);
    slider3.setMinorTickSpacing(1);
    slider3.setPaintTicks(true);
    slider3.setPaintLabels(true);
    slider3.addChangeListener(listener);
    label = new JLabel("Selezionato: " + String.valueOf(slider1.getValue()));
    getContentPane().add(slider1);
    getContentPane().add(slider2);
    getContentPane().add(slider3);
    getContentPane().add(label);
    setVisible(true);
  }

  class SliderChangeListener implements ChangeListener {
    public void stateChanged(ChangeEvent e) {
      JSlider source = (JSlider)e.getSource();
      label.setText("Selezionato: " + String.valueOf(source.getValue()));
    }
  }

  public static void main(String argv[]) {
    JSliderExample b = new JSliderExample();
  }
}
