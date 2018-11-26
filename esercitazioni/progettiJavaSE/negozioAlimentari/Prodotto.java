package progetti.negozioAlimentari;

/**
 * Created by mauro on 12/12/16.
 */
public class Prodotto {

    private String codice;
    private String desc;
    private double prezzo;

    public Prodotto(String codice, String desc, double prezzo) {
        this.codice = codice;
        this.desc = desc;
        this.prezzo = prezzo;
    }

    public String getCodice() {
        return codice;
    }

    public String getDesc() {
        return desc;
    }

    public double getPrezzo() {
        return prezzo;
    }
}
