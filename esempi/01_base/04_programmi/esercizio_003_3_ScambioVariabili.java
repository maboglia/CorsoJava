	public static void main(String[] args) {
		
		int a, b, temp;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("inserisci il primo valore intero");
		a = sc.nextInt();
		System.out.println("inserisci il secondo valore intero");
		b = sc.nextInt();
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("A = " + a);
		System.out.println("B = " + b);

	}