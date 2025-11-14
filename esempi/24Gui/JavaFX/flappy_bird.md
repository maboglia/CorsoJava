# 🕹️ Mini Flappy Bird – JavaFX Edition

## 🎯 Obiettivo

Creare un gioco in cui un piccolo cerchio (“l’uccellino”) deve evitare tubi in movimento.
Ogni volta che il giocatore preme la **barra spaziatrice**, l’uccellino “salta”.

---

## ⚙️ Struttura del progetto

```
src/
 └── flappy/
      └── FlappyBird.java
```

---

## 💻 Codice completo – `FlappyBird.java`

```java
package flappy;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class FlappyBird extends Application {

    private static final int WIDTH = 400;
    private static final int HEIGHT = 600;
    private static final int PIPE_WIDTH = 60;
    private static final int GAP_HEIGHT = 150;
    private static final double GRAVITY = 0.4;
    private static final double JUMP_STRENGTH = -7;

    private double birdY = HEIGHT / 2;
    private double velocity = 0;
    private boolean spacePressed = false;
    private boolean gameOver = false;
    private int score = 0;

    private final List<Pipe> pipes = new ArrayList<>();
    private final Random random = new Random();

    @Override
    public void start(Stage stage) {
        Canvas canvas = new Canvas(WIDTH, HEIGHT);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        Scene scene = new Scene(new javafx.scene.Group(canvas));
        stage.setTitle("🐦 Mini Flappy Bird");
        stage.setScene(scene);
        stage.show();

        // Gestione input tastiera
        scene.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.SPACE) {
                spacePressed = true;
                if (gameOver) {
                    resetGame();
                }
            }
        });

        scene.setOnKeyReleased(e -> {
            if (e.getCode() == KeyCode.SPACE) {
                spacePressed = false;
            }
        });

        // Loop di gioco
        new AnimationTimer() {
            long lastPipeTime = 0;

            @Override
            public void handle(long now) {
                update();
                render(gc);

                if (now - lastPipeTime > 1_800_000_000) { // ogni ~1.8s
                    addPipe();
                    lastPipeTime = now;
                }
            }
        }.start();
    }

    private void update() {
        if (gameOver) return;

        // Movimento dell’uccellino
        velocity += GRAVITY;
        birdY += velocity;

        if (spacePressed) {
            velocity = JUMP_STRENGTH;
        }

        // Aggiornamento tubi
        Iterator<Pipe> iterator = pipes.iterator();
        while (iterator.hasNext()) {
            Pipe pipe = iterator.next();
            pipe.x -= 3;

            if (pipe.x + PIPE_WIDTH < 0) {
                iterator.remove();
                score++;
            }

            // Collisione
            if (pipe.collidesWith(50, birdY)) {
                gameOver = true;
            }
        }

        // Controllo fuori schermo
        if (birdY > HEIGHT || birdY < 0) {
            gameOver = true;
        }
    }

    private void render(GraphicsContext gc) {
        // Sfondo
        gc.setFill(Color.SKYBLUE);
        gc.fillRect(0, 0, WIDTH, HEIGHT);

        // Uccellino
        gc.setFill(Color.YELLOW);
        gc.fillOval(50, birdY, 30, 30);

        // Tubi
        gc.setFill(Color.FORESTGREEN);
        for (Pipe pipe : pipes) {
            gc.fillRect(pipe.x, 0, PIPE_WIDTH, pipe.gapY);
            gc.fillRect(pipe.x, pipe.gapY + GAP_HEIGHT, PIPE_WIDTH, HEIGHT);
        }

        // Punteggio
        gc.setFill(Color.WHITE);
        gc.fillText("Score: " + score, 10, 20);

        // Game Over
        if (gameOver) {
            gc.setFill(Color.RED);
            gc.fillText("GAME OVER! Premi SPAZIO per riprovare.", 50, HEIGHT / 2);
        }
    }

    private void addPipe() {
        int gapY = 100 + random.nextInt(HEIGHT - GAP_HEIGHT - 200);
        pipes.add(new Pipe(WIDTH, gapY));
    }

    private void resetGame() {
        birdY = HEIGHT / 2;
        velocity = 0;
        pipes.clear();
        score = 0;
        gameOver = false;
    }

    private static class Pipe {
        int x;
        int gapY;

        Pipe(int x, int gapY) {
            this.x = x;
            this.gapY = gapY;
        }

        boolean collidesWith(double birdX, double birdY) {
            double birdSize = 30;
            return birdX + birdSize > x && birdX < x + PIPE_WIDTH &&
                   (birdY < gapY || birdY + birdSize > gapY + GAP_HEIGHT);
        }
    }

    public static void main(String[] args) {
        launch();
    }
}
```

---

## ✨ Cosa imparano gli studenti

| Argomento              | Esempio nel gioco     |
| ---------------------- | --------------------- |
| **Animazioni**         | `AnimationTimer`      |
| **Eventi da tastiera** | `setOnKeyPressed`     |
| **Fisica semplice**    | gravità e salto       |
| **Collisioni**         | metodo `collidesWith` |
| **OOP base**           | classe `Pipe` interna |
| **Reset del gioco**    | metodo `resetGame()`  |

---

## 🎨 Miglioramenti possibili

* Aggiungere **sfondo scorrevole** e **suoni** (API `AudioClip`).
* Cambiare il cerchio con un’immagine (`gc.drawImage()`).
* Memorizzare il **record migliore** in un file (`Files.write()` / `BufferedWriter`).
* Inserire un **pulsante Start** iniziale.

---

## 🧪 Esercizi per gli studenti

1. Modifica la velocità dei tubi o la gravità per rendere il gioco più facile o più difficile.
2. Aggiungi un contatore di vite o un “Super Jump”.
3. Sostituisci i cerchi e i tubi con immagini (uccellino, nuvole, pali).

---

## 🎯 Obiettivo

Realizzare una **versione migliorata di Mini Flappy Bird** in JavaFX, con:

* sfondo grafico (cielo e terra),
* uccellino come immagine animata,
* tubi con sprite,
* effetto sonoro al salto e al game over.

---

## 📁 Struttura del progetto

```
flappy/
 ├── FlappyBird.java
 └── resources/
      ├── bird.png
      ├── pipe.png
      ├── background.png
      ├── jump.wav
      └── gameover.wav
```

👉 Tutte le risorse (immagini e suoni) saranno nella cartella `resources`
e caricate dal codice con `getResource()`.

---

## 💻 Codice completo (FlappyBird.java)

```java
package flappy;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class FlappyBird extends Application {

    private static final int WIDTH = 400;
    private static final int HEIGHT = 600;
    private static final int PIPE_WIDTH = 60;
    private static final int GAP_HEIGHT = 150;
    private static final double GRAVITY = 0.4;
    private static final double JUMP_STRENGTH = -7;

    private double birdY = HEIGHT / 2;
    private double velocity = 0;
    private boolean spacePressed = false;
    private boolean gameOver = false;
    private int score = 0;

    private final List<Pipe> pipes = new ArrayList<>();
    private final Random random = new Random();

    private Image birdImg;
    private Image pipeImg;
    private Image bgImg;

    private AudioClip jumpSound;
    private AudioClip gameOverSound;

    @Override
    public void start(Stage stage) {
        Canvas canvas = new Canvas(WIDTH, HEIGHT);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // Carica risorse
        birdImg = new Image(getClass().getResource("/flappy/resources/bird.png").toString());
        pipeImg = new Image(getClass().getResource("/flappy/resources/pipe.png").toString());
        bgImg = new Image(getClass().getResource("/flappy/resources/background.png").toString());

        jumpSound = new AudioClip(getClass().getResource("/flappy/resources/jump.wav").toString());
        gameOverSound = new AudioClip(getClass().getResource("/flappy/resources/gameover.wav").toString());

        Scene scene = new Scene(new javafx.scene.Group(canvas));
        stage.setTitle("🐦 Flappy Bird JavaFX Edition");
        stage.setScene(scene);
        stage.show();

        // Input
        scene.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.SPACE) {
                spacePressed = true;
                if (gameOver) resetGame();
            }
        });
        scene.setOnKeyReleased(e -> {
            if (e.getCode() == KeyCode.SPACE) spacePressed = false;
        });

        // Loop principale
        new AnimationTimer() {
            long lastPipe = 0;
            @Override
            public void handle(long now) {
                update();
                render(gc);
                if (now - lastPipe > 1_800_000_000) {
                    addPipe();
                    lastPipe = now;
                }
            }
        }.start();
    }

    private void update() {
        if (gameOver) return;

        velocity += GRAVITY;
        birdY += velocity;

        if (spacePressed) {
            velocity = JUMP_STRENGTH;
            jumpSound.play();
        }

        Iterator<Pipe> it = pipes.iterator();
        while (it.hasNext()) {
            Pipe p = it.next();
            p.x -= 3;
            if (p.x + PIPE_WIDTH < 0) {
                it.remove();
                score++;
            }
            if (p.collidesWith(50, birdY)) {
                gameOverSound.play();
                gameOver = true;
            }
        }

        if (birdY > HEIGHT - 50 || birdY < 0) {
            gameOverSound.play();
            gameOver = true;
        }
    }

    private void render(GraphicsContext gc) {
        gc.drawImage(bgImg, 0, 0, WIDTH, HEIGHT);

        gc.drawImage(birdImg, 50, birdY, 34, 24);

        for (Pipe p : pipes) {
            // Parte superiore
            gc.drawImage(pipeImg, p.x, p.gapY - 400, PIPE_WIDTH, 400);
            // Parte inferiore
            gc.drawImage(pipeImg, p.x, p.gapY + GAP_HEIGHT, PIPE_WIDTH, 400);
        }

        gc.fillText("Score: " + score, 10, 20);

        if (gameOver) {
            gc.fillText("GAME OVER! Premi SPAZIO per riprovare.", 60, HEIGHT / 2);
        }
    }

    private void addPipe() {
        int gapY = 100 + random.nextInt(HEIGHT - GAP_HEIGHT - 200);
        pipes.add(new Pipe(WIDTH, gapY));
    }

    private void resetGame() {
        birdY = HEIGHT / 2;
        velocity = 0;
        pipes.clear();
        score = 0;
        gameOver = false;
    }

    private static class Pipe {
        int x;
        int gapY;
        Pipe(int x, int gapY) { this.x = x; this.gapY = gapY; }

        boolean collidesWith(double birdX, double birdY) {
            double birdSize = 30;
            return birdX + birdSize > x && birdX < x + PIPE_WIDTH &&
                   (birdY < gapY || birdY + birdSize > gapY + GAP_HEIGHT);
        }
    }

    public static void main(String[] args) {
        launch();
    }
}
```

---

## 🧩 Risorse grafiche e audio

Per questioni di licenza, **non posso inviarti direttamente i file binari**,
ma puoi scaricare **versioni libere e compatibili** da siti royalty-free come:

| Tipo                 | Esempio gratuito                                                                                                     |
| -------------------- | -------------------------------------------------------------------------------------------------------------------- |
| 🐦 `bird.png`        | [https://opengameart.org/content/flappy-bird-sprite](https://opengameart.org/content/flappy-bird-sprite)             |
| 🌤️ `background.png` | [https://opengameart.org/content/simple-background](https://opengameart.org/content/simple-background)               |
| 🟩 `pipe.png`        | [https://opengameart.org/content/flappy-bird-pipes](https://opengameart.org/content/flappy-bird-pipes)               |
| 🎵 `jump.wav`        | [https://freesound.org/people/Bertsz/sounds/131660/](https://freesound.org/people/Bertsz/sounds/131660/)             |
| 💥 `gameover.wav`    | [https://freesound.org/people/FunWithSound/sounds/456966/](https://freesound.org/people/FunWithSound/sounds/456966/) |

Scaricali, rinominali come indicato e mettili nella cartella:

```
src/flappy/resources/
```

---

## 🧠 Idee per la lezione finale

1. **Prima parte (20 min)**

   * Spiega il loop del gioco (`AnimationTimer`) e la fisica del salto.
   * Mostra come vengono disegnati i tubi e gestite le collisioni.

2. **Seconda parte (30–40 min)**

   * Gli studenti personalizzano il gioco: cambiano immagini, suoni, difficoltà.
   * Aggiungono una scritta “Start Game” o “Record personale”.

3. **Ultimi 10 min**

   * Piccola “gara” in classe: chi ottiene il punteggio più alto! 🏆
   * Foto o video del risultato finale — “Abbiamo finito il corso con un gioco fatto da noi!”

---


## 🧩 1️⃣ Scarica JavaFX SDK

* Vai su [https://gluonhq.com/products/javafx/](https://gluonhq.com/products/javafx/)
* Scarica la versione compatibile con il tuo sistema operativo (Windows, macOS o Linux).
* **Scompatta** in una cartella, ad esempio:

  ```
  C:\javafx-sdk-25
  ```

  (oppure su macOS: `/Users/<tuo_utente>/Downloads/javafx-sdk-25`)

---

## ⚙️ 2️⃣ Crea una *User Library* in Eclipse

1. Vai su **Window → Preferences → Java → Build Path → User Libraries**
2. Clicca **New…**, chiamala ad esempio `JavaFX25`.
3. Selezionala, poi clicca **Add External JARs…**
4. Vai in:

   ```
   C:\javafx-sdk-25\lib
   ```

   e **seleziona tutti i file `.jar`** dentro la cartella `lib`.
5. Premi **OK** per salvare la libreria.

---

## 💡 3️⃣ Crea il progetto FlappyBird

1. **File → New → Java Project**

   * Nome progetto: `FlappyBirdJavaFX`
   * JavaSE-17 (o successiva)
2. Fai clic destro sul progetto → **Build Path → Configure Build Path**

   * Tab “Libraries” → **Add Library → User Library → JavaFX25**
   * Aggiungi la libreria che hai creato prima.
3. Crea i package e incolla il codice:

   ```
   src/flappy/FlappyBird.java
   src/flappy/resources/...
   ```

---

## 🚀 4️⃣ Configura le *VM Arguments*

Perché JavaFX funzioni in runtime, devi indicare dove trovare le librerie native.

1. Vai su:

   * **Run → Run Configurations…**
   * Seleziona il tuo progetto `FlappyBirdJavaFX`
2. Nella tab **Arguments**, sezione **VM arguments**, incolla:

   ```
   --module-path "C:\javafx-sdk-25\lib" --add-modules javafx.controls,javafx.fxml,javafx.media,javafx.graphics
   ```

   *(usa il percorso corretto per la tua macchina)*

---

## 🧠 5️⃣ Esegui

Ora puoi fare:

```
Run → Run As → Java Application
```

Se tutto è corretto, si apre la finestra del gioco 🐦

---

## ✅ Suggerimenti utili

* Se vedi errori “cannot find class javafx”, controlla di aver **aggiunto i jar alla User Library** e **impostato il module-path nei VM arguments**.
* Con **Maven** puoi anche generare un `pom.xml` per scaricare JavaFX automaticamente, ma per i progetti didattici Eclipse “non modulari” è più semplice così.
* Usa **Java 17 o 21 LTS**: versioni più recenti possono richiedere JavaFX 25+.

---
