/**
 * 
 */
package model;

/**
 * @author Mauro
 *
 */
public class Studente {
	
 private String nome;
 private String cognome;
 private int anno;
 private int numMatricola;
 private boolean presente;
 static int cont=0;
/**
 * @param nome
 * @param cognome
 * @param anno
 * @param numMatricola
 * @param presente
 */
public Studente(String nome, String cognome, int anno) {
	this.nome = nome;
	this.cognome = cognome;
	this.anno = anno;
	this.presente = true;
	this.numMatricola = ++cont;
}
/**
 * @return the nome
 */
public String getNome() {
	return nome;
}
/**
 * @return the cognome
 */
public String getCognome() {
	return cognome;
}
/**
 * @return the anno
 */
public int getAnno() {
	return anno;
}
/**
 * @return the numMatricola
 */
public int getNumMatricola() {
	return numMatricola;
}

public void setAssente() {
	this.presente = false;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	StringBuilder s= new StringBuilder();
	s.append(numMatricola);
	s.append("\t\t");
	s.append(nome);
	s.append("\t\t");
	s.append(cognome);
	s.append("\t\t");
	s.append(anno);
	s.append("\t\t");
	s.append(presente ? "" : "Assente");
	
	return s.toString();
}

}
