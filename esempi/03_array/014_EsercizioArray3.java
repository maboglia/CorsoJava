import java.util.Scanner;

public class EsercizioArray3 {

    public static void main(String[] args) {


        //String s = "onorarono";

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci una stringa: ");

        String s = sc.next();

        char[] test = s.toCharArray();

//        char[] lettere = {
//                'a',
//                'n',
//                'n',
//                'a',
//        };

        boolean palindroma = true;

        int lunghezza = test.length;
        // indice per arrivare a metà array compreso
        int indiceMassimo = (int) Math.ceil(lunghezza / 2.0);

        for (int i = 0; i < indiceMassimo; i++) {
            char a = test[i];
            char b = test[lunghezza - 1 - i];

            // se non sono uguali
            if (a != b) {
                // dico che non è palindroma
                palindroma = false;
                // interrompo il ciclo
                break;
            }
        }

        if (palindroma) {
            System.out.println("Palindromo");
        } else {
            System.out.println("Non palindromo");
        }


    }
}
