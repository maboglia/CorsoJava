package magazzino;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connessione.IDAO;
import model.Prodotto;

public class ProdottiDAO implements IDAO {
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
	       PreparedStatement ps = conn.prepareStatement(ALL_PRODOTTI);
	        	        
	        List<Prodotto> listaProdotti = new ArrayList<>();

	        ResultSet rs = ps.executeQuery();
	         
	        while (rs.next()) {
	            int codiceProdotto = rs.getInt("cod_prodotto");
	            String descrizioneProdotto = rs.getString("descrizione");
	            double prezzoProdotto = rs.getDouble("prezzo");
	            
	            Prodotto prodotto = new Prodotto(codiceProdotto, descrizioneProdotto, prezzoProdotto);
	            listaProdotti.add(prodotto);
	        }

	        rs.close();
	        ps.close();
	        
	        return listaProdotti;
	    }


	@Override
	public Prodotto trovaprodottoPerId(int idProdotto) throws SQLException {
PreparedStatement ps = conn.prepareStatement(ONE_PRODOTTO);
        
        ps.setInt(1, idProdotto);
        
        Prodotto prodotto = null;

        ResultSet rs = ps.executeQuery();
         
        if (rs.next()) {
                int codiceProdotto = rs.getInt("cod_prodotto");
                String descrizioneProdotto = rs.getString("descrizione");
                double prezzoProdotto = rs.getDouble("prezzo");

            prodotto = new Prodotto(codiceProdotto, descrizioneProdotto, prezzoProdotto);  
        }

        rs.close();
        ps.close();
        
        return prodotto;
	}
    
}
