package magazzino;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connessione.Connessione;

public class Magazzino {
	String dataOperazione; 
	Prodotto prodotto;
	int quantita;
	
	ArrayList<Magazzino> reportMagazzino;
	ArrayList<Magazzino> elencoAcquisti;
	ArrayList<Magazzino> elencoVendite;

	Statement stmt = null;
	ResultSet rs = null;
	Connessione connessione = new Connessione();	

	public boolean caricaProdotto(Prodotto p){
		
		
		return true;
	}

	public ArrayList<Prodotto> elencoProdotti(){
		
		
		String sql = "SELECT * FROM prodotti";
		ArrayList<Prodotto> lista = new ArrayList<>();
		
		try{
			stmt=connessione.getConnessione().createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				
				lista.add(   new Prodotto(   rs.getInt(1),rs.getString(2),rs.getDouble(3) )      );
			}
		}
		
		catch(SQLException e){
			
			e.printStackTrace();
		} finally {
			try {
				connessione.getConnessione().close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return lista;
		
		
	}


public static void main(String[] args) {
	Magazzino m = new Magazzino();
	visualizza_elenco(m);
	}


/**
 * @param m
 */
private static void visualizza_elenco(Magazzino m) {
	for (Prodotto prod : m.elencoProdotti()) {
		System.out.println(prod);
	}
}	

}
