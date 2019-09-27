package connessione;

import java.sql.SQLException;
import java.util.List;

import model.Prodotto;

public interface IDAO {
    final static String DRIVER = "com.mysql.jdbc.Driver";
    final static String DBNAME = "java_summer_2017";
    final String USER     = "root";
    final String PASS    = "";
    final static String URL = "jdbc:mysql://localhost:3306/" + DBNAME + "?user=" + USER + "&password=" + PASS + "";
    final static String ALL_PRODOTTI = "SELECT * FROM prodotti";
    final static String ONE_PRODOTTO = "SELECT * FROM prodotti where cod_prodotto = ?";
    final static String ALL_MAGAZZINO = "SELECT * FROM magazzino";
    final static String STATO_MAGAZZINO = "SELECT cod_prodotto, sum(quantita) as q FROM magazzino group by cod_prodotto order by cod_prodotto";
    
    
    
    
    // apre il database
    void open() throws ClassNotFoundException, SQLException;
    
    // chiude il database
    void close()throws SQLException;
    
    // trova la lista dei prodotti
    List<Prodotto> elencoProdotti() throws SQLException;
    
    // trova Prodotto per id
    Prodotto trovaprodottoPerId(int idProdotto) throws SQLException;
}
