

**Introduzione a Java Swing:**

Java Swing è una libreria GUI (Graphic User Interface) che fa parte del pacchetto Java Foundation Classes (JFC). È stata introdotta come alternativa più avanzata rispetto alla precedente libreria AWT (Abstract Window Toolkit). Swing offre componenti GUI leggeri, stile look-and-feel consistente su diverse piattaforme e una maggiore flessibilità nella progettazione di interfacce utente.

**Principali concetti di Java Swing:**

1. **Componenti Swing:** Swing offre una vasta gamma di componenti che possono essere utilizzati per creare interfacce utente. Alcuni esempi includono `JFrame`, `JButton`, `JLabel`, `JTextField`, `JTextArea`, `JCheckBox`, ecc.

2. **Layout Manager:** I layout manager sono responsabili della disposizione dei componenti all'interno di un contenitore. Alcuni layout manager comuni sono `FlowLayout`, `BorderLayout`, `GridLayout`, `BoxLayout`.

3. **Event Handling:** Swing utilizza un modello di gestione degli eventi per rispondere alle azioni degli utenti. Gli ascoltatori di eventi, come `ActionListener`, vengono utilizzati per catturare e gestire gli eventi generati dagli utenti.

4. **Swing Worker:** Per eseguire operazioni lunghe o intensive, Swing fornisce la classe `SwingWorker` che consente di eseguire task in background senza bloccare l'interfaccia utente principale.

**Esempio di codice Swing:**

Immaginiamo di voler creare una semplice applicazione Swing con un pulsante. Quando l'utente preme il pulsante, verrà visualizzato un messaggio di saluto.

```java
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleSwingExample {
    public static void main(String[] args) {
        // Creazione di un JFrame
        JFrame frame = new JFrame("Simple Swing Example");

        // Creazione di un JButton
        JButton button = new JButton("Click me!");

        // Aggiunta di un ActionListener al pulsante
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Azione da eseguire quando il pulsante viene premuto
                JOptionPane.showMessageDialog(frame, "Hello, Swing!");
            }
        });

        // Aggiunta del pulsante al contenuto del frame
        frame.getContentPane().add(button);

        // Impostazione delle dimensioni del frame
        frame.setSize(300, 200);

        // Operazione di chiusura predefinita
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Rendere il frame visibile
        frame.setVisible(true);
    }
}
```

In questo esempio, abbiamo creato una finestra (`JFrame`) e un pulsante (`JButton`). Abbiamo aggiunto un `ActionListener` al pulsante, in modo che quando viene premuto, venga visualizzato un messaggio di saluto utilizzando `JOptionPane`.

---

## Layout Manager in Java Swing

I *layout manager* in Java Swing sono responsabili della disposizione e organizzazione dei componenti all'interno di un contenitore. Ecco alcuni dei principali layout manager con esempi:

### 1. BorderLayout

Il `BorderLayout` divide il contenitore in cinque regioni: nord, sud, est, ovest e centro. Ogni regione può contenere al massimo un componente.

```java
import javax.swing.*;

public class BorderLayoutExample extends JFrame {
    public BorderLayoutExample() {
        setTitle("BorderLayout Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        add(new JButton("North"), BorderLayout.NORTH);
        add(new JButton("South"), BorderLayout.SOUTH);
        add(new JButton("East"), BorderLayout.EAST);
        add(new JButton("West"), BorderLayout.WEST);
        add(new JButton("Center"), BorderLayout.CENTER);

        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new BorderLayoutExample());
    }
}
```

### 2. FlowLayout

Il `FlowLayout` organizza i componenti in una riga, aggiungendo nuovi componenti uno accanto all'altro fino a quando non raggiunge la fine della riga.

```java
import javax.swing.*;

public class FlowLayoutExample extends JFrame {
    public FlowLayoutExample() {
        setTitle("FlowLayout Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());

        add(new JButton("Button 1"));
        add(new JButton("Button 2"));
        add(new JButton("Button 3"));
        add(new JButton("Button 4"));
        add(new JButton("Button 5"));

        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new FlowLayoutExample());
    }
}
```

### 3. GridLayout

Il `GridLayout` organizza i componenti in una griglia con un numero fisso di righe e colonne.

```java
import javax.swing.*;

public class GridLayoutExample extends JFrame {
    public GridLayoutExample() {
        setTitle("GridLayout Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(2, 3));

        add(new JButton("Button 1"));
        add(new JButton("Button 2"));
        add(new JButton("Button 3"));
        add(new JButton("Button 4"));
        add(new JButton("Button 5"));
        add(new JButton("Button 6"));

        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GridLayoutExample());
    }
}
```

### 4. CardLayout

Il `CardLayout` consente di visualizzare un singolo pannello alla volta, sovrascrivendo il pannello precedente con il successivo.

```java
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutExample extends JFrame {
    private CardLayout cardLayout;
    private JPanel cardPanel;

    public CardLayoutExample() {
        setTitle("CardLayout Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("Panel 1 Content"));
        cardPanel.add(panel1, "Panel 1");

        JPanel panel2 = new JPanel();
        panel2.add(new JLabel("Panel 2 Content"));
        cardPanel.add(panel2, "Panel 2");

        JPanel panel3 = new JPanel();
        panel3.add(new JLabel("Panel 3 Content"));
        cardPanel.add(panel3, "Panel 3");

        add(cardPanel);

        JButton nextButton = new JButton("Next Panel");
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.next(cardPanel);
            }
        });

        add(nextButton, BorderLayout.SOUTH);

        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CardLayoutExample());
    }
}
```

---

### Principali Componenti Swing

#### 1. JButton

Il `JButton` è un pulsante cliccabile.

```java
import javax.swing.*;

public class JButtonExample extends JFrame {
    public JButtonExample() {
        setTitle("JButton Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Click Me");
        button.addActionListener(e -> JOptionPane.showMessageDialog(this, "Button Clicked!"));

        add(button);

        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new JButtonExample());
    }
}
```

#### 2. JTextField

Il `JTextField` consente all'utente di inserire testo.

```java
import javax.swing.*;

public class JTextFieldExample extends JFrame {
    public JTextFieldExample() {
        setTitle("JTextField Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField textField = new JTextField(20);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(e -> JOptionPane.showMessageDialog(this, "Input: " + textField.getText()));

        add(textField);
        add(submitButton);

        setSize(300, 200);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new JTextFieldExample());
    }
}
```

#### 3. JCheckBox

Il `JCheckBox` è un componente che consente all'utente di selezionare una o più opzioni.

```java
import javax.swing.*;

public class JCheckBoxExample extends JFrame {
    public JCheckBoxExample() {
        setTitle("JCheckBox Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JCheckBox checkBox1 = new JCheckBox("Option 1");
        JCheckBox checkBox2 = new JCheckBox("Option 2");

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(e -> {
            String result = "Selected Options: ";
            if (checkBox1.isSelected()) {
                result += "Option 1 ";
            }
            if (checkBox2.isSelected()) {
                result += "Option 2 ";
            }
            JOptionPane.showMessageDialog(this, result);
        });

        add(checkBox1);
        add(checkBox2);
        add(submitButton);

        setSize(300, 200);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new JCheckBoxExample());
    }
}
```

Questi sono solo esempi di base e ci sono molti altri componenti Swing che puoi esplorare per creare interfacce utente più complesse e interattive

---

Ecco alcuni degli altri componenti Swing più comuni:

#### 1. **JRadioButton:**

Il `JRadioButton` permette all'utente di selezionare una sola opzione da un gruppo di opzioni.

```java
import javax.swing.*;

public class JRadioButtonExample extends JFrame {
    public JRadioButtonExample() {
        setTitle("JRadioButton Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JRadioButton radioButton1 = new JRadioButton("Option 1");
        JRadioButton radioButton2 = new JRadioButton("Option 2");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(e -> {
            String result = "Selected Option: ";
            if (radioButton1.isSelected()) {
                result += "Option 1";
            } else if (radioButton2.isSelected()) {
                result += "Option 2";
            }
            JOptionPane.showMessageDialog(this, result);
        });

        add(radioButton1);
        add(radioButton2);
        add(submitButton);

        setSize(300, 200);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new JRadioButtonExample());
    }
}
```

#### 2. **JComboBox:**

Il `JComboBox` è una casella di selezione che consente all'utente di scegliere un'opzione da un elenco.

```java
import javax.swing.*;

public class JComboBoxExample extends JFrame {
    public JComboBoxExample() {
        setTitle("JComboBox Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] options = {"Option 1", "Option 2", "Option 3"};
        JComboBox<String> comboBox = new JComboBox<>(options);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(e -> {
            String selectedOption = (String) comboBox.getSelectedItem();
            JOptionPane.showMessageDialog(this, "Selected Option: " + selectedOption);
        });

        add(comboBox);
        add(submitButton);

        setSize(300, 200);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new JComboBoxExample());
    }
}
```

#### 3. **JTextArea:**

Il `JTextArea` consente all'utente di inserire e visualizzare testo su più righe.

```java
import javax.swing.*;

public class JTextAreaExample extends JFrame {
    public JTextAreaExample() {
        setTitle("JTextArea Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea textArea = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(textArea);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(e -> {
            String text = textArea.getText();
            JOptionPane.showMessageDialog(this, "Entered Text:\n" + text);
        });

        add(scrollPane);
        add(submitButton);

        setSize(300, 200);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new JTextAreaExample());
    }
}
```

#### 4. **JSlider:**

Il `JSlider` permette all'utente di selezionare un valore da un intervallo.

```java
import javax.swing.*;

public class JSliderExample extends JFrame {
    public JSliderExample() {
        setTitle("JSlider Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(e -> {
            int selectedValue = slider.getValue();
            JOptionPane.showMessageDialog(this, "Selected Value: " + selectedValue);
        });

        add(slider);
        add(submitButton);

        setSize(300, 200);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new JSliderExample());
    }
}
```

Questi sono solo alcuni esempi e ci sono molti altri componenti Swing disponibili per soddisfare le diverse esigenze di progettazione delle interfacce utente.

---

## Event Handling

L'event handling (gestione degli eventi) in Java Swing consente alle applicazioni di rispondere alle interazioni dell'utente, come clic del mouse, tastiere, e altre azioni che generano eventi. Il meccanismo di gestione degli eventi in Swing si basa su listener (ascoltatori) e oggetti evento. Di seguito, ti fornirò alcuni esempi di event handling in Swing.

#### Esempio 1: Evento di Click del Pulsante

```java
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonClickExample extends JFrame {
    public ButtonClickExample() {
        setTitle("Button Click Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Click me");

        // Aggiunge un ActionListener al pulsante
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Questo metodo viene chiamato quando il pulsante viene cliccato
                JOptionPane.showMessageDialog(ButtonClickExample.this, "Button clicked!");
            }
        });

        add(button);

        setSize(300, 200);
        setLocationRelativeTo(null);
        setLayout(new java.awt.FlowLayout());
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ButtonClickExample());
    }
}
```

In questo esempio, abbiamo un pulsante (`JButton`) e gli abbiamo aggiunto un `ActionListener`. L'`ActionListener` ascolta gli eventi di azione associati al pulsante. Quando il pulsante viene cliccato, il metodo `actionPerformed` viene chiamato e viene visualizzato un messaggio di dialogo.

#### Esempio 2: Evento di Tasto Premuto

```java
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyPressExample extends JFrame {
    public KeyPressExample() {
        setTitle("Key Press Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField textField = new JTextField(20);

        // Aggiunge un KeyListener al campo di testo
        textField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // Chiamato quando un tasto viene digitato
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // Chiamato quando un tasto viene premuto
                JOptionPane.showMessageDialog(KeyPressExample.this, "Key pressed: " + e.getKeyChar());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // Chiamato quando un tasto viene rilasciato
            }
        });

        add(textField);

        setSize(300, 200);
        setLocationRelativeTo(null);
        setLayout(new java.awt.FlowLayout());
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new KeyPressExample());
    }
}
```

In questo esempio, abbiamo un campo di testo (`JTextField`) e gli abbiamo aggiunto un `KeyListener`. Il `KeyListener` ascolta gli eventi legati alla tastiera. Quando una tastiera viene premuta, il metodo `keyPressed` viene chiamato e visualizza un messaggio di dialogo con il carattere della tastiera premuto.

Questi sono solo due esempi di gestione degli eventi in Swing. Puoi utilizzare listener specifici per vari tipi di eventi, come mouse, focus, finestra, ecc. L'idea di base è collegare un listener all'oggetto che genera l'evento e rispondere di conseguenza quando l'evento si verifica.

---

## Swing Worker

`SwingWorker` è una classe in Java Swing progettata per semplificare l'esecuzione di operazioni lunghe o computazionalmente intensive in background, senza bloccare l'Event Dispatch Thread (EDT). L'uso di `SwingWorker` è particolarmente utile per mantenere reattiva e fluida l'interfaccia utente durante l'esecuzione di task che potrebbero richiedere del tempo.

Ecco una spiegazione di base su come utilizzare `SwingWorker`:

1. **Estendere SwingWorker:**
   Creare una sottoclasse di `SwingWorker` che rappresenti il task da eseguire in background. La sottoclasse deve implementare il metodo `doInBackground()`, che contiene il codice dell'operazione lunga.

   ```java
   import javax.swing.SwingWorker;

   public class MySwingWorker extends SwingWorker<Void, Void> {
       @Override
       protected Void doInBackground() throws Exception {
           // Codice dell'operazione lunga
           return null;
       }
   }
   ```

2. **Eseguire il SwingWorker:**
   Creare un'istanza del `SwingWorker` e invocare il metodo `execute()` per avviare l'esecuzione del task in background.

   ```java
   MySwingWorker worker = new MySwingWorker();
   worker.execute();
   ```

3. **Aggiornare l'interfaccia utente dal Thread EDT (se necessario):**
   Nel caso in cui il task in background debba aggiornare l'interfaccia utente una volta completato, è possibile farlo implementando il metodo `done()` nella sottoclasse di `SwingWorker`. Questo metodo viene eseguito nell'EDT e consente di eseguire operazioni post-completamento.

   ```java
   @Override
   protected void done() {
       // Aggiornamento dell'interfaccia utente
   }
   ```

Ecco un esempio completo:

```java
import javax.swing.*;

public class MySwingWorker extends SwingWorker<Void, Void> {
    @Override
    protected Void doInBackground() throws Exception {
        // Simulazione di un'operazione lunga
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000); // Simula un ritardo di 1 secondo
            System.out.println("Working... " + i);
        }
        return null;
    }

    @Override
    protected void done() {
        // Questo metodo viene chiamato nell'EDT quando l'operazione è completata
        JOptionPane.showMessageDialog(null, "Task completato!");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MySwingWorker worker = new MySwingWorker();
            worker.execute();
        });
    }
}
```

In questo esempio, `doInBackground()` simula un'operazione lunga che richiede 10 secondi, mentre `done()` mostra un messaggio di dialogo quando l'operazione è completata. L'interfaccia utente rimane reattiva durante l'esecuzione del task in background.

---

## `SwingUtilities.invokeLater()`

Il metodo `SwingUtilities.invokeLater` è utilizzato in Java Swing per eseguire in modo asincrono una parte del codice all'interno dell'Event Dispatch Thread (EDT). L'EDT è responsabile della gestione degli eventi Swing e delle operazioni di rendering delle interfacce utente.

Poiché Swing non è thread-safe, è fondamentale che tutte le operazioni che coinvolgono la GUI (Graphic User Interface) siano eseguite all'interno dell'EDT. L'invocazione diretta di codice Swing da un thread diverso dall'EDT può causare problemi di concorrenza e comportamenti imprevedibili nell'interfaccia utente.

Il metodo `invokeLater` accetta un oggetto `Runnable` come argomento e inserisce tale oggetto nella coda degli eventi dell'EDT. Successivamente, l'EDT eseguirà il codice contenuto nell'oggetto `Runnable` in modo sicuro.

Ecco un esempio di come viene utilizzato:

```java
SwingUtilities.invokeLater(() -> {
    // Codice da eseguire nell'EDT
    JFrame frame = new JFrame("Hello Swing");
    JButton button = new JButton("Click me");

    button.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Button clicked!"));

    frame.getContentPane().add(button);
    frame.setSize(300, 200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
});
```

In questo esempio, la creazione del frame e la configurazione del pulsante sono eseguite all'interno dell'EDT, garantendo così un comportamento sicuro e prevedibile dell'interfaccia utente Swing.

---

## Event Dispatch Thread (EDT)

L'Event Dispatch Thread (EDT) è un thread speciale in un'applicazione Java Swing responsabile della gestione degli eventi Swing e delle operazioni di rendering dell'interfaccia utente. In altre parole, l'EDT è il cuore pulsante di un'applicazione Swing, occupandosi di tutte le attività legate all'interfaccia grafica.

Ecco alcune caratteristiche chiave dell'EDT:

1. **Thread Singolo:** L'EDT è un thread singolo dedicato all'interfaccia utente. Tutti gli eventi Swing, come clic del mouse, pressione di tasti e aggiornamenti dell'interfaccia grafica, vengono gestiti all'interno dell'EDT.

2. **Thread-Safety:** Swing non è thread-safe, il che significa che tutte le operazioni relative all'interfaccia utente devono essere eseguite nell'EDT. Se si tenta di modificare la GUI da un thread diverso dall'EDT, possono verificarsi problemi di concorrenza che portano a comportamenti imprevedibili e errori.

3. **Eventi e Rendering:** L'EDT gestisce gli eventi generati dall'utente, come clic del mouse e tastiere, e gestisce anche il rendering dell'interfaccia grafica. Tutte le operazioni di disegno e aggiornamento dell'interfaccia utente vengono eseguite nell'EDT.

4. **Coda degli Eventi:** L'EDT gestisce una coda degli eventi che contiene tutti gli eventi Swing pendenti. Quando si verificano eventi, vengono accodati nella coda degli eventi e poi elaborati uno alla volta dall'EDT.

5. **invokeLater e invokeAndWait:** Per garantire che il codice Swing venga eseguito nell'EDT, è possibile utilizzare i metodi `SwingUtilities.invokeLater` e `SwingUtilities.invokeAndWait`. Entrambi consentono di inserire un blocco di codice Swing nella coda degli eventi dell'EDT.

```java
SwingUtilities.invokeLater(() -> {
    // Codice da eseguire nell'EDT
});
```

In sintesi, l'EDT è fondamentale per assicurare la coerenza e la sicurezza delle operazioni sull'interfaccia utente in un'applicazione Swing, garantendo che tutte le modifiche alla GUI siano eseguite in modo sequenziale e senza problemi di concorrenza.

---

Esempio: un semplice form in Swing per aggiungere record alla tabella MySQL "libro". In questo esempio, utilizzeremo `JFrame`, `JPanel`, `JTextField`, `JButton` e JDBC per interagire con il database MySQL.

Prima di iniziare, assicurati di avere un database MySQL configurato e la libreria JDBC aggiunta al tuo progetto. Inoltre, cambia le informazioni di connessione del database (URL, utente, password) nel codice sorgente.

```java
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddBookForm extends JFrame {
    private JTextField idField, titleField, authorField, priceField, pagesField;

    public AddBookForm() {
        setTitle("Aggiungi Libro");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creazione di un pannello per organizzare i componenti
        JPanel panel = new JPanel(new GridLayout(6, 2));

        // Creazione dei componenti del form
        idField = new JTextField();
        titleField = new JTextField();
        authorField = new JTextField();
        priceField = new JTextField();
        pagesField = new JTextField();

        // Aggiunta di etichette e campi di testo al pannello
        panel.add(new JLabel("ID:"));
        panel.add(idField);
        panel.add(new JLabel("Titolo:"));
        panel.add(titleField);
        panel.add(new JLabel("Autore:"));
        panel.add(authorField);
        panel.add(new JLabel("Prezzo:"));
        panel.add(priceField);
        panel.add(new JLabel("Pagine:"));
        panel.add(pagesField);

        // Creazione del pulsante "Aggiungi Libro"
        JButton addButton = new JButton("Aggiungi Libro");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Chiamata al metodo per aggiungere il libro al database
                addBookToDatabase();
            }
        });

        // Aggiunta del pulsante al pannello
        panel.add(addButton);

        // Aggiunta del pannello al frame
        add(panel);

        // Impostazione delle dimensioni e della visibilità del frame
        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void addBookToDatabase() {
        // Informazioni di connessione al database
        String url = "jdbc:mysql://localhost:3306/tuo_database";
        String user = "tuo_utente";
        String password = "tua_password";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            // Query per l'inserimento di un libro nella tabella
            String query = "INSERT INTO libro (id, titolo, autore, prezzo, pagine) VALUES (?, ?, ?, ?, ?)";

            // Creazione del PreparedStatement
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                // Impostazione dei parametri del libro
                preparedStatement.setInt(1, Integer.parseInt(idField.getText()));
                preparedStatement.setString(2, titleField.getText());
                preparedStatement.setString(3, authorField.getText());
                preparedStatement.setDouble(4, Double.parseDouble(priceField.getText()));
                preparedStatement.setInt(5, Integer.parseInt(pagesField.getText()));

                // Esecuzione dell'aggiunta del libro
                int result = preparedStatement.executeUpdate();

                // Verifica del successo dell'operazione
                if (result > 0) {
                    JOptionPane.showMessageDialog(this, "Libro aggiunto con successo!");
                    clearFields();
                } else {
                    JOptionPane.showMessageDialog(this, "Errore nell'aggiunta del libro.");
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Errore di connessione al database.");
        }
    }

    private void clearFields() {
        // Metodo per pulire i campi del form dopo l'aggiunta di un libro
        idField.setText("");
        titleField.setText("");
        authorField.setText("");
        priceField.setText("");
        pagesField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AddBookForm();
            }
        });
    }
}
```

---

Esempio di utilizzo di `JTable` in Java Swing per visualizzare i dati di una tabella. In questo esempio, utilizzeremo un modello di tabella predefinito (`DefaultTableModel`) per gestire i dati.

```java
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class BookTableExample extends JFrame {
    private DefaultTableModel tableModel;

    public BookTableExample() {
        setTitle("Tabella Libri");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creazione del modello di tabella predefinito
        tableModel = new DefaultTableModel();

        // Aggiunta delle colonne al modello di tabella
        tableModel.addColumn("ID");
        tableModel.addColumn("Titolo");
        tableModel.addColumn("Autore");
        tableModel.addColumn("Prezzo");
        tableModel.addColumn("Pagine");

        // Creazione di una JTable con il modello di tabella
        JTable table = new JTable(tableModel);

        // Creazione di un JScrollPane per la JTable
        JScrollPane scrollPane = new JScrollPane(table);

        // Creazione di un JButton per aggiornare la tabella
        JButton refreshButton = new JButton("Aggiorna Tabella");
        refreshButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Chiamata al metodo per aggiornare la tabella con i dati dal database
                updateTable();
            }
        });

        // Creazione di un pannello per organizzare i componenti
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(refreshButton, BorderLayout.SOUTH);

        // Aggiunta del pannello al frame
        add(panel);

        // Impostazione delle dimensioni e della visibilità del frame
        setSize(600, 400);
        setLocationRelativeTo(null);
        setVisible(true);

        // Iniziale aggiornamento della tabella
        updateTable();
    }

    private void updateTable() {
        // Pulizia del modello di tabella prima di aggiornare i dati
        tableModel.setRowCount(0);

        // Informazioni di connessione al database
        String url = "jdbc:mysql://localhost:3306/tuo_database";
        String user = "tuo_utente";
        String password = "tua_password";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            // Query per ottenere tutti i libri dalla tabella
            String query = "SELECT * FROM libro";

            // Creazione dello Statement
            try (Statement statement = connection.createStatement()) {
                // Esecuzione della query e ottenimento del risultato
                ResultSet resultSet = statement.executeQuery(query);

                // Iterazione sui risultati e aggiunta delle righe alla tabella
                while (resultSet.next()) {
                    Object[] rowData = {
                            resultSet.getInt("id"),
                            resultSet.getString("titolo"),
                            resultSet.getString("autore"),
                            resultSet.getDouble("prezzo"),
                            resultSet.getInt("pagine")
                    };
                    tableModel.addRow(rowData);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Errore di connessione al database.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BookTableExample();
            }
        });
    }
}
```

In questo esempio, abbiamo creato una `JTable` e un modello di tabella (`DefaultTableModel`). Abbiamo aggiunto colonne al modello di tabella per rappresentare gli attributi della tabella "libro". Il pulsante "Aggiorna Tabella" richiama il metodo `updateTable()`, che ottiene i dati dal database e li aggiunge alla tabella.
