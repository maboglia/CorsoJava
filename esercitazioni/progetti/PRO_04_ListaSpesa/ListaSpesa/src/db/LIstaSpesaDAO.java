package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import listaspesa.ListaSpesaBean;

public class LIstaSpesaDAO {
	
	/**
	 * Legge dal database la lista della spesa (ordinata per campo ord) 
	 * e la memorizza nel parametro spesa
	 */
	
	public void riempiListaSpesa(ListaSpesaBean spesa){
		Connection conn = DBConnect.getConnection();
		
		try {
			Statement st = conn.createStatement();
			String sql = "SELECT voce, data, ord FROM lista ORDER BY ord";
			
			ResultSet rs = st.executeQuery(sql);
			
			while (rs.next()) {
				spesa.aggiungi(rs.getString("voce"));
			}
			st.close();
			conn.close();
			
		} catch (SQLException e) {
			// in caso di fallimento scrivo info nel log di sistema
			Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, e);
			throw new RuntimeException("errore nel db: " + this.getClass().getSimpleName(), e);
		}
		
	}
	

	public void aggiungi(String voce){
		int maxOrd = getMaxOrd();
		maxOrd++;
		
		Connection conn = DBConnect.getConnection();

		try {
			String sql = "INSERT INTO lista (voce, data, ord) "
					+ "VALUES ( ?, NOW(), ?     )    ";
			
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, voce);
			st.setInt(2, maxOrd);
			
			int res = st.executeUpdate();
			
			//inserire una asserzione per verificare che res sia = 1
			st.close();
			conn.close();
			
			
		} catch (SQLException e) {
			// in caso di fallimento scrivo info nel log di sistema
			Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, e);
			throw new RuntimeException("errore nel db: " + this.getClass().getSimpleName(), e);
		}
		
	}

	public boolean elimina(int posizione){
		
		return false;
	}
	
	public int getMaxOrd(){
		int ord=0;
		
		Connection connessione = DBConnect.getConnection();
		
		try {
			Statement statement = connessione.createStatement();
			String sql = "SELECT MAX(ord) FROM lista";		
			
			ResultSet res = statement.executeQuery(sql);

			if (res.next()){
				ord = res.getInt(1);
				if(res.wasNull()){
					ord = -1;
				}
			} else {
				ord = -1;
				
			}
			statement.close();
			connessione.close();
			
			
			
		} catch (SQLException e) {
			// in caso di fallimento scrivo info nel log di sistema
			Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, e);
			throw new RuntimeException("errore nel db: " + this.getClass().getSimpleName(), e);
		}
				
		
		return ord;
	}
	
	public void pulisci(){
		
	}

	public String getElemento(int posizione){
		String elemento=null;
		
		
		return elemento;
	}
	
	public boolean modifica(int posizione, String voce){
		return false;
	}
	
	public boolean spostaSu(int posizione){
		
		return true;
	}
	public boolean spostaGiu(int posizione){
		
		return true;
	}
	
}
