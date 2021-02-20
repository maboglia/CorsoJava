# Ereditarietà in Java

## Riutilizzare il codice

* Uno dei grandi vantaggi della programmazione a oggetti è la facilità nel riutilizzare il codice

* In Java si realizza attraverso **l’ereditarietà**


---
* Per esempio immaginiamo di programmare un software per veicoli

```Automobile {attributi: marca, modello}```

---

* Dobbiamo modificare il sistema per aggiungere un nuovo attributo, le ruote motrici

a) Modifichiamo direttamente la classe Automobile: Errore!

b) Creiamo una nuova classe che erediti da Automobile:

```Fuoristrada {Automobile + attributo: 4 ruote motrici}```

---

### Quando utilizzare l’ereditarietà

* Per modificare classi già esistenti, specialmente quando abbiamo molte classi da gestire

* Per non dover riprogrammare due volte lo stesso codice
