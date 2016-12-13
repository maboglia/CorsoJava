package progetti.negozioAlimentari;

/**
 * Created by mauro on 12/12/16.
 */
public class ProdottoInesistente extends Exception {

    /**
     * Constructs a new exception with the specified detail message.  The
     * cause is not initialized, and may subsequently be initialized by
     * a call to {@link #initCause}.
     *      later retrieval by the {@link #getMessage()} method.
     */
    public ProdottoInesistente() {
        super("Spiacenti, il prodotto è inesistente!");
    }
}
