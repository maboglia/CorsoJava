I più importanti metodi di cui sono dotati gli oggetti di tipo StringBuffer.
--------------------------------------------------------------------------------------
Tipo restituito		Metodi e parametri		Descrizione
--------------------------------------------------------------------------------------
StringBuffer		append(boolean b)		Aggiunge il valore b in coda
							alla stringa. Modifica
							l'oggetto di invocazione, ed
							in più restituisce un
							riferimento allo stesso
							StringBuffer.
StringBuffer		append(char c)			Aggiunge il carattere c in
							coda alla stringa. Modifica
							l'oggetto di invocazione, ed
							in più restituisce un
							riferimento allo stesso
							StringBuffer.
StringBuffer		append(char[] c)		Aggiunge i caratteri contenuti
							nell'array in coda alla
							stringa. Modifica l'oggetto
							di invocazione, ed in più
							restituisce un riferimento
							allo stesso StringBuffer.
StringBuffer		append(double d)		Aggiunge il valore di d in
							coda alla stringa. Modifica
							l'oggetto di invocazione, ed
							in più restituisce un
							riferimento allo stesso
							StringBuffer.
StringBuffer		append(float f)			Aggiunge il valore di f in
							coda alla stringa. Modifica
							l'oggetto di invocazione, ed
							in più restituisce un
							riferimento allo stesso
							StringBuffer.
StringBuffer		append(int i)			Aggiunge il valore di i in
							coda alla stringa. Modifica
							l'oggetto di invocazione, ed
							in più restituisce un
							riferimento allo stesso
							StringBuffer.
StringBuffer		append(long l)			Aggiunge il valore di l in
							coda alla stringa. Modifica
							l'oggetto di invocazione, ed
							in più restituisce un
							riferimento allo stesso
							StringBuffer.
StringBuffer		append(Object obj)		Aggiunge il valore di
							obj.String() in coda alla
							stringa. Modifica l'oggetto
							di invocazione, ed in più
							restituisce un	riferimento
							allo stesso StringBuffer.
StringBuffer		append(String s)		Aggiunge s in coda alla
							stringa. Modifica l'oggetto
							di invocazione, ed in più
							restituisce un riferimento
							allo stesso StringBuffer.
StringBuffer		append(StringBuffer s)		Aggiunge s in coda alla
							stringa. Modifica l'oggetto
							di invocazione, ed in più
							restituisce un riferimento
							allo stesso StringBuffer.
char			chatAt(int i)			Restituisce il carattere
							alla posizione i.
StringBuffer		delete(int start, int end)	Rimuove tutti i caratteri
							dall'indice start (incluso)
							all'indice end (escluso).
							Modifica l'oggetto di
							invocazione, ed in più
							restituisce un riferimento
							allo stesso StringBuffer.
StringBuffer		deleteCharAt(int i)		Rimuove il carattere alla
							posizione i. Modifica
							l'oggetto di invocazione, ed
							in più restituisce un
							riferimento allo stesso
							StringBuffer.	
int			indexOf(String s)		Restituisce la prima posizione
							della sottostringa s, oppure
							-1 nel caso tale sottostringa
							non compaia nell'oggetto di
							invocazione.
int			indexOfString(String s, int i)	Come il precedente, con la
							differenza che la ricerca
							della sottostringa s prende
							prende piede dalla posizione
							i.
StringBuffer		insert(int offset, boolean b)	Aggiunge il valore di b alla
							stringa, inserendolo alla
							posizione offset. Modifica
							l'oggetto di invocazione, ed
							in più restituisce un
							riferimento allo stesso
							StringBuffer.
StringBuffer		insert(int offset, char c)	Aggiunge il carattere c alla
							stringa, inserendolo alla
							posizione offset. Modifica
							l'oggetto di invocazione, ed
							in più restituisce un
							riferimento allo stesso
							StringBuffer.
StringBuffer		insert(int offset, char[] c)	Aggiunge i caratteri
							contenuti nell'array alla
							stringa, inserendoli alla
							posizione offset. Modifica
							l'oggetto di invocazione, ed
							in più restituisce un
							riferimento allo stesso
							StringBuffer.
StringBuffer		insert(int offset, double d)	Aggiunge il valore di d alla
							stringa, inserendolo alla
							posizione offset. Modifica
							l'oggetto di invocazione, ed
							in più restituisce un
							riferimento allo stesso
							StringBuffer.
StringBuffer		insert(int offset, float f)	Aggiunge il valore di f alla
							stringa, inserendolo alla
							posizione offset. Modifica
							l'oggetto di invocazione, ed
							in più restituisce un
							riferimento allo stesso
							StringBuffer.
StringBuffer		insert(int offset, int i)	Aggiunge il valore di i alla
							stringa, inserendolo alla
							posizione offset. Modifica
							l'oggetto di invocazione, ed
							in più restituisce un
							riferimento allo stesso
							StringBuffer.
StringBuffer		insert(int offset, long l)	Aggiunge il valore di l alla
							stringa, inserendolo alla
							posizione offset. Modifica
							l'oggetto di invocazione, ed
							in più restituisce un
							riferimento allo stesso
							StringBuffer.
StringBuffer		insert(int offset, Object obj)	Aggiunge il valore di
							obj.toString() in coda alla
							stringa. Modifica l'oggetto
							di invocazione, ed in più
							restituisce un riferimento
							allo stesso StringBuffer.
StringBuffer		insert(int offset, String s)	Aggiunge s in coda alla
							stringa. Modifica l'oggetto
							di invocazione, ed in più
							restituisce un riferimento
							allo stesso StringBuffer.
StringBuffer		insert(int offset,		Aggiunge s in coda alla
			StringBuffer s)			stringa. Modifica l'oggetto
							di invocazione, ed in più
							restituisce un riferimento
							allo stesso StringBuffer.

int			length()			Restituisce la dimensione
							della stringa.
StringBuffer		setCharAt(int i, char c)	Cambia in c il carattere alla
							posizione i.
void String		toString()			Restituisce un oggetto String
							con il medesimo contenuto
							dello StringBuffer di
							invocazione.