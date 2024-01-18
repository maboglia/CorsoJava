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
