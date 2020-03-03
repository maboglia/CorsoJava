package w02.stringhe;

/**
 * Created by mauro on 15/06/16.
 */
public class StringheCompara {

    public static void main(String[] args) {
        String s1 = "Ciao";
        String s2 = "Ciao";

        if (s1 == s2){
            System.out.println("stringhe uguali");
        }
        else{
            System.out.println("stringhe diverse");
        }

        String s3 = "ciao";
        if (s1 == s3){
            System.out.println("stringhe uguali");
        }
        else{
            System.out.println("stringhe diverse");
        }

        String p1 = "Hello ";
        String p2 = "World";
        String s4 = p1 + p2;
        String s5 = "Hello World";
        if (s4.equalsIgnoreCase(s5)){
            System.out.println("stringhe uguali");
        }
        else{
            System.out.println("stringhe diverse");
        }

        if (s4 == s5){
            System.out.println("stringhe uguali");
        }
        else{
            System.out.println("stringhe diverse");
        }



    }




}
