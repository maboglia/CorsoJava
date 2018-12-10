I pi� importanti metodi di cui sono dotati gli oggetti di tipo String.
--------------------------------------------------------------------------------------
Tipo restituito|Metodi e parametri|Descrizione
---|----|---
int|charAt(int i)	|		Restituisce il carattere alla posizione i.
boolean|endsWith(String s)	|	Restituisce true se l'oggetto di invocazione termina con la sottostringa s.
boolean|equals(String s)	|	Restituisce true quando l'oggetto di invocazione e s rappresentano la medesima sequenza.
int|indexOf(char c)	|		Restituisce la prima posizione del carattere c, oppure -1 nel caso tale carattere non faccia parte della stringa.
int|indexOf(char c, int i)	|	Come il precedente, con la differenza che la ricerca del carattere c prende piede dalla posizione i.
int|indexOf(String s)	|	Restituisce la prima posizione della sottostringa s, oppure -1 nel caso tale sottostringa non compaia nell'oggetto di invocazione.
int|indexOf(String s, int i)	|Come il precedente, con la differenza che la ricerca della sottostringa s prende piede dalla posizione i.
int|length()	|		Restituisce la lunghezza della stringa.
String|replace(char c1, char c2)	|Restituisce una nuova stringa, ottenuta dall'oggetto di invocazione sostituendo il carattere c2 ad ogni occorrenza del carattere c1.
boolean|starsWith(String s)	|	Restituisce true se l'oggetto di invocazione inizia con la sottostringa s.
String|toLowerCase()	|		Restituisce una nuova stringa, ottenuta traslando verso il minuscolo ogni carattere dell'oggetto di invocazione.
String|toUpperCase()	|		Restituisce una nuova stringa, ottenuta traslando verso il maiuscolo ogni carattere dell'oggetto di invocazione.
String|trim()	|			Restituisce una nuova stringa, ottenuta dall'oggetto di invocazione eliminando gli spazi che precedono il primo carattere significativo e quelli che seguono l'ultimo. In pratica, " ciao ".trim() restituisce "ciao".