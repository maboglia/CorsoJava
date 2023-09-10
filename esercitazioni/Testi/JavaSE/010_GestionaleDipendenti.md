# Esercitazione: Gestione di un Conto Corrente Bancario

## Descrizione

In questa esercitazione, svilupperemo un'applicazione Java per la gestione di un conto corrente bancario. L'applicazione consentirà agli utenti di effettuare operazioni bancarie di base, come depositi e prelievi, e visualizzare il saldo attuale del conto.

## Requisiti

1. Deve essere creata una classe chiamata `ContoCorrente` con i seguenti attributi:
   - `nomeTitolare`: il nome del titolare del conto (una stringa).
   - `numeroConto`: il numero del conto corrente (una stringa).
   - `saldo`: il saldo attuale del conto corrente (un valore decimale).

2. La classe `ContoCorrente` dovrà avere i seguenti metodi:
   - `public ContoCorrente(String nomeTitolare, String numeroConto, double saldoIniziale)`: un costruttore che inizializza gli attributi del conto corrente.
   - `public void deposito(double importo)`: un metodo per effettuare un deposito nell'account.
   - `public void prelievo(double importo)`: un metodo per effettuare un prelievo dall'account.
   - `public void stampaSaldo()`: un metodo per stampare il saldo attuale dell'account.

3. La classe `ContoCorrente` dovrebbe gestire correttamente i casi in cui l'importo del deposito o del prelievo è negativo e dovrebbe impedire il prelievo di fondi superiori al saldo disponibile.

4. Nella funzione `main`, crea un'istanza di `ContoCorrente` con alcune informazioni iniziali (ad esempio, nome del titolare, numero del conto e saldo iniziale). Quindi, esegui alcune operazioni di deposito e prelievo per testare la classe `ContoCorrente`. Alla fine di ogni operazione, stampa il saldo corrente.

## Esempio

Ecco un esempio di output atteso dell'applicazione:

```
Saldo attuale del conto corrente (12345): 1000.0
Deposito di 500.0 effettuato con successo.
Saldo attuale del conto corrente (12345): 1500.0
Prelievo di 200.0 effettuato con successo.
Saldo attuale del conto corrente (12345): 1300.0
Fondi insufficienti o importo non valido per il prelievo.
```

## Suggerimenti

- Utilizza condizioni `if` per verificare le restrizioni sugli importi di deposito e prelievo.
- Utilizza variabili di istanza per mantenere lo stato del conto corrente.
- Ricorda di inizializzare correttamente l'istanza di `ContoCorrente` nella funzione `main`.

## Consegna

Concludi l'esercizio scrivendo il codice sorgente completo per la classe `ContoCorrente` e includendo uno screenshot o un file di testo con l'output ottenuto durante il test dell'applicazione. Assicurati che il codice sia ben commentato e formattato in modo leggibile.

