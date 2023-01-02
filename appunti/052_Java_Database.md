L'interfaccia ResultSet
-------------------------

* L'interfaccia **java.sql.ResultSet** comprende i metodi indispensabili per scorrere l'insieme dei risultati restituiti da una query SQL.
* Il metodo **next()** scorre in avanti tale insieme.

### in pratica

* Inizialmente, il cursore del corrente oggetto ResultSet sarà posizionato prima del primo dei record restituiti.
* In questa condizione, non è possibile svolgere operazioni di analisi dei risultati: nessun record è puntato dal cursore corrente.
* Una prima chiamata a next() farà in modo che il cursore venga spostato sul primo record restituito dalla query.
* Ogni volta che un record è puntato dal cursore, diventa possibile estrarne i contenuti.
* Quando non ci sono più record nel ResultSet, il metodo next() ritorna **false**
* Non conoscendo il numero di righe restituite dal db, un ResultSet solitamente viene passato in rassegna con un codice del tipo:

```java
while (resultSet.next()) { 
 // Esamina il record corrente. 
}
```

Un ciclo di questo tipo termina non appena tutti i record restituiti dalla query eseguita sono stati passati in rassegna.

---

### Leggere i valori del record corrente

Quando un record è correttamente puntato dal cursore, è possibile esaminare i suoi campi attraverso dei metodi che hanno tutti la forma:
`getTipo(int indiceColonna)`

Ad esempio, si supponga di voler ottenere il contenuto del primo campo del record corrente, sotto forma di **stringa**:

`String stringa = resultSet.getString(1);`

Se si conoscono i **nomi** associati ai singoli campi del record, è possibile usare la variante: `getTipo(String nomeColonna)`

Ad esempio: `String nome = resultSet.getString("Nome");`

---

### I metodi per leggere

Il seguente elenco riporta i metodi di questa famiglia più frequentemente utilizzati:

* `getBoolean()`  Restituisce il campo specificato sotto forma di **boolean**.
* `getByte()`  Restituisce il campo specificato sotto forma di **byte**.
* `getDate()`  Restituisce il campo specificato sotto forma di **oggetto java.util.Date**.
* `getDouble()`  Restituisce il campo specificato sotto forma di **double**.
* `getFloat()`  Restituisce il campo specificato sotto forma di **float**.
* `getInt()`  Restituisce il campo specificato sotto forma di **int**.
* `getLong()`  Restituisce il campo specificato sotto forma di **long**.
* `getShort()`  Restituisce il campo specificato sotto forma di **short**.
* `getString()`  Restituisce il campo specificato sotto forma di **oggetto java.lang.String**.

---

