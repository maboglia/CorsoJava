package interfacce;

public class Libro implements Comparable<Libro> {

	private int id;
	private String titolo;
	private double prezzo;
	private int pagine;
	
	public Libro() {
		// TODO Auto-generated constructor stub
	}

	public Libro(int id, String titolo, double prezzo, int pagine) {
		this.id = id;
		this.titolo = titolo;
		this.prezzo = prezzo;
		this.pagine = pagine;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public int getPagine() {
		return pagine;
	}

	public void setPagine(int pagine) {
		this.pagine = pagine;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", titolo=" + titolo + ", prezzo=" + prezzo + ", pagine=" + pagine + "]";
	}

	@Override
	public int compareTo(Libro altro) {
		
		return this.titolo.compareTo(altro.titolo);
	}
	
	
	
	
}
