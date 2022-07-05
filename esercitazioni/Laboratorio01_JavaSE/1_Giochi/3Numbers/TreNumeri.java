import java.util.*;

class TreNumeri
{
	public static void main(String [] args)
	{
		/*dichiaro le tre variabili intere in cui inserisco i 
		 * numeri casuali*/
		int a, b, c;
		
		/*dichiaro le tre variabili intere in cui inserisco i numeri 
		 * chiesti all'utente tramite lo scanner*/
		int a1, b1, c1;

		/*Genero casualmente i tre numeri e li salvo nelle
		 * rispettive variabili*/
		a= (int)(Math.random()*10);
		b= (int)(Math.random()*10);
		c= (int)(Math.random()*10);
		
		System.out.println("I tre numeri: "+a+", "+b+", "+c);
		
		/*dichiaro la variabile che ospita l'oggetto scanner*/
		Scanner s;
		//creo l'oggetto scanner e lo metto nella variabile s
		s=new Scanner(System.in);
		
		do
		{
			/*richiedo il primo numero all'utente tramite lo scanner
			 *e lo assegno alla variabile a1 */
			System.out.print("Inserire il primo numero: ");
			a1=s.nextInt();

			/*richiedo il secondo numero all'utente tramite lo scanner
			 *e lo assegno alla variabile b1 */
			System.out.print("Inserire il secondo secondo: ");
			b1=s.nextInt();

			/*richiedo il terzo numero all'utente tramite lo scanner
			 *e lo assegno alla variabile c1 */
			System.out.print("Inserire il terzo secondo: ");
			c1=s.nextInt();

			/*controllo se il primo numero è uguale a quello inserito;
			 *e stampo una stringa che mi indica se lo è o meno*/
			if(a==a1){
				System.out.println("Primo Numero: CORRETTO");
			}
			else{
				System.out.println("Primo Numero: ERRATO");
			}			

			/*controllo se il secondo numero è uguale a quello inserito;
			 *e stampo una stringa che mi indica se lo è o meno*/
			if(b==b1){
				System.out.println("Secondo Numero: CORRETTO");
			}
			else{
				System.out.println("Secondo Numero: ERRATO");
			}			
			
			/*controllo se il terzo numero è uguale a quello inserito;
			 *e stampo una stringa che mi indica se lo è o meno*/
			if(c==c1){
				System.out.println("Terzo Numero: CORRETTO");
			}
			else{
				System.out.println("Terzo Numero: ERRATO");
			}						
		}
		while( (a!=a1) || (b!=b1) || (c!=c1) );
			
		System.out.println("BRAVO HAI VINTO!");
		
	}
}
