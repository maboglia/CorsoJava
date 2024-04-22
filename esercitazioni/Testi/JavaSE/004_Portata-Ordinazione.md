# Gestione di Portate e Ordinazioni

## Portata

La classe `Portata` rappresenta una portata ordinabile in un ristorante. Ogni portata è caratterizzata da:

- `descrizione`: una stringa che descrive la portata
- `prezzo`: un valore double che rappresenta il prezzo della portata
- `bevanda`: un booleano che indica se la portata è una bevanda

La classe `Portata` include i seguenti metodi:

- `isBevanda()`: restituisce true se la portata è una bevanda, false altrimenti
- `getPrezzo()`: restituisce il prezzo della portata
- `setPrezzo(double prezzo)`: imposta il prezzo della portata con il valore specificato

## Ordinazione

La classe `Ordinazione` rappresenta un ordine effettuato da un cliente in un ristorante. Ogni ordinazione è caratterizzata da:

- `cliente`: una stringa che indica il nome del cliente che ha effettuato l'ordinazione
- `portateOrdinate`: un array (inizialmente vuoto) di portate ordinate, ciascuna associata a una quantità ordinata

La classe `Ordinazione` include i seguenti metodi:

- `aggiungiPortata(Portata portata, int quantita)`: aggiunge una portata all'ordinazione con la quantità specificata
- `conto()`: restituisce il totale del conto dell'ordinazione
- `contoBevande()`: restituisce il totale del conto delle bevande contenute nell'ordinazione
- `numeroTotalePortate()`: restituisce la somma delle quantità ordinate di tutte le portate
- `portateOrdinate()`: restituisce il numero totale di diverse portate ordinate


## Controller

Il controller sarà responsabile di gestire le richieste degli utenti e di coordinare il flusso di dati tra il modello e la vista. Le principali funzionalità del controller includeranno:

- Aggiunta di una nuova portata al modello
- Aggiunta di una nuova ordinazione al modello
- Calcolo del totale del conto e del conto delle bevande per un'ordinazione
- Recupero delle informazioni sulle portate ordinate e il numero totale di portate

Implementate la web application utilizzando un framework MVC come Spring MVC (per il controller), HTML/CSS (per la vista) e Java per il modello, con opportuna gestione delle richieste HTTP e delle operazioni di persistenza dei dati. Assicuratevi che l'applicazione sia intuitiva e facile da usare per gli utenti, consentendo loro di gestire le portate e le ordinazioni in modo efficiente e piacevole.

## Main method

```java
public class Main {
    public static void main(String[] args) {
        // Creazione di alcune portate
        Portata pasta = new Portata("Pasta al pomodoro", 8.5, false);
        Portata birra = new Portata("Birra", 5.0, true);
        Portata gelato = new Portata("Gelato alla vaniglia", 4.0, false);

        // Creazione di un'ordinazione
        Ordinazione ordinazione = new Ordinazione("Mario Rossi");
        ordinazione.aggiungiPortata(pasta, 2);  // Aggiunta di 2 porzioni di pasta
        ordinazione.aggiungiPortata(birra, 1);  // Aggiunta di 1 birra
        ordinazione.aggiungiPortata(gelato, 3); // Aggiunta di 3 gelati

        // Visualizzazione delle informazioni sull'ordinazione
        System.out.println("Ordinazione di: " + ordinazione.getCliente());
        System.out.println("Portate ordinate:");
        for (Portata portata : ordinazione.getPortateOrdinate()) {
            System.out.println("- " + portata.getDescrizione() + " (x" + ordinazione.getQuantitaPortata(portata) + ")");
        }
        System.out.println("Totale conto: " + ordinazione.conto());
        System.out.println("Totale conto bevande: " + ordinazione.contoBevande());
        System.out.println("Numero totale di portate ordinate: " + ordinazione.numeroTotalePortate());
        System.out.println("Numero totale di diverse portate ordinate: " + ordinazione.portateOrdinate());
    }
}
```

In questo metodo `main`, vengono creati alcuni oggetti `Portata` e un'istanza di `Ordinazione`. Successivamente, vengono aggiunte alcune portate all'ordinazione e visualizzate alcune informazioni sull'ordinazione, come il cliente, le portate ordinate, il totale del conto e altro ancora. Questo metodo main può essere utilizzato per testare l'applicazione.

---

## Web app

La vista sarà implementata utilizzando tecnologie web come HTML, CSS e JavaScript per fornire un'interfaccia utente intuitiva e interattiva. La vista includerà:

- Form per inserire una nuova portata con descrizione, prezzo e indicazione se è una bevanda
- Form per inserire una nuova ordinazione con il nome del cliente e le portate ordinate con le rispettive quantità
- Tabelle per visualizzare le portate ordinate e i relativi dettagli (descrizione, prezzo, quantità)
- Campi per visualizzare il totale del conto dell'ordinazione e il totale del conto delle bevande
