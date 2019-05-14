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

[Esempi sui metodi](https://gist.github.com/maboglia/c9cb7b9c7a895e046cb9ecf2b7d23870)