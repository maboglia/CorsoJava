package week2;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by mauro on 15/06/16.
 */
public class FormattaNumeri {

    public static void main(String[] args) {

        double valoreDouble = 1_936.27;

        Locale local = new Locale("it", "IT");

        NumberFormat numF = NumberFormat.getNumberInstance(local);
        System.out.println("numero: " + numF.format(valoreDouble));

        NumberFormat valF = NumberFormat.getCurrencyInstance(local);
        System.out.println("valuta: " + valF.format(valoreDouble));

        NumberFormat intF = NumberFormat.getIntegerInstance(local);
        System.out.println("intero: " + intF.format(valoreDouble));





    }


}
