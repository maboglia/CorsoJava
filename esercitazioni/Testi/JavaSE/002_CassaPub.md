# Cassa pub

Realizziamo un programma per gestire una cassa di un pub che permetta di registrare scontrini, consumazioni, camerieri e clienti, e fornisca funzionalità statistiche.

### Entità del sistema

1. **Scontrino**: Rappresenta lo scontrino emesso per una transazione. Ha una data, una lista di consumazioni, il nome e cognome del cameriere responsabile e un ID generato dal programma.

2. **Consumazione**: Rappresenta un elemento venduto nello scontrino. Ha un nome, una quantità e un prezzo unitario.

3. **Cameriere**: Rappresenta il personale addetto al servizio ai tavoli. Ha nome e cognome.

4. **Cliente**: Rappresenta il cliente che effettua l'acquisto. Ha nome, cognome e una lettera che indica il sesso.

### Funzionalità

1. **Registrazione degli scontrini**: Permette di registrare gli scontrini emessi, specificando la data, le consumazioni vendute, il nome e cognome del cameriere. L'ID dello scontrino viene generato dal programma e non è modificabile.

2. **Statistiche finanziarie**:
   - Visualizza l'incasso medio giornaliero.
   - Visualizza il massimo incasso settimanale, dato il primo giorno della settimana. Mostra il giorno con l'incasso massimo.
   - Visualizza il minimo incasso settimanale.

3. **Statistiche sui camerieri**:
   - Visualizza il miglior cameriere della settimana, dato il primo giorno della settimana. Mostra il cameriere che ha battuto più scontrini.
   - Visualizza il peggior cameriere della settimana.

4. **Statistiche sui clienti**:
   - Visualizza il miglior cliente, colui che ha speso di più.

5. **Statistiche di genere**:
   - Visualizza il rapporto maschi/femmine giornaliero, dato un giorno. Mostra il rapporto maschi/femmine in quel giorno.

6. **Statistiche sulle consumazioni**:
   - Visualizza la consumazione più venduta.
   - Visualizza la consumazione meno venduta.

Questo programma permette di gestire efficacemente le transazioni del pub e di ottenere utili statistiche per migliorare il servizio e l'organizzazione.

## Esempio

Per implementare la soluzione proposta, possiamo procedere come segue:

1. Definire le classi Java per le entità `Scontrino`, `Consumazione`, `Cameriere` e `Cliente`, con i relativi attributi e metodi getter/setter.
2. Creare una classe per la gestione della cassa del pub, che includa i metodi per registrare gli scontrini, calcolare le statistiche finanziarie, sui camerieri, sui clienti, sul genere e sulle consumazioni.
3. Implementare i metodi richiesti per ciascuna funzionalità, utilizzando strutture dati appropriate (ad esempio, liste per memorizzare gli scontrini, consumazioni, camerieri e clienti).
4. Utilizzare un approccio orientato agli oggetti per gestire le operazioni e calcolare le statistiche richieste.
5. Implementare un'interfaccia utente per interagire con il programma, ad esempio attraverso un menu testuale o una GUI, per consentire all'utente di selezionare le varie opzioni e visualizzare i risultati.

Ecco un possibile esempio di codice Java per iniziare l'implementazione:

```java
// Definizione delle classi delle entità
class Scontrino {
    private int id;
    private Date data;
    private List<Consumazione> consumazioni;
    private String nomeCameriere;
    // Metodi getter/setter e costruttore
}

class Consumazione {
    private String nome;
    private int quantita;
    private double prezzoUnitario;
    // Metodi getter/setter e costruttore
}

class Cameriere {
    private String nome;
    private String cognome;
    // Metodi getter/setter e costruttore
}

class Cliente {
    private String nome;
    private String cognome;
    private char sesso;
    // Metodi getter/setter e costruttore
}

// Classe per la gestione della cassa del pub
public class CassaPub {
    private List<Scontrino> scontrini;
    private List<Cameriere> camerieri;
    private List<Cliente> clienti;

    // Metodi per registrare gli scontrini, calcolare le statistiche, ecc.
    public void registraScontrino(Scontrino scontrino) {
        // Implementazione
    }

    public double calcolaIncassoMedioGiornaliero() {
        // Implementazione
    }

    // Altri metodi per le statistiche sui camerieri, sui clienti, sul genere e sulle consumazioni
}

// Classe per l'interfaccia utente
public class Main {
    public static void main(String[] args) {
        // Implementazione dell'interfaccia utente
    }
}
```

Questa è solo una bozza di implementazione e può essere estesa e migliorata in base alle specifiche esatte e ai requisiti aggiuntivi del progetto.
