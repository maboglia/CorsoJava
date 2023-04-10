package file;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LeggiCSV {

	public static void main(String[] args) {
		try {
			List<String> readAllLines = Files.readAllLines(Paths.get("files/report.csv"));
			
			PrintWriter pw = new PrintWriter("files/intestazioni.txt");
			
			for (String riga : readAllLines) {
				String[] split = riga.split(",");
				
				System.out.println(split.length);
				if (split.length==191) {
					int i = 0;
					for (String string : split) {
						pw.print(i++);
						pw.println(": " + string);
					}
					pw.close();
				}
				
				if (split.length==53) {
					for (String string : split) {
						System.out.println(string);
					}
				}
				if (split.length==79) {
					
				}
				if (split.length==103) {
					
				}
				if (split.length==156) {
					
				}
				
				
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
