# Espressioni regolari

Le espressioni regolari (regex o regexp) sono potenti strumenti per la ricerca e la manipolazione di testo basato su modelli di stringhe. Una regex è una sequenza di caratteri che definisce un modello di ricerca. Questi modelli possono essere utilizzati in vari contesti, come la validazione di stringhe, la ricerca di testo in un documento o la sostituzione di parti di una stringa.

Ecco alcune informazioni fondamentali sulle espressioni regolari:

---

### Sintassi di Base

- **Caratteri Literal:** I caratteri normali (non speciali) nella regex corrispondono esattamente a se stessi. Ad esempio, il pattern `"abc"` corrisponde alla stringa "abc".

- **Meta-Caratteri:** Alcuni caratteri hanno significati speciali nella regex e sono noti come meta-caratteri. Alcuni esempi di meta-caratteri comuni includono `^`, `$`, `*`, `+`, `?`, `.`, `()`, `[]`, `{}`, etc.

---

### Quantificatori

- `*`: Corrisponde a zero o più occorrenze del carattere precedente. Ad esempio, `"a*"` corrisponde a "", "a", "aa", "aaa", ecc.

- `+`: Corrisponde a una o più occorrenze del carattere precedente. Ad esempio, `"a+"` corrisponde a "a", "aa", "aaa", ecc., ma non a "".

- `?`: Rende facoltativo il carattere precedente, corrispondendo a zero o una sola occorrenza.

- `{n}`: Corrisponde esattamente a n occorrenze del carattere precedente. Ad esempio, `"a{3}"` corrisponde a "aaa".

- `{n,}`: Corrisponde a n o più occorrenze del carattere precedente.

- `{n,m}`: Corrisponde a un numero compreso tra n e m di occorrenze del carattere precedente.

---

### Gruppi e Parentesi

- `()`: Utilizzati per raggruppare parti di una regex. Consentono di applicare quantificatori o altri costrutti a un gruppo di caratteri.

- `|`: Funge da operatore logico OR. Ad esempio, `"a|b"` corrisponde a "a" o "b".

---

### Caratteri Speciali

- `.` (punto): Corrisponde a qualsiasi singolo carattere, ad eccezione di un carattere di nuova riga.

- `^`: Indica l'inizio di una riga.

- `$`: Indica la fine di una riga.

- `\`: Utilizzato per l'escape di caratteri speciali o per introdurre sequenze di escape speciali.

---

### Classi di Caratteri

- `[]`: Definisce una classe di caratteri. Ad esempio, `"[aeiou]"` corrisponde a qualsiasi vocale.

- `[^]`: Corrisponde a qualsiasi carattere che non è nell'insieme specificato.

---

### Caratteri di Escape

- `\d`: Corrisponde a un carattere numerico.

- `\w`: Corrisponde a un carattere alfanumerico o all'underscore.

- `\s`: Corrisponde a uno spazio bianco (spazio, tabulazione, nuova riga).

---

### Esempi di Utilizzo

- **Email Validation:**

  ```regex
  ^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$
  ```

- **Data (Formato MM/DD/YYYY):**

  ```regex
  ^(0[1-9]|1[0-2])/(0[1-9]|[12][0-9]|3[01])/\d{4}$
  ```

- **Ricerca di URL:**

  ```regex
  https?://(?:www\.)?[a-zA-Z0-9-]+\.[a-zA-Z]{2,}
  ```

---

### Strumenti Online

Ci sono vari strumenti online che consentono di testare ed esplorare espressioni regolari, come Regex101 o RegExr. Questi strumenti sono utili per sperimentare e capire come funzionano le espressioni regolari.

---

### Conclusioni

Le espressioni regolari sono uno strumento potente e flessibile per manipolare e analizzare stringhe di testo. Tuttavia, possono diventare complesse e difficili da leggere a causa della loro sintassi. Pratica ed esperienza sono chiave per diventare competenti nell'uso delle espressioni regolari.

---

## Espressioni regolari in Java

In Java, le espressioni regolari sono implementate nel package `java.util.regex`. L'utilizzo delle espressioni regolari in Java coinvolge principalmente due classi: `Pattern` e `Matcher`.

Ecco una breve panoramica sull'uso delle espressioni regolari in Java:

---

### Creazione di un Modello (Pattern):

```java
import java.util.regex.Pattern;

// Creare un pattern per cercare sequenze di tre cifre
Pattern pattern = Pattern.compile("\\d{3}");
```

---

### Ricerca di Corrispondenze (Matcher):

```java
import java.util.regex.Matcher;

// Creare un matcher per cercare il pattern nella stringa di input
Matcher matcher = pattern.matcher("123-456-789");

// Verificare se c'è una corrispondenza
if (matcher.find()) {
    System.out.println("Corrispondenza trovata: " + matcher.group());
} else {
    System.out.println("Nessuna corrispondenza trovata.");
}
```

---

### Alcuni Esempi di Utilizzo:

#### Validazione di un Indirizzo Email:

```java
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmailValidator {
    private static final String EMAIL_PATTERN =
        "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    private final Pattern pattern;

    public EmailValidator() {
        pattern = Pattern.compile(EMAIL_PATTERN);
    }

    public boolean isValid(String email) {
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        EmailValidator validator = new EmailValidator();
        String testEmail = "test@example.com";

        if (validator.isValid(testEmail)) {
            System.out.println("L'indirizzo email è valido.");
        } else {
            System.out.println("L'indirizzo email non è valido.");
        }
    }
}
```

---

#### Estrazione di Numeri Telefonici da una Stringa:

```java
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberExtractor {
    public static void main(String[] args) {
        String inputText = "Il mio numero è 123-456-7890 e il numero di casa è 987-654-3210.";

        Pattern pattern = Pattern.compile("\\b\\d{3}-\\d{3}-\\d{4}\\b");
        Matcher matcher = pattern.matcher(inputText);

        while (matcher.find()) {
            System.out.println("Numero telefonico trovato: " + matcher.group());
        }
    }
}
```

---

Questi sono solo esempi di base e le espressioni regolari possono diventare molto complesse a seconda delle esigenze. È possibile combinare diversi simboli e costrutti per creare modelli avanzati. La documentazione ufficiale di Java offre una guida completa sulla sintassi delle espressioni regolari: [Java Regex Documentation](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html).

---

#### Ricercare una stringa all’interno di un’altra.

```java
String regex = "[a-zA-Z0-9._%-]+@[ a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}";
String input = "pippo@gmail.com;pluto@gmail.com;paperino@gmail.com";

Pattern pattern = Pattern.compile(regex);
Matcher matcher = pattern.matcher(input);

while (matcher.find())
	System.out.println(matcher.group());
```

Il metodo **find()** della classe Matcher, ricerca una sottostringa all’interno della stringa di ingresso che rispetta il formato dell’espressione regolare. Il metodo **find()** funziona come un iterator, cioè aggiorna gli indici ad ogni iterazione.
