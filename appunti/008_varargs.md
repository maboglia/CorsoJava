# Varargs

L’overload è la caratteristica polimorfica di Java basata sul concetto per cui un metodo  univocamente individuato dalla sua firma (cioè dal nome e dalla lista dei parametri). 

Essa permette, quindi, allo sviluppatore di usare lo stesso nome per più metodi variando la lista degli argomenti.

Ci sono casi in cui però l’overload non basta a soddisfare pienamente le esigenze di uno sviluppatore, come quando è necessaria una lista di argomenti variabile in numero. 

i varargs (variable arguments) rendono tutto più semplice e leggibile. 

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
Come è possibile notare, questa classe è identica alla precedente, tranne per il fatto che utilizza la sintassi dei varargs (i puntini sospensivi "…"). 

Effettivamente, i varargs, all’interno del metodo dove sono dichiarati, sono considerati a tutti gli effetti array, quindi, come per gli array, se ne può ricavare la dimensione con la variabile length ed eseguire cicli su di essi.

Il vantaggio di avere varargs in luogo di un array o di una collection risiede essenzialmente nel fatto che, per chiamare un metodo dichiarante argomenti variabili, non bisogna creare array o collection.
