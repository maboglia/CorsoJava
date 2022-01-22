package w02.stringhe;

/**
 * Created by mauro on 15/06/16.
 */
public class E02_Stringhe1 {

    public static void main(String[] args) {

    String s1 = "Questa è una stringa!";
        System.out.println(s1);

    String s2 = new String("Ma anche questa è una stringa!!");
        System.out.println(s2);

    String s3 = "Aula: ";
        String s4 = "1B";

    String s5 = s3 + s4;
        System.out.println(s5);

    char[] caratteri = { 'c','i','a','o' };
        String s6 = new String(caratteri);
        System.out.println(s6);

    char[] caratteri2 = s6.toCharArray();
        for(char c : caratteri2){
            System.out.println(c);
        }


    }


}
