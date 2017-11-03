package progetti.dipendenti.v1;

public class Impiegato extends Lavoratore {

	double premioRisultato = 0.10;
	
	public Impiegato(String n, String c){
		
		super(n, c);
		System.out.println("ho costruito un oggetto di tipo Impiegato, sotto-tipo di Lavoratore");
		
	}

	/* (non-Javadoc)
	 * @see progetti.dipendenti.v1.Lavoratore#calcolaStipendio(int)
	 */
	@Override
	public double calcolaStipendio(int numeroOre) {
		
		//2200
		double stipendioImpiegato = 
				super.calcolaStipendio(numeroOre) +
				(super.calcolaStipendio(numeroOre) * premioRisultato);
		//2420
		
		//operatore
		stipendioImpiegato = (numeroOre > 90) ? (stipendioImpiegato += premioRisultato): stipendioImpiegato;
				
		
		return stipendioImpiegato;
	}
	
	
	
	
}
