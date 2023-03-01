public interface Cassa {
	
	// Il seguente attributo e' pubblic, static e final
	double IVA = 0.2; 
	
	
	// I seguenti metodi sono public e abstract	
	void leggi(String codice, int pezzi) throws ProdottoInesistente;
	void stampa();
	void chiude();
	double totale();
	double netto();
	double tasse();
}
