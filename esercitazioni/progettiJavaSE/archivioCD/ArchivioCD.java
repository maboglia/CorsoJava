package progetti.archivioCD;

import java.util.Vector;

public class ArchivioCD {

	private final static String MESSAGGIO_TITOLO = "Inserisci il titolo del CD";
	private final static String MESSAGGIO_AUTORE = "Inserisci l'autore del CD";
	private final static String MESSAGGIO_ARCHIVIO_VUOTO = "Non cè nessun CD!";
	private final static String INTESTAZIONE = " %n CD n° %d DELLA COLLEZIONE  ";
	
	private Vector<CD> listaCD;
	/**
	 * costruttore dell'archivio
	 */
	public ArchivioCD(){
		listaCD = new Vector<>();
	}
	
	
	public void inserisciNuovoCD(){
		
		//leggere l'input da tastiera (titolo)
		String titolo = MioScanner.leggiStringaNonVuota(MESSAGGIO_TITOLO);
		
		//controllare che non sia già presente
		
		//leggere l'input da tastiera (autore)
		String autore = MioScanner.leggiStringaNonVuota(MESSAGGIO_AUTORE);
		
		// CD disco invocare il costruttore di CD
		CD disco = new CD(titolo, autore);
		
		//aggiungi il disco al Vector di dischi
		listaCD.add(disco);
		
	}
	
	
	public String toString(){
		
		if (listaCD.size() == 0)
			return MESSAGGIO_ARCHIVIO_VUOTO; // non contiene nulla
			else{
				StringBuffer result = new StringBuffer();
				for (int i = 0; i < listaCD.size(); i++){
					result.append(String.format(INTESTAZIONE, i + 1));
					CD currCD = listaCD.get(i);
					result.append(currCD.toString());
				}
				return result.toString();
			}
			/**/		
		
		
		
	}
	
	
}
