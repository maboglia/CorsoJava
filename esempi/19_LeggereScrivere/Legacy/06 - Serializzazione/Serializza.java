import java.io.*;
public class Serializza{
	
	public static void main(String[] args){
		// Creazione di un oggetto Persona
		Persona p = new Persona("Sergio","Porcu");
		// Il file in cui riporre la serializzazione
		File f = new File("sergioporcu.ser");
		// Serializzazione dell'oggetto
		ObjectOutputStream out = null;
		try{
			out = new ObjectOutputStream(
				new FileOutputStream(f)
				);
			out.writeObject(p);
			System.out.println("Oggetto serializzato!");
		}catch(IOException e){
			System.out.println("Impossibile serializzare...");
		}finally{
			if(out != null) try{
				out.close();
			}catch(IOException e){}
		}
	}
}