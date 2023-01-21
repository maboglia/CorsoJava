import java.math.BigDecimal;

public class PrecisioneDecimale {

    public static void main(String[] args) {

        double valore = .012;

        double primitiviSomma = valore + valore + valore;

        System.out.println("Somma di primitivi: " + primitiviSomma);

        String stringaValore = Double.toString(valore);
        System.out.println("stringaValore: " + stringaValore);
        BigDecimal bigDecimalValore = new BigDecimal(stringaValore);

        BigDecimal bigSomma = bigDecimalValore.add(bigDecimalValore).add(bigDecimalValore);

        System.out.println("Somma di BigDecimal: " + bigSomma.toString());

    }

}