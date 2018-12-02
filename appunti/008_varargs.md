# Varargs

I varargs (variable arguments) sono utiliper ogni metodo che abbia a che fare con un numero di argomenti indeterminato, nelle API di Java si trova per esempio nel caso del metodo String.format che accetta un numero variabile di argomenti. 


```java
public class Fuoristrada extends Automobile {
	private ArrayList<Automobile> updates;
	// Costruttori
	public Fuoristrada () {
		updates = new ArrayList<Automobile>();
	}
	public Fuoristrada (String nome) {
		super(nome);
		updates = new ArrayList<Automobile>();
	}
	public Fuoristrada (String nome, Automobile... caratteristiche) {
		super(nome);
		updates = new ArrayList<Automobile>();
		addUpdates(caratteristiche);
	}
	// Getters e Setters
	public void addUpdate (Automobile update) {
		updates.add(update);
	}
	public void removeUpdate (Automobile update) {
		updates.remove(update);
	}
	public void addUpdates (Automobile... caratteristiche) {
		for (Automobile update : caratteristiche) {
			updates.add(update);
		}
	}
	public void removeUpdates(Automobile... caratteristiche) {
		for (Automobile update : caratteristiche) {
			updates.remove(update);
		}
	}
}
```

