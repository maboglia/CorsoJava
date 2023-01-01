public class MetodiAusiliari 
{
	public static void main(String args[])
	{
		int a= 7;
		int b=3;
		int differenza, modulo= 0;
		
		somma(a, b);
				
		differenza = a-b;
		
		System.out.println("differenza: "+differenza);
		
		modulo = a%b;
		
		System.out.println("modulo: "+modulo);
	}
	
	public static void somma(int a, int b)
	{
		int somma=0;
		
		somma= a+b;
		
		System.out.println("somma: "+somma);
	}
}
