package dialoghi;

public class StampaSetteNani {

	public static void main(String[] reDiRoma) {
		

		
		if(reDiRoma.length > 0){
			for (String string : reDiRoma) {
				System.out.println(string);
			}			
		}
		
		String[] setteNani = {
				"Pisolo",
				"Eolo",
				"Brontolo",
				"Mammolo",
				"Dotto",
				"Cucciolo",
				"Gongolo",
				
		};

		for (String string : setteNani) {
			System.out.println(string);
		}
		
	}

}
