import java.io.*;

public class FileOutputStreamTest{
	public static void main(String[] args){
		// Il file da leggere
		File f = new File("Prova.txt");
		// Riferimento allo stream
		FileOutputStream out = null;
		try{
			// Stabilisco lo stream
			out = new FileOutputStream(f);
			// Scrivo "Ciao"
			out.write("Ciao".getBytes());
		}catch(IOException e){
			// Problema
			System.out.println("Problema durante la scrittura...");
		}finally{
			// Chiusura dello stream
			if(out != null) try{
				out.close();
			}catch(IOException e){}
		}
		
	}
}