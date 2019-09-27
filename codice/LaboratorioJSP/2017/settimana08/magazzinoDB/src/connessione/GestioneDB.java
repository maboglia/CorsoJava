package connessione;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GestioneDB {

		private  static Connection myConn = null;
		private  static Statement myStmt = null;
		private  static ResultSet myRs = null;
		
		private  static String dbUrl = "jdbc:mysql://localhost:3306/java_summer_2017";
		private  static String user = "root";		
		private  static String pass = "";

		public static void caricaMagazzino(int codiceProdotto, int quantita, String data) throws SQLException {

			try {
				// 1. Connetti al database
				myConn = DriverManager.getConnection(dbUrl, user, pass);
				
				// 2. Crea uno statement
				myStmt = myConn.createStatement();

				// 3. Inserisci una nuova riga
				System.out.println("Insert database\n");
				
				int rowsAffected = myStmt.executeUpdate(
					"insert into magazzino " +
					"(data, cod_prodotto, quantita) " + 
					"values " + 
					"("+ data +", "+ codiceProdotto +", "+ quantita +")");
				
				System.out.println(rowsAffected);
			}
			catch (Exception exc) {
				exc.printStackTrace();
			}
				finally {
					close(myConn, myStmt, myRs);
				}

		}
		

		public static void mostraMagazzino() throws SQLException {

			try {
				// 1. Connetti al database
				myConn = DriverManager.getConnection(dbUrl, user, pass);
				
				// 2. Crea uno statement
				myStmt = myConn.createStatement();

				// 3. Inserisci una nuova riga
				System.out.println("Insert database\n");		

				// 4. seleziona i dati del magazzino
				myRs = myStmt.executeQuery("select * from magazzino");
				
				// 5. Process the result set
				while (myRs.next()) {
					System.out.println(myRs.getString("data") + ", " + myRs.getString("cod_prodotto") + ", " + myRs.getString("quantita"));
				}
			}
			catch (Exception exc) {
				exc.printStackTrace();
			}
				finally {
					close(myConn, myStmt, myRs);
				}

		}		
		
		public static void main(String[] args) {
			try {
				GestioneDB.caricaMagazzino(1,1,"20170713");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				GestioneDB.mostraMagazzino();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		private static void close(Connection myConn, Statement myStmt,
				ResultSet myRs) throws SQLException {
			if (myRs != null) {
				myRs.close();
			}

			if (myStmt != null) {
				myStmt.close();
			}

			if (myConn != null) {
				myConn.close();
			}
		}

		private static void close(Statement myStmt, ResultSet myRs)
				throws SQLException {

			close(null, myStmt, myRs);
		}
	}