# L'interfaccia ResultSet in JDBC

`ResultSet` è un’interfaccia JDBC che rappresenta un insieme di risultati ottenuti da una query SQL, tipicamente `SELECT`. Un oggetto `ResultSet` è simile a un cursore che scorre tra le righe del risultato, consentendo di leggere e manipolare i dati recuperati dal database.

### Caratteristiche principali

- **Iterazione sui risultati**: `ResultSet` permette di muoversi tra le righe dei dati (solitamente in avanti), ma con configurazioni specifiche è possibile navigare anche all’indietro.
- **Accesso ai dati per colonna**: consente di ottenere i valori di ciascuna colonna specificandone il nome o l'indice.
- **Aggiornabilità**: con un `ResultSet` aggiornabile, è possibile modificare i dati direttamente e propagare i cambiamenti nel database.

### Creazione di un ResultSet

Un `ResultSet` viene generato eseguendo una query SQL tramite `Statement` o `PreparedStatement`:

```java
ResultSet rs = statement.executeQuery("SELECT * FROM libri");
```

### Principali Metodi di ResultSet

- **next()**: sposta il cursore alla riga successiva. Restituisce `true` se ci sono ancora righe, `false` se si è raggiunta la fine del set.

  ```java
  while (rs.next()) {
      // Operazioni sui dati
  }
  ```

- **getXXX()**: restituisce il valore della colonna corrente, dove `XXX` rappresenta il tipo di dato (`getInt`, `getString`, `getDouble`, ecc.). Si può specificare il nome o l’indice della colonna.

  ```java
  int id = rs.getInt("id");
  String titolo = rs.getString("titolo");
  ```

- **close()**: chiude il `ResultSet` e libera le risorse.

  ```java
  rs.close();
  ```

- **beforeFirst()**: riporta il cursore all'inizio del `ResultSet`.
- **absolute(int row)**: sposta il cursore alla riga specificata.
- **updateXXX()**: aggiorna i dati nella riga corrente, utilizzando metodi come `updateInt`, `updateString`, ecc., e `updateRow()` per salvare le modifiche.

### Esempio di utilizzo

Ecco un esempio di come ottenere e manipolare i dati di un `ResultSet`:

```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetExample {
    private static final String URL = "jdbc:mysql://localhost:3306/nomeDB";
    private static final String USER = "username";
    private static final String PASS = "password";

    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection(URL, USER, PASS);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM libri")) {

            // Iterazione sui risultati
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

### Tipi di ResultSet

`ResultSet` può avere diverse modalità di scorrimento e aggiornabilità:

- **Scorrimento (scrollability)**:
  - `ResultSet.TYPE_FORWARD_ONLY` (predefinito): scorre solo in avanti.
  - `ResultSet.TYPE_SCROLL_INSENSITIVE`: scorre in avanti e indietro; non rispecchia le modifiche fatte nel database dopo l’ottenimento dei risultati.
  - `ResultSet.TYPE_SCROLL_SENSITIVE`: scorre in avanti e indietro; rispecchia le modifiche fatte nel database.

- **Aggiornabilità**:
  - `ResultSet.CONCUR_READ_ONLY` (predefinito): dati non modificabili.
  - `ResultSet.CONCUR_UPDATABLE`: consente modifiche ai dati, che possono essere aggiornate direttamente nel database.

Esempio di `ResultSet` aggiornabile e scrollabile:

```java
Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
```

### Vantaggi e Limitazioni di ResultSet

**Vantaggi**:

- **Accesso flessibile**: consente accesso ai dati di una riga alla volta, minimizzando l’uso della memoria.
- **Supporto per modifiche in tempo reale**: permette di aggiornare i dati se configurato come aggiornabile.
  
**Limitazioni**:

- **Dipendenza dal driver**: alcune funzionalità avanzate (come `scrollability` e `updatability`) dipendono dal supporto del driver JDBC specifico.
- **Gestione della memoria**: mantenere un `ResultSet` aperto su grandi set di dati può consumare molta memoria.

L’interfaccia `ResultSet` è fondamentale in JDBC per gestire e manipolare i dati restituiti da una query, supportando un accesso efficace e dettagliato ai dati tabulari del database.
