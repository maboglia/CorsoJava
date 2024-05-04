package com.example;

import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class TextEditor extends JFrame  {
  private JTextComponent editor;

  private JFileChooser fileChooser;

  protected Action loadAction;

  protected Action saveAction;

  protected Action cutAction;

  protected Action copyAction;

  protected Action pasteAction;

  public TextEditor() {
    super("TextEditor");
    setSize(300, 300);
    createActions();
    JMenuBar menuBar = createMenuBar();
    JToolBar toolBar = createToolBar();
    editor = createEditor();
    JComponent centerPanel = createCenterComponent();
    getContentPane().add(BorderLayout.NORTH, toolBar);
    getContentPane().add(BorderLayout.CENTER, centerPanel);
    setJMenuBar(menuBar);
    fileChooser = new JFileChooser();
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  protected void createActions() {
    loadAction = new AbstractAction("Open", new ImageIcon("img/Open24.gif")) {
      public void actionPerformed(ActionEvent e) {
        loadText();
      }
    };
    saveAction = new AbstractAction("Save", new ImageIcon("img/Save24.gif")) {
      public void actionPerformed(ActionEvent e) {
        saveText();
      }
    };
    cutAction = new AbstractAction("Cut", new ImageIcon("img/Cut24.gif")) {
      public void actionPerformed(ActionEvent e) {
        editor.cut();
      }
    };
    copyAction = new AbstractAction("Copy", new ImageIcon("img/Copy24.gif")) {
      public void actionPerformed(ActionEvent e) {
        editor.copy();
      }
    };
    pasteAction = new AbstractAction("Paste", new ImageIcon("img/Paste24.gif")) {
      public void actionPerformed(ActionEvent e) {
        editor.paste();
      }
    };
  }

  protected JToolBar createToolBar() {
    JToolBar tb = new JToolBar();
    tb.add(loadAction);
    tb.add(saveAction);
    tb.addSeparator();
    tb.add(cutAction);
    tb.add(copyAction);
    tb.add(pasteAction);
    return tb;
  }

  protected JMenuBar createMenuBar() {
    JMenu menu = new JMenu("Menu");
    menu.add(loadAction);
    menu.add(saveAction);
    menu.addSeparator();
    menu.add(cutAction);
    menu.add(copyAction);
    menu.add(pasteAction);
    JMenuBar menuBar = new JMenuBar();
    menuBar.add(menu);
    return menuBar;
  }

  protected JComponent createCenterComponent() {
    if ( editor == null )
      editor = createEditor();
    return new JScrollPane(editor);
  }

  protected JTextComponent createEditor() {
    return new JTextArea();
  }

  public void loadText() {
    int response = fileChooser.showOpenDialog(this);
    if ( response == JFileChooser.APPROVE_OPTION ) {
      try {
        File f = fileChooser.getSelectedFile();
        Reader in = new FileReader(f);
        editor.read(in, null);
        setTitle(f.getName());
      }
      catch (Exception e) {
      }
    }
  }

  public void saveText() {
    int response = fileChooser.showSaveDialog(this);
    if ( response == JFileChooser.APPROVE_OPTION ) {
      try {
        File f = fileChooser.getSelectedFile();
        Writer out = new FileWriter(f);
        editor.write(out);
        setTitle(f.getName());
      }
      catch (Exception e) {
      }
    }
  }

  public static void main(String argv[]) {
    TextEditor t = new TextEditor();
  }
}
