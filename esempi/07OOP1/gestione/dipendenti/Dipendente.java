package gestione.dipendenti;

import java.time.LocalDate;

import gestione.etichette.Etichette;

public abstract class Dipendente implements Etichette {
	
	private String nome;
	private LocalDate dataAssunzione;
	
	public Dipendente(String nome) {
		this.nome = nome;
		System.out.println("sono il costruttore del Dipendente");
	}
	
	public void setNome(String nome) {
		if (nome.length() > 2)
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	abstract double calcolaStipendio(int i, int giorniMese);
	
}
