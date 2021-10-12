# InputStreamReader e OutputStreamWriter

La classe **InputStreamReader** è un ponte tra InputStream e
Reader, mentre **OutputStreamWriter** è un ponte tra
OutputStream e Writer.


**InputStreamReader** è un Reader, in altre parole estende
la classe Reader e ne concretizza i metodi. 
Il suo costruttore fondamentale è:
**InputStreamReader(InputStream in)**
Dunque, il suo compito è trasformare un InputStream in
un Reader.

**OutputStreamWriter**, invece, estende la classe Writer e ne concretizza i metodi. Il suo costruttore fondamentale è:
**OutputStreamWriter(OutputStream out)**
Quindi il suo compito è trasforame un OutputStream in un
Writer.
I costruttori appena esaminati non propagano eccezioni,
poichè si collegano a canali già stabiliti.