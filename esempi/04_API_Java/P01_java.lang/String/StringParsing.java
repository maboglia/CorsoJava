package w02.stringhe;

/**
 * Created by mauro on 15/06/16.
 */
public class StringParsing {

    public static void main(String[] args) {

        String s1 = "Benvenuti al corso Java";
        System.out.println("lunghezza della stringa: " + s1.length());

        int pos = s1.indexOf("Java");
        System.out.println("La posizione della parola è: " + pos);

        String sub = s1.substring(13);
        System.out.println(sub);

        String s2="       Benvenuti al corso Java!           ";
        System.out.println("Lunghezza della stringa:"+s2.length());

        String s3 = s2.trim();
        System.out.println(s3);
        System.out.println(s3.length());





    }



}
