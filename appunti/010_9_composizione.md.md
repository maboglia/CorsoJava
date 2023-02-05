# Composizione

* La composizione è uno dei concetti chiave di OOP.
* La composizione è un caso più restrittivo di aggregazione.
* La composizione rappresenta una relazione HAS-A che contiene un oggetto che non può esistere da solo.
* La composizione sostiene il riutilizzo del codice e il controllo della visibilità degli oggetti.

La composizione è uno dei concetti chiave di OOP. In primo luogo, la composizione è un caso più restrittivo di aggregazione. 
Mentre l'aggregazione rappresenta una relazione HAS-A tra due oggetti che hanno il proprio ciclo di vita, la composizione rappresenta una relazione HAS-A che contiene un oggetto che non può esistere da solo. 

---

## PART-OF

Per evidenziare questo accoppiamento, la relazione HAS-A può anche essere chiamata PART-OF. 
Ad esempio, un'auto ha un motore. 
In altre parole, il motore è PARTE DELL'auto. 
Se l'auto viene distrutta, anche il motore viene distrutto. 
Si dice che la composizione sia migliore dell'ereditarietà perché sostiene il riutilizzo del codice e il controllo della visibilità degli oggetti.

---

## Rappresentazione UML

![](./img/../../../../01Programma/06_classi_base/aggregazione-composizione-associazione.png)
