package week6.giorno1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class NuovoFileCopia {

	public static void main(String[] args) {
		
		Path sorgente = Paths.get("mieiFile", "amore.txt");
		Path destinazione = Paths.get("mieiFile", "copiaAmore.txt");
		
		try {
			Files.copy(sorgente, destinazione, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("fino qui tutto bene");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
