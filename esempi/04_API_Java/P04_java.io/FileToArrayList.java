package laboratorio;

import java.io.BufferedReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FileToArrayList {

	public static void main(String[] args) {

		//creo un oggetto path col percorso al file
		Path fileDivina = Paths.get("files","divina.txt");
		//System.out.println(fileDivina.getFileName());
		

		List<String> righe = new ArrayList<>();
		Set<String> paroleEsclusive = new TreeSet<String>();


		
		try(BufferedReader buffer = Files.newBufferedReader(fileDivina, Charset.forName("Cp1252"))){
			String s = "";
			while (  (s = buffer.readLine())  != null ) {
				//System.out.println(s);
				righe.add(s);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
		//scorro l'array righe
		for (String string : righe) {
			//2 , per ogni rigacon slit mi facio ritornare un array di parole
			String[] paroleRiga = string.split(" ");

			//3 scorro l'array di parole e provo ad inserirle nel treeset di parole
			for (String string2 : paroleRiga) {
				if (string2.length() > 3)
				paroleEsclusive.add(string2);
			}
			
			//System.out.println(string);
			
		}
	
		//1 canto inferno
		System.out.println("il primo canto dell'inferno contiene " + paroleEsclusive.size() +  " parole esclusive");
		System.out.println("eccole:");
		for (String string : paroleEsclusive) {
			System.out.println(string);
		}
	}

}
