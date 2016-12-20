package progetti.laboratorioMedico;

import junit.framework.TestCase;

public class Test_Pazienti extends TestCase {
	
	public Test_Pazienti(String arg){
		super(arg);
		
	}
	
	public void testAggiungi() throws ErrPersonaInesistente{
		
		Laboratorio lab = new Laboratorio();
		String cf = "12345";
		String nome = "Boglia";
		String cognome = "Boglia";
		lab.aggiungiPersona(nome, cognome, cf);
		Persona p = lab.getPersona(cf);
		
		assertEquals(nome, p.getNome());
		assertEquals(cognome, p.getCognome());
		
	}

}
