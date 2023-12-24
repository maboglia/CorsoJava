# Nested classes

In Java, le "nested classes" (classi innestate) si riferiscono alla capacità di definire una classe all'interno di un'altra classe. Questa tecnica consente di organizzare e strutturare il codice in modo più logico e coerente. Le classi innestate possono essere suddivise in due categorie principali: classi interne (inner classes) e classi innestate statiche (static nested classes).

1. **Classi Interne (Inner Classes):**

   - **Definizione:** Una classe interna è dichiarata all'interno di un'altra classe. Ha accesso diretto ai membri della classe esterna, compresi quelli dichiarati privati.

   - **Esempio:**

     ```java
     class OuterClass {
         class InnerClass {
             // ...
         }
     }
     ```

   - **Utilità:**
     - Raggruppare logicamente classi utilizzate solo in un'unica posizione.
     - Aumentare l'incapsulamento permettendo a una classe interna di accedere ai membri privati della classe esterna.
     - Migliorare la leggibilità e la manutenibilità del codice.

   - **Istanziamento:**

     ```java
     OuterClass outerObject = new OuterClass();
     OuterClass.InnerClass innerObject = outerObject.new InnerClass();
     ```

2. **Classi Innestate Statiche (Static Nested Classes):**

   - **Definizione:** Una classe innestata statica è associata alla sua classe esterna, ma non ha accesso diretto ai membri non statici della classe esterna. È simile a una classe di primo livello e può essere istanziata senza creare un'istanza della classe esterna.

   - **Esempio:**

     ```java
     class OuterClass {
         static class StaticNestedClass {
             // ...
         }
     }
     ```

   - **Utilità:**
     - Incapsulamento simile a quello di una classe di primo livello per motivi di convenienza di impacchettamento.
     - Non ha accesso ai membri non statici della classe esterna.

   - **Istanziamento:**

     ```java
     OuterClass.StaticNestedClass staticNestedObject = new OuterClass.StaticNestedClass();
     ```

L'utilizzo di classi innestate è particolarmente utile quando si desidera organizzare e strutturare il codice in modo che le classi siano strettamente collegate o quando si vuole nascondere l'implementazione dettagliata di una classe all'esterno.

---

_dal manuale Oracle_

**Classi Innestate**

Il linguaggio di programmazione Java consente di definire una classe all'interno di un'altra classe. Tale classe è chiamata classe innestata ed è illustrata qui:

```java
class OuterClass {
    ...
    class NestedClass {
        ...
    }
}
```

**Terminologia**: Le classi innestate sono divise in due categorie: non statiche e statiche. Le classi innestate non statiche sono chiamate classi interne. Le classi innestate dichiarate come statiche sono chiamate classi innestate statiche.

```java
class OuterClass {
    ...
    class InnerClass {
        ...
    }
    static class StaticNestedClass {
        ...
    }
}
```

Una classe innestata è un membro della classe che la racchiude. Le classi innestate non statiche (classi interne) hanno accesso agli altri membri della classe che le racchiude, anche se sono dichiarati privati. Le classi innestate statiche non hanno accesso agli altri membri della classe che le racchiude. Come membro di OuterClass, una classe innestata può essere dichiarata privata, pubblica, protetta o con visibilità package (ricordando che le classi esterne possono essere dichiarate solo pubbliche o con visibilità package).

**Perché utilizzare Classi Innestate?**

Le ragioni convincenti per utilizzare classi innestate includono le seguenti:

1. **Raggruppamento logico:** È un modo di raggruppare logicamente classi utilizzate solo in un posto: se una classe è utile solo per un'altra classe, è logico incorporarla in quella classe e mantenerle insieme. L'annidamento di tali "classi helper" rende più ordinato il loro pacchetto.

2. **Aumenta l'incapsulamento:** Considera due classi di primo livello, A e B, dove B necessita di accesso ai membri di A che altrimenti sarebbero dichiarati privati. Nascondendo la classe B all'interno della classe A, i membri di A possono essere dichiarati privati, e B può accedervi. Inoltre, B stesso può essere nascosto dal mondo esterno.

3. **Migliora la leggibilità e manutenibilità del codice:** L'annidamento di piccole classi all'interno di classi di primo livello colloca il codice più vicino a dove viene utilizzato.

**Classi Interne**

Come i metodi e le variabili di istanza, una classe interna è associata a un'istanza della classe che la contiene e ha accesso diretto ai metodi e ai campi di quell'oggetto. Inoltre, poiché una classe interna è associata a un'istanza, non può definire alcun membro statico da sola.

Gli oggetti che sono istanze di una classe interna esistono all'interno di un'istanza della classe esterna. Considera le seguenti classi:

```java
class OuterClass {
    ...
    class InnerClass {
        ...
    }
}
```

Un'istanza di `InnerClass` può esistere solo all'interno di un'istanza di `OuterClass` e ha accesso diretto ai metodi e ai campi della sua istanza di contenimento.

Per istanziare una classe interna, è necessario prima istanziare la classe esterna. Quindi, crea l'oggetto interno all'interno dell'oggetto esterno con questa sintassi:

```java
OuterClass outerObject = new OuterClass();
OuterClass.InnerClass innerObject = outerObject.new InnerClass();
```

Ci sono due tipi speciali di classi interne: classi locali e classi anonime.

**Classi Innestate Statiche**

Come i metodi e le variabili di classe, una classe innestata statica è associata alla sua classe esterna. E come i metodi di classe statica, una classe innestata statica non può fare riferimento direttamente a variabili o metodi di istanza definiti nella classe che la contiene: può usarli solo attraverso un riferimento a un oggetto. L'esempio `Inner Class and Nested Static Class` mostra questo.
*Nota: Una classe innestata statica interagisce con i membri di istanza della sua classe esterna (e di altre classi) proprio come qualsiasi altra classe di primo livello. In effetti, una classe innestata statica è comportamentalmente una classe di primo livello che è stata annidata in un'altra classe di primo livello per comodità di impacchettamento.*

Si istanzia una classe innestata statica allo stesso modo di una classe di primo livello:

```java
StaticNestedClass staticNestedObject = new StaticNestedClass();
```

**Esempio di Classe Interna e Classe Innestata Statica**

L'esempio seguente, `OuterClass`, insieme a `TopLevelClass`, mostra a quali membri di `OuterClass` una classe interna (`InnerClass`), una classe innestata statica (`StaticNestedClass`) e una classe di primo livello (`TopLevelClass`) possono accedere:

**OuterClass.java**

```java
public class OuterClass {

    String outerField = "Outer field";
    static String staticOuterField = "Static outer field";

    class InnerClass {
        void accessMembers() {
            System.out.println(outerField);
            System.out.println(staticOuterField);
        }
    }

    static class StaticNestedClass {
        void accessMembers(OuterClass outer) {
            System.out.println(outer.outerField);
            System.out.println(staticOuterField);
        }
    }

    public static void main(String[] args) {
        System.out.println("Inner class:");
        System.out.println("------------");
        OuterClass outerObject = new OuterClass();
        OuterClass.InnerClass innerObject = outerObject.new InnerClass();
        innerObject.accessMembers();

        System.out.println("\nStatic nested class:");
        System.out.println("--------------------");
        StaticNestedClass staticNestedObject = new StaticNestedClass();        
        staticNestedObject.accessMembers(outerObject);
        
        System


Domande

1. **Domanda:** Il programma `Problem.java` non si compila. Cosa devi fare per farlo compilare? Perché?
   **Risposta:** Elimina `static` davanti alla dichiarazione della classe interna `Inner`. Una classe interna statica non ha accesso ai campi di istanza della classe esterna. Vedi `ProblemSolved.java`.

2. **Domanda:** Quali classi annidate statiche definisce `Box`?
   **Risposta:** `Box.Filler`

3. **Domanda:** Quale classe interna definisce `Box`?
   **Risposta:** `Box.AccessibleBox`

4. **Domanda:** Qual è la superclasse della classe interna di `Box`?
   **Risposta:** `[java.awt.]Container.AccessibleAWTContainer`

5. **Domanda:** Quale delle classi annidate di `Box` puoi utilizzare da qualsiasi classe?
   **Risposta:** `Box.Filler`

6. **Domanda:** Come si crea un'istanza della classe `Filler` di `Box`?
   **Risposta:** `new Box.Filler(minDimension, prefDimension, maxDimension)`

Esercizi

1. **Esercizio:** Ottieni il file `Class1.java`. Compila ed esegui `Class1`. Qual è l'output?
   **Risposta:**

   ```
   InnerClass1: getString invoked.
   InnerClass1: getAnotherString invoked.
   ```

2. **Esercizio:** Le seguenti esercitazioni prevedono la modifica della classe `DataStructure.java`, che è discussa nella sezione "Esempio di classe interna".

   - Definisci un metodo chiamato `print(DataStructureIterator iterator)`. Invoca questo metodo con un'istanza della classe `EvenIterator` in modo che esegua la stessa funzione del metodo `printEven`.

     *Suggerimento:* Queste istruzioni non compilano se le specificate nel metodo principale:

     ```java
     DataStructure ds = new DataStructure();
     ds.print(new EvenIterator());
     ```

     Il compilatore genera l'errore "non-static variable this cannot be referenced from a static context" quando incontra l'espressione `new EvenIterator()`. La classe `EvenIterator` è una classe interna non statica. Ciò significa che puoi creare un'istanza di `EvenIterator` solo all'interno di un'istanza della classe esterna `DataStructure`.

     Puoi definire un metodo in `DataStructure` che crea e restituisce una nuova istanza di `EvenIterator`.

   - Invoca il metodo `print(DataStructureIterator iterator)` in modo che stampi gli elementi che hanno un valore di indice dispari. Usa una classe anonima come argomento del metodo invece di un'istanza dell'interfaccia `DataStructureIterator`.

     *Suggerimento:* Non puoi accedere ai membri privati `SIZE` e `arrayOfInts` al di fuori della classe `DataStructure`, il che significa che non puoi accedere a questi membri privati da una classe anonima definita al di fuori di `DataStructure`.

     Puoi definire metodi che accedono ai membri privati `SIZE` e `arrayOfInts` e poi usarli nella tua classe anonima.

   - Definisci un metodo chiamato `print(java.util.Function<Integer, Boolean> iterator)` che svolga la stessa funzione di `print(DataStructureIterator iterator)`. Invoca questo metodo con una lambda expression per stampare gli elementi che hanno un valore di indice pari. Invoca nuovamente questo metodo con una lambda expression per stampare gli elementi che hanno un valore di indice dispari.

     *Suggerimento:* In questo metodo `print`, puoi attraversare gli elementi contenuti nell'array `arrayOfInts` con una espressione `for`. Per ogni valore di indice, invoca il metodo `function.apply`. Se questo metodo restituisce un valore vero per un particolare valore di indice, stampa l'elemento contenuto in quel valore di indice.

     Per invocare questo metodo `print` per stampare gli elementi che hanno un valore di indice pari, puoi specificare una lambda expression che implementa il metodo `Boolean Function.apply(Integer t)`. Questa lambda expression prende un argomento Integer (l'indice) e restituisce un valore Boolean (Boolean.TRUE se il valore dell'indice è pari, Boolean.FALSE altrimenti).

   - Definisci due metodi in modo che queste istruzioni stampino gli elementi che hanno un valore di indice pari e poi gli elementi che hanno un valore di indice dispari:

     ```java
     DataStructure ds = new DataStructure()
     // ...
     ds.print(DataStructure::isEvenIndex);
     ds.print(DataStructure::isOddIndex);
     ```

     *Suggerimento:* Crea due metodi nella classe `DataStructure` chiamati `isEven
