package esempi.week9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Vector;

public class ListDivina1 {

	public static void main(String[] args) {

		try {
			Scanner file_input = new Scanner(
					new BufferedReader(
							new FileReader("test_files/inferno_1.txt")
							)
					);
			
			
			Vector<String> vettore = new Vector<>();
			Vector<String> vettore2 = new Vector<>();
			HashSet<String> hashset = new HashSet<>();
			TreeSet<String> treeset = new TreeSet<>();
			
/*	*/		//prima scansione del file
			long startTime = System.currentTimeMillis();
			
			while(file_input.hasNext()){
				String s = file_input.next();
				
				vettore.add(s);
				hashset.add(s);
				treeset.add(s);
			}
			
			long stopTime = System.currentTimeMillis(); 
			
			
			System.out.println("Totale parole "+ vettore.size());
			System.out.println("Totale parole diverse "+ hashset.size());
			System.out.println("Totale parole diverse "+ treeset.size());
			System.out.println("Millisecondi impiegati " + (stopTime - startTime));

			
			
			long startTime2 = System.currentTimeMillis();
			//seconda scansione
			while(file_input.hasNext()){
				String s = file_input.next();
				if (!vettore2.contains(s))
				vettore2.add(s);
				
			}			
			long stopTime2 = System.currentTimeMillis(); 
			
			System.out.println("Totale parole diverse "+ vettore2.size());
			System.out.println("Millisecondi impiegati " + (stopTime2 - startTime2));
			
			for(String str : treeset){
				System.out.println(str);
			}
			
			
			
			file_input.close();
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		
		
		
		
		

	}

}
