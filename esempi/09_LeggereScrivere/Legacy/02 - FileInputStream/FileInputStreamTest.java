import java.io.*;

public class FileInputStreamTest {
	public static void main(String[] args){
		// File da leggere
		File f = new File("prova.txt");
		// Riferimento allo stream
		FileInputStream in = null;
		try{
			// Stabilisco lo stream
			in = new FileInputStream(f);
			// Leggo finché ci sono dati
			int i;
			while((i = in.read())!=-1){
				char c = (char)i;
				System.out.print(c);
			}
			System.out.println();
		}catch(IOException e){
			// Problema!
			System.out.println("Problema durante la lettura...");
		}finally{
			// Chiusura dello stream
			if(in!=null)try{
				in.close();
			}catch(IOException e){}

		}
		
	}
}