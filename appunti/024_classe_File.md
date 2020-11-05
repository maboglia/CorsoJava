I membri della classe File.
--------------------------------------------------------------

Costruttori pubblici:
`File(File parent, String child)	`

Costruisce un oggetto File a
				partire da un File che
				identifica il percorso di base
				ed un secondo File che
				specifica il nome
				dell'elemento.
`File(String pathname)`		

Costruisce un oggetto File che
				corrisponde al percorso
`				espresso.
File(String parent,	String child)`	

Costruisce un oggetto File a
			partire da una stringa che
				identifica il percorso di base
				ed una stringa che specifica
				il nome dell'elemento.
--------------------------------------------------------------
Costanti statiche pubbliche:
String pathSeparator		Il carattere che, nel sistema
				in uso, viene impiegato per
				separare i percorsi, riportato
				come stringa.
char pathSeparatorChar		Il carattere che, nel sistema
				in uso, viene impiegato per
				separare i percorsi.
String separator		Il carattere che, nel sistema
				in uso, viene impiegato per
				separare gli elementi di un
				percorso, riportato come
				stringa.
char separatorChar		Il carattere che, nel sistema
				in uso, viene impiegato per
				separare gli elementi di un
				percorso.
--------------------------------------------------------------
Metodi statici pubblici:
File createTempFile(String	prefix, String suffix)	Crea un file temporaneo con il
	prefisso ed il suffisso
				specificati, restituendolo. Il
				file sar� posizionato nella
				cartella temporanea
				predefinita del sistema.
File createTempFile(String	prefix, String suffix,File directory)Crea un file temporaneo con il
	prefisso ed il suffisso
			specificati, restituendolo. Il
				file sar� posizionato nella
				cartella identificata dal
				terzo argomento.
File[] listRoots		Restituisce l'elenco delle
				radici delle periferiche di
				archiviazione riconosciute dal
				sistema.
--------------------------------------------------------------
Metodi pubblici:
boolean canRead()		Restituisce true se il file
				pu� essere letto.
boolean canWrite()		Restituisce true se il file
				pu� essere scritto.
int compareTo(File f)		Paragona in maniera
				lessicografica il percorso
				del file corrente con quello
				dell'argomento fornito.
				Restituisce 0 se i due
				percorsi sono equivalenti,
				un valore negativo se il
				primo precede il secondo, un
				valore positivo se il secondo
				precede il primo.
boolean createNewFile()		Crea il file, ma solo se non
				esiste gi�. Se la creazione
				ha luogo, restituisce true.
boolean delete()		Cancella il file. Se
				l'operazione riesce,
				restituisce true.
void deleteOnExit()		Cancella il file alla chiusura
				del programma.
boolean equals(Object o)	Confronta il file con
				l'oggetto o. Restituisce true
				solo se o identifica il
				medesimo percorso sul disco.
boolean exists()		Restituisce true se il file
				esiste.
File getAbsoluteFile()		Restituisce il percorso
				assoluto al file.
String getAbsolutePath()	Restituisce il percorso
				assoluto al file.
File getCanonicalFile()		Restituisce il percorso
				canonico al file.
String getCanonicalPath()	Restituisce il percorso
				canonico al file.
String getName()		Restituisce il nome del file.
String getParent()		Restituisce il percorso della
				cartella generatrice del
				file.
File getParentFile()		Restituisce un oggetto File
				che rappresenta la cartella
				generatrice del file.
String getPath()		Restituisce il percorso del
				file.
int hashCode()			Calcola un codice hash per
				l'oggetto.
boolean isAbsolute()		Restituisce true se il file �
				espresso mediante un percorso
				assoluto.
boolean isDirectory		Restituisce true se l'oggetto
				rappresenta una directory.
boolean isFile()		Restituisce true se l'oggetto
				rappresenta un file, nel
				senso letterale del termine.
boolean isHidden()		Restituisce true se il file �
				nascosto.
long lastModified()		Restituisce la data
				dell'ultima modifica del
				file, espressa con la tipica
				notazione in millisecondi.
long length()			Restituisce la grandezza del
				file in byte.
File[] listFiles()		Se l'oggetto rappresenta una
				directory, restituisce un
				array che contiene dei
				riferimenti a tutti i suoi
				file e a tutte le sue
				sotto-directory. In caso
				contrario, restituisce null.
boolean mkdir()			Se l'oggetto rappresenta una
				directory inesistente, la
				crea. Se l'operazione ha
				successo, restituisce true.
boolean mkdirs()		Crea tutte le directory
				inesistenti contenute nel
				percorso dell'oggetto. Se
				l'operazione ha successo,
				restituisce true.
boolean renameTo(File dest)	Cambia il nome del file.
				Se l'operazione ha successo,
				restituisce true.
boolean setLastModified		Cambia la data dell'ultima
(long t)			modifica del file. Se
				l'operazione ha successo,
				restituisce true.
boolean setReadOnly()		Imposta il file come di sola
				lettura. Se l'operazione ha
				successo, restituisce true.
String toString()		Fornisce una
				rappresentazione in stringa
				dell'oggetto.