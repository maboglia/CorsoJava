import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamBuffered {

	public static void main(String[] args) {

		try (
				BufferedReader in =   new BufferedReader(new FileReader("loremipsum.txt"));
				BufferedWriter out =   new BufferedWriter(new FileWriter("buff_loremipsum.txt"));
				
				
				) {
			int c;
			while ((c=in.read())!= -1)
			{
				out.write(c);
			}
			
			System.out.println("tuttttttappppostooooo!!!");
			
		}
			catch (FileNotFoundException e){
				System.out.println("FNFException: " + e.getMessage());
			}	
			catch (IOException e){
			System.out.println("IOException: " + e.getMessage());
			}
		
		
		
	}

}
