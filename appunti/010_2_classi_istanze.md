# 1. Instanze di una Classe: gli oggetti

In programmazione orientata agli oggetti (OOP), un oggetto è uno dei concetti centrali, rappresentando un'entità del mondo reale dotata di stato e comportamenti. Gli oggetti hanno attributi, chiamati campi, che definiscono il loro stato, e metodi, che determinano il loro comportamento. Ogni oggetto rappresenta un'istanza di una classe, fungendo da esempio concreto dei concetti astratti definiti dalla classe stessa. Gli oggetti occupano spazio nella memoria del sistema, consentendo loro di mantenere uno stato persistente. Un aspetto fondamentale degli oggetti è la loro capacità di comunicare tra loro, permettendo lo scambio di informazioni e il coordinamento delle attività all'interno di un programma. Questa interazione tra oggetti è uno dei pilastri della programmazione orientata agli oggetti, consentendo la creazione di sistemi complessi e dinamici.



---

## 1.1. Cos'è un oggetto?

* Un oggetto è uno dei concetti fondamentali di OOP.
* Un oggetto è un'entità del mondo reale.
* Un oggetto ha stato (campi) e comportamenti (metodi).
* Un oggetto rappresenta un'istanza di una classe.
* Un oggetto occupa un po' di spazio nella memoria.
* Un oggetto può comunicare con altri oggetti.

---

Gli `oggetti` sono istanze (esemplari) delle classi

Gli oggetti sono caratterizzati da

* Classe di appartenenza - tipo (ne descrive attributi e metodi)
* Stato (valore attuale degli attributi)
* Identificatore univoco (reference - handle - puntatore)
<details>
<summary>
Leggi tutto
</summary>
Gli `oggetti` costituiscono istanze o esemplari delle classi all'interno del paradigma della programmazione orientata agli oggetti. Ciascun oggetto è associato a una classe di appartenenza, che ne definisce le caratteristiche attraverso attributi e metodi. La distinzione di un oggetto è basata su tre elementi chiave: la sua classe, il suo stato corrente rappresentato dai valori degli attributi, e un identificatore univoco che consente di fare riferimento all'oggetto in modo univoco. Questo identificatore, spesso chiamato reference, handle o puntatore, è fondamentale per interagire con l'oggetto all'interno del programma, consentendo l'accesso alle sue proprietà e l'esecuzione dei suoi metodi. In questo modo, la combinazione di classe, stato e identificatore conferisce a ciascun oggetto la sua individualità e definisce il ruolo che svolge all'interno del sistema.
</details>

![oggetti](https://raw.githubusercontent.com/maboglia/CorsoJava/master/appunti/img/model/car_class.jpeg)

---

## 1.2. Per creare un oggetto occorre

* Dichiarare una istanza
* La dichiarazione non alloca spazio ma solo una riferimento (puntatore) che per default vale null
* Allocazione e inizializzazione
* Riservano lo spazio necessario creando effettivamente l'oggetto appartenente a quella classe

---

## 1.3. Notazioni Puntate

* Le notazioni puntate possono essere combinate
* `System.out.println("Hello world!");`
* **System** è una classe del `package java.lang`
* **out** è una variabile di classe contenente il riferimento ad un oggetto della classe **PrintStream** che punta allo standard output
* **println()** è un **metodo** della classe PrintStream che stampa una linea di testo

---

## 1.4. Operazioni su reference == e !=

* Attenzione: il test di uguaglianza viene fatto sul puntatore (**reference**) e NON sull'oggetto
* gli operatori relazionali `== e !=` stabiliscono se i **reference** si riferiscono allo stesso oggetto
* È definita l'**assegnazione** con l'operatore `=`
* È definito l'**operatore punto** (notazione puntata)
* In java **NON** è prevista l'aritmetica dei puntatori

---

## 1.5. Operazioni su istanze

Le principali operazioni che si possono effettuare sulle variabili che riferiscono istanze di una classe sono: 

* assegnamento
* confronto
* invocazione di metodi
* Il valore di una variabile di tipo reference è il riferimento ad un oggetto (istanza di una classe)
* Una stessa variabile può riferire oggetti diversi in tempi diversi a seguito di operazioni di assegnazione sul suo valore
* Se la variabile contiene il valore `null` non riferisce nessun oggetto in quel momento

---

## 1.6. Accesso a metodi e attributi non static

* All'interno del corpo di un metodo che **non è** dichiarato `static`, è possibile accedere a qualsiasi attributo e metodo della stessa classe.
* Nel contesto di un metodo, è consentito riferirsi in modo abbreviato agli attributi e ai metodi definiti all'interno della stessa classe.
* Quando, all'interno di un metodo non `static`, compare il nome di un metodo o attributo anch'esso non `static`, è implicito che si stia facendo riferimento all'istanza specifica su cui è stato invocato il metodo.
---

## 1.7. Oggetti e riferimenti

* Mentre le variabili sono dotate di un nome distintivo, gli oggetti non lo sono.
* Per interagire con un oggetto, è necessario passare attraverso una variabile che contiene il suo riferimento.
* Un singolo oggetto può essere accessibile tramite diverse variabili, consentendo l'utilizzo di nomi variabili per accedervi.
* Il rapporto tra variabili e gli oggetti a cui fanno riferimento è dinamico; il riferimento iniziale non è necessariamente vincolato all'oggetto per l'intera durata della sua esistenza.
* Quando nessuna variabile fa più riferimento a un oggetto, quest'ultimo diventa irraggiungibile e il garbage collector interviene per liberare le risorse associate.

---

## 1.8. Confronti tra variabili di tipo strutturato

* Gli operatori di confronto `==` e `!=` possono essere impiegati con variabili di tipo strutturato.
* Quando uno dei due termini del confronto è il valore `null`, l'analisi verifica se una specifica variabile fa riferimento a un oggetto o se è priva di un riferimento, ad esempio, nell'espressione `saluto3 != null`.
* Quando entrambi i termini del confronto sono variabili, il confronto determina se possiedono lo stesso valore, indicando se fanno riferimento esattamente allo stesso oggetto.

---

## 1.9. Confronto tra riferimenti vs. confronto tra oggetti

* L'operatore `==` confronta i **riferimenti**, non i **valori**, contenuti negli oggetti.
* Tipicamente, si desidera confrontare i contenuti, non i riferimenti, ed è per questo che si utilizza il **metodo** `equals()`.
* Il metodo booleano `equals` della classe String richiede come argomento il riferimento a un altro oggetto e restituisce `true` se le stringhe contenute sono uguali, altrimenti restituisce `false`.
* In modo simile, il metodo booleano `equalsIgnoreCase` effettua la stessa operazione senza fare distinzione tra maiuscole e minuscole.


[esempi classi](https://github.com/maboglia/CorsoJava/blob/master/esempi/05_OOP/)
