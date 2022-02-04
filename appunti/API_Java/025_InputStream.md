# I membri di InputStream.

---

## Metodi pubblici:

* int available()			Restituisce il numero di byte
				che ancora devono essere
				letti.
* void close()			Chiude lo stream.
* void mark(int readlimit)	Memorizza l'attuale posizione
				dello stream, in modo che poi
				sia possibile tornarci
				chiamando reset(). Dopo
				readlimit byte letti,
				comunque, la posizione viene
				dimenticata.
* boolean markSupported()		Restituisce true se lo stream
				corrente supporta la
				funzionalità offerta da
				mark() e reset().
* int read()			Legge un byte dallo stream, e
				lo restituisce come valore
				int. Restituisce -1 se lo
				stream ha raggiunto il
				termine.
* int read(byte[] b)		Come read(b, 0, b.length).
* int read(byte[] b, int off,	Legge len byte dallo stream,
* int len)			salvandoli nell'array b, a
				partire dalla posizione off.
				Restituisce il numero di byte
				effettivamente letti, o -1 se
				la fine dello stream è stata
				raggiunta.
* void reset()			Torna al punto raggiunto
				nello stream l'ultima volta
				che è stato chiamato mark().
* long skip(long n)		Avanza di n byte nello
				stream, senza leggerli.
				Restituisce il numero dei
				byte effettivamente saltati.