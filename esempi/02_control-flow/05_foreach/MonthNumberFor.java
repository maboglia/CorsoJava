package com.example.java;

public class MonthNumberFor {

    public static void main(String[] args) {

        String[] months = {"January", "February", "March",
                "April", "May", "June",
                "July", "August", "September",
                "October", "November", "December"};

       for (int i = 0; i < months.length; i++) {
           System.out.println(months[i]);
       }

       for (int i = months.length-1; i >= 0; i--) {
           System.out.println(months[i]);
       }

       for (String month : months) {
           System.out.println(month);
       }

    }

}
