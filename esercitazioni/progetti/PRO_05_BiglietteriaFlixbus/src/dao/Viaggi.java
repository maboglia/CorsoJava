package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import connessione.Connessione;

public class Viaggi{

	
	/**
	 * @return the id_utenti
	 */
	public int getId_utenti() {
		return id_utenti;
	}



	/**
	 * @return the id_tratte
	 */
	public int getId_tratte() {
		return id_tratte;
	}



	/**
	 * @return the data_viaggio
	 */
	public String getData_viaggio() {
		return data_viaggio;
	}



	/**
	 * @return the numero_biglietti
	 */
	public int getNumero_biglietti() {
		return numero_biglietti;
	}



	private int id_utenti = 0;
	private int id_tratte = 0;

	private String data_viaggio = null;
	private int numero_biglietti = 0;
	
//	BaseDAO bd = new BaseDAO();
	Connessione bd = new Connessione();

	public Viaggi(){}
	

	
	public Viaggi(int int2, int int3, String string, int int4) {

		this.id_utenti = int2;
		this.id_tratte = int3;

		this.data_viaggio = string;
		this.numero_biglietti = int4;	

	}



	public boolean inserisciViaggio(){
		
		boolean b = true;
		
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "INSERT INTO viaggi (id_utenti, id_tratte, data_viaggio, numero_biglietti) "
				+ " values('" +this.id_utenti+"','"+this.id_tratte+"','"+ this.data_viaggio +"','" +this.numero_biglietti+"')";

		
		try{
			stmt=bd.getConnessione().createStatement();
			stmt.executeUpdate(sql);

		}
		
		catch(SQLException e){
			b = false;
			e.printStackTrace();
		}
		
		return b;
		
		
	}

	public ArrayList<Viaggi> elencoViaggi(){
		
		
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM viaggi";
		ArrayList<Viaggi> lista = new ArrayList<>();
		
		try{
			stmt=bd.getConnessione().createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				
				lista.add(
						new Viaggi(rs.getInt(2),rs.getInt(3),rs.getString(4),rs.getInt(5)));
			}
		}
		
		catch(SQLException e){
			
			e.printStackTrace();
		}
		
		return lista;
		
		
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//UtentiDAO u = new UtentiDAO(this.id_utenti);
		return this.data_viaggio + this.id_tratte + this.id_utenti;
	}
	
	

	
}
