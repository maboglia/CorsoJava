import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Vector;

public class LeggiFile {

	public static void main(String[] args) {

		FileReader divina;
		try {
			divina = new FileReader("divina_commedia.txt");
			BufferedReader buffer = new BufferedReader(divina);
			Scanner file_input = new Scanner(buffer);
			Vector<String> vect = new Vector<>();
			HashSet<String> set = new HashSet<>();
			TreeSet<String> tset = new TreeSet<>();
			
			long start = System.currentTimeMillis();
			
			while (file_input.hasNext()) {

					String s = file_input.next();
					//System.out.println(s);
//					if (!vect.contains(s))
					vect.add(s);
					tset.add(s);
			}

			long stop = System.currentTimeMillis();
			
			System.out.println(stop-start);
			System.out.println("ci sono " + vect.size() + " parole");
			System.out.println("ci sono " + tset.size() + " parole diverse");
			
//			long start = System.currentTimeMillis();
//			
//			while (file_input.hasNext()) {
//				
//				String s = file_input.next();
//				//System.out.println(s);
//					set.add(s);
//			}
//			
//			long stop = System.currentTimeMillis();
//			
//			System.out.println(stop-start);
//			System.out.println("ci sono " + set.size() + " parole");
//			
			for (String string : tset) {
				System.out.println(string);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
