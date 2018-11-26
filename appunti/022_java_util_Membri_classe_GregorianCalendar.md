I membri pi� importanti classe GregorianCalendar.

Costruttori pubblici:

GregorianCalendar		Costruisce un GregorianCalendar che rappresenta la data e l'ora correnti.

..|..
---|---
GregorianCalendar(int	year, int month, int date)|	Costruisce un GregorianCalendar che rappresenta la data espressa mediante gli argomenti forniti. GregorianCalendar(int	year, int month, int date,int hour, int minute)||Costruisce un GregorianCalendar che rappresenta la data e l'ora espressa mediante gli argomenti forniti. 

Metodi pubblici:
..|..
---|---
boolean after(Object o)|	Restituisce true se la data rappresentata È successiva alla data espressa dall'oggetto o, che deve essere istanza di Calendar.
boolean before(Object o)|Restituisce true se la data rappresentata È precedente alla data espressa dall'oggetto o, che deve essere istanza di Calendar.
Object clone()|		Clona l'oggetto. GregorianCalendar implementa l'interfaccia Cloneable.
booleans equals(Object o)|Restituisce true se l'argomento rappresenta una data equivalente a quella rappresentata dall'oggetto di invocazione.
int get(int field)|	Recupera il valore di uno dei campi della data rappresentata. L'argomento specifica il campo di interesse.
Date getTime()|		Restituisce un oggetto Date che rappresenta la data incapsulata dall'oggetto di invocazione.
long getTimeInMillis()|	Restituisce la data rappresentata dall'oggetto sotto forma di valore long, che esprime i millisecondi trascorsi dal 1 Gennaio 1970 sino alla data rappresentata.
int hashCode()|		Calcola un codice hash per l'oggetto.
void set(int field, int value)|Imposta su value il valore del campo rappresentato dall'intero field.
void setTime(Date d)|	Imposta la data rappresentata prelevando il suo valore all'argomento d.
void SetTimeInMillis(long l)|Imposta la data rappresentata mediante un argomento di tipo long, che esprime i millisecondi trascorsi dal 1 Gennaio 1970 sino alla data rappresentata.
String toString()|	Fornisce una rappresentazione in stringa della data. rappresentata.
--------------------------------------------------------------
Costanti statiche:
..|..
---|---
AM_PM|Il campo che informa se l'ora espressa è prima o dopo mezzogiorno.
DAY_OF_MONTH|Il campo che riporta il giorno del mese.
DAY_OF_WEEK|Il campo che riporta il giorno della settimana.
DAY_OF_YEAR|Il campo che riporta il giorno dell'anno.
HOUR|Il campo che riporta l'ora del mattino o del pomeriggio, a seconda del contenuto del campo AM_PM
HOUR_OF_DAY|Il campo che riporta l'ora del giorno, in un intervallo tra 0 e 23.
MILLISECOND|Il campo che riporta i millisecondi.
MINUTE|Il campo che riporta i minuti. 
MONTH|Il campo che riporta il mese.
SECOND|Il campo che riporta i secondi.
WEEK_OF_MONTH|Il campo che riporta la settimana del mese.
WEEK_OF_YEAR|Il campo che riporta la settimana dell'anno.
YEAR|Il campo che riporta l'anno.