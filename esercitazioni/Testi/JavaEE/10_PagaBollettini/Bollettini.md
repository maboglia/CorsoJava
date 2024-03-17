**Esercitazione: Sviluppo di un'applicazione Bollettini con Spring Boot, JPA, Thymeleaf, MVC**

**Introduzione:**
Questo progetto si concentra sulla realizzazione di un'applicazione web per il pagamento di bollettini di conto corrente postale. Utilizzeremo Spring Boot per gestire il backend, JPA per l'accesso ai dati, Thymeleaf per la visualizzazione delle pagine HTML e il pattern MVC per organizzare la struttura dell'applicazione.

**Requisiti:**

1. Implementare la funzionalità per il pagamento di un singolo bollettino.
2. Gestire scenari alternativi come dati del bollettino scorretti o conto corrente del destinatario non abilitato.
3. Estendere l'applicazione per consentire il pagamento di più bollettini contemporaneamente.

**Struttura MVC:**

- Model: Definire le entità necessarie per rappresentare i bollettini e i conti correnti.
- View: Utilizzare Thymeleaf per creare pagine HTML per la visualizzazione dei dati e dei form di inserimento.
- Controller: Implementare i controller per gestire le richieste degli utenti e coordinare l'interazione tra modello e vista.

**Livello Base:**

1. Implementare la funzionalità per il pagamento di un singolo bollettino. L'utente inserirà i dati del bollettino e procederà al pagamento.
2. Gestire scenari alternativi come dati del bollettino scorretti o conto corrente del destinatario non abilitato.

**Livello Intermedio:**

1. Estendere l'applicazione per consentire il pagamento di più bollettini contemporaneamente. L'utente potrà aggiungere più bollettini al carrello e procedere al pagamento di tutti i bollettini presenti nel carrello.
2. Migliorare l'interfaccia utente per consentire agli utenti di visualizzare lo stato del carrello e di aggiungere o rimuovere bollettini.

**Nota finale:**
Assicurarsi di seguire il pattern MVC e di utilizzare correttamente le funzionalità offerte da Spring Boot, JPA e Thymeleaf per sviluppare l'applicazione. Gestire in modo adeguato gli scenari alternativi e includere controlli di validazione per garantire la sicurezza e l'usabilità dell'applicazione. Buon lavoro!
