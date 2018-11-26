package eccezioni;

/**
 * Created by mauro on 06/12/16.
 */
public class Esempio2LancioEccezione {

    public static void main(String[] args) {

        try {
            throw new Exception("Sono un'eccezione che hai lanciato a mano");
        } catch (Exception e) {
            System.out.println("Ho catturato l'eccezione:");
            System.out.println("Il messaggio è: " + e.getMessage());
            //e.printStackTrace();
        }


    }


}
