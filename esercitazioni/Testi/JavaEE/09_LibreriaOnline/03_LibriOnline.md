**Esercitazione: Sviluppo di un Sito di Vendita Libri Online con Spring Boot e Thymeleaf**

**Introduzione:**
Questo progetto si concentra sulla realizzazione di un'applicazione web per la vendita di libri online. Gli utenti avranno la possibilità di cercare libri per titolo e acquistarli, gestire il proprio carrello degli acquisti e procedere al pagamento.

**Requisiti:**

1. Implementare la funzionalità di ricerca e acquisto di libri per titolo.
2. Implementare la funzionalità di login per gli utenti.
3. Implementare la gestione del carrello degli acquisti e la procedura di pagamento.

**Struttura MVC:**

- Model: Definire le entità `Libro` e `Utente` per rappresentare i dati dei libri e degli utenti. Utilizzeremo Spring Data JPA per gestire la persistenza dei dati.
- View: Utilizzare Thymeleaf per creare pagine HTML per la visualizzazione dei dati e dei form di inserimento.
- Controller: Implementare i controller Spring per gestire le richieste degli utenti e coordinare l'interazione tra modello e vista.

**Livello Base:**

1. Creare un'entità `Libro` che rappresenti i libri disponibili per la vendita. Ogni libro avrà un titolo, un autore, un prezzo e il numero di copie disponibili.
2. Implementare la funzionalità di ricerca e acquisto di libri per titolo. Gli utenti potranno cercare libri inserendo il titolo nel campo di ricerca e, se il libro è disponibile, potranno procedere all'acquisto.
3. Gestire scenari alternativi come il caso in cui il libro specificato dall'utente non esista o il numero di copie disponibili sia pari a 0.

**Livello Intermedio:**

1. Implementare la funzionalità di login per gli utenti. L'accesso sarà controllato utilizzando le credenziali memorizzate nel database degli utenti.
2. Implementare la gestione del carrello degli acquisti. Gli utenti potranno aggiungere libri al proprio carrello, visualizzare il contenuto del carrello e rimuovere libri se necessario.
3. Migliorare l'interfaccia utente per consentire agli utenti di gestire i propri libri e il carrello degli acquisti.

**Livello Avanzato:**

1. Implementare la procedura di pagamento. Gli utenti potranno procedere al pagamento del contenuto del carrello utilizzando una carta di credito.
2. Registrazione dell'acquisto nel database. Quando un utente completa un acquisto, i dati dell'acquisto saranno registrati nel database insieme al contenuto del carrello.
3. Aggiungere funzionalità di conferma dell'acquisto e di uscita dall'applicazione.

**Nota finale:**
Assicurarsi di seguire il pattern MVC e di utilizzare correttamente le funzionalità offerte da Spring Boot e Thymeleaf per sviluppare l'applicazione. Assicurarsi inoltre di includere controlli di validazione adeguati per garantire la sicurezza e l'usabilità dell'applicazione. Buon lavoro!
