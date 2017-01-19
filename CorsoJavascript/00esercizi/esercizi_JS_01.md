#esercizi JS01    


* 1
   Scrivere una pagina html/js che chieda il nome e il cognome all'utente prima che la pagina venga caricata.
    Mostrare una finestra di dialogo (di tipo alert) che contenga la scritta "Benvenuto "+ nome + cognome.
    Scrivere in fondo alla pagina html: "Benvenuto "+ nome + cognome.

	

* 2
   Scrivere una pagina html/js che chieda all'utente di fornire la propria autorizzazione al trattamento dei dati.
    Nel caso non sia data, scrivere "Autorizzazione non concessa, altrimenti scrivere "Autorizzazione concessa".

	

* 3
   Scrivere una pagina html/js in cui si chiede all'utente di inserire il proprio nome
    Il sistema verifica il nome e comunica all'utente se è un amministratore o meno.
    Preparare un array di nomi che hanno i diritti di amministratore


* 4
   Chiedere tre colori in input all'utente: uno per il testo, uno per lo sfondo e uno per il titolo.
    Chiedere all'utente la dimensione del carattere di base (da 1 a 7).
    Determinare la dimensione e le caratteristiche di h1 (+3, grassetto), h2 (+2) e h3 (+1, grassetto, corsivo) rispetto alle caratteristiche inserite dall'utente per il carattere.
    Creare un testo in cui siano evidenti queste caratteristiche.

    Controllare che il colore dello sfondo, quello del titolo e quello del testo siano diversi.
    Nel caso due o più dei colori assegnati dall'utente siano uguali, devono essere presenti regole che determinino che colore devono assumere titolo, testo e sfondo.
    Nel caso l'utente inserisca al posto dei tre colori il testo "*" deve essere caricato un foglio di stile esterno.


* 5
    Creare uno script che chieda il nome e il cognome all'utente prima che la pagina venga caricata.
    Provare a chiamare una finestra di dialogo (di tipo alert) che contenga la scritta "Benvenuto"+ nome + cognome.
    In fondo alla pagina deve essere scritto "Benvenuto"+ nome + cognome.

  
*6
    Creare una pagina che chieda all'utente di fornire la propria autorizzazione al trattamento dei dati.
    Nel caso non sia data, scrivere "Autorizzazione non concessa".
    Nel caso contrario scrivere "Autorizzazione concessa".

  
*7
    Creare una pagina in cui il sistema chiede all'utente il proprio nome
    Il sistema verifica il nome e comunica all'utente se è un amministratore o meno
    E' dato un array di nomi che hanno i diritti di amministratore

  
*8
    Chiedere tre colori in input all'utente: uno per il testo, uno per lo sfondo e uno per il titolo.
    Chiedere alll'utente la dimensione del carattere di base (da 1 a 7).
    Determinare la dimensione e le caratteristiche di H1 (+3, grassetto), H2 (+2) e H3 (+1, grassetto, corsivo) rispetto alle caratteristiche inserite dall'utente per il carattere.
    Creare un testo in cui siano evidenti queste caratteristiche.

    Controllare che il colore dello sfondo, quello del titolo e quello del testo siano diversi.
    Nel caso due o più dei colori assegnati dall'utente siano uguali, devono essere presenti regole che determinino che colore devono assumere titolo, testo e sfondo.
    Nel caso l'utente inserisca al posto dei tre colori il testo "*"deve essere caricato un foglio di stile esterno.

  

Versione semplificata dell'esercizio precedente.

* Creare uno script JavaScript che:

    chieda all'utente la dimensione del carattere e il colore per i tag p, body, h1
    chieda all'utente il colore dello sfondo per il tab body
    derivi automaticamente la dimensione del carattere dei tag h1 e h3 da quella del tag h1
    generi un foglio di stile interno in base a queste specifiche

  

#Utilizzo delle funzioni

*    Calcolare il totale della spesa (per un numero non definito di acquisti) utilizzando una funzione.
    L'utente deve poter interrompere gli acquisti scrivendo 0.

  

*    Stampare la lista della spesa per un massimo di 3 acquisti.
    L'utente deve poter interrompere gli acquisti scrivendo *.

  

 *   Creare uno slide-show di immagini

  

#Array e Oggetti

*    Definire dei prompt che richiedono le proprietà Processore, Hard Disk, Scheda Video, Ram di un computer.
    Creare un oggetto computer con tali proprietà.
    Stampare le proprietà dell'oggetto.

  

    Chiedere all'utente dei numeri in input.
    Salvare i numeri in un array.
    Ordinare con le funzioni degli array.

#Dom

  

*    Creare una funzione caricata in avvio (onLoad su body) che cambi il colore di sfondo ongli 15 secondi (window.setTimeout(comando,millisecondi);
    Il colore di sfondo (document.bgColor) viene preso da un array.
    Quando tutto l'array è stato visitato, ricomincia.
    Inserire due bottoni, uno per fermare e l'altro per continuare l'esecuzione (onClick).

  

*    Stampare le proprietà dell'oggetto navigator (window.navigator).

  

*    Fare una tabella in una pagina che permetta di impostare un bookmark a seconda del browser.
    La proprietà document.title contiene il titolo della pagina.
    Per explorer: window.external.AddFavorite(bookmarkurl,bookmarktitle).
    Per netscape: testo che dice "Premere CTRL+D per salvare la pagina nei segnalibri".

  

*    Cambiare il colore di un testo non in un link, ne in un pulsante di un form passando il mouse sopra un elemento sensibile.
    Utilizzare i fogli di stile.
    Per risolvere considerare il fatto che tramite il dom di javascript è possibile accedere alle proprietà di qualunque elemento con un nome della pagina tramite la sintassi nomeelemento.proprietà = valore (in questo caso nomeelemento.className=nomeclasse.

  

*    Cambiare il colore di un testo in un div passando il mouse sopra l'elemento stesso.
    Utilizzare i fogli di stile.
    Per risolvere considerare il fatto che tramite il dom di javascript ogni elemento può accedere alle proprie proprietà tramite la parola chiave this.
