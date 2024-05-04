package eccezioni;

/**
 * Created by mauro on 06/12/16.
 */
public class EsempioArithmeticException {
    public static void main(String[] args) {

        try {
            int a = 5;
            int b = 0;
            int c = a / b;

            System.out.println(c);
        } catch (ArithmeticException eccezione){
            System.out.println("avrei dovuto fermarti prima di iniziare a programmare!!!");
        }




    }


}
