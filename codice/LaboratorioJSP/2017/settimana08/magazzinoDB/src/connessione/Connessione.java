package connessione;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {
	
	
	private final String DRIVER = "com.mysql.jdbc.Driver";
	private final String URL       = "jdbc:mysql://localhost:3306/java_summer_2017";
	private final String USER     = "root";
	private final String PASS    = "";
	
	
	public Connection getConnessione(){
		
		Connection conn = null;
		
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		try{
			conn= DriverManager.getConnection(URL,USER,PASS);
		}catch(SQLException e){
				e.printStackTrace();
			}
		
		return conn;
		
	}
	
	

}