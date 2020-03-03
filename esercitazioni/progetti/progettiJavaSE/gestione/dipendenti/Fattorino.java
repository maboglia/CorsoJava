package gestione.dipendenti;

public class Fattorino extends Dipendente {

	public Fattorino(String nome) {
		super(nome);
		System.out.println("sono i costruttore del fattorino");
	}

	@Override
	double calcolaStipendio(int i, int giorniMese) {
		// TODO Auto-generated method stub
		return (PAGA_BASE * i) * giorniMese;
	}

}
