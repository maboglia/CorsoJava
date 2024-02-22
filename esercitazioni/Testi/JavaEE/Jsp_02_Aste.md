# Aste

## Livello Base  

Scrivere un’applicazione Web che consente di partecipare ad aste in linea. Le aste riguardano
oggetti di vario tipo (es: macchine fotografiche, cellulari, automobili, ciclomotori). L’applicazione deve
consentire di eseguire il seguente caso d’uso.

### “Utente effettua rilancio”

Scenario Principale
- L’utente accede ad uno schermo iniziale (index.jsp) nel quale viene visualizzata una maschera per
specificare il codice dell’oggetto per il quale si intende effettuare il rilancio; i codici sono valori interi
(1, 2, 3 ecc.)
- Il sistema verifica che nella base di dati esista un oggetto all’asta con il codice specificato. Gli oggetti
all’asta sono memorizzati in una tabella Oggetti  della base di dati che contiene il codice dell’oggetto, la
descrizione, l’attuale offerta migliore, il nome e il cognome di chi ha fatto l’offerta.
- Se l’oggetto esiste, l’utente accede ad uno schermo (offerta.jsp) nel quale sono riassunti i dati relativi
all’oggetto; lo schermo contiene inoltre una maschera attraverso la quale l’utente fornisce (a) il suo
nome; (b) il suo cognome; (c) l’importo dell’offerta
- Se l’importo dell’offerta è superiore alla migliore offerta giunta fino a quel punto per l’oggetto, il
sistema aggiorna i dati registrando la nuova offerta per l’oggetto con il nome e il cognome dell’utente
- L’utente accede ad uno schermo (conferma.jsp) nel quale vengono riassunti i risultati dell’operazione
(dati dell’oggetto e offerta effettuata); lo schermo contiene un collegamento allo schermo iniziale nel
caso l’utente voglia eseguire una ulteriore offerta
Scenario alternativo: L’oggetto non esiste
- L’utente accede ad uno schermo (errore.jsp) in cui viene visualizzato un messaggio di errore ed un
collegamento allo schermo principale per effettuare una nuova operazione
## Livello Intermedio

Scrivere un’applicazione Web che consente di partecipare ad aste in linea. Le aste riguardano
oggetti di vario tipo (es: macchine fotografiche, cellulari, automobili, ciclomotori). L’applicazione deve
consentire di eseguire i seguenti caso d’uso.


### “Utente effettua login”

Scenario Principale
- L’utente accede ad uno schermo iniziale (index.jsp) nel quale viene visualizzata una maschera per
fornire nome utente e password
- Il sistema autentica l’utente accedendo ad una tabella Utenti della base di dati, che contiene il nome
utente, la password, il nome e cognome dell’utente (NOTA: è necessario prevedere tra gli altri un utente
“Mario Rossi” con nome utente utente  e password utente)
- Se l’autenticazione ha successo, l’utente accede allo schermo principale del caso d’uso successivo
(offerta.jsp)
Scenario alternativo: nome utente o password scorretta
- Se l’autorizzazione fallisce, l’utente ritorna allo schermo iniziale (index.jsp) in cui viene visualizzato un
messaggio di errore  
  

### “Utente effettua rilancio”

Scenario Principale
- L’utente accede ad uno schermo (offerta.jsp) nel quale sono riassunti i dati dell’utente (nome,
cognome). Lo schermo contiene inoltre un elenco degli oggetti all’asta, con una maschera attraverso cui
l’utente può effettuare un’offerta per uno degli oggetti (NOTA: si consiglia di prevedere un controllo di
tipo “select” o “radio” per specificare l’oggetto per cui effettuare l’offerta). Gli oggetti all’asta sono
memorizzati in una tabella Oggetti della base di dati che contiene il codice dell’oggetto, la descrizione,
la migliore offerta ricevuta e il riferimento all’utente che ha effettuato l’offerta
- Il sistema convalida i dati forniti; se i dati sono corretti il sistema registra la nuova offerta da parte
dell’utente (NOTA: la nuova offerta deve essere superiore alla precedente)
- L’utente accede ad uno schermo (conferma.jsp) nel quale vengono riassunti i risultati dell’operazione
(dati dell’oggetto e nuova offerta); lo schermo contiene inoltre (a) un collegamento allo schermo iniziale
del caso d’uso (offerta.jsp) nel caso l’utente voglia eseguire una ulteriore operazione; (b) un
collegamento ad uno schermo di uscita (uscita.jsp) attraverso il quale l’utente può abbandonare
l’applicazione
Scenario alternativo: offerta scorretta
- Se la convalida fallisce, l’utente ritorna allo schermo di immissione (offerta.jsp) in cui viene
visualizzato un messaggio di errore
