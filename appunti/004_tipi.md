### Tipi di dato primitivi in Java (2024)

I **tipi di dato primitivi** rappresentano i costituenti fondamentali in Java. Essi forniscono le basi per la dichiarazione delle variabili e la gestione dei dati semplici, come numeri, caratteri e valori booleani. A differenza dei tipi di dato complessi, i tipi primitivi **non sono oggetti** e non possiedono metodi. Con l'evoluzione di Java fino al 2024, il loro ruolo rimane cruciale, specialmente per le operazioni di basso livello che richiedono efficienza e semplicità.

---

![Types](https://github.com/maboglia/CorsoJava/raw/master/appunti/img/PrimitiveVsReference.png)

---

### 1. **byte:**
   - **Dimensione:** 8 bit
   - **Intervallo:** -128 a 127
   - Utilizzato principalmente per risparmiare memoria in grandi array, soprattutto in file binari.

### 2. **short:**
   - **Dimensione:** 16 bit
   - **Intervallo:** -32,768 a 32,767
   - Spesso utilizzato quando lo spazio in memoria è limitato, come per rappresentare numeri in applicazioni embedded.

### 3. **int:**
   - **Dimensione:** 32 bit
   - **Intervallo:** -2,147,483,648 a 2,147,483,647
   - Il tipo più comunemente utilizzato per rappresentare numeri interi.

### 4. **long:**
   - **Dimensione:** 64 bit
   - **Intervallo:** -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
   - Usato per numeri interi che superano l'intervallo dell'`int`.

---

### 5. **float:**
   - **Dimensione:** 32 bit
   - **Precisione:** Circa 7 cifre decimali
   - Utilizzato per i numeri decimali quando la precisione richiesta non è molto elevata (come per i calcoli grafici o scientifici).

### 6. **double:**
   - **Dimensione:** 64 bit
   - **Precisione:** Circa 15 cifre decimali
   - Il tipo preferito per rappresentare numeri decimali in applicazioni di calcolo più complesse.

### 7. **char:**
   - **Dimensione:** 16 bit
   - **Intervallo:** 0 a 65,535 (rappresenta un singolo carattere Unicode)
   - Utilizzato per memorizzare caratteri singoli, tra cui simboli speciali e lettere in lingue diverse.

### 8. **boolean:**
   - **Dimensione:** non specificata (generalmente 1 bit)
   - Può assumere solo i valori `true` o `false`
   - Utilizzato principalmente per controllare il flusso dei programmi tramite condizioni logiche.

---

### Evoluzione e ottimizzazioni (2024)

Nonostante Java sia giunto a versioni molto avanzate, i tipi primitivi restano cruciali. Le versioni più recenti del linguaggio, come Java 21, non hanno modificato la struttura di base di questi tipi, ma hanno ottimizzato ulteriormente la gestione della memoria e l'efficienza computazionale, rendendo i tipi primitivi ancora più performanti.

---

## **Esempi pratici di utilizzo**

### Dichiarazione di variabili primitive e stampa dei loro valori:

```java
// Tipi interi
byte mioByte = 127;
System.out.println(mioByte);

short mioShort = 851;
System.out.println(mioShort);

long mioLong = 34093L;
System.out.println(mioLong);

// Tipi reali
float mioFloat = 324.4f;
System.out.println(mioFloat);

double mioDouble = 3.14159732;
System.out.println(mioDouble);

// Carattere e booleano
char mioChar = 'y';
System.out.println(mioChar);

boolean mioBoolean = true;
System.out.println(mioBoolean);
```

---

### Dichiarazione e utilizzo di variabili locali:

```java
// 1) Dichiarazione
int mioNumero;
// 2) Inizializzazione
mioNumero = 100;
// 3) Utilizzo della variabile locale
System.out.println(mioNumero);
```
> **Nota:** Le variabili locali devono sempre essere inizializzate prima dell'utilizzo.

---

### **Tabelle riassuntive dei tipi di dato primitivi**

| Tipo    | Dimensione  |
| ------- | ----------- |
| byte    | 8 bit       |
| short   | 16 bit      |
| int     | 32 bit      |
| long    | 64 bit      |
| float   | 32 bit      |
| double  | 64 bit      |
| char    | 16 bit      |
| boolean | true/false  |

---

### **Conclusioni**

I **tipi primitivi** in Java rimangono fondamentali per la gestione di dati semplici e per garantire l'efficienza nelle applicazioni. Con l'evoluzione del linguaggio, Java ha mantenuto il focus sulla robustezza e sull'efficienza di questi tipi, continuando a renderli la scelta preferita per le operazioni di base, specialmente in ambiti ad alte prestazioni come il machine learning, l'intelligenza artificiale e i sistemi embedded.
