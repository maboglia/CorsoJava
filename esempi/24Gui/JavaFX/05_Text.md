# Text

```java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TextNodeExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Creazione del nodo Text
        Text text = new Text("Benvenuto in JavaFX!");

        // Impostazione delle proprietà
        text.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.ITALIC, 20)); // Font personalizzato
        text.setFill(Color.DARKBLUE); // Colore del testo
        text.setStroke(Color.BLACK); // Colore del contorno
        text.setStrokeWidth(1.5); // Spessore del contorno
        text.setX(50); // Posizione X
        text.setY(100); // Posizione Y
        text.setUnderline(true); // Sottolinea il testo
        text.setOpacity(0.8); // Imposta opacità

        // Aggiunta del nodo Text a un contenitore
        StackPane root = new StackPane(text); // Posizionamento al centro del layout
        Scene scene = new Scene(root, 400, 300, Color.LIGHTGRAY);

        // Configurazione della finestra
        primaryStage.setTitle("Esempio di nodo Text");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
```

### Spiegazione:
1. **Proprietà personalizzate**:
   - `setFont(...)`: Imposta il font, lo stile (grassetto e corsivo) e la dimensione.
   - `setFill(...)`: Colore del testo.
   - `setStroke(...)` e `setStrokeWidth(...)`: Contorno del testo e spessore.
   - `setX(...)` e `setY(...)`: Posizione del nodo `Text` nella scena (usato principalmente in layout non gestiti come `Pane`).

2. **Altre configurazioni**:
   - `setUnderline(true)`: Rende il testo sottolineato.
   - `setOpacity(...)`: Controlla la trasparenza (0 = invisibile, 1 = pienamente visibile).

3. **Contenitore**:
   - Il testo è aggiunto a un `StackPane`, che lo posiziona automaticamente al centro della finestra.

### Output atteso:
Una finestra con sfondo grigio chiaro che mostra il testo "Benvenuto in JavaFX!" in grassetto, corsivo, sottolineato e con un contorno nero e opacità ridotta.
