package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnect {

	public static Connection getConnection(){
		//verifico l'esistenza del Driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			//in caso di fallimento scrivo informazione nel log di sistema
			Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, e);		
		}
		
		
		String url = "jdbc:mysql://localhost/spesa?user=root&password=";
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(url);
		} catch (SQLException e) {
			//in caso di fallimento scrivo informazione nel log di sistema
			Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, e);					
		}
		
		return conn;
		
	}
	
	
}
