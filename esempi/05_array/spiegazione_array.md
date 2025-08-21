# Array in Java – Sintesi ed Esempi

Questo documento riassume e spiega i concetti principali relativi agli **array in Java**, 
mettendo in evidenza gli aspetti chiave visti nei vari esempi del codice allegato.

---

## 1. Dichiarazione e inizializzazione di array

Gli array possono essere dichiarati in vari modi:

```java
int[] ora = new int[7];   // array di 7 interi inizializzati a 0
char[] caratteri;         // dichiarazione di un array di char (non ancora allocato)
String[] nomi = {"Mele", "Pere", "Banane"};  // inizializzazione diretta
```

Gli elementi si accedono tramite indice (0-based):

```java
ora[0] = 10;
System.out.println("Primo elemento: " + ora[0]);
```

---

## 2. Scorrere un array

È possibile scorrere un array con **for tradizionale**, **while** o **for-each**:

```java
for (int i = 0; i < nomi.length; i++) {
    System.out.println("Elemento " + i + ": " + nomi[i]);
}

for (String nome : nomi) {
    System.out.println(nome);
}
```

---

## 3. Array di tipi primitivi e oggetti

Gli array funzionano sia con tipi primitivi che con oggetti:

```java
int[] numeri = {1, 2, 3};
String[] parole = {"Mattina", "M'illumino", "d'immenso"};
```

Esempio di operazioni su stringhe dentro un array:

```java
for (String s : parole) {
    System.out.println(s.toLowerCase());
}
```

---

## 4. Array bidimensionali (matrici)

Gli array possono avere più dimensioni:

```java
int[][] matrice = new int[3][3];
matrice[0][0] = 1;
matrice[2][2] = 9;
```

Scansione di una matrice con doppi cicli:

```java
for (int i = 0; i < matrice.length; i++) {
    for (int j = 0; j < matrice[i].length; j++) {
        System.out.print(matrice[i][j] + " ");
    }
    System.out.println();
}
```

Sono possibili anche array **irregolari** (ragged array):

```java
int[][] irregolare = { {1,2,3}, {4,5}, {6} };
```

---

## 5. Conversioni con array di caratteri

Le stringhe possono essere convertite in array di caratteri e viceversa:

```java
String s = "abc";
char[] chars = s.toCharArray();

String nuova = new String(chars);
```

---

## 6. Copia e ordinamento di array

La classe `Arrays` fornisce metodi utili:

```java
import java.util.Arrays;

int[] numeri = {9, 6, 3};
Arrays.sort(numeri);  // ordinamento

int[] copia = new int[5];
System.arraycopy(numeri, 0, copia, 0, 3);
```

---

## 7. Esercizi pratici con array

- **Somma e media** di elementi:

```java
int[] n = {1,2,3,4,5};
int somma = 0;
for (int x : n) somma += x;
double media = (double) somma / n.length;
```

- **Verifica di palindromo** con array di caratteri:

```java
char[] test = "anna".toCharArray();
boolean palindroma = true;
for (int i = 0; i < test.length / 2; i++) {
    if (test[i] != test[test.length - 1 - i]) {
        palindroma = false;
        break;
    }
}
```

---

## 8. Varargs (array impliciti nei metodi)

Il costrutto `int...` permette di passare un numero variabile di argomenti:

```java
public static int average(int... numbers) {
    int totale = 0;
    for (int x : numbers) totale += x;
    return totale / numbers.length;
}

System.out.println(average(2, 5, 8, 78));
```

---

## 9. Array di oggetti complessi

Esempio di tabella di colazione con prezzi:

```java
String[][] colazione = {
    {"caffé", "1.00"},
    {"brioche", "1.00"},
    {"succo d'arancia", "1.50"}
};

for (int i = 0; i < colazione.length; i++) {
    System.out.println(colazione[i][0] + " - " + colazione[i][1]);
}
```

---

# Conclusioni

Gli array in Java sono strutture fondamentali per memorizzare sequenze di dati.  
Abbiamo visto come **dichiararli, scorrerli, ordinarli, copiarli**, e come gestire matrici e array irregolari.  
Infine, con i **varargs** possiamo sfruttare la flessibilità degli array nei metodi.
