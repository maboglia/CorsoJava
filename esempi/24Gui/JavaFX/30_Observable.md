# Observable

In JavaFX, **`Observable`** è un concetto fondamentale per la gestione dell'aggiornamento dinamico dell'interfaccia utente. Si tratta di una tecnica che permette di **monitorare** e **rispondere ai cambiamenti** nei dati, in modo che l'interfaccia utente possa essere aggiornata automaticamente quando i dati sottostanti cambiano.

### **Cos'è `Observable`?**

In JavaFX, un oggetto **`Observable`** è un oggetto che può essere **monitorato** da altre entità (tipicamente da `Observer` o **`Listener`**) per rilevare modifiche. Questo è il cuore del **data-binding**, che permette di sincronizzare il modello dei dati con la vista (interfaccia utente) senza dover scrivere esplicitamente codice per aggiornare l'interfaccia quando i dati cambiano.

Quando un oggetto **`Observable`** cambia (ad esempio, una variabile cambia valore), gli oggetti che lo **osservano** vengono notificati automaticamente, così da poter aggiornare la loro visualizzazione in tempo reale.

### **Uso di `Observable` in JavaFX**

JavaFX fornisce un'implementazione di `Observable` tramite diverse classi. La più comune è la classe **`ObservableValue`**, che rappresenta un valore che può essere monitorato per i cambiamenti.

#### **1. `ObservableList`**
Un **`ObservableList`** è una lista che notifica gli osservatori quando vengono aggiunti, rimossi o modificati elementi. È molto utile per creare interfacce utente dinamiche, come ad esempio una lista di elementi che cambia in risposta a interazioni dell'utente.

**Esempio di `ObservableList`:**

```java
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ObservableListExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Crea una ObservableList
        ObservableList<String> items = FXCollections.observableArrayList();
        items.add("Elemento 1");
        items.add("Elemento 2");
        items.add("Elemento 3");

        // Crea una ListView che osserva la ObservableList
        ListView<String> listView = new ListView<>(items);

        // Aggiungi un elemento alla lista (modifica la lista)
        items.add("Elemento 4");

        StackPane root = new StackPane();
        root.getChildren().add(listView);

        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("ObservableList Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
```

In questo esempio, ogni volta che aggiungi un elemento alla `ObservableList`, la `ListView` si aggiorna automaticamente per riflettere la modifica.

#### **2. `ObservableValue`**
**`ObservableValue`** è un altro tipo di oggetto che è utile per monitorare un singolo valore. Gli oggetti che implementano questa interfaccia possono notificare gli osservatori quando il loro valore cambia.

**Esempio di `ObservableValue`:**

```java
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ObservableValueExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Crea un oggetto ObservableValue (un valore osservabile)
        Slider slider = new Slider(0, 100, 50);

        // Aggiungi un ChangeListener per monitorare le modifiche del valore del slider
        slider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                System.out.println("Il valore del slider è cambiato: " + newValue);
            }
        });

        StackPane root = new StackPane();
        root.getChildren().add(slider);

        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("ObservableValue Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
```

In questo esempio, il **`slider.valueProperty()`** è un **`ObservableValue`** che notifica quando il valore dello slider cambia. Quando il valore cambia, viene invocato il metodo `changed`, che stampa il nuovo valore del slider.

#### **3. `ObservableMap`**
**`ObservableMap`** è una mappa che consente di osservare cambiamenti nei suoi valori. È utile quando si desidera mantenere traccia di un set di coppie chiave-valore che può essere modificato nel tempo.

---

### **Vantaggi di usare `Observable` in JavaFX:**
1. **Data Binding**: Consente di sincronizzare automaticamente l'interfaccia utente con i dati sottostanti, eliminando la necessità di aggiornamenti manuali quando i dati cambiano.
2. **Efficienza**: Gli aggiornamenti vengono propagati in modo efficiente a tutte le parti dell'interfaccia utente che osservano un determinato valore.
3. **Pulizia del codice**: Elimina la necessità di scrivere codice esplicito per aggiornare manualmente ogni parte dell'interfaccia utente in risposta a cambiamenti nei dati.

---

### **Come funziona il modello di osservazione (Observer pattern)**

JavaFX utilizza il **Observer Pattern** attraverso le interfacce **`Observable`** e **`Observer`** (o `ChangeListener` in JavaFX) per implementare una comunicazione in tempo reale tra i dati e la vista. In pratica:

1. Gli oggetti **`Observable`** (come `ObservableList`, `ObservableValue`, ecc.) memorizzano il loro stato.
2. Gli oggetti **`Observer`** (come i `ChangeListener`) si **registrano** per essere notificati dei cambiamenti.
3. Quando un oggetto **`Observable`** cambia, notifica tutti gli **`Observer`** registrati, che reagiscono a questi cambiamenti.

### **Conclusione**
In JavaFX, il concetto di **`Observable`** è essenziale per la costruzione di applicazioni reattive, in cui i dati e l'interfaccia utente sono strettamente sincronizzati. Usando `ObservableList`, `ObservableValue` e altre strutture simili, puoi creare interfacce utente dinamiche che rispondono automaticamente ai cambiamenti nei dati, migliorando l'efficienza e la manutenibilità del codice.