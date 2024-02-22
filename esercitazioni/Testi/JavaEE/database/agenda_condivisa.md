# agenda condivisa

Si vuole realizzare un sito per la gestione di un’agenda condivisa da un gruppo di lavoro. Ciascun utente del
gruppo è dotato di un proprio username, e può caricare sull’agenda i propri appuntamenti. Ogni utente può
poi vedere l’insieme di tutti gli appuntamenti (di tutti gli utenti) per il giorno corrente.
Si supponga che il sistema informativo si basi su un database “prenotazioni” così organizzato:
utente ( idUtente, password, nome, cognome )
appuntamento( idAppuntamento, idUtente, data, oraInizio, oraFine, argomento )
Si vuole realizzare in tecnologia JSP una porzione del sito, che comprenda le seguenti
funzionalità:

1. Una pagina di benvenuto che visualizzi tutti gli appuntamenti per il giorno corrente, elencandoli in ordine di
ora di inizio, e visualizzando per ciascuno il nome e cognome dell’utente, oltre all’argomento. Selezionando
un apposito link “aggiungi”, si viene portati alla seconda pagina.
2. Una seconda pagina mediante la quale un utente possa inserire un nuovo appuntamento,
compilando i dati relativi a data, ora di inizio, ora di fine ed argomento in un apposito form.

L’elaborazione del form deve verificare che l’utente non abbia altri appuntamenti in
sovrapposizione con quello indicato, ed in caso di successo deve fornire un messaggio di
conferma. Si ipotizzi che l’utente abbia già compiuto il login nel sito.
In particolare, si richiede di:
- identificare, a partire dalle specifiche precedenti, le componenti necessarie (pagine jsp,
servlet, bean, ...) a realizzare le funzionalità sopra descritte secondo il paradigma MVC
- implementare tali pagine e classi.
