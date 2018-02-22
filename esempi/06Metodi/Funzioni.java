package esempi.week11;

public class Funzioni {

	public static void main (String[] args){

		//metodo di classe
		salutaStatico();
		
		Funzioni miafunc = new Funzioni();
		//metodo che appartiene agli oggetti di tipo Funzioni
		miafunc.saluta();
		String temp = miafunc.salutaPlus("ciao");
		System.out.println(temp);
		System.out.println(temp);
		
	}	
	
	public void saluta(){
		
		System.out.println("ciao");
	}
	
	public String salutaPlus(String messaggio){
		
		System.out.println("ciao" +  messaggio);
		return "fino a qui tutto bene!";
	}
	
	public static void salutaStatico(){
		System.out.println("ciao");
		
	}
	
	
}
