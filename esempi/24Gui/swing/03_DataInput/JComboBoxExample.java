package com.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JComboBoxExample extends JFrame  {
  private JComboBox uneditableComboBox;

  private JLabel label;

  private JComboBox editableComboBox;

  private String[] items;

  public JComboBoxExample() {
    // Imposta le propriet� del Top Level Container
    super("JComboBoxExample");
    setBounds(10, 35, 300, 100);
    getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT));
    // Crea 20 elementi
    items = new String[20];
    for ( int i = 0; i < 20; i++)
      items[i] = "Elemento numero " + String.valueOf(i);
    // Inizializza un ComboBox non editabile
    uneditableComboBox = new JComboBox(items);
    ActionListener selectionListener = new SelectionListener();
    uneditableComboBox.addActionListener(selectionListener);
    label = new JLabel();
    // Inizializza un JComboBox editabile
    editableComboBox = new JComboBox();
    editableComboBox.setEditable(true);
    editableComboBox.addActionListener(new EditListener());
    editableComboBox.addActionListener(selectionListener);
    getContentPane().add(uneditableComboBox);
    getContentPane().add(editableComboBox);
    getContentPane().add(label);
    setVisible(true);
  }

  class SelectionListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      JComboBox cb = (JComboBox)e.getSource();
      String selectedItem = (String)cb.getSelectedItem();
      label.setText("Selezionato: " + selectedItem);
    }
  }

  class EditListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      JComboBox cb = (JComboBox)e.getSource();
      String selectedItem = (String)cb.getSelectedItem();
      editableComboBox.addItem(selectedItem);
      editableComboBox.setSelectedItem("");
    }
  }

  public static void main(String argv[]) {
    JComboBoxExample b = new JComboBoxExample();
  }
}
