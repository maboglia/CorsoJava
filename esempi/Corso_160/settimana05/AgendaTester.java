package settimana05;

public class AgendaTester {

	public static void main(String[] args) {
		
		//creo un'istanza di agenda
		Agenda agenda1 = new Agenda();
		
		//agenda1.appuntamenti1[2] = new Appuntamento("Test di Java");
		agenda1.appuntamenti2.add(new Appuntamento("Test di Java"));
		
//		//chiamo su agenda l'array di appuntamenti
//		for (Appuntamento a1 : agenda1.getAppuntamenti1()) {
//			System.out.println(a1);
//		}
		System.out.println("---------------");
		//chiamo su agenda l'arraylist di appuntamenti
		for (Appuntamento a2 : agenda1.getAppuntamenti2()) {
			System.out.println(a2);
		}
		
		
//		System.out.println(agenda1);
	}

}
