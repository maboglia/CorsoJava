# Esempio di codice JavaFX in cui una **Line** viene fatta ruotare cliccando su un **Button**:

```java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.animation.RotateTransition;
import javafx.util.Duration;

public class LineRotationExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Creazione della linea
        Line line = new Line();
        line.setStartX(150);
        line.setStartY(50);
        line.setEndX(150);
        line.setEndY(250);
        line.setStroke(Color.DARKBLUE);
        line.setStrokeWidth(5);

        // Creazione del pulsante
        Button rotateButton = new Button("Ruota Linea");
        rotateButton.setLayoutX(125);
        rotateButton.setLayoutY(270);

        // Aggiunta dell'azione al pulsante
        rotateButton.setOnAction(e -> {
            // Creazione di una transizione per la rotazione
            RotateTransition rotate = new RotateTransition(Duration.seconds(1), line);
            rotate.setByAngle(90);  // Ruota di 90 gradi
            rotate.setCycleCount(1);  // Esegui una volta
            rotate.play();  // Avvia l'animazione
        });

        // Creazione del layout
        Pane root = new Pane();
        root.getChildren().addAll(line, rotateButton);

        // Creazione della scena
        Scene scene = new Scene(root, 300, 350, Color.LIGHTGRAY);

        // Configurazione della finestra
        primaryStage.setTitle("Line Rotation Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
```

### Spiegazione:
1. **Linea**:
   - Una linea verticale è creata dalle coordinate (150, 50) a (150, 250) con uno spessore di 5 pixel e colore blu scuro.

2. **Pulsante**:
   - Un pulsante etichettato "Ruota Linea" viene posizionato sotto la linea usando le coordinate di layout.

3. **Transizione di rotazione**:
   - Un'istanza di `RotateTransition` viene creata per la linea:
     - `Duration.seconds(1)`: La rotazione dura 1 secondo.
     - `setByAngle(90)`: La linea ruota di 90 gradi.
     - `play()`: Avvia l'animazione quando il pulsante viene premuto.

4. **Layout e scena**:
   - Tutti gli elementi (linea e pulsante) sono aggiunti a un `Pane`, e la scena viene creata con sfondo grigio chiaro.

### Output atteso:
Quando si clicca sul pulsante **"Ruota Linea"**, la linea ruoterà di 90 gradi attorno al suo centro, creando un effetto visivo fluido.

