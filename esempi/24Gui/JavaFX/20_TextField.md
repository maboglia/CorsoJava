# TextField

Ecco un esempio di utilizzo dei nodi **TextField** e **Label** in JavaFX, con un'interazione semplice:

```java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TextFieldAndLabelExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Creazione del Label
        Label label = new Label("Inserisci il tuo nome:");

        // Creazione del TextField
        TextField textField = new TextField();
        textField.setPromptText("Nome..."); // Testo segnaposto

        // Creazione del pulsante
        Button button = new Button("Saluta");

        // Label per mostrare il messaggio di saluto
        Label greetingLabel = new Label();

        // Azione al clic sul pulsante
        button.setOnAction(e -> {
            String name = textField.getText(); // Ottieni il testo dal TextField
            if (name.isEmpty()) {
                greetingLabel.setText("Per favore, inserisci il tuo nome.");
            } else {
                greetingLabel.setText("Ciao, " + name + "!");
            }
        });

        // Layout dei nodi
        VBox vbox = new VBox(10, label, textField, button, greetingLabel);
        vbox.setStyle("-fx-padding: 20; -fx-alignment: center;");

        // Creazione della scena
        Scene scene = new Scene(vbox, 300, 200);

        // Configurazione della finestra
        primaryStage.setTitle("TextField e Label Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
```

### Spiegazione:
1. **TextField**:
   - `new TextField()`: Crea il campo di testo.
   - `setPromptText("Nome...")`: Imposta il testo segnaposto che appare quando il campo è vuoto.
   - `getText()`: Ottiene il testo inserito dall'utente.

2. **Label**:
   - `new Label("Inserisci il tuo nome:")`: Crea una semplice etichetta.
   - `setText(...)`: Modifica il testo del Label (usato per il messaggio di saluto).

3. **Interazione con Button**:
   - `button.setOnAction(...)`: Imposta un'azione per il pulsante che legge il testo dal `TextField` e lo mostra in un secondo `Label`.

4. **Layout**:
   - `VBox`: Organizza i nodi in verticale con una spaziatura di 10 pixel e padding di 20 pixel per il margine.

### Output atteso:
Una finestra con:
- Un'etichetta "Inserisci il tuo nome:"
- Un campo di testo dove inserire il nome.
- Un pulsante "Saluta".
- Una seconda etichetta che mostra un messaggio di saluto personalizzato dopo il clic sul pulsante.
