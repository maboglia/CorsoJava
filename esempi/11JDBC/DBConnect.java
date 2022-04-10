package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect {
	/**
	 * recupero un oggetto connessione
	 * @return
	 * @throws SQLException
	 */
	public static Connection getConnection() throws SQLException{
		final String URL = "jdbc:mysql://localhost:3306/tss_2018";
		final String USERNAME = "root";
		final String PASSWORD = "";
		return DriverManager.getConnection(URL, USERNAME, PASSWORD);
	}

}
