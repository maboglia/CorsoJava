package com.example;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class BorderedTextEditor extends TextEditor  {
  protected JMenuBar createMenuBar() {
    JMenuBar mb = super.createMenuBar();
    mb.setBorder(new MatteBorder(7, 12, 7, 12, new ImageIcon("img/Texture_wood_004.jpg")));
    mb.setBackground(new Color(224, 195, 96));
    return mb;
  }

  protected JToolBar createToolBar() {
    JToolBar tb = super.createToolBar();
    tb.setBorder(new MatteBorder(7, 12, 7, 12, new ImageIcon("img/Texture_wood_004.jpg")));
    tb.setBackground(new Color(224, 195, 96));
    return tb;
  }

  protected JComponent createCenterComponent() {
    JComponent c = super.createCenterComponent();
    c.setBorder(new MatteBorder(7, 12, 7, 12, new ImageIcon("img/Texture_wood_004.jpg")));
    return c;
  }

  public static void main(String argv[]) {
    BorderedTextEditor t = new BorderedTextEditor();
  }
}
