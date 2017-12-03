
### Classe StringTokenizer
Spesso risulta necessario manipolare dei token di testo.
Una semplice classe che permette di separare i contenuti di una stringa in più parti, chiamate token, è la classe StringTokenizer.
Questa classe si utilizza solitamente per estrarre le parole di una stringa.
L’utilizzo di base è estremamente semplice, occorrono:
una stringa da "navigare", cioè da cui estrarre i token
un delimitatore, che serve per identificare i token
Un token è, quindi, la sequenza massima di caratteri consecutivi che non sono delimitatori.
CREARE OGGETTO STRINGTOKENIZER
Occorre creare in prima istanza l’oggetto StringTokenizer, usando il costruttore dell’omonima classe. 
Il costruttore può accettare da 1 a 3 parametri:
la stringa da cui estrarre i token
il delimitatore, che può essere:
esplicito [st2 – st3]
di default " \t\n\r\f" (notare che il primo delimitatore e uno spazio) [st1]
un booleano che, se settato a true, considera token anche gli stessi delimitatori
```java
StringTokenizer st1 = new StringTokenizer("Stringa da dividere");
StringTokenizer st2 = new StringTokenizer("Stringa sezionata", ";");
StringTokenizer st3 = new StringTokenizer("Ciao Mamma", "a", true);

Output [st1]
	Stringa
	da
	dividere
Output [st2]
	Stringa selezionata
Output [st3]
	Ci
	a
	o M
	a
	mm
	a
```	
Per scandire l’intero testo si può usare un ciclo while con all’interno l’invocazione del metodo hasMoreTokens() che ritorna true se sono presenti altri token, altrimenti false.
Per stampare il token appena recuperato si può invocare il metodo nextToken() sull’oggetto StringTokenizer.

StringTokenizer st = new StringTokenizer("Stringa da dividere");
while (st.hasMoreTokens()) {
	// Due metodi per fare la stessa cosa
System.out.println(st.nextToken());
System.out.println(st.nextElement().toString());
}
