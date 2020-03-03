// Utilizzo di variabili
class UsoVariabili{
	public static void main(String args[]){
		// Dichiaro tre variabili, inizializzo le prime due
		int numero1 = 10, numero2 = 100, somma;
		// Inizializzo la variabile somma
		somma = numero1 + numero2;
		// Stampo in console i valori delle variabili
		System.out.print("numero1 vale " + numero1 + ", ");
		System.out.print("numero2 vale " + numero2 + ", ");
		System.out.println("somma vale " + somma);
		// Assegno a numero1 il valore 20
		numero1 = 20;
		System.out.println("numero1 vale ora 20, somma vale " + somma);
		// Assegno a numero2 il doppio del suo valore precedente
		numero2 = numero2 * 2;
		// Assegno a somma il valore aggiornato
		somma = numero1 + numero2;
		/* Commento su più linee:  
		Lascia una riga vuota 
		*/
		System.out.println();
		// Stampo in console i valori delle variabili
		System.out.print("numero1 vale " + numero1 + ", ");
		System.out.print("numero2 vale " + numero2 + ", ");
		System.out.println("somma vale " + somma);
	}
}