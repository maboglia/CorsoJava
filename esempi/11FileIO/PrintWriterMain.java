import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class PrintWriterMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			PrintWriter backup = new PrintWriter("file11.txt");
			backup.append("test");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
