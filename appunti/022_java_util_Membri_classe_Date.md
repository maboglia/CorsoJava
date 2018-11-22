I membri resi disponibili dalla classe Date.
--------------------------------------------------------------
Costruttori pubblici:
Date()				Costruisce un oggetto Date che
				incapsula la data e l'ora
				correnti.
Date(long t)			Costruisce un oggetto Date che
				incapsula la data e l'ora
				espressi dall'argomento t.
				L'argomento è un long che
				riporta i millisecondi
				trascorsi dal 1° Gennaio 1970
				sino alla data rappresentata.
--------------------------------------------------------------
Metodi pubblici:
boolean after(Date d)		Restituisce true se la data di
				invocazione è successiva alla
				data d.
boolean before(Date d)		Restituisce true se la data di
				invocazione è precedente alla
				data d.
Object clone()			Clona l'oggetto. Date
				implementa l'interfaccia
				Cloneable.
int compareTo(Date d)		Compara la data di invocazione
				con d. Restituisce 0 se le due
				date sono uguali, un valore
				negativo se la data di
				invocazione precede la data d
				o un valore positivo se la
				data di invocazione è
				successiva alla data d.
int compareTo(Object)		Se l'argomento fornito è una
				istanza di Date, agisce come
				compareTo(Date d). In caso
				contrario, propaga una
				ClassCastException.
boolean equals(Object o)	Restituisce true se
				l'argomento è una data
				equivalente a quella di
				invocazione.
long getTime()			Restituisce la data
				dell'oggetto sotto forma di
				valore long, che esprime i
				millisecondi trascorsi dal 1°
				Gennaio 1970 sino alla data
				rappresentata.
int hashCode()			Calcola un codice hash per
				l'oggetto.
void setTime(long t)		Imposta la data rappresentata
				con un argomento di tipo long,
				che esprime i millisecondi
				trascorsi dal 1° Gennaio 1970
				sino alla data rappresentata.
String toString()		Fornisce una rappresentazione
				in stringa della data.