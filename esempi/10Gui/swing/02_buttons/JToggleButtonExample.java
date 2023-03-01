package com.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JToggleButtonExample extends JFrame  {

private JDialog dialog;
  private JToggleButton jDialogButton;

  public JToggleButtonExample() {
    super("JToggleButtonExample");
    setBounds(10, 35, 250, 70);
    FlowLayout fl = new FlowLayout(FlowLayout.CENTER);
    getContentPane().setLayout(fl);
    dialog = createDialog();

    jDialogButton = new JToggleButton("Open / Close Frame", false);
    jDialogButton.addItemListener(new JDialogButtonItemListener());
    getContentPane().add(jDialogButton);
    setVisible(true);
  }
  public JDialog createDialog() {
    JDialog d = new JDialog(this, "JDialog", false);
    d.setBounds(250, 20, 300, 100);
    d.getContentPane().setLayout(new BorderLayout());
    d.getContentPane().add(BorderLayout.CENTER, new JLabel("Finestra Aperta", JLabel.CENTER));
    d.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    return d;  
  }
  // Ascoltatore di JDialogButton 
  class JDialogButtonItemListener implements ItemListener {
    public void itemStateChanged(ItemEvent e) {
      int status = e.getStateChange();
      if ( status == ItemEvent.SELECTED )
        dialog.setVisible(true);
      else
        dialog.setVisible(false);
    }
  }

  public static void main(String argv[]) {
    JToggleButtonExample b = new JToggleButtonExample();
  }
}
