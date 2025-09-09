# Panoramica struttura (flat, senza moduli)

```
magazzino/
 ├─ src/
 │   ├─ com/magazzino/core/Prodotto.java            // step0 (poi sostituito da record)
 │   ├─ com/magazzino/core/ProdottoRecord.java     // step6 (record)
 │   ├─ com/magazzino/core/OperazioneMagazzino.java// sealed + classes
 │   ├─ com/magazzino/core/AggiungiProdotto.java
 │   ├─ com/magazzino/core/RimuoviProdotto.java
 │   └─ com/magazzino/app/Main.java                // file Main, aggiornato step-by-step
 └─ out/                                           // output della compilazione
```

Compila tutto (comando usato in ogni step):

```bash
# dalla root del progetto (cartella che contiene src/)
javac -d out src/com/magazzino/core/*.java src/com/magazzino/app/*.java
java -cp out com.magazzino.app.Main
```

> Nota: durante gli step potresti sovrascrivere `Main.java` o altri file; il comando sopra ricompila tutti i sorgenti presenti.

---

## STEP 0 — Base (Java 8): classe Prodotto + Stream, Optional

**Obiettivo:** avviare con le basi: classe dati tradizionale, stream & optional.

**File:** `src/com/magazzino/core/Prodotto.java`

```java
package com.magazzino.core;

import java.util.*;
import java.util.stream.Collectors;

public class Prodotto {
    private final String nome;
    private final int quantita;

    public Prodotto(String nome, int quantita) {
        this.nome = nome;
        this.quantita = quantita;
    }

    public String getNome() { return nome; }
    public int getQuantita() { return quantita; }

    @Override
    public String toString() {
        return nome + " (" + quantita + ")";
    }

    public static List<Prodotto> filtraDisponibili(List<Prodotto> lista) {
        return lista.stream()
                    .filter(p -> p.getQuantita() > 0)
                    .collect(Collectors.toList());
    }

    public static Optional<Prodotto> trovaProdotto(List<Prodotto> lista, String nome) {
        return lista.stream()
                    .filter(p -> p.getNome().equalsIgnoreCase(nome))
                    .findFirst();
    }
}
```

**File:** `src/com/magazzino/app/Main.java` (versione step0)

```java
package com.magazzino.app;

import com.magazzino.core.Prodotto;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Prodotto> magazzino = Arrays.asList(
            new Prodotto("Tavolo", 10),
            new Prodotto("Sedia", 0),
            new Prodotto("Lampada", 5)
        );

        System.out.println("Disponibili:");
        Prodotto.filtraDisponibili(magazzino).forEach(System.out::println);

        Prodotto.trovaProdotto(magazzino, "Sedia")
            .ifPresentOrElse(p -> System.out.println("Trovato: " + p),
                             () -> System.out.println("Prodotto non disponibile"));
    }
}
```

Compila & esegui:

```bash
javac -d out src/com/magazzino/core/Prodotto.java src/com/magazzino/app/Main.java
java -cp out com.magazzino.app.Main
```

---

## STEP 1 — Collection Factory Methods (Java 9)

**Obiettivo:** usare `List.of`, `Set.of`, `Map.of` per creare collezioni immutabili.

**Cosa cambiare:** in `Main.java` sostituisci `Arrays.asList(...)` con `List.of(...)`.
Esempio:

```java
List<Prodotto> magazzino = List.of(
    new Prodotto("Tavolo", 10),
    new Prodotto("Sedia", 0),
    new Prodotto("Lampada", 5)
);

Set<String> categorie = Set.of("Mobili", "Illuminazione");
Map<String,Integer> scorte = Map.of("Tavolo", 10, "Sedia", 0, "Lampada", 5);
```

Compila ed esegui come sopra. (`List.of` richiede JDK ≥9; comunque JDK21 OK)

---

## STEP 2 — `var` (Local Variable Type Inference, Java 10)

**Obiettivo:** rendere il codice più conciso usando `var` per variabili locali.

**Esempio:** in `Main.java`:

```java
var magazzino = List.of(...);
var categorie = Set.of(...);
var scorte = Map.of(...);
```

Nota: `var` funziona **solo** sulle variabili locali con inizializzatore.

---

## STEP 3 — HttpClient (Java 11)

**Obiettivo:** dimostrare chiamata HTTP sincrona con `HttpClient`.

Aggiungi metodo in `Main.java`:

```java
import java.net.http.*;
import java.net.URI;

private static void recuperaDatiServer() throws Exception {
    var client = HttpClient.newHttpClient();
    var request = HttpRequest.newBuilder()
                    .uri(URI.create("https://jsonplaceholder.typicode.com/posts/1"))
                    .build();
    var response = client.send(request, HttpResponse.BodyHandlers.ofString());
    System.out.println("Server: " + response.body().substring(0, 120) + "...");
}
```

Chiama `recuperaDatiServer()` dal `main` per provarlo.

---

## STEP 4 — Switch Expressions (Java 12/14 stabilizzato)

**Obiettivo:** sostituire il vecchio `switch` con la switch-expression.

Esempio in `Main.java`:

```java
for (var p : magazzino) {
    String cat = switch (p.getNome()) {
        case "Tavolo", "Sedia" -> "Mobili";
        case "Lampada" -> "Illuminazione";
        default -> "Altro";
    };
    System.out.println(p.getNome() + " -> " + cat);
}
```

Se hai blocchi multipli usa `yield` per ritornare un valore dal blocco.

---

## STEP 5 — Text Blocks (Java 13/15)

**Obiettivo:** generare JSON/SQL multilinea in modo leggibile.

Esempio:

```java
var j = """
{
  "nome": "%s",
  "quantita": %d
}
""".formatted(p.getNome(), p.getQuantita());
System.out.println(j);
```

`formatted()` è comodo per sostituzioni; in alternativa usa `String.format`.

---

## STEP 6 — Records (Java 14/16) — migrazione dalla classe Prodotto

**Obiettivo:** sostituire la classica `Prodotto` con `record` per ridurre boilerplate.

**File nuovo:** `src/com/magazzino/core/ProdottoRecord.java`

```java
package com.magazzino.core;

public record ProdottoRecord(String nome, int quantita) { }
```

**Cosa fare:**

* Rimuovi o ignora `Prodotto.java` (o tienilo per confronto).
* Aggiorna `Main.java` per usare `ProdottoRecord` (import) e chiamare `p.nome()` / `p.quantita()` invece di `getNome()` / `getQuantita()`.

Esempio di creazione:

```java
var magazzino = List.of(
    new ProdottoRecord("Tavolo", 10),
    new ProdottoRecord("Sedia", 0)
);
```

---

## STEP 7 — Pattern Matching per `instanceof` & `switch` (Java 14→17+)

**Obiettivo:** evitare cast manuali.

Esempio:

```java
Object o = magazzino.get(0);
if (o instanceof ProdottoRecord p) {
    System.out.println("Nome: " + p.nome());
}
```

Con `switch` (pattern matching) puoi fare:

```java
String desc = switch (o) {
    case ProdottoRecord p -> "Prodotto " + p.nome();
    default -> "Altro";
};
```

---

## STEP 8 — Sealed Classes (Java 15/17)

**Obiettivo:** modellare operazioni sul magazzino (aggiungi/rimuovi) con gerarchia chiusa.

**File:** `src/com/magazzino/core/OperazioneMagazzino.java`

```java
package com.magazzino.core;

public sealed interface OperazioneMagazzino permits AggiungiProdotto, RimuoviProdotto { }
```

**File:** `src/com/magazzino/core/AggiungiProdotto.java`

```java
package com.magazzino.core;

public final class AggiungiProdotto implements OperazioneMagazzino {
    public final String nome; public final int quantita;
    public AggiungiProdotto(String nome, int quantita) { this.nome = nome; this.quantita = quantita; }
}
```

**File:** `src/com/magazzino/core/RimuoviProdotto.java`

```java
package com.magazzino.core;

public final class RimuoviProdotto implements OperazioneMagazzino {
    public final String nome; public final int quantita;
    public RimuoviProdotto(String nome, int quantita) { this.nome = nome; this.quantita = quantita; }
}
```

**Uso con switch + pattern matching:**

```java
OperazioneMagazzino op = new AggiungiProdotto("Sedia", 3);
switch(op) {
    case AggiungiProdotto a -> System.out.println("Aggiungi " + a.quantita + " di " + a.nome);
    case RimuoviProdotto r -> System.out.println("Rimuovi " + r.quantita + " di " + r.nome);
}
```

---

## STEP 9 — Virtual Threads (Project Loom, Java 19/21)

**Obiettivo:** rendere concorrente I/O-bound semplice e scalabile.

Esempio (aggiornamento parallelo):

```java
try (var executor = java.util.concurrent.Executors.newVirtualThreadPerTaskExecutor()) {
    for (var p : magazzino) {
        executor.submit(() -> {
            // Simula I/O
            System.out.println("Aggiorno " + p.nome() + " in virtual thread: " + Thread.currentThread());
        });
    }
} // executor chiuso automaticamente
```

Con JDK 21 puoi lanciare migliaia di virtual threads senza consumare risorse massive.

---

## Versione finale (tutti gli step integrati)

Di seguito i file *minimi* della versione finale (flat). Puoi copiarli direttamente in `src/...` e compilare col comando `javac` indicato all’inizio.

### `src/com/magazzino/core/ProdottoRecord.java`

```java
package com.magazzino.core;

public record ProdottoRecord(String nome, int quantita) { }
```

### `src/com/magazzino/core/OperazioneMagazzino.java`

```java
package com.magazzino.core;

public sealed interface OperazioneMagazzino permits AggiungiProdotto, RimuoviProdotto { }
```

### `src/com/magazzino/core/AggiungiProdotto.java`

```java
package com.magazzino.core;

public final class AggiungiProdotto implements OperazioneMagazzino {
    public final String nome; public final int quantita;
    public AggiungiProdotto(String nome, int quantita) { this.nome = nome; this.quantita = quantita; }
}
```

### `src/com/magazzino/core/RimuoviProdotto.java`

```java
package com.magazzino.core;

public final class RimuoviProdotto implements OperazioneMagazzino {
    public final String nome; public final int quantita;
    public RimuoviProdotto(String nome, int quantita) { this.nome = nome; this.quantita = quantita; }
}
```

### `src/com/magazzino/app/Main.java` (finale — interattivo CLI + tutti gli step)

```java
package com.magazzino.app;

import com.magazzino.core.*;
import java.util.*;
import java.net.http.*;
import java.net.URI;
import java.util.concurrent.*;

public class Main {
    private static final List<ProdottoRecord> magazzino = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        // Popola iniziale (step1)
        magazzino.addAll(List.of(
            new ProdottoRecord("Tavolo", 10),
            new ProdottoRecord("Sedia", 0),
            new ProdottoRecord("Lampada", 5)
        ));

        try (var scanner = new Scanner(System.in)) {
            boolean running = true;
            while (running) {
                System.out.println("\n--- Menu (0 esci) ---");
                System.out.println("1 Mostra disponibili (Stream)");
                System.out.println("2 Mostra categorie (Factory methods)");
                System.out.println("3 Aggiungi prodotto (var + record)");
                System.out.println("4 Recupera dati server (HttpClient)");
                System.out.println("5 Mostra categorie (Switch expression)");
                System.out.println("6 Mostra JSON prodotto (Text Blocks)");
                System.out.println("7 Esegui operazione (Sealed)");
                System.out.println("8 Aggiorna in parallelo (Virtual Threads)");
                System.out.print("Scelta: ");
                var line = scanner.nextLine().trim();
                int scelta = line.isEmpty() ? -1 : Integer.parseInt(line);
                switch (scelta) {
                    case 1 -> mostraDisponibili();
                    case 2 -> mostraCategorieScorte();
                    case 3 -> aggiungiProdotto(scanner);
                    case 4 -> recuperaDatiServer();
                    case 5 -> mostraCategorie();
                    case 6 -> mostraJson(scanner);
                    case 7 -> eseguiOperazione(scanner);
                    case 8 -> aggiornaParallelo();
                    case 0 -> running = false;
                    default -> System.out.println("Scelta non valida");
                }
            }
        }
        System.out.println("Bye!");
    }

    private static void mostraDisponibili() {
        System.out.println("Disponibili:");
        magazzino.stream()
                 .filter(p -> p.quantita() > 0)
                 .forEach(System.out::println);

        magazzino.stream()
                 .filter(p -> p.nome().equalsIgnoreCase("Sedia"))
                 .findFirst()
                 .ifPresentOrElse(
                     p -> System.out.println("Trovato: " + p),
                     () -> System.out.println("Sedia non disponibile")
                 );
    }

    private static void mostraCategorieScorte() {
        var categorie = Set.of("Mobili", "Illuminazione");
        var scorte = Map.of("Tavolo", 10, "Sedia", 0, "Lampada", 5);
        System.out.println("Categorie: " + categorie);
        System.out.println("Scorte: " + scorte);
    }

    private static void aggiungiProdotto(Scanner scanner) {
        System.out.print("Nome: ");
        var nome = scanner.nextLine().trim();
        System.out.print("Quantita: ");
        var q = Integer.parseInt(scanner.nextLine().trim());
        var p = new ProdottoRecord(nome, q);
        magazzino.add(p);
        System.out.println("Aggiunto: " + p);
    }

    private static void recuperaDatiServer() throws Exception {
        var client = HttpClient.newHttpClient();
        var req = HttpRequest.newBuilder().uri(URI.create("https://jsonplaceholder.typicode.com/posts/1")).build();
        var resp = client.send(req, HttpResponse.BodyHandlers.ofString());
        System.out.println("Server (preview): " + resp.body().substring(0, Math.min(200, resp.body().length())) + "...");
    }

    private static void mostraCategorie() {
        for (var p : magazzino) {
            String cat = switch (p.nome()) {
                case "Tavolo", "Sedia", "Scrivania" -> "Mobili";
                case "Lampada" -> "Illuminazione";
                default -> "Altro";
            };
            System.out.println(p.nome() + " -> " + cat);
        }

        Object o = magazzino.get(0);
        if (o instanceof ProdottoRecord pr) {
            System.out.println("Pattern matching: primo = " + pr.nome());
        }
    }

    private static void mostraJson(Scanner scanner) {
        System.out.print("Indice (0-" + (magazzino.size()-1) + "): ");
        int idx = Integer.parseInt(scanner.nextLine().trim());
        if (idx < 0 || idx >= magazzino.size()) { System.out.println("Indice non valido"); return; }
        var p = magazzino.get(idx);
        var json = """
            {
              "nome": "%s",
              "quantita": %d
            }
            """.formatted(p.nome(), p.quantita());
        System.out.println(json);
    }

    private static void eseguiOperazione(Scanner scanner) {
        System.out.print("Nome prodotto: ");
        var nome = scanner.nextLine().trim();
        System.out.print("Quantita: ");
        var q = Integer.parseInt(scanner.nextLine().trim());
        System.out.print("Tipo (1=Aggiungi,2=Rimuovi): ");
        var tipo = Integer.parseInt(scanner.nextLine().trim());
        OperazioneMagazzino op = (tipo == 1) ? new AggiungiProdotto(nome, q) : new RimuoviProdotto(nome, q);

        switch (op) {
            case AggiungiProdotto a -> System.out.println("Aggiungi " + a.quantita + " di " + a.nome);
            case RimuoviProdotto r -> System.out.println("Rimuovi " + r.quantita + " di " + r.nome);
        }
    }

    private static void aggiornaParallelo() {
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            for (var p : magazzino) {
                executor.submit(() -> {
                    System.out.println("VT: aggiornamento " + p.nome() + " in " + Thread.currentThread());
                    try { Thread.sleep(50); } catch (InterruptedException ignored) {}
                });
            }
        }
    }
}
```

---

## Compilazione & Esecuzione finale (single command)

```bash
# dalla cartella che contiene src/
javac -d out src/com/magazzino/core/*.java src/com/magazzino/app/*.java
java -cp out com.magazzino.app.Main
```

---

## Raccomandazioni pratiche

* Usa **JDK 21** per provare tutte le feature. Con versioni inferiori alcune funzionalità (virtual threads, sealed definitive, pattern-switch, text blocks definitivi) potrebbero non essere disponibili o essere in preview.
* Per la didattica: esegui ogni step singolarmente (sovrascrivi Main.java o modifica come indicato), osserva differenze e ripulisci il codice.
* Vuoi trasformare questi step in **commit Git separati**? Posso fornirti i comandi git (inizializzazione + commit per ogni step) così hai una timeline didattica.

