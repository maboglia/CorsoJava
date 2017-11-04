package esempi.week1;

//Errore di conversione da int a byte (perdita di dati)
class Interi{
	public static void main(String args[]){
		int a = 12;
		byte b;
        	b = (byte) a;
             
             System.out.println(b);
	}
}
