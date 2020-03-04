JDBC
------

CallableStatement
-------------------

Richiamare le procedure memorizzate con `CallableStatement` 

Con `PreparedStatement`, come si è appurato, è possibile sfruttare delle istruzioni SQL precompilate, che garantiscono migliori prestazioni e maggiore chiarezza. 

Le query desiderate sono date in pasto al DBMS al momento della creazione di un oggetto `PreparedStatement`, e possono poi essere ripetutamente sfruttate quante volte si desidera. 

Tuttavia, JDBC ed il DBMS devono ricompilare la medesima istruzione SQL ogni volta che l'oggetto viene ricreato. Si può fare di meglio, se il DBMS lo permette, ottenendo incrementi ancora più significativi sia nelle prestazioni sia nella semplicità del codice..

L'interfaccia `CallableStatement` estende `PreparedStatement`, e permette di richiamare delle procedure memorizzate all'interno del database.

Una query, con `CallableStatement`, non deve essere specificata in linea all'interno del codice Java, ma può essere memorizzata perennemente all'interno della base di dati, pronta ad essere sfruttata più e più volte, in tutte le parti di tutte le applicazioni realizzate.

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