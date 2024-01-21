# L'interfaccia Statement in JDBC

Il linguaggio SQL offre un insieme di istruzioni fondamentali per interagire con un database. Tra le principali operazioni supportate vi sono:

1. **Selezione e Ricerca:** Utilizzando l'istruzione SELECT è possibile effettuare interrogazioni su una o più tabelle.
2. **Modifica del Contenuto:** Le istruzioni DELETE, INSERT e UPDATE permettono di modificare i dati all'interno di una tabella.
3. **Modifica della Struttura:** Operazioni come CREATE TABLE consentono di alterare la struttura del database.

L'interfaccia `java.sql.Statement` fornisce i metodi necessari per inviare tali istruzioni SQL al Database Management System (DBMS):

* Il metodo `executeQuery()` viene utilizzato per eseguire istruzioni di tipo SELECT.
* Il metodo `executeUpdate()` viene impiegato per eseguire istruzioni di aggiornamento delle tabelle (DELETE, INSERT, UPDATE) e del database (CREATE TABLE, INDEX, ecc.).

## Metodo `executeQuery()`

* Il metodo `executeQuery()` restituisce sempre un oggetto che implementa l'interfaccia **java.sql.ResultSet**. Questo oggetto consente di esaminare i risultati restituiti dall'istruzione SQL di ricerca eseguita dal DBMS.

## Metodo `executeUpdate()`

* Diversamente, il metodo `executeUpdate()` non restituisce risultati.
* Ritorna un valore di tipo **int**, che rappresenta il numero di righe coinvolte nell'esecuzione di istruzioni di tipo DELETE, INSERT e UPDATE.
* Nel caso in cui non ci siano righe da restituire (ad esempio, in operazioni di creazione o modifica della struttura del database), il valore di ritorno sarà 0 (zero).

---

# PreparedStatement in JDBC

Miglioramento del Codice SQL con PreparedStatement

L'interfaccia **java.sql.PreparedStatement**, una sottoclasse di **Statement**, semplifica e velocizza la gestione del codice SQL nelle interazioni con il database.

[esempio input errato/malizioso]()

**PreparedStatement** consente di implementare **codice SQL parametrico**, sostituendo i dati in input concatenati tramite stringhe con caratteri di punto interrogativo.

Dopo questa operazione, è possibile impostare uno ad uno i parametri utilizzando i metodi setter forniti da **PreparedStatement**.

Tali metodi permettono di inserire i parametri senza preoccuparsi della sicurezza dei loro contenuti: JDBC, in collaborazione con il driver del DBMS specifico, si occupa di risolvere eventuali problematiche.

I setter di **PreparedStatement**, simili ai getter di **ResultSet**, coprono i principali tipi di dato di Java. Un elenco riassuntivo è il seguente:

* `setBoolean(int p, boolean value)` - Imposta il booleano value come valore del parametro alla posizione p.
* `setByte(int p, byte value)` - Imposta il byte value come valore del parametro alla posizione p.
* `setDate(int p, Date value)` - Imposta l'oggetto java.util.Date value come valore del parametro alla posizione p.
* `setDouble(int p, double value)` - Imposta il double value come valore del parametro alla posizione p.
* `setFloat(int p, float value)` - Imposta il float value come valore del parametro alla posizione p.
* `setInt(int p, int value)` - Imposta l'intero value come valore del parametro alla posizione p.
* `setLong(int p, long value)` - Imposta il long value come valore del parametro alla posizione p.
* `setShort(int p, short value)` - Imposta lo short value come valore del parametro alla posizione p.
* `setString(int p, String value)` - Imposta la stringa value come valore del parametro alla posizione p.

**PreparedStatement**, oltre a risolvere le problematiche esposte, offre maggiori prestazioni e riusabilità. Quando si crea un oggetto di questo tipo, il relativo codice SQL viene precompilato.

Inoltre, la stessa **PreparedStatement** può essere riutilizzata più volte consecutivamente, consentendo di variare i parametri tramite i suoi metodi setter per ottenere risultati differenti, senza la necessità di ricompilare ogni volta il codice SQL, come avverrebbe con uno Statement tradizionale.

Per utilizzare un oggetto **PreparedStatement** invece di uno Statement convenzionale, è sufficiente sostituire:

```java
Statement statement = connection.createStatement();
```

con:

```java
PreparedStatement statement = connection.prepareStatement(CODICE_SQL);
```

Il codice SQL deve essere specificato al momento della creazione dell'oggetto **PreparedStatement**, non al momento dell'esecuzione dei metodi executeQuery() o executeUpdate(). Le versioni di questi metodi offerte da PreparedStatement, infatti, non richiedono argomenti.

Di seguito è riportato un esempio riscritto utilizzando **PreparedStatement**:

```java
// Questo metodo aggiunge un nuovo record alla tabella nel DB.
private static boolean aggiungiRecord(String nome, String cognome, String indirizzo) {
    // Preparo il riferimento alla connessione.
    Connection connection = null;
    try {
        // Apro la connessione verso il database.
        connection = DriverManager.getConnection(DB_URL);
        // Preparo lo Statement per interagire con il database.
        PreparedStatement statement = connection.prepareStatement(
            "INSERT INTO Persone ( " +
            " Nome, Cognome, Indirizzo " +
            ") VALUES ( " +
            " ?, ?, ? " +
            ")"
        );
        // Imposto i parametri.
        statement.setString(1, nome);
        statement.setString(2, cognome);
        statement.setString(3, indirizzo);
        // Eseguo l'aggiornamento.
        statement.executeUpdate();
        return true;
    } //...
}
```

# CallableStatement in JDBC

Chiamare le Procedure Memorizzate con `CallableStatement`

L'interfaccia `CallableStatement`, che estende `PreparedStatement`, consente di richiamare procedure memorizzate all'interno del database.

Con `CallableStatement`, non è necessario specificare la query direttamente nel codice Java. La query può essere memorizzata in modo permanente nel database, pronta per essere riutilizzata in tutte le parti di tutte le applicazioni.

Per illustrare l'utilizzo di `CallableStatement`, supponiamo di avere un database inizialmente vuoto con una tabella chiamata "Utenti". La struttura della tabella è la seguente:

* ID: di tipo Contatore, utilizzato come chiave primaria.
* Nome: di tipo Testo.
* Cognome: di tipo Testo.
* Email: di tipo Testo.
* AnnoNascita: di tipo Numerico.

Popoliamo la tabella con alcuni record arbitrari:

```java
// Mi preparo a richiamare la procedura memorizzata.
CallableStatement statement = connection.prepareCall("{call NotNullMail}");
// Interrogo il DBMS.
ResultSet resultSet = statement.executeQuery();
// Scorro e mostro i risultati.
while (resultSet.next()) {
    int id = resultSet.getInt(1);
    String nome = resultSet.getString(2);
    String cognome = resultSet.getString(3);
    String email = resultSet.getString(4);
    int annoNascita = resultSet.getInt(5);
    System.out.println("Lette informazioni...");
    System.out.println("ID: " + id);
    System.out.println("Nome: " + nome);
    System.out.println("Cognome: " + cognome);
    System.out.println("Email: " + email);
    System.out.println("Anno di nascita: " + annoNascita);
    System.out.println();
}
```

Nel secondo esempio, prepariamo la chiamata a una procedura memorizzata con parametri:

```java
// Mi preparo a richiamare la procedura memorizzata.
CallableStatement statement = connection.prepareCall("{call AnnoNascita(?,?)}");
// Imposto i parametri.
statement.setInt(1, 1969);
statement.setInt(2, 1989);
// Interrogo il DBMS.
ResultSet resultSet = statement.executeQuery();
// Scorro e mostro i risultati.
while (resultSet.next()) {
    int id = resultSet.getInt(1);
    String nome = resultSet.getString(2);
    String cognome = resultSet.getString(3);
    String email = resultSet.getString(4);
    int annoNascita = resultSet.getInt(5);
    System.out.println("Lette informazioni...");
    System.out.println("ID: " + id);
    System.out.println("Nome: " + nome);
    System.out.println("Cognome: " + cognome);
    System.out.println("Email: " + email);
    System.out.println("Anno di nascita: " + annoNascita);
    System.out.println();
}
//...
```

L'esempio dimostra come utilizzare `CallableStatement` per chiamare una procedura memorizzata con e senza parametri. Questo approccio offre un modo flessibile per gestire logicamente le operazioni del database in modo efficiente.
