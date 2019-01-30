# Tipi di memoria

### Si differenziano per la durata di esistenza degli elementi che vi sono memorizzati
* Memoria statica
  * Contiene gli elementi che esistono per tutta la durata del programma
* Heap o memoria dinamica
  * Contiene gli elementi creati durante il programma
  * qui agisce il Garbage Collector
* Stack
  * Contiene gli elementi creati durante una chiamata di procedura

## Memorizzazione oggetti

* Gli oggetti vengono allocati nella memoria heap

## Memorizzazione delle Variabili

### Variabili di istanza
* Memorizzate all'interno degli oggetti (nell'heap)

### Variabili automatiche ( locali )
* Memorizzate nello stack

### Variabili statiche
* Memorizzate in aree statiche


## Variabili di istanza

* Dichiarate all'interno di una classe
* Memorizzate in ogni istanza della classe
* Create/inizializzate alla creazione di ogni istanza della classe

## Variabili automatiche (locali)

### Dichiarate all'interno dei metodi
* Memorizzate nello stack
* Create/inizializzate automaticamente all'ingresso del blocco in cui sono dichiarate
* Distrutte automaticamente all'uscita

## Variabili statiche

### Dichiarate nelle classi o nei metodi con
* Memorizzate in copia unica
* associate alla classe => anche dette
* variabili di classe
* Memorizzate in aree statiche
* Create/inizializzate al caricamento della classe

## Static area

## Distruzione di Oggetti
* Non viene fatta in modo esplicito
* Il programmatore non deve preoccuparsi di distruggere gli oggetti

### Viene eseguita automaticamente
*  Garbage collector
  * Componente del Run Time che ha il compito di recuperare lo spazio nella memoria heap
  * Quando necessario (per esempio quando si esaurisce lo spazio disponibile in memoria principale) esegue un'analisi dei riferimenti e distrugge gli oggetti per i quali non esistono più riferimenti


      
## Gestione memoria nella JVM (1)
Per capire meglio come funzionano classi e oggetti diamo uno sguardo “sotto il cofano” della Java Virtual Machine (JVM)
La memoria usata dalla JVM è concettualmente divisa in tre parti
* Ambiente delle classi: area di memoria in cui vengono caricate (allocate) tutte le classi che costituiscono il programma
* Stack: area di memoria in cui vengono caricati (allocati) i record di attivazione dei metodi, e quindi tutte le variabili locali
* Heap: area di memoria in cui vengono caricati (allocati) tutti i vari oggetti creati nel programma, man mano che vengono creati.
   

## Nell’ambiente delle classi

* vengono memorizzati il codice dei metodi e le variabili statiche di tutte le classi del programma
* sono le parti condivise dai vari oggetti della classe
* le variabili statiche sono utilizzabili anche in assenza di oggetti

## Nello stack

* vengono memorizzate le variabili locali dei metodi in esecuzione
* per le variabili di tipi primitivi viene memorizzato il valore (esempio: somma)
* per le variabili di tipo classe viene memorizzato un riferimento
(indirizzo di memoria di un oggetto) 

## Nell’heap
* per ogni oggetto creato vengono memorizzate le variabili d’istanza (ossia, le variabili non statiche)
* ogni oggetto nell’heap contiene anche il nome della classe di appartenenza
   
## Riferimenti (1)
I riferimenti meritano un approfondimento.
Abbiamo visto che una variabile di un tipo primitivo contiene direttamente il valore del dato
La dichirazione della variabile x alloca la memoria necessaria per contenere un int
Un assegnamento alla variabile x scrive un valore nella memoria precedentemente allocata
L’assegnamento di x a y copia il contenuto della variabile (il valore)
La modifica di y non modifica x 
```java        
        y = 40;
        int x;
        x = 33;
        int y = x;
```           
## Riferimenti (2)

Una variabile di un tipo classe contiene invece un riferimento a un oggetto La dichirazione della variabile primo di tipo Rettangolo alloca la
memoria necessaria per contenere un riferimento (inizializzato a null)
La creazione dell’oggetto primo alloca un nuovo oggetto e assegna un riferimento alla variabile
```java        
           Rettangolo primo;
                   primo = new Rettangolo(10,30)
```        
## Riferimenti (3)
L’assegnamento di primo a secondo copia il contenuto della variabile (il riferimento)
La modifica di secondo modifica l’oggetto riferito anche da primo
```java        
           Rettangolo secondo = primo;
                   secondo.base = 15;
```        
## Riferimenti (4)
Lo stesso discorso vale anche quando si passa un oggetto a un metodo come parametro
Viene passato il riferimento
Ogni modifica fatta all’oggetto all’interno del metodo non viene persa alla quando il metodo termina (il chiamante vedrà l’oggetto modificato)
Lo stesso discorso vale per gli array (gli array sono in realtà oggetti!)
   
## Riferimenti (5)
Una conseguenza del fatto che le variabili di tipo classe contengono riferimenti, è che l’opearatore di confronto == non si comporta (con gli oggetti) come uno si potrebbe aspettare...
Infatti oggetto1 == oggetto2 vale true solo se oggetto1 e oggetto2 sono (riferimenti al) lo stesso oggetto.
Esempio:
Abbiamo che:
```java
        Rettangolo r1 = new Rettangolo(10,12); 
        Rettangolo r2 = r1;
        Rettangolo r3 = new Rettangolo(10,12);
        System.out.println(r1==r2); // stampa true 
        System.out.println(r1==r3); // stampa false
```             
## Riferimenti (6)
Una soluzione a questo problema pùo essere il metodo equals.
Tutti gli oggetti (capiremo perchè) dispongono di alcuni metodi di base
Uno di questi è equals, e permette di confrontare due oggetti Lo abbiamo visto nelle stringhe
  Nelle classi più comuni della Libreria Standard di Java, il metodo equals è implementato in modo da confrontare una per una tutte le variabili interne di una coppia di oggetti
Anche nelle proprie classi si pùo implementare tale metodo (vedremo...)
```java
        s1.equals(s2);
```         
## Garbage collection (1)
Un’altra conseguenza del fatto che le operazioni (lettura, assegnamento, copia, ...) su variabili di tipo classe lavorino su riferimenti è che si possono ottenere oggetti orfani (privi di riferimenti).
Ad esempio:
supponiamo di creare due oggetti di tipo Rettangolo
```java
          Rettangolo primo = new Rettangolo(10,30); 
          Rettangolo secondo = new Rettangolo(20,50);
```             
## Garbage collection (2)
ora assegniamo secondo a primo
come è possibile accedere al vecchio valore di primo (il rettangolo di dimensioni 10 e 30) ???
Il vecchio oggetto è rimasto orfano... (nessun riferimento ad esso)
```java
            Rettangolo primo = secondo;
```         
## Garbage collection (3)
Il vecchio oggetto non è più utilizzabile!!! (è garbage, spazzatura)
Il linguaggio Java (come molti linguaggi moderni) prevede un meccanismo di rimozione degli oggetti privi di riferimenti detto Garbage Collector
Il garbage collector viene eseguito periodicamente dalla Java Virtual Machine. Interrompe per un attimo l’esecuzione del programma e pulisce la memoria dagli oggetti privi di riferimenti
    