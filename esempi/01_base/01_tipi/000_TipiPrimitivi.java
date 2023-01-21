    public static void main(String[] args) {

        /* I tipi primitivi in Java sono 8 */

        // 4 tipi per rappresentare numeri interi
        byte b = 1;
        short sh = 1;
        int i = 1;
        long l = 1L;

        // 2 per rappresentare numeri con virgola
        float f = 1f;
        double d = 1d;

        // ultimi due tipi primitivi, non numerici
        char c = 'a'; // attenzione: uso gli apici singoli
        boolean bo = true; // solo due valori: true o false

        // stampo a video sono i tipi primitivi numerici
        System.out.println("Byte: " + b);
        System.out.println("Short: " + sh);
        System.out.println("Integer: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        
        // stampo a video i tipi primitivi NON numerici
        System.out.println(c);
        System.out.println(bo);
    }