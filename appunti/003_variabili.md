# Le variabili e le costanti

* Una variabile è **un'area di memoria** identificata da un **nome**
* Il suo scopo è di contenere un valore di un **certo tipo**
* Serve per memorizzare dati durante l'esecuzione di un programma
* Il nome di una variabile è un **identificatore**
  * può essere costituito da lettere, numeri e underline
  * NON deve coincidere con una parola chiave del linguaggio
  * è meglio scegliere un **identificatore** che sia **significativo** per il programma
* Il modificatore **final** trasforma la variabile in una costante

![dichiarazione variabile](https://raw.githubusercontent.com/maboglia/CorsoJava/master/appunti/img/Language/01_lang_base/01_operatori_tipi_expr/assignment.png)

---

### esempio

```java
public class Triangolo {
    public static void main ( String [] args ) {
        
        int base , altezza ; //dichiarazione di variabili locali
        double area ;
        
        base = 5;
        altezza = 10;
        area = base * altezza / 2;

        System.out.println ( area );
    }
}
```

Usando le variabili il programma risulta essere **più chiaro**:

* Si capisce meglio quali siano la base e l'altezza del triangolo
* Si capisce meglio che cosa calcola il programma
* Evita la necessità di un commento per spiegare cosa contiene


---

### Dichiarazione

* In Java ogni variabile deve essere **dichiarata prima del suo uso**
* Nella dichiarazione di una variabile se ne specifica il **nome** e il **tipo** 
* Nell'esempio, abbiamo dichiarato tre variabili con nomi base, altezza e area, tutte di tipo int (numeri interi)
  * int base , altezza ;
  * int area ;

__ATTENZIONE!__ Ogni variabile deve essere dichiarata **UNA SOLA VOLTA**
(la prima volta che compare nel programma)

```java
base =5;
altezza =10;
area = base * altezza /2;
```


---

### Assegnazione

* Si può memorizzare un valore in una variabile tramite l'operazione di assegnazione
* Il valore da assegnare a una variabile può essere un letterale o il risultato della valutazione di un'espressione

* Esempi:

```java
base = 5;
altezza = 10;
area = base * altezza /2;
```

* I valori di base e altezza vengono letti e usati nell'espressione
* Il risultato dell'espressione viene scritto nella variabile area

---

### Dichiarazione + Assegnazione

Prima di poter essere usata in un'espressione una variabile deve:

* essere stata dichiarata
* essere stata assegnata almeno una volta (inizializzata)
* NB: **si possono combinare dichiarazione e assegnazione**. 

Ad esempio:

```java
int base = 5;
int altezza = 10;
int area = base * altezza / 2;
```

---

## uso della variabile locale

```java

//1) dichiarazione
int mioNumero;
//2) inizializzazione
mioNumero = 100;
//3) uso della variabile locale
System.out.println(mioNumero);
```

**NB**: una variabile **locale** deve **SEMPRE** essere **inizializzata**, prima di poter essere utilizzata

---

## Scope: ambito di visibilità delle variabili

```java
class Nascoste {
  static int x,y; //Def. var. globali

  static void f() {
    int x;
    x = 1;  // Locale
    y = 1;  // Globale
    System.out.println(x);
    System.out.println(y);
  }

  public static void main (String[] args) {
    x = 0; // Globale
    y = 0; // Globale
    f();
    System.out.println(x);
    System.out.println(y);
  }
}
```

**NB**: una variabile **locale** deve **SEMPRE** essere **inizializzata**, prima di poter essere utilizzata

---

## Costanti

Nella dichiarazione delle variabili che **NON DEVONO** mai cambiare valore si può utilizzare il modificatore **final**

```java
final double IVA = 0.22;
```

* Il modificatore **final** trasforma la variabile in una costante
* Il compilatore si occuperà di controllare che il valore delle costanti non venga **mai modificato** (impedisce di assegnare un nuovo valore) dopo essere stato inizializzato.
* Aggiungere il modificatore **final** non cambia funzionamento programma, ma serve a prevenire errori di programmazione
* Si chiede al compilatore di controllare che una variabile non venga ri-assegnata per sbaglio
* Sapendo che una variabile non cambierà mai valore, il compilatore può anche eseguire delle **ottimizzazioni** sull'uso di tale variabile.
* Il modificatore final viene utilizzato anche in altri contesti (per esempio nei metodi)

---

## L'attributo final

### Definisce un dato elemento come non più modificabile

* Applicato a variabile la trasforma in costante
* Applicato a un metodo
  * Ne impedisce l'overriding in classi derivate
  * Ne rende possibile l'inlining (binding statico - più efficiente)
* Applicato a una classe
  * Impedisce di derivare da essa altre classi (la classe deve essere una foglia dell'albero di ereditarietà)

---

### Input dall'utente

* Per ricevere valori in input dall'utente si può usare la classe Scanner, contenuta nel package **java.util**
* La classe Scanner deve essere richiamata usando la direttiva import prima dell'inizio del corpo della classe

* [raccolta esempi](https://github.com/maboglia/CorsoJava/blob/master/esempi/00_variabili_costanti.md)
* [altri esempi](https://github.com/maboglia/CorsoJava/tree/master/esempi/01_base/02_variabili)


---

**Domande:**

1. Il termine "variabile di istanza" è un altro nome per ___.
   * Risposta: Variabile membro.

---

2. Il termine "variabile di classe" è un altro nome per ___.
   * Risposta: Variabile statica.

---

3. Una variabile locale memorizza uno stato temporaneo; è dichiarata all'interno di un ___.
   * Risposta: Metodo.

---

4. Una variabile dichiarata tra la parentesi di apertura e chiusura della firma di un metodo è chiamata ___.
   * Risposta: Parametro.

---

5. Quali sono gli otto tipi di dati primitivi supportati dal linguaggio di programmazione Java?
   * Risposta:
     * byte
     * short
     * int
     * long
     * float
     * double
     * char
     * boolean

---

6. Le stringhe di caratteri sono rappresentate dalla classe ___.
   * Risposta: Stringa.

---

7. Un ___ è un oggetto contenitore che tiene un numero fisso di valori di un singolo tipo.
   * Risposta: Array.

---

**Esercizi:**

1. Crea un piccolo programma che definisce alcuni campi. Prova a creare alcuni nomi di campi illegali e verifica quale tipo di errore il compilatore produce. Usa le regole e le convenzioni di denominazione come guida.

---

```java
public class EsempioNomiCampi {
    // Nomi di campi legali
    int nomeCampoValido;
    String altroNomeCampoValido;

    // Nomi di campi illegali (decommenta per vedere gli errori del compilatore)
    // int 123NomeCampoIllegale;  // Errore: gli identificatori devono iniziare con una lettera o un underscore
    // double nome Campo Illegale;  // Errore: gli spazi non sono consentiti negli identificatori
    // float $nomeCampoIllegale;  // Errore: '$' non è un carattere valido per un identificatore
}
```

---

2. Nel programma creato nell'Esercizio 1, prova a lasciare i campi non inizializzati e stampa i loro valori. Prova la stessa cosa con una variabile locale e verifica quale tipo di errori del compilatore puoi produrre. Conoscere gli errori comuni del compilatore renderà più facile riconoscere bug nel tuo codice.

---

```java
public class EsempioInizializzazioneVariabili {
    // Campi
    int campoNonInizializzato;  // Il compilatore fornirà un valore predefinito (0 per int)

    public void stampaValori() {
        // Variabile locale
        int variabileLocaleNonInizializzata;
        
        // Decommentare la riga successiva causerà un errore del compilatore
        // System.out.println(variabileLocaleNonInizializzata);  // Errore: la variabile potrebbe non essere stata inizializzata

        System.out.println("Campo Non Inizializzato: " + campoNonInizializzato);
    }
}
```

Questi esercizi dimostrano l'importanza di seguire le convenzioni di denominazione e di inizializzare le variabili prima di utilizzarle per evitare errori di compilazione.
