# JDBC (Java Database Connectivity)

JDBC (Java Database Connectivity) è un'interfaccia completamente Java utilizzata per eseguire istruzioni SQL sui database.

L'**API JDBC** si trova nel pacchetto java.sql; contiene poche classi concrete ed è composta principalmente da interfacce indipendenti dal database.

![JDBC](https://raw.githubusercontent.com/maboglia/CorsoJava/master/appunti/img/Language/01_lang_base/02_classe_base/function.png)

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
