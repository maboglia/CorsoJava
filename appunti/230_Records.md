# Cos’è un Record?

---

I **Record** introdotti in **Java 14 (preview) e stabilizzati in Java 16** sono una delle feature più importanti e “complesse” perché cambiano il modo di progettare i **data carrier objects**.
Un **record** è una classe compatta, immutabile e con costruttori, `equals`, `hashCode`, `toString` generati automaticamente.

---

Un **Record** è una classe speciale per **contenere dati** senza dover scrivere manualmente:

* costruttori
* getter
* `equals()`
* `hashCode()`
* `toString()`

In altre parole, un **DTO compatto**.

---

## Sintassi base

```java
public record Persona(String nome, int eta) { }

```

* `Persona` è **final** per default → non può essere estesa.
* Gli **attributi** sono **final** → immutabili.
* Il compilatore genera automaticamente:

  * costruttore pubblico
  * metodi `nome()` e `eta()` (getter impliciti)
  * `equals()`, `hashCode()`, `toString()`

---

## Esempio di utilizzo

```java
Persona p = new Persona("Mario", 30);

System.out.println(p.nome()); // Mario
System.out.println(p.eta());  // 30
System.out.println(p);        // Persona[nome=Mario, eta=30]
```

---

## Record vs Class tradizionale

```java
// Class tradizionale
public class PersonaClassica {
    private final String nome;
    private final int eta;

    public PersonaClassica(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public String getNome() { return nome; }
    public int getEta() { return eta; }

    @Override
    public boolean equals(Object o) { /* implementazione */ }
    @Override
    public int hashCode() { /* implementazione */ }
    @Override
    public String toString() { /* implementazione */ }
}
```

Con **Record**, tutto questo codice viene generato automaticamente.

---

## Personalizzazioni

Puoi aggiungere **metodi aggiuntivi**, **validazioni** nel costruttore o **metodi statici**:

```java
public record Persona(String nome, int eta) {
    public Persona {
        if (eta < 0) throw new IllegalArgumentException("Eta non può essere negativa");
    }

    public String saluta() {
        return "Ciao, sono " + nome;
    }
}

Persona p = new Persona("Anna", 25);
System.out.println(p.saluta()); // Ciao, sono Anna
```

* Nota il **costruttore compatto**: si scrive solo il blocco `{ ... }` senza ridefinire i parametri.

---

## Perché possono sembrare complessi

1. **Immutabilità**

   * Tutti i campi sono `final`. Non puoi modificarli dopo la creazione.
2. **Ereditarietà limitata**

   * I Records sono `final` → non puoi estenderli.
3. **Costruttori e validazioni particolari**

   * Devi usare il **compact constructor** per aggiungere logica.
   * Non puoi avere campi non inclusi nel **record header**.
4. **Getter diversi dalle classiche convenzioni**

   * I getter sono **metodi con lo stesso nome del campo**, non `getNome()`.
   * Può confondere chi è abituato a `getX()`/`setX()`.
5. **Compatibilità con librerie**

   * Alcune librerie ORM (Hibernate) o JSON mapping si aspettano classi “tradizionali” con costruttore vuoto e getter `getX()`.

---

## Esempi pratici combinati

Con **Stream e Lambda**:

```java
List<Persona> persone = List.of(
    new Persona("Anna", 25),
    new Persona("Luca", 30),
    new Persona("Marco", 20)
);

var nomi = persone.stream()
    .filter(p -> p.eta() >= 25)
    .map(Persona::nome)
    .toList();

System.out.println(nomi); // [Anna, Luca]
```

Qui si vede come **Records + Stream + Lambda** rendono il codice **brevissimo e leggibile**.

---

## Benefici principali

* Codice più **compatto e chiaro**.
* Perfetto per **DTO, API responses, valori immutabili**.
* Si integra perfettamente con **Stream, Lambda, Optional**.

---

# 🧩 **Esercizi su Record (Java 16+)**

---

## 🔹 Esercizio 1 — Creazione base

Definisci un record `Punto(int x, int y)` e crea due punti.

* Stampali con `System.out.println(p)`.
* Confrontali con `equals`.

👉 Domanda: perché `equals` funziona senza essere implementato?

---

## 🔹 Esercizio 2 — Record come DTO

Definisci un record `Prodotto(String nome, double prezzo)` e crea una lista di prodotti.
Stampali con uno **stream**.

---

## 🔹 Esercizio 3 — Metodi nei record

Aggiungi un metodo al record `Prodotto` che calcola l’IVA (22%).
Esempio: `prezzoConIVA()`.

---

## 🔹 Esercizio 4 — Validazione nei costruttori

Definisci un record `Utente(String username, String email)` e aggiungi un **compact constructor** che solleva `IllegalArgumentException` se `email` non contiene `"@"`.

---

## 🔹 Esercizio 5 — Record annidati

Definisci un record `Ordine(int id, Prodotto prodotto, int quantita)`.
Crea un ordine e stampa il totale (`prodotto.prezzo() * quantita`).

---

## 🔹 Esercizio 6 — Record e collezioni

Crea una lista di record `Studente(String nome, int voto)`.
Usa gli stream per:

* trovare lo studente con voto massimo
* calcolare la media voti

---

## 🔹 Esercizio 7 — Record e pattern matching

Usa un `switch` con pattern matching per distinguere:

* `Prodotto` con prezzo > 100 → `"lusso"`
* altrimenti `"standard"`

---

## 🔹 Esercizio 8 — Record come chiave in una Map

Usa un record `Coppia(int a, int b)` come chiave in una `Map<Coppia, String>`.
Verifica che due chiavi con stessi valori siano considerate uguali.

👉 Hint: `hashCode` è generato automaticamente.

---

## 🔹 Esercizio 9 — Record immutabile con lista

Definisci un record `Classe(String nome, List<String> studenti)`.
Mostra che la lista **non è realmente immutabile** se la modifichi dopo la creazione.
👉 Domanda: come risolveresti il problema (copia difensiva)?

---

## 🔹 Esercizio 10 — Refactoring

Prendi una vecchia classe Java che fa solo da contenitore dati (con `getters`, `setters`, `toString`, `equals`, `hashCode`) e riscrivila come record.

