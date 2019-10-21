package week2;

import java.util.Scanner;

/**
 * Created by mauro on 15/06/16.
 */
public class StringBuilder {

    public static void main(String[] args) {

    String s1 = "Hello ";
    String s2 = "World";
    String s3 = s1 + s2 + "!";
        System.out.println(s3);

        java.lang.StringBuilder sb = new java.lang.StringBuilder("Hello");
        sb.append(" ").append("World").append("!");
        System.out.println(sb);

    if (s3.equals(sb))
        System.out.println("uguali");
        else
        System.out.println("diversi");


        Scanner scanner = new Scanner(System.in);
        System.out.println("scrivi qualcosa");
        String input = scanner.nextLine();
        System.out.println(input);

        sb.delete(0, sb.length()-2);

        for (int i = 0; i < 3; i++){
            System.out.println("..poi");
            input = scanner.nextLine();
            sb.append(input + " ");

        }
        System.out.println(sb);

    }




}
