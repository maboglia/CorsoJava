package week2;


public class ConvertiNumeri {

    public static void main(String[] args) {


    int valoreInt1 = 32770;
    int valoreInt2 = valoreInt1;

        System.out.println("il 2° valore è: " + valoreInt2);

        //long è più grande di int
    long valoreLong1 = valoreInt1;
        System.out.println("il valore long è: "+valoreLong1);

        //short è più piccolo di int, occore un cast
        //System.out.println(Short.MAX_VALUE);
    short valoreShort = (short) valoreInt1;

        System.out.println(valoreShort);


    int valoreInt3 = 1024;
        byte valoreByte = (byte) valoreInt3;
        System.out.println(valoreByte);


    double valoreDouble = 3.999999d;
        int valoreInt4 = (int) valoreDouble;
        System.out.println(valoreInt4);

    }


}
