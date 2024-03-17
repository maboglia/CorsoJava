**Esercitazione: Sviluppo di un Applicativo di Home Banking utilizzando Spring Boot e Thymeleaf**

**Introduzione:**
In questa esercitazione, svilupperemo un'applicazione web per la gestione di un servizio di home banking. Gli utenti potranno effettuare operazioni come versamenti e bonifici sui loro conti correnti, visualizzare il saldo attuale e le transazioni effettuate.

**Requisiti:**

1. Implementare la funzionalità di versamento per gli utenti registrati.
2. Implementare la funzionalità di login per gli utenti.
3. Implementare la funzionalità di bonifico per gli utenti autenticati.
4. Utilizzare un database per memorizzare i dati degli utenti, dei conti correnti e delle transazioni.

**Struttura MVC:**

- Model: Le entità `Utente`, `ContoCorrente` e `Transazione` rappresentano il modello dei dati. Utilizzeremo Spring Data JPA per gestire l'interazione con il database.
- View: Utilizzeremo Thymeleaf per creare pagine HTML per la visualizzazione dei dati e dei form di inserimento.
- Controller: Implementeremo i controller Spring per gestire le richieste degli utenti e coordinare l'interazione tra modello e vista.

**Livello Base:**

1. Creare un'entità `ContoCorrente` che rappresenti i conti correnti degli utenti. Ogni conto avrà un codice, un saldo e sarà associato a un utente.
2. Implementare una funzionalità di versamento che consenta agli utenti di specificare il codice del conto corrente e l'importo da versare. Se il conto corrente esiste, il saldo verrà aggiornato di conseguenza.
3. Gestire scenari alternativi come il caso in cui il conto corrente specificato non esista.

**Livello Intermedio:**

1. Implementare la funzionalità di login per gli utenti. Se le credenziali sono corrette, l'utente può accedere alle funzionalità di versamento e bonifico.
2. Aggiungere la possibilità per gli utenti di effettuare bonifici. L'utente specifica il conto corrente di destinazione e l'importo del bonifico. Se la transazione è valida, i saldi dei due conti coinvolti vengono aggiornati.

**Livello Avanzato:**

1. Implementare un sistema di gestione delle sessioni per mantenere lo stato di autenticazione degli utenti.
2. Migliorare la gestione degli errori e dei messaggi di conferma in tutte le pagine.
3. Aggiungere funzionalità di visualizzazione del saldo e delle transazioni effettuate.
4. Implementare il logout per gli utenti autenticati.

**Nota finale:**
Assicurarsi di seguire il pattern MVC e di utilizzare correttamente le funzionalità offerte da Spring Boot e Thymeleaf per sviluppare l'applicazione. La sicurezza e l'accuratezza delle operazioni di home banking sono di fondamentale importanza, quindi assicurati di includere controlli di validazione adeguati. Buon lavoro!
