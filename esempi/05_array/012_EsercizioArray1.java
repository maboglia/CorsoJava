
public class EsercizioArray1 {

    public static void main(String[] args) {
        //array di interi, zero-based

        int[] n = {1,2,3,5,5,6,7,8,9};

        int somma = 0;

        //ciclo per scorrere
        for(int i = 0; i < n.length; i++){
            System.out.println("La posizione numero  " + i +" vale : " + n[i]);
            somma = somma + n[i];

        }

            System.out.println("La somma dei valori dell'array è: " + somma);
            System.out.println("La media dei valori dell'array è: " + somma / n.length );

    }



}
