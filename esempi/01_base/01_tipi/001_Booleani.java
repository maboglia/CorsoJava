	public static void main(String[] args) {
		
        //dichiarazione ed inizializzazione
        boolean a, b = false;
        //inizializzazione
        a = true;
        
        if (a == b)
                System.out.println("a e b sono uguali");
        else
                System.out.println("a e b sono diversi");
			
        boolean b1 = true;
        boolean b2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        boolean b4 = !b1;
        System.out.println("b4 vale: " + b4);

        int i1 = 0;
        boolean b5 = (i1 != 0);
        System.out.println(b5);

        String sBool = "true";
        boolean parsed = Boolean.parseBoolean(sBool);
        System.out.println(parsed);		

	}
