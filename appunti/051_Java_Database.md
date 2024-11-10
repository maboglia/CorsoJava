# L'interfaccia Statement in JDBC

**Interfaccia Statement in JDBC**

L'interfaccia `Statement` di JDBC è utilizzata per eseguire istruzioni SQL semplici su un database, come query `SELECT`, `INSERT`, `UPDATE`, e `DELETE`. Appartiene al pacchetto `java.sql` e fornisce metodi per interagire con il database in modo sincrono.

### Caratteristiche principali

- `Statement` viene creato tramite un oggetto `Connection`.
- Viene utilizzato per eseguire query SQL statiche, dove non ci sono parametri variabili all'interno dell'istruzione SQL.
- Fornisce metodi per:
  - Eseguire query (metodi `executeQuery`, `executeUpdate`, `execute`)
  - Gestire il risultato delle query (`ResultSet`)

### Principali metodi dell'interfaccia Statement

- **executeQuery(String sql)**: Esegue un'istruzione `SELECT` e restituisce un `ResultSet` con i dati ottenuti.

  ```java
  ResultSet rs = statement.executeQuery("SELECT * FROM libri");
  ```

- **executeUpdate(String sql)**: Esegue un'istruzione di aggiornamento (come `INSERT`, `UPDATE` o `DELETE`) e restituisce un intero che indica il numero di righe affette dall'operazione.

  ```java
  int rowsAffected = statement.executeUpdate("INSERT INTO libri (titolo, pagine) VALUES ('Nuovo Libro', 100)");
  ```

- **execute(String sql)**: Esegue un'istruzione SQL generica. Restituisce `true` se è stato generato un `ResultSet`, `false` in caso contrario.

  ```java
  boolean isResultSet = statement.execute("DELETE FROM libri WHERE id = 1");
  ```

- **close()**: Chiude l'oggetto `Statement` e libera le risorse.

  ```java
  statement.close();
  ```

### Esempio di utilizzo

Ecco un esempio che mostra come creare un `Statement`, eseguire una query, e gestire i risultati:

```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementExample {
    private static final String URL = "jdbc:mysql://localhost:3306/nomeDB";
    private static final String USER = "username";
    private static final String PASS = "password";

    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection(URL, USER, PASS);
             Statement stmt = con.createStatement()) {

            // Esecuzione di una query SELECT
            ResultSet rs = stmt.executeQuery("SELECT * FROM libri");

            // Lettura dei dati dal ResultSet
            while (rs.next()) {
                int id = rs.getInt("id");
                String titolo = rs.getString("titolo");
                int pagine = rs.getInt("pagine");
                System.out.println("ID: " + id + ", Titolo: " + titolo + ", Pagine: " + pagine);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
```

### Vantaggi e Limitazioni di Statement

**Vantaggi**:

- Semplicità: facile da usare per istruzioni SQL statiche e semplici.
- Ideale per operazioni singole e senza parametri variabili.

**Limitazioni**:

- Vulnerabilità SQL Injection: con query dinamiche, dove i dati dell'utente sono inseriti direttamente nell'SQL.
- Non ottimizzato per query ripetitive con valori variabili (per cui è preferibile `PreparedStatement`).

L'interfaccia `Statement` è ideale per istruzioni SQL semplici, ma per query parametriche o operazioni più complesse è preferibile utilizzare `PreparedStatement`.

---

## **PreparedStatement in JDBC**

`PreparedStatement` è un'interfaccia JDBC che estende `Statement`, progettata per eseguire query SQL parametrizzate in modo più sicuro ed efficiente. A differenza di `Statement`, consente di inserire parametri variabili (attraverso segnaposti `?`), prevenendo SQL Injection e ottimizzando l'esecuzione di query ripetitive.

### Caratteristiche principali

- **Parametri**: utilizza segnaposti `?` per i parametri, che vengono successivamente valorizzati tramite metodi specifici.
- **Sicurezza**: aiuta a prevenire attacchi di SQL Injection poiché i parametri vengono trattati come dati e non come parte del codice SQL.
- **Ottimizzazione**: ideale per query ripetitive, poiché il DBMS può ottimizzare l’esecuzione della query grazie alla sua pre-compilazione.

### Principali Metodi di PreparedStatement

- **setInt(int parameterIndex, int value)**, **setString(int parameterIndex, String value)**, ecc.: impostano i valori per i segnaposti `?` in base al tipo di dato.

  ```java
  preparedStatement.setInt(1, 10);       // Imposta il primo parametro come un intero
  preparedStatement.setString(2, "test"); // Imposta il secondo parametro come stringa
  ```

- **executeQuery()**: esegue una query `SELECT` e restituisce un `ResultSet`.

  ```java
  ResultSet rs = preparedStatement.executeQuery();
  ```

- **executeUpdate()**: esegue un'istruzione `INSERT`, `UPDATE` o `DELETE`, restituendo il numero di righe interessate.

  ```java
  int rowsAffected = preparedStatement.executeUpdate();
  ```

- **close()**: chiude il `PreparedStatement` e libera le risorse.

  ```java
  preparedStatement.close();
  ```

### Esempio di utilizzo

Vediamo un esempio di come utilizzare `PreparedStatement` per una query parametrizzata:

```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementExample {
    private static final String URL = "jdbc:mysql://localhost:3306/nomeDB";
    private static final String USER = "username";
    private static final String PASS = "password";

    public static void main(String[] args) {
        String query = "SELECT * FROM libri WHERE pagine > ? AND prezzo < ?";

        try (Connection con = DriverManager.getConnection(URL, USER, PASS);
             PreparedStatement pstmt = con.prepareStatement(query)) {

            // Imposta i parametri della query
            pstmt.setInt(1, 100);      // Numero di pagine
            pstmt.setDouble(2, 20.00); // Prezzo massimo

            // Esecuzione della query e lettura dei risultati
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String titolo = rs.getString("titolo");
                int pagine = rs.getInt("pagine");
                double prezzo = rs.getDouble("prezzo");
                System.out.println("ID: " + id + ", Titolo: " + titolo + ", Pagine: " + pagine + ", Prezzo: " + prezzo);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
```

### Vantaggi e Limitazioni di PreparedStatement

**Vantaggi**:

- **Prevenzione SQL Injection**: separa i dati dal codice SQL.
- **Performance ottimizzata**: l’istruzione SQL viene pre-compilata dal database, rendendo le esecuzioni successive più rapide.
- **Riusabilità**: ideale per query ripetitive con parametri variabili.

**Limitazioni**:

- **Solo query statiche**: `PreparedStatement` non può essere utilizzato per query dinamiche in cui cambiano le colonne o le condizioni SQL in fase di esecuzione. Per queste esigenze, occorre utilizzare `Statement` o comporre dinamicamente la query prima di utilizzare `PreparedStatement`.

`PreparedStatement` è la scelta preferibile per query sicure, parametrizzate e ripetitive, in particolare quando si gestiscono dati forniti dall'utente.

---

## **CallableStatement in JDBC**

`CallableStatement` è un'interfaccia JDBC usata per eseguire stored procedure nel database, ovvero funzioni o procedure predefinite e salvate lato server. A differenza di `Statement` e `PreparedStatement`, che sono utilizzati per inviare comandi SQL diretti, `CallableStatement` permette di interagire con procedure memorizzate, consentendo operazioni più complesse e ottimizzate lato database.

### Caratteristiche principali

- **Esecuzione di stored procedure**: `CallableStatement` è progettato specificamente per chiamare procedure memorizzate nel database.
- **Supporto di parametri IN, OUT e INOUT**: può gestire parametri di input (`IN`), di output (`OUT`) e misti (`INOUT`).
- **Riusabilità e ottimizzazione**: l’utilizzo di stored procedure rende le operazioni ripetitive e complesse più efficienti e consente di riutilizzare la logica direttamente dal database.

### Sintassi e Metodi principali

La sintassi per creare un `CallableStatement` varia a seconda dei parametri:

```sql
{call nome_procedura(?, ?, ...)}
```

#### Principali metodi di `CallableStatement`

- **registerOutParameter(int parameterIndex, int sqlType)**: registra un parametro `OUT` specificando il tipo di dato SQL.

  ```java
  callableStatement.registerOutParameter(2, java.sql.Types.INTEGER); // Parametro OUT di tipo INTEGER
  ```

- **setXXX(int parameterIndex, XXX value)**: imposta i valori dei parametri `IN` usando metodi come `setInt`, `setString`, ecc.

  ```java
  callableStatement.setInt(1, 10); // Parametro IN di tipo INTEGER
  ```

- **getXXX(int parameterIndex)**: recupera i valori dei parametri `OUT` dopo l’esecuzione.

  ```java
  int result = callableStatement.getInt(2); // Recupera il valore OUT
  ```

- **execute()**: esegue la stored procedure. Restituisce `true` se è stato generato un `ResultSet`, `false` altrimenti.

### Esempio di utilizzo

Consideriamo una stored procedure nel database chiamata `getLibriPerPrezzo`, che accetta un parametro `IN` (prezzo massimo) e restituisce un parametro `OUT` (numero di libri trovati).

```sql
DELIMITER //
CREATE PROCEDURE getLibriPerPrezzo(IN maxPrezzo DECIMAL(10, 2), OUT numeroLibri INT)
BEGIN
    SELECT COUNT(*) INTO numeroLibri FROM libri WHERE prezzo <= maxPrezzo;
END //
DELIMITER ;
```

Ecco come usare `CallableStatement` per chiamare questa procedura:

```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

public class CallableStatementExample {
    private static final String URL = "jdbc:mysql://localhost:3306/nomeDB";
    private static final String USER = "username";
    private static final String PASS = "password";

    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection(URL, USER, PASS);
             CallableStatement cstmt = con.prepareCall("{call getLibriPerPrezzo(?, ?)}")) {

            // Imposta il parametro IN
            cstmt.setDouble(1, 20.00); // prezzo massimo

            // Registra il parametro OUT
            cstmt.registerOutParameter(2, Types.INTEGER);

            // Esegue la stored procedure
            cstmt.execute();

            // Recupera il parametro OUT
            int numeroLibri = cstmt.getInt(2);
            System.out.println("Numero di libri con prezzo <= 20.00: " + numeroLibri);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
```

### Vantaggi e Limitazioni di CallableStatement

**Vantaggi**:

- **Riuso di codice lato server**: permette di eseguire procedure memorizzate, evitando di ripetere la logica lato applicativo.
- **Efficienza**: le stored procedure possono essere più efficienti, specie per operazioni complesse e transazionali.
- **Gestione dei parametri OUT**: consente di ottenere risultati direttamente come parametri di output.

**Limitazioni**:

- **Dipendenza dal DBMS**: l’utilizzo di stored procedure può rendere l'applicazione meno portabile tra diversi database.
- **Sintassi specifica**: la sintassi per `CallableStatement` può variare a seconda del database.

`CallableStatement` è ideale per chiamare stored procedure, offrendo un’interfaccia flessibile per operazioni complesse ed efficienti gestite lato database.
