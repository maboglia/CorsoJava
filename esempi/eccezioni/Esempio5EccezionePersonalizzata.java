package eccezioni;

/**
 * Created by mauro on 06/12/16.
 */
public class Esempio5EccezionePersonalizzata {


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
            System.out.println("bbbbbbbbbb");
        } finally{

            System.out.println("l'esempio funge da esempio");
        }
    }

    public static void test(int i) throws MiaEccezionePersonalizzata {

        System.out.println("ciao");
        if(i == 0) throw new MiaEccezionePersonalizzata();
    }

}
