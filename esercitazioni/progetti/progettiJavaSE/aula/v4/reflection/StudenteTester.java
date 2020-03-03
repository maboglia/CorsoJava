package progetti.aula.v4.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class StudenteTester {

	public static void main(String[] args) {

		Registro registro = new Registro();
		Studente s1 = new Studente();
		
		
		for(Studente s : registro.elenco){
			System.out.println(s);
		}
//		
//		for (Studente stud : registro.elenco) {
//			System.out.println(   stud.getCognome() + " " + stud.getNome()   );
//		}
//		

	Class<?> c = registro.getClass();
	System.out.println(c);
	System.out.println(c.getName());
	System.out.println(c.getSimpleName());
	
	Constructor<?>[] costruttori = c.getConstructors();
	System.out.println("ci sono: " + costruttori.length + " costruttori");
	
	Class<?> s = s1.getClass();
	System.out.println(s);
	System.out.println(s.getName());
	System.out.println(s.getSimpleName());
	
	Constructor<?>[] costruttoriS = s.getConstructors();
	System.out.println("ci sono: " + costruttoriS.length + " costruttori");
	
	Constructor<?> con = costruttoriS[1];
	
	Object obj = null;
	
	
	try {
		obj=con.newInstance("mauro", "bogliaccino", 'M');
		System.out.println(obj);
	} catch (Exception e) {
		//e.printStackTrace();
		System.out.println(e.getMessage());
	} 
	
	
	
	
	
	}

}
