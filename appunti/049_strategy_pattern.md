# Strategy Pattern

Il "Pattern Strategy" (Modello di Strategia) è un design pattern comportamentale che consente di definire una famiglia di algoritmi, incapsularli e renderli intercambiabili tra loro. Questo pattern consente a un cliente di scegliere dinamicamente un algoritmo specifico da utilizzare tra diversi algoritmi.

Ecco come funziona il "Pattern Strategy":

---


1. **Definizione dell'interfaccia di strategia:**
   - Si definisce un'interfaccia o una classe astratta che rappresenta il comportamento generale degli algoritmi. Questa interfaccia contiene uno o più metodi che saranno implementati dalle strategie concrete.

   ```java
   public interface Strategy {
       void execute();
   }
   ```

---


2. **Implementazione delle strategie concrete:**
   - Si creano classi che implementano l'interfaccia definita, ovvero le strategie concrete. Ogni classe rappresenta un algoritmo specifico.

   ```java
   public class ConcreteStrategyA implements Strategy {
       public void execute() {
           // Implementazione specifica dell'algoritmo A
       }
   }

   public class ConcreteStrategyB implements Strategy {
       public void execute() {
           // Implementazione specifica dell'algoritmo B
       }
   }
   ```

---


3. **Creazione del contesto:**
   - Si crea una classe chiamata "Context" che contiene un riferimento all'interfaccia di strategia e un metodo per eseguire l'algoritmo corrente.

   ```java
   public class Context {
       private Strategy strategy;

       public Context(Strategy strategy) {
           this.strategy = strategy;
       }

       public void executeStrategy() {
           strategy.execute();
       }
   }
   ```

---


4. **Utilizzo dinamico delle strategie:**
   - Il cliente istanzia il contesto con una strategia specifica e può cambiarla dinamicamente a runtime.

---


   ```java
   public class Client {
       public static void main(String[] args) {
           Strategy strategyA = new ConcreteStrategyA();
           Context context = new Context(strategyA);
           context.executeStrategy();  // Esegue l'algoritmo A

           Strategy strategyB = new ConcreteStrategyB();
           context.setStrategy(strategyB);
           context.executeStrategy();  // Esegue l'algoritmo B
       }
   }
   ```

---

Il "Pattern Strategy" offre una flessibilità significativa, poiché consente di modificare il comportamento del sistema senza dover modificare la classe che utilizza il comportamento. È particolarmente utile quando si ha bisogno di gestire diverse varianti di un algoritmo o quando si prevede di aggiungere nuovi algoritmi in futuro senza dover apportare modifiche sostanziali al codice esistente.