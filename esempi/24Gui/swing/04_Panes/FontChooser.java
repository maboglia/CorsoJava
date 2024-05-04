package com.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.beans.*;

public class FontChooser extends JComponent  {
  private JComboBox fontNameBox;

  private JComboBox fontSizeBox;

  private JCheckBox boldCheckBox;

  private JCheckBox italicCheckBox;

  public FontChooser() {
    fontNameBox = new JComboBox();
    fontSizeBox = new JComboBox();
    boldCheckBox = new JCheckBox("Bold", false);
    italicCheckBox = new JCheckBox("Italic", false);
    Font[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAllFonts();
    for ( int i = 0; i < fonts.length; i++)
      fontNameBox.addItem(fonts[i].getName());
    for ( int i = 6; i < 200; i++)
      fontSizeBox.addItem(new Integer(i));
    fontSizeBox.setSelectedIndex(12);
    setLayout(new GridLayout(0, 1));
    JPanel comboBoxPanel = new JPanel();
    comboBoxPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
    comboBoxPanel.add(fontNameBox);
    comboBoxPanel.add(fontSizeBox);
    add(comboBoxPanel);
    JPanel checkBoxPanel = new JPanel();
    checkBoxPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
    checkBoxPanel.add(boldCheckBox);
    checkBoxPanel.add(italicCheckBox);
    add(checkBoxPanel);
    setBorder(BorderFactory.createTitledBorder("Choose Font"));
    ActionListener eventForwarder = new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        setFont(new Font((String)fontNameBox.getSelectedItem(), (boldCheckBox.isSelected() ? Font.BOLD : Font.PLAIN) | (italicCheckBox.isSelected() ? Font.ITALIC : Font.PLAIN), ((Integer)fontSizeBox.getSelectedItem()).intValue()));
      }
    };
    fontNameBox.addActionListener(eventForwarder);
    fontSizeBox.addActionListener(eventForwarder);
    boldCheckBox.addActionListener(eventForwarder);
    italicCheckBox.addActionListener(eventForwarder);
  }

  public void setFont(Font f) {
    super.setFont(f);
    // Questa chiamata genera un PropertyChangeEvent
    fontNameBox.setSelectedItem(f.getName());
    fontSizeBox.setSelectedItem(new Integer(f.getSize()));
    boldCheckBox.setSelected(f.isBold());
    italicCheckBox.setSelected(f.isItalic());
  }

  public static Font showFontChooser(Component parent, String title, Font initialFont) {
    FontChooser fc = new FontChooser();
    fc.setFont(initialFont);
    int answer = JOptionPane.showConfirmDialog(parent, fc, title, JOptionPane.OK_CANCEL_OPTION);
    if ( answer != JOptionPane.OK_OPTION )
      return null;
    else
      return fc.getFont();
  }

  public static void main(String argv[]) {
    FontChooser.showFontChooser(null,"FontChooser",new Font("monospaced",0,0));
  }
}
