import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {

	public static void main(String[] args) {

		try(
				FileInputStream fis = new FileInputStream("HTTPRequest.png");
				FileOutputStream fos = new FileOutputStream("new_HTTPRequest.png");
		
				){
			int c;
			while ( ( c = fis.read()   ) != -1   ) {
				fos.write(c);
			}
		} 
		catch (FileNotFoundException e) {
			System.out.println("FNFException: " + e.getMessage());
		}
		catch (IOException e) {
			System.out.println("IOException: " + e.getMessage());
		}
		 
			
		
	}

}
