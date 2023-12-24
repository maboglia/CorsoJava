# Annotazioni

In Java, le "annotations" (annotazioni) sono metadati associati al codice sorgente che forniscono informazioni aggiuntive o istruzioni al compilatore, all'ambiente di esecuzione o ad altre utility di sviluppo. Le annotazioni in Java iniziano con il simbolo `@` seguito dal nome dell'annotazione.

Le annotazioni possono essere utilizzate in diverse situazioni, ad esempio per fornire informazioni sulla struttura del codice, specificare configurazioni per il compilatore o l'ambiente di runtime, o addirittura per generare automaticamente codice da parte di strumenti di sviluppo.

Ecco alcune annotazioni comuni in Java:

1. **`@Override`:**
   - **Utilizzo:** Applicato a un metodo per indicare che il metodo sta effettuando l'override di un metodo nella classe genitore.
   - **Esempio:**

     ```java
     @Override
     public void myMethod() {
         // implementazione del metodo
     }
     ```

2. **`@Deprecated`:**
   - **Utilizzo:** Indica che un elemento (classe, metodo, campo) è deprecato e dovrebbe essere evitato, perché potrebbe essere rimosso in future versioni.
   - **Esempio:**

     ```java
     @Deprecated
     public class OldClass {
         // implementazione della classe
     }
     ```

3. **`@SuppressWarnings`:**
   - **Utilizzo:** Supprime i warning del compilatore per un elemento specifico o per tutto il metodo.
   - **Esempio:**

     ```java
     @SuppressWarnings("unchecked")
     public List<String> getOldList() {
         // restituisce una lista di stringhe
     }
     ```

4. **`@FunctionalInterface`:**
   - **Utilizzo:** Applicato a un'interfaccia per indicare che si tratta di un'interfaccia funzionale, cioè un'interfaccia con un unico metodo astratto.
   - **Esempio:**

     ```java
     @FunctionalInterface
     public interface MyFunctionalInterface {
         void myMethod();
     }
     ```

5. **`@Entity`, `@Column`, `@Table` (JPA Annotations):**
   - **Utilizzo:** Utilizzato nel contesto di Java Persistence API (JPA) per mappare classi Java a tabelle di database.
   - **Esempio:**

     ```java
     @Entity
     @Table(name = "employees")
     public class Employee {
         @Id
         @GeneratedValue
         private Long id;
         
         @Column(name = "employee_name")
         private String name;
     }
     ```

6. **`@Test` (JUnit Annotation):**
   - **Utilizzo:** Utilizzato nei test unitari con JUnit per indicare che un metodo è un test.
   - **Esempio:**

     ```java
     @Test
     public void testAddition() {
         assertEquals(4, calculator.add(2, 2));
     }
     ```

È importante notare che alcune annotazioni sono standard del linguaggio Java (come `@Override`), mentre altre possono provenire da librerie specifiche (come `@Entity` in JPA o `@Test` in JUnit). Le annotazioni possono anche essere create personalizzate per scopi specifici di un'applicazione o di un framework.

---

Domande:

1. **Domanda:** Cosa c'è di sbagliato nell'interfaccia seguente:

    ```java
    public interface House {
        @Deprecated
        public void open();
        public void openFrontDoor();
        public void openBackDoor();
    }
    ```

    **Risposta:** La documentazione dovrebbe riflettere il motivo per cui open è deprecato e cosa utilizzare al suo posto. Ad esempio:

    ```java
    public interface House {
        /**
         * @deprecated l'uso di open è scoraggiato, utilizzare openFrontDoor o openBackDoor al suo posto.
         */
        @Deprecated
        public void open(); 
        public void openFrontDoor();
        public void openBackDoor();
    }
    ```

2. **Domanda:** Considera questa implementazione dell'interfaccia House, mostrata nella Domanda 1.

    ```java
    public class MyHouse implements House {
        public void open() {}
        public void openFrontDoor() {}
        public void openBackDoor() {}
    }
    ```

    Se compili questo programma, il compilatore genera un avviso perché open è stato deprecato (nell'interfaccia). Cosa puoi fare per eliminare quell'avviso?

    **Risposta:** Puoi deprecare l'implementazione di open:

    ```java
    public class MyHouse implements House {
        // La documentazione è ereditata dall'interfaccia.
        @Deprecated
        public void open() {} 
        public void openFrontDoor() {}
        public void openBackDoor() {}
    }
    ```

    In alternativa, puoi sopprimere l'avviso:

    ```java
    public class MyHouse implements House { 
        @SuppressWarnings("deprecation")
        public void open() {} 
        public void openFrontDoor() {}
        public void openBackDoor() {}
    }
    ```

3. **Domanda:** Il seguente codice compila senza errori? Perché sì o no?

    ```java
    public @interface Meal { ... }

    @Meal("breakfast", mainDish="cereal")
    @Meal("lunch", mainDish="pizza")
    @Meal("dinner", mainDish="salad")
    public void evaluateDiet() { ... }
    ```

    **Risposta:** Il codice non compila. Prima di JDK 8, le annotazioni ripetibili non sono supportate. A partire da JDK 8, il codice non compila perché il tipo di annotazione Meal non è stato definito come ripetibile. Può essere corretto aggiungendo la meta-annotazione @Repeatable e definendo un tipo di annotazione contenitore:

    ```java
    public class AnnotationTest {

        public @interface MealContainer {
            Meal[] value();
        }

        @java.lang.annotation.Repeatable(MealContainer.class)
        public @interface Meal {
            String value();
            String mainDish();
        }

        @Meal(value="breakfast", mainDish="cereal")
        @Meal(value="lunch", mainDish="pizza")
        @Meal(value="dinner", mainDish="salad")
        public void evaluateDiet() { }
    }
    ```

Esercizio:

1. **Esercizio:** Definisci un tipo di annotazione per una richiesta di miglioramento con gli elementi id, synopsis, engineer e date. Specifica il valore predefinito come non assegnato per engineer e sconosciuto per date.

    **Risposta:**

    ```java
    /**
     * Descrive il tipo di annotazione Richiesta di Miglioramento (RFE).
     */
    public @interface RequestForEnhancement {
        int id();
        String synopsis();
        String engineer() default "[non assegnato]";
        String date() default "[sconosciuto]";
    }
    ```
