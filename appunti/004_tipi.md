# Tipi di dato primitivi

I tipi di dato primitivi in Java rappresentano i dati più elementari e fondamentali che possono essere utilizzati per dichiarare variabili e memorizzare valori. Essi non sono oggetti e non hanno metodi. Ecco una lista dei tipi di dato primitivi in Java:

---

1. **byte:**
   - Dimensione: 8 bit
   - Intervallo: -128 a 127

---

2. **short:**
   - Dimensione: 16 bit
   - Intervallo: -32,768 a 32,767

---

3. **int:**
   - Dimensione: 32 bit
   - Intervallo: -2,147,483,648 a 2,147,483,647

---

4. **long:**
   - Dimensione: 64 bit
   - Intervallo: -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807

---

5. **float:**
   - Dimensione: 32 bit
   - Precisione: Circa 7 cifre decimali

---

6. **double:**
   - Dimensione: 64 bit
   - Precisione: Circa 15 cifre decimali

---

7. **char:**
   - Dimensione: 16 bit
   - Rappresenta un singolo carattere Unicode

---

8. **boolean:**
   - Dimensione: Non specificata (spesso implementato come 1 bit)
   - Può assumere solo i valori `true` o `false`

Questi tipi di dato primitivi sono essenziali per gestire valori numerici, caratteri e informazioni booleane in maniera efficiente. Quando si utilizzano questi tipi di dato, non si fa riferimento a oggetti come avviene con i tipi di dato non primitivi. Ad esempio, un `int` è un tipo di dato primitivo, mentre un oggetto di tipo `Integer` è un tipo di dato non primitivo. I tipi di dato primitivi in Java sono fondamentali per la programmazione e vengono spesso utilizzati nella gestione di variabili e operazioni matematiche di base.

---

## Tipi di dato in Java

![primitive vs reference](https://raw.githubusercontent.com/maboglia/CorsoJava/master/appunti/img/PrimitiveVsReference.png)


---

## I mattoncini fondamentali

![I mattoncini fondamentali](https://raw.githubusercontent.com/maboglia/CorsoJava/master/appunti/img/model/mattoncini.webp)

---

## Tabelle riassuntive: tipi di dato primitivi

 | type    | bits       |
 | ------- | ---------- |
 | byte    | 8 bit     |
 | short   | 16 bit    |
 | int     | 32 bit    |
 | long    | 64 bit    |
 | float   | 32 bit    |
 | double  | 64 bit    |
 | char    | 16 bit    |
 | boolean | true/false |

**I caratteri sono considerati interi**

---

###  I tipi numerici, i char

* Esempi
* `123` (int)
* `256789L ` (L o l = long)
* `0567` (ottale) `0xff34` (hex)
* `123.75 0.12375e+3 `(float o double)
* `'a' '%' '\n'` (char)
* `'\123'` (\ introduce codice ASCII)

### Tipo boolean

* `true`
* `false`

---

## Esempi

```java
//tipi interi
byte b = 254;//8 bit
short s = 10;//16 bit
int i = 15;//32 bit
long l = 1000000000000l;//64 bit

//tipi reali
float f = 26.012f;//32 bit
double d = 123.567;//64 bit

//booleans
boolean fatto = true;
boolean daFare = false;

//char - rappresentabili anche come interi
char ch = 'a';
char ch2 = ';';
```

---

## uso della variabile locale

```java

//1) dichiarazione
int mioNumero;
//2) inizializzazione
mioNumero = 100;
//3) uso della variabile locale
System.out.println(mioNumero);
```

**NB**: una variabile **locale** deve **SEMPRE** essere **inizializzata**, prima di poter essere utilizzata

---

## Esempio tipi primitivi

```java
//dichiarazione e inizializzazione contemporanea
byte mioByte = 127;
System.out.println(mioByte);

short mioShort = 851;
System.out.println(mioShort);

long mioLong = 34093L;
System.out.println(mioLong);

double mioDouble = 3.14159732;
System.out.println(mioDouble);

float mioFloat = 324.4f;
System.out.println(mioFloat);

char mioChar = 'y';
System.out.println(mioChar);

boolean mioBoolean = true;
System.out.println(mioBoolean);
```

---

## Tipi primitivi: range di valori ammissibili

![tipi primitivi](https://raw.githubusercontent.com/maboglia/CorsoJava/master/appunti/img/tipi.png)

* [raccolta esempi](https://github.com/maboglia/CorsoJava/blob/master/esempi/02_tipi_primitivi.md)
* [altri esempi sui tipi primitivi](https://github.com/maboglia/CorsoJava/blob/master/esempi/01_base/01_tipi)
* [Everything you'll ever need to work with Java primitive types!](https://github.com/deletescape/Primitives)
