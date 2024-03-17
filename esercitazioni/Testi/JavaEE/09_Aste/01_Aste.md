**Esercitazione: Sviluppo di un Sito per Partecipare ad Aste Online con Spring Boot e Thymeleaf**

**Introduzione:**
In questa esercitazione, svilupperemo un'applicazione web per partecipare ad aste online. Gli utenti potranno effettuare rilanci su oggetti in vendita, visualizzare i dettagli degli oggetti e confermare le loro offerte.

**Requisiti:**

1. Implementare la funzionalità di rilancio per gli utenti.
2. Implementare la funzionalità di login per gli utenti.
3. Utilizzare un database per memorizzare i dati degli utenti e degli oggetti all'asta.

**Struttura MVC:**

- Model: Le entità `Utente` e `OggettoAsta` rappresentano il modello dei dati. Utilizzeremo Spring Data JPA per gestire l'interazione con il database.
- View: Utilizzeremo Thymeleaf per creare pagine HTML per la visualizzazione dei dati e dei form di inserimento.
- Controller: Implementeremo i controller Spring per gestire le richieste degli utenti e coordinare l'interazione tra modello e vista.

**Livello Base:**

1. Creare un'entità `OggettoAsta` che rappresenti gli oggetti in vendita all'asta. Ogni oggetto avrà un codice, una descrizione, l'attuale offerta migliore e l'utente che ha effettuato l'offerta migliore.
2. Implementare la funzionalità di rilancio che consenta agli utenti di specificare il codice dell'oggetto e l'importo dell'offerta. Se l'offerta è maggiore della migliore offerta attuale, verrà registrata come la nuova migliore offerta per l'oggetto.
3. Gestire scenari alternativi come il caso in cui l'oggetto specificato non esista.

**Livello Intermedio:**

1. Implementare la funzionalità di login per gli utenti. Se le credenziali sono corrette, l'utente può accedere alla pagina di rilancio.
2. Migliorare l'interfaccia utente per consentire agli utenti di selezionare l'oggetto per cui effettuare l'offerta e visualizzare i dettagli dell'oggetto.
3. Gestire scenari alternativi come il caso in cui le credenziali di accesso dell'utente siano errate.

**Nota finale:**
Assicurarsi di seguire il pattern MVC e di utilizzare correttamente le funzionalità offerte da Spring Boot e Thymeleaf per sviluppare l'applicazione. L'usabilità e la sicurezza dell'applicazione sono fondamentali, quindi assicurarsi di includere controlli di validazione adeguati e gestire correttamente gli scenari alternativi. Buon lavoro!
