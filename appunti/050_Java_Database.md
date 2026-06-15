# JDBC (Java Database Connectivity)

JDBC (Java Database Connectivity) è un'interfaccia completamente Java utilizzata per eseguire istruzioni SQL sui database.

L'**API JDBC** si trova nel pacchetto java.sql; contiene poche classi concrete ed è composta principalmente da interfacce indipendenti dal database.

---

## Caratteristiche principali di JDBC

Le **API JDBC** consentono di accedere a qualsiasi tipo di dati tabulari, in particolare ai dati memorizzati in database relazionali. JDBC consente di scrivere applicazioni Java che gestiscono tre attività principali di programmazione:

1. **Connettere un'origine dati (e.g., database)**
2. **Inviare query e istruzioni di aggiornamento per il database**
3. **Recuperare ed elaborare i risultati ricevuti**

---

## Componenti principali di JDBC

### 1. API JDBC

Un insieme di interfacce che fanno parte della piattaforma Java e costituiscono le API per il programmatore.

### 2. JDBC Driver Manager

Gestore di driver che permette a driver di terze parti di connettersi a un DB specifico.

---

## Funzioni principali di un driver JDBC

Un driver JDBC permette di:

1. **Connettersi a un DB**
2. **Inviare un comando SQL**
3. **Processare il risultato**

L'utilizzo di JDBC segue generalmente quattro passi:

---

1. **Caricamento del Driver**: Inizialmente, è necessario caricare il driver JDBC appropriato per il database specifico che si intende utilizzare. Questo può essere un driver JDBC installato localmente o il ponte JDBC-ODBC. Il nome o il funzionamento interno del driver selezionato non è rilevante, poiché l'interfaccia di programmazione rimane la stessa.

---

2. **Apertura della Connessione**: Successivamente, si apre una connessione verso il database necessario all'applicazione utilizzando il driver caricato nel passo precedente.

---

3. **Interazione con la Base di Dati**: L'interfaccia JDBC e il linguaggio SQL vengono utilizzati per interagire con la base di dati. Di solito, viene eseguita una query per ottenere alcuni risultati dal DBMS.

---

4. **Manipolazione dei Risultati**: I risultati ottenuti possono essere manipolati utilizzando le classi JDBC e il codice Java appositamente progettato.

---

Esempio di codice:

```java
private Connection con = null;
private final String URL = "jdbc:mysql://localhost:3306/nomeDB";
private final String USER = "username";
private final String PASS = "password";

public Connection connetti() {
    try {
        if (this.con == null) {
            this.con = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Siamo connessi!");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return this.con;
}
```

---

Esempio di codice per eseguire una query e recuperare i risultati:

```java
private Connection con = null;
private Statement statement = null;
private ResultSet rs = null;

public List<Libro> findAllLibri() {
    List<Libro> libri = new ArrayList<>();
    this.con = connetti();
    try {
        this.statement = this.con.createStatement();
        this.rs = this.statement.executeQuery(FIND_ALL);
        while (this.rs.next()) {
            Libro l = new Libro();
            l.setId(rs.getInt("id"));
            l.setPagine(rs.getInt("pagine"));
            l.setEditore_id(rs.getInt("editore_id"));
            l.setPrezzo(rs.getDouble("prezzo"));
            l.setTitolo(rs.getString("titolo"));
            libri.add(l);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return libri;
}
```

---

Questi esempi illustrano il caricamento del driver e l'esecuzione di una query per recuperare una lista di libri dal database.

Con JDBC 4 e versioni successive, non è più necessario caricare manualmente il driver JDBC in memoria. Il caricamento automatico è gestito dal sistema. Tuttavia, se si utilizzano versioni precedenti di JDBC, è possibile caricare il driver utilizzando il seguente metodo:

```java
Class.forName("stringa_driver");
```

---

Inoltre, per stabilire una connessione al database, si utilizza l'interfaccia `java.sql.Connection` insieme alla classe `java.sql.DriverManager`. Il modello generale è il seguente:

```java
Connection conn = DriverManager.getConnection(url_database);
```

Una volta ottenuta una connessione attiva, è possibile utilizzare i metodi forniti da `Connection`. Alcuni dei metodi più comuni includono:

- `createStatement()`: Crea e restituisce un oggetto `java.sql.Statement`, utile per interagire con il database attraverso comandi SQL.
- `close()`: Chiude la connessione.

Questo approccio permette di eseguire operazioni come l'esecuzione di query SQL e l'interazione con il database in modo più flessibile e dinamico.

---

## Ricapitolando

**JDBC (Java Database Connectivity)** è un'interfaccia Java per eseguire istruzioni SQL su database, parte del pacchetto `java.sql`. Consente alle applicazioni Java di:

1. **Connettersi a una sorgente dati** (database)
2. **Inviare query e aggiornamenti**
3. **Recuperare ed elaborare risultati**

### Componenti principali di JDBC

- **API JDBC**: un set di interfacce che fanno parte della piattaforma Java per gestire l'accesso al database.
- **Driver Manager JDBC**: gestisce i driver JDBC, permettendo la connessione a vari database tramite driver di terze parti.

### Funzioni principali di un driver JDBC

Il driver JDBC consente di:

- Stabilire una connessione al database
- Inviare comandi SQL
- Gestire i risultati

### Passaggi fondamentali per l'uso di JDBC

1. **Caricamento del Driver**: Inizialmente, si carica il driver specifico per il database. Dalla versione JDBC 4, il caricamento è automatico.
2. **Apertura della Connessione**: Creazione di una connessione usando `DriverManager.getConnection`.
3. **Interazione con il Database**: Uso di SQL per inviare query e aggiornamenti.
4. **Elaborazione dei Risultati**: Manipolazione dei dati tramite oggetti JDBC.

### Esempio di codice per la connessione

```java
private Connection con = null;
private final String URL = "jdbc:mysql://localhost:3306/nomeDB";
private final String USER = "username";
private final String PASS = "password";

public Connection connetti() {
    try {
        if (this.con == null) {
            this.con = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Siamo connessi!");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return this.con;
}
```

### Esempio di query

```java
private Connection con = null;
private Statement statement = null;
private ResultSet rs = null;

public List<Libro> findAllLibri() {
    List<Libro> libri = new ArrayList<>();
    this.con = connetti();
    try {
        this.statement = this.con.createStatement();
        this.rs = this.statement.executeQuery("SELECT * FROM libri");
        while (this.rs.next()) {
            Libro l = new Libro();
            l.setId(rs.getInt("id"));
            l.setPagine(rs.getInt("pagine"));
            l.setEditore_id(rs.getInt("editore_id"));
            l.setPrezzo(rs.getDouble("prezzo"));
            l.setTitolo(rs.getString("titolo"));
            libri.add(l);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return libri;
}
```

Questi esempi mostrano come connettersi al database e recuperare dati.

---

## Istruzioni per la creazione della tabella e recupero dei dati

Ecco come creare una tabella e inserire dati di esempio in un database utilizzando `java.sql` e JDBC.

### 1. Creazione della tabella

Assumendo di voler creare una tabella `libri` con alcune colonne basilari, utilizziamo il seguente codice:

```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseSetup {

    private static final String URL = "jdbc:mysql://localhost:3306/nomeDB";
    private static final String USER = "username";
    private static final String PASS = "password";

    public static void createTable() {
        String createTableSQL = """
            CREATE TABLE IF NOT EXISTS libri (
                id INT AUTO_INCREMENT PRIMARY KEY,
                titolo VARCHAR(100) NOT NULL,
                pagine INT NOT NULL,
                editore_id INT,
                prezzo DECIMAL(10, 2) NOT NULL
            )
        """;

        try (Connection con = DriverManager.getConnection(URL, USER, PASS);
             Statement stmt = con.createStatement()) {
             
            stmt.executeUpdate(createTableSQL);
            System.out.println("Tabella 'libri' creata con successo!");
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
```

Questa funzione `createTable` crea la tabella `libri` solo se non esiste già. Ogni riga rappresenta un libro con un ID univoco, un titolo, il numero di pagine, un riferimento all'editore e il prezzo.

### 2. Inserimento di dati fake

Una volta creata la tabella, possiamo popolarla con dati di esempio. Ecco come fare:

```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseSetup {

    public static void insertFakeData() {
        String[] fakeDataSQL = {
            "INSERT INTO libri (titolo, pagine, editore_id, prezzo) VALUES ('Libro A', 300, 1, 15.99)",
            "INSERT INTO libri (titolo, pagine, editore_id, prezzo) VALUES ('Libro B', 250, 2, 9.99)",
            "INSERT INTO libri (titolo, pagine, editore_id, prezzo) VALUES ('Libro C', 400, 3, 20.50)",
            "INSERT INTO libri (titolo, pagine, editore_id, prezzo) VALUES ('Libro D', 150, 1, 5.75)",
            "INSERT INTO libri (titolo, pagine, editore_id, prezzo) VALUES ('Libro E', 500, 2, 25.00)"
        };

        try (Connection con = DriverManager.getConnection(URL, USER, PASS);
             Statement stmt = con.createStatement()) {
             
            for (String sql : fakeDataSQL) {
                stmt.executeUpdate(sql);
            }
            System.out.println("Dati fake inseriti con successo!");
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        createTable();
        insertFakeData();
    }
}
```

### Spiegazione del codice
1. **createTable()**: Crea la tabella `libri` con le colonne indicate, solo se non esiste già.
2. **insertFakeData()**: Inserisce cinque record di esempio nella tabella `libri`.
3. **main()**: Esegue entrambe le operazioni in sequenza.

### Risultato
Eseguendo `DatabaseSetup.main()`, la tabella `libri` verrà creata e popolata con dati di esempio.