package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connessione.Connessione;

public class UtentiDAO{

//	BaseDAO bd = new BaseDAO();
	Connessione bd = new Connessione();

	
	private int idUtente;
	private String Utente = null;

	public UtentiDAO(){}
	
	public UtentiDAO(String Utente){
		
		this.Utente = Utente;
	}
	
	public UtentiDAO(int id_u){
		
		UtentiDAO u = this.trovaUtente(id_u);
		this.idUtente = u.getIdUtente();
		this.Utente = u.getUtente();
	}
	
	public UtentiDAO(int id_u, String Utente){
		
		this.idUtente = id_u;
		this.Utente = Utente;
	}
	
	
	
	public int getIdUtente() {
		return idUtente;
	}


	public String getUtente() {
		return Utente;
	}

	
	public ArrayList<UtentiDAO> elencoUtenti(){
		
		
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM utenti";
		ArrayList<UtentiDAO> lista = new ArrayList<>();
		
		try {
			stmt=bd.getConnessione().createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				
				lista.add(new UtentiDAO(rs.getInt(1) ,rs.getString(2)));
			}
		}
		
		catch(SQLException e){
			
			e.printStackTrace();
		} 
		
		return lista;
		
		
	}
	
	public UtentiDAO trovaUtente(int i){
		
		
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM utenti  where id_utenti =  " + i + "";
		System.out.println(sql);
		UtentiDAO p = null;
		
		try{
			stmt=bd.getConnessione().createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				
				p = new UtentiDAO(rs.getInt(1), rs.getString(2));
			}
		}
		
		catch(SQLException e){
			
			e.printStackTrace();
		}
		
		return p;
		
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.Utente;
	}
	

	
}
