import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream {

	public static void main(String[] args) {

		try (
				FileReader in = new FileReader("loremipsum.txt");
				FileWriter out = new FileWriter("altro_loremipsum.txt");
				
				
				) {
			int c;
			while ((c=in.read())!= -1)
			{
				out.write(c);
			}
		}
			catch (FileNotFoundException e){
				System.out.println("FNFException: " + e.getMessage());
			}	
			catch (IOException e){
			System.out.println("IOException: " + e.getMessage());
			}
		
		
		
	}

}
