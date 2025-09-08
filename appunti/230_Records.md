# Cos’è un Record?

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

