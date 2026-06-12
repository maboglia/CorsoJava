# MVC design pattern - model view controller

Il pattern MVC (Model-View-Controller) è un design pattern architetturale ampiamente utilizzato nell'ambito dello sviluppo del software per organizzare il codice in un modo che faciliti la manutenibilità, l'estensibilità e la separazione delle responsabilità. Il pattern MVC suddivide un'applicazione in tre componenti principali:

1. **Model (Modello):**
   - Rappresenta la struttura dei dati e le regole di business dell'applicazione. Il Modello gestisce la logica di dominio e fornisce un'interfaccia per accedere e modificare i dati. Quando il Modello cambia, notifica gli osservatori (solitamente le componenti della View) che possono essere interessati a quei cambiamenti.

2. **View (Vista):**
   - Visualizza l'informazione e interagisce con l'utente. La View è responsabile di presentare i dati provenienti dal Modello all'utente in un formato comprensibile. Può anche raccogliere input dall'utente e inoltrarli al Controller per l'elaborazione. La View può anche essere un osservatore del Modello, in modo da poter essere aggiornata quando il Modello cambia.

3. **Controller (Controllore):**
   - Gestisce gli input dell'utente e interpreta le azioni da eseguire. Il Controller è responsabile di ricevere gli input dall'utente attraverso la View, elaborarli e coordinare il Modello e la View in base a quelle azioni. Il Controller può aggiornare il Modello, che a sua volta notifica le View interessate.

### Flusso di Controllo in MVC:

1. L'utente interagisce con la View, ad esempio, facendo clic su un pulsante.
2. La View invia l'input al Controller.
3. Il Controller interpreta l'input e decide come gestirlo.
4. Il Controller può aggiornare il Modello in base all'input.
5. Il Modello notifica la View se è stato modificato.
6. La View ottiene i dati aggiornati dal Modello e li visualizza all'utente.

### Vantaggi del Pattern MVC:

1. **Separazione delle Responsabilità:**
   - Chiara separazione delle responsabilità tra Modello, Vista e Controller facilita la manutenibilità e l'estendibilità del codice.

2. **Riutilizzo del Codice:**
   - I componenti del pattern MVC possono essere riutilizzati in diverse parti dell'applicazione.

3. **Facilità nella Manutenzione:**
   - Modifiche in un componente (ad esempio, una nuova interfaccia utente) possono essere apportate senza dover toccare gli altri componenti.

4. **Testabilità:**
   - La separazione dei componenti facilita il testing unitario e l'isolamento delle parti dell'applicazione per testare la loro funzionalità in modo indipendente.

5. **Flessibilità e Scalabilità:**
   - Il pattern MVC è flessibile e può essere adattato per soddisfare le esigenze specifiche dell'applicazione. Inoltre, facilita la scalabilità dell'applicazione.

Il pattern MVC è ampiamente utilizzato in molti contesti di sviluppo software, inclusi framework web come Django (Python), Ruby on Rails (Ruby) e Spring MVC (Java), tra gli altri.

---

![MVC](https://raw.githubusercontent.com/maboglia/CorsoJava/master/appunti/img/mvc_pattern_uml_diagram.jpeg)

---

## Design Pattern

Una soluzione progettuale generale a un problema ricorrente

Un pattern è caratterizzato da:

* Nome - rappresentativa del pattern stesso
* Problema - la situazione (o condizione) alla quale si può applicare il pattern
* Soluzione – la configurazione degli elementi adatta a risolvere il problema
* Conseguenze, vantaggi (risultati) e svantaggi (vincoli) che derivano dall'applicazione del pattern

---

## MVC

MVC più che un design pattern tradizionale, è (anche) un modello di
progettazione: buone pratiche alle quali gli sviluppatori ed i progettisti si possono attenere

Model-View-Controller

Disaccoppia

* Presentazione (vista),
* Dati (modello)
* Comportamento dell’applicazione (controllore)

Definisce _confini_ precisi fra

* Contenuti presentati all’utente
* I dati su cui tali presentazioni si basano
* Il comportamento dell’applicazione che supporta le presentazioni

---

## Model (M)

* Rappresenta i dati
* Rappresenta la logica business che agisce sui dati
* Informa la vista quando vi sono variazioni nello stato dei dati
* rappresenta lo stato della nostra applicazione web (data-base, file, informazioni di sessione, etc.)
* Model è il cuore dell'applicazione. Definisce i dati e le operazioni che possono essere eseguiti su essi. Fornisce delle funzioni per l'accesso e l'aggiornamento.
* Può inoltre avere la responsabilità di notificare ai componenti della View eventuali aggiornamenti verificatisi inseguito a richieste del Controller, al fine di permettere alle View di presentare agli occhi degli utenti dati sempre aggiornati.

---

## View (V)

* Visualizza i dati del modello
* Supporta l’interazione con l’utente
* Riceve gli aggiornamenti dal modello
* View è l'interfaccia grafica (GUI) con cui l'utente interagisce.
* Normalmente avrò molte viste a fronte di un solo controller

---

## Controller (C)

L’architettura MVC si basa su tre componenti principali:

* una serie di applicazioni che racchiudono la logica applicativa del nostro sito, attraverso delle modifiche al modello.
* Seleziona le viste
* Invia gli input dell’utente al modello (cambiamenti di stato)
* Agisce come intermediario fra vista e modello
* Il Controller ha la responsabilità di trasformare le interazioni dell'utente della View in azioni eseguite dal Model. Realizzando il collegamento tra input dell'utente e processi eseguiti dal Model, il Controller implementa la logica di controllo dell'applicazione.

---

![MVC](https://raw.githubusercontent.com/maboglia/CorsoJava/master/appunti/img/mvc_schema.jpg)
