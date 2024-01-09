# Espressioni

Le espressioni in programmazione sono combinazioni di valori, operatori e chiamate di funzioni che possono essere valutate per produrre un risultato. Le espressioni possono rappresentare calcoli aritmetici, valutazioni booleane, concatenazioni di stringhe e altro ancora. Le espressioni sono fondamentali per la creazione di logica e la manipolazione dei dati all'interno di un programma. Ecco alcuni esempi di espressioni:

---

1. **Espressioni Aritmetiche:**

   ```java
   int risultato = 2 + 3 * (5 - 1);
   ```

   In questo esempio, l'espressione aritmetica viene valutata secondo le regole di precedenza degli operatori.

---

2. **Espressioni Booleane:**

   ```python
   boolean condizione = (x > 5) && (y <= 10);
   ```

   Qui, l'espressione booleana verifica se entrambe le condizioni sono vere.

---

3. **Espressioni di Concatenazione di Stringhe:**

   ```javascript
   let nomeCompleto = nome + " " + cognome; 
   ```

   Questa espressione concatena le variabili `nome` e `cognome` in una stringa più lunga.

---

4. **Espressioni di Assegnamento:**

   ```c
   x = y + 5;
   ```

   In questo caso, l'espressione assegna a `x` il valore di `y` più 5.

---

5. **Chiamate di Funzioni:**

   ```java
   double risultatoFunzione = Math.sqrt(25);
   ```

   L'espressione chiama la funzione `sqrt` della classe `Math` per calcolare la radice quadrata di 25.

---

6. **Espressioni Ternarie:**

   ```javascript
   let risultato = (x > 0) ? "Positivo" : "Negativo";
   ```

   Questa espressione ternaria restituisce "Positivo" se `x` è maggiore di 0 e "Negativo" altrimenti.

---

7. **Espressioni di Array e Oggetti:**

   ```python
   valore = array[indice];
   ```

   Questa espressione ottiene il valore di un elemento specifico in un array.

Le espressioni possono essere più complesse con l'uso di parentesi per determinare l'ordine di valutazione. Possono anche coinvolgere variabili, costanti e altri costrutti del linguaggio di programmazione. In generale, le espressioni sono fondamentali per scrivere codice che esegue calcoli e prende decisioni in base alle condizioni e ai dati presenti nel programma

---

## per esempio nel programma

```java
public class Triangolo {
    public static void main ( String [] args ) {
        
        double area = 5*10/2;
        System.out.println (area);
    }
}
```

Il programma risolve l'espressione aritmetica `5*10/2`, memorizza in `area` il risultato e lo stampa a video


---

## Espressioni aritmetiche e precedenza

singoli "letterali"

* Letterali interi: 3425, 12, -34, 0, -4, 34, -1234, ....
* Letterali frazionari: 3.4, 5.2, -0.1, 0.0, -12.45, 1235.3423, ....

operatori aritmetici

* moltiplicazione `*`
* divisione `/`
* modulo `%` (resto della divisione tra interi)
* addizione `+`
* sottrazione `-`

Le operazioni sono elencate in **ordine decrescente di priorità** ossia `3+2*5` fa 13, non 25

Le parentesi tonde cambiano l'ordine di valutazione degli operatori ossia `(3+2)*5` fa 25

Inoltre, tutti gli operatori sono associativi a sinistra ossia `3+2+5` corrisponde a `(3+2)+5` quindi `18/6/3` fa 1, non 9

---

### operazione di divisione

* L'operazione di divisione / si comporta diversamente a seconda che sia applicato a letterali interi o frazionari
* `25/2 = 12` (divisione intera)
* `25%2 = 1` (resto della divisione intera)
* `25.0/2.0 = 12.5` (divisione reale)
* `25.0%2.0 = 1.0` (resto della divisione intera)
* Una operazione tra un letterale intero e un frazionario viene eseguita come tra due frazionari
* `25/2.0 = 12.5`
* `1.5 + (25/2) = 13.5` (attenzione all'ordine di esecuzione delle operazioni)
* `2 + (25.0/2.0) = 14.5` usare le parentesi ()

[esempi](https://github.com/maboglia/CorsoJava/blob/master/esempi/01_Operatori_Tipi.md)


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
