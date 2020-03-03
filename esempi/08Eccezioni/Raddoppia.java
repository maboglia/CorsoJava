public class Raddoppia{
	
	public static void main(String[] args){
		if(args.length!=1) return;
		try{
				double d = Double.parseDouble(args[0]);
				System.out.println(d*2);
		}catch(NumberFormatException e){
			System.out.println("Numero non valido");
		}
	}
}

/* Questa applicazione deve necessariemente ricevere
   un argomento da riga di comando. Es:
   java Raddoppia 5.234 */