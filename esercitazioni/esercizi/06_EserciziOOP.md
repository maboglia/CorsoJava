
## Esercizio
A partire dall'interfaccia Animale, che definisce
i metodi **faiVerso()** e dimmiCiboPreferito,
implementare le classi Gatto, Cane e Topo
attraverso l'uso delle interfacce.

---

## Esercizio
A partire dalla classe Animale, che definisce i
metodi **faiVerso()**, implementare le classi Gatto,
Cane e Topo attraverso l'uso dell'astrazione.


---

### Esercizio

* costruire un programma che chieda in input l'altezza degli studenti di una classe (altezza espressa in cm )
* il programma accetta un numero indeterminato di valori in input e restituisce la media aritmetica incrementale ogni volta
* inserire una condizione per uscire dal ciclo e informare l'utente della stringa da inserire


### soluzione

```java
boolean esci = false;
int studentiTot=0;
int altezzaTot = 0;
double media = 0.0D;
while(esci == false){
    String s =getInput("Inserisci un numero");
    int valoreInserito = Integer.parseInt(s);
    //è la condizione che mi fa uscire
    if (valoreInserito == 0) esci = true;
    studentiTot++;
    altezzaTot += valoreInserito;
    media = altezzaTot/studentiTot;
    System.out.println("il numero degli studenti è " + studentiTot);
    System.out.println("l'altezza totale degli studenti è " + altezzaTot);
    System.out.println("quindi la media aritmetica dell'altezza dell'aula " + media);
}
```

---

## Esercizio

La direttrice di un centro di formazione ha bisogno di un programma per formare le classi per il nuovo anno scolastico:

* Stampare o visualizzare il numero di classi che si possono ottenere con un gruppo di studenti di cui si conosce l'anno di nascita.
Le classi devono essere omogenee per età e possono contenere max 16 studenti.
