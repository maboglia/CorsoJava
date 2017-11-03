package esempi.week11;

public class MiaClasse {

	public int mioNumero;
	Integer mioNum2 = 14;

	//convenzione di naming: si chiama come la classe, perciò inizia con lettera maiuscala, diversamente dagli altri metodi
	//inoltre, non ha tipo di ritorno: la sua funzione è costruire l'oggetto
	
	public MiaClasse(){
		 mioNumero = 1;
	}
	
	public void mioMetodo(){
		System.out.println("ciao");
	}
	
	public void stampaInfo(){
		System.out.println("stampa info ad hoc sull'oggetto");
	}
	


	
	/** (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "esemplare di mia classe: " + getClass().getName();
	}

	public static void main(String[] args) {
		MiaClasse mc = new MiaClasse();
		System.out.println(mc);
		MiaClasse mc2 = mc;
		System.out.println(mc2);
		
		mc = null;
		mc2 = null;
		
		System.out.println(mc);
		System.out.println(mc2);
		
		
	}
	
}
