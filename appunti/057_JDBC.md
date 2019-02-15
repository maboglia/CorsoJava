JDBC
------

L'impiego di JDBC è semplice, e solitamente si articola attraverso quattro passi:

1. Per prima cosa, è necessario caricare il driver idoneo per l'utilizzo del particolare database che si intende sfruttare. Può essere caricato un apposito driver JDBC installato in precedenza nel sistema, oppure può essere sfruttato il ponte JDBCODBC. Non è importante il nome o il funzionamento interno del particolare driver selezionato: l'interfaccia di programmazione sarà sempre la medesima.
---
2. Si apre una connessione verso il particolare database necessario all'applicazione, sfruttando il driver caricato al passo precedente.
---
3. Si impiegano l'interfaccia di JDBC ed il linguaggio SQL per interagire con la base di dati. Generalmente, viene sottoposta al DBMS una query volta all'ottenimento di alcuni risultati.
---
4. I risultati ottenuti possono essere manipolati sfruttando le classi JDBC e del codice Java studiato per il compito.


Si realizzi la tabella che sarà impiegata per il test, sfruttando il seguente codice SQL:

```java
CREATE TABLE Persone (
Nome VARCHAR (50) NOT NULL,
Cognome VARCHAR (50) NOT NULL,
Indirizzo VARCHAR (50) NOT NULL
);

```
---

```java

import java.sql.*;
public class JDBCTest1 {
public static void main(String[] args) {
// Nome del driver.
String DRIVER = "com.mysql.jdbc.Driver";
// Indirizzo del database.
String DB_URL = "jdbc:mysql://localhost:3306/javatest";
try {
// Carico il driver. Da JDBC 4 non è più necessario...
Class.forName(DRIVER);
} catch (ClassNotFoundException e1) {
// Il driver non può essere caricato.
System.out.println("Driver non trovato...");
System.exit(1);
}
```
---

```java
// Preparo il riferimento alla connessione.
Connection connection = null;
try {
// Apro la connesione verso il database.
connection = DriverManager.getConnection(DB_URL);
// Ottengo lo Statement per interagire con il database.
Statement statement = connection.createStatement();
// Interrogo il DBMS mediante una query SQL.
ResultSet resultset = statement.executeQuery(
"SELECT Nome, Cognome, Indirizzo FROM Persone"
);
```
---

```java
// Scorro e mostro i risultati.
while (resultset.next()) {
String nome = resultset.getString(1);
String cognome = resultset.getString(2);
String indirizzo = resultset.getString(3);
System.out.println("Lette informazioni...");
System.out.println("Nome: " + nome);
System.out.println("Cognome: " + cognome);
System.out.println("Indirizzo: " + indirizzo);
System.out.println();
}
} catch (SQLException e) {
// In caso di errore...
} finally {
if (connection != null) {
try {
connection.close();
} catch (Exception e) {
}
}
}
}
}

```
---

connettersi ad un database
----------------------------

Per connettersi ad un database è prima di tutto necessario caricare in memoria il driver corrispondente, affinché questo sia già disponibile nel momento in cui si richiederanno ulteriori servizi. Da JDBC 4 non è più necessario. La sintassi per effettuare l'operazione è la seguente:

```java

Class.forName(stringa_driver);

```
---

java.sql.Connection
---------------------

A questo punto entrano in gioco l'interfaccia java.sql.Connection e la classe java.sql.DriverManager. La prima descrive le funzionalità necessarie per entrare in comunicazione con uno specifico database, mentre DriverManager offre una serie di metodi statici, utili per stabilire qualsiasi tipo di connessione consentita dai driver JDBC già caricati in memoria. Il modello generalmente osservato dai programmatori Java è il seguente:

```java

	Connection conn = DriverManager.getConnection(url_database);

```
---

Una volta ottenuta una connessione attiva, diventa possibile sfruttare i metodi descritti da Connection. I più frequentemente utilizzati sono:  

*   close(). Chiude la connessione.
  
*   createStatement(). Crea e restituisce un oggetto java.sql.Statement, utile per
interagire con il database mediante dei comandi SQL.
---

L'interfaccia Statement
-------------------------

Il linguaggio SQL comprende istruzioni utili per interagire con una base di dati. 
In particolare, mediante SQL è possibile compiere tre principali operazioni: 
1. Eseguire selezioni e ricerche all'interno di una o più tabelle, con l'istruzione SELECT. 
2. Modificare il contenuto di una tabella, con istruzioni come DELETE, INSERT e UPDATE. 
3. Modificare la struttura del database, ad esempio con CREATE TABLE.

L'interfaccia java.sql.Statement comprende i metodi necessari per fornire al DBMS le istruzioni SQL appena descritte:

*   executeQuery() commissiona le istruzioni di tipo SELECT.
*   executeUpdate() commissiona le istruzioni di aggiornamento delle tabelle
(DELETE, INSERT e UPDATE) e della base di dati (CREATE TABLE, INDEX e così via).
---

metodo executeQuery()
-----------------------

Il metodo executeQuery() restituisce sempre un oggetto che implementa l'interfaccia java.sql.ResultSet. Grazie ad essa è possibile prendere in esame i risultati restituiti dall'istruzione SQL di ricerca commissionata ad DBMS. executeUpdate(), al contrario, non ha risultati da restituire. Nonostante questo, è possibile ottenere indietro un intero che riporta il numero delle righe coinvolte dall'esecuzione di istruzioni di tipo DELETE, INSERT e UPDATE. Negli altri casi, dove realmente non c'è nulla da restituire, tale valore di ritorno sarà sempre 0 (zero).
---

L'interfaccia ResultSet
-------------------------

* L'interfaccia java.sql.ResultSet comprende i metodi indispensabili per scorrere l'insieme dei risultati restituiti da una query SQL. 
* Il metodo next() scorre in avanti tale insieme. 
* Si supponga di aver eseguito una query che restituisce due record. 
* Inizialmente, il cursore del corrente oggetto ResultSet sarà posizionato antecedentemente al primo dei due record restituiti. 
* In questa condizione, non è possibile svolgere operazioni di analisi dei risultati, giacché nessun record è puntato dal cursore corrente. 
* Una prima chiamata a next() farà in modo che il cursore venga spostato sul primo record restituito dalla query. 
* Ogni volta che un record è puntato dal cursore, diventa possibile estrapolarne i contenuti. 
---

* Una seconda chiamata a next() sposterà il cursore in avanti di una posizione. 
* A questo punto, il secondo (ed ultimo) record ottenuto potrà essere esaminato ed utilizzato. 
* Una terza chiamata a next() porterà il cursore oltre l'ultimo record disponibile. 
* Si ritorna, così, ad una condizione simile a quella iniziale, quando nessun record era puntato. 
* Il metodo next() fornisce un'ulteriore funzionalità: restituisce un valore booleano che è true quando un record è puntato, false in caso contrario. 
* In termini pratici, un intero ResultSet può essere passato in rassegna con un codice del tipo:

while (resultSet.next()) { // Esamina il record corrente. }
---

Un ciclo di questo tipo termina non appena tutti i record restituiti dalla query eseguita sono stati passati in rassegna. Quando un record è correttamente puntato dal cursore, è possibile esaminare i suoi campi attraverso dei metodi che hanno tutti la forma: getTipo(int indiceColonna)

Ad esempio, si supponga di voler ottenere il contenuto del primo campo del record corrente, sotto forma di stringa: String stringa = resultSet.getString(1); Se si conoscono i nomi associati ai singoli campi del record, è possibile usare la variante: getTipo(String nomeColonna)
---

Ad esempio: String stringa = resultSet.getString("Nome"); Il seguente elenco riporta i metodi di questa famiglia più frequentemente utilizzati:

*   getBoolean(). Restituisce il campo specificato sotto forma di boolean.
*   getByte(). Restituisce il campo specificato sotto forma di byte.
*   getDate(). Restituisce il campo specificato sotto forma di oggetto java.util.Date.
*   getDouble(). Restituisce il campo specificato sotto forma di double.
*   getFloat(). Restituisce il campo specificato sotto forma di float.
*   getInt(). Restituisce il campo specificato sotto forma di int.
*   getLong(). Restituisce il campo specificato sotto forma di long.
*   getShort(). Restituisce il campo specificato sotto forma di short.
*   getString(). Restituisce il campo specificato sotto forma di oggetto java.lang.String.
---

Il seguente codice aggiorna la tabella Persone del database in uso, creando automaticamente un nuovo record.

```java

import java.io.*;
import java.sql.*;
public class JDBCTest4 {
// Nome del driver.
private static final String DRIVER = "com.mysql.jdbc.Driver";
// Indirizzo del database.
private static final String DB_URL = "jdbc:mysql://localhost:3306/javatest";
// Questo metodo aggiunge un nuovo record alla tabella nel DB.
private static boolean aggiungiRecord(String nome, String cognome,
String indirizzo) {
// Preparo il riferimento alla connessione.
Connection connection = null;
try {
// Apro la connesione verso il database.
connection = DriverManager.getConnection(DB_URL);
```
---

```java
// Ottengo lo Statement per interagire con il database.
Statement statement = connection.createStatement();
// Aggiungo il nuovo record.
statement.executeUpdate(
"INSERT INTO Persone ( " +
" Nome, Cognome, Indirizzo " +
") VALUES ( " +
" '" + nome + "', " +
" '" + cognome + "', " +
" '" + indirizzo + "' " +
")"
);
return true;
} catch (SQLException e) {
// In caso di errore...
return false;
} finally {
if (connection != null) {
try {
connection.close();
} catch (Exception e) {
}
}
}
}
```
---

```java

public static void main(String[] args) throws IOException {
try {
// Carico il driver.
Class.forName(DRIVER);
} catch (ClassNotFoundException e1) {
// Il driver non può essere caricato.
System.out.println("Driver non trovato...");
System.exit(1);
}
// Interagisco con l'utente.
BufferedReader reader = new BufferedReader(
new InputStreamReader(System.in)
);
while (true) {
System.out.print("Nome: ");
String nome = reader.readLine();
System.out.print("Cognome: ");
String cognome = reader.readLine();
System.out.print("Indirizzo: ");
String indirizzo = reader.readLine();
System.out.println();
```
---

```java
if (aggiungiRecord(nome, cognome, indirizzo)) {
System.out.println("Record aggiunto!");
} else {
System.out.println("Errore!");
}
System.out.println();
String ris;
do {
System.out.print("Vuoi aggiungerne un altro (si/no)? ");
ris = reader.readLine();
} while (!ris.equals("si") && !ris.equals("no"));
if (ris.equals("no")) {
break;
}
System.out.println();
}
}
}

```
---

executeUpdate
---------------

Come è possibile osservare, in questo caso si è fatto ricorso al metodo executeUpdate() di Statement. L'operazione richiesta, infatti, rientra nella categoria degli aggiornamenti, e non in quella delle query.
---

PreparedStatement
-------------------

Codice SQL più semplice con PreparedStatement L'interfaccia java.sql.PreparedStatement, che estende la già nota Statement, permette di concepire più semplicemente e velocemente il codice SQL per l'interazione con il DB.

L'elaborazione di query e di istruzioni di aggiornamento, infatti, spesso comporta alcuni problemi di conflitto. Si prenda in considerazione la classe JDBCTest4, elaborata nel corso del paragrafo predente. Dopo aver avviato il programma si inseriscano i seguenti dati:

Nome: Franco Cognome: Neri Indirizzo: Corso Massimo d'Azeglio 1 Consegnati i dati non si potrà non ottenere il messaggio: Errore!

Perché? Il problema è tutto nel dato: Corso Massimo d'Azeglio 1
---

Questa stringa contiene un carattere particolare: l'apice, usato come apostrofo tra L e Azeglio. Si torni ad esaminare il codice SQL generato nel metodo aggiungiRecord() e dato in pasto ad executeUpdate():

statement.executeUpdate( "INSERT INTO Persone ( " + " Nome, Cognome, Indirizzo " + ") VALUES ( " + " '" + nome + "', " + " '" + cognome + "', " + " '" + indirizzo + "' " + ")" );

Sostituendo manualmente i dati si ottiene l'istruzione SQL: INSERT INTO Persone ( Nome, Cognome, Indirizzo ) VALUES ( 'Franco', 'Grigi', 'Corso Massimo d'Azeglio 1' ) Il problema è chiaramente qui: 'Corso Massimo d'Azeglio 1'

L'apice usato come apostrofo termina la stringa SQL, causando un errore di interpretazione del codice.
---

In casi come questo si può scegliere di eseguire la sostituzione dei caratteri problematici, tecnica consentita dai differenti dialetti SQL esistenti. Ad esempio per MySQL è valido correggere le stringhe inserite dagli utenti con l'inserimento di sequenze di backslash: 'Via L\\'Azeglio 18'

Tuttavia questa soluzione non è né maneggevole né affidabile. JDBC offre di meglio.

L'interfaccia PreparedStatement permette di scrivere codice SQL parametrico, sostituendo i dati in input concatenati via stringa con dei caratteri di punto interrogativo. L'istruzione di inserimento prima mostrata può essere così riscritta:
---

"INSERT INTO Persone ( " + " Nome, Cognome, Indirizzo " + ") VALUES ( " + " ?, ?, ? " + ")"

Fatto ciò, è possibile impostare uno ad uno i parametri espressi attraverso i metodi setter esposti da PreparedStatement. Questi metodi permettono di inserire i parametri senza preoccuparsi della conflittualità dei loro contenuti: sarà JDBC, in collaborazione con il driver dello specifico DBMS, a risolvere ogni problema. I setter di PreparedStatement, un po' come i getter di ResultSet, esistono per i principali tipi di Java. 
---

Il seguente elenco li riassume:

*   setBoolean(int p, boolean value). Imposta il booleano value come valore del parametro alla posizione p.
*   setByte(int p, byte value). Imposta il byte value come valore del parametro alla posizione p.
*   setDate(int p, Date value). Imposta l'oggetto java.util.Date value come valore del parametro alla posizione p.
*   setDouble(int p, double value). Imposta il double value come valore del parametro alla posizione p.
*   setFloat(int p, float value). Imposta il float value come valore del parametro alla posizione p.
*   setInt(int p, int value). Imposta l'intero value come valore del parametro alla posizione p.
*   setLong(int p, long value). Imposta il long value come valore del parametro alla posizione p.
*   setShort(int p, short value). Imposta lo short value come valore del parametro alla posizione p.
*   setString(int p, String value). Imposta la stringa value come valore del parametro alla posizione p.

---
Le PreparedStatement, oltre a risolvere i problemi illustrati, garantiscono inoltre maggiori prestazioni ed un alto grado di riusabilità. Quando si prepara un oggetto di questo tipo, infatti, il suo codice SQL viene precompilato.

La medesima PreparedStatement, inoltre, può essere sfruttata più volte consecutivamente, cambiando semplicemente i parametri attraverso i suoi metodi setter per ottenere risultati diversi, senza dover ogni volta riprocessare il codice SQL che le compone, come avverrebbe con una Statement classica.

Per lavorare con un oggetto PreparedStatement in luogo di un semplice Statement è necessario chiamare:

PreparedStatement statement = connection.prepareStatement(CODICE\_SQL); in luogo di

Statement statement = connection.createStatement();
---

Il codice SQL, con PreparedStatement, va specificato al momento della creazione dell'oggetto, e non quando si richiamano i metodi executeQuery() o executeUpdate(). Le due varianti di questi metodi offerte da PreparedStatement, infatti, sono prive di argomenti.

L'esempio del paragrafo precedente può allora essere riscritto alla seguente maniera:

```java


import java.io.*;
import java.sql.*;
public class JDBCTest5 {
// Nome del driver.
private static final String DRIVER = "com.mysql.jdbc.Driver";
// Indirizzo del database.
private static final String DB_URL = "jdbc:mysql://localhost:3306/javatest";
// Questo metodo aggiunge un nuovo record alla tabella nel DB.
private static boolean aggiungiRecord(String nome, String cognome,
String indirizzo) {
// Preparo il riferimento alla connessione.
Connection connection = null;
try {
// Apro la connesione verso il database.
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
} catch (SQLException e) {
// In caso di errore...
return false;
} finally {
if (connection != null) {
try {
connection.close();
} catch (Exception e) {
}
}
}
}
public static void main(String[] args) throws IOException {
try {
// Carico il driver.
Class.forName(DRIVER);
} catch (ClassNotFoundException e1) {
// Il driver non può essere caricato.
System.out.println("Driver non trovato...");
System.exit(1);
}
// Interagisco con l'utente.
BufferedReader reader = new BufferedReader(
new InputStreamReader(System.in)
);
while (true) {
System.out.print("Nome: ");
String nome = reader.readLine();
System.out.print("Cognome: ");
String cognome = reader.readLine();
System.out.print("Indirizzo: ");
String indirizzo = reader.readLine();
System.out.println();
if (aggiungiRecord(nome, cognome, indirizzo)) {
System.out.println("Record aggiunto!");
} else {
System.out.println("Errore!");
}
System.out.println();
String ris;
do {
System.out.print("Vuoi aggiungerne un altro (si/no)? ");
ris = reader.readLine();
} while (!ris.equals("si") && !ris.equals("no"));
if (ris.equals("no")) {
break;
}
System.out.println();
}
}
}

```

CallableStatement
-------------------

Richiamare le procedure memorizzate con CallableStatement Con PreparedStatement, come si è appurato, è possibile sfruttare delle istruzioni SQL precompilate, che garantiscono migliori prestazioni e maggiore chiarezza. Le query desiderate sono date in pasto al DBMS al momento della creazione di un oggetto PreparedStatement, e possono poi essere ripetutamente sfruttate quante volte si desidera. Tuttavia, JDBC ed il DBMS devono ricompilare la medesima istruzione SQL ogni volta che l'oggetto viene ricreato. Si può fare di meglio, se il DBMS lo permette, ottenendo incrementi ancora più significativi sia nelle prestazioni sia nella semplicità del codice..

L'interfaccia CallableStatement estende PreparedStatement, e permette di richiamare delle procedure memorizzate all'interno del database. Una query, con CallableStatement, non deve essere specificata in linea all'interno del codice Java, ma può essere memorizzata perennemente all'interno della base di dati, pronta ad essere sfruttata più e più volte, in tutte le parti di tutte le applicazioni realizzate.

Si crei un database inizialmente vuoto, quindi si inserisca al suo interno una tabella, nominata Utenti. La struttura è riportata di seguito:

*   ID, di tipo Contatore, da impiegare come chiave primaria.
*   Nome, di tipo Testo.
*   Cognome, di tipo Testo.
*   Email, di tipo Testo.
*   AnnoNascita, di tipo Numerico.
Si popoli la tabella con qualche record arbitrario

```java

import java.sql.*;
public class JDBCTest6 {
public static void main(String[] args) {
// Nome del driver.
String DRIVER = "sun.jdbc.odbc.JdbcOdbcDriver";
// Indirizzo del database.
String DB_URL = "jdbc:odbc:javatest2";
try {
// Carico il driver.
Class.forName(DRIVER);
} catch (ClassNotFoundException e1) {
// Il driver non può essere caricato.
System.out.println("Driver non trovato...");
System.exit(1);
}
// Preparo il riferimento alla connessione.
Connection connection = null;
try {
// Apro la connesione verso il database.
connection = DriverManager.getConnection(DB_URL);
// Mi preparo a richiamare la procedura memorizzata.
CallableStatement statement = connection.prepareCall(
"{call NotNullMail}"
);
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
} catch (SQLException e) {
// In caso di errore...
} finally {
if (connection != null) {
try {
connection.close();
} catch (Exception e) {
}
}
}
}
}

```

```java

import java.sql.*;
public class JDBCTest7 {
public static void main(String[] args) {
// Nome del driver.
String DRIVER = "sun.jdbc.odbc.JdbcOdbcDriver";
// Indirizzo del database.
String DB_URL = "jdbc:odbc:javatest2";
try {
// Carico il driver.
Class.forName(DRIVER);
} catch (ClassNotFoundException e1) {
// Il driver non può essere caricato.
System.out.println("Driver non trovato...");
System.exit(1);
}
// Preparo il riferimento alla connessione.
Connection connection = null;
try {
// Apro la connesione verso il database.
connection = DriverManager.getConnection(DB_URL);
// Mi preparo a richiamare la procedura memorizzata.
CallableStatement statement = connection.prepareCall(
"{call AnnoNascita(?,?)}"
);
// Imposto i parametri.
statement.setInt(1, 1960);
statement.setInt(2, 1980);
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
} catch (SQLException e) {
// In caso di errore...
} finally {
if (connection != null) {
try {
connection.close();
} catch (Exception e) {
}
}
}
}
}

```