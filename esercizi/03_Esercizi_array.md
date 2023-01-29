# Esercizi con gli array

## Esercizio Lettura e stampa di un array

Scrivere un programma che legge da input 5 elementi interi, li memorizza in un array e stampa il contenuto dell’array

---

## Esercizio StampaZigZag

Scrivere un programma **StampaZigZag** che prevede un array di 10 numeri interi contenente valori a piacere e ne stampa gli elementi secondo il seguente ordine: il primo, l’ultimo, il secondo, il penultimo, il terzo, il terz’ultimo, ecc... 

Il nome dell’array può essere scelto a piacere.

---

## Esercizio Istogramma

Scrivere un programma che disegni l'istogramma di
un array di interi precaricato.

```text
Es. Se vettore = {4, 7, 2}, l'output sarà:
0: ****
1: *******
2: **
```

---

## Esercizio SommaPariDispari

Scrivere un programma **SommaPariDispari** che prevede un array di 10 numeri interi contenente valori a piacere e stampa Pari e dispari uguali se la somma dei numeri in posizioni pari dell’array è uguale alla somma dei numeri in posizioni dispari, altrimenti il programma stampa Pari e dispari diversi.

---

## Esercizio SecondoArray

Scrivere un programma **SecondoArray** che chiede all’utente di inserire 10 numeri interi e li memorizza in un array. 

Successivamente, crea un nuovo array di dimensione pari al numero di valori maggiori o uguali a zero inseriti dall’utente. 

Copia tutti i valori maggiori o uguali a zero nel nuovo array e ne stampa i valori in ordine inverso.

---

## Esercizio TreConsecutivi

Scrivere un programma **TreConsecutivi** che prevede un array di 10 numeri interi contenente valori a piacere, devi verificare se ci sono valori consecutivi uguali.

Se l’array contiene tre valori uguali in tre posizioni consecutive, altrimenti stampa "NO".

---

## Esercizio DoppioUnoDellaltro

Scrivere un programma **DoppioUnoDellaltro** che he prevede un array di 10 numeri interi contenente valori a piacere e stampa "Doppio uno dell’altro" se nell’array sono presenti due valori che sono l’uno il doppio dell’altro, oppure stampa "NO" altrimenti.

---

## Esercizio MinimoDiArray

Scrivere il programma **MinimoDiArray** che chiede all’utente di inserire 10 numeri, li memorizza in un array e poi stampa valore e posizione dell’elemento minimo dell’array. 
Se il valore minimo è presente più di una volta, stampa la posizione della prima occorrenza di tale valore nell’array.

---

## Massimo elemento in un array

Scrivere un metodo `int massimoArray(int[ ] a)` che calcola e restituisce il valore del massimo elemento di un array di interi non vuoto a

* `massimoArray( new int[ ] { 3, 1, 2 } )` deve restituire 3
* `massimoArray( new int[ ] { 3, 7, 5 } )` deve restituire 7

 Scrivere un metodo int posizioneMassimo(int[ ] a) che calcola la posizione dell’elemento di valore massimo di a

* `posizioneMassimo( new int[ ] { 3, 1, 2 } )` deve restituire 0
* `posizioneMassimo( new int[ ] { 3, 1, 3 } )` può restituire 0 o 2

---

## Esercizio Prodotto di Matrici

Scrivere un programma che legga i valori di due
matrici in input, ne effettui il prodotto e stampi
il risultato.

---

## Esercizio Cerca

Scrivere il programma **Cerca** che crea e inizializza un array di int contenente 10 valori a piacere (usando il comando di inizializzazione che prevede la lista dei valori tra parentesi graffe), chiede all’utente di inserire un numero e stampa Presente se il numero è presente nell’array, oppure Assente se il numero non è presente. 
Provare a risolvere questo esercizio in due modi: tramite un for-each e tramite un while. 
Nel caso del while il ciclo deve interrompersi non appena l’elemento (se presente) viene trovato.

---

## Esercizio AlternaNumeri

Scrivere il programma **AlternaNumeri** che chiede all’utente di inserire 10 numeri e li ristampa, stampando prima i numeri inseriti negli inserimenti dispari (il primo, il terzo, il quinto, il settimo e il nono) e poi i numeri inseriti negli inserimenti pari (il secondo, il quarto, il sesto, l’ottavo e il decimo).

---

## Esercizio TantiPariQuantiDispari

Scrivere il programma **TantiPariQuantiDispari** che chiede all’utente di inserire 10 numeri e stampa il messaggio Tanti pari quanti dispari" se i numeri pari inseriti sono tanti quanti i numeri dispari. 

In caso contrario il programma stampa I numeri pari sono in numero supriore oppure In numeri dispari sono in numero superiore se l’utente ha inserito più 
---numeri pari o più numeri dispari, rispettivamente.

## Esercizio CercaSomma

Scrivere il programma **CercaSomma** che chiede all’utente di inserire 5 numeri e stampa il messaggio Ci sono due numeri con somma pari a 100 se ci sono, tra i numeri inseriti dall’utente, due numeri la cui somma è pari a 100. 

In caso contrario il programma stampa il messaggio Non ci sono due numeri con somma pari a 100.

---

## Esercizio DueListe

Scrivere il programma **DueListe** che chiede all’utente di inserire 5 numeri seguiti da altri 5 numeri e stampa le 5 somme ottenute da un numero del primo gruppo e un numero del secondo gruppo in posizioni corrispondenti:

---

## Esercizio DueListe2

Scrivere il programma **DueListe2** che chiede all’utente di inserire 5 numeri seguiti da altri 5 numeri e stampa quanti numeri sono presenti in entrambi i gruppi e la loro somma.

---

## Esercizio RubricaTelefonica

Scrivere un programma **RubricaTelefonica** che chiede all’utente di inserire 5 nomi e numeri di telefono e li ristampa in ordine alfabetico sul nome. 

Note: usare due array distinti per memorizzare i nomi e i numeri di telefono; attenzione al problema (commentato a lezione) dei caratteri che mandano a capo il testo nell’uso di Scanner.

---

## Verifica Sequenza crescente

* Scrivere un metodo `boolean crescente(int[ ] a)` che verifica se a è ordinato in modo crescente
* un array è ordinato in modo crescente se per ogni indice k, l’elemento di indice k è maggiore di tutti gli elementi di indice minore di k
* è sufficiente verificare se ogni elemento è minore dell’elemento che lo segue immediatamente
* intuitivamente, bisogna confrontare ciascun elemento di indice i dell’array con l’elemento che lo segue immediatamente, quello di indice i+1
* attenzione – l’ultimo elemento di un array non ha un elemento che lo segue immediatamente

---

## Verifica esistenza coppia elementi uguali

* Scrivere un metodo `boolean coppiaUguali(int[ ] a)` che verifica se a contiene almeno una coppia di elementi uguali
* bisogna confrontare ciascun elemento X dell’array con ogni altro elemento Y dell’array
* dove X e Y sono elementi diversi, nel senso che hanno indici diversi
* bisogna confrontare ciascun elemento di indice i dell’array con ogni altro elemento di indice j dell’array - dove i e j hanno valore diverso
* quindi è necessario utilizzare due variabili indice per accedere agli elementi di uno stesso array

---

## Inverso di una sequenza

* Scrivere un metodo `int[ ] inverso(int[ ] a)` che crea e restituisce un array che contiene gli stessi elementi di a, ma disposti in ordine inverso
* Osservazioni:
* Il metodo non deve modificare a, ma creare un nuovo array: v
* Input: a
* Output: v
* Algoritmo: il primo elemento di a va memorizzato come ultimo in v, il secondo come penultimo, ... l’ultimo come primo

Inoltre

* Modificare il programma precedente in modo che l’array inverso risultato, invece di essere un nuovo array creato, sia lo stesso array iniziale ma con i suoi elementi modificati.

---

## Elemento più frequente

* Scrivere un metodo che, dato un array a, calcola e restituisce l’elemento più frequente di a
* calcolare prima l’array occorrenze delle frequenze degli elementi di a
* l’elemento da restituire è quello che in a occupa la posizione del massimo di occorrenze

---

## Esercizio Temperature

Scrivere un programma `Temperature` che crea e inizializza un array di double contenente
12 valori a piacere che rappresentano temperature atmosferiche (usando il comando di inizializzazione
che prevede la lista dei valori tra parentesi graffe). Il programma calcola la media di tali temperature e,
per ogni valore di temperatura nell’array, stampa un messaggio che dice se essa è maggiore (o uguale)
oppure inferiore alla media.

---

## Esercizio ParoleMisteriose

Scrivere un programma `ParoleMisteriose` che crea e inizializza un array di stringhe
contenente 5 parole a piacere (usando il comando di inizializzazione che prevede la lista dei valori tra
parentesi graffe) e chiede all’utente di indovinare una tra le 5 parole entro 3 tentativi.

---

## Esercizio DueSequenze

Scrivere un programma **DueSequenze** che chiede all’utente di inserire due sequenze di stringhe, ciascuna di 5 elementi, e poi stampa il messaggio "OK" se almeno una stringa della prima sequenza compare anche nella seconda, altrimenti stampa il messaggio "NO".

Nel caso in cui le due sequenza abbiano almeno una stringa in comune, i confronti tra le sequenze si devono interrompere non appena una coppia di stringhe  uguali viene trovata.

---

## Array - Esercizi con soluzione

---

## Ordina un array numerico e un array di stringhe

Scrivere un programma Java per ordinare un array numerico e un array di stringhe.

```java
import java.util.Arrays; 
public class EsercizioArray01 {
public static void main(String[] args){   
    
    int[] my_array1 = {
            1789, 2035, 1899, 1456, 2013, 
            1458, 2458, 1254, 1472, 2365, 
            1456, 2165, 1457, 2456};
            
    String[] my_array2 = {
            "Java",
            "Python",
            "PHP",
            "C#",
            "C Programming",
            "C++"
        };        
    System.out.println("Original numeric array : "+Arrays.toString(my_array1));
    Arrays.sort(my_array1);
    System.out.println("Sorted numeric array : "+Arrays.toString(my_array1));
    
    System.out.println("Original string array : "+Arrays.toString(my_array2));
    Arrays.sort(my_array2);
    System.out.println("Sorted string array : "+Arrays.toString(my_array2));
    }
}

```

---

## Somma i valori di un array

Scrivere un programma Java per sommare i valori di un array.

```java
public class EsercizioArray02 {
public static void main(String[] args) {      
int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
int sum = 0;

for (int i : my_array)
    sum += i;
System.out.println("The sum is " + sum);
}
}
```

---

## Scrivere un programma Java per stampare la griglia seguente

```text
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -  
```

```java
public class EsercizioArray03 {
public static void main(String[] args) {   
 int [][]a = new int[10][10];    
 for(int i = 0; i < 10; i++)
   {
      for(int j = 0; j < 10; j++)
      {
         System.out.printf("%2d ", a[i][j]);
      }
      System.out.println();
   }
}
}


```

---

## Calcola il valore medio di un elemento dell'array

Scrivete un programma Java per calcolare il valore medio di un elemento dell'array.

```java
public class EsercizioArray04 {
public static void main(String[] args) {   
 
       int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
       //calculate sum of all array elements
       int sum = 0;
       for(int i=0; i < numbers.length ; i++)
        sum = sum + numbers[i];
       //calculate average value
        double average = sum / numbers.length;
        System.out.println("Average value of the array elements is : " + average); 
   }
}


```

---

## Verifica se un array contiene un valore specifico

Scrivere un programma Java per verificare se un array contiene un valore specifico.

```java
public class EsercizioArray05 {
  public static boolean contains(int[] arr, int item) {
      for (int n : arr) {
         if (item == n) {
            return true;
         }
      }
      return false;
   }
   public static void main(String[] args) {
          int[] my_array1 = {
            1789, 2035, 1899, 1456, 2013, 
            1458, 2458, 1254, 1472, 2365, 
            1456, 2265, 1457, 2456};
      System.out.println(contains(my_array1, 2013));
      System.out.println(contains(my_array1, 2015));
   }
}


```

---

## Trova l'indice di un elemento dell'array

Scrivete un programma Java per trovare l'indice di un elemento dell'array.

```java
public class EsercizioArray06 {
       public static int  findIndex (int[] my_array, int t) {
        if (my_array == null) return -1;
        int len = my_array.length;
        int i = 0;
        while (i < len) {
            if (my_array[i] == t) return i;
            else i=i+1;
        }
        return -1;
    }
    public static void main(String[] args) {
      int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
      System.out.println("Index position of 25 is: " + findIndex(my_array, 25));
      System.out.println("Index position of 77 is: " + findIndex(my_array, 77));
       }
}


```

---

## Rimuove un elemento specifico da un array

Scrivere un programma Java per rimuovere un elemento specifico da un array.

```java
import java.util.Arrays; 
public class EsercizioArray07 {
 
public static void main(String[] args) {
   int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
   
   System.out.println("Original Array : "+Arrays.toString(my_array));     
   
  // Remove the second element (index->1, value->14) of the array
   int removeIndex = 1;

   for(int i = removeIndex; i < my_array.length -1; i++){
        my_array[i] = my_array[i + 1];
      }
// We cannot alter the size of an array , after the removal, the last and second last element in the array will exist twice
    System.out.println("After removing the second element: "+Arrays.toString(my_array));
 }
 }


```

---

## Copia un array eseguendo un'iterazione dell'array

Scrivere un programma Java per copiare un array eseguendo un'iterazione dell'array.

```java
import java.util.Arrays; 
public class EsercizioArray08 {
 public static void main(String[] args) {
   int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
   int[] new_array = new int[10];     
 
   System.out.println("Source Array : "+Arrays.toString(my_array));     
   
   for(int i=0; i < my_array.length; i++) {
    new_array[i] = my_array[i];
}
   System.out.println("New Array: "+Arrays.toString(new_array));
 }
 }


```

---

## Inserisci un elemento in un array

Scrivere un programma Java per inserire un elemento (posizione specifica) in un array.

```java
import java.util.Arrays; 
public class EsercizioArray09 {
 
public static void main(String[] args) {

   int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

    // Insert an element in 3rd position of the array (index->2, value->5)
   
   int Index_position = 2;
   int newValue    = 5;

  System.out.println("Original Array : "+Arrays.toString(my_array));     
   
  for(int i=my_array.length-1; i > Index_position; i--){
    my_array[i] = my_array[i-1];
   }
   my_array[Index_position] = newValue;
   System.out.println("New Array: "+Arrays.toString(my_array));
 }
 }


```

---

## Trova il valore massimo e minimo di un array

Scrivete un programma Java per trovare il valore massimo e minimo di un array.

```java
import java.util.Arrays; 
public class EsercizioArray10 {
 
  static int max;
  static int min;

    public static void max_min(int my_array[]) {
        max = my_array[0];
        min = my_array[0];
        int len = my_array.length;
        for (int i = 1; i < len - 1; i = i + 2) {
            if (i + 1 > len) {
                if (my_array[i] > max) max = my_array[i];
                if (my_array[i] < min) min = my_array[i];
            }
            if (my_array[i] > my_array[i + 1]) {
                if (my_array[i] > max) max = my_array[i];
                if (my_array[i + 1] < min) min = my_array[i + 1];
            }
            if (my_array[i] < my_array[i + 1]) {
                if (my_array[i] < min) min = my_array[i];
                if (my_array[i + 1] > max) max = my_array[i + 1];
            }
        }
    }

    public static void main(String[] args) {
           int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        max_min(my_array);
        System.out.println(" Original Array: "+Arrays.toString(my_array));
        System.out.println(" Maximum value for the above array = " + max);
        System.out.println(" Minimum value for the above array = " + min);
    }
}


```

---

## Inverte una matrice di valori interi

Scrivere un programma Java per invertire una matrice di valori interi.

```java
import java.util.Arrays; 
public class EsercizioArray11 {
public static void main(String[] args){   
    int[] my_array1 = {
            1789, 2035, 1899, 1456, 2013, 
            1458, 2458, 1254, 1472, 2365, 
            1456, 2165, 1457, 2456};
  System.out.println("Original array : "+Arrays.toString(my_array1));  
   for(int i = 0; i < my_array1.length / 2; i++)
  {
    int temp = my_array1[i];
    my_array1[i] = my_array1[my_array1.length - i - 1];
    my_array1[my_array1.length - i - 1] = temp;
  }
    System.out.println("Reverse array : "+Arrays.toString(my_array1));
 }
}


```

---

## Trova i valori duplicati di una matrice di valori interi

Scrivete un programma Java per trovare i valori duplicati di un array di interi

```java
import java.util.Arrays; 
public class EsercizioArray12 {
  public static void main(String[] args) 
    {
        int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};
 
        for (int i = 0; i < my_array.length-1; i++)
        {
            for (int j = i+1; j < my_array.length; j++)
            {
                if ((my_array[i] == my_array[j]) && (i != j))
                {
                    System.out.println("Duplicate Element : "+my_array[j]);
                }
            }
        }
    }    
}


```

---

## Trova i valori duplicati di una matrice di valori stringa

Scrivete un programma Java per trovare i valori duplicati di un array di stringhe

```java
public class EsercizioArray13 {
public static void main(String[] args) 
    {
        String[] my_array = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};
 
        for (int i = 0; i < my_array.length-1; i++)
        {
            for (int j = i+1; j < my_array.length; j++)
            {
                if( (my_array[i].equals(my_array[j])) && (i != j) )
                {
                    System.out.println("Duplicate Element is : "+my_array[j]);
                }
            }
        }
    }    
}


```

---

## Trova gli elementi comuni tra due array

Scrivete un programma Java per trovare gli elementi comuni tra due array di stringhe

```java
import java.util.*;
public class EsercizioArray14 {
public static void main(String[] args) 
    {
       String[] array1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
 
       String[] array2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};
       
       System.out.println("Array1 : "+Arrays.toString(array1));
       System.out.println("Array2 : "+Arrays.toString(array2));
 
       HashSet set = new HashSet();
 
        for (int i = 0; i < array1.length; i++)
        {
            for (int j = 0; j < array2.length; j++)
            {
                if(array1[i].equals(array2[j]))
                {
                    set.add(array1[i]);
                }
            }
        }
 
        System.out.println("Common element : "+(set));     //OUTPUT : [THREE, FOUR, FIVE]
    }
}


```

---

## Trova gli elementi comuni tra due array di numeri interi

Scrivete un programma Java per trovare gli elementi comuni tra due array di interi

```java
import java.util.Arrays; 
public class EsercizioArray15 {
public static void main(String[] args) 
    {
      int[] array1 = {1, 2, 5, 5, 8, 9, 7, 10};
      int[] array2 = {1, 0, 6, 15, 6, 4, 7, 0};
 
       System.out.println("Array1 : "+Arrays.toString(array1));
       System.out.println("Array2 : "+Arrays.toString(array2));
 
      
        for (int i = 0; i < array1.length; i++)
        {
            for (int j = 0; j < array2.length; j++)
            {
                if(array1[i] == (array2[j]))
                {
                 
                 System.out.println("Common element is : "+(array1[i]));
                 }
            }
        }
 
    }
}


```

---

## Rimuove gli elementi duplicati da un array

Scrivere un programma Java per rimuovere gli elementi duplicati da un array.

```java
import java.util.Arrays;
 
public class EsercizioArray16 {
   static void unique_array(int[] my_array)
    {
        System.out.println("Original Array : ");
         
        for (int i = 0; i < my_array.length; i++)
        {
            System.out.print(my_array[i]+"\t");
        }
         
        //Assuming all elements in input array are unique
         
        int no_unique_elements = my_array.length;
         
        //Comparing each element with all other elements
         
        for (int i = 0; i < no_unique_elements; i++) 
        {
            for (int j = i+1; j < no_unique_elements; j++)
            {
                //If any two elements are found equal
                 
                if(my_array[i] == my_array[j])
                {
                    //Replace duplicate element with last unique element
                     
                    my_array[j] = my_array[no_unique_elements-1];
                     
                    no_unique_elements--;
                     
                    j--;
                }
            }
        }
         
        //Copying only unique elements of my_array into array1
         
        int[] array1 = Arrays.copyOf(my_array, no_unique_elements);
         
        //Printing arrayWithoutDuplicates
         
        System.out.println();
         
        System.out.println("Array with unique values : ");
         
        for (int i = 0; i < array1.length; i++)
        {
            System.out.print(array1[i]+"\t");
        }
         
        System.out.println();
         
        System.out.println("---------------------------");
    }
     
    public static void main(String[] args) 
    {        
        unique_array(new int[] {0, 3, -2, 4, 3, 2});
         
        unique_array(new int[] {10, 22, 10, 20, 11, 22});
         
      }    
}


```

---

## Trova il secondo elemento più grande in un array

Scrivi un programma Java per trovare il secondo elemento più grande in un array.

```java
import java.util.Arrays;
public class EsercizioArray17 {
  public static void main(String[] args) {

                int[] my_array = {
            1789, 2035, 1899, 1456, 2013, 
            1458, 2458, 1254, 1472, 2365, 
            1456, 2165, 1457, 2456};

                int max = my_array[0];
                int second_max = my_array[0];
                
            System.out.println("Original numeric array : "+Arrays.toString(my_array));
        
                for (int i = 0; i < my_array.length; i++) {

                        if (my_array[i] > max) {
                                second_max = max;
                                max = my_array[i];

                        } else if (my_array[i] > second_max) {
                                second_max = my_array[i];

                        }
                }

                System.out.println("Second largest number is : " + second_max);

        }
}


```

---

## Trova il secondo elemento più piccolo in un array

Scrivete un programma Java per trovare il secondo elemento più piccolo di un array.

```java
import java.util.Arrays;
public class EsercizioArray18 {
  public static void main(String[] args) {

    int[] my_array = {-1, 4, 0, 2, 7, -3};
    System.out.println("Original numeric array : "+Arrays.toString(my_array));
    int min = Integer.MAX_VALUE;
    int second_min = Integer.MAX_VALUE;
    for (int i = 0; i < my_array.length; i++) {
        if(my_array[i]==min){
          second_min=min;
        } else if (my_array[i] < min) {
            second_min = min;
            min = my_array[i];
        } else if (my_array[i] < second_min) {
            second_min = my_array[i];
        }

    }
    System.out.println("Second lowest number is : " + second_min);
    }
} 


```

---

## Aggiungi due matrici della stessa dimensione

Scrivi un programma Java per aggiungere due matrici della stessa dimensione.

```java
import java.util.Scanner;
public class EsercizioArray19 {
 public static void main(String args[])
   {
      int m, n, c, d;
      Scanner in = new Scanner(System.in);
 
      System.out.println("Input number of rows of matrix");
      m = in.nextInt();
      System.out.println("Input number of columns of matrix");
      n  = in.nextInt();
 
      int array1[][] = new int[m][n];
      int array2[][] = new int[m][n];
      int sum[][] = new int[m][n];
 
      System.out.println("Input elements of first matrix");
 
      for (  c = 0 ; c < m ; c++ )
         for ( d = 0 ; d < n ; d++ )
            array1[c][d] = in.nextInt();
 
      System.out.println("Input the elements of second matrix");
 
      for ( c = 0 ; c < m ; c++ )
         for ( d = 0 ; d < n ; d++ )
            array2[c][d] = in.nextInt();
 
      for ( c = 0 ; c < m ; c++ )
         for ( d = 0 ; d < n ; d++ )
             sum[c][d] = array1[c][d] + array2[c][d]; 
 
      System.out.println("Sum of the matrices:-");
 
      for ( c = 0 ; c < m ; c++ )
      {
         for ( d = 0 ; d < n ; d++ )
            System.out.print(sum[c][d]+"\t");
 
         System.out.println();
      }
   }
}


```

---

## Converti un array in ArrayList

Scrivere un programma Java per convertire un array in ArrayList.

```java
import java.util.ArrayList;
  import java.util.Arrays;
public class EsercizioArray20 {
  public static void  main(String[] args) 
  {
  String[]  my_array = new String[] {"Python", "JAVA", "PHP",  "Perl", "C#", "C++"};
  ArrayList<String>  list = new ArrayList<String>(Arrays.asList(my_array));
  
  System.out.println(list);
  }
}


```

---

## Converti un ArrayList in un array

Scrivere un programma Java per convertire un ArrayList in un array.

```java
import java.util.ArrayList;
  import java.util.Arrays;
public class EsercizioArray21 {
  public static void  main(String[] args)
  { 
  ArrayList<String> list = new ArrayList<String>();

  list.add("Python");
 
  list.add("Java");
 
  list.add("PHP");
  
  list.add("C#");
 
  list.add("C++");
  
  list.add("Perl");
 
  String[]  my_array = new String[list.size()];
  
  list.toArray(my_array);
  
  for (String  string : my_array)
  {
  System.out.println(string);
  }
  } 
  }


```

---

## Coppie di elementi in un array la cui somma è uguale a un numero specificato

Scrivi un programma Java per trovare tutte le coppie di elementi in un array la cui somma è

```java
public class EsercizioArray22 {
static void  pairs_value(int inputArray[], int inputNumber)
  {
  System.out.println("Pairs of elements and their sum : ");
 
  for (int i =  0; i < inputArray.length; i++)
  {
  for (int j  = i+1; j < inputArray.length; j++)
  {
  if(inputArray[i]+inputArray[j] == inputNumber)
  {
  System.out.println(inputArray[i]+" + "+inputArray[j]+" =  "+inputNumber);
  }
  }
  }
  }
  
  public static void  main(String[] args)
  {
  pairs_value(new int[] {2, 7, 4, -5, 11, 5, 20}, 15);
  
  pairs_value(new int[] {14, -15, 9, 16, 25, 45, 12, 8}, 30);
  
  }
}


```

---

## Verifica l'uguaglianza di due array

Scrivere un programma Java per verificare l'uguaglianza di due array.

```java
public class EsercizioArray23 {
static void  equality_checking_two_arrays(int[] my_array1, int[] my_array2)
  {
  boolean  equalOrNot = true;
  
  if(my_array1.length == my_array2.length)
  {
  for (int i  = 0; i < my_array1.length; i++)
  {
  if(my_array1[i] != my_array2[i])
  {
  equalOrNot = false;
  }
  }
  }
  else
  {
  equalOrNot  = false;
  }
  
  if  (equalOrNot)
  {
  System.out.println("Two arrays are equal.");
  }
  else
  {
  System.out.println("Two  arrays are not equal.");
  }
  }
  
  public static void  main(String[] args)
  {
  int[] array1 =  {2, 5, 7, 9, 11};
  int[] array2 =  {2, 5, 7, 8, 11};
  int[] array3 =  {2, 5, 7, 9, 11};
  
  equality_checking_two_arrays(array1,  array2);
  equality_checking_two_arrays(array1, array3);
  }
  }
  ```
  
