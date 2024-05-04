import java.io.*;

public class PrintStreamTest {
	public static void main(String[] args){
		File log = new File("log.txt");
		try{
			System.setOut(
				new PrintStream(
					new FileOutputStream(log)
				)
			);
		}catch(IOException e){}
		System.out.println("Ciao!");
		System.out.println("Eccomi qui!");
	}
}