import java.io.*;

public class BufferedReaderTest {
	
	public static void main(String[] args){
		// Il file da leggere
		File f = new File("prova.txt");
		// Lettura riga per riga
		BufferedReader in = null;
		try{
			in = new BufferedReader(new FileReader(f));
			int i = 1;
			String line;
			while((line = in.readLine()) !=null){
				System.out.println(i + ":" + line);
				i++;
			}
		}catch(IOException e){
			System.out.println("Impossibile leggere il file");
		}finally{
			if(in != null) try{
				in.close();
			}catch(IOException e){}
		}
	}

}