package com.example;

public class AssertTest  {

  public static void main(String args[]) {
    byte b = 0;
    for ( int i = 0; i <= 64; i++) {
      assert i >= 0;
      b = (byte)(i * 2);
      assert b >= 0 : "Valore inaspettato: b = " + b;
      System.out.println("b = " + b);
    }
  }
}