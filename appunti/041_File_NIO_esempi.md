# NIO 2

## Scorrere un file e salvarlo linea per linea in un ArrayList<String>

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
