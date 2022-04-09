package collezioni.set;

import java.util.HashSet;
import java.util.TreeSet;

class Libro implements Comparable<Libro> {
	String titolo;
	double prezzo;
	
	public Libro(String titolo, double prezzo) {
		this.titolo = titolo;
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		return "Libro [titolo=" + titolo + ", prezzo=" + prezzo + "]";
	}

	@Override
	public int compareTo(Libro altro) {
		// TODO Auto-generated method stub
		return this.titolo.compareTo(altro.titolo);
	}
	
	
}

public class ProvaSetLibro {

	public static void main(String[] args) {
		Libro l = new Libro("Io, robot", 12.5);
		Libro l2 = new Libro("I promessi sposi", 15.5);

		TreeSet<Libro> libri = new TreeSet<Libro>();
		libri.add(l);
		libri.add(l2);
		libri.add(l);
		
		for (Libro libro : libri) {
			System.out.println(libro);
		}
		
	}

}
