# Esercitazione 13 – Gestione di un negozio di generi alimentari

Realizzare in Java il sistema software per la gestione di un negozio di generi alimentari.

Il sistema deve gestire un inventario di prodotti. Ogni prodotto è caratterizzato da:
- codice univoco;
- descrizione;
- prezzo lordo di vendita.

La classe principale di gestione deve permettere di:
- definire e ampliare l'inventario;
- aggiungere nuovi prodotti;
- attivare una promozione su un prodotto indicando una percentuale di sconto;
- disattivare la promozione;
- registrare i prodotti venduti;
- calcolare il totale lordo;
- calcolare il totale netto;
- calcolare l'importo dell'IVA;
- visualizzare l'elenco degli articoli acquistati in ordine alfabetico;
- chiudere la registrazione della vendita.

Per semplicità, si assuma che possa essere attivo un solo prodotto in promozione alla volta.

Se viene richiesto un prodotto inesistente durante la vendita, il sistema deve gestire il problema attraverso un'apposita eccezione o un meccanismo equivalente.

Definire classi separate per prodotto, articolo venduto, cassa e gestione complessiva del negozio.

Stabilire chiaramente nel programma l'aliquota IVA da utilizzare e applicarla correttamente nel calcolo del totale netto e delle tasse.

Prevedere un programma di test che dimostri il funzionamento delle principali operazioni.
