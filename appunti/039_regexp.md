# Espressioni regolari

* un modo potente per analizzare testo in Java
* possono essere usate sia per validare una stringa sia per effettuare ricerche all’interno di un testo, a partire da un’espressione regolare. 
* Si tratta di un pseudo-linguaggio sintetico e a volte criptico, composto appunto di espressioni, con una sintassi non ambigua, per individuare determinate aree di testo.
* La sintassi è abbastanza vasta. Essenzialmente ci occorre conoscere tre tipologie di espressioni:
  * i gruppi di caratteri (character classes)
  * classi predefinite
  * quantificatori (greedy quantifier)

## GRUPPI DI CARATTERI
Per definire un’espressione regolare è necessario conoscere alcune regole base

## CLASSI PREDEFINITE
Esistono anche forme abbreviate per rappresentare un insieme di caratteri.

## QUANTIFICATORI
I quantificatori servono a indicare la molteplicità di caratteri, parole, espressioni o gruppi di caratteri. 
Noi indichiamo soltanto quelli appartenenti alla tipologia "greedy quantifier":

# PACKAGE JAVA.UTIL.REGEX

* Questo package definisce due semplici classi sulle quali si basa tutta la libreria che utilizza le espressioni regolari:
  * Pattern, che rappresenta l’espressione regolare effettiva. 
  * Per ottenere un’istanza della classe Pattern è necessario invocare il metodo statico compile() che accetta come parametro una stringa che rappresenta l’espressione regolare. 
  * La classe Pattern dispone anche del metodo statico matches() che riceve in input due stringhe, la prima è l’espressione regolare, la seconda è la stringa da validare. 
  * Il metodo restituisce un booleano, true se la stringa rispetta il formato, false altrimenti
* Matcher, che definisce diversi metodi per la ricerca e l’analisi del testo. 
  * Per ottenere un’istanza della classe Matcher, è necessario invocare il metodo statico matcher() su un’istanza dell’oggetto Pattern
  * L’eccezione che viene sollevata nel momento in cui viene individuato un errore di sintassi nel pattern di un’espressione regolare è PatternSyntaxException.
* Per verificare se un stringa rispetta il formato definito dall’espressione regolare possiamo utilizzare due metodi.
* Nel primo caso utilizziamo il metodo statico matches() della classe Pattern, passandogli l’espressione regolare e la stringa da validare.
* 
```java
public static Boolean check(String regex, String input) {
	if (Pattern.matches(regex, input))	return true;
	else							return false;
}
```

Nel secondo caso creiamo prima un’istanza della classe Matcher e poi richiamiamo il metodo matcher().

```java
public static boolean check(String regex, String input) {
	Pattern pattern = Pattern.compile(regex);
	Matcher matcher = pattern.matcher(input);

	if (matcher.matches())	
		return true;
	else
		return false;
}
```

E’ possibile, inoltre, utilizzare il package java.util.regex per ricercare una stringa all’interno di un’altra.

```java
String regex = "[a-zA-Z0-9._%-]+@[ a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}";
String input = "pippo@email.it;pluto@email.it;paperino@email.it";

Pattern pattern = Pattern.compile(regex);
Matcher matcher = pattern.matcher(input);

while (matcher.find())
	System.out.println(matcher.group());
```

Il metodo find() della classe Matcher, ricerca una sottostringa all’interno della stringa di ingresso che rispetta il formato dell’espressione regolare. Il metodo find() funziona come un iterator, cioè aggiorna gli indici ad ogni iterazione.
