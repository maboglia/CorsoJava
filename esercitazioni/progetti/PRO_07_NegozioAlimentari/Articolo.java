package progetti.negozioAlimentari;

/**
 * Created by mauro on 12/12/16.
 */
public class Articolo implements Comparable{

    private Prodotto prodotto;
    private int pezzi;
    private double prezzoFinale;

    public Articolo(Prodotto prodotto, int pezzi, double prezzoFinale) {
        this.prodotto = prodotto;
        this.pezzi = pezzi;
        this.prezzoFinale = prezzoFinale;
    }

    public String ottieniDescrizione(){
        return prodotto.getDesc();
    }
    public int ottieniPezzi(){
        return pezzi;
    }
    public double ottieniPrezzo(){
        return prezzoFinale;
    }


    @Override
    public int compareTo(Object o) {

        if( ! (o instanceof Articolo) )
            throw new IllegalArgumentException();

        Articolo art = (Articolo) o;

        return  this.prodotto.getDesc().compareTo(art.prodotto.getDesc());
    }
}
