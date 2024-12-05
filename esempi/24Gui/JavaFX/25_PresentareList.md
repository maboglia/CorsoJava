# Metodi per stampare a video una List

Per stampare una lista in una finestra JavaFX, puoi utilizzare un nodo come **Label**, **Text**, o un contenitore come **ListView** per visualizzare gli elementi della lista. Ecco alcuni esempi:

---

### **1. Stampare una lista in una `Label` o `Text`**
Puoi convertire gli elementi della lista in una stringa formattata e mostrarli in una `Label` o in un nodo `Text`.

```java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Arrays;
import java.util.List;

public class PrintListInLabel extends Application {
    @Override
    public void start(Stage primaryStage) {
        List<String> items = Arrays.asList("Java", "Python", "C++", "JavaScript");

        // Converti la lista in una stringa
        String listAsString = String.join("\n", items);

        // Mostra la lista in una Label
        Label label = new Label("Elementi della lista:\n" + listAsString);

        VBox vbox = new VBox(label);
        vbox.setStyle("-fx-padding: 20; -fx-alignment: center;");

        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setTitle("Stampa Lista in Label");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
```

---

### **2. Usare una `ListView`**
Se vuoi visualizzare ogni elemento della lista in un componente interattivo.

```java
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Arrays;

public class PrintListInListView extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Crea una lista osservabile da un array
        ObservableList<String> items = FXCollections.observableArrayList(
                Arrays.asList("Java", "Python", "C++", "JavaScript")
        );

        // Crea una ListView e aggiungi gli elementi
        ListView<String> listView = new ListView<>(items);

        VBox vbox = new VBox(listView);
        vbox.setStyle("-fx-padding: 20;");

        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setTitle("Stampa Lista in ListView");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
```

---

### **3. Stampare con un `TextArea`**
Se vuoi mostrare la lista in una casella di testo scorrevole.

```java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Arrays;
import java.util.List;

public class PrintListInTextArea extends Application {
    @Override
    public void start(Stage primaryStage) {
        List<String> items = Arrays.asList("Java", "Python", "C++", "JavaScript");

        // Converti la lista in una stringa
        String listAsString = String.join("\n", items);

        // Crea un TextArea per visualizzare la lista
        TextArea textArea = new TextArea(listAsString);
        textArea.setEditable(false); // Rendi il TextArea non modificabile

        VBox vbox = new VBox(textArea);
        vbox.setStyle("-fx-padding: 20;");

        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setTitle("Stampa Lista in TextArea");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
```

---

### Differenze tra i metodi:
- **Label/Text**: Ideale per una lista breve e non interattiva.
- **ListView**: Ideale per liste più lunghe e per fornire funzionalità interattive.
- **TextArea**: Utile per visualizzare un blocco di testo scorrevole.
