package week2;

/**
 * Created by mauro on 13/06/16.
 */
public class MiaMath {

    public static void main(String[] args) {

        int intValue1 = 67;
        int intValue2 = 37;

        int risultato = intValue1 + intValue2;
        System.out.println(risultato);

        int risultato2 = intValue1 - intValue2;
        System.out.println(risultato2);

        int risultato3 = intValue1 * intValue2;
        System.out.println(risultato3);

        double risultato4 = (double) intValue1 / intValue2;
        System.out.println(risultato4);

//        double risultato5 = (double) intValue1 % intValue2;
//        System.out.println(risultato5);

        double doubleValue = -3.99999;
        long arrotondato = Math.round(doubleValue);
        System.out.println(arrotondato);

        double assoluto = Math.abs(doubleValue);
        arrotondato = Math.round(assoluto);
        System.out.println(assoluto);
        System.out.println(arrotondato);








    }



}
