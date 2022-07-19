public class Caratteri {

    public static void main(String[] args) {

        char c1 = '1';
        char c2 = '2';
        char c3 = '3';

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        //accetta caratteri unicode, devo prependere \u
        char dollaro = '\u0024';
        System.out.println(dollaro);

        char a1 = 'a';
        char a2 = 'b';
        char a3 = 'c';

        System.out.println(Character.toUpperCase(a1));
        System.out.println(Character.toUpperCase(a2));
        System.out.println(Character.toUpperCase(a3));



    }
}
