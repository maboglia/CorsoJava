package com.example;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class JListExample extends JFrame  {
  private JList list;

  private JTextArea output;

  public JListExample() {
    super("JListExample");
    setSize(170, 220);
    getContentPane().setLayout(new GridLayout(0, 1));
    // Crea 20 elementi
    String[] items = new String[20];
    for ( int i = 0; i < 20; i++)
      items[i] = "Elemento numero " + String.valueOf(i);
    // Inizializza una JList
    list = new JList(items);
    list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    ListSelectionListener selectionListener = new SelectionListener();
    list.addListSelectionListener(selectionListener);
    // Crea la TextArea di output
    output = new JTextArea();
    output.setEditable(false);
    // assembla la GUI
    getContentPane().add(new JScrollPane(list));
    getContentPane().add(new JScrollPane(output));
    setVisible(true);
  }

  class SelectionListener implements ListSelectionListener {
    public void valueChanged(ListSelectionEvent e) {
      if ( !e.getValueIsAdjusting() ) {
        JList list = (JList)e.getSource();
        output.setText("");
        Object[] selectedItems = list.getSelectedValues();
        for ( int i = 0; i < selectedItems.length; i++)
          output.append(selectedItems[i].toString() + "\n");
      }
    }
  }

  public static void main(String argv[]) {
    JListExample b = new JListExample();
  }
}
