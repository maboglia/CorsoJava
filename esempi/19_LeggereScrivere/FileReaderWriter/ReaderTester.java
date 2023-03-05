
import java.io.IOException;

public class ReaderTester {

	public static void main(String[] args) throws IOException{

		String contenutoFile = MyFileReader.readFile("test_files/test.txt");
			try {		
				if (contenutoFile.equals("corso java 2017")){
					System.out.println(contenutoFile);			
				}
				else{
						throw (new HaiSbagliato());
				}
			} catch (HaiSbagliato e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		
			
	}

}
