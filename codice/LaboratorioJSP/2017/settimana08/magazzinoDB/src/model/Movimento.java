package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Movimento {

	private Prodotto p;
	private int quantita;
	private LocalDate data;
	
	DateTimeFormatter dtf ;
	
	public Movimento(Prodotto p, int quantita, LocalDate data) {
		this.p = p;
		this.quantita = quantita;
		this.data = data;
	}

	public LocalDate getData() {
		return data;
	}
	
	public String getDataFormattata() {
		dtf = DateTimeFormatter.BASIC_ISO_DATE;
		System.out.println(dtf);
		return dtf.format(data);
	}
	
	public Prodotto getP() {
		return p;
	}
	
	public int getQuantita() {
		return quantita;
	}
}
