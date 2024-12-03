# Circle

In JavaFX, la classe **`Circle`** viene utilizzata per creare un cerchio. Il cerchio può essere definito tramite il suo **raggio** e la sua **posizione centrale** (coordinati x, y).

### **Esempio di codice per creare un cerchio con un nodo `Circle`:**

```java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CircleExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Crea un cerchio con raggio 50 e posizione centrale (150, 150)
        Circle circle = new Circle();
        circle.setCenterX(150);  // Posizione X del centro
        circle.setCenterY(150);  // Posizione Y del centro
        circle.setRadius(50);    // Imposta il raggio del cerchio

        // Imposta il colore di riempimento e il bordo
        circle.setFill(Color.GREEN);     // Colore di riempimento
        circle.setStroke(Color.BLACK);   // Colore del bordo
        circle.setStrokeWidth(2);        // Larghezza del bordo

        // Crea un layout StackPane
        StackPane root = new StackPane();
        root.getChildren().add(circle);

        // Crea una scena
        Scene scene = new Scene(root, 400, 400);

        // Imposta lo stage (finestra principale)
        primaryStage.setTitle("JavaFX Circle Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
```

### **Spiegazione del codice:**
1. **Creazione del `Circle`:** Un oggetto `Circle` viene creato senza parametri iniziali. Successivamente, impostiamo le sue proprietà:
   - **`setCenterX(150)`** e **`setCenterY(150)`**: Definiscono la posizione centrale del cerchio nelle coordinate x e y.
   - **`setRadius(50)`**: Imposta il raggio del cerchio a 50 pixel.
2. **Colore di riempimento e bordo:** 
   - **`setFill(Color.GREEN)`**: Imposta il colore di riempimento del cerchio a verde.
   - **`setStroke(Color.BLACK)`**: Imposta il colore del bordo a nero.
   - **`setStrokeWidth(2)`**: Imposta la larghezza del bordo a 2 pixel.
3. **Layout e scena:** Il cerchio viene aggiunto a un layout `StackPane` e viene associato alla scena.
4. **Finestra principale:** Lo stage viene configurato con il titolo e la scena, quindi viene mostrato con `primaryStage.show()`.

### **Risultato:**
Questo codice crea una finestra con un cerchio verde con un bordo nero e un raggio di 50 pixel, posizionato nel centro della finestra (150, 150).