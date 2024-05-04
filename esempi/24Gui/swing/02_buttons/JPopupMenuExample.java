package com.example;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JPopupMenuExample extends JFrame  {
  private JPopupMenu popup;

  public JPopupMenuExample() {
    super("JPopupMenuExample");
    setBounds(10, 35, 350, 120);
    JTextField textField = new JTextField("Premi il tasto sinistro per vedere un JPopupMenu");
    textField.setEditable(false);
    getContentPane().setLayout(new FlowLayout());
    getContentPane().add(textField);
    popup = new JPopupMenu();
    JMenuItem popupItem1 = new JMenuItem("PopupItem 1");
    JMenuItem popupItem2 = new JMenuItem("PopupItem 2");
    JMenuItem popupItem3 = new JMenuItem("PopupItem 3");
    popup.add(popupItem1);
    popup.add(popupItem2);
    popup.add(popupItem3);
    // Aggiunge un MouseListener al componente
    // che deve mostrare il menu
    MouseListener popupListener = new PopupListener();
    textField.addMouseListener(popupListener);
    setVisible(true);
  }

  class PopupListener extends MouseAdapter  {
    public void mousePressed(MouseEvent e) {
      if ( e.isPopupTrigger() ) {
        popup.show(e.getComponent(), e.getX(), e.getY());
      }
    }

    public void mouseReleased(MouseEvent e) {
      if ( e.isPopupTrigger() ) {
        popup.show(e.getComponent(), e.getX(), e.getY());
      }
    }
  }

  public static void main(String[] args) {
    JPopupMenuExample window = new JPopupMenuExample();
  }
}
