# Negozio abbigliamento

## TipoCapoAbigliamento

Scrivere la classe **TipoCapoAbigliamento** che ha i seguenti attributi 
* marca:una stringa indicante la marca, 
* modello: una stringa indicante il modello, 
* costo:un numero con la virgola indicante il costo in euro. 

Il costruttore ha come parametri una stringa per la marca, una stringa per il modello, un numero con la virgola per il
costo ed assegna opportunamente i valori dei parametri agli attributi. 

* Scrivere il `metodo getCosto` che stampa il valore dell’attributo costo. 
* Scrivere inoltre il `metodo applicaSconto` che ha come il parametro un numero con la virgola indicante la percentuale di sconto che si vuole applicare, il `metodo restituisce` il costo del capo di abbigliamento scontato ossia il risultato della sottrazione tra costo e costo moltiplicato il valore del parametro diviso 100. 
* Scrivere il `metodo modificaCosto` che ha come parametro un numero con la virgola (dello stesso tipo di costo) indicante il nuovo costo ed assegna all’attributo costo il valore del parametro.

## CapoAbbigliamento

Scrivere la classe **CapoAbbigliamento** sottoclasse della classe
**TipoCapoAbbigliamento** che ha in più 3 attributi: 
taglia un numero intero che indica la taglia; 
quantitàAcquistata un numero intero indicante il numero di pezzi acquistati, quantitàDisponibile un numero intero indicante il numero di pezzi
disponibili (agli attributi viene assegnato un valore del costruttore). 

Scrivere il `metodo venduto` avente come parametro un numero intero indicante il numero di capi venduti, il metodo se `quantitàDisponibile` è maggiore del risultato della sottrazione tra `quantitàDisponibile` ed il parametro, modifica il valore dell’attributo `quantitàDisponibile` sottraendogli il valore del parametro. 

Scrivere il `metodo getDettagli` che stampa tutti gli attributi della classe.

---

## Negozio

Scrivere la classe **Negozio** che ha il `metodo main` in cui istanziare un oggetto di tipo
**TipoCapoAbbigliamento** di marca Colmar modello Giacca E45 con prezzo 350,5 e
richiamare il `metodo getCosto` ed il `metodo applicaSconto` con parametro 30
stampando il valore restituito dal `metodo.` 

Istanziare un oggetto di tipo **CapoAbbigliamento** con marca Levis modello jeans 570SC costo 79,8 taglia 40, quantità acquistata 30 quantità disponibile 30 e richiamare il `metodo venduto` con parametro pari a 2. 

Infine richiamare il `metodo getDettagli`.
