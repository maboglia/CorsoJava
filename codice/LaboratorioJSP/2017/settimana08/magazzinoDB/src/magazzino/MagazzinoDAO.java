package magazzino;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import connessione.IDAO;
import model.Prodotto;
import model.Movimento;

public class MagazzinoDAO  implements IDAO {
    private Connection conn;

    @Override
    public void open() throws ClassNotFoundException, SQLException {
        Class.forName(DRIVER);
        conn = DriverManager.getConnection(URL);
    }
    
    @Override
    public void close()throws SQLException {
        conn.close();
    }

	@Override
	public List<Prodotto> elencoProdotti() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	public void inserisciMovimento(Movimento m) throws SQLException{
		
		PreparedStatement ps = conn.prepareStatement("insert into magazzino " +
						"(data, cod_prodotto, quantita) " + 
						"values " + 
						"(?,?,?)");			
				
				ps.setString(1, m.getDataFormattata());
				ps.setInt(2, m.getP().getCodiceProdotto());
				ps.setInt(3, m.getQuantita());

				int rowsAffected = ps.executeUpdate();
					
				if (rowsAffected > 0) System.out.println(rowsAffected+" aggiunte");
		
		
	}
	
	
	public List<Movimento> stampaMovimenti() throws SQLException, ClassNotFoundException {
	       PreparedStatement ps = conn.prepareStatement(ALL_MAGAZZINO);
	        
	        List<Movimento> listaMovimenti = new ArrayList<>();

	        ResultSet rs = ps.executeQuery();
	         
	        while (rs.next()) {
	            int codiceProdotto = rs.getInt("cod_prodotto");
	            String data = rs.getString("data");
	            int quantita = rs.getInt("quantita");
	            /*creo data da stringa*/
	            int year = Integer.parseInt(data.substring(0, 4));
	            int month = Integer.parseInt(data.substring(4, 6));
	            int dayOfMonth = Integer.parseInt(data.substring(6, 8));
	            		
	            LocalDate ldata = LocalDate.of(year, month, dayOfMonth);
	            
	            /*trovo il prodotto*/
	            ProdottiDAO p = new ProdottiDAO();
	            p.open();
	            Prodotto prod= p.trovaprodottoPerId(codiceProdotto);

	            /*creo oggetto di tipo movimento e lo aggiungo all'arraylist*/
	            Movimento Movimento = new Movimento(prod,quantita,ldata);
	            listaMovimenti.add(Movimento);
	        }

	        rs.close();
	        ps.close();
	        
	        return listaMovimenti;

	}
	
	public HashMap<Prodotto, Integer> statoMagazzino() throws SQLException, ClassNotFoundException {
		PreparedStatement ps = conn.prepareStatement(STATO_MAGAZZINO);
		
		HashMap<Prodotto, Integer> statoMagazzino = new HashMap();
		
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			int codiceProdotto = rs.getInt("cod_prodotto");
			int quantita = rs.getInt("q");
			
					
			/*trovo il prodotto*/
			ProdottiDAO p = new ProdottiDAO();
			p.open();
			Prodotto prod= p.trovaprodottoPerId(codiceProdotto);
			p.close();
			
			statoMagazzino.put(prod, quantita);
		}
		
		rs.close();
		ps.close();
		
		return statoMagazzino;
		
	}
	
	@Override
	public Prodotto trovaprodottoPerId(int idProdotto) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
