	public static void main(String[] args) {
		
		for (int i = 0; i < 1000; i++) {
			char ascii = (char)  i;
			System.out.print(ascii + "\t");
			
			if (i % 10 == 0)
				System.out.println();
		
			if (i == 255)
				System.out.println("-------------sono finiti gli ascii--------------");
		
		}
	}