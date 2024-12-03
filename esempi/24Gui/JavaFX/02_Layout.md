# Layout

In JavaFX, i layout sono responsabili della gestione del posizionamento e della dimensione dei nodi nella scena. Ecco un elenco dei principali layout disponibili, con un esempio per ciascuno:

---

### **1. Pane**
Un contenitore che consente di posizionare i nodi liberamente con coordinate assolute.

```java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class PaneExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        Rectangle rect1 = new Rectangle(50, 50, 100, 100);
        rect1.setFill(Color.CORNFLOWERBLUE);

        Rectangle rect2 = new Rectangle(200, 100, 120, 80);
        rect2.setFill(Color.DARKSALMON);

        pane.getChildren().addAll(rect1, rect2);

        Scene scene = new Scene(pane, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Pane Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
```

---

### **2. StackPane**
Posiziona i nodi impilati l'uno sopra l'altro, centrati.

```java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class StackPaneExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        StackPane stackPane = new StackPane();

        Circle circle = new Circle(100, Color.LIGHTBLUE);
        Text text = new Text("Ciao JavaFX!");
        text.setFill(Color.DARKBLUE);

        stackPane.getChildren().addAll(circle, text);

        Scene scene = new Scene(stackPane, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("StackPane Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
```

---

### **3. VBox**
Posiziona i nodi in una colonna verticale.

```java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        VBox vbox = new VBox(10); // Spaziatura di 10 tra i nodi

        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");

        vbox.getChildren().addAll(btn1, btn2, btn3);

        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("VBox Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
```

---

### **4. HBox**
Posiziona i nodi in una riga orizzontale.

```java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBoxExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        HBox hbox = new HBox(10); // Spaziatura di 10 tra i nodi

        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");

        hbox.getChildren().addAll(btn1, btn2, btn3);

        Scene scene = new Scene(hbox, 400, 100);
        primaryStage.setScene(scene);
        primaryStage.setTitle("HBox Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
```

---

### **5. BorderPane**
Suddivide lo spazio in 5 regioni: top, bottom, left, right, center.

```java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        BorderPane borderPane = new BorderPane();

        Button topButton = new Button("Top");
        Button bottomButton = new Button("Bottom");
        Button leftButton = new Button("Left");
        Button rightButton = new Button("Right");
        Button centerButton = new Button("Center");

        borderPane.setTop(topButton);
        borderPane.setBottom(bottomButton);
        borderPane.setLeft(leftButton);
        borderPane.setRight(rightButton);
        borderPane.setCenter(centerButton);

        Scene scene = new Scene(borderPane, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("BorderPane Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
```

---

### **6. GridPane**
Organizza i nodi in una griglia con righe e colonne.

```java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane = new GridPane();

        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");
        Button btn4 = new Button("Button 4");

        gridPane.add(btn1, 0, 0); // Colonna 0, Righe 0
        gridPane.add(btn2, 1, 0); // Colonna 1, Righe 0
        gridPane.add(btn3, 0, 1); // Colonna 0, Righe 1
        gridPane.add(btn4, 1, 1); // Colonna 1, Righe 1

        Scene scene = new Scene(gridPane, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("GridPane Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
```
