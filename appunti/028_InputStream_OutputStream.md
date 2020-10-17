In java.io sono definite due importanti classi astratte:
InputStream e OutputStream.
InputStream fornisce l'interfaccia di base per gli stream
in entrata, mentre OutputStream cura gli stream in uscita.
Un InputStream è un flusso che va letto consecutivamente,
dall'inizio alla fine. Le funzioni mark() e reset(),
effettivamente funzionanti solo con alcuni tipi di stream,
permettono di fare qualche passo indietro nella lettura.
Tuttavia, questa è l'eccezione, non la regola.
Un InputStream si legge, normalmente, dal primo all'ultimo
byte, senza involuzioni. Il metodo read() legge un byte
dallo stream di input, e lo restituisce sotto forma di
int. Quando read() restituisce -1, non ci sono piè dati da
leggere.
La chiamata a read() blocca il thread corrente fino alla
effettiva ricezione del dato. La cosa, di norma, non è
rilevante nella lettura di un file, ma va considerata
quando si ricevono dati dalla rete o dalla riga di
comando.
Finchè non c'è un dato da leggere (o finchè lo stream non
viene chiuso), il thread resta fermo.
La prassi di utilizzo di un InputStream si articola sempre
in tre passi:
1. Apri lo stream.
2. Leggi i dati che occorrono.
3. Chiudi lo stream.
Dentro un OutputStream i dati vanno scritti
consecutivamente, byte dopo byte, servendosi dei metodi
write(). Alcuni OutputStream possono essere bufferizzati,
ed in questo caso i dati non raggiungono direttamente la
loro destinazione finale. Un buffer è un segmento intero,
nel quale i dati vengono "parcheggiati" momentaneamente.
Quando il buffer è pieno, o quando si richiama il metodo
flush(), avviene la reale consegna. I buffer permettono
un minimo di ripensamento su quello che si è giè scritto.
Anche in questo caso, comunque, la funzionalitè non è
nella norma. I buffer, piè che altro, sono stati concepiti
perchè, in certe situazioni, garantiscono prestazioni
migliori. La prassi di utilizzo di un OutputStream è:
1. Apri lo stream.
2. Scrivi i dati che devi scrivere.
3. Chiudi lo stream.