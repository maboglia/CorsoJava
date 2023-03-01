package com.example;

import javax.swing.*;
import java.awt.*;

public class JSplitDemo extends JFrame  {
  public JSplitDemo(String fileName) {
    super("JSplitPane");
    setSize(300, 250);
    // costruisce un pannello contenente un�immagine
    ImageIcon img = new ImageIcon(fileName);
    JLabel picture = new JLabel(img);
    JScrollPane pictureScrollPane = new JScrollPane(picture);
    // crea un pannello che contiene un�area di testo
    JTextArea comment = new JTextArea();
    JScrollPane commentScrollPane = new JScrollPane(comment);
    // Crea uno SplitPane verticale con i due pannelli al suo interno
    JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, pictureScrollPane, commentScrollPane);
    splitPane.setOneTouchExpandable(true);
    splitPane.setDividerLocation(190);
    splitPane.setContinuousLayout(true);
    // aggiunge lo SplitPane al frame principale
    getContentPane().add(splitPane);
    setVisible(true);
  }

  public static void main(String argv[]) {
    if ( argv.length == 1 ) {
      JSplitDemo b = new JSplitDemo(argv[0]);
    }
    else
      System.out.println("usage JSplitDemo <filename>");
  }
}
