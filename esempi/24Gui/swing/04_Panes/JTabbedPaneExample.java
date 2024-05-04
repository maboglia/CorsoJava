package com.example;

import javax.swing.*;
import javax.swing.event.*;

public class JTabbedPaneExample extends JFrame  {
  private JTabbedPane tabbedPane;

  public JTabbedPaneExample() {
    super("JTabbedPaneExample");
    tabbedPane = new JTabbedPane();
    JTextField tf = new JTextField("primo Tab");
    JButton b = new JButton("secondo Tab");
    JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 60, 15);
    tabbedPane.addChangeListener(new TabListener());
    tabbedPane.addTab("uno", tf);
    tabbedPane.addTab("due", b);
    tabbedPane.addTab("tre", slider);
    getContentPane().add(tabbedPane);
    pack();
    setVisible(true);
  }

  public class TabListener implements ChangeListener {
    public void stateChanged(ChangeEvent e) {
      int pos = tabbedPane.getSelectedIndex();
      String title = tabbedPane.getTitleAt(pos);
      setTitle(title);
    }
  }

  public static void main(String[] args) {
    JTabbedPaneExample te = new JTabbedPaneExample();
  }
}
