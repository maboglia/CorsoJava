package progetti.negozioAlimentari;

/**
 * Created by mauro on 12/12/16.
 */
public interface Cassa {

    //il seguente attributo è per definizione
    //public, static, final
    //attualmente il livello di tassazione è
    double IVA = 0.22;

    //i metodi di un'interfaccia sono
    // public e abstract

    void leggi(String codice, int pezzi)
            throws ProdottoInesistente;
    void stampa();
    void chiude();
    double totale();
    double netto();
    double tasse();

}
