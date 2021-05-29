public class Persone implements Cloneable{
	
	private int size;
	String[] nomi;
	String[] cognomi;
	
	public Persone(int size){
		this.size = size;
		nomi = new String[size];
		cognomi = new String[size];
	}
	
	public void setNome(String nome, int posizione){
		nomi[posizione] = nome;
	}
	
	public void setCognome(String cognome, int posizione){
		cognomi[posizione] = cognome;
	}
	
	public int getSize(){
		return size;
	}
	
	public String getNome(int posizione){
		return nomi[posizione];
	}
	
	public String getCognome(int posizione){
		return cognomi[posizione];
	}
	
	public Object clone(){
		try{
			// Prima eseguo la copia bit a bit
			Persone clonato = (Persone)super.clone();
			// Adesso eseguo la copia profonda
			clonato.nomi = new String[size];
			clonato.cognomi = new String[size];
			for (int i=0; i<size; i++)
			{
				clonato.nomi[i] = nomi[i];
				clonato.cognomi[i] = cognomi[i];
			}
			// Restituisco l'elaborato
			return clonato;
		} catch(CloneNotSupportedException e){
			return null;
		}
	}	
}