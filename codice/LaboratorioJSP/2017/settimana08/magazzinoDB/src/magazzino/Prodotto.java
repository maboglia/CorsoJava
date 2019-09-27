package magazzino;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connessione.Connessione;

public class Prodotto{

	
	private int codiceProdotto;
	private String descrizioneProdotto;
	private double prezzoProdotto;
	public Prodotto(){}

	public Prodotto(int codiceProdotto, String descrizioneProdotto, double prezzoProdotto) {
		this.codiceProdotto = codiceProdotto;
		this.descrizioneProdotto = descrizioneProdotto;
		this.prezzoProdotto = prezzoProdotto;
	}

public int getCodiceProdotto() {
	return codiceProdotto;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.codiceProdotto+" - "+this.descrizioneProdotto+" - "+this.prezzoProdotto;
	}

}
