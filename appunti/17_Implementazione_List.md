# Implementazione di List

L’interfaccia List rappresenta un insieme di elementi. Sono permessi elementi duplicati.

Gli oggetti vengono memorizzati in locazioni di memoria contigue quindi è possibile accedere a ciascun oggetto molto velocemente mediante il suo indice all’interno della collezione. 

Non è adatta per operazioni di ricerca poiché occorrerebbe scorrere tutta la lista per ricercare un oggetto al suo interno. È possibile scorrere facilmente la lista sia mediante la classe iterator che mediante accesso diretto utilizzando l’indice dell’oggetto.

## Le implementazioni di List sono ArrayList e Vector.

ArrayList ha prestazioni nettamente superiori rispetto a Vector in quanto quest’ultima è sincronizzata di default mentre ArrayList non lo è (i metodi di accesso agli oggetti non sono Synchronized).

## Esempio di ArrayList e Vector.

ArrayList | Vector
------------ | -------------
ArrayList lista = new ArrayList();	|Vector vett = new Vector();
lista.add("abhijit");				|vett.add("abhijit");
lista.add("smitesh");				|vett.add("smitesh");
lista.add("melissa");				|vett.add("melissa");
Iterator it = lista.iterator();		|Iterator it = vett.iterator();
while (it.hasNext()) {			|while (it.hasNext()) {
   out.print(it.next());		   	  | out.print(it.next());
}							|}
