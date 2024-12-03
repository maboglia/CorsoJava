# Group

In JavaFX, il **`Group`** è un contenitore (o nodo composito) che serve per raggruppare altri nodi. È una classe che permette di raggruppare più nodi (come forme, immagini, etichette, pulsanti, ecc.) in un unico oggetto, in modo da poterli gestire collettivamente come se fossero un singolo nodo. Questo è utile per applicare trasformazioni, stili o eventi su più nodi contemporaneamente, senza doverli gestire singolarmente.

### **Funzioni principali di `Group`:**
1. **Raggruppare nodi**: Puoi aggiungere vari nodi (ad esempio forme, etichette, immagini) a un oggetto `Group`, e poi trattare l'intero gruppo come un singolo oggetto.
2. **Gestire trasformazioni**: Puoi applicare trasformazioni (come rotazioni, traslazioni, scale) all'intero gruppo, risparmiando tempo e codice.
3. **Stili e eventi**: Applicando stili o gestendo eventi su un `Group`, questi si propagano a tutti i nodi contenuti al suo interno.
4. **Composizione di scene complesse**: È molto utile quando vuoi costruire scene complesse in cui i nodi devono essere raggruppati per facilitare la gestione.

### **Esempio di uso del `Group`:**

```java
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class GroupExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Crea un cerchio e un rettangolo
        Circle circle = new Circle(100, 100, 50, Color.RED);
        Rectangle rectangle = new Rectangle(50, 50, 200, 100);
        rectangle.setFill(Color.BLUE);

        // Crea un Group e aggiungi il cerchio e il rettangolo
        Group group = new Group(circle, rectangle);

        // Crea una scena con il Group
        Scene scene = new Scene(group, 400, 300);

        // Imposta la scena e mostra la finestra
        primaryStage.setTitle("Esempio di Group in JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
```

### **Cosa fa l'esempio:**
- Abbiamo creato un cerchio (`Circle`) e un rettangolo (`Rectangle`).
- Questi due nodi vengono aggiunti a un `Group` (cioè, li raggruppiamo insieme).
- Il `Group` viene poi aggiunto a una `Scene`, e la scena viene mostrata in una finestra.

In questo esempio, il cerchio e il rettangolo si comportano come se fossero un unico nodo, ma possono essere manipolati singolarmente se necessario.

### **Principali vantaggi nell'uso di `Group`:**

1. **Trasformazioni collettive**: Se desideri applicare una trasformazione come la rotazione a più nodi, puoi farlo facilmente applicando la trasformazione al `Group` invece che a ciascun nodo singolarmente.

   **Esempio di rotazione del gruppo:**
   ```java
   group.setRotate(45); // Ruota il gruppo di 45 gradi
   ```

2. **Semplicità di gestione**: Piuttosto che gestire singolarmente ogni nodo, puoi aggiungere tutto a un `Group` e gestirlo come una singola entità, migliorando la leggibilità e la manutenzione del codice.

3. **Semplifica eventi e stili**: Un `Group` può essere utilizzato per gestire eventi o stili comuni per tutti i nodi al suo interno.

### **Limitazioni:**
- **Non interattivo**: Il `Group` non gestisce interazioni utente come clic, mouseover, ecc. Per tali scopi, bisogna utilizzare altri contenitori o direttamente i nodi, se necessario.
- **Semplice contenitore**: Il `Group` è una semplice collezione di nodi, quindi non gestisce layout complessi o allineamenti, come avviene con contenitori come `VBox`, `HBox`, `GridPane`, ecc.

In sintesi, **`Group`** è uno strumento potente per organizzare e manipolare insieme più nodi in un'applicazione JavaFX, ma per gestire la disposizione automatica dei nodi o layout complessi, è meglio utilizzare contenitori di layout specifici.