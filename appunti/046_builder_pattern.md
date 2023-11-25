# Builder Pattern

Il **Builder Pattern** è un design pattern creazionale che fornisce una soluzione per la creazione di oggetti complessi passo dopo passo. Questo pattern è utile quando un oggetto ha un gran numero di parametri opzionali e costruire un costruttore con tutte le possibili combinazioni diventerebbe ingombrante e poco pratico.

### Componenti del Builder Pattern:

1. **Product (Prodotto):**
   - Rappresenta l'oggetto complesso che vogliamo costruire.

    ```java
    public class Product {
        private String part1;
        private String part2;
        // Altri attributi

        // Metodi getter e setter
    }
    ```

2. **Builder (Costruttore):**
   - Interfaccia dichiarante i metodi per costruire parti diverse dell'oggetto.

    ```java
    public interface Builder {
        Builder buildPart1(String part1);
        Builder buildPart2(String part2);
        // Altri metodi di costruzione
        Product getResult();
    }
    ```

3. **ConcreteBuilder (Costruttore Concreto):**
   - Implementa l'interfaccia Builder e fornisce un'implementazione specifica per costruire l'oggetto.

    ```java
    public class ConcreteBuilder implements Builder {
        private Product product = new Product();

        @Override
        public Builder buildPart1(String part1) {
            product.setPart1(part1);
            return this;
        }

        @Override
        public Builder buildPart2(String part2) {
            product.setPart2(part2);
            return this;
        }

        @Override
        public Product getResult() {
            return product;
        }
    }
    ```

4. **Director (Direttore):**
   - Costruisce un oggetto utilizzando l'interfaccia Builder.

    ```java
    public class Director {
        public Product construct(Builder builder) {
            return builder
                .buildPart1("Parte 1")
                .buildPart2("Parte 2")
                // Altre parti
                .getResult();
        }
    }
    ```

### Utilizzo del Builder Pattern:

```java
public class Client {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director();

        Product product = director.construct(builder);
        // Ora product è un oggetto complesso costruito passo dopo passo
    }
}
```

In questo esempio, il `Client` utilizza un `ConcreteBuilder` per costruire un oggetto `Product` attraverso il `Director`. Il `Director` guida il processo di costruzione passo dopo passo chiamando i metodi del `Builder`. Alla fine, l'oggetto `Product` completo è ottenuto chiamando `getResult` sul `Builder`.

### Vantaggi del Builder Pattern:

1. **Separazione delle Preoccupazioni:**
   - Separa la costruzione di un oggetto complesso dalla sua rappresentazione, consentendo la variazione indipendente di entrambi.

2. **Configurazione Flessibile:**
   - Fornisce un modo flessibile per costruire oggetti con configurazioni diverse senza dover creare una classe per ogni combinazione possibile.

3. **Chiamata Fluent:**
   - La chiamata ai metodi di costruzione può essere espressa in modo fluente, migliorando la leggibilità del codice.

4. **Riduzione di Costruttori Sovraccaricati:**
   - Evita la necessità di avere costruttori con un gran numero di parametri, semplificando la creazione di oggetti complessi.

5. **Riusabilità del Codice:**
   - Consente il riuso del codice tra diverse implementazioni di Builder, poiché il direttore può utilizzare diversi Builder concreti.

Il Builder Pattern è particolarmente utile quando si tratta di costruire oggetti con molteplici parametri opzionali e offre una soluzione elegante per gestire la complessità della costruzione di tali oggetti.