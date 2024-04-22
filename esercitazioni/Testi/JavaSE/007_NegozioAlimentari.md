# Esercitazione: Gestione Negozio Alimentari

Benvenuti all'esercitazione di gestione di un negozio di generi alimentari. In questa esercitazione, svilupperemo un sistema software per gestire l'inventario dei prodotti, applicare sconti promozionali e registrare le vendite.

## Gli inventari

Iniziamo definendo la classe `CassaNegozio`, che conterrà tutte le funzionalità del nostro sistema. Con questa classe, saremo in grado di definire l'inventario dei prodotti e aggiungere nuovi prodotti.

Un prodotto è caratterizzato da un codice univoco, una descrizione e un prezzo lordo di vendita. Ecco un esempio di alcuni prodotti che potremmo avere nel nostro negozio:

| Codice | Descrizione         | Prezzo |
| ------ | ------------------- | ------ |
| C00001 | Pasta Zarilla       | 0.7    |
| C00002 | Latte GattoRosso    | 1.65   |
| C00003 | Caffe' Latazza      | 2.5    |
| C00004 | Caffe' Billy        | 2.0    |
| C00005 | Biscotti Cioccolato | 2.0    |
| C00006 | Vino Rosso          | 2.0    |

### Gli sconti

Possiamo stabilire uno sconto promozionale per un particolare prodotto. Per attivare la promozione, utilizziamo il metodo `promozione()`, specificando il codice del prodotto e la percentuale di sconto da applicare.

### I prodotti venduti

Ogni volta che viene letto il codice di un prodotto, la cassa accede al listino dei prodotti per recuperarne il prezzo e la descrizione. 

Il metodo `leggi()` restituisce informazioni sul prodotto acquistato. 

Possiamo ottenere l'importo totale lordo delle tasse attraverso il metodo `totale()`. 

Inoltre, è possibile ottenere l'importo totale netto e l'ammontare dell'IVA attraverso i metodi `netto()` e `tasse()`. 

Il metodo `stampa()` consente di visualizzare l'elenco degli articoli venduti, ordinati lessicograficamente. 

Infine, il metodo `chiude()` conclude la registrazione dei prodotti venduti.

Con questa base, possiamo iniziare a implementare il nostro sistema per gestire il negozio alimentari. Buon lavoro!

## Esempio

Ecco un esempio di soluzione implementata in Java per gestire il negozio alimentari:

```java
import java.util.*;

class Prodotto {
    private String codice;
    private String descrizione;
    private double prezzoLordo;

    public Prodotto(String codice, String descrizione, double prezzoLordo) {
        this.codice = codice;
        this.descrizione = descrizione;
        this.prezzoLordo = prezzoLordo;
    }

    public String getCodice() {
        return codice;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public double getPrezzoLordo() {
        return prezzoLordo;
    }
}

class CassaNegozio {
    private List<Prodotto> inventario;
    private Map<String, Integer> sconti;
    private List<Prodotto> prodottiVenduti;

    public CassaNegozio() {
        inventario = new ArrayList<>();
        sconti = new HashMap<>();
        prodottiVenduti = new ArrayList<>();
    }

    public void aggiungiProdotto(Prodotto prodotto) {
        inventario.add(prodotto);
    }

    public void promozione(String codiceProdotto, int scontoPercentuale) {
        sconti.put(codiceProdotto, scontoPercentuale);
    }

    public double leggi(String codiceProdotto) {
        for (Prodotto prodotto : inventario) {
            if (prodotto.getCodice().equals(codiceProdotto)) {
                prodottiVenduti.add(prodotto);
                return prodotto.getPrezzoLordo();
            }
        }
        return 0.0; // Prodotto non trovato
    }

    public double totale() {
        double totaleLordo = 0.0;
        for (Prodotto prodotto : prodottiVenduti) {
            totaleLordo += prodotto.getPrezzoLordo();
        }
        return totaleLordo;
    }

    public double netto() {
        return totale() * (1 - tasse());
    }

    public double tasse() {
        // Assumiamo un'IVA del 22%
        return 0.22;
    }

    public void stampa() {
        prodottiVenduti.sort(Comparator.comparing(Prodotto::getDescrizione));
        for (Prodotto prodotto : prodottiVenduti) {
            System.out.println(prodotto.getCodice() + " - " + prodotto.getDescrizione());
        }
    }

    public void chiude() {
        prodottiVenduti.clear();
    }
}

public class Main {
    public static void main(String[] args) {
        CassaNegozio cassa = new CassaNegozio();

        // Aggiungiamo alcuni prodotti all'inventario
        cassa.aggiungiProdotto(new Prodotto("C00001", "Pasta Barilla", 0.7));
        cassa.aggiungiProdotto(new Prodotto("C00002", "Latte TappoRosso", 1.65));
        cassa.aggiungiProdotto(new Prodotto("C00003", "Caffe' Lavazza", 2.5));

        // Applichiamo uno sconto promozionale sul Caffe' Lavazza
        cassa.promozione("C00003", 10);

        // Simuliamo una vendita di alcuni prodotti
        cassa.leggi("C00001");
        cassa.leggi("C00002");
        cassa.leggi("C00003");

        // Stampiamo l'importo totale lordo e netto
        System.out.println("Totale lordo: " + cassa.totale());
        System.out.println("Totale netto: " + cassa.netto());

        // Stampiamo gli articoli venduti
        cassa.stampa();

        // Chiudiamo la vendita
        cassa.chiude();
    }
}
```

Questo esempio implementa la classe `Prodotto` per rappresentare i prodotti nel negozio, la classe `CassaNegozio` per gestire le operazioni di vendita e la classe `Main` per eseguire una simulazione di vendita nel negozio alimentari.
