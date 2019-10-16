package settimana02;

public class EsempioDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double d1, d2;
		
		d1 = 100;
		
//		System.out.println(d1);
		
		d2 = 100.42;
		
//		System.out.println(d2);
		
		double d3 = 0.15;
		
		double d4 = d3 + d3 + d3;
		
//		System.out.println(d3);
//		System.out.println(Math.round(d4));
//		System.out.println(Math.ceil(d4));
//		System.out.println(Math.floor(d4));
		double d5 = 0.33;
		
		int conteggioSi = 0;
		long t1 = System.currentTimeMillis();
		
		for (int i= 0; i < 10000; i++){
			double casuale = Math.random();
			
			
		if ( casuale  < 0.5   ){
			System.out.println("Sì!!!!!!!");
			//conteggioSi   = conteggioSi + 1;
			//conteggioSi    += 1;
			conteggioSi++;
		}
		else
			System.out.println("NOOOOOOOOOO!");
		
		
		
		}
		
		System.out.println("hai detto si " + conteggioSi +" volte!");
		long t2 = System.currentTimeMillis();
		
		long tempo = t2-t1;
		System.out.println(tempo);
		
	}

}
