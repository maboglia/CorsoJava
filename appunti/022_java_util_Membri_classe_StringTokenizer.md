La classe StringTokenizer fornisce un basilare scanner per
l'interpretazione del testo. Tramite essa, � possibile
prendere in esame una stringa, spezzandola in pi� parti
(token) secondo determinate regole. StringTokenizer implementa
l'interfaccia Enumeration, in modo che i singoli token in cui
viene scomposta una stringa possano essere sfogliati in
maniera classica e semplice. 
La seguente tabella riporta i  membri pubblici della classe
StringTokenizer.

Costruttori pubblici:

..|..
---|---
StringTokenizer(String str)|	Costruisce uno StringTokenizer per la tsringa str, che come delimitatori usa i caratteri "\t\n\r\f".
StringTokenizer(String str,	String delim)|  Costruisce uno StringTokenizer per la stringa str, che come delimitatori usa i caratteri contenuti nella stringa delim.
StringTokenizer(String str,	String delim, boolean returnDelims)|	Costruisce uno StringTokenizer per la stringa str, che come delimitatori usa i caratteri contenuti nella stringa delim. Se returnDelims � true, i caratteri divisori verranno restituiti come token.

Metodi pubblici:
..|..
---|---
int countTokens()|		Restituisce il numero dei token elaborati.
boolean hasMoreElements()|	Come il successivo hasMoreTokens().
boolean hasMoreTokens()|		Restituisce true se ci sono ancora dei token da considerare.
Object nextElement()|		Restituisce il token successivo, sotto forma di Object.
String nextToken()|		Restituisce il token successivo, sotto forma di String.
String nextToken(String delim)|	Imposta una nuova serie di caratteri delimitatori, quindi restituisce il token successivo.