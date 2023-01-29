# Esercizi Java sui file

---

## Esercizio 1

Scrivere un programma Java per la gestione di un
archivio di persone e animali. Definire, in
particolare, la seguente gerarchia:

* Essere vivente (con attributo eta')
  * Animale (con nome)
  * Persona (con cognome, nome)
    * Studente (con matricola)
    * Lavoratore (con lavoro e stipendio)
  
---

## Esercizio 2

Scrivere un programma che visualizzi il contenuto di un file.

---

## Esercizio 3

Scrivere un programma che copi, byte dopo byte, un
file in un altro file.

---

## Esercizio 4

Scrivere un programma che crei un file di tipi
primitivi.

---

## Esercizio 5

Scrivere un programma che crei un file tmp, vi
scriva i caratteri "abcdef" e poi acceda a tmp
utilizzando un'istanza di RandomAccessFile, il
metodo seek() e il metodo readByte() per leggere
un byte alla volta.

---

## Esercizio 6 Archivio studenti

Alla fine dell’anno scolastico, il Preside desidera archiviare in una file gli esiti di fine anno degli
studenti della sua scuola. I dati da archiviare, per ogni studente sono:

```text
cognome studente
nome studente
classe
esito di fine anno: “P” per indicare che lo studente è stato promosso e “B” per indicare che lo studente è stato bocciato.
```

Scrivere i seguenti programmi:

1. Registrazione dei dati in un file sequenziale.

2. Leggendo tutti i record del file, visualizzare i dati immessi per gli studenti promossi, il numero di studenti promossi e non promossi e le rispettive percentuali sul numero totale di studenti.

---

## Esercizio no.1

Scrivi un programma che che legga dei numeri inseriti in un file di testo.
Se nel file di testo non vi è niente, il programma deve avvisare che il file è vuoto, se vi è un solo numero, questo numero deve essere stampato, se vi sono due numeri (disposti su due righe differenti) deve essere stampato il loro prodotto, se vi sono più di due numeri (disposti righe differenti) deve essere stampata la loro somma.

---

## Esercizio no.1:soluzione

Non conoscendo a priori quanti numeri interi sono contenuti nel file 'numeri.txt' conviene fare uso di un arraylist.
L'operatore A.size() ci dice quanti numeri ci sono (quante righe sono occupate). A secondo del suo valore la struttura decisionale if-else if esegue le operazioni indicate dalle specifiche del problema. Ogni singolo numero memorizzato nell'arraylist deve prima essere convertito in stringa e poi in numero, tramite l'istruzione:

Integer.parseInt(((String)A.get(i)).trim()) .

Questa operazione non è indispensabile nel caso il file sia vuoto oppure contenga un solo numero.
La variabile 'tot' funziona da accumulatore e restituisce il prodotto dei due numeri incontrati oppure la somma dei più numeri trovati.

```java
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
class nomi{
public static void main (String args [])throws IOException{
BufferedReader f=null;
int i=0,tot=0;
String s="";
ArrayList A=new ArrayList(0);
try {
   f=new BufferedReader(new FileReader("numeri.txt"));
   while(s!=null){
      s=f.readLine();
      if(s!=null){
         A.add(s);
         i++;
      }//fine if
   }//fine while
f.close();
}catch (IOException e){
System.err.println("errore"); }//fine try-catch
if(A.size()==0)System.out.println("file vuoto");
else if(A.size()==1) System.out.println(A.get(0));
else if(A.size()==2){
   tot=Integer.parseInt(((String)A.get(0)).trim());    tot*=Integer.parseInt(((String)A.get(1)).trim());
System.out.println(tot);
} else { for(i=0;i < A.size();i++)    tot+=Integer.parseInt(((String)A.get(i)).trim());
System.out.println(tot);
}// fine else

}//fine main
}//fine class
```

---

## Esercizio no.2

Scrivi un programma che accetti in input due vettori di interi (A e B) di 5 posti ciascuno e scriva su disco la loro somma;
in seguito caricare il file salvato in un vettore T (avente la stessa dimensione dei due precedenti) e stamparlo a video.

---

## Esercizio no.2:soluzione

Qui si è scelto di affidare a due metodi le operazioni di input e di salvataggio e quella di stampa del vettore finale.
La funzione caricaesalva() riceve in ingresso due vettori A e B ciascuno di 5 posti. La stessa funzione salva in un file la somma delle singole componenti dei due vettori.
La funzione stampa() non fa altro che aprire il file e mostrare a video i risultati della precedente operazione.

```java
import java.io.*;
class vettori{
final static int n=5;
public static void main (String args [])throws IOException{
caricaesalva();
stampa();
}//fine main
//-----
static void caricaesalva() throws IOException{
InputStreamReader input=new InputStreamReader(System.in);
BufferedReader h= new BufferedReader(input);
int i;
int A[] = new int[n];
int B[] = new int[n];
for(i=0;i < A.length;i++){
   System.out.print("A-ins "+(i+1)+"°:");    A[i]=Integer.parseInt(h.readLine().trim());
}//fine for A
for(i=0;i < B.length;i++){
   System.out.print("B-ins "+(i+1)+"°:");    B[i]=Integer.parseInt(h.readLine().trim());
}//fine for B
PrintWriter f=null;
try {
f=new PrintWriter(new FileWriter("sommavettori.txt"));
}catch (IOException e){ System.err.println("errore"); }
//scrittura
for(i=0;i < n;i++)f.println(A[i]+B[i]);
f.close();
}//fine carica()
//-----
static void stampa(){
BufferedReader f=null;
int i=0;
int T[] = new int[n];
String s=""; //lettura del file e caricamento array
try {
f=new BufferedReader(new FileReader("sommavettori.txt"));
while(s!=null){
   s=f.readLine();
   if(s!=null){
      T[i]=Integer.parseInt(s.trim());
      i++;
   }//fine if
}//fine while
f.close();
}catch (IOException e){ System.err.println("errore");}
//stampo T
for(i=0;i < n;i++)System.out.print(T[i]+" ");
}//fine salva()
}//fine class
```

---

## Esercizio no.3

Scrivi un programma che sia in grado di leggere un file di testo nel quale siano contenute una serie di stringhe su più righe consecutive, ad es.

```text
alpha
bravo
charlie
delta
echo
foxtrot
```

lo stesso programma deve permettere di modificare una delle stringhe salvando successivamente sullo stesso file, il cambiamento.

---

## Esercizio no.3:soluzione

Il programma principale apre il file contenente le stringhe e le memorizza in un arraylist, dato che non possiamo conoscere preventivamente quante parole ci sono nel file.
L'arraylist viene stampato dal metodo vista().
L'arraylist (A) viene passato al metodo mod(A) che ne permette la modifica. Dopo le modifiche il nuovo arraylist viene stampato a video, prima del suo successivo salvataggio nel file.

```java
import java.io.*;
import java.util.ArrayList;
class nomi{
public static void main (String args []) throws IOException{
BufferedReader f=null;
int i=0;
String s="";
ArrayList A=new ArrayList(0);
//lettura del file e caricamento array
try {
f=new BufferedReader(new FileReader("nomi.txt"));
while(s!=null){
   s=f.readLine();
   if(s!=null){
      A.add(s);
      i++;
   }//fine if
}//fine while
f.close();
}catch (IOException e){ System.err.println("errore");}
vista(A);
mod(A);
vista(A);
salva(A);
}//fine main
//-----
static void vista(ArrayList A){
for(int i=0;i < A.size();i++)System.out.print(i+" "+A.get(i)+"\n");
}//fine metodo vista
//-----
static void mod(ArrayList A) throws IOException{
InputStreamReader input=new InputStreamReader(System.in);
BufferedReader h= new BufferedReader(input);
String s;
int i;
System.out.print("index:");
i=Integer.parseInt(h.readLine().trim());
System.out.print("nuovo nome:");
s=h.readLine();
A.set(i,s); } //fine mod
//-----
static void salva(ArrayList A){
PrintWriter f=null;
try {
f=new PrintWriter(new FileWriter("nomi.txt"));
}catch (IOException e){ System.err.println("errore");}
//scrittura
for(int i=0;i < A.size();i++)f.println(A.get(i));
f.close();
}//fine metodo salva
}//fine class
```


In un file viene memorizzato il magazzino di una azienda, secondo la notazione

```text
biella#7@5
ruota#3@8
stelo#2@9
```

prima del simbolo `#` vi è il nome del prodotto; fra il simbolo `#` e il simbolo `@` vi è il costo del prodotto; dopo il simbolo `@` vi è il quantitativo in pezzi di quel prodotto.
Il programma deve restituire il controvalore del magazzino .

---

## Esercizio no.5:soluzione

E' chiaro che in questo problema, a parte le operazioni sul file di testo, il lavoro maggiore sarà quello di estrarre le sottostringhe rappresentative il prezzo 'prz' del prodotto e il suo quantitativo 'qta' a magazzino.
Per ogni stringa deve essere calcolato il subtotale 'sub' dato dal prodotto del costo 'prz' del prodotto per la sua quantità 'qta'. Poi bisogna progressivamente sommare i subtotali.
Prima di procedere esaminiamo la questione di come estrarre dalla stringa gli elementi che ci interessano. In questo programma, utilizzando gli operatori indexOf e substring, prima rileviamo la posizione dei marcatori che ci interessano, poi estraiamo le sottostringhe comprese fra le posizioni dei marcatori, qui memorizzati nelle variabili i ed f.

```java
class parser {
public static void main (String args []) {
String s="biella#7@3";
char ch;
int i,f,prz,qta,somma;
i=s.indexOf('#')+1;
f=s.indexOf('@');
prz=Integer.parseInt(s.substring(i,f).trim());
i=s.indexOf('@')+1;
f=s.length();
qta=Integer.parseInt(s.substring(i,f).trim());
somma=prz+qta; System.out.println(somma);
}//fine main
}// fine classe
```

Qui viene restituita la somma fra il prezzo prz e la quantità qta.
L'operazione ci serve solo per capire se il programma fonziona. 
Basandoci su questo esperimento preliminare, possiamo scrivere il programma che deve elaborare i dati provenienti dal file di testo.

```java
import java.io.*;
class maga{
public static void main (String args []){
BufferedReader f=null;
String s="";
int somma=0;
//leggo il file
try {
   f=new BufferedReader(new FileReader("maga.txt"));
   while(s!=null){
      System.out.println(s);
      s=f.readLine();
      if(s!=null){
         somma+=subtotale(s);
      }//fine if
      }//fine while
f.close();
}catch (IOException e){System.err.println("errore");}
System.out.println(somma);
}//fine main

static int subtotale(String s){
char ch;
int i,f,prz,qta,sub;
i=s.indexOf('#')+1;
f=s.indexOf('@');
prz=Integer.parseInt(s.substring(i,f).trim());
i=s.indexOf('@')+1;
f=s.length();
qta=Integer.parseInt(s.substring(i,f).trim());
sub=prz*qta;
return sub;
}//fine subtotale
}//fine class
```

Come si nota, il lavoro di estrazione delle sottostringhe di interesse e la loro conversione in numeri, viene eseguita dal metodo subtotale() che viene richiamato dal ciclo while che rileva ogni occorrenza di una stringa all'interno del file.
