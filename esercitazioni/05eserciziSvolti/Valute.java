package week2;

import java.math.BigDecimal;

/**
 * Created by mauro on 13/06/16.
 */
public class Valute {

    public static void main(String[] args) {

        double valore = .012;

        double sommaValori = valore + valore + valore;

        System.out.println(sommaValori);

        String strValue = Double.toString(valore);
        System.out.println(strValue);

        BigDecimal bigValue = new BigDecimal(strValue);

        BigDecimal superSomma = bigValue.add(bigValue).add(bigValue);

        System.out.println(superSomma);



    }

}
