# Algoritmi del Java Collections Framework

Tra le carateristiche offerte dal Collection Framework esistono classi ed algoritmi come, ad esempio, quelli di ordinamento che se avessimo usato array o altre strutture avremmo dovuto definire ad-hoc.

---

## Collections ha metodi che implementano complicati algoritmi come:

* **sort()** (ordina)
* **shuffle()** (mischia – il contrario di ordina)
* **max()** (restituisce l’elemento massimo)
* **reverse()** (inverte l’ordine degli elementi)
* **binarySeach()** (ricerca binaria)

Altri metodi, detti "di convenienza", permettono la creazione di:
* **collection immutabili** di un numero definito di oggetti identici (metodo ncopies())
* **un oggetto singleton**, che si può istanziare una sola volta (metodo singleton())

---

## ESEMPIO

utilizzare gli algoritmi per ordinare una lista.

```java
public static void main(String[] args) {
	List<Persona> persone = new ArrayList<Persona>();

	persone.add(new Persona(27, "marco", "bianco"));
	persone.add(new Persona(80, "luca", "arancio"));
	persone.add(new Persona(75, "giovanni", "rossi"));
	persone.add(new Persona(29, "mario", "bianchi"));

	System.out.println("Lista non ordinata");
	print(persone);

	System.out.println("Ordina per eta");
	Collections.sort(persone);
	print(persone);

	System.out.println("Ordina per cognomi");
	Collections.sort(persone, new CognomeComparator());
	print(persone);
}

private static void print(Collection<Persona> coll) {
	Iterator<Persona> it = coll.iterator();

	while (it.hasNext()) {
		Persona p = it.next();
		System.out.println(p.getNome() + " " +
   p.getCognome() + " " +
   p.getEta());
	}
}
```

---

```java
public class Persona implements Comparable<Persona>{
private String nome;
private String cognome;
private int eta;

public Persona() {}

public Persona(int eta, String nome, String nome) {
	setEta(eta);
	setNome(nome);
	setCognome(cognome);
}

public String toString() {
	return nome + " " + cognome + " " + eta;
}

public boolean equals(Persona p) {
	if (cognome.equals(p.getCognome()) && 
    nome.equals(p.getNome()) &&
    eta == p.getEta())
	return true;
else
	return false;
}

public int compareTo(Persona p) {
	if (getEta() == p.getEta())	return 0;
	else if (getEta()>p.getEta())	return 1;
	else 						return -1;	
}
```

---

Sono stati usati due metodi per ordinare la lista:

`Collections.sort(persone)` che riceve in input una List di oggetti che implementano l’interfaccia Comparable. 
Nell’esempio gli elementi vengono ordinati in base all’età

`Collections.sort(persone, new CognomeComparator())` che riceve in input una List di oggetti e un’istanza di una classe che implementa l’interfaccia Comparator. 

Nell’esempio gli elementi vengono ordinati in base al cognome. Naturalmente è possibile creare diversi Comparator che permettono di ordinare la lista in altrettanti modi