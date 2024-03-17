# Esercizio MVC: Gestione di Prodotto e Carrello

Realizzate un'applicazione Java per la gestione di un carrello della spesa, seguendo il modello MVC (Model-View-Controller). L'applicazione dovrà consentire agli utenti di aggiungere prodotti al carrello, visualizzare il totale degli acquisti, il totale degli acquisti in promozione e altre informazioni pertinenti.

## Modello (Model)

La classe `Prodotto` rappresenterà un prodotto che può essere aggiunto al carrello. Avrà i seguenti attributi:

- `descrizione`: una stringa che rappresenta la descrizione del prodotto,
- `prezzo`: un numero in virgola mobile che indica il prezzo del prodotto,
- `inPromozione`: un booleano che indica se il prodotto è in promozione o meno.

La classe `Carrello` rappresenterà il carrello della spesa. Avrà i seguenti attributi:

- `cliente`: una stringa che rappresenta il nome del cliente che ha effettuato l'ordine,
- `prodottiOrdinati`: un elenco di oggetti `ProdottoQuantita`, ciascuno dei quali contiene un prodotto e la quantità ordinata.

La classe `ProdottoQuantita` rappresenterà una coppia di prodotto e quantità nel carrello. Avrà i seguenti attributi:

- `prodotto`: un riferimento a un oggetto `Prodotto`,
- `quantita`: un numero intero che rappresenta la quantità del prodotto nel carrello.

## Vista (View)

La vista sarà costituita da un'interfaccia utente che consente agli utenti di interagire con il sistema. In questo esercizio, utilizzeremo una semplice visualizzazione tramite console.

## Controllore (Controller)

Il controllore sarà responsabile di gestire le interazioni tra la vista e il modello. Riceverà gli input dell'utente dalla vista, elaborerà le richieste utilizzando il modello e restituirà i risultati alla vista.

## Metodi e Funzionalità

Le funzionalità dell'applicazione includeranno:

1. Aggiunta di un prodotto al carrello: gli utenti potranno aggiungere un prodotto al carrello specificando la descrizione, il prezzo e se è in promozione.
2. Calcolo del totale dell'ordine: gli utenti potranno visualizzare il totale dell'ordine, che sarà la somma dei prezzi di tutti i prodotti nel carrello.
3. Calcolo del totale degli acquisti in promozione: gli utenti potranno visualizzare il totale degli acquisti in promozione, che sarà la somma dei prezzi dei prodotti in promozione nel carrello.
4. Visualizzazione dei prodotti nel carrello: gli utenti potranno visualizzare l'elenco dei prodotti nel carrello, insieme alla quantità ordinata di ciascun prodotto.
5. Altre funzionalità a vostra scelta, come la rimozione di un prodotto dal carrello o la visualizzazione del numero totale di prodotti nel carrello.

Implementate l'applicazione seguendo il modello MVC, separando la logica di business (modello) dalla visualizzazione e dall'interazione dell'utente (vista e controllore). Utilizzate classi, metodi e attributi appropriati per garantire la modularità e la manutenibilità del codice.

## Esempio

Per implementare questo esercizio seguendo il modello MVC (Model-View-Controller), suddivideremo il codice in tre componenti:

### Modello (Model)

Il modello rappresenterà la logica di business dell'applicazione e includerà le classi `Prodotto` e `Carrello`.

```java
public class Prodotto {
    private String descrizione;
    private double prezzo;
    private boolean inPromozione;

    // Costruttore, getter e setter
}

public class Carrello {
    private String cliente;
    private ArrayList<ProdottoQuantita> prodottiOrdinati;

    // Costruttore, metodi per aggiungere prodotti, calcolare il totale, ecc.
}

public class ProdottoQuantita {
    private Prodotto prodotto;
    private int quantita;

    // Costruttore, getter e setter
}
```

### Vista (View)

La vista rappresenterà l'interfaccia utente e includerà il codice per visualizzare le informazioni all'utente. In un'applicazione Java, questo potrebbe essere implementato tramite console o interfaccia grafica.

### Controllore (Controller)

Il controllore gestirà le interazioni tra la vista e il modello. Si occupa di ricevere le richieste dell'utente dalla vista, elaborarle utilizzando il modello e restituire i risultati alla vista.

Nel nostro caso, il controllore includerà il metodo `main` per testare il funzionamento dell'applicazione.

```java
public class CarrelloController {
    public static void main(String[] args) {
        // Creazione di alcuni prodotti
        Prodotto p1 = new Prodotto("Prodotto1", 10.0, false);
        Prodotto p2 = new Prodotto("Prodotto2", 15.0, true);
        Prodotto p3 = new Prodotto("Prodotto3", 20.0, false);

        // Creazione di un carrello e aggiunta di prodotti
        Carrello carrello = new Carrello("Mario Rossi");
        carrello.aggiungiProdotto(p1, 2);  // Aggiunta di 2 pezzi di p1
        carrello.aggiungiProdotto(p2, 1);  // Aggiunta di 1 pezzo di p2
        carrello.aggiungiProdotto(p3, 3);  // Aggiunta di 3 pezzi di p3

        // Visualizzazione delle informazioni sul carrello
        System.out.println("Cliente: " + carrello.getCliente());
        System.out.println("Prodotti ordinati:");
        for (ProdottoQuantita pq : carrello.getProdottiOrdinati()) {
            Prodotto prodotto = pq.getProdotto();
            int quantita = pq.getQuantita();
            System.out.println("- " + prodotto.getDescrizione() + " (x" + quantita + ")");
        }
        System.out.println("Totale: " + carrello.totale());
        System.out.println("Totale promozione: " + carrello.totalePromozione());
        System.out.println("Numero totale di prodotti ordinati: " + carrello.numeroTotaleProdotti());
        System.out.println("Numero totale di diversi prodotti ordinati: " + carrello.prodottiOrdinati());
    }
}
```

In questo esempio, il `CarrelloController` funge da controllore e include il metodo `main` per testare l'applicazione. Esso crea alcuni oggetti `Prodotto` e un'istanza di `Carrello`, aggiunge alcuni prodotti al carrello e visualizza alcune informazioni sul carrello.
