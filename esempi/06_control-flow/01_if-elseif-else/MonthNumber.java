package com.example.java;

public class MonthNumber {

    public static void main(String[] args) {

        int monthNumber = 13;

        if (monthNumber >= 1 && monthNumber <= 3) {
            System.out.println("1° trimestre");
        } else if (monthNumber >= 4 && monthNumber <= 6) {
            System.out.println("2° trimestre");
        } else if (monthNumber >= 7 && monthNumber <= 9) {
            System.out.println("3° trimestre");
        } else if (monthNumber >= 10 && monthNumber <= 12) {
            System.out.println("4° trimestre");
        } else {
            System.out.println("Mese non corrispondente!");
        }

    }

}
