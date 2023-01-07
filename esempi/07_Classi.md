# Le classi

## Variabili e metodi static

```java
class Statica{
	public int varIstanza;
	public static int varStatica;
	public Statica(int valIniziale){
		varIstanza = valIniziale;
	}
	public static void metodoStatic(){
		// mostra l'esecuzione del metodo
		System.out.println("varStatica vale " + varStatica);
	}
	static{
		// mostra quando viene eseguito il blocco
		System.out.println("Blocco static");
		// inizializza la variabile static
		varStatica = 5;
	}
}
```


```java
class Principale{
	public static void main(String args[]){
		Statica s, t;
		// non esiste ancora un oggetto Statica
		Statica.metodoStatic();
		System.out.println("varStatica senza istanze vale "+ Statica.varStatica);
		// istanzia un oggetto Statica
		s = new Statica(3);
		System.out.println("s.varIstanza vale " + s.varIstanza);
		System.out.println("s.varStatica vale " + s.varStatica);
		// istanzia un secondo oggetto Statica
		t = new Statica(4);
		System.out.println("t.varIstanza vale " + t.varIstanza);
		System.out.println("t.varStatica vale " + t.varStatica);
		/* assegna un valore alla variabile static tramite
		una istanza di Statica */
		t.varStatica = 10;
		System.out.println("t.varStatica vale " + t.varStatica);
		/* tutte le istanze di Static condividono
		il medesimo valore della variabile static */
		System.out.println("s.varStatica vale " + s.varStatica);
	}
}

```

## esempio
```java

public class MiaClasse {

	public int mioNumero;
	Integer mioNum2 = 14;

	//convenzione di naming: si chiama come la classe, perciò inizia con lettera maiuscala, diversamente dagli altri metodi
	//inoltre, non ha tipo di ritorno: la sua funzione è costruire l'oggetto
	
	public MiaClasse(){
		 mioNumero = 1;
	}
	
	public void mioMetodo(){
		System.out.println("ciao");
	}
	
	public void stampaInfo(){
		System.out.println("stampa info ad hoc sull'oggetto");
	}
	


	
	/** (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "esemplare di mia classe: " + getClass().getName();
	}

	public static void main(String[] args) {
		MiaClasse mc = new MiaClasse();
		System.out.println(mc);
		MiaClasse mc2 = mc;
		System.out.println(mc2);
		
		mc = null;
		mc2 = null;
		
		System.out.println(mc);
		System.out.println(mc2);
		
		
	}
	
}

```
