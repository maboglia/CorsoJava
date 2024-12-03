# nodo **Line** in JavaFX 

```java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class LineNodeExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Creazione del nodo Line
        Line line = new Line();

        // Impostazione delle coordinate di partenza e arrivo
        line.setStartX(50); // Punto iniziale X
        line.setStartY(50); // Punto iniziale Y
        line.setEndX(300);  // Punto finale X
        line.setEndY(200);  // Punto finale Y

        // Proprietà di stile
        line.setStroke(Color.DARKRED);  // Colore della linea
        line.setStrokeWidth(5);        // Spessore della linea
        line.setOpacity(0.8);          // Opacità
        line.getStrokeDashArray().addAll(10.0, 5.0); // Linea tratteggiata (10 pixel linea, 5 pixel spazio)

        // Contenitore della linea
        Pane root = new Pane(line);
        Scene scene = new Scene(root, 400, 300, Color.LIGHTGRAY);

        // Configurazione della finestra
        primaryStage.setTitle("Esempio di nodo Line");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
```

### Spiegazione:
1. **Creazione della linea**:
   - La linea viene creata con il costruttore vuoto `new Line()`, e poi le coordinate iniziali e finali sono impostate con i metodi `setStartX`, `setStartY`, `setEndX` e `setEndY`.

2. **Proprietà configurate**:
   - `setStroke(...)`: Colore della linea.
   - `setStrokeWidth(...)`: Spessore della linea.
   - `setOpacity(...)`: Trasparenza della linea (da 0 = invisibile a 1 = pienamente visibile).
   - `getStrokeDashArray().addAll(...)`: Crea una linea tratteggiata; il primo valore è la lunghezza del tratto, il secondo è la lunghezza dello spazio.

3. **Aggiunta al layout**:
   - La linea è aggiunta a un `Pane`, che consente di posizionarla liberamente nella scena.

### Output atteso:
Una finestra con sfondo grigio chiaro che mostra una linea rosso scuro, spessa 5 pixel, con tratteggio (10 pixel di tratto seguiti da 5 pixel di spazio), che va dalle coordinate (50, 50) a (300, 200).

