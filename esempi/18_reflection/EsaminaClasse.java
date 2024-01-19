public class EsaminaClasse{
	
	public static void main(String[] args){
		if(args.length == 1){
			try{
				Class c = Class.forName(args[0]);
				System.out.println("La classe " + args[0] + " esiste.");
				Class s = c.getSuperclass();
				if(s!=null){
					System.out.println("E' sottoclasse di " + s.getName()+".");
				}
				System.out.println("Ha " + c.getConstructors().length + " costruttori.");
				System.out.println("Ha " + c.getFields().length + " proprieta'.");
				System.out.println("Ha " + c.getMethods().length + " metodi.");
			}catch(ClassNotFoundException e){
				System.out.println("La classe " + args[0] + " non esiste.");
			}
		}
	}
}

/* Il programma si usa da riga di comando. Richiede un argomento, che
   serve per specificare il percorso della classe da esaminare.
   Dopo aver compilato la classe, provare a richiamarla al seguente
   modo:
   java EsaminaClasse java.lang.Thread
*/