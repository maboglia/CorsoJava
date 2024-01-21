# Uso di Espressioni, Variabili, Math e Input dall’utente

---

## Esercizio NomeCognome

Scrivere un programma NomeCognome che scrive il vostro nome e il vostro cognome uno
sotto l’altro.
---

## Esercizio RadiceQuadrata

Scrivere un programma `RadiceQuadrata` che chiede all’utente di insere un numero intero e ne stampa la radice quadrata (numero frazionario).
Usa la classe `java.lang.Math`


---

## Esercizio PerimetroRettangolo

Scrivere un programma PerimetroRettangolo che calcola il perimetro di un rettangolo di base e altezza inserite dall'utente.

---

## Esercizio AreaCerchio

Scrivere un programma AreaCerchio che chiede all’utente di inserire la lunghezza del raggio di un cerchio e ne calcola l’area. 
ATTENZIONE: memorizzare il valore di pi-greco in una costante.

---

## Esercizio Divisione

Scrivere un programma Divisione che chiede all’utente due numeri interi e stampa prima il quoziente della loro divisione intera e poi il resto.

---

## Esercizio SommaProdotto

Scrivere un programma SommaProdotto che chiede all’utente di inserire due valori interi e ne calcola la somma e il prodotto.

---

## Esercizio SommaDiQuattro

Scrivere un programma SommaDiQuattro che chiede all’utente di inserire quattro valori interi, e ne stampa la somma. 

---

## Esercizio SommaApprossimata

Scrivere un programma SommaApprossimata che chiede all’utente di inserire due numeri
con la virgola, li somma e poi stampa il risultato come numero intero.

---

## Esercizio OreInMinuti

Scrivere un programma OreInMinuti che chiede all’utente di inserire un numero frazionario che rappresenta un tempo espresso in ore (ad esempio 3.5 per 3 ore e mezzo) e stampa il corrispondente tempo espresso in minuti (ad esempio 210). 
Il risultato stampato deve essere un numero intero (ossia, NON deve essere 210.0).

---

## Esercizio MinutiInOre

Scrivere un programma MinutiInOre che chiede all’utente di inserire un numero intero che rappresenta un tempo espresso in minuti (ad esempio 210) e stampa il corrispondente tempo espresso in ore e minuti (ad esempio 3 ore e 30 minuti). 
Il risultato stampato deve essere un numero intero (ossia, NON deve essere 3.0 ore e 30.0 minuti).

---

**Domande:**

1. Gli operatori possono essere utilizzati nella costruzione di espressioni, che calcolano valori.
   * Risposta: Gli operatori possono essere utilizzati nella costruzione di espressioni, che calcolano valori.

2. Le espressioni sono i componenti principali delle istruzioni.
   * Risposta: Le espressioni sono i componenti principali delle istruzioni.

3. Le istruzioni possono essere raggruppate in blocchi.
   * Risposta: Le istruzioni possono essere raggruppate in blocchi.

4. Il seguente frammento di codice è un esempio di un'espressione composta.

```java
1 * 2 * 3
```

* Risposta: Vero, è un'espressione composta che calcola il prodotto di 1, 2 e 3.

5. Le istruzioni sono approssimativamente equivalenti alle frasi nei linguaggi naturali, ma invece di terminare con un punto, un'istruzione termina con un punto e virgola.
   * Risposta: Vero, le istruzioni terminano con un punto e virgola.

6. Un blocco è un gruppo di zero o più istruzioni tra parentesi graffe bilanciate e può essere utilizzato ovunque sia consentita una singola istruzione.
   * Risposta: Vero, un blocco è un gruppo di istruzioni racchiuso tra parentesi graffe e può essere utilizzato come una singola istruzione.

**Esercizi:**

Identifica i seguenti tipi di espressioni-istruzioni:

1. `aValue = 8933.234;` // istruzione di assegnazione
2. `aValue++;` // istruzione di incremento
3. `System.out.println("Hello World!");` // istruzione di invocazione del metodo
4. `Bicycle myBike = new Bicycle();` // istruzione di creazione dell'oggetto


---

**Domande:**

1. Considera il seguente frammento di codice.

```java
arrayOfInts[j] > arrayOfInts[j+1]
```

Quali operatori contiene il codice?

- Risposta: Contiene l'operatore di confronto ">", che confronta se l'elemento nell'indice j è maggiore dell'elemento nell'indice j+1 nell'array.

---

2. Considera il seguente frammento di codice.

```java
int i = 10;
int n = i++%5;
```

- Quali sono i valori di i e n dopo l'esecuzione del codice?
  - Risposta: Dopo l'esecuzione, i è 11 e n è 0.
- Quali sono i valori finali di i e n se, invece di utilizzare l'operatore di incremento postfix (i++), si utilizza la versione prefix (++i))?
  - Risposta: Con l'operatore di incremento prefix, i diventa 11 e n diventa 1.

---

3. Per invertire il valore di un booleano, quale operatore utilizzeresti?

   - Risposta: L'operatore di negazione logica "!".

4. Quale operatore viene utilizzato per confrontare due valori, = o == ?

   - Risposta: L'operatore di confronto è "==".

5. Spiega il seguente frammento di codice: `result = someCondition ? value1 : value2;`

   - Risposta: Questo è un operatore ternario condizionale. Se someCondition è vera, result verrà assegnato a value1; altrimenti, verrà assegnato a value2.

---

**Esercizi:**

1. Modifica il programma seguente per utilizzare gli assegnamenti composti:

```java
class ArithmeticDemo {
     public static void main (String[] args){
          int result = 1 + 2; // result è ora 3
          System.out.println(result);

          result = result - 1; // result è ora 2
          System.out.println(result);

          result = result * 2; // result è ora 4
          System.out.println(result);

          result = result / 2; // result è ora 2
          System.out.println(result);

          result = result + 8; // result è ora 10
          result = result % 7; // result è ora 3
          System.out.println(result);
     }
}
```

- Risposta: Modificare gli operatori di assegnamento nelle espressioni con gli operatori composti (+=, -=, *=, /=, %=).

---

2. Nel programma seguente, spiega perché il valore "6" viene stampato due volte di seguito:

```java
class PrePostDemo {
    public static void main(String[] args){
        int i = 3;
        i++;
        System.out.println(i);    // "4"
        ++i;                     
        System.out.println(i);    // "5"
        System.out.println(++i);  // "6"
        System.out.println(i++);  // "6"
        System.out.println(i);    // "7"
    }
}
```

- Risposta: La linea `System.out.println(i++);` stampa "6" perché utilizza l'incremento postfix, quindi stampa il valore di i prima di incrementarlo. Successivamente, quando viene stampato nuovamente, i è stato incrementato a 7.

---

**Domande:**

1. Il termine "variabile di istanza" è un altro nome per ___.
   * Risposta: Variabile membro.

---

2. Il termine "variabile di classe" è un altro nome per ___.
   * Risposta: Variabile statica.

---

3. Una variabile locale memorizza uno stato temporaneo; è dichiarata all'interno di un ___.
   * Risposta: Metodo.

---

4. Una variabile dichiarata tra la parentesi di apertura e chiusura della firma di un metodo è chiamata ___.
   * Risposta: Parametro.

---

5. Quali sono gli otto tipi di dati primitivi supportati dal linguaggio di programmazione Java?
   * Risposta:
     * byte
     * short
     * int
     * long
     * float
     * double
     * char
     * boolean

---

6. Le stringhe di caratteri sono rappresentate dalla classe ___.
   * Risposta: Stringa.

---

7. Un ___ è un oggetto contenitore che tiene un numero fisso di valori di un singolo tipo.
   * Risposta: Array.

---

**Esercizi:**

1. Crea un piccolo programma che definisce alcuni campi. Prova a creare alcuni nomi di campi illegali e verifica quale tipo di errore il compilatore produce. Usa le regole e le convenzioni di denominazione come guida.

---

```java
public class EsempioNomiCampi {
    // Nomi di campi legali
    int nomeCampoValido;
    String altroNomeCampoValido;

    // Nomi di campi illegali (decommenta per vedere gli errori del compilatore)
    // int 123NomeCampoIllegale;  // Errore: gli identificatori devono iniziare con una lettera o un underscore
    // double nome Campo Illegale;  // Errore: gli spazi non sono consentiti negli identificatori
    // float $nomeCampoIllegale;  // Errore: '$' non è un carattere valido per un identificatore
}
```

---

2. Nel programma creato nell'Esercizio 1, prova a lasciare i campi non inizializzati e stampa i loro valori. Prova la stessa cosa con una variabile locale e verifica quale tipo di errori del compilatore puoi produrre. Conoscere gli errori comuni del compilatore renderà più facile riconoscere bug nel tuo codice.

---

```java
public class EsempioInizializzazioneVariabili {
    // Campi
    int campoNonInizializzato;  // Il compilatore fornirà un valore predefinito (0 per int)

    public void stampaValori() {
        // Variabile locale
        int variabileLocaleNonInizializzata;
        
        // Decommentare la riga successiva causerà un errore del compilatore
        // System.out.println(variabileLocaleNonInizializzata);  // Errore: la variabile potrebbe non essere stata inizializzata

        System.out.println("Campo Non Inizializzato: " + campoNonInizializzato);
    }
}
```

Questi esercizi dimostrano l'importanza di seguire le convenzioni di denominazione e di inizializzare le variabili prima di utilizzarle per evitare errori di compilazione.
