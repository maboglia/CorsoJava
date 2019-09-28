# Un metodo e' ...

* Un  insieme  di   istruzioni   con un nome 
* Uno  strumento  per  risolvere gradualmente i problemi  scomponendoli  in sottoproblemi
* Uno strumento per strutturare  il codice
* Uno strumento per iutilizzare il lavoro già svolto
* Uno  strumento per per rendere rendere il programma più  chiaro e leggibile


Quando il programma da realizzare è articolato diventa conveniente
identificare **sottoproblemi** che possono essere risolti individualmente

scrivere **sottoprogrammi** che risolvono i sottoproblemi
richiamare i **sottoprogrammi** dal programma principale (main)

Questo approccio prende il nome di **programmazione procedurale** (o
astrazione funzionale)

In Java i **sottoprogrammi** si realizzano tramite metodi ausiliari

Sinonimi usati in altri linguaggi di programmazione: funzioni,
procedure e (sub)routines

---


```java


public class ProvaMetodi
{
	public static void main(String[] args) {
		stampaUno();
		stampaUno();
		stampaDue();
	}

	public static void stampaUno() {
		System.out.stampaln("Hello World");
	}

	public static void stampaDue() {
		stampaUno();
		stampaUno();
	}
}

```

## Metodi
* I metodi non static rappresentano operazioni effettuabili su singoli oggetti
* La documentazione indica per ogni metodo il tipo ritornato e la lista degli argomenti formali che rappresentano i dati che il metodo deve ricevere in ingresso da chi lo invoca
* Per ogni argomento formale sono specificati:
	* un nome
	* un tipo

---

## Invocazione di metodi
* L’invocazione di un metodo non static su un oggetto istanza della classe in cui il metodo è definito si effettua con la sintassi:
* Ogni volta che si invoca un metodo si deve specificare una lista di argomenti attuali
* Gli argomenti attuali e formali sono in corrispondenza posizionale
* Gli argomenti attuali possono essere delle variabili o delle espressioni
* Gli argomenti attuali devono rispettare il tipo attribuito agli argomenti formali
* La documentazione di ogni classe ( istanziabile o no) contiene l’elenco dei metodi disponibili
* La classe Math non è istanziabile e contiene 54 metodi (tutti static ovviamente)
* La classe String è “ istanziabile ibrida” e contiene 70 metodi di cui 13 static
* La classe StringBuffer è “ istanziabile pura” e contiene 53 metodi (nessuno static ovviamente)

---




[Esempi sui metodi](https://gist.github.com/maboglia/c9cb7b9c7a895e046cb9ecf2b7d23870)