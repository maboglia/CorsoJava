# Esercitazione: Gestionale Ordini Azienda

## Descrizione

In questa esercitazione, svilupperemo un'applicazione Java per gestire gli ordini di un'azienda. L'applicazione consentirà agli utenti di creare nuovi ordini, visualizzare gli ordini esistenti e calcolare il totale degli ordini.

## Requisiti

1. Deve essere creata una classe chiamata `Prodotto` con i seguenti attributi:
   - `codice`: il codice univoco del prodotto (una stringa).
   - `descrizione`: una breve descrizione del prodotto (una stringa).
   - `prezzoUnitario`: il prezzo unitario del prodotto (un valore decimale).

2. Deve essere creata una classe chiamata `Ordine` con i seguenti attributi:
   - `numeroOrdine`: il numero univoco dell'ordine (un numero intero).
   - `cliente`: il nome del cliente che ha effettuato l'ordine (una stringa).
   - `dataOrdine`: la data in cui è stato effettuato l'ordine (una stringa nel formato "gg/mm/aaaa").
   - `prodotti`: un elenco di prodotti inclusi nell'ordine. Ogni prodotto deve essere associato a una quantità.

3. La classe `Ordine` dovrà avere un metodo per calcolare il totale dell'ordine sommando i prezzi dei prodotti.

4. Deve essere creata una classe chiamata `GestionaleOrdini` che gestisce una lista di ordini. Questa classe dovrebbe avere i seguenti metodi:
   - `public void aggiungiOrdine(Ordine ordine)`: un metodo per aggiungere un nuovo ordine alla lista.
   - `public void visualizzaOrdini()`: un metodo per visualizzare le informazioni su tutti gli ordini.
   - `public double calcolaTotaleOrdini()`: un metodo per calcolare il totale di tutti gli ordini.

5. Nella funzione `main`, crea un'istanza di `GestionaleOrdini` e aggiungi almeno tre ordini con informazioni iniziali (numero ordine, cliente, data ordine e prodotti con quantità). Quindi, visualizza le informazioni sugli ordini e il totale degli ordini.

## Esempio

Ecco un esempio di output atteso dell'applicazione:

```
Ordine 1: Numero Ordine: 101, Cliente: John Doe, Data Ordine: 05/10/2023
   - Prodotto 1: Codice: P001, Descrizione: Computer Portatile, Prezzo Unitario: 799.99 €, Quantità: 2
   - Prodotto 2: Codice: P002, Descrizione: Smartphone, Prezzo Unitario: 399.99 €, Quantità: 3

Ordine 2: Numero Ordine: 102, Cliente: Jane Smith, Data Ordine: 06/10/2023
   - Prodotto 1: Codice: P003, Descrizione: Stampante, Prezzo Unitario: 149.99 €, Quantità: 1

Ordine 3: Numero Ordine: 103, Cliente: Bob Johnson, Data Ordine: 06/10/2023
   - Prodotto 1: Codice: P004, Descrizione: Tastiera, Prezzo Unitario: 49.99 €, Quantità: 4
   - Prodotto 2: Codice: P005, Descrizione: Mouse, Prezzo Unitario: 19.99 €, Quantità: 5

Totale Ordini: 2849.89 €
```

## Suggerimenti

- Utilizza liste (ad esempio `ArrayList`) per gestire l'elenco dei prodotti inclusi in ciascun ordine.
- Usa cicli e formattazione per visualizzare le informazioni sugli ordini in modo chiaro.
- Calcola il totale di ciascun ordine sommando i prezzi dei prodotti e il totale di tutti gli ordini sommando i totali individuali.

## Consegna

Concludi l'esercizio scrivendo il codice sorgente completo per le classi `Prodotto`, `Ordine` e `GestionaleOrdini`, e includendo uno screenshot o un file di testo con l'output ottenuto durante il test dell'applicazione. Assicurati che il codice sia ben commentato e formattato in modo leggibile.
