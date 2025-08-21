# Learning by coding: esercitazioni di laboratorio

---

## 🔎 Analisi dell’evoluzione

### **Laboratori 1–2**

* **Obiettivo:** introduzione all’ambiente, sintassi di base, variabili, operatori, cicli e condizioni.
* **Approccio:** esercizi semplici e concreti (HelloWorld, lancia dadi).
  👉 Qui si costruiscono le basi di Java e si prende confidenza con il CLI e con il ciclo di compilazione-esecuzione.

---

### **Laboratori 3–5**

* **Obiettivo:** prime classi e oggetti (`Studente`, `Contocorrente`, `Agenda`) e uso degli array.
* **Approccio:** esercizi applicativi con oggetti concreti, ancora con focus su array semplici.
  👉 Ottimo per introdurre la programmazione a oggetti in modo graduale, anche se gli errori sono gestiti ancora con `if` (non con `try/catch`).

---

### **Laboratori 6–8**

* **Obiettivo:** transizione da array statici a strutture più dinamiche (`ArrayList`).
* **Esempi:** `aula.v3`, luoghi e figure geometriche.
  👉 Qui si introducono le collezioni, ma senza entrare ancora nel **Java Collections Framework completo**.

---

### **Laboratori 9–12**

* **Obiettivo:** consolidamento con mini-progetti (giochi, teatro, negozio, automobile).
* **Approccio:** casi d’uso reali (negozio, biglietteria, automobile), in cui si sviluppano classi collegate.
  👉 Qui emergono OOP e relazioni tra classi (uso e composizione).

---

### **Laboratori 13–14**

* **Obiettivo:** uso più strutturato di **ArrayList, ereditarietà, polimorfismo, late binding**.
* **Esempi:** zaino, dipendenti.
  👉 Qui si comincia a ragionare davvero in ottica **OOP avanzata**.

---

### **Laboratori 15–16**

* **Obiettivo:** progetti più complessi (“negozio alimentari”, classificazione animali).
  👉 Qui si spinge verso l’astrazione (ereditarietà, tassonomie).

---

### **Laboratorio 17**

* **Obiettivo:** introduzione a **I/O con file**.
* **Esempi:** scrittura info di sistema, parsing della Divina Commedia.
  👉 Ottima svolta: si passa dall’OOP puro all’interazione con risorse esterne.

---

### **Laboratorio 18**

* **Obiettivo:** consolidamento con progetto “negozio alimentari”, ma stavolta con **eccezioni, interfacce e HashMap**.
  👉 Evoluzione importante: collezioni più sofisticate e gestione degli errori con try/catch.

---

### **Laboratorio 19**

* **Obiettivo:** progetto Aula con **collezioni + file**.
  👉 Chiusura logica del ciclo: si uniscono OOP, collezioni e persistenza semplice.

---

## 📈 Punti di forza della sequenza

* Progressione naturale: **dai fondamentali → OOP → collezioni → ereditarietà → file & eccezioni**.
* Ogni laboratorio introduce **un concetto nuovo** consolidando quelli precedenti.
* Esempi concreti e motivanti (teatro, negozio, zaino, aula, biglietteria).

---

## 🛠️ Proposte di miglioramento

1. **Gestione eccezioni più anticipata**

   * Già al **Lab 4–5**, invece di usare solo `if`, introdurre `try/catch` sugli errori comuni (es. input errato, divisione per zero).
   * Questo preparerebbe meglio ai laboratori avanzati.

2. **Collezioni introdotte prima**

   * `ArrayList` compare al Lab 6: si potrebbe anticipare già al Lab 4 (accanto agli array) per mostrare i vantaggi dei contenitori dinamici.

3. **Laboratorio dedicato alle interfacce**

   * Oggi vengono introdotte solo al Lab 18 in un progetto complesso.
   * Inserire un laboratorio intermedio (es. “Gioco con interfacce” → `Giocatore`, `Carta`, `Partita`) per rendere più naturale il passaggio.

4. **File & serializzazione più strutturati**

   * Il Lab 17 introduce la lettura file, ma sarebbe utile un **Lab dedicato** a:

     * scrittura e lettura da file CSV
     * serializzazione oggetti
     * gestione `try-with-resources`.

5. **Concorrenza e thread (manca del tutto)**

   * Inserire un laboratorio su `Thread`, `Runnable` e `ExecutorService`.
   * Esempio: **cronometro o produttore/consumatore**.

6. **Database / JDBC (manca del tutto in questa sequenza)**

   * A valle del Lab 19, introdurre:

     * Connessione a database
     * Query `SELECT`, `INSERT`, `UPDATE`
     * Mapping su oggetti.

7. **Mini-progetto finale (capstone)**

   * Dopo il Lab 19, introdurre un **progetto integrato** che usi:

     * OOP + ereditarietà
     * Collezioni
     * File e/o database
     * Eccezioni
     * Interfacce
   * Esempio: **Sistema di gestione biblioteca** o **Gestione ordini ristorante**.

---

## 📌 Nuova sequenza (rivista)

* **Lab 1–2** → basi sintattiche
* **Lab 3–4** → prime classi e array + prime eccezioni (`try/catch`)
* **Lab 5–6** → collezioni (`ArrayList`, `HashMap`)
* **Lab 7–9** → giochi ed esercizi guidati con interfacce semplici
* **Lab 10–12** → mini-progetti (negozio, teatro, automobile)
* **Lab 13–14** → ereditarietà, polimorfismo, late binding
* **Lab 15–16** → progetti complessi (negozio alimentari, animali)
* **Lab 17** → file I/O + serializzazione
* **Lab 18** → interfacce + eccezioni + collezioni avanzate
* **Lab 19** → progetto integrato con file
* **Lab 20** → **concorrenza & thread**
* **Lab 21** → **database (JDBC)**
* **Lab 22 (finale)** → progetto capstone integrato

---

