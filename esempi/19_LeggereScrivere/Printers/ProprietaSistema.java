package letturascrittura;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Properties;

public class ProprietaSistema {

	public static void main(String[] args) {

		Properties proprieta = System.getProperties();
		
		try {
			PrintStream ps = new PrintStream(new File("proprieta.txt"));
		
		
			proprieta.list(ps);
		
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
