# Varargs

I varargs (**variable arguments**) sono utili per ogni metodo che abbia a che fare con un numero di argomenti indeterminato.

Nelle API di Java si trova per esempio nel caso del metodo `String.format` che accetta un numero variabile di argomenti.

```java
public String formatWithVarArgs(String... values) {
    // ...
}

formatWithVarArgs();

formatWithVarArgs("a", "b", "c", "d");
```

L'utilizzo di varargs è sicuro se e solo se:

* Non memorizziamo nulla nell'array creato implicitamente. 
* Non lasciamo che un riferimento all'array generato _sfugga_ al metodo
---

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

