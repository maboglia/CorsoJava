# JavaFX va a teatro: Stage e Scene

In JavaFX, i concetti di **`Stage`** e **`Scene`** sono fondamentali per la creazione di un'applicazione grafica. In pratica, un'applicazione JavaFX si sviluppa creando una o più **Scene** all'interno di uno **Stage**, che rappresentano rispettivamente il **contenitore della finestra** e il **contenuto** da visualizzare nella finestra.

### **1. Stage**
Un **`Stage`** rappresenta la finestra principale (o una finestra secondaria) dell'applicazione. È l'oggetto che gestisce la visualizzazione dell'interfaccia utente, comprese le dimensioni, il titolo e altre caratteristiche della finestra. Il **`Stage`** è la "scena" in senso generale, dove vengono visualizzati i contenuti.

#### **Caratteristiche principali di un `Stage`:**
- **Finestra principale**: Ogni applicazione JavaFX ha uno `Stage` principale, che rappresenta la finestra dell'applicazione.
- **Proprietà della finestra**: Lo `Stage` ha proprietà come la dimensione, il titolo, la visibilità, ecc.
- **Rendere la finestra visibile**: Per mostrare lo `Stage`, bisogna chiamare il metodo `show()`.
- **Gestione delle finestre secondarie**: È possibile creare più `Stage`, ad esempio per finestre secondarie come modali, pop-up o dialoghi.

#### **Esempio di utilizzo di `Stage`:**
```java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class StageExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Crea un pulsante
        Button btn = new Button("Click me");
        btn.setOnAction(e -> System.out.println("Button clicked"));

        // Crea un layout (contenitore)
        StackPane root = new StackPane();
        root.getChildren().add(btn);

        // Crea una scena e aggiungila allo stage
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("JavaFX Stage Example"); // Imposta il titolo della finestra
        primaryStage.setScene(scene); // Imposta la scena dello stage
        primaryStage.show(); // Mostra la finestra
    }

    public static void main(String[] args) {
        launch(args);
    }
}
```
In questo esempio:
- Creiamo una finestra (lo `Stage`) e impostiamo una scena (lo `Scene`) che contiene un pulsante.
- Il pulsante è aggiunto al contenitore di layout (`StackPane`).
- La scena viene associata allo `Stage` tramite `setScene(scene)`, quindi la finestra viene mostrata con `show()`.

### **2. Scene**
Una **`Scene`** rappresenta il contenuto visibile dentro uno `Stage`. Ogni scena è composta da una struttura gerarchica di nodi (come bottoni, etichette, immagini, forme, layout, ecc.), che definiscono cosa appare nell'interfaccia utente.

#### **Caratteristiche principali di una `Scene`:**
- **Contenuto della finestra**: La scena contiene tutti gli elementi grafici (nodi) che compongono l'interfaccia utente.
- **Oggetti grafici**: Può contenere oggetti come pulsanti, etichette, forme, tabelle, ecc., e disporli tramite un layout.
- **Layout**: Può usare vari contenitori per organizzare i nodi (ad esempio `HBox`, `VBox`, `GridPane`, `StackPane`, ecc.).
- **Interazione con l'utente**: Può gestire eventi, come clic del mouse, tasti premuti, ecc.

#### **Esempio di utilizzo di `Scene`:**
In un'applicazione, puoi avere più scene, ma in un dato momento può esserci solo una scena visibile per ogni `Stage`. Puoi passare da una scena all'altra.

```java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class SceneExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Crea un pulsante
        Button btn = new Button("Change Scene");

        // Crea il contenuto della prima scena
        StackPane root1 = new StackPane();
        root1.getChildren().add(btn);
        Scene scene1 = new Scene(root1, 300, 250);

        // Crea il contenuto della seconda scena
        StackPane root2 = new StackPane();
        root2.getChildren().add(new Button("New Scene"));
        Scene scene2 = new Scene(root2, 300, 250);

        // Quando il pulsante è premuto, cambia la scena
        btn.setOnAction(e -> primaryStage.setScene(scene2));

        // Imposta la scena iniziale dello stage
        primaryStage.setTitle("JavaFX Scene Example");
        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
```
In questo esempio:
- Creiamo due scene (`scene1` e `scene2`), ognuna con un contenuto diverso.
- Quando l'utente clicca sul pulsante nella `scene1`, la scena cambia passando a `scene2`.

### **Differenza tra Stage e Scene:**

1. **`Stage`** è la **finestra** (o il contenitore principale) dell'applicazione, che rappresenta l'intero spazio in cui viene mostrato il contenuto.
2. **`Scene`** è il **contenuto** che viene visualizzato all'interno di uno `Stage`. Ogni scena contiene una struttura di nodi che definisce l'interfaccia utente.

### **Ciclo di vita di Stage e Scene:**
1. Quando un'applicazione JavaFX viene avviata, viene creato un **`Stage`** principale.
2. All'interno di questo `Stage`, viene creata una **`Scene`**, che definisce il layout e i nodi da visualizzare.
3. È possibile cambiare la scena in qualsiasi momento, ma un solo `Stage` può essere visibile alla volta. Puoi avere **scene multiple** ma solo una scena per stage visibile.

### **Conclusione:**
- **`Stage`** è la finestra in cui la tua applicazione JavaFX viene visualizzata.
- **`Scene`** è il contenuto visualizzato all'interno dello `Stage`.
  
Entrambi sono concetti chiave per costruire interfacce utente dinamiche e interattive in JavaFX, dove puoi avere più scene per diverse viste e gestire il tutto attraverso il `Stage`.