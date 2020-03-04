

public class Caratteri {

    public static void main(String[] args) {

        char c1 = '1';
        char c2 = '2';
        char c3 = '3';
        System.out.println("Carattere 1: " + c1);
        System.out.println("Carattere 2: " + c2);
        System.out.println("Carattere 3: " + c3);

        char dollaro = '\u0024';
        System.out.println("Valuta: " + dollaro);

        char a1 = 'a';
        char a2 = 'b';
        char a3 = 'c';
        //uso la classe wrapper e i suoi metodi
        System.out.print(Character.toUpperCase(a1));
        System.out.print(Character.toUpperCase(a2));
        System.out.println(Character.toUpperCase(a3));

    }

}
