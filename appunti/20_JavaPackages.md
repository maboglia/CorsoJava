# Package inJava

### Un package è un insieme logico di classi

### Fisicamente le classi stanno su uno o più
file, tutti contenuti in una stessa
directory

### Ogni package definisce un suo scope
(ambiente di visibilità dei nomi)
* Stessi nomi in package diversi senza
conflitti
2Nomi

### Un package è identificato univocamente
da un nome costruito gerarchicamente
(notazione puntata)
java.util
grafica.altaRisoluzione.mioPackage

### Convenzione per generare nomi unici
* Usare come prefisso del nome del package
il proprio nome internet invertito
it.polito.softeng.mioPackage
Creazione di un package

### Tutti i file del package devono
contenere la riga
package <nomePackage>;
quale prima riga del file (tranne i
commenti)

### Specifica che la classe pubblica
contenuta in quel file fa parte di quel
package
3Utilizzo di un package

### Un package può essere utilizzato
* Mediante importazione del package
* Mediante riferimento esplicito

### Importare un package significa
* Importare la singola classe del package
import
nomePackage.nomeClass;
* Importare tutte le classi del package
import
nomePackage;
* Esempi
import java.util.ArrayList;
import java.util.*;
import java.util;

### Riferimento esplicito (senza import)
* Specificare il nome per intero
... java.util.ArrayList ...
  * Invece di
import java.util.*;
... ArrayList ...

### Collisioni
* Se due package definiscono classi omonime
possono essere importati entrambi
* La collisione si verifica solo quando si
utilizzano gli elementi in conflitto
4Storage (directory)

### La directory in cui il package risiede
deve avere un path che corrisponde a
quello del nome
java.util
<->
java/util

### Il path è relativo a uno dei percorsi di
ricerca automatica definiti nella
variabile di ambiente CLASSPATH

### Un sottoalbero di package può essere
sostituito da un
* File zippato ( .zip)
* File archiviato ( .jar)
Esempio
CLASSPATH=c:\java\jdk\lib;c:\java\mylibs

### Per installare il package
didattica.esercizi
/
si hanno 2 possibilità
java
jdk mylibs
lib didattica
didattica esercizi
esercizi
5Visibilità

### Le regole di encapsulation / visibilità si
applicano anche ai package

### Euristica: minimizzare il numero di
classi/attributi/metodi visibili al di fuori
di un package
Modificatori di visibilità

### Su attributi o metodi di classi entro
package
* private: visibile solo da istanze della stessa
classe
* public: visibile da istanze di qualsiasi classe
all'interno del package
  * anche da istanze all'esterno del package SE la
classe è public
* package VALORE DI DEFAULT: visibile da
istanze di qualsiasi classe, all'interno del
package
6Accesso
Metodo della
stessa classe
entro package Metodo di
altra classe
entro package Metodo di altra
classe fuori
package
Private
attributo/metodo Si No No
Package
attributo/metodo Si Si No
Public
attributo/metodo
su package class Si Si No
Public
attributo/metodo
su public class Si Si Si
Modificatori di visibilità

### Classi all'interno di un package
* public: elementi (attributi metodi) public
della classe sono visibili anche fuori dal
package
* package (VALORE DI DEFAULT): elementi
(attributi metodi) public della classe sono
visibili solo all'interno del package
7Librerie (package) Standard

### Il package java.lang contiene alcune
classi basilari

### Viene importato automaticamente (non
occorre import)
java
applet
awt
data
event
transfer
beans
image
io
lang
math
net
rmi
util
peer

# Package java.util
Il package java.util contiene una serie di classi utili come il framework "Collections" per gestire collezioni eterogenee di ogni tipo, il modello a eventi, classi per la gestione facilitata delle date e degli orari, classi per la gestione dell’internazionalizzazione e tante altre utilità come un separatore di stringhe (StringTokenizer), un generatore di numeri casuali ecc.


