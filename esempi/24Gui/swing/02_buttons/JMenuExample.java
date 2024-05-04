package com.example;

import javax.swing.*;

public class JMenuExample extends JFrame  {
  public JMenuExample() {
    // Imposta le propriet� del Top Level Container
    super("JMenuExample");
    setBounds(10, 35, 250, 250);
    // Crea menu, sottomenu e menuitems
    JMenuBar menubar = new JMenuBar();
    JMenu menu = new JMenu("Menu");
    JMenuItem simpleItem = new JMenuItem("SimpleItem");
    JMenu checkSubMenu = new JMenu("CheckBoxes");
    JCheckBoxMenuItem check1 = new JCheckBoxMenuItem("Check 1");
    JCheckBoxMenuItem check2 = new JCheckBoxMenuItem("Check 1");
    JMenu radioSubMenu = new JMenu("Radio");
    JRadioButtonMenuItem radio1 = new JRadioButtonMenuItem("Radio 1");
    JRadioButtonMenuItem radio2 = new JRadioButtonMenuItem("Radio 2");
    ButtonGroup group = new ButtonGroup();
    group.add(radio1);
    group.add(radio2);
    // Compone i menu
    checkSubMenu.add(check1);
    checkSubMenu.add(check2);
    radioSubMenu.add(radio1);
    radioSubMenu.add(radio2);
    menu.add(simpleItem);
    menu.addSeparator();
    // (new JSeparator());
    menu.add(checkSubMenu);
    menu.addSeparator();
    //.add(new JSeparator());
    menu.add(radioSubMenu);
    menubar.add(menu);
    // Aggiunge la menubar al JFrame
    setJMenuBar(menubar);
    setVisible(true);
  }

  public static void main(String argv[]) {
    JMenuExample m = new JMenuExample();
  }
}
