# Elementi fondamentali Java: commenti, operatori ed espressioni

---

![operatori](https://raw.githubusercontent.com/maboglia/CorsoJava/master/appunti/img/Language/01_lang_base/01_operatori_tipi_expr/built-in.png)

---

![expressions](https://raw.githubusercontent.com/maboglia/CorsoJava/master/appunti/img/Language/01_lang_base/01_operatori_tipi_expr/comparison-expressions.png)

---

### **Esempio base di commenti e tipi di dato**

```java
public class EsempioCommentiETipi {
    public static void main(String[] args) {
        // Dichiarazione e inizializzazione di una stringa
        String nomeUtente = "Mauro";

        /*
         * Questo è un commento multi-linea.
         * Utile per descrivere blocchi di codice più complessi.
         */

        /*
        Anche senza asterischi, un commento multi-linea è valido.
        Può essere usato per disabilitare temporaneamente codice.
        */

        // Dichiarazione e inizializzazione di un numero decimale
        float numeroSettimana = 11;

        /**
         * Questo è un commento JavaDoc.
         * Viene utilizzato per documentare metodi e classi.
         */
        System.out.println(nomeUtente + " è arrivato alla settimana " + numeroSettimana + " in condizioni ottimali.");
    }
}
```

---

### **Utilizzo dell'operatore di incremento**

```java
public class OperatoreIncremento {
    public static void main(String[] args) {
        int a = 1, b;

        System.out.println("a inizialmente vale " + a);
        a++;
        System.out.println("Dopo a++, a vale " + a);
        
        // Post-incremento: il valore originale di a viene assegnato a b, poi a viene incrementato
        b = a++;
        System.out.println("Dopo b = a++, a vale " + a + " e b vale " + b);

        // Pre-incremento: a viene incrementato prima di essere assegnato a b
        b = ++a;
        System.out.println("Dopo b = ++a, a vale " + a + " e b vale " + b);
    }
}
```

---

### **Semplici operazioni matematiche**

```java
public class OperazioniMatematiche {
    public static void main(String[] args) {
        int num1 = 5, num2 = 10, risultatoIntero;
        double dec1 = 5.0, dec2 = 10.0, risultatoDecimale;

        // Operazioni con interi
        risultatoIntero = -num1;
        System.out.println("-" + num1 + " vale " + risultatoIntero);
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));

        // Operazioni con numeri decimali
        risultatoDecimale = -dec1;
        System.out.println("-" + dec1 + " vale " + risultatoDecimale);
        System.out.println(dec1 + " + " + dec2 + " = " + (dec1 + dec2));
        System.out.println(dec1 + " - " + dec2 + " = " + (dec1 - dec2));
        System.out.println(dec1 + " * " + dec2 + " = " + (dec1 * dec2));
    }
}
```

---

### **Divisioni tra interi e decimali**

```java
public class OperazioniDivisione {
    public static void main(String[] args) {
        int intero1 = 6, intero2 = 5, intero3 = 3, risultatoIntero;
        float float1 = 6.0f, float2 = 5.0f, float3 = 3.0f, risultatoFloat;

        // Divisioni con numeri interi (senza decimali)
        risultatoIntero = intero1 / intero2;
        System.out.println(intero1 + " / " + intero2 + " = " + risultatoIntero);
        risultatoIntero = intero1 / intero3;
        System.out.println(intero1 + " / " + intero3 + " = " + risultatoIntero);

        // Divisioni con numeri decimali (mantiene i decimali)
        risultatoFloat = float1 / float2;
        System.out.println(float1 + " / " + float2 + " = " + risultatoFloat);
        risultatoFloat = float1 / float3;
        System.out.println(float1 + " / " + float3 + " = " + risultatoFloat);
    }
}
```

---

### **Operatore modulo e approssimazione nei calcoli**

```java
public class OperatoreModulo {
    public static void main(String[] args) {
        int intero1 = 6, intero2 = 5;
        double decimale1 = 6.1, decimale2 = 1.2;

        System.out.println(intero1 + " % " + intero2 + " = " + (intero1 % intero2));
        System.out.println(decimale1 + " % " + decimale2 + " = " + (decimale1 % decimale2));
    }
}
```

---

### **Operatori di confronto**

```java
public class OperatoriConfronto {
    public static void main(String[] args) {
        int num1 = 3, num2 = 6;
        char char1 = 'a', char2 = 'b';

        System.out.println(num1 + " >= " + num2 + " restituisce " + (num1 >= num2));
        System.out.println(char1 + " <= " + char2 + " restituisce " + (char1 <= char2));
        System.out.println("Confronto booleano: " + (num1 >= num2) + " != " + (char1 <= char2) + " restituisce " + ((num1 >= num2) != (char1 <= char2)));
    }
}
```

---

### **Operatori logici booleani**

```java
public class OperatoriBooleani {
    public static void main(String[] args) {
        boolean b1 = 3 > 5;
        boolean b2 = 1 < 10;

        System.out.println("3 > 5 e 1 < 10 → " + (b1 & b2));
        System.out.println("3 > 5 o 1 < 10 → " + (b1 | b2));
        System.out.println("O esclusivo: 3 > 5 XOR 1 < 10 → " + (b1 ^ b2));
    }
}
```

---

### **Tipo `char` e Unicode**

```java
public class EsempioCaratteri {
    public static void main(String[] args) {
        char c1 = 97; // Codice ASCII per 'a'
        char c2 = 'a';
        char c3 = 'z';

        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        System.out.println("c3: " + c3);

        // Incremento del carattere
        c1++;
        System.out.println("Dopo incremento, c1 vale " + c1);
    }
}
```

---

### **Cast da `int` a `byte`**

```java
public class CastNumerico {
    public static void main(String[] args) {
        int int1 = 10, int2 = 257, int3 = 513;
        byte b1 = (byte) int1;
        byte b2 = (byte) int2;
        byte b3 = (byte) int3;

        System.out.println("Cast di " + int1 + " a byte: " + b1);
        System.out.println("Cast di " + int2 + " a byte: " + b2);
        System.out.println("Cast di " + int3 + " a byte: " + b3);
    }
}
```

