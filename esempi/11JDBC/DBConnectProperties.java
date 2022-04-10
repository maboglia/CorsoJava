package db;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnectProperties {
	public static Connection getConnection() throws SQLException, IOException{
		
		Properties proprieta = new Properties();
		FileInputStream input = new FileInputStream("database.properties");
		proprieta.load(input);
		input.close();
		
		//String drivers = proprieta.getProperty("jdbc.drivers");
		//if (drivers != null) System.setProperty("jdbc.drivers", drivers);
		
		final String URL = proprieta.getProperty("jdbc.url");
		final String USERNAME = proprieta.getProperty("jdbc.username");
		final String PASSWORD = proprieta.getProperty("jdbc.password");
		
		return DriverManager.getConnection(URL, USERNAME, PASSWORD);	
		
		
	}
}
