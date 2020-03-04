package progetti.laboratorioMedico;

public class ErrMedicoInesistente extends Exception {
	public ErrMedicoInesistente(){
		super("Medico non in elenco");
	}
	
}
