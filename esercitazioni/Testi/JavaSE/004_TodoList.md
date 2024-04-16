# TodoList

Ecco una possibile descrizione per l'esercitazione Java sulla creazione di una TodoList:

---

## Esercitazione Java: Creazione di una TodoList

### Descrizione:

In questa esercitazione, verrà sviluppata un'applicazione Java per la gestione di una lista di attività da svolgere, nota anche come "TodoList". L'applicazione consentirà agli utenti di aggiungere, visualizzare, modificare ed eliminare attività dalla loro lista di cose da fare.

### Requisiti Funzionali:

1. **Aggiunta di Attività:**
   Gli utenti devono poter aggiungere nuove attività specificando un titolo e una descrizione.

2. **Visualizzazione della Lista:**
   Gli utenti devono poter visualizzare l'intera lista delle attività presenti nella TodoList.

3. **Modifica delle Attività:**
   Gli utenti devono poter modificare il titolo o la descrizione di un'attività esistente.

4. **Eliminazione delle Attività:**
   Gli utenti devono poter eliminare un'attività dalla lista.

5. **Segnare un'Attività come Completata:**
   Gli utenti devono poter segnare un'attività come completata.

6. **Filtri:**
   Gli utenti devono poter filtrare le attività per visualizzare solo quelle completate o solo quelle ancora da completare.

### Requisiti Tecnici:

- L'applicazione deve essere implementata utilizzando il linguaggio di programmazione Java.
- Si consiglia l'uso del paradigma di programmazione a oggetti.
- Si possono utilizzare librerie esterne per l'interfaccia utente, ad esempio JavaFX o Swing, ma è possibile anche implementare un'interfaccia testuale tramite la console.

### Suggerimenti:

- Divide il codice in classi e metodi per una maggiore leggibilità e manutenibilità.
- Utilizza le collezioni Java come ArrayList per gestire la lista delle attività.
- Implementa un'interfaccia utente intuitiva e user-friendly per migliorare l'esperienza dell'utente.

### Note:

Questa esercitazione è pensata per aiutarti a consolidare le tue conoscenze di programmazione Java e praticare la progettazione e l'implementazione di un'applicazione software. Assicurati di seguire le best practice di programmazione e di commentare il codice per renderlo comprensibile ad altri sviluppatori.

---

## dati di esempio

Ecco un esempio di dati di prova per la TodoList:

```plaintext
1. Titolo: Fare la spesa
   Descrizione: Comprare latte, pane, uova, frutta e verdura.

2. Titolo: Studiare Java
   Descrizione: Preparare per l'esame di programmazione Java.

3. Titolo: Fare esercizio
   Descrizione: Andare in palestra per un'ora.

4. Titolo: Chiamare il dentista
   Descrizione: Prenotare un appuntamento per la pulizia dei denti.

5. Titolo: Compleanno di Anna
   Descrizione: Acquistare un regalo per il compleanno di Anna.

6. Titolo: Scrivere rapporto settimanale
   Descrizione: Preparare e inviare il rapporto settimanale al capo.

7. Titolo: Leggere nuovo libro
   Descrizione: Iniziare a leggere il nuovo libro acquistato.

8. Titolo: Organizzare armadio
   Descrizione: Riordinare l'armadio e donare i vestiti non utilizzati.
```

---

### schema

Ecco uno schema UML semplificato delle classi per l'applicazione TodoList:

```
 ____________________        ____________________        _______________
|      TodoList      |      |       Task         |      |    TaskManager   |
|--------------------|      |--------------------|      |-----------------|
| - tasks: List<Task>|      | - id: int          |      | - todoList: TodoList|
|                    |      | - title: String    |      |-----------------|
| + addTask(task: Task) |   | - description: String |   | + addTask(title: String, description: String): void |
| + removeTask(taskId: int) | | - completed: boolean  |  | + removeTask(taskId: int): void |
| + getTasks(): List<Task> |  |                    |    | + getTasks(): List<Task> |
|____________________|       |____________________|     |_________________|
                             /                      \
                           /                          \
 _____________________      _________________________       ____________________
|      Task            |    |    CompletedTask       |     |    IncompletedTask   |
|---------------------|    |------------------------|     |---------------------|
| - id: int           |    | - completionDate: Date |     | - deadline: Date     |
| - title: String     |    |                        |     |_____________________|
| - description: String |   |________________________|
| - completed: boolean |
|_____________________|

```

In questo schema:

- `TodoList` rappresenta la lista di attività e contiene un elenco di oggetti `Task`.
- `Task` è la classe base astratta per tutte le attività, con attributi comuni come `id`, `title`, `description`, e `completed`.
- `CompletedTask` e `IncompletedTask` sono sottoclassi di `Task` che rappresentano rispettivamente le attività completate e quelle ancora da completare. `CompletedTask` ha un attributo aggiuntivo `completionDate`, mentre `IncompletedTask` ha un attributo aggiuntivo `deadline`.
- `TaskManager` è una classe che gestisce le operazioni CRUD (Create, Read, Update, Delete) sulla lista di attività. Possiede un riferimento a un'istanza di `TodoList`.

Questo schema rappresenta una possibile struttura delle classi per gestire una TodoList in Java.

## collega il database

Ecco la struttura SQL per le tabelle necessarie per l'applicazione TodoList:

```sql
-- Tabella per le attività
CREATE TABLE Task (
    id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    completed BOOLEAN NOT NULL DEFAULT false
);

-- Tabella per le attività completate
CREATE TABLE CompletedTask (
    id INT PRIMARY KEY,
    completionDate DATE NOT NULL,
    FOREIGN KEY (id) REFERENCES Task(id)
);

-- Tabella per le attività non completate
CREATE TABLE IncompletedTask (
    id INT PRIMARY KEY,
    deadline DATE NOT NULL,
    FOREIGN KEY (id) REFERENCES Task(id)
);
```

In questa struttura:

- La tabella `Task` contiene le informazioni di base per ogni attività, come il titolo, la descrizione e lo stato di completamento.
- La tabella `CompletedTask` contiene le attività completate e include la data di completamento.
- La tabella `IncompletedTask` contiene le attività non completate e include la data di scadenza per ciascuna attività.

Puoi utilizzare queste tabelle per memorizzare e gestire le attività nella tua applicazione TodoList.