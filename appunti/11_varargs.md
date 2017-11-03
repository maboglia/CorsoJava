#Varargs
L’overload è la caratteristica polimorfica di Java basata sul concetto per cui un metodo  univocamente individuato dalla sua firma (cioè dal nome e dalla lista dei parametri). Essa permette, quindi, allo sviluppatore di usare lo stesso nome per più metodi variando la lista degli argomenti.
Ci sono casi in cui però l’overload non basta a soddisfare pienamente le esigenze di uno sviluppatore, come quando è necessaria una lista di argomenti variabile in numero. In casi simili, prima dell’avvento di Java 5, la soluzione era usare array e collezioni.

public class DeveloperJava extends Developer {
	private ArrayList <Java5Feature> updates;
	// Costruttori
	public DeveloperJava (String nome) {
		super(nome);
updates = new ArrayList<Java5Feature>();
	}
	public DeveloperJava (String nome, Java5Feature[] features) {
		super(nome);
		updates = new ArrayList<Java5Feature>();
	}
	// Getters e Setters
	public void addUpdate (Java5Feature update) {
		updates.add(update);
	}
	public void removeUpdate (Java5Feature update) {
		updates.remove(update);
	}
	public void addUpdates (Java5Feature[] features) {
		for (Java5Feature update : features) {
			updates.add(update);
		}
	}
	public void removeUpdates(Java5Feature[] features) {
		for (Java5Feature update : features) {
			updates.remove(update);
		}
	}
}

In questo esempio, il numero degli argomenti del costruttore poteva essere di grandezza variabile, ecco perché si è preferito creare un costruttore che prende in input un array di Java5Feature, piuttosto che creare tanti costruttori, ognuno che aggiungeva un nuovo parametro al precedente.
Una soluzione alternativa poteva essere quella di usare uan clection come ArrayList.
Con l’avvento di Java 5, i varargs (variable arguments) rendono tutto più semplice e leggibile. 

public class DeveloperJava extends Developer {
	private ArrayList<Java5Feature> updates;
	// Costruttori
	public DeveloperJava () {
		updates = new ArrayList<Java5Feature>();
	}
	public DeveloperJava (String nome) {
		super(nome);
		updates = new ArrayList<Java5Feature>();
	}
	public DeveloperJava (String nome, Java5Feature... features) {
		super(nome);
		updates = new ArrayList<Java5Feature>();
		addUpdates(features);
	}
	// Getters e Setters
	public void addUpdate (Java5Feature update) {
		updates.add(update);
	}
	public void removeUpdate (Java5Feature update) {
		updates.remove(update);
	}
	public void addUpdates (Java5Feature... features) {
		for (Java5Feature update : features) {
			updates.add(update);
		}
	}
	public void removeUpdates(Java5Feature... features) {
		for (Java5Feature update : features) {
			updates.remove(update);
		}
	}
}

Come è possibile notare, questa classe è identica alla precedente, tranne per il fatto che utilizza la sintassi dei varargs (i puntini sospensivi "…"). Effettivamente, i varargs, all’interno del metodo dove sono dichiarati, sono considerati a tutti gli effetti array, quindi, come per gli array, se ne può ricavare la dimensione con la variabile length ed eseguire cicli su di essi.
Il vantaggio di avere varargs in luogo di un array o di una collection risiede essenzialmente nel fatto che, per chiamare un metodo dichiarante argomenti variabili, non bisogna creare array o collection.
