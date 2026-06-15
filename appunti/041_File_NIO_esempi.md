# NIO 2.0
Il package `java.nio` in Java fornisce un'ampia gamma di classi e API per l'I/O non bloccante (non-blocking I/O), la gestione dei file e altro ancora. In particolare, il sottopackage `java.nio.file` introduce un modello di I/O più flessibile e potente rispetto alle vecchie classi nel package `java.io`. Ecco un'introduzione alla lettura e scrittura di file utilizzando `java.nio.file`:
---


### Lettura di File

Per leggere un file utilizzando `java.nio.file`, puoi seguire i seguenti passaggi:

---

1. **Creazione di un Oggetto `Path`:**

   ```java
   import java.nio.file.Path;
   import java.nio.file.Paths;
   
   Path percorsoFile = Paths.get("percorso/assoluto/o/relativo/del/file.txt");
   ```

---

2. **Lettura di Tutte le Linee del File:**

   ```java
   import java.nio.file.Files;
   import java.util.List;
   
   try {
       List<String> linee = Files.readAllLines(percorsoFile);
       for (String linea : linee) {
           System.out.println(linea);
       }
   } catch (IOException e) {
       e.printStackTrace();
   }
   ```

---

3. **Lettura di Contenuto in un Stream:**

   ```java
   try {
       Stream<String> linee = Files.lines(percorsoFile);
       linee.forEach(System.out::println);
   } catch (IOException e) {
       e.printStackTrace();
   }
   ```

---

### Scrittura su File

Per scrivere su un file utilizzando `java.nio.file`, segui questi passaggi:

---

1. **Creazione di un Oggetto `Path`:**

   ```java
   import java.nio.file.Path;
   import java.nio.file.Paths;
   
   Path percorsoFile = Paths.get("percorso/assoluto/o/relativo/del/file.txt");
   ```

---

2. **Scrittura di Linee su un File:**

   ```java
   import java.nio.file.Files;
   import java.util.List;
   import java.util.Arrays;

   List<String> lineeDaScrivere = Arrays.asList("Linea 1", "Linea 2", "Linea 3");

   try {
       Files.write(percorsoFile, lineeDaScrivere);
   } catch (IOException e) {
       e.printStackTrace();
   }
   ```

---

3. **Aggiunta di Linee a un File Esistente:**

   ```java
   import java.nio.file.StandardOpenOption;

   List<String> lineeDaAggiungere = Arrays.asList("Nuova Linea 1", "Nuova Linea 2");

   try {
       Files.write(percorsoFile, lineeDaAggiungere, StandardOpenOption.APPEND);
   } catch (IOException e) {
       e.printStackTrace();
   }
   ```

---

### Alcune Caratteristiche Importanti

- **Gestione delle Eccezioni:** È importante gestire le eccezioni quando si lavora con operazioni di file I/O.

- **Chiusura Automatica di Risorse (`try-with-resources`):** Per evitare la gestione manuale della chiusura di risorse come gli stream, è possibile utilizzare la struttura `try-with-resources` introdotta in Java 7.

- **Codifica del Testo:** Quando si leggono o scrivono file di testo, è possibile specificare la codifica utilizzando il parametro `Charset` nelle chiamate di `read` e `write`.

```java
import java.nio.charset.StandardCharsets;

List<String> linee = Files.readAllLines(percorsoFile, StandardCharsets.UTF_8);
```

---

### Conclusione

L'utilizzo di `java.nio.file` fornisce una maggiore flessibilità e controllo rispetto alle API di I/O più vecchie. Consentendo la gestione non bloccante e offrendo un set completo di funzionalità, questa è la scelta preferita quando si lavora con le operazioni di lettura e scrittura di file in Java

---

## Novità principali del package

* introduzione della classe *Files*, 
- introduzione dell'interfaccia (e sue implementazioni) *Path*,

forniscono metodi più semplici ed efficienti per l'utilizzo di operazioni legate ai file. 

* java.io.File è ancora disponibile, 
* nuovo _meccanismo_ che ha al centro le nuove classi java.nio.Path e java.nio.Files. 

---

## Interfaccia Path

L'interfaccia `Path` in Java è parte del package `java.nio.file` e rappresenta un percorso di sistema di file o directory. Essa fornisce un'astrazione del sistema operativo indipendente per rappresentare percorsi nei file system.

Ecco alcune delle principali funzionalità offerte dall'interfaccia `Path`:

---

### 1. Creazione di Oggetti `Path`

Puoi creare oggetti `Path` in diversi modi, ad esempio utilizzando il metodo statico `Paths.get()`:

```java
import java.nio.file.Path;
import java.nio.file.Paths;

Path percorso1 = Paths.get("path/relativo/o/assoluto");
Path percorso2 = Paths.get("/percorso/assoluto");
```

---

### 2. Ottenere Componenti del Percorso

Puoi ottenere varie informazioni sul percorso attraverso i metodi dell'interfaccia `Path`:

```java
Path percorso = Paths.get("/percorso/assoluto/file.txt");

// Ottenere il nome del file o della directory
Path nomeFile = percorso.getFileName();  // Restituirà "file.txt"

// Ottenere il percorso del genitore
Path percorsoGenitore = percorso.getParent();  // Restituirà "/percorso/assoluto"
```

---

### 3. Risolvere Percorsi

Puoi risolvere percorsi in modo relativo o assoluto:

```java
Path percorsoBase = Paths.get("/base");
Path percorsoRelativo = Paths.get("relative/file.txt");

// Risolvere un percorso relativo rispetto a un percorso di base
Path percorsoCompleto = percorsoBase.resolve(percorsoRelativo);  // Restituirà "/base/relative/file.txt"
```

---

### 4. Normalizzare Percorsi

Puoi normalizzare percorsi rimuovendo i riferimenti "." e "..":

```java
Path percorsoNonNormalizzato = Paths.get("/base/./relative/../../file.txt");
Path percorsoNormalizzato = percorsoNonNormalizzato.normalize();  // Restituirà "/file.txt"
```

---

### 5. Ottenere Informazioni sul Percorso

Puoi ottenere informazioni sul percorso, ad esempio verificare se è assoluto o relativo:

```java
Path percorsoAssoluto = Paths.get("/percorso/assoluto");
boolean isAssoluto = percorsoAssoluto.isAbsolute();  // Restituirà true

Path percorsoRelativo = Paths.get("relative/path");
boolean isRelativo = percorsoRelativo.isAbsolute();  // Restituirà false
```

---

### 6. Ottenere Componenti del Percorso

Puoi ottenere i componenti del percorso, come i singoli elementi di directory:

```java
Path percorso = Paths.get("/percorso/assoluto/directory/file.txt");

// Ottenere il nome della radice
Path radice = percorso.getRoot();  // Restituirà "/"

// Ottenere gli elementi di directory
for (Path elemento : percorso) {
    System.out.println(elemento);
}
// Output:
// percorso
// assoluto
// directory
// file.txt
```

---

### 7. Confronto di Percorsi

Puoi confrontare percorsi per determinare l'ordine:

```java
Path percorso1 = Paths.get("/percorso1");
Path percorso2 = Paths.get("/percorso2");

int confronto = percorso1.compareTo(percorso2);
// Restituirà un valore negativo se percorso1 è precedente a percorso2,
// un valore positivo se percorso1 è successivo a percorso2,
// e zero se i percorsi sono uguali.
```

Questi sono solo alcuni degli utilizzi comuni dell'interfaccia `Path` in Java. Fornisce un'interfaccia potente per manipolare e interagire con i percorsi dei file nei file system.

---

* Un oggetto di tipo Path rappresenta un percorso che punta a un file o una directory, 
* è legato al sistema operativo nel quale abbiamo avviato il programma 
* ottenuto un oggetto Path è possibile utilizzare una serie di metodi
  * una rappresentazione stringa dell’oggetto Path (toString)
  * il nome del file (getFileName)
  * il nome di un elemento del path (getName)
  * il numero di elementi del path (getNameCount)
  * una sottostringa del path (subpath)
  * il percorso del genitore del file indicato (getParent)
  * la radice del path (getRoot)

---

```java
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.lang.System.out;

public class PathDemo {
	public static void main(String[] args) {
		// Creazione path per puntare a un file
		Path path = Paths.get("C:\\MY_JAVA_SOURCES\\Test.java");

		// Informazioni sul path
		out.format("toString: %s%n", path.toString());
		out.format("getFileName: %s%n", path.getFileName());
		out.format("getName(0): %s%n", path.getName(0));
		out.format("getNameCount: %s%n", path.getNameCount());
		out.format("subpath(1,2): %s%n", path.subpath(1,2));
		out.format("getParent: %s%n", path.getParent());
		out.format("getRoot: %s%n", path.getRoot());
	}
}
```

---

## Classe Files

La classe `Files` fa parte del package `java.nio.file` in Java e fornisce metodi statici per eseguire operazioni di I/O su file e directory. Questa classe semplifica molte operazioni comuni, fornendo un'API più semplice rispetto all'utilizzo di `InputStream`, `OutputStream`, `Reader` e `Writer` direttamente. Ecco alcune delle principali funzionalità offerte dalla classe `Files`:

### 1. Lettura di Contenuto da un File

```java
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.charset.StandardCharsets;
import java.io.IOException;
import java.util.List;

Path percorsoFile = Paths.get("/percorso/del/file.txt");

try {
    List<String> linee = Files.readAllLines(percorsoFile, StandardCharsets.UTF_8);
    for (String linea : linee) {
        System.out.println(linea);
    }
} catch (IOException e) {
    e.printStackTrace();
}
```

### 2. Scrittura di Contenuto su un File

```java
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.charset.StandardCharsets;
import java.io.IOException;
import java.util.List;
import java.util.Arrays;

Path percorsoFile = Paths.get("/percorso/del/file.txt");

List<String> lineeDaScrivere = Arrays.asList("Linea 1", "Linea 2", "Linea 3");

try {
    Files.write(percorsoFile, lineeDaScrivere, StandardCharsets.UTF_8);
} catch (IOException e) {
    e.printStackTrace();
}
```

### 3. Copia di un File

```java
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.io.IOException;

Path percorsoOrigine = Paths.get("/percorso/del/file_originale.txt");
Path percorsoDestinazione = Paths.get("/percorso/del/file_copia.txt");

try {
    Files.copy(percorsoOrigine, percorsoDestinazione, StandardCopyOption.REPLACE_EXISTING);
} catch (IOException e) {
    e.printStackTrace();
}
```

### 4. Spostamento/Rinomina di un File

```java
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.io.IOException;

Path percorsoOriginale = Paths.get("/percorso/del/file_originale.txt");
Path percorsoNuovo = Paths.get("/percorso/del/file_nuovo.txt");

try {
    Files.move(percorsoOriginale, percorsoNuovo, StandardCopyOption.REPLACE_EXISTING);
} catch (IOException e) {
    e.printStackTrace();
}
```

### 5. Eliminazione di un File o Directory

```java
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

Path percorsoDaEliminare = Paths.get("/percorso/da/eliminare");

try {
    Files.delete(percorsoDaEliminare);
} catch (IOException e) {
    e.printStackTrace();
}
```

### 6. Verifica dell'Esistenza e del Tipo di un File

```java
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

Path percorsoFile = Paths.get("/percorso/del/file.txt");

boolean esiste = Files.exists(percorsoFile);
boolean isFile = Files.isRegularFile(percorsoFile);
boolean isDirectory = Files.isDirectory(percorsoFile);

System.out.println("Esiste: " + esiste);
System.out.println("È un file: " + isFile);
System.out.println("È una directory: " + isDirectory);
```

Questi sono solo alcuni esempi di come la classe `Files` semplifica le operazioni di I/O su file e directory. Offre una sintassi più concisa e intuitiva rispetto a molte delle classi I/O più vecchie di Java, rendendo più facile l'interazione con il sistema di file

---

## Scorrere un file e salvarlo linea per linea in un `ArrayList<String>`

```java

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ReadFileToArrayList {

	public static void main(String[] args) {


		Path sorgente = Paths.get("lorem.txt");
		System.out.println(sorgente.getFileName());
		
		Charset charset = Charset.forName("UTF-8");
		ArrayList<String> righe = new ArrayList<>();
		
		try(BufferedReader br = Files.newBufferedReader(sorgente,charset);){
			
			String riga = null;
			
			while((riga = br.readLine()) != null) {
				System.out.println(riga);
				righe.add(riga);
			}
			
			
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("il file contiene: " + righe.size());
		
		for (String string : righe) {
			System.out.println("\n"+string);
		}
		
	}

}

```


## Scorrere una List di String e scrivere linea per linea in un file

```java
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class WriteArrayListToFILE {

	public static void main(String[] args) {
		String[] note = {"Do", "re", "mi", "fa","sol", "la","si"};
		List<String> noteList = Arrays.asList(note);
		Charset charset = Charset.forName("utf-8");
		
		try (BufferedWriter bw = Files.newBufferedWriter(Paths.get("note.txt"),charset)){
			
			Iterator<String> it = noteList.iterator();
			
			while (it.hasNext()) {
				String string =  it.next();
				bw.append(string);
				bw.newLine();
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	System.out.println("OK!!");
	}
}
```
