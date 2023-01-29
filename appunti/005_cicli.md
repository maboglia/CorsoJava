# Il controllo del flusso

Java mette a disposizione del programmatore diverse strutture sintattiche per consentire il **controllo del flusso**

* IF – ELSE
* WHILE e DO-WHILE
* FOR e FOREACH
* SWITCH - CASE

![control flow](https://raw.githubusercontent.com/maboglia/CorsoJava/master/appunti/img/Progr_strutt_composizione.gif)

---

## Selezione, scelta condizionale 

![if...else](https://raw.githubusercontent.com/maboglia/CorsoJava/master/appunti/img/Language/02_costrutti/if-else.png)

**if statements**

* E' un’istruzione condizionale, permette cioè di eseguire un blocco di istruzioni solo se si verifica una determinata condizione.

```java
if (condition) {
    
    //statements;

}

```

---

## else if [opzionale]

* Indichiamo anche cosa fare se non si supera la condizione

```java

else if (condition2) {
    
    //statements;

}

```

## else [opzionale]

```java


else {
    
//statements;

}

```

---

## Switch Statements

Serve per gestire in maniera più ordinata varie condizioni,
è un modo più elegante in alcune situazioni.

```java
switch (espressione) {

    case valore1:

    //statements;

    break;

    ...

    case valoren:

    //statements;

    break;

    default:

    //statements;

}
```

---


## Cicli definiti - for

Se il numero di iterazioni è **prevedibile**.

```java
for (partenza, fine, incremento) 
blocco di istruzioni da ripetere
```

```java

for (init; condition; adjustment) {

//statements;

}
```

### Esempio: prima di entrare nel ciclo so già che verrà ripetuto 10 volte

```java
int n=10;
for (int i=0; i<n; ++i) {
    ...
}

```

---


## Cicli indefiniti - while

si ripete il ciclo fintanto che una condizione è verificata (è vera)

* LA CONDIZIONE BOOLEANA `true/false`
* DETERMINA LA CONTINUAZIONE DEL PROGRAMMA
* ED ESEGUE L'ELENCO DELLE OPERAZIONI DEL BLOCCO
* Da usare se il numero di iterazioni **non è noto** all'inizio del ciclo.

```java
while (condition) {
    //statements;
}

//Esempio: quando il numero di iterazioni dipende da valori in input
while(true) {
    x = Integer.parseInt(JOptionPane.showInputDialog("Immetti numero positivo"));
    if (x > 0) break;
}

```

---

## do-while

* Quando voglio eseguire almeno una volta l'istruzione, anche se la condizione è impostata su `false`
* Si verifica la condizione dopo il primo ciclo


```java

do {

//statements;

} while (condition);

```

---

## Cicli con interruzione: break

Se il ciclo viene interrotto dopo aver filtrato un valore con una data proprietà.

* Se stiamo eseguendo un ciclo, possiamo utilizzare la parola `break` per interromperlo in qualsiasi momento.
* Si interrompe quindi il ciclo e si riprende l'esecuzione delle istruzioni al di fuori di esso.

### Esempio: verifica se un array contiene o meno numeri negativi

```java
boolean trovato = false;
for (int i=0; i<v.length; ++i) // passa in rassegna tutti gli indici dell'array v
    if (v[i]<0) { // filtra le celle che contengono valori negativi
        trovato = true;
        break; // interrompe ciclo
    }
// qui trovato vale true se e solo se vi sono numeri negativi in v

```

---

## Cicli con salto: continue

Invece terminare completamente il ciclo ed uscire fuori, `continue` interrompe solo l'iterazione corrente e passa alla successiva.

```java
   {
      int a;

      for ( a = 1; a <= 10 ; a++ )            // Run a = 1, 2, ..., 10
      {
         if ( a == 4 )
         {
            continue;              // Skip printing 4...
         }

         System.out.println(a);    // Print a 
      }
   }
```

---

## Cicli con condizione

Vengono passati in rassegna un insieme di valori e per ognuno di essi viene fatto un test per verificare se il valore ha o meno una certa proprietà in base alla quale decideremo se prenderlo in considerazione o meno.

Esempio: stampa tutti i numeri pari fino a 100

```java
for (int i=1; i<100; ++i) { // passa in rassegna tutti i numeri fra 1 e 100
    if (i % 2 == 0) // filtra quelli pari
        System.out.println(i);
}

```

---

## Cicli con accumulatore

Vengono passati in rassegna un insieme di valori e ne viene tenuta una traccia cumulativa usando una opportuna variabile.

### Esempio: somma i primi 100 numeri interi.

```java
int somma = 0; // variabile accumulatore di tipo int
for (int i=1; i<100; ++i) { // passa in rassegna tutti i numeri fra 1 e 100
    somma = somma + i; // accumula i valori nella variabile accumulatore
}

```

### Esempio: data una stringa s, ottieni la stringa rovesciata

```java
String rovesciata = ""; // variabile accumulatore di tipo String
for (int i=0; i<s.length(); ++i) { // passa in rassegna tutti gli indici dei caratteri di s
    rovesciata = s.substring(i, i+1) + rovesciata; // accumula i caratteri in testa all'accumulatore
}

```

---

## Cicli misti

Esempio di ciclo definito con filtro e accumulatore: calcola la somma dei soli valori positivi di un array

```java
int somma = 0;
for (int i=0; i<v.length; ++i) // passa in rassegna tutti gli indici dell'array v
    if (v[i]>0) // filtra le celle che contengono valori positivi
        somma = somma + v[i]; // accumula valore nella variabile accumulatore
```

---

## Cicli annidati

Se un ciclo appare nel corpo di un altro ciclo.

Esempio: stampa quadrato di asterischi di lato n

```java
for (int i=0; i<n; i++) {
    for (int j=0; j<n; j++) System.out.print("*");
    System.out.println();
}

```

---

## codice esempi d'uso

* [raccolta esempi](https://github.com/maboglia/CorsoJava/blob/master/esempi/03_Condizioni_Cicli.md)
* [altri esempi](https://github.com/maboglia/CorsoJava/tree/master/esempi/02_control-flow)
* [01_if-elseif-else](https://github.com/maboglia/CorsoJava/tree/master/esempi/02_control-flow/01_if-elseif-else)
* [02_switch](https://github.com/maboglia/CorsoJava/tree/master/esempi/02_control-flow/02_switch)
* [03_while](https://github.com/maboglia/CorsoJava/tree/master/esempi/02_control-flow/03_while)
* [04_for](https://github.com/maboglia/CorsoJava/tree/master/esempi/02_control-flow/04_for)
* [05_foreach](https://github.com/maboglia/CorsoJava/tree/master/esempi/02_control-flow/05_foreach)
* [06_labels](https://github.com/maboglia/CorsoJava/tree/master/esempi/02_control-flow/06_labels)
* [giochi](https://github.com/maboglia/CorsoJava/tree/master/esempi/02_control-flow/giochi)
* [programmi ](https://github.com/maboglia/CorsoJava/tree/master/esempi/02_control-flow/programmi )
