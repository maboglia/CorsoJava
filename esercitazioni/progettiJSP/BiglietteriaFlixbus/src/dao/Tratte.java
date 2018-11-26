package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connessione.Connessione;

public class Tratte{

//	BaseDAO bd = new BaseDAO();
	Connessione bd = new Connessione();

	
	private int id_tratta;
	private String descrizione = null;

	public Tratte(){}
	
	public Tratte(int id_tratta, String Tratta){
		this.id_tratta = id_tratta;
		this.descrizione = Tratta;
	}
	
	
	
	public int getIdTratta() {
		return id_tratta;
	}


	public String getDescrizione() {
		return descrizione;
	}

	
	public ArrayList<Tratte> elencoTratte(){
		
		
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM tratte";
		ArrayList<Tratte> lista = new ArrayList<>();
		
		try{
			stmt=bd.getConnessione().createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				
				lista.add(new Tratte(rs.getInt(1), rs.getString(2)));
			}
		}
		
		catch(SQLException e){
			
			e.printStackTrace();
		}
		
		return lista;
		
		
	}
	
	public Tratte trovaTratta(int i){
		
		
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM tratte  where id_tratta =  " + i + "";
		//System.out.println(sql);
		Tratte p = null;
		
		try{
			stmt=bd.getConnessione().createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				
				p = new Tratte(rs.getInt(1), rs.getString(2));
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
		return this.descrizione;
	}
	
}
