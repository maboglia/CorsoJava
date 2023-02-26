package stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ProvaByteStream {

	public static void main(String[] args) {
		
		
		try ( FileInputStream fis = new FileInputStream("files/pvsg.jpg");
				FileOutputStream fos = new FileOutputStream("files/pvsg_copia.jpg");
				) {//try-with-resources
			
		int c;
		
		while( (c = fis.read()) != -1   ) {
			
			fos.write(c);
			
			
		}
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		
		
		
		
		
	}

}
