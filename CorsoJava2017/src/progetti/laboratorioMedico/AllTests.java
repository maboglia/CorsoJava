package progetti.laboratorioMedico;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {
	
	
	public static Test suite(){
		
		TestSuite suite = new TestSuite("Tutti i test disponibili");
		suite.addTest(new TestSuite(Test_Pazienti.class));

		return suite;
	}
	
}
