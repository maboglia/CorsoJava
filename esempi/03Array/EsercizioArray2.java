package week2;

public class EsercizioArray2 {

    public static void main(String[] args) {
        //array di interi, zero-based

        String[] nomi = {
                "Mele",
                "Pere",
                "Banane"

        };

        //ciclo per scorrere
        for(int i = 0; i < nomi.length; i++){
            System.out.println("La frutta numero  " + i +" è : " + nomi[i]);

        }
    }
}
