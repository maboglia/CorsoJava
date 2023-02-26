package interfacce;

public class Implementazione implements Contratto, Regole{

	@Override
	public String deviFarlo() {
		// TODO Auto-generated method stub
		return REGOLA1;
	}

	@Override
	public String questoAncoraPrima() {
		// TODO Auto-generated method stub
		return REGOLA2;
	}

	public static void main(String[] args) {
		ContrattoBase cb = () -> "funzione che funziona!";
		
	}
		
	
}
