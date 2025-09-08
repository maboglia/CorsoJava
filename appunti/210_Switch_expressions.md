# Cos’è una Switch Expression?

Prima di Java 12, `switch` era solo un **statement**, cioè non restituiva un valore e spesso richiedeva `break` per evitare il “fall-through”.

Con **Switch Expressions**:

* `switch` può **ritornare un valore**.
* Usa **freccia `->`** invece di due punti `:` per una sintassi più pulita.
* Fall-through implicito evitato (non serve più `break`).

---

## Sintassi base

### Vecchio stile

```java
int giorno = 3;
String nomeGiorno;

switch (giorno) {
    case 1: nomeGiorno = "Lunedì"; break;
    case 2: nomeGiorno = "Martedì"; break;
    case 3: nomeGiorno = "Mercoledì"; break;
    default: nomeGiorno = "Sconosciuto";
}
System.out.println(nomeGiorno); // Mercoledì
```

### Nuovo stile (Switch Expression)

```java
int giorno = 3;

String nomeGiorno = switch (giorno) {
    case 1 -> "Lunedì";
    case 2 -> "Martedì";
    case 3 -> "Mercoledì";
    default -> "Sconosciuto";
};

System.out.println(nomeGiorno); // Mercoledì
```

---

## Più istruzioni in un case

Se servono più istruzioni:

```java
int giorno = 3;

String messaggio = switch (giorno) {
    case 1, 2, 3 -> {
        System.out.println("Giorno lavorativo");
        yield "Giorno " + giorno; // yield restituisce il valore
    }
    case 6, 7 -> "Weekend";
    default -> "Sconosciuto";
};

System.out.println(messaggio);
```

* `yield` serve per **ritornare un valore** da un blocco con più istruzioni.
* Non serve più `break` per evitare il fall-through.

---

## Switch su String

Funziona anche con String e Enum:

```java
String frutto = "Mela";

int calorie = switch (frutto) {
    case "Mela" -> 52;
    case "Banana" -> 89;
    default -> 0;
};

System.out.println(calorie); // 52
```

---

## Benefici per i junior

* Sintassi più **chiara e leggibile**.
* Nessun problema di fall-through.
* Facilita l’uso in contesti funzionali, perché può **ritornare valori** direttamente.
* Consente di usare **più costanti in un case** con la virgola.

