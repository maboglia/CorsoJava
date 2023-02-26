package letturascrittura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class LeggiFile {

	public static void main(String[] args) {
		
		File f = new File("divina.txt");
		
		ArrayList<String> parole = new ArrayList<String>();
		TreeSet<String> paroleSingole = new TreeSet<String>();
		
		try {
			Scanner sc = new Scanner(f);
			
			while (sc.hasNextLine()) {
				
				String linea = sc.nextLine();
				
				//System.out.println(linea);
				
				String[] pezzi = linea.split(" ");
				
				for (String parola : pezzi) {
					if (parola.trim().length() > 3  ) {
						parole.add(parola);
						paroleSingole.add(parola);
					}
				}
				
				
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("dante ha usato " + parole.size());
		System.out.println("dante ha usato " + paroleSingole.size());
		
		for (String string : paroleSingole) {
			System.out.println(string);
		}
		
	}

}
