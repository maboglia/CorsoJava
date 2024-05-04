package com.example;

import java.awt.*;

public class FontEstractor  {
  public static void main(String argv[]) {
    Font[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAllFonts();
    for ( int i = 0; i < fonts.length; i++)
      System.out.println(fonts[i].toString());
  }
}
