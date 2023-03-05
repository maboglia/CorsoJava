package letturascrittura;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ScriviParoleDi5Lettere {

	public static void main(String[] args) {
		
		File source = new File("1000_parole_italiane_comuni.txt");
		File destin = new File("paroleda5.txt");
		
		
		try {
			Scanner sc = new Scanner(source);
			PrintWriter pw = new PrintWriter(destin);
			int i = 0;
			
			while (sc.hasNextLine()) {
				String parola = sc.nextLine();
				
				
				if (parola.length() == 5) {
					i++;
					System.out.println(parola);
					pw.println("\"" + parola +"\",");
					
				}
				
			}
			pw.close();
			System.out.println("le parole di 5 lettere sono " + i);
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}
	
	
}
