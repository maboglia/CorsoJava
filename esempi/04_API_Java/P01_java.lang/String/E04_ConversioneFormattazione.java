package w02.stringhe;

import java.text.NumberFormat;

/**
 * Created by mauro on 15/06/16.
 */
public class E04_ConversioneFormattazione {

    public static void main(String[] args) {

        int valoreInt = 112;
        String fromInt = Integer.toString(valoreInt);

        System.out.println(fromInt);

        boolean vero = true;
        String fromBool = Boolean.toString(vero);
        System.out.println(fromBool);

        long valoreLong = 10_000_000;
        NumberFormat numFormatt = NumberFormat.getNumberInstance();

        String numeroFormattato = numFormatt.format(valoreLong);

        System.out.println(numeroFormattato);





    }

}
