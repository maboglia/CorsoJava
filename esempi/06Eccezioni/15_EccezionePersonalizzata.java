package eccezioni;

/**
 * Created by mauro on 06/12/16.
 */
public class EccezionePersonalizzata {


    public static void main(String[] args) {
        try {
            //non lancia eccezione
            test(1);
            //lancia eccezione
            test(0);
        } catch (MiaEccezionePersonalizzata e) {
            String gm = e.getMessage();
            String dettagli = e.dettagli();
            System.out.println(gm);
            System.out.println(dettagli);
        } catch (Exception e){
            System.out.println("si è verificata un'eccezione");
        } finally{

            System.out.println("questo codice viene eseguito in ogni caso");
        }
    }

    public static void test(int i) throws MiaEccezionePersonalizzata {

        System.out.println("ciao");
        if(i == 0) throw new MiaEccezionePersonalizzata();
    }

}
