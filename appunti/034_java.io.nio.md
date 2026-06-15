# I packages per la gestione di input/output

I package `java.io` e `java.nio` in Java offrono strumenti per la gestione di input/output, sia per lettura e scrittura di file, che per la gestione di flussi di dati. Il package `java.io` è la libreria I/O classica, mentre `java.nio` (New I/O) introduce un’API basata su buffer e operazioni non bloccanti (sincrone e asincrone), particolarmente utile per applicazioni ad alte prestazioni.

---

## Package `java.io`

---

### 1. **File**

- **Descrizione**: Rappresenta un file o una directory nel file system. Fornisce metodi per creare, eliminare, e navigare file e cartelle.
- **Principali Metodi**:
  - `exists()`: Verifica se il file o la directory esiste.
  - `createNewFile()`: Crea un nuovo file.
  - `listFiles()`: Restituisce una lista di file nella directory.
  - `delete()`: Elimina il file o la directory.

---

### 2. **FileInputStream** e **FileOutputStream**

- **Descrizione**: Classi per la lettura e scrittura di dati binari da/a file.
- **Principali Metodi**:
  - `read()`: Legge un byte o una serie di byte dal file (FileInputStream).
  - `write(int b)`: Scrive un byte nel file (FileOutputStream).
  - `close()`: Chiude il flusso di input/output.

---

### 3. **FileReader** e **FileWriter**

- **Descrizione**: Classi per la lettura e scrittura di dati testuali (caratteri) da/a file.
- **Principali Metodi**:
  - `read()`: Legge un carattere o un array di caratteri (FileReader).
  - `write(int c)`: Scrive un carattere nel file (FileWriter).
  - `close()`: Chiude il flusso.

---

### 4. **BufferedReader** e **BufferedWriter**

- **Descrizione**: Classi per la lettura e scrittura di dati testuali con buffering, migliorando l’efficienza I/O.
- **Principali Metodi**:
  - `readLine()`: Legge una linea di testo (BufferedReader).
  - `write(String s)`: Scrive una stringa con buffering (BufferedWriter).
  - `flush()`: Svuota il buffer (BufferedWriter).
  - `close()`: Chiude il flusso.

---

### 5. **PrintWriter**

- **Descrizione**: Fornisce metodi per scrivere dati formattati (testo) in un file o flusso.
- **Principali Metodi**:
  - `print()`: Scrive testo senza newline.
  - `println()`: Scrive testo con newline.
  - `printf(String format, Object... args)`: Scrive dati formattati.
  - `close()`: Chiude il flusso.

---

### 6. **ObjectInputStream** e **ObjectOutputStream**

- **Descrizione**: Utilizzati per la serializzazione e deserializzazione di oggetti Java.
- **Principali Metodi**:
  - `writeObject(Object obj)`: Serializza un oggetto (ObjectOutputStream).
  - `readObject()`: Deserializza un oggetto (ObjectInputStream).
  - `close()`: Chiude il flusso.

---

### 7. **Serializable**

- **Descrizione**: Interfaccia vuota (marker) che indica che una classe può essere serializzata.
- **Principali Metodi**: N/A (non ha metodi, serve come indicatore).

---

### 8. **InputStream** e **OutputStream**

- **Descrizione**: Classi astratte che rappresentano flussi generici di input e output di byte.
- **Principali Metodi**:
  - `read()`: Legge un byte (InputStream).
  - `write(int b)`: Scrive un byte (OutputStream).
  - `close()`: Chiude il flusso.

---

## Package `java.nio`

---

### 1. **Path** e **Paths**

- **Descrizione**: `Path` rappresenta una posizione nel file system. `Paths` è una classe di utilità per ottenere istanze di `Path`.
- **Principali Metodi**:
  - `get(String first, String... more)`: Restituisce un’istanza di Path.
  - `toAbsolutePath()`: Restituisce il percorso assoluto.
  - `getFileName()`: Restituisce il nome del file.

---

### 2. **Files**

- **Descrizione**: Classe di utilità per operazioni di gestione dei file come lettura, scrittura, copia e cancellazione.
- **Principali Metodi**:
  - `readAllBytes(Path path)`: Legge tutti i byte di un file.
  - `write(Path path, byte[] bytes)`: Scrive byte in un file.
  - `copy(Path source, Path target)`: Copia un file.
  - `delete(Path path)`: Elimina un file o una directory.

---

### 3. **ByteBuffer**

- **Descrizione**: Classe che rappresenta un buffer di byte, che può essere usato per leggere e scrivere dati binari.
- **Principali Metodi**:
  - `put(byte b)`: Inserisce un byte nel buffer.
  - `get()`: Legge un byte dal buffer.
  - `flip()`: Imposta il buffer per la lettura dopo la scrittura.
  - `clear()`: Reimposta il buffer per una nuova scrittura.

---

### 4. **StandardOpenOption**

- **Descrizione**: Enum che rappresenta le opzioni di apertura per operazioni di I/O su file (es. lettura, scrittura, creazione).
- **Principali Valori**:
  - `READ`: Apre il file per lettura.
  - `WRITE`: Apre il file per scrittura.
  - `CREATE`: Crea un nuovo file se non esiste.

---

### 5. **Channel** e **FileChannel**

- **Descrizione**: `Channel` rappresenta un canale di input/output. `FileChannel` è un canale per leggere e scrivere dati da/a file.
- **Principali Metodi**:
  - `read(ByteBuffer dst)`: Legge dati in un buffer.
  - `write(ByteBuffer src)`: Scrive dati da un buffer.
  - `position(long newPosition)`: Imposta la posizione del canale.
  - `close()`: Chiude il canale.

---

### 6. **AsynchronousFileChannel**

- **Descrizione**: Fornisce operazioni I/O asincrone su file, consentendo letture e scritture non bloccanti.
- **Principali Metodi**:
  - `read(ByteBuffer dst, long position)`: Legge dati asincronamente.
  - `write(ByteBuffer src, long position)`: Scrive dati asincronamente.
  - `close()`: Chiude il canale.

---

### 7. **Selector**

- **Descrizione**: Multiplexer per gestire più canali non bloccanti, usato per le operazioni asincrone di rete.
- **Principali Metodi**:
  - `open()`: Crea un selettore.
  - `select()`: Attende fino a quando almeno un canale è pronto.
  - `selectedKeys()`: Restituisce un set di chiavi selezionate.

---

### 8. **SocketChannel** e **ServerSocketChannel**

- **Descrizione**: `SocketChannel` rappresenta un canale di rete per connessioni TCP, `ServerSocketChannel` rappresenta un canale server per accettare connessioni TCP.
- **Principali Metodi**:
  - `open()`: Apre un nuovo canale socket.
  - `connect(SocketAddress remote)`: Si connette a un endpoint remoto.
  - `accept()`: Accetta una connessione in ingresso (ServerSocketChannel).
  - `read(ByteBuffer dst)`: Legge dati dal canale socket.
  - `write(ByteBuffer src)`: Scrive dati sul canale socket.

---

### 9. **MappedByteBuffer**

- **Descrizione**: Estensione di `ByteBuffer` che rappresenta una mappatura diretta di un file in memoria, consentendo un accesso estremamente veloce.
- **Principali Metodi**:
  - `load()`: Carica il contenuto del buffer in memoria.
  - `isLoaded()`: Verifica se il contenuto del buffer è in memoria.
  - `force()`: Scrive eventuali modifiche sul disco.

---

### 10. **Charsets**

- **Descrizione**: Contiene costanti e metodi di utilità per la gestione dei set di caratteri.
- **Principali Costanti**:
  - `UTF_8`: Charset per UTF-8.
  - `ISO_8859_1`: Charset per ISO 8859-1.

---

I package `java.io` e `java.nio` sono essenziali per la gestione dei dati in Java, ciascuno con i suoi punti di forza: `java.io` per operazioni di I/O tradizionali e `java.nio` per un approccio più performante, utile
