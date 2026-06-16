# ricorsione

La ricorsione è una tecnica potente di risoluzione di problemi di calcolo. 

Consiste nel ridurre la risoluzione di un problema di calcolo su dati di ingresso di una certa grandezza alla risoluzione dello stesso problema su dati di grandezza più piccola.

---

## Definire un algoritmo ricorsivo richiede di:

Definire una opportuna nozione di "grandezza" dei dati di ingresso.

Identificare una grandezza dei dati di ingresso sufficientemente piccola da rendere semplice la soluzione del problema (passo base).

Per dati più grandi, ridurre il problema a un problema più piccolo, la cui soluzione permetta di risolvere facilmente il problema iniziale (passo ricorsivo).

---

## Esempio

Definire un algoritmo ricorsivo per il seguente problema:

**Dato un intero n non negativo, calcolare la somma dei primi n numeri.**

Definire una opportuna nozione di "grandezza" dei dati di ingresso: la grandezza del problema è n.

Identificare una grandezza dei dati di ingresso sufficientemente piccola da rendere semplice la soluzione del problema (passo base): per n=0, il risultato è banalmente 0.

Per dati più grandi, ridurre il problema a un problema più piccolo, la cui soluzione permetta di risolvere facilmente il problema iniziale (passo ricorsivo): se n>0, calcoliamo innanzitutto la somma x dei primi n-1 numeri. 

La soluzione al problema originario sarà facilmente x+n. Diremo che il problema più piccolo (somma dei primi n-1 numeri) viene risolto "ricorsivamente".

---

Questo algoritmo può essere facilmente tradotto in Java come segue:

```java
public static int sommaNumeri(int n) {
    if (n==0) return 0;       // passo base
    int x = sommaNumeri(n-1); // passo ricorsivo: calcolo "ricorsivamente" un problema di dimensione n-1 (il metodo chiama se stesso su n-1)
    return x+n;               // passo ricorsivo: calcolo la soluzione del problema iniziale usando il risultato del problema più piccolo
}
```
