# Package in Java

## Un package è un insieme logico di classi

* Fisicamente le classi stanno su uno o più file, tutti contenuti in una stessa directory
* Ogni package definisce un suo scope (ambiente di visibilità dei nomi)
* Stessi nomi in package diversi senza conflitti

## Nomi

### Un package è identificato univocamente
da un nome costruito gerarchicamente (notazione puntata)
* java.util
* it.bogliaccino.utilita

### Convenzione per generare nomi unici
* Usare come prefisso del nome del package il proprio nome internet invertito

## Creazione di un package

Tutti i file del package devono contenere la riga 

`package <nomePackage>;`

quale prima riga del file (tranne i commenti)

Specifica che la classe pubblica contenuta in quel file fa parte di quel package

## Utilizzo di un package

### Un package può essere utilizzato
* Mediante importazione del package
* Mediante riferimento esplicito

### Importare un package significa
* Importare la singola classe del package
`import nomePackage.nomeClass;`
* Importare tutte le classi del package
`import nomePackage;`
* Esempi 
  * import java.util.ArrayList;
  * import java.util.*;
  * import java.util;

### Riferimento esplicito (senza import)
* Specificare il nome per intero `java.util.ArrayList `  
* Invece di import `java.util.*;`

### Collisioni
* Se due package definiscono classi omonime possono essere importati entrambi
* La collisione si verifica solo quando si utilizzano gli elementi in conflitto

## Storage (directory)

La directory in cui il package risiede deve avere un path che corrisponde a quello del nome `java.util` <-> `java/util`

### Il path è relativo a uno dei percorsi di ricerca automatica definiti nella variabile di ambiente CLASSPATH

### Un sottoalbero di package può essere sostituito da un

* File zippato ( .zip)
* File archiviato ( .jar)
Esempio
CLASSPATH=c:\java\jdk\lib;c:\java\mylibs

## Visibilità

### Le regole di encapsulation / visibilità si applicano anche ai package


### Modificatori di visibilità

### Su attributi o metodi di classi entro
package
* private: visibile solo da istanze della stessa classe
* public: visibile da istanze di qualsiasi classe all'interno del package
  * anche da istanze all'esterno del package SE la classe è public
* package VALORE DI DEFAULT: visibile da istanze di qualsiasi classe, all'interno del package


### Classi all'interno di un package
* public: elementi (attributi metodi) public della classe sono visibili anche fuori dal package 
* package (VALORE DI DEFAULT): elementi (attributi metodi) public della classe sono visibili solo all'interno del package
