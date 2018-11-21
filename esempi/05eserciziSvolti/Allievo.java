package week3;

/**
 * Created by mauro on 20/06/16.
 */
public class Allievo {

    public String nome;
    public String cognome;
    public String indirizzo;
    public int eta;
    public boolean isFemmina;
    public boolean isMaschio;

    public Allievo(String cognome, String nome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public Allievo() {
    }

    public boolean isMaschio() {
        return isMaschio;
    }

    public void setMaschio(boolean maschio) {
        isMaschio = maschio;
    }

    public boolean isFemmina() {
        return isFemmina;
    }

    public void setFemmina(boolean femmina) {
        isFemmina = femmina;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }
    public String getNomeCognome() {
        return "Sig. " + nome + " " + cognome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
