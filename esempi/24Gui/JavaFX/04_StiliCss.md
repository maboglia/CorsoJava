# Stile in JavaFX

In JavaFX, le proprietà di stile vengono applicate usando il prefisso `-fx-` in un file di stile CSS per personalizzare l'aspetto dei nodi. Ecco alcune delle principali istruzioni di stile con il prefisso `-fx-` che puoi utilizzare per stilizzare diversi elementi dell'interfaccia utente in JavaFX:

### **1. Font e testo**
- **`-fx-font-family`**: Imposta il tipo di carattere.
- **`-fx-font-size`**: Imposta la dimensione del carattere.
- **`-fx-font-weight`**: Imposta lo spessore del carattere (es. `bold`).
- **`-fx-font-style`**: Imposta lo stile del carattere (es. `italic`).
- **`-fx-text-fill`**: Imposta il colore del testo.

**Esempio**:
```css
.button {
    -fx-font-family: "Arial";
    -fx-font-size: 16px;
    -fx-font-weight: bold;
    -fx-text-fill: #FFFFFF; /* Colore del testo */
}
```

---

### **2. Colori e sfondi**
- **`-fx-background-color`**: Imposta il colore di sfondo.
- **`-fx-background-radius`**: Imposta il raggio di arrotondamento degli angoli.
- **`-fx-border-color`**: Imposta il colore del bordo.
- **`-fx-border-radius`**: Imposta il raggio di arrotondamento del bordo.
- **`-fx-border-width`**: Imposta la larghezza del bordo.
- **`-fx-background-insets`**: Aggiunge un margine al background (utile per immagini).

**Esempio**:
```css
.text-field {
    -fx-background-color: lightblue;
    -fx-border-color: darkblue;
    -fx-border-width: 2px;
    -fx-background-radius: 5px;
}
```

---

### **3. Spaziatura e posizionamento**
- **`-fx-padding`**: Imposta il padding (spaziatura interna) di un nodo.
- **`-fx-margin`**: Imposta il margine (spaziatura esterna) di un nodo.
- **`-fx-spacing`**: Imposta la spaziatura tra i nodi (utilizzato in contenitori come `HBox` o `VBox`).
- **`-fx-alignment`**: Imposta l'allineamento di un nodo all'interno del suo contenitore.

**Esempio**:
```css
.vbox {
    -fx-spacing: 10px; /* Spaziatura tra gli elementi */
    -fx-padding: 20px; /* Padding interno */
    -fx-alignment: center; /* Allinea al centro */
}
```

---

### **4. Bordi e angoli**
- **`-fx-border-radius`**: Imposta il raggio di curvatura degli angoli del bordo.
- **`-fx-border-width`**: Imposta la larghezza del bordo.
- **`-fx-border-style`**: Imposta lo stile del bordo (es. `solid`, `dashed`, `dotted`).

**Esempio**:
```css
.button {
    -fx-border-color: #333;
    -fx-border-radius: 10px;
    -fx-border-width: 3px;
    -fx-border-style: solid;
}
```

---

### **5. Effetti**
- **`-fx-effect`**: Aggiunge effetti grafici come sfocatura, ombre, ecc.
- **`-fx-shadow`**: Aggiunge un'ombra a un nodo.

**Esempio**:
```css
.button {
    -fx-effect: dropshadow(gaussian, #999, 10, 0.5, 2, 2);
}
```

---

### **6. Trasformazioni**
- **`-fx-rotate`**: Ruota un nodo di un certo angolo (in gradi).
- **`-fx-scale-x`** e **`-fx-scale-y`**: Scala un nodo lungo gli assi X e Y.
- **`-fx-translate-x`** e **`-fx-translate-y`**: Trasla un nodo su entrambi gli assi.

**Esempio**:
```css
.button {
    -fx-rotate: 45deg; /* Ruota il nodo di 45 gradi */
    -fx-scale-x: 1.5; /* Scala lungo l'asse X */
    -fx-scale-y: 1.5; /* Scala lungo l'asse Y */
}
```

---

### **7. Effetti di focus e selezione**
- **`-fx-focus-color`**: Colore del bordo quando il nodo ha il focus.
- **`-fx-selection-bar-color`**: Colore della barra di selezione.
- **`-fx-selected-color`**: Colore quando un elemento è selezionato.

**Esempio**:
```css
.text-field:focused {
    -fx-border-color: #0066cc;
}
.list-cell:selected {
    -fx-background-color: #3399ff;
    -fx-text-fill: white;
}
```

---

### **8. Opacità**
- **`-fx-opacity`**: Imposta l'opacità di un nodo (da 0.0 a 1.0).

**Esempio**:
```css
.button {
    -fx-opacity: 0.8; /* 80% di opacità */
}
```

---

### **9. Immagini e icone**
- **`-fx-background-image`**: Imposta un'immagine come sfondo.
- **`-fx-background-size`**: Imposta la dimensione dell'immagine di sfondo.

**Esempio**:
```css
.button {
    -fx-background-image: url("icon.png");
    -fx-background-size: cover;
}
```

---

### **10. Trasformazioni avanzate**
- **`-fx-skew-x`** e **`-fx-skew-y`**: Effettua una distorsione in orizzontale o verticale.

**Esempio**:
```css
.button {
    -fx-skew-x: 20deg; /* Distorsione orizzontale */
    -fx-skew-y: 10deg; /* Distorsione verticale */
}
```

---

### **Applicare il CSS a un nodo JavaFX**
Per applicare un file CSS in JavaFX, usa il metodo `scene.getStylesheets().add("path-to-your-css-file");`:

```java
Scene scene = new Scene(root);
scene.getStylesheets().add("style.css"); // Aggiungi il file CSS
primaryStage.setScene(scene);
primaryStage.show();
```

---

Questi sono solo alcuni dei principali stili che puoi utilizzare in JavaFX. Puoi combinare e personalizzare questi stili per ottenere l'aspetto desiderato per la tua interfaccia utente.