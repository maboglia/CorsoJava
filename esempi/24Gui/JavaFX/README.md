# JavaFX

## **JavaFX: Panoramica**

**JavaFX** è una piattaforma Java per lo sviluppo di applicazioni desktop e ricche interfacce utente (RIA, Rich Internet Applications). È progettata per creare applicazioni moderne, graficamente accattivanti e interattive, con supporto per diversi tipi di media e layout.

---

### **Caratteristiche principali**

1. **Grafica avanzata**:
   - Supporta grafica 2D e 3D.
   - API per forme, animazioni, effetti e trasformazioni.

2. **Interfaccia utente modulare**:
   - Struttura basata su **scene graph**: una gerarchia di nodi che rappresentano l'interfaccia utente.
   - Separazione tra logica e design (grazie a **FXML**, un file XML per definire layout).

3. **Compatibilità multimediale**:
   - Supporto nativo per immagini, audio e video.
   - Controlli personalizzabili per i media player.

4. **Responsive e cross-platform**:
   - Esegue applicazioni su Windows, macOS e Linux.
   - Risposta dinamica alle dimensioni dello schermo.

5. **Accesso al Web**:
   - Controllo `WebView` basato su WebKit per integrare contenuti web nelle applicazioni.

6. **Binding dei dati**:
   - Meccanismo per sincronizzare automaticamente proprietà dell'interfaccia e dati sottostanti.

7. **API ricche**:
   - Controlli standard (pulsanti, tabelle, alberi, slider, ecc.).
   - Temi e stili con supporto per CSS.

---

### **Architettura**

1. **Stage (Finestra principale)**:
   - Punto di partenza di ogni applicazione JavaFX.
   - Rappresenta la finestra principale dell’applicazione.

2. **Scene**:
   - Contiene un grafico ad albero dei nodi che rappresentano gli elementi dell'interfaccia utente.
   - Può essere associata a uno stage.

3. **Nodi**:
   - Unità costitutive della scena. Possono essere:
     - Contenitori (es. `VBox`, `HBox`, `GridPane`).
     - Controlli UI (es. `Button`, `TextField`).
     - Elementi grafici (es. `Rectangle`, `Circle`).

---

### **Esempio di codice semplice**

```java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloJavaFX extends Application {
    @Override
    public void start(Stage stage) {
        Button button = new Button("Cliccami!");
        button.setOnAction(e -> System.out.println("Ciao, JavaFX!"));

        StackPane root = new StackPane(button);
        Scene scene = new Scene(root, 300, 200);

        stage.setTitle("Esempio JavaFX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
```

---

### **Vantaggi**

- Interfacce utente moderne e accattivanti.
- Possibilità di utilizzare **CSS** per lo stile e **FXML** per il layout.
- Facile integrazione con altre librerie Java.
- Prestazioni elevate per grafica e animazioni.

### **Svantaggi**

- Supporto per browser deprecato (precedentemente JavaFX era usato anche per applet).
- Richiede Java 11 o superiore per il supporto attivo (il modulo `javafx` deve essere importato separatamente da Java SE 11).

---

### **Utilizzo comune**

- Applicazioni desktop interattive.
- Strumenti visuali avanzati (es. editor grafici).
- Applicazioni multimediali.

---

```text
Windows: --module-path "\path\to\javafx-sdk-15.0.1\lib" --add-modules javafx.controls,javafx.fxml

Linux/Mac: --module-path /path/to/javafx-sdk-15.0.1/lib --add-modules javafx.controls,javafx.fxml
```

Queste istruzioni si riferiscono alla configurazione dell'ambiente di sviluppo per eseguire applicazioni **JavaFX** con Java 11 o versioni successive, dove JavaFX non è più incluso nel JDK e deve essere configurato manualmente.

Ecco cosa significano le due opzioni dei **VM arguments**:

---

### **1. --module-path**

- Specifica il percorso della libreria JavaFX, dove si trovano i file `.jar` necessari.
- Questo è il **path** alla directory `lib` della tua installazione di JavaFX SDK.

- **Esempio su Windows:**

     ```text
     --module-path "C:\javafx-sdk-15.0.1\lib"
     ```

- **Esempio su Linux/Mac:**

     ```text
     --module-path /home/utente/javafx-sdk-15.0.1/lib
     ```

- Senza questo parametro, Java non sarà in grado di trovare i moduli richiesti per eseguire il tuo programma JavaFX.

---

### **2. --add-modules**

- Specifica i moduli JavaFX che devono essere inclusi nell'applicazione.
- In questo caso, i moduli indicati sono:
  - `javafx.controls`: Contiene controlli UI come pulsanti, etichette, slider, ecc.
  - `javafx.fxml`: Permette di utilizzare file **FXML** per definire il layout dell'interfaccia.

- **Esempio completo:**

     ```text
     --add-modules javafx.controls,javafx.fxml
     ```

---

### **Come configurare correttamente**

#### **Per eseguire un'applicazione JavaFX:**

   1. Scarica il **JavaFX SDK** dalla pagina ufficiale di [Gluon](https://gluonhq.com/products/javafx/).
   2. Scompatta il file scaricato e individua la directory `lib`.
   3. Configura i **VM arguments** nel tuo IDE (ad esempio IntelliJ IDEA o Eclipse):
      - Vai nelle impostazioni di esecuzione della tua applicazione.
      - Inserisci i seguenti argomenti nelle opzioni della JVM:

         **Windows**:

         ```text
         --module-path "C:\path\to\javafx-sdk-15.0.1\lib" --add-modules javafx.controls,javafx.fxml
         ```

         **Linux/Mac**:

         ```text
         --module-path /path/to/javafx-sdk-15.0.1/lib --add-modules javafx.controls,javafx.fxml
         ```

#### **Per compilare ed eseguire da terminale:**

- **Compilazione:**

     ```bash
     javac --module-path /path/to/javafx-sdk-15.0.1/lib --add-modules javafx.controls,javafx.fxml NomeFile.java
     ```

- **Esecuzione:**

     ```bash
     java --module-path /path/to/javafx-sdk-15.0.1/lib --add-modules javafx.controls,javafx.fxml NomeFile
     ```

---

### **Cosa succede senza questi argomenti?**

Se non configuri correttamente il `module-path` e `add-modules`, otterrai errori come:

- **"Module not found"**: perché il runtime non sa dove trovare i moduli JavaFX.
- **ClassNotFoundException**: se provi a utilizzare classi JavaFX (es. `Stage`, `Scene`) senza specificare i moduli richiesti.


---

### Esempio di codice che genera una finestra

```java
//Stage stage = new Stage();
Group root = new Group();
Scene scene = new Scene(root, Color.BLACK);

Image icon = new Image("icon.png");
stage.getIcons().add(icon);
stage.setTitle("Stage Demo Program w00t w00t");
stage.setWidth(420);
stage.setHeight(420);
stage.setResizable(false);
//stage.setX(50);
//stage.setY(50);

stage.setFullScreen(true);
stage.setFullScreenExitHint("YOU CAN'T ESCAPE unless you press q");
stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));

stage.setScene(scene);
stage.show();
```

---

#### Ecco cosa fa il codice mostrato

1. **Creazione della finestra principale (`Stage`)**:
   - Un gruppo (`Group`) viene usato come radice della scena.
   - La scena (`Scene`) viene impostata con un colore di sfondo nero.

2. **Impostazioni dello stage**:
   - Un'icona viene aggiunta allo stage tramite `stage.getIcons().add(icon)`.
   - Il titolo della finestra è impostato con `setTitle("Stage Demo Program w00t w00t")`.
   - Larghezza e altezza sono impostate a 420 pixel.
   - La finestra è resa non ridimensionabile (`setResizable(false)`).
   - Alcune righe sono commentate, presumibilmente per non spostare lo stage manualmente (`setX` e `setY`).

3. **Modalità schermo intero**:
   - Lo stage è impostato in modalità schermo intero con `setFullScreen(true)`.
   - Un messaggio di uscita personalizzato viene mostrato per informare che si può uscire solo con il tasto `q`.
   - La combinazione di tasti per uscire dalla modalità schermo intero è impostata a `q`.

4. **Visualizzazione**:
   - La scena è collegata allo stage con `setScene(scene)`.
   - La finestra viene mostrata con `stage.show()`.

