
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class VisualizzaFile {

	public static void main(String[] argomenti) {


		FileInputStream fis;
		FileOutputStream fos;
		
		int c;
		
		
		if (argomenti.length != 1) {
			
			System.out.println("per usare il programma scrivi: java VisualizzaFile nomeFile");
			
		}
		else {
			try {
				fis = new FileInputStream(argomenti[0]);
				
				fos = new FileOutputStream("C:\\Users\\teacher\\provaOuput.txt");
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("spiacenti, si è verificato un errore di tipo NonHoTrovatoIlFILE");
				return;
			}
			
			try {
				c = fis.read();
				
				while (c > 0) {
					System.out.print(   (char) c   );
					fos.write( (char) (c + 1));
					c = fis.read();
					//if(c == 108) break;
					
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("errore in lettura");
			}
			
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		

	}

}
