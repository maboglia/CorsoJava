package progetti.negozioAlimentari;

import java.util.*;

/**
 * Created by mauro on 12/12/16.
 */
public class CassaNegozio implements Cassa {

    private Map prodotti = new HashMap<>();

    private List fattura = new LinkedList<>();

    private double totaleLordo;
    private String codicePromozione;
    private int scontoPromozione;

    public void aggiungiProdotto(String codice, String desc, double prezzo){
        Prodotto p = new Prodotto(codice, desc, prezzo);
        prodotti.put(codice, p);
    }

    public void promozione(String codice, int sconto){
        codicePromozione = codice;
        scontoPromozione = sconto;
    }


    @Override
    public void leggi(String codice, int pezzi) throws ProdottoInesistente {
        Prodotto p = (Prodotto) prodotti.get(codice);
        if(p == null) throw new ProdottoInesistente();

        double prezzo = pezzi * p.getPrezzo();

        if(inPromozione(p))
            prezzo *= ( 100 - scontoPromozione ) / 100.0;

        fattura.add(new Articolo(p, pezzi, prezzo));
        totaleLordo += prezzo;

    }



    private boolean inPromozione(Prodotto p) {
        return p.getCodice().equals(codicePromozione);
    }

    @Override
    public void stampa() {

        /**
         * @todo migliorare lo scontrino
         * */

        /*
        System.out.println("stampa dello scontrino");
        for (Object o : fattura){
            Prodotto p = (Prodotto) o;

            System.out.print(p.getDesc()+"\t\t"+p.getPrezzo());

        }
        */

        Collections.sort(fattura);

        //System.out.println(fattura);

        for (Object o : fattura){
            Articolo p = (Articolo) o;

            System.out.println(
                    p.ottieniDescrizione()+
                    "\t\t"+p.ottieniPrezzo()+
                    "\t\t"+p.ottieniPezzi()
            );

        }




    }

    @Override
    public void chiude() {

        fattura = new LinkedList<>();
        totaleLordo = 0;


    }

    @Override
    public double totale() {
        return totaleLordo;
    }

    @Override
    public double netto() {
        return totaleLordo / (1 + IVA);
    }

    @Override
    public double tasse() {
        return totaleLordo / (1 + IVA) * IVA;
    }

    /*
    devo implementare i metodi
    leggi, stampa, chiude, totale, netto, tasse
    */


}
