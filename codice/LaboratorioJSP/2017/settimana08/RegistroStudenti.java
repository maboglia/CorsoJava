package settimana08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RegistroStudenti {

	final static String DRIVER = "com.mysql.jdbc.Driver";
	final static String DBNAME = "java_summer_2017";
	final static String URL = "jdbc:mysql://localhost:3306/" + DBNAME;
	final static String USER = "root";
	final static String PASS = "";
	
	public static void main(String[] args) {
		
		//1 creo la connessione col db
		Connection connessione = null;
		 
		//2 collego la classe Driver
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//3 provo la connessione
		try {
			connessione = DriverManager.getConnection(URL, USER, PASS);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {

			//4 preparo l'istruzione
			Statement istruzione = connessione.createStatement();
			String query = "select nome, cognome from studenti";
			
			//5 eseguo l'istruzione e memorizzo i risultati in un resultset
			ResultSet risultati = istruzione.executeQuery(query);
			
			while(  risultati.next()){
				
				System.out.print(risultati.getString("nome") + " " );
				System.out.println(risultati.getString("cognome") + " " );
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
