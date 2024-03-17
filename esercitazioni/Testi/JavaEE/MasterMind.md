**Esercitazione: Sviluppo di un Gioco Master Mind Online**

**Introduzione:**
Questo progetto si concentra sulla realizzazione di un'applicazione web per giocare ad una versione semplificata del gioco Master Mind. Il gioco consiste nell'indovinare una combinazione segreta di numeri. L'applicazione deve consentire agli utenti di effettuare il login, inserire una combinazione e indovinare la combinazione segreta.

**Requisiti:**

1. Implementare la funzionalità di login per gli utenti.
2. Implementare la possibilità per l'utente di inserire una combinazione e verificarne l'indovinamento.
3. Gestire scenari alternativi come combinazioni già esistenti o errate.

**Struttura MVC:**

- Model: Definire le entità necessarie per rappresentare gli utenti, le combinazioni segrete e i tentativi effettuati.
- View: Utilizzare JSP per creare pagine HTML per la visualizzazione dei dati e dei form di inserimento.
- Controller: Implementare i controller per gestire le richieste degli utenti e coordinare l'interazione tra modello e vista.

**Livello Base:**

1. Implementare la funzionalità di login per gli utenti. L'accesso sarà controllato utilizzando username e password predefiniti.
2. Implementare la possibilità per l'utente di inserire una combinazione e verificarne l'indovinamento.
3. Gestire scenari alternativi come combinazioni già esistenti o errate.

**Livello Intermedio:**

1. Estendere il gioco introducendo la possibilità per il computer di generare una combinazione segreta.
2. Implementare la logica per determinare il numero di cifre corrette e nella posizione corretta (pallini neri) e il numero di cifre corrette ma nella posizione errata (pallini bianchi).
3. Migliorare l'interfaccia utente per consentire agli utenti di visualizzare i tentativi effettuati e le relative risposte.

**Livello Avanzato:**

1. Estendere ulteriormente il gioco introducendo la possibilità per il computer di generare una combinazione segreta con cifre tutte diverse.
2. Aggiungere la registrazione dei tentativi effettuati e delle relative risposte nel database.
3. Implementare una pagina di successo che mostri la combinazione segreta, un riassunto dei tentativi effettuati con le relative risposte e un collegamento per iniziare una nuova partita.

**Nota finale:**
Assicurarsi di seguire il pattern MVC e di utilizzare correttamente le funzionalità offerte da JSP per sviluppare l'applicazione. Gestire in modo adeguato gli scenari alternativi e includere controlli di validazione per garantire la sicurezza e l'usabilità del gioco. Buon divertimento!
