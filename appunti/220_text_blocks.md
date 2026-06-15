# 🔹 Cos’è un Text Block?

Un **Text Block** è una **stringa multilinea** delimitata da tre virgolette (`"""`)

* Mantiene i **ritorni a capo** e l’**indentazione** del codice.
* Evita l’uso massiccio di `\n` e `+` per concatenare stringhe.
* Migliora la leggibilità, specialmente per **JSON, XML, HTML, SQL**.

---

# 🔹 Sintassi base

```java
String json = """
{
    "nome": "Mario",
    "cognome": "Rossi",
    "eta": 30
}
""";

System.out.println(json);
```

**Output:**

```
{
    "nome": "Mario",
    "cognome": "Rossi",
    "eta": 30
}
```

---

# 🔹 Vantaggi rispetto a String tradizionali

### Prima di Java 13

```java
String json = "{\n" +
              "    \"nome\": \"Mario\",\n" +
              "    \"cognome\": \"Rossi\",\n" +
              "    \"eta\": 30\n" +
              "}";
```

* Poco leggibile
* Molti `+` e `\n`

### Con Text Blocks

* **Pulito**, leggibile e vicino al formato reale.

---

# 🔹 Caratteristiche avanzate

### ✅ Escape e indentazione

```java
String html = """
    <html>
        <body>
            <p>Hello World</p>
        </body>
    </html>
    """;

System.out.println(html);
```

* L’**indentazione comune** viene rimossa automaticamente.
* `\n`, `\"` e altri escape funzionano normalmente se necessari.

### ✅ Uso con JSON / SQL

```java
String sql = """
    SELECT id, nome
    FROM utenti
    WHERE eta > 18
    ORDER BY nome
    """;

System.out.println(sql);
```

---

# 🔹 Benefici per i junior

* Codice **più leggibile** e vicino al testo reale.
* Riduce errori di escape (`\n`, `\"`, ecc.).
* Utile per **test, script, API** che richiedono stringhe complesse.
* Perfetto in combinazione con **HttpClient**, **Stream API**, **Lambda**.

