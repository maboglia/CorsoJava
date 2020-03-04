
JDBC
------

L'impiego di JDBC solitamente si articola attraverso quattro passi:

1. Per prima cosa, è necessario caricare il **driver** idoneo per l'utilizzo del particolare database che si intende sfruttare. Può essere caricato un apposito driver JDBC installato in precedenza nel sistema, oppure può essere sfruttato il ponte JDBC-ODBC. Non è importante il nome o il funzionamento interno del particolare driver selezionato: l'interfaccia di programmazione sarà sempre la medesima.

2. Si **apre una connessione** verso il particolare database necessario all'applicazione, sfruttando il driver caricato al passo precedente.

3. Si impiegano l'**interfaccia di JDBC** ed il linguaggio **SQL** per interagire con la base di dati. Generalmente, viene sottoposta al DBMS una query volta all'ottenimento di alcuni risultati.

4. I risultati ottenuti possono essere manipolati sfruttando le classi JDBC e del codice Java studiato per il compito.
---


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
	/*try {
	// Carico il driver. Da JDBC 4 non è più necessario...
	Class.forName(DRIVER);
	} catch (ClassNotFoundException e1) {
	// Il driver non può essere caricato.
	System.out.println("Driver non trovato...");
	System.exit(1);
	}*/
// Preparo il riferimento alla connessione.
Connection connection = null;
try {
// Apro la connessione verso il database.
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

Da JDBC 4 non è più necessario caricare in memoria il driver corrispondente,  questo è già disponibile. 
Comunque, la sintassi per effettuare l'operazione è la seguente:

```java

Class.forName(stringa_driver);

```
---

java.sql.Connection
---------------------

A questo punto entrano in gioco 
* l'interfaccia `java.sql.Connection` 
* e la classe `java.sql.DriverManager`. 

La prima descrive le funzionalità necessarie per entrare in comunicazione con uno specifico database, mentre `DriverManager` offre una serie di metodi statici, utili per stabilire qualsiasi tipo di connessione consentita dai driver `JDBC` già caricati in memoria. 

Il modello generalmente osservato è il seguente:

```java

	Connection conn = DriverManager.getConnection(url_database);

```
---

Una volta ottenuta una connessione attiva, diventa possibile sfruttare i metodi descritti da `Connection`. I più frequentemente utilizzati sono:  

 
*   createStatement(). Crea e restituisce un oggetto java.sql.Statement, utile per interagire con il database mediante dei comandi SQL.
*   close(). Chiude la connessione.

---

L'interfaccia Statement
-------------------------

Il linguaggio SQL comprende istruzioni utili per interagire con una base di dati. 

In particolare, mediante SQL è possibile compiere tre principali operazioni: 

1. Eseguire selezioni e ricerche all'interno di una o più tabelle, con l'istruzione SELECT. 
2. Modificare il contenuto di una tabella, con istruzioni come DELETE, INSERT e UPDATE. 
3. Modificare la struttura del database, ad esempio con CREATE TABLE.

---

L'interfaccia java.sql.Statement comprende i metodi necessari per fornire al DBMS le istruzioni SQL appena descritte:

*   executeQuery() commissiona le istruzioni di tipo SELECT.
*   executeUpdate() commissiona le istruzioni di aggiornamento delle tabelle (DELETE, INSERT e UPDATE) e della base di dati (CREATE TABLE, INDEX e così via).

---

## metodo executeQuery()


* `executeQuery()` restituisce sempre un oggetto che implementa l'interfaccia **java.sql.ResultSet**. Grazie ad essa è possibile prendere in esame i risultati restituiti dall'istruzione SQL di ricerca commissionata ad DBMS.

## metodo executeUpdate()

* `executeUpdate()`, non ha risultati da restituire. Nonostante questo, è possibile ottenere indietro un intero che riporta il numero delle righe coinvolte dall'esecuzione di istruzioni di tipo DELETE, INSERT e UPDATE. Negli altri casi, dove realmente non c'è nulla da restituire, tale valore di ritorno sarà sempre 0 (zero).

---

L'interfaccia ResultSet
-------------------------

* L'interfaccia **java.sql.ResultSet** comprende i metodi indispensabili per scorrere l'insieme dei risultati restituiti da una query SQL. 
* Il metodo **next()** scorre in avanti tale insieme. 
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

`while (resultSet.next()) { // Esamina il record corrente. }`

---

Un ciclo di questo tipo termina non appena tutti i record restituiti dalla query eseguita sono stati passati in rassegna. Quando un record è correttamente puntato dal cursore, è possibile esaminare i suoi campi attraverso dei metodi che hanno tutti la forma: getTipo(int indiceColonna)

Ad esempio, si supponga di voler ottenere il contenuto del primo campo del record corrente, sotto forma di **stringa**: String stringa = resultSet.getString(1); Se si conoscono i nomi associati ai singoli campi del record, è possibile usare la variante: getTipo(String nomeColonna)

---

Ad esempio: `String stringa = resultSet.getString("Nome");` 

Il seguente elenco riporta i metodi di questa famiglia più frequentemente utilizzati:

*   `getBoolean()`  Restituisce il campo specificato sotto forma di **boolean**.
*   `getByte()`  Restituisce il campo specificato sotto forma di **byte**.
*   `getDate()`  Restituisce il campo specificato sotto forma di **oggetto java.util.Date**.
*   `getDouble()`  Restituisce il campo specificato sotto forma di **double**.
*   `getFloat()`  Restituisce il campo specificato sotto forma di **float**.
*   `getInt()`  Restituisce il campo specificato sotto forma di **int**.
*   `getLong()`  Restituisce il campo specificato sotto forma di **long**.
*   `getShort()`  Restituisce il campo specificato sotto forma di **short**.
*   `getString()`  Restituisce il campo specificato sotto forma di **oggetto java.lang.String**.

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
