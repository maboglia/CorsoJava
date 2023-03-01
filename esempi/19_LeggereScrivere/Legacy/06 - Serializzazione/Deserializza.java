import java.io.*;

public class Deserializza {
	public static void main(String[] args){
		// Il file da recuperare
		File f = new File("sergioporcu.ser");
		// Deserializzazione
		ObjectInputStream in = null;
		try{
			in = new ObjectInputStream(
				new FileInputStream(f)
				);
			Persona p = (Persona)in.readObject();
			System.out.println("Deserializzazione riuscita");
			System.out.println("Nome: " + p.getNome());
			System.out.println("Cognome: " + p.getCognome());
		}catch(IOException e){
			System.out.println("Impossibile deserializzare...");
		}catch(ClassNotFoundException e){
			// Bisogna gestire l'eventualità che la classe
			// persona non venga trovata
			System.out.println("Impossibile deserializzare...");
		}finally{
			if(in != null) try{
				in.close();
			}catch(IOException e){}
		}
	}
}