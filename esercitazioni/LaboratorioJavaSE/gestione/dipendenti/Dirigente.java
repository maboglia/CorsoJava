package gestione.dipendenti;

public class Dirigente extends Dipendente {

	private double emolumento = 100.51;
	
	public Dirigente(String nome) {
		super(nome);
		System.out.println("sono i costruttore del dirigente");
	}

	@Override
	double calcolaStipendio(int i, int giorniMese) {

		return ((PAGA_BASE + emolumento) * i) * giorniMese * 1.1;
	}

}
