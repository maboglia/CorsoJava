public class PersoneTest{
	
	public static void main(String[] args){
		Persone p1 = new Persone(2);
		p1.setNome("Mario",0);
		p1.setCognome("Rossi",0);
		p1.setNome("Luigi",1);
		p1.setCognome("Bianchi",1);
		Persone p2 = (Persone)p1.clone();
		System.out.println("--- Contenuto di p1 ---");
		for(int i = 0; i < p1.getSize(); i++){
			System.out.println(p1.getNome(i)+" "+p1.getCognome(i));
		}
		System.out.println("--- Contenuto di p2 ---");
		for(int i = 0; i < p2.getSize(); i++){
			System.out.println(p2.getNome(i)+" "+p2.getCognome(i));
		}
		System.out.println();
		System.out.println("Cambio p2...");
		System.out.println();
		p2.setNome("Enzo",0);
		p2.setCognome("Grigi",0);
		p2.setNome("Antonio",1);
		p2.setCognome("Verdi",1);
		System.out.println("--- Contenuto di p1 ---");
		for(int i=0; i<p1.getSize(); i++){
			System.out.println(p1.getNome(i)+" "+p1.getCognome(i));
		}
		System.out.println("--- Contenuto di p2 ---");
		for(int i=0; i<p2.getSize(); i++){
			System.out.println(p2.getNome(i)+" "+p2.getCognome(i));
		}					
	}
}
