package negozio1;

public interface Cassa {

	//questo attributo è automaticamente public, static, final: perciò non devo dichiararlo
	double IVA = 0.22;
	
	void leggi(String codice, int pezzi) throws ProdottoInesistente;
	double totale();
	double netto();
	double tasse();
	void stampa();
	void chiude();
	
	
	
}
