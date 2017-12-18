# Eccezioni
## Situazioni anomale a run-time (1)

* Java prevede un sofisticato utilizzo dei tipi (primitivi e classi) che consente di individuare molti errori al momento della compilazione del programma (prima dell'esecuzione vera e propria)
* Ciò nonostante si possono verificare varie situazioni impreviste o anomale durante l'esecuzione del programma
che possono causare l'interruzione del programma stesso 
* Ad esempio:
  * Tentativi di accedere a posizioni di un array che sono fuori dai limiti
  * Errori aritmetici (divisione per zero, ...)
  * Errori di formato: (errore di input dell'utente)
     
### ErroreArray

* Un po' di esempi:
```java
public class ErroreArray {
  public static void main(String[] args) {
  int[] a = {5,3,6,5,4};
  // attenzione al <=...
  for (int i=0; i<=a.length; i++) 
  System.out.println(a[i]);
  System.out.println("Ciao"); 
  }
}
```

### ErroreAritmetico

```java
import java.util.Scanner; 
public class ErroreAritmetico {
  public static void main(String[] args) { 
  Scanner input = new Scanner(System.in);
  System.out.println("Inserisci due interi"); 
  int x = input.nextInt();
  int y = input.nextInt();
  System.out.println(x/y);
  // che succede se y == 0??
  } 
}
```                                                                   
### ErroreFormato

```java
import java.util.Scanner; 
public class ErroreFormato {
  public static void main(String[] args) { 
  Scanner input = new Scanner(System.in); 
  System.out.println("Inserisci un intero"); 
  int x = input.nextInt();

  // che succede se l'utente inserisce un carattere?
  System.out.println(x); 
  }
}
```                                                               

## Gestione delle eccezioni

* In Java, le situazioni anomale che si possono verificare a run-time possono essere controllate tramite meccanismi di gestione delle eccezioni
* Esistono classi che descrivono le possibili anomalie
* Ogni volta che la Java Virtual Machine si trova in una situazione anomala;
  * 1. sospende il programma
  * 2. crea un oggetto della classe corrispondente all'anomalia che si è
  verificata
  * 3a. passa il controllo a un gestore di eccezioni (implementato dal
  programmatore)
  * 3b. se il programmatore non ha previsto nessun gestore, interrompe il
  programma e stampa il messaggio di errore
   
## Il costrutto try-catch

* Il costrutto try-catch consente di 
  * __monitorare__ una porzione di programma (all'interno di un metodo)
  * __specificare__ cosa fare in caso si verifichi una anomalia (eccezione) 

Si usa cosi:

```java

// ... blocchi di codice NON monitorati ....

try {
  // ... blocchi di codice monitorati ....
  }
  catch (Exception e) {
  // ... blocchi di codice da eseguire IN CASO DI ECCEZIONE
  }

// ... altri blocchi di codice NON monitorati ....
```

         
# La gerarchia delle eccezioni
La classe Exception descrive un'eccezione generica, situazioni anomale più specifiche sono descritte dalle sottoclassi di Exception


### Esempio gestione eccezione: ErroreAritmetico2


```java
import java.util.Scanner;
public class ErroreAritmetico2 {
  public static void main(String[] args) { 
  Scanner input = new Scanner(System.in);

  System.out.println("Inserisci due interi");
  int x = input.nextInt();

  int y = input.nextInt();

  try { System.out.println(x/y);
  System.out.println("CIAO");

  }
  catch (ArithmeticException e) {
  // se si verifica un eccezione di tipo ArithmeticException
  // nella divisione x/y il programma salta qui (non stampa CIAO)
  System.out.println("Non faccio la divisione..."); // gestita l'anomalia, l'esecuzione riprende...
  }
  System.out.println("Fine Programma"); }
}
```
### Esempio gestione eccezione: ErroreFormato2


```java
import java.util.Scanner;
import java.util.InputMismatchException; 

public class ErroreFormato2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    System.out.println("Inserisci un intero"); 
    int x; 
    boolean ok;
    do {
      ok = true; 
      try {
        x = input.nextInt();
        System.out.println(x); 
      }
      catch (InputMismatchException e) { 
        input.nextLine(); // annulla l'input ricevuto System.out.println("Ritenta...");
        ok = false;
      }
    } while (!ok);
  } 
}
```                                                              
## Gestire le eccezioni

* Un costrutto try-catch può gestire più tipi di eccezione contemporaneamente
* I vari gestori (ognuno denotato da un catch) vengono controllati in sequenza
* Viene eseguito (solo) il primo catch che prevede un tipo di eccezione che è supertipo dell'eccezione che si è verificata
* Quindi, è meglio non mettere Exception per prima (verrebbe richiamata in tutti i casi)
* La variabile e è un oggetto che può contenere informazioni utili sull'errore che si è verificato...

```java
try { 
  //istruzioni da controllare
}
catch (NumberFormatException e) {
  //codice
}
catch (Exception e) {
  //codice
}
```                                     
## Gestire eccezioni

* Per capire quando preoccuparsi di definire un gestore di eccezioni:
  * bisogna avere un'idea di quali sono le eccezioni più comuni e in quali casi si verificano (esperienza)
  * bisogna leggere la documentazione dei metodi di libreria che si utilizzano:
    * la documentazione della classe Scanner spiega che il metodo nextInt() può lanciare l'eccezione InputMismatchException
  * in alcuni casi le eccezioni non vanno gestite: segnalano un errore di programmazione che deve essere corretto!
    * verifica la correttezza dei cicli nel caso di scorrimento di una collezione

* Le eccezioni si dividono in:
  * Checked (o controllate) per le quali il compilatore richiede che ci sia un gestore
  * Unchecked (o non controllate) per le quali il gestore non è obbligatorio
  * Per essere unchecked un'eccezione deve essere una sottoclasse di RuntimeException, altrimenti è checked

### Esempi tipici di eccezioni checked:
* le eccezioni che descrivono errori di input/output 
  * lettura o scrittura su file, 
  * comunicazione via rete, ecc...
* le eccezioni definite dal programmatore
    
## Il comando throw

* Il meccanismo delle eccezioni può anche essere usato per segnalare situazioni di errore
* Il comando throw consente di lanciare un'eccezione quando si vuole
* Si può usare la classe Exception, una sua sottoclasse già definita, o una sua sottoclasse custom
* __throw__ si aspetta di essere seguito da un oggetto, che solitamente è costruito al momento (tramite new)
* Il costruttore di una eccezione prende come parametro (opzionale) una stringa di descrizione

```java
           throw new Exception("Operazione non consentita");
                throw new AritmeticException ();
                throw new EccezionePersonalizzata ();
```
* Il comando throw si può usare direttamente dentro un try-catch,
* l'uso più comune di throw è all'interno dei metodi
* L'utilizzo di throw dentro a un metodo consente di interrompere il metodo in caso di situazioni anomale:
  * parametri ricevuti errati
  * operazione prevista dal metodo non realizzabile 
  * (esempio: prelievo dal conto corrente di una somma superiore al saldo)
 
* Chi invoca il metodo dovrà preoccuparsi di implementare un gestore delle eccezioni possibilmente sollevate
* Questo consente di evitare valori di ritorno dei metodi che servono solo a dire se l'operazione è andata a buon fine
* in caso di problemi si lancia l'eccezione, non si restituisce un valore particolare
    
## parola chiave __throws__

* Un metodo che contiene dei comandi throw deve elencare le eccezioni che possono essere sollevate
* L'elenco deve essere fatto nell'intestazione, usando la parola chiave __throws__
* throws si usa nell'intestazione del metodo
* throw si usa all'interno (nel punto in cui si verifica l'errore)
         public void preleva(int somma)

```java
throws IOException , IllegalParameterException { ... }
```

### Esempio: controllo correttezza parametri - Rettangolo

```java
public class Rettangolo { 
  private base;
  private altezza;
  // ... altri metodi e costruttori

  public void setBase(int x) throws EccezioneBaseNegativa { 
    if (x<0) throw new EccezioneBaseNegativa()
    else base=x;
  } 
}
```          
### EccezioneBaseNegativa

```java
public class EccezioneBaseNegativa extends Exception {
  EccezioneBaseNegativa() { 
    super ();
  }

  EccezioneBaseNegativa(String msg) { 
    super(msg);
    } 
}
```                                              