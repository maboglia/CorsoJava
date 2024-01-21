# L'interfaccia ResultSet in JDBC

L'interfaccia **java.sql.ResultSet** fornisce i metodi essenziali per attraversare l'insieme di risultati restituiti da una query SQL. Il metodo principale, **next()**, sposta il cursore attraverso l'insieme.

### In pratica

1. Inizialmente, il cursore del ResultSet è posizionato prima del primo record restituito.
2. In questa fase, il cursore non punta a nessun record, impedendo l'analisi dei risultati.
3. La prima chiamata a **next()** sposterà il cursore sul primo record restituito dalla query.
4. Ogni volta che un record è puntato dal cursore, è possibile estrarre i suoi contenuti.
5. Quando non ci sono più record nel ResultSet, il metodo **next()** ritorna **false**.
6. Per scorrere un ResultSet, spesso si utilizza un ciclo come il seguente:

   ```java
   while (resultSet.next()) { 
      // Esamina il record corrente. 
   }
   ```

### Leggere i valori del record corrente

Quando il cursore punta a un record, è possibile esaminarne i campi tramite metodi come:

- `getTipo(int indiceColonna)`: Restituisce il valore del campo specificato dell'indice della colonna.

  ```java
  String stringa = resultSet.getString(1);
  ```

- `getTipo(String nomeColonna)`: Restituisce il valore del campo specificato dal nome della colonna.

  ```java
  String nome = resultSet.getString("Nome");
  ```

### Metodi comuni per la lettura

Di seguito, sono elencati alcuni dei metodi comuni utilizzati per leggere i dati dal ResultSet:

- `getBoolean()`: Restituisce il campo specificato come booleano.
- `getByte()`: Restituisce il campo specificato come byte.
- `getDate()`: Restituisce il campo specificato come oggetto java.util.Date.
- `getDouble()`: Restituisce il campo specificato come double.
- `getFloat()`: Restituisce il campo specificato come float.
- `getInt()`: Restituisce il campo specificato come int.
- `getLong()`: Restituisce il campo specificato come long.
- `getShort()`: Restituisce il campo specificato come short.
- `getString()`: Restituisce il campo specificato come oggetto java.lang.String.
