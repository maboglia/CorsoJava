import java.io.*;

public class BufferedReaderTest{
	
	public static void main(String[] args){
		BufferedReader in = new BufferedReader(
			new InputStreamReader(System.in));
		try{
			while(true){
				System.out.println("Scrivi qualcosa ('quit' per uscire): ");
				String line = in.readLine();
				if(line != null){
					if(line.equals("quit")){
						break;
					}else{
						System.out.println("Hai scritto: " + line);
					}
				}
			}			
		}catch(IOException e){}
	}
}