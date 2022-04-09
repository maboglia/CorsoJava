import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CharacterStreamScanner {

	public static void main(String[] args) {

		try (
				Scanner s = new Scanner( 
						new BufferedReader( 
								new FileReader("loremipsum.txt")
								)
						);
				
				) {
			s.useDelimiter(",");
			while (s.hasNext())
			{
				System.out.println(s.next());
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
