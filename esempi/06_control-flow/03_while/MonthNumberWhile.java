package com.example.java;

public class MonthNumberWhile {

    public static void main(String[] args) {

        String[] months = {"January", "February", "March",
                "April", "May", "June",
                "July", "August", "September",
                "October", "November", "December"};

        int counter = 0;

        while (counter < months.length) {
            System.out.println(months[counter]);
            counter++;
        }

        counter = 0; //resetto il counter

        do {
            System.out.println(months[counter]);
            counter++;
        } while (counter < months.length);

    }

}
