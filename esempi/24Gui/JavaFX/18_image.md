# Image

In JavaFX, la classe **`Image`** viene utilizzata per caricare e visualizzare immagini all'interno della tua applicazione. Le immagini possono essere visualizzate utilizzando la classe **`ImageView`**, che è un nodo che rappresenta un'immagine da visualizzare.

### **Esempio di codice per caricare e visualizzare un'immagine con `Image` e `ImageView`:**

```java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ImageExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Crea un oggetto Image con il percorso dell'immagine
        Image image = new Image("file:path/to/your/image.png");

        // Crea un ImageView per visualizzare l'immagine
        ImageView imageView = new ImageView(image);

        // Impostiamo le dimensioni dell'immagine (opzionale)
        imageView.setFitWidth(300);  // Larghezza
        imageView.setFitHeight(200); // Altezza
        imageView.setPreserveRatio(true); // Mantiene il rapporto di aspetto originale

        // Crea un layout StackPane e aggiungi l'ImageView
        StackPane root = new StackPane();
        root.getChildren().add(imageView);

        // Crea una scena
        Scene scene = new Scene(root, 400, 400);

        // Imposta lo stage (finestra principale)
        primaryStage.setTitle("JavaFX Image Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
```

### **Spiegazione del codice:**
1. **Caricamento dell'immagine:**
   - Creiamo un oggetto `Image` passando il percorso del file immagine come parametro. In questo caso, l'immagine è specificata come "file:path/to/your/image.png". Puoi utilizzare un percorso relativo o assoluto.
   
2. **Creazione di `ImageView`:**
   - L'oggetto `ImageView` è un nodo JavaFX che viene utilizzato per visualizzare l'immagine. Viene passato l'oggetto `Image` appena creato.
   
3. **Impostazioni dell'immagine:**
   - **`setFitWidth(300)`** e **`setFitHeight(200)`**: Impostano la larghezza e l'altezza dell'immagine per adattarla alle dimensioni desiderate.
   - **`setPreserveRatio(true)`**: Mantiene il rapporto di aspetto originale dell'immagine, evitando che venga distorta.
   
4. **Layout e scena:** L'`ImageView` viene aggiunto a un layout `StackPane`, che è un contenitore semplice che allinea i suoi figli al centro. La scena con il layout viene quindi associata allo stage.
   
5. **Finestra principale:** Lo stage viene configurato con il titolo e la scena, quindi viene mostrato con `primaryStage.show()`.

### **Altre proprietà utili di `ImageView`:**
- **`setOpacity(double opacity)`**: Imposta l'opacità dell'immagine (dove 1.0 è completamente opaco e 0.0 è completamente trasparente).
- **`setRotate(double angle)`**: Ruota l'immagine di un angolo specificato in gradi.
- **`setScaleX(double scaleX)`** e **`setScaleY(double scaleY)`**: Scala l'immagine lungo l'asse X o Y.
  
### **Risultato:**
Il codice sopra carica un'immagine dalla tua directory specificata e la visualizza all'interno di una finestra JavaFX. Se imposti il percorso dell'immagine correttamente, vedrai l'immagine ridimensionata in una finestra di 400x400 pixel.