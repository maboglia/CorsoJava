# NIO 2.0

La differenza sostanziale tra le API classiche (package java.io) e le nuove API (java.nio) sta nel fatto che:

* le prime lavorano con *stream* di byte e stream di caratteri
* le seconde lavorano principalmente con *buffer, channel e selector*
  *  I **buffer** sono contenitori di dati da passare in input o ricevere in output.  
  *  I **channel** sono connessioni a entità/dispositivi di vario tipo capaci di eseguire operazioni di input/output.
  *  I **selector** sono dei selettori che, insieme ai channel, permettono di definire operazioni multiplex e non bloccanti.

---

## Novità principali

* introduzione della classe *Files*, 
* dell'interfaccia (e sue implementazioni) *Path*, 
* forniscono metodi più semplici ed efficienti per l'utilizzo di operazioni legate ai file. 
* java.io.File è ancora disponibile, 
* nuovo _meccanismo_ che ha al centro le nuove classi java.nio.Path e java.nio.Files. 

---

## Interfaccia Path

Per ottenere un'istanza di Path, occorre utilizzare l'oggetto `FileSystem` o più semplicemente l'oggetto `Paths`. 

```java
Path path1 = Filesystems.getDefault().getPath("/root/aFile.txt");
Path path2 = Paths.get("C:\\Program Files\\Notepadpp");
```

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

* serve per compiere svariate operazioni sui file e sulle directory, 
  * lettura, 
  * scrittura, 
  * spostamento, 
  * ecc. 

* `Files.exists(path)`
* `Files.isSameFile(other_path, link_path);`
* `Files.delete(Paths.get("path_to"));`
* `Files.move(copy_path, path, ATOMIC_MOVE, REPLACE_EXISTING);`

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
