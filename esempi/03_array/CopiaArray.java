import java.util.Arrays;

public class CopiaArray {

    public static void main(String[] args) {

        System.out.println("Array di primitivi");
        int[] ints = {9, 6, 3};
        Arrays.sort(ints);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }

        System.out.println("Array di stringhe");
        String[] colori = {"Rosso", "Verde", "Bianco"};
        Arrays.sort(colori);
        for (String colore : colori) {
            System.out.println(colore);
        }

        System.out.println("Stabilisco un dimensione iniziale");
        int[] arrayDaCopiare = new int[10];
        for (int i = 0; i < arrayDaCopiare.length; i++) {
            //popolo l'array con valori arbitrari
            arrayDaCopiare[i] = i * 100;
        }
        for (int value : arrayDaCopiare) {
            System.out.println(value);
        }

        System.out.println("Copio l'array");
        int[] arrayCopia = new int[5];
        System.arraycopy(arrayDaCopiare, 5, arrayCopia, 0, 5);
        for (int valore : arrayCopia) {
            System.out.println(valore);
        }
    }

}