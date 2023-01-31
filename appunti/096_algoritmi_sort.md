# Algoritmi di ordinamento in Java

## Bubble-sort

![bubble sort](https://raw.githubusercontent.com/maboglia/CorsoJava/master/appunti/img/bubble-sort2.png)

---

![bubble sort](https://raw.githubusercontent.com/maboglia/CorsoJava/master/appunti/img/Algo_mb_bubble-sort.png)

---

```java
    public void bubbleSort(int[] array) {

        for(int i = 0; i < array.length; i++) {
            boolean flag = false;
            for(int j = 0; j < array.length-1; j++) {

                //Se l' elemento j è maggiore del successivo allora
                //scambiamo i valori
                if(array[j]>array[j+1]) {
                    int k = array[j];
                    array[j] = array[j+1];
                    array[j+1] = k;
                    flag=true; //Lo setto a true per indicare che é avvenuto uno scambio
                }
                

            }

            if(!flag) break; //Se flag=false allora vuol dire che nell'ultima iterazione
                             //non ci sono stati scambi, quindi il metodo può terminare
                             //poiché l' array risulta ordinato
        }
    }

```

---

## Selection-sort

![selection sort](https://raw.githubusercontent.com/maboglia/CorsoJava/master/appunti/img/algo_selection_sort.jpg)

---

```java
    public void selectionSort(int[] array) {

        for(int i = 0; i < array.length-1; i++) {
            int minimo = i; //Partiamo dall' i-esimo elemento
            for(int j = i+1; j < array.length; j++) {

            
            //ogni volta che nell' iterazione troviamo un elemento piú piccolo di minimo facciamo puntare minimo all' elemento trovato
                    if(array[minimo]>array[j]) {
                        minimo = j;
                    }
            }

            //Se minimo e diverso dall' elemento di partenza
            //allora avviene lo scambio
            if(minimo!=i) { 
                int k = array[minimo];
                array[minimo]= array[i];
                array[i] = k;
            }
        }
    }

```

---

## Esercizio ordina 3 numeri interi

Esercizio: dati 3 numeri visualizzarli in ordine crescente.

### uso `if` e `and`

```java

      int num1 = 15;
      int num2 = -5;
      int num3 = 7;
      if (num1 >= num2 && num1 >= num3)
         System.out.println( num1 + " è il numero maggiore.");
      else if (num2 >= num1 && num2 >= num3)
         System.out.println( num2 + " è il numero maggiore.");
      else
         System.out.println( num3 + " è il numero maggiore.");

```

Logica per ordinarli:

```java
if (a > c)
   swap(a, c);

if (a > b)
   swap(a, b);

//Controlla il 2° e il 3°

if (b > c)
   swap(b, c);
```

Dove swap(...) è un metodo che scambia i valori

---

## Esercizio ordina 3 numeri interi (2)

### uso `if` e `or`

```java
double max = z;
if (x > max || y > max) {
    if (x > y) {
        max = x;
    } else {
        max = y;
    }
}
double min = z;
if (x < min || y < min) {
    if (x < y) {
        min = x;
    } else {
        min = y;
    }
}

double mid = x + y + z - max - min;
System.out.printf("In ordine %f %f %f%n", min, mid, max);
```

---

## Esercizio ordina 3 numeri interi (3)

### uso `Math.max()`

```java
double max = Math.max(x, Math.max(y, z));
double min = Math.min(x, Math.min(y, z));
double mid = x + y + z - max - min;
System.out.printf("In ordine %f %f %f%n", min, mid, max);
```
