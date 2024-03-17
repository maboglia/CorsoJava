**Esercitazione: Implementazione di una Biglietteria per BusFlix utilizzando Spring Boot con JPA nel modello MVC**

**Introduzione:**
In questa esercitazione, affronteremo l'implementazione di una biglietteria per BusFlix utilizzando il modello architetturale MVC (Model-View-Controller) insieme a Spring Boot e JPA (Java Persistence API). Utilizzeremo Spring Boot per gestire l'infrastruttura del progetto e JPA per la persistenza dei dati nel database relazionale.

**Struttura del Progetto:**

1. **Modello (Model):**
   - `Utente`: Rappresenta gli utenti del sistema.
   - `Viaggio`: Rappresenta le tratte dei viaggi in autobus.
   - `Prenotazione`: Rappresenta le prenotazioni degli utenti per i viaggi.

2. **Vista (View):**
   - Interfacce utente (interfaccia web, API REST, ecc.) per interagire con il sistema.

3. **Controllore (Controller):**
   - `UtenteController`: Gestisce le operazioni relative agli utenti.
   - `ViaggioController`: Gestisce le operazioni relative ai viaggi.
   - `PrenotazioneController`: Gestisce le operazioni relative alle prenotazioni.

**Tecnologie Utilizzate:**

- Spring Boot: Per gestire l'infrastruttura del progetto.
- Spring Data JPA: Per l'integrazione di JPA nel progetto Spring.
- Hibernate: Implementazione JPA utilizzata per la persistenza dei dati.
- Thymeleaf (opzionale): Per la creazione di pagine HTML dinamiche (utilizzate come vista nel modello MVC).
- Spring MVC: Per implementare il modello MVC.

**Passi per l'implementazione:**

1. **Configurazione del Progetto:**
   - Creare un nuovo progetto Spring Boot utilizzando Spring Initializr.
   - Aggiungere le dipendenze necessarie per Spring Boot, Spring Data JPA e Hibernate.

2. **Definizione delle Entità:**
   - Implementare le classi `Utente`, `Viaggio` e `Prenotazione` come entità JPA.
   - Configurare le relazioni tra le entità secondo le necessità (ad esempio, una prenotazione ha un riferimento a un utente e a un viaggio).

3. **Definizione dei Repository:**
   - Creare interfacce di repository per le entità JPA per interagire con il database.
   - Utilizzare i metodi forniti da Spring Data JPA per le operazioni CRUD (Create, Read, Update, Delete).

4. **Implementazione dei Controller:**
   - Creare controller per gestire le richieste relative agli utenti, ai viaggi e alle prenotazioni.
   - Implementare i metodi per gestire le operazioni CRUD attraverso le richieste HTTP.

5. **Creazione delle Viste (opzionale):**
   - Implementare pagine HTML dinamiche utilizzando Thymeleaf per visualizzare e interagire con i dati.

6. **Testing e Debugging:**
   - Testare il funzionamento dell'applicazione eseguendo diverse operazioni come creazione di utenti, aggiunta di viaggi, effettuazione di prenotazioni, ecc.
   - Risolvere eventuali errori o problemi di funzionamento.

7. **Deployment:**
   - Distribuire l'applicazione su un server (locale o cloud) per renderla accessibile agli utenti.

**Nota finale:**
Assicurarsi di seguire le best practice di Spring Boot e JPA durante l'implementazione del progetto. Inoltre, è consigliabile separare logicamente le varie parti del progetto (modello, vista, controllore) per mantenere il codice pulito e manutenibile. Buon lavoro!


---

**Esercitazione: Gestione di una Biglietteria per BusFlix utilizzando Java**

**Introduzione:**
In questa esercitazione, affronteremo la creazione di un sistema di prenotazione per la compagnia di autobus "BusFlix". Il sistema dovrebbe consentire agli utenti di visualizzare le tratte disponibili, effettuare prenotazioni e gestire le prenotazioni esistenti. Utilizzeremo Java per implementare questa applicazione.

**Requisiti:**

1. Creare una classe `Utente` per rappresentare gli utenti del sistema. Questa classe dovrebbe contenere informazioni come nome, cognome, email, ecc.
2. Creare una classe `Viaggio` per rappresentare le tratte dei viaggi in autobus. Ogni viaggio dovrebbe avere un'origine, una destinazione, una data e un numero di posti disponibili.
3. Creare una classe `Prenotazione` per gestire le prenotazioni degli utenti per i viaggi. Questa classe dovrebbe contenere informazioni come l'utente che effettua la prenotazione, il viaggio prenotato e lo stato della prenotazione.

**Struttura delle classi:**

1. **Classe Utente:**
   - Attributi:
     - nome
     - cognome
     - email
   - Metodi:
     - Costruttore
     - Metodi getter e setter

2. **Classe Viaggio:**
   - Attributi:
     - origine
     - destinazione
     - data
     - postiDisponibili
   - Metodi:
     - Costruttore
     - Metodi getter e setter

3. **Classe Prenotazione:**
   - Attributi:
     - utente (oggetto della classe Utente)
     - viaggio (oggetto della classe Viaggio)
     - statoPrenotazione (confermata, in attesa, annullata, ecc.)
   - Metodi:
     - Costruttore
     - Metodi getter e setter

**Esempi di tratte:**

| Origine   | Destinazione | Data       | Posti Disponibili |
|-----------|--------------|------------|-------------------|
| Roma      | Milano       | 2024-04-01 | 50                |
| Firenze   | Napoli       | 2024-04-05 | 30                |
| Bologna   | Venezia      | 2024-04-10 | 40                |

**Attività:**

1. Implementare le classi `Utente`, `Viaggio` e `Prenotazione` con i relativi attributi e metodi.
2. Creare oggetti di esempio per gli utenti, i viaggi e le prenotazioni.
3. Testare i metodi implementati per assicurarsi che funzionino correttamente.
4. Opzionale: implementare funzionalità aggiuntive come la ricerca dei viaggi disponibili, la prenotazione di un viaggio, la visualizzazione delle prenotazioni effettuate, ecc.

**Nota finale:**
Ricorda di scrivere un codice ben strutturato e commentato per garantire la comprensione del tuo lavoro. Utilizza le pratiche di programmazione orientata agli oggetti e separa le responsabilità tra le classi in modo appropriato. Buon lavoro!
