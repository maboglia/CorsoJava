package eccezioni;

/**
 * Created by mauro on 06/12/16.
 */
public class Esempio3MetodoLancia {

    public static void main(String[] args) {
        try {
            double risultato = dividi(10,0);
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("non posso eseguire");

        }
    }

    private static double dividi(int i, int i1) throws Exception{

        double c = i/i1;
        return c;
    }


}
