# metodo

* Termine caratteristico dei linguaggi OOP
* Un  **insieme  di   istruzioni   con un nome** 
* Uno  strumento  per  risolvere gradualmente i problemi  scomponendoli  in **sottoproblemi**
* Uno strumento per **strutturare**  il codice
* Uno strumento per **ri-utilizzare** il lavoro già svolto
* Uno  strumento per rendere il **programma più chiaro** e leggibile

![metodo](https://raw.githubusercontent.com/maboglia/CorsoJava/master/appunti/img/Language/01_lang_base/02_classe_base/function.png)

---

## Componenti dei metodi

Più in generale, le dichiarazioni di metodo hanno **sei** componenti (alcuni sono opzionali), nell'ordine:

* **Modificatori**, come public, private e altri che imparerai in seguito.
* Il **tipo restituito**: il tipo di dati del valore restituito dal metodo o void se il metodo non restituisce un valore.
* Il **nome del metodo**: le regole per i nomi dei campi si applicano anche ai nomi dei metodi, ma la convenzione è leggermente diversa.
* L'**elenco di parametri** tra parentesi: un elenco delimitato da virgole di parametri di input, preceduti dai rispettivi tipi di dati, racchiusi tra parentesi (). Se non sono presenti parametri, è necessario utilizzare parentesi vuote.
* Un **elenco di eccezioni**, opzionali, da discutere in seguito.
* Il **corpo del metodo**, racchiuso tra parentesi graffe: il codice del metodo, inclusa la dichiarazione delle variabili locali, va qui.

---

## Argomenti attuali e formali

* Ogni volta che si **invoca** un metodo si deve specificare una lista di argomenti attuali
* Gli argomenti attuali e formali sono in corrispondenza posizionale
* Gli argomenti attuali possono essere delle variabili o delle espressioni
* Gli argomenti attuali devono rispettare il tipo attribuito agli **argomenti formali**

![metodo](https://raw.githubusercontent.com/maboglia/CorsoJava/master/appunti/img/Language/01_lang_base/02_classe_base/function.png)

---

## Overloading dei metodi

* E' possibile definire **metodi con lo stesso nome** ma liste degli argomenti diverse, cioè varianti diverse dello stesso metodo
* Si definisce _signature_, o **firma** del metodo l'insieme di nome ed argomenti: p.es `raddoppia(String s);`,`raddoppia(int i);`
* La diversità delle liste riguarda il **numero**, **tipo** e **ordine** di argomenti formali, **non** il loro nome
* A seconda degli argomenti passati verrà selezionato ed eseguito il metodo appropriato (se esiste)
* **Non** è ammesso **overloading** sul **tipo** ritornato: metodi con nome e lista degli argomenti uguali ma tipo ritornato diverso non vengono distinti e danno luogo ad errori di compilazione

---

## Metodi ausiliari (static)

* Il modificatore `static` permette di creare **metodi statici**: quelli dichiarati `static`
* I metodi static sono richiamabili attraverso nome della classe
* p.es: `Math.sqrt()`
* Se sono anche `private` e aiutano a separare la logica dal metodo `main`, in caso di interfacce testuali (che girano nella `console`), vengono definiti anche `metodi ausiliari`
* Nella programmazione ad oggetti bisogna farne un uso estremamente limitato!

```java


public class ProvaMetodiStatic
{
	public static void main(String[] args) {
		metodoUno();
		metodoUno();
		metodoDue();
	}

	public static void metodoUno() {
		System.out.metodoln("Hello World");
	}

	public static void metodoDue() {
		metodoUno();
		metodoUno();
	}
}

```

---

## quando e perché usare i metodi (ausiliari)

1. Quando il programma da realizzare è articolato diventa conveniente identificare **sottoproblemi** che possono essere risolti **singolarmente**
2. scrivere **sottoprogrammi** che risolvono i sottoproblemi richiamare i **sottoprogrammi** dal programma principale (main)
3. Questo approccio prende il nome di **programmazione procedurale** (o astrazione funzionale)
4. In Java i **sottoprogrammi** si realizzano tramite **metodi ausiliari**
5. Sinonimi usati in altri linguaggi di programmazione: **funzioni**, **procedure** e (sub)**routines**

---

## Metodi non static

* I metodi **non static** rappresentano operazioni effettuabili su singoli oggetti
* La documentazione indica per ogni metodo il tipo ritornato e la lista degli argomenti formali che rappresentano i dati che il metodo deve ricevere in ingresso da chi lo invoca
* Per ogni argomento formale sono specificati:
  * un tipo (primitivo o reference)
  * un nome (identificatore che segue le regole di naming)

---

## Invocazione di metodi non static

* L’invocazione di un metodo non static su un oggetto istanza della classe in cui il metodo è definito si effettua con la sintassi:
* Ogni volta che si invoca un metodo si deve specificare una lista di argomenti attuali
* Gli argomenti attuali e formali sono in corrispondenza posizionale
* Gli argomenti attuali possono essere delle variabili o delle espressioni
* Gli argomenti attuali devono rispettare il tipo attribuito agli argomenti formali
* La documentazione di ogni classe (istanziabile o no) contiene l’elenco dei metodi disponibili
* La classe **Math** non è istanziabile
* La classe **String** è "istanziabile ibrida"
* La classe **StringBuilder** è "istanziabile pura"

Argomenti correlati

* [I metodi costruttori](https://github.com/maboglia/CorsoJava/blob/master/appunti/010_3_classi_costruttori.md)
* [I metodi getters e setters](https://github.com/maboglia/CorsoJava/blob/master/appunti/010_4_classi_metodi_getter_setter.md)

---

## Metodi predicativi

Un metodo che restituisce un tipo primitivo `boolean` si definisce **predicativo** e può essere utilizzato direttamente in una condizione.
In inglese sono spesso introdotti da `is` oppure `has`: isMale(), hasNext(). 

---

## codice esempi d'uso

* [raccolta esempi](https://github.com/maboglia/CorsoJava/blob/master/esempi/06_MetodiAusiliari.md)
* [Esempi sui metodi ausiliari](https://github.com/maboglia/CorsoJava/tree/master/esempi/01_base/03_metodi_ausiliari)

