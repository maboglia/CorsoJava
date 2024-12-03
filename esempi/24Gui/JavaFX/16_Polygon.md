# Polygon

In JavaFX, puoi creare un **`Polygon`** per disegnare una forma poligonale, come ad esempio un triangolo. Un **`Polygon`** è una classe che rappresenta un oggetto geometrico con più lati e può essere definito tramite un insieme di punti (coordinati x, y).

Per creare un triangolo, devi specificare i punti che definiscono i vertici del triangolo e aggiungerli al poligono.

### **Esempio di codice per creare un triangolo con un nodo `Polygon`:**

```java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class TriangleExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Crea un oggetto Polygon
        Polygon triangle = new Polygon();

        // Aggiungi i vertici del triangolo (x, y)
        triangle.getPoints().addAll(
            150.0, 50.0,   // Primo vertice (x1, y1)
            50.0, 200.0,   // Secondo vertice (x2, y2)
            250.0, 200.0   // Terzo vertice (x3, y3)
        );

        // Imposta il colore del triangolo
        triangle.setFill(Color.BLUE);

        // Crea un layout StackPane
        StackPane root = new StackPane();
        root.getChildren().add(triangle);

        // Crea una scena
        Scene scene = new Scene(root, 400, 400);

        // Imposta lo stage (finestra principale)
        primaryStage.setTitle("JavaFX Triangle Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
```

### **Spiegazione del codice:**
1. **Creazione del `Polygon`:** Viene creato un oggetto `Polygon` che rappresenta il triangolo.
2. **Aggiunta dei punti:** Utilizziamo `getPoints().addAll()` per aggiungere i vertici del triangolo. Ogni vertice è definito da due coordinate (x, y). Nel caso del triangolo:
   - Il primo vertice è `(150.0, 50.0)`
   - Il secondo vertice è `(50.0, 200.0)`
   - Il terzo vertice è `(250.0, 200.0)`
3. **Colore del triangolo:** Il colore del triangolo viene impostato con `setFill(Color.BLUE)` per renderlo blu.
4. **Layout e scena:** Il triangolo viene aggiunto a un layout `StackPane` e quindi associato alla scena.
5. **Finestra principale:** Lo stage viene configurato con il titolo e la scena, quindi viene mostrato con `primaryStage.show()`.

### **Risultato:**
Questo codice crea una finestra con un triangolo blu disegnato al suo interno. I vertici del triangolo sono definiti dai punti (150, 50), (50, 200) e (250, 200).