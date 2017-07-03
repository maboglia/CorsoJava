package esempi.week2;

/**
 * Created by mauro on 13/06/16.
 */
public class Caratteri {

    public static void main(String[] args) {

        char c1 = '1';
        char c2 = '2';
        char c3 = '3';

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        char dollaro = '\u00AE';
        System.out.println(dollaro);

        char a1 = 'a';
        char a2 = 'b';
        char a3 = 'c';

        System.out.println(Character.valueOf(a1));
        System.out.println(Character.toUpperCase(a2));
        System.out.println(Character.toUpperCase(a3));

        

    }
}
