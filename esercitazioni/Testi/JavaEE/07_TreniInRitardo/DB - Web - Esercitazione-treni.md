**Esercitazione: Creazione di un Sito per la Gestione dei Ritardi dei Treni utilizzando Spring Boot e JPA**

**Introduzione:**
In questa esercitazione, svilupperemo un sito web per la gestione dei ritardi dei treni tra le città A e B. Gli utenti registrati potranno segnalare i ritardi accumulati durante i loro viaggi e visualizzare le statistiche riguardanti i ritardi medi sull'orario di partenza e di arrivo dei treni.

**Requisiti:**

1. Creare un'entità `Treno` per rappresentare i treni che operano tra le città A e B. Ogni treno avrà un numero di treno, un orario di partenza e un orario di arrivo, specificando se è un viaggio di andata o di ritorno.
2. Creare un'entità `Viaggio` per memorizzare le segnalazioni dei ritardi effettuati dagli utenti. Ogni viaggio sarà associato a un utente, un treno, una data, un'ora di partenza, un'ora di arrivo e un eventuale commento.
3. Implementare funzionalità per consentire agli utenti autenticati di inserire i dati relativi ai viaggi effettuati, selezionando un treno disponibile e inserendo l'orario di partenza e di arrivo effettivi.
4. Implementare pagine per visualizzare le statistiche sui ritardi medi sull'orario di partenza e di arrivo dei treni, sia per tutti gli utenti che per un singolo utente autenticato.

**Struttura MVC:**

- Model: Le entità `Treno` e `Viaggio` rappresentano il modello dei dati. Utilizzeremo Spring Data JPA per gestire l'interazione con il database.
- View: Utilizzeremo Thymeleaf per creare pagine HTML per la visualizzazione dei dati e dei form di inserimento.
- Controller: Implementeremo i controller Spring per gestire le richieste degli utenti e coordinare l'interazione tra modello e vista.

**Attività:**

1. Creare le entità `Treno` e `Viaggio` con le relative annotazioni JPA per mapparle al database.
2. Implementare un repository Spring Data JPA per ciascuna entità per gestire l'accesso ai dati.
3. Creare una pagina `inserisciViaggio.html` che consenta agli utenti autenticati di inserire i dati relativi ai viaggi effettuati, selezionando un treno disponibile e inserendo l'orario di partenza e di arrivo effettivi.
4. Implementare una pagina `tuttiRitardi.html` accessibile a tutti gli utenti, che mostri le statistiche sui ritardi medi sull'orario di partenza e di arrivo dei treni per tutti gli utenti.
5. Implementare una pagina `mieiRitardi.html` accessibile solo agli utenti autenticati, che mostri le statistiche sui ritardi medi sull'orario di partenza e di arrivo dei treni per il singolo utente autenticato.

**Nota finale:**
Assicurarsi di seguire il pattern MVC e di utilizzare correttamente le funzionalità offerte da Spring Boot e JPA per sviluppare l'applicazione. Utilizzare Thymeleaf per creare pagine HTML dinamiche e interattive. Buon lavoro!
