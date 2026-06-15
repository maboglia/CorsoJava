
---

# 🔹 Cos’è una Sealed Class?

_introdotte in **Java 15 (preview)** e stabilizzate in **Java 17**._

Una **Sealed Class** è una classe che **limita quali altre classi possono estenderla**.

* Permette di **controllare la gerarchia delle sottoclassi**.
* Migliora **sicurezza, leggibilità e manutenzione** del codice.
* Si integra bene con **Pattern Matching** e **Records**.

---

# 🔹 Sintassi base

```java
public sealed class Forma
        permits Cerchio, Rettangolo, Triangolo { }

public final class Cerchio extends Forma { }

public final class Rettangolo extends Forma { }

public non-sealed class Triangolo extends Forma { }
```

* `permits` indica **quali classi possono estendere** la classe sealed.
* Le sottoclassi possono essere:

  * **`final`** → non estendibili
  * **`sealed`** → a loro volta limitano le estensioni
  * **`non-sealed`** → liberamente estendibili

---

# 🔹 Esempio con Pattern Matching

```java
public sealed class Forma permits Cerchio, Rettangolo {}
public final class Cerchio extends Forma {
    double raggio;
    Cerchio(double raggio) { this.raggio = raggio; }
}
public final class Rettangolo extends Forma {
    double base, altezza;
    Rettangolo(double base, double altezza) { this.base = base; this.altezza = altezza; }
}

Forma f = new Cerchio(5);

String descrizione = switch(f) {
    case Cerchio c -> "Cerchio con raggio " + c.raggio;
    case Rettangolo r -> "Rettangolo " + r.base + "x" + r.altezza;
};

System.out.println(descrizione); // Cerchio con raggio 5.0
```

* Lo switch **conosce tutte le sottoclassi possibili**, quindi il **`default` non è sempre necessario**.
* Sicurezza: il compilatore avverte se non gestisci tutte le sottoclassi.

---

# 🔹 Benefici principali

* **Gerarchie più controllate** → si sa chi può estendere una classe.
* **Sicurezza e manutenzione** → facile aggiungere nuovi casi senza rompere il codice.
* **Perfetto insieme a Pattern Matching** → switch e `instanceof` più precisi.
* Ideale per **modelli dati immutabili** con Records.

