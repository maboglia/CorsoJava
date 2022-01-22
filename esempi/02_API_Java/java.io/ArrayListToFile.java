package laboratorio;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class ArrayListToFile {

	public static void main(String[] args) {
		String[] note = {"do", "re", "mi", "fa", "so", "la", "si"};

		List<String> listaNote = Arrays.asList(note);
		
		Charset cs = Charset.forName("utf-8");
		
		try(BufferedWriter buffer = Files.newBufferedWriter(Paths.get("files/note.txt"), cs)){
			
			for (String string : listaNote) {
				System.out.println(string);
				buffer.append(string);
				buffer.newLine();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
	}

}
