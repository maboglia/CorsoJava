package week2;

/**
 * Created by mauro on 13/06/16.
 */
public class Booleani {

    static boolean b3;

    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        boolean b4 = !b1;
        System.out.println("b4 vale: " + b4);

        int i1 = 0;
        boolean b5 = (i1 != 0);
        System.out.println(b5);

        String sBool = "true";
        boolean parsed = Boolean.parseBoolean(sBool);
        System.out.println(parsed);



    }



}
