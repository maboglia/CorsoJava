# gestire e formattare i numeri

In Java, ci sono diverse modalità per gestire e formattare i numeri, che variano a seconda del tipo di numero (intero, decimale, valuta, percentuale, ecc.). Le principali modalità per lavorare con i numeri sono:

---

### 1. **Formattazione di numeri interi e decimali**

Java offre diversi strumenti per formattare i numeri, come `String.format()`, `DecimalFormat`, e `printf()`.

---

#### 1.1 **`String.format()`**

`String.format()` ti consente di formattare i numeri in base a un formato specificato. Ad esempio:

```java
int number = 12345;
double price = 1234.56;

String formattedNumber = String.format("%,d", number); // Aggiunge le virgole come separatori delle migliaia
String formattedPrice = String.format("%.2f", price);  // Mostra 2 decimali

System.out.println(formattedNumber); // 12,345
System.out.println(formattedPrice);  // 1234.56
```

- `%d`: Formatta i numeri interi.
- `%f`: Formatta i numeri a virgola mobile (float/double).
- `%,d`: Aggiunge un separatore di migliaia.
- `%.2f`: Limita la parte decimale a 2 cifre.

---

#### 1.2 **`printf()`**

`printf()` funziona come `String.format()`, ma stampa direttamente il risultato sulla console:

```java
int number = 12345;
double price = 1234.56;

System.out.printf("%,d%n", number);      // 12,345
System.out.printf("%.2f%n", price);      // 1234.56
```

---

#### 1.3 **`DecimalFormat`**

`DecimalFormat` è una classe specifica per la formattazione dei numeri decimali. È molto utile se desideri un formato personalizzato (ad esempio, numeri con separatori di migliaia, percentuali, ecc.).

```java
import java.text.DecimalFormat;

double number = 12345.6789;
---DecimalFormat df = new DecimalFormat

("#,###.##"); // formato per migliaia e due decimali

System.out.println(df.format(number));  // 12,345.68
```

Alcuni altri pattern di `DecimalFormat`:

- `0`: Forza la visualizzazione di uno zero, se necessario (es. `0.00`).
- `#`: Mostra un numero solo se c'è una cifra.
- `,`: Usato per separare le migliaia.

---

#### 1.4 **Percentuali**

Puoi formattare i numeri come percentuali utilizzando `DecimalFormat` o `String.format()`:

```java
double percentage = 0.25;
System.out.printf("%.2f%%\n", percentage * 100); // 25.00%
```

Oppure con `DecimalFormat`:

```java
DecimalFormat df = new DecimalFormat("#0.00%");
System.out.println(df.format(percentage)); // 25.00%
```

---

### 2. **Formattazione della valuta**

Per la formattazione della valuta, puoi usare `NumberFormat`, che è specifico per i numeri monetari e si adatta alla locale (lingua/paese) configurata.

---

#### 2.1 **`NumberFormat` per la valuta**

```java
import java.text.NumberFormat;
import java.util.Locale;

double price = 1234.56;

NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);
System.out.println(currencyFormat.format(price)); // $1,234.56
```

Puoi cambiare la `Locale` per adattare la valuta a un altro paese (ad esempio, per l'Italia puoi usare `Locale.ITALY`).

---

#### 2.2 **Formattazione personalizzata con `DecimalFormat`**

Anche `DecimalFormat` può essere utilizzato per formattare la valuta:

```java
DecimalFormat df = new DecimalFormat("¤#,##0.00"); // Il simbolo della valuta è aggiunto automaticamente
System.out.println(df.format(price)); // $1,234.56 (se Locale.US è impostato)
```

---

### 3. **Utilizzare `BigDecimal` per numeri ad alta precisione**

Quando hai bisogno di lavorare con numeri che richiedono un'alta precisione (ad esempio, per applicazioni finanziarie), puoi usare `BigDecimal`, che evita i problemi di arrotondamento tipici di `float` e `double`.

```java
import java.math.BigDecimal;
import java.math.RoundingMode;

BigDecimal value = new BigDecimal("1234.5678");
value = value.setScale(2, RoundingMode.HALF_UP); // Arrotonda a due decimali

System.out.println(value);  // 1234.57
```

---

### 4. **Impostare la lingua/locale per la formattazione**

La formattazione dei numeri può variare a seconda della locale, come ad esempio la separazione decimale con il punto o la virgola. Puoi impostare la locale per formattare correttamente i numeri in base alla lingua e al paese dell'utente.

---

#### 4.1 **Impostare la locale per `NumberFormat`**

```java
import java.text.NumberFormat;
import java.util.Locale;

double number = 12345.6789;

NumberFormat nf = NumberFormat.getInstance(Locale.FRANCE);  // Locale per la Francia
System.out.println(nf.format(number));  // 12 345,6789
```

---

### 5. **Gestire la precisione nei numeri decimali**

Se hai bisogno di controllare la precisione nei calcoli con numeri decimali (come nel caso delle valute o di calcoli scientifici), puoi utilizzare `BigDecimal` o il metodo `setScale()`.

```java
BigDecimal result = new BigDecimal("123.456789");
result = result.setScale(2, RoundingMode.HALF_UP); // Arrotonda a 2 decimali
System.out.println(result);  // 123.46
```

---

### Riepilogo delle tecniche

- **Concatenazione**: Usa `+` per concatenare numeri e stringhe.
- **`String.format()` e `printf()`**: Formattazione di numeri con specifiche di formato.
- **`DecimalFormat`**: Personalizzazione avanzata di come i numeri vengono formattati (separatori di migliaia, decimali, percentuali, ecc.).
- **`NumberFormat`**: Utilizzato per formattare la valuta e altre forme numeriche locali.
- **`BigDecimal`**: Precisione elevata per operazioni con numeri decimali, utile per evitare imprecisioni nei calcoli finanziari.

Con queste tecniche, puoi gestire e formattare i numeri in Java in modo molto flessibile e adatto alle esigenze della tua applicazione.
