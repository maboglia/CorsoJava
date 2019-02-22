package gestione.dipendenti;

public class Impiegato extends Dipendente {
	
	double premioProduzione = 10.00;


	public Impiegato(String nome) {
		super(nome);
		System.out.println("sono il costruttore dell'impiegato");
	}

	@Override
	double calcolaStipendio(int oreLavorate, int giorniLavorati) {
		return ((PAGA_BASE + premioProduzione) * oreLavorate) * giorniLavorati;

	}


}
