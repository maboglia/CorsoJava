package esempio;

public class FunzionarioTest {

	public static void main(String[] args) {
		Impiegato i = new Impiegato("Mario Verdi");
		System.out.println("Nome: " + i.getNome());
		System.out.println("Stipendio: " + i.getStipendio());
		System.out.println(); // riga vuota
		
		Funzionario f = new Funzionario("Gigi Rossi");
		System.out.println("Nome: " + f.getNome());
		System.out.println("Stipendio: " + f.getStipendio());
	}

}
