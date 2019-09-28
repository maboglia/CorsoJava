# Operazioni su istanze
* Le principali operazioni che si possono effettuare sulle variabili che riferiscono istanze di una classe sono:
	* assegnamento
	* confronto
	* invocazione di metodi
* Le principali operazioni che si possono effettuare sulle variabili che riferiscono istanze di una classe sono: 
	* assegnamento
	* confronto
	* invocazione di metodi

* Il valore di una variabile di tipo strutturato è il riferimento ad un oggetto (istanza di una classe)
* Una stessa variabile può riferire oggetti diversi in momenti diversi a seguito di operazioni di assegnazione sul suo valore
* Se la variabile contiene il valore null non riferisce nessun oggetto in quel momento

---


## Oggetti e riferimenti
* Le variabili hanno un nome, gli oggetti no
* Per utilizzare un oggetto bisogna passare attraverso una variabile che ne contiene il riferimento
* Uno stesso oggetto può essere riferito da più variabili e quindi essere raggiunto tramite nomi diversi (di variabili)
* Il rapporto variabili - oggetti riferiti è dinamico, il riferimento iniziale non necessariamente rimane legato all'oggetto per tutta la sua esistenza
* Se un oggetto non è (più) riferito da nessuna variabile diventa irraggiungibile (e quindi interviene il garbage collector)

---


## Operazioni su istanze
* Le principali operazioni che si possono effettuare sulle variabili che riferiscono istanze di una classe sono:
	* assegnamento
	* confronto
	* invocazione di metodi

---


## Confronti tra variabili di tipo strutturato
* E' possibile applicare gli operatori di confronto == e != a variabili di tipo strutturato
* Se uno dei due termini del confronto è il valore null si verifica se una certa variabile riferisce un oggetto oppure no, p.e. saluto3 != null
* Se entrambi i termini del confronto sono variabili, si verifica se hanno lo stesso valore (cioè riferiscono esattamente lo stesso oggetto)

---

## Confronto tra riferimenti vs. confronto tra oggetti

* Usare == fa il confronto tra i riferimenti non fra i valori contenuti negli oggetti (p.e. le sequenze di caratteri contenute nelle istanze di String ) 
* Di solito si vogliono confrontare i contenuti non i riferimenti: per questo si usa il metodo __equals__ 
* Il metodo booleano equals della classe String accetta come argomento il riferimento ad un altro oggetto e ritorna true se le stringhe contenute sono uguali (in modo case sensitive), false altrimenti 
* Il metodo booleano equalsIgnoreCase fa lo stesso senza distinguere maiuscole/minuscole


---


## Operazioni su istanze
* Le principali operazioni che si possono effettuare sulle variabili che riferiscono istanze di una classe sono:
  * assegnamento
  * confronto
  * invocazione di [metodi](009_metodi.md)

---
