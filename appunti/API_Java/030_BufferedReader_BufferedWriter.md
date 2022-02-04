Importanti derivazioni di Reader e Writer sono BufferedReader
e BufferedWriter. 


Queste due classi meritano una menzione
speciale, perchè gestiscono il concetto di riga.

BufferedReader ha un costruttore del tipo:

BufferedReader(Reader in)
Rispetto a Reader, BufferedReader definisce il metodo
readline(). Questo metodo ritorna una stringa che corrisponde
ad un'intera riga letta dal canale di comunicazione. Se il
flusso è giunto al termine, restituisce null.

BufferedWriter(Writer out)
Rispetto a Writer, BufferedWriter definisce il metodo
newline(). Questo metodo introduce nel canale un ritorno a
nuova riga.

I costruttori di BufferedReader e BufferedWriter non
propagano eccezioni, poichè si rifanno a dei canali già
instaurati.