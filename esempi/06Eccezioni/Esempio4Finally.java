package eccezioni;

/**
 * Created by mauro on 06/12/16.
 */
public class Esempio4Finally {

    public static void main(String[] args) {
        test();
    }

    private static void test() {

        try {
            System.out.println("blocco try esterno");

            try {
                System.out.println("blocco try interno");
                throw new Exception("CIAO dall'interno");
            }catch (ArithmeticException e){
                System.out.println("dentro CATCH interno");
            }finally {
                System.out.println("dentro FINALLY interno");
            }



        }catch (Exception e){
            System.out.println("blocco CATCH esterno");
        }finally {
            System.out.println("blocco FINALLY esterno");
        }



    }

}
