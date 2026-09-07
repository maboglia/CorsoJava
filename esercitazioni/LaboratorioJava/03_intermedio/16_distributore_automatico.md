# Esercitazione 16 – Distributore automatico

Realizzare in Java un sistema per la gestione di un distributore automatico di bevande.

### Bevande

Ogni bevanda è caratterizzata da:
- nome univoco;
- prezzo di vendita.

Il sistema deve permettere all'amministratore di aggiungere nuove bevande e di ottenere il prezzo di una bevanda a partire dal nome.

### Schede prepagate

Ogni scheda è caratterizzata da:
- identificatore intero univoco;
- credito disponibile.

Il sistema deve permettere di:
- ricaricare una scheda;
- creare automaticamente una nuova scheda se l'identificatore non esiste;
- verificare il credito disponibile.

### Colonne

Il distributore è composto da 4 colonne. Ogni colonna contiene un solo tipo di bevanda e una quantità di lattine.

All'avvio tutte le colonne sono vuote.

Deve essere possibile ricaricare una colonna indicando:
- numero della colonna;
- nome della bevanda;
- quantità di lattine.

La stessa bevanda può essere presente in più colonne.

Deve inoltre essere possibile conoscere la quantità complessiva disponibile di una determinata bevanda.

### Vendita

Il metodo di vendita deve ricevere:
- nome della bevanda;
- identificatore della scheda prepagata.

Una vendita è consentita solo se:
- la bevanda esiste;
- la scheda esiste;
- è disponibile almeno una lattina della bevanda;
- il credito della scheda è sufficiente.

Il distributore deve utilizzare la prima colonna, in ordine numerico, che contiene la bevanda richiesta.

In caso di vendita:
- il credito della scheda viene diminuito del prezzo;
- il numero di lattine nella colonna viene diminuito di una unità;
- il metodo restituisce il numero della colonna utilizzata.

In caso di errore deve essere restituito un valore convenzionale oppure deve essere utilizzata un'eccezione.

Realizzare un programma di test che verifichi tutte le condizioni, comprese vendite di prodotti esauriti, bevande inesistenti, schede inesistenti e credito insufficiente.
