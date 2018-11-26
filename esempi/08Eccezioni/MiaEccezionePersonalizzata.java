package eccezioni;

/**
 * Created by mauro on 06/12/16.
 */
public class MiaEccezionePersonalizzata extends Exception {
    /**
     * Constructs a new exception with {@code null} as its detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     */
    public MiaEccezionePersonalizzata() {
        super("Mia eccezione");
    }

    public String dettagli(){
        System.out.println("***************");
        System.out.println("metodo dettagli");
        System.out.println("***************");
        return "Dettagli della mia eccezione";
    }
}
