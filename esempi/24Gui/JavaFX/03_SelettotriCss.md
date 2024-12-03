# Selettori CSS

In JavaFX, i selettori `.` (punto) e `#` (hash) all'interno dei fogli di stile CSS vengono utilizzati per selezionare i nodi in base al loro **tipo** e **id**, rispettivamente. Funzionano in modo simile ai selettori CSS tradizionali usati nel web.

### **1. Selettore `.` (Classe)**
Il selettore con il punto (`.`) viene utilizzato per selezionare un nodo **in base alla sua classe**. In JavaFX, un nodo può avere una classe associata, che può essere definita programmaticamente o direttamente nel file CSS. Quando utilizzi il selettore con il punto (`.`), si applica lo stile a tutti i nodi che hanno quella classe.

#### **Esempio:**

**CSS**:
```css
.buttonStyle {
    -fx-background-color: lightblue;
    -fx-font-size: 14px;
}
```

**Java**:
```java
Button myButton = new Button("Click me");
myButton.getStyleClass().add("buttonStyle");  // Aggiunge la classe al nodo
```

In questo esempio, il selettore `.buttonStyle` applica gli stili definiti a tutti i nodi che appartengono alla classe `buttonStyle`.

### **2. Selettore `#` (ID)**
Il selettore con l'hashtag (`#`) viene utilizzato per selezionare un nodo **in base al suo ID**. Ogni nodo può avere un ID univoco associato, e il selettore `#` consente di applicare uno stile solo a quel nodo specifico.

#### **Esempio:**

**CSS**:
```css
#myButton {
    -fx-background-color: green;
    -fx-text-fill: white;
}
```

**Java**:
```java
Button myButton = new Button("Click me");
myButton.setId("myButton");  // Imposta l'ID del nodo
```

In questo esempio, lo stile `#myButton` verrà applicato solo al nodo che ha l'ID `myButton`.

### **Differenze principali:**
- **Classe (`.`)**: Il selettore con il punto è usato per applicare uno stile a **tutti i nodi** che appartengono a una determinata classe.
- **ID (`#`)**: Il selettore con l'hashtag è usato per applicare uno stile a **un nodo specifico**, identificato tramite il suo ID univoco.

---

### **Esempio combinato:**
Puoi anche combinare entrambi i selettori per avere più controllo sugli stili. Ad esempio, potresti voler applicare uno stile di base per una classe, ma personalizzare ulteriormente uno specifico nodo con un ID.

```css
/* Stile di base per tutti i Button */
.buttonStyle {
    -fx-background-color: lightgray;
    -fx-font-size: 14px;
}

/* Stile personalizzato per un Button con ID specifico */
#specialButton {
    -fx-background-color: blue;
    -fx-text-fill: yellow;
}
```

**Java**:
```java
Button normalButton = new Button("Normal Button");
normalButton.getStyleClass().add("buttonStyle");  // Applica il CSS di classe

Button specialButton = new Button("Special Button");
specialButton.setId("specialButton");  // Applica lo stile personalizzato tramite ID
specialButton.getStyleClass().add("buttonStyle");  // Stile di base
```

In questo esempio:
- **Tutti i bottoni** con la classe `buttonStyle` avranno uno sfondo grigio chiaro e una dimensione del font di 14px.
- Il **pulsante con ID `specialButton`** avrà uno sfondo blu, testo giallo, e anche il resto dello stile definito dalla classe `buttonStyle`.

---

Quindi:
- **`#`** è usato per selezionare un nodo **con un ID specifico**.
- **`.`** è usato per selezionare **nodi che appartengono a una classe**.
