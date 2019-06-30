# NIO 2

## Scorrere un file e salvarlo linea per linea in un ArrayList<String>

```java
package com.maboglia.nio;

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
