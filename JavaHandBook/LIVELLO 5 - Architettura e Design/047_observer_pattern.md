# Observer Pattern

L'**Observer Pattern** è un design pattern comportamentale che stabilisce una dipendenza uno-a-molti tra oggetti, in modo che quando un oggetto cambia stato, tutti i suoi osservatori vengano notificati e aggiornati automaticamente. Questo pattern è utilizzato per implementare la distribuzione di eventi, la gestione degli eventi e la notifica di stato ai componenti interessati.

### Componenti dell'Observer Pattern:

1. **Subject (Soggetto):**
   - Definisce un'interfaccia per gli oggetti che possono essere osservati.

    ```java
    public interface Subject {
        void addObserver(Observer observer);
        void removeObserver(Observer observer);
        void notifyObservers();
    }
    ```

2. **ConcreteSubject (Soggetto Concreto):**
   - Implementa l'interfaccia Subject e mantiene lo stato. Notifica gli osservatori quando lo stato cambia.

    ```java
    import java.util.ArrayList;
    import java.util.List;

    public class ConcreteSubject implements Subject {
        private int state;
        private List<Observer> observers = new ArrayList<>();

        public void setState(int state) {
            this.state = state;
            notifyObservers();
        }

        @Override
        public void addObserver(Observer observer) {
            observers.add(observer);
        }

        @Override
        public void removeObserver(Observer observer) {
            observers.remove(observer);
        }

        @Override
        public void notifyObservers() {
            for (Observer observer : observers) {
                observer.update(state);
            }
        }
    }
    ```

3. **Observer (Osservatore):**
   - Definisce un'interfaccia per gli oggetti che devono essere notificati dei cambiamenti di stato nel soggetto.

    ```java
    public interface Observer {
        void update(int state);
    }
    ```

4. **ConcreteObserver (Osservatore Concreto):**
   - Implementa l'interfaccia Observer e mantiene un riferimento al soggetto. Viene notificato quando il soggetto cambia stato.

    ```java
    public class ConcreteObserver implements Observer {
        private int observerState;

        @Override
        public void update(int state) {
            observerState = state;
            System.out.println("Nuovo stato dell'osservatore: " + observerState);
        }
    }
    ```

### Utilizzo dell'Observer Pattern:

```java
public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        ConcreteObserver observer1 = new ConcreteObserver();
        ConcreteObserver observer2 = new ConcreteObserver();

        subject.addObserver(observer1);
        subject.addObserver(observer2);

        // Cambio di stato nel soggetto
        subject.setState(10);

        // Output atteso:
        // Nuovo stato dell'osservatore: 10
        // Nuovo stato dell'osservatore: 10
    }
}
```

In questo esempio, il `Client` crea un `ConcreteSubject` e due `ConcreteObserver`. Gli osservatori vengono registrati presso il soggetto. Quando il soggetto cambia stato tramite `setState`, tutti gli osservatori vengono notificati e aggiornati con il nuovo stato.

### Vantaggi dell'Observer Pattern:

1. **Decoupling:**
   - Separazione tra soggetto e osservatori, riducendo l'accoppiamento tra le classi coinvolte.

2. **Estensibilità:**
   - Nuovi osservatori possono essere aggiunti senza dover modificare il soggetto.

3. **Supporto per Broadcast:**
   - Il soggetto può notificare più osservatori contemporaneamente.

4. **Riusabilità del Codice:**
   - Gli osservatori possono essere riutilizzati tra diversi soggetti.

5. **Facilità nell'Aggiunta/Rimozione di Osservatori:**
   - Aggiungere o rimuovere osservatori è semplice grazie alle interfacce fornite.

L'Observer Pattern è spesso utilizzato in scenari in cui un oggetto deve notificare un insieme di altri oggetti quando il suo stato cambia. Questo è ampiamente usato nell'implementazione di GUI, gestione degli eventi e altri contesti in cui la notifica di cambiamenti è essenziale.