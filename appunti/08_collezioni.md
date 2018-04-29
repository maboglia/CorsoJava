# Framework Collections

Tutte le classi che permettono di gestire gruppi di oggetti, costituiscono il Java Collections Framework. 

Una Collection è un contenitore in cui più oggetti vengono raggruppati in una singola entità, o meglio è una struttura dati che ha metodi usati per inserire, togliere, recuperare e gestire la struttura stessa.

Il Java Collection Framework è costituito dai seguenti elementi:

* __Interfacce__, che definiscono le operazioni classica di una generica collezione di oggetti
	Possono essere suddivise in __due macro-categorie__:
	* __Collection__, che sono ottimizzate per operazioni di inserimento, modifica e cancellazione di elementi all’interno di un insieme di oggetti
	* __Map__, che sono ottimizzate per operazioni di ricerca
* __Classi__, che implementano le interfacce utilizzando differenti tipi di strutture dati 
* __Algoritmi__, che consistono in metodi per compiere operazioni sulle Collezioni, quali ad esempio operazioni di ordinamento e di ricerca

I vantaggi di avere questo framework a disposizione sono tanti: possibilità di scrivere meno codice, incremento della performance, interoperabilità tra classi non relazionate tra loro, riusabilità, algoritmi complessi già a disposizione (ad esempio quelli per l’ordinamento), ecc.

Andremo ora ad analizzare le caratteristiche del framework e studiamo le principali classi concrete che permettono di gestire al meglio le nostre collezioni di oggetti.

Ad un primo livello si trovano le interfacce Collection (la più importante) e Map.

Collection è estesa dalle interfacce Set, List e Queue. 
Lo scopo di queste interfacce è permettere la manipolazione delle implementazioni indipendentemente dai dettagli di rappresentazione. 
Questo implica che capire a cosa servono queste interfacce significa capire la maggior parte dell’utilizzo del framework.

Esistono implementazioni dell’interfaccia Collection che ammettono elementi duplicati e altre che non lo permettono, collezioni ordinate e non ordinate. 
La libreria non mette a disposizione alcuna implementazione diretta di Collection, ma solo delle sue dirette sottointerfacce come Set e List.

* Un Set è un tipo di collezione che, astraendo il concetto di insieme matematico, non ammette elementi duplicati. 
Questa interfaccia, quindi, permette di gestire collezioni di oggetti non duplicati identificabili univocamente mediante il metodo equals().

* Una List è una collezione ordinata. In una lista viene sempre associato un indice a ogni elemento, che equivale alla posizione dell’elemento stesso all’interno della lista. 
Una lista ammette elementi duplicati (distinguibili dalla posizione). 
Questa interfaccia, quindi, permette di gestire collezioni di oggetti ordinati identificabili univocamente mediante un indice che rappresenta la sua posizione all’interno della lista.

* Una Queue permette di gestire collezioni di oggetti gestiti con la filosofia FIFO (First In First Out) in modo che il primo oggetto inserito sia il primo candidato ad essere letto.

* Map è una collezione che associa chiavi ai suoi elementi. Le mappe non possono contenere chiavi duplicate e ogni chiave può essere associata a un solo valore.

Essa non è propriamente una Collection poiché non implementa l’interfaccia Collection.

---

## Framework Collections	
* [Implementazione di List](./15_Implementazione_List.md)	
* [Implementazione di Set](./15_Implementazione_Set.md)	
* [Implementazione di Map](./15_Implementazione_Map.md)	
* [Implementazione di Queue](./15_Implementazione_Queue.md)	
* Metodi delle Collection e delle Map	
* Algoritmi del Java Collections Framework	
* Collections e Generics	
* Classe StringTokenizer	

___source: Manuale Java 7 - Claudio De Sio Cesari___
