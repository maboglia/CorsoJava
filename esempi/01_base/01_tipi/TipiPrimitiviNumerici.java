public class TipiPrimitiviNumerici {

    public static void main(String[] args) {

        // ------------------------------
        // Tipi interi (numeri senza virgola)
        // ------------------------------

        // byte: occupa 8 bit (-128 a 127)
        byte b = 1;

        // short: occupa 16 bit (-32.768 a 32.767)
        short sh = 1;

        // int: occupa 32 bit (valore predefinito per i numeri interi)
        int i = 1;

        // long: occupa 64 bit (per numeri molto grandi)
        // per distinguerlo da int si aggiunge 'L' alla fine
        long l = 1L;

        // ------------------------------
        // Tipi floating point (numeri con la virgola)
        // ------------------------------

        // float: 32 bit, precisione singola
        // per distinguerlo da double si aggiunge 'f' alla fine
        float f = 1f;

        // double: 64 bit, precisione doppia (default per i numeri decimali)
        double d = 1d;

        // ------------------------------
        // Stampa dei valori
        // ------------------------------

        System.out.println("Byte: " + b);
        System.out.println("Short: " + sh);
        System.out.println("Int: " + i);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);

    }

}
