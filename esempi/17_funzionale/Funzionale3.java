package funzionale;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Funzionale3 {

	public static void main(String[] args) {

		try {
			
			Path sorgente =  Paths.get("files","primipiatti.txt");
			Path destinazione =  Paths.get("copia","primipiatti.txt");
			
			Charset setChar = Charset.forName("Cp1252");
			Stream<String> lines = Files.lines(sorgente, setChar);
			lines.filter(p -> p.startsWith("M")).forEach(System.out::println);
			
			Files.copy(sorgente, destinazione);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
