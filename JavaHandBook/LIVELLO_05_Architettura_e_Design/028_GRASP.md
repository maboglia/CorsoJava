# GRASP

**GRASP** (General Responsibility Assignment Software Patterns) è una serie di principi e modelli di progettazione che aiutano gli sviluppatori a creare un design solido e flessibile nell'ambito della programmazione orientata agli oggetti (OOP). Questi principi sono stati proposti da Craig Larman e sono focalizzati sulla responsabilità dei vari componenti di un sistema software.

---

### I Principi GRASP:

1. **Information Expert (Esperto dell'Informazione):**
   - Un principio che assegna la responsabilità di una particolare operazione o informazione alla classe che possiede i dati necessari per eseguire quell'operazione o contiene quell'informazione. Questo favorisce l'incapsulamento e la ---coesione
   
   .

2. **Creator (Creatore):**
   - Un principio che stabilisce quale classe dovrebbe essere responsabile della creazione di istanze di un'altra classe. In genere, questa responsabilità viene assegnata alla classe che ha l'informazione necessaria per inizializzare l'oggetto.

---

3. **Controller (Controllore):**
   - Un principio che stabilisce quale classe dovrebbe essere responsabile di gestire gli eventi del sistema. Solitamente, il controllore è responsabile della coordinazione tra le classi e della gestione degli input utente.

---

4. **Low Coupling (Basso Accoppiamento):**
   - Un principio che promuove il design con basso accoppiamento, il che significa ridurre le dipendenze tra le classi. Questo favorisce la modularità e la manutenibilità del sistema.

---

5. **High Cohesion (Alta Coesione):**
   - Un principio che promuove la coesione all'interno delle classi, il che significa che le operazioni correlate dovrebbero essere raggruppate insieme. Questo migliora la comprensione e la manutenibilità del codice.

---

6. **Polymorphism (Polimorfismo):**
   - Un principio che indica quale classe dovrebbe essere responsabile di implementare il polimorfismo quando diverse classi devono rispondere a un messaggio in modi diversi. Questo promuove la flessibilità e la facilità di estensione.

---

7. **Pure Fabrication (Fabbricazione Pura):**
   - Un principio che consente la creazione di classi che non rappresentano concetti nel dominio del problema, ma sono create per migliorare l'organizzazione del codice. Questo aiuta a ridurre l'accoppiamento.

---

8. **Indirection (Indirezione):**
   - Un principio che promuove l'uso di un intermediario per indirizzare le richieste tra classi, riducendo l'accoppiamento diretto tra loro.

---

9. **Protected Variations (Variabili Protette):**
   - Un principio che indica che dovremmo progettare in modo che le variazioni nelle implementazioni delle classi dipendenti non abbiano impatto sulle classi principali. Ciò favorisce l'incapsulamento e riduce il rischio di impatti indesiderati durante le modifiche.

---

### Applicazione di GRASP:

L'applicazione di questi principi richiede una comprensione approfondita del **[dominio del problema](./027_dominio_del_problema.md)** e delle interazioni tra le classi all'interno di un sistema software. Quando applicati correttamente, i principi GRASP possono portare a un design flessibile, comprensibile e manutenibile. Tuttavia, è importante notare che i principi GRASP non sono regole fisse, ma linee guida che possono essere adattate in base alle esigenze specifiche di progettazione.
