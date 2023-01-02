L'interfaccia Statement
-------------------------

Il linguaggio SQL comprende istruzioni utili per interagire con una base di dati.

In particolare, mediante SQL è possibile compiere tre principali operazioni:

1. Eseguire selezioni e ricerche all'interno di una o più tabelle, con l'istruzione SELECT.
2. Modificare il contenuto di una tabella, con istruzioni come DELETE, INSERT e UPDATE.
3. Modificare la struttura del database, ad esempio con CREATE TABLE.

---

L'interfaccia `java.sql.Statement` comprende i metodi necessari per fornire al DBMS le istruzioni SQL appena descritte:

* `executeQuery()` commissiona le istruzioni di tipo SELECT.
* `executeUpdate()` commissiona le istruzioni di aggiornamento delle tabelle (DELETE, INSERT e UPDATE) e della base di dati (CREATE TABLE, INDEX e così via).

---

## metodo executeQuery()

* `executeQuery()` restituisce sempre un oggetto che implementa l'interfaccia **java.sql.ResultSet**. Grazie ad essa è possibile prendere in esame i risultati restituiti dall'istruzione SQL di ricerca commissionata ad DBMS.

## metodo executeUpdate()

* `executeUpdate()`, non ha risultati da restituire.
* ritorna un **intero** che riporta il numero delle righe coinvolte dall'esecuzione di istruzioni di tipo DELETE, INSERT e UPDATE.
* dove non c'è nulla da restituire, il valore di ritorno sarà 0 (zero).

---

PreparedStatement
-------------------

Codice SQL più semplice con PreparedStatement 

L'interfaccia **java.sql.PreparedStatement**, che estende **Statement**, permette di concepire più semplicemente e velocemente il codice SQL per l'interazione con il DB.

[esempio input errato/malizioso]()

L'interfaccia **PreparedStatement** permette di scrivere **codice SQL parametrico**, sostituendo i dati in input concatenati via stringa con dei caratteri di punto interrogativo. 

Fatto ciò, è possibile impostare uno ad uno i parametri espressi attraverso i metodi setter esposti da **PreparedStatement**. 

Questi metodi permettono di inserire i parametri senza preoccuparsi della conflittualità dei loro contenuti: sarà JDBC, in collaborazione con il driver dello specifico DBMS, a risolvere ogni problema. 

I setter di **PreparedStatement**, un po' come i getter di **ResultSet**, esistono per i principali tipi di Java.

---

Il seguente elenco li riassume:

*   `setBoolean(int p, boolean value)` Imposta il booleano value come valore del parametro alla posizione p.
*   `setByte(int p, byte value)` Imposta il byte value come valore del parametro alla posizione p.
*   `setDate(int p, Date value)` Imposta l'oggetto java.util.Date value come valore del parametro alla posizione p.
*   `setDouble(int p, double value)` Imposta il double value come valore del parametro alla posizione p.
*   `setFloat(int p, float value)` Imposta il float value come valore del parametro alla posizione p.
*   `setInt(int p, int value)` Imposta l'intero value come valore del parametro alla posizione p.
*   `setLong(int p, long value)` Imposta il long value come valore del parametro alla posizione p.
*   `setShort(int p, short value)` Imposta lo short value come valore del parametro alla posizione p.
*   `setString(int p, String value)` Imposta la stringa value come valore del parametro alla posizione p.

---

Le **PreparedStatement**, oltre a risolvere i problemi illustrati, garantiscono inoltre maggiori prestazioni ed un alto grado di riusabilità. Quando si prepara un oggetto di questo tipo, infatti, il suo codice SQL viene precompilato.

La medesima **PreparedStatement**, inoltre, può essere sfruttata più volte consecutivamente, cambiando semplicemente i parametri attraverso i suoi metodi setter per ottenere risultati diversi, senza dover ogni volta riprocessare il codice SQL che le compone, come avverrebbe con una Statement classica.

Per lavorare con un oggetto **PreparedStatement** in luogo di un semplice Statement è necessario chiamare:

`PreparedStatement statement = connection.prepareStatement(CODICE\_SQL);` 
al posto di

`Statement statement = connection.createStatement();`

---

Il codice SQL, con **PreparedStatement**, va specificato al momento della creazione dell'oggetto, e non quando si richiamano i metodi executeQuery() o executeUpdate(). Le due varianti di questi metodi offerte da PreparedStatement, infatti, sono prive di argomenti.

L'esempio del paragrafo precedente può allora essere riscritto alla seguente maniera:

```java

// Questo metodo aggiunge un nuovo record alla tabella nel DB.
private static boolean aggiungiRecord(String nome, String cognome, String indirizzo) { // Preparo il riferimento alla connessione.
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

```

CallableStatement
-------------------

Richiamare le procedure memorizzate con `CallableStatement`

L'interfaccia `CallableStatement` estende `PreparedStatement`, e permette di richiamare delle procedure memorizzate all'interno del database.

Una query, con `CallableStatement`, non deve essere specificata in linea all'interno del codice Java, ma può essere memorizzata perennemente all'interno della base di dati, pronta ad essere sfruttata più e più volte, in tutte le parti di tutte le applicazioni realizzate.

Si crei un database inizialmente vuoto, quindi si inserisca al suo interno una tabella, nominata Utenti. La struttura è riportata di seguito:

* ID, di tipo Contatore, da impiegare come chiave primaria.
* Nome, di tipo Testo.
* Cognome, di tipo Testo.
* Email, di tipo Testo.
* AnnoNascita, di tipo Numerico.

Si popoli la tabella con qualche record arbitrario

```java

// Mi preparo a richiamare la procedura memorizzata.
CallableStatement statement = connection.prepareCall( "{call NotNullMail}" );
// Interrogo il DBMS.
ResultSet resultset = statement.executeQuery();
// Scorro e mostro i risultati.
while (resultset.next()) {
    int id = resultset.getInt(1);
    String nome = resultset.getString(2);
    String cognome = resultset.getString(3);
    String email = resultset.getString(4);
    int annoNascita = resultset.getInt(5);
    System.out.println("Lette informazioni...");
    System.out.println("ID: " + id);
    System.out.println("Nome: " + nome);
    System.out.println("Cognome: " + cognome);
    System.out.println("Email: " + email);
    System.out.println("Anno di nascita: " + annoNascita);
    System.out.println();
}

```

```java

// Mi preparo a richiamare la procedura memorizzata.
CallableStatement statement = connection.prepareCall( "{call AnnoNascita(?,?)}" );
// Imposto i parametri.
statement.setInt(1, 1969);
statement.setInt(2, 1989);
// Interrogo il DBMS.
ResultSet resultset = statement.executeQuery();
// Scorro e mostro i risultati.
while (resultset.next()) {
    int id = resultset.getInt(1);
    String nome = resultset.getString(2);
    String cognome = resultset.getString(3);
    String email = resultset.getString(4);
    int annoNascita = resultset.getInt(5);
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
