# Metodi **Getter e Setter**

I **getter** e i **setter** (detti anche **accessor** e **mutator**) sono metodi che permettono di **accedere** e **modificare** in modo controllato gli attributi di una classe.

Si usano per implementare i principi di **incapsulamento** e **information hiding** tipici della programmazione orientata agli oggetti.

---

## Principi di Encapsulation e Visibilità

* **Modularità** → ridurre le interazioni tra le parti del codice.
* **Information Hiding** → nascondere i dettagli interni e delegare la responsabilità ai metodi pubblici.

In Java la **visibilità** degli attributi/metodi si regola con gli **access modifier**:

* `private` → visibile solo all’interno della stessa classe.
* `public` → accessibile ovunque.
* `protected` → accessibile da classi nello stesso package e dalle sottoclassi.
* *(di default, package-private)* → accessibile solo nello stesso package.

---

## Perché usare Getter e Setter?

* **Protezione degli attributi**: gli attributi restano privati (`private`).
* **Controllo sui valori**: nei setter si possono verificare i dati prima di assegnarli.
* **Flessibilità**: è possibile modificare l’implementazione interna senza cambiare l’interfaccia pubblica.
* **Leggibilità**: getter e setter seguono una convenzione standard (`getNome()`, `setNome()`).

---

## Esempio base

```java
class Automobile {
    private String colore;

    // getter
    public String getColore() {
        return colore;
    }

    // setter
    public void setColore(String nuovoColore) {
        this.colore = nuovoColore;
    }
}

// utilizzo
Automobile a = new Automobile();
a.setColore("Rosso");            // modifica sicura
System.out.println(a.getColore()); // lettura
```

---

## Esempio con controllo nei setter

```java
class ContoBancario {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double importo) {
        if (importo >= 0) {
            this.saldo = importo;
        } else {
            System.out.println("Errore: saldo non può essere negativo!");
        }
    }
}
```

---

## Proprietà pubbliche (sconsigliate)

Gli attributi **pubblici** espongono direttamente i dati:

```java
class Automobile {
    public String colore;
}

Automobile a = new Automobile();
a.colore = "Bianco"; // accesso diretto
```

⚠️ In questo caso non c’è **controllo** sull’assegnazione dei valori → **violazione dell’incapsulamento**.

---

## Classe incapsulata (consigliata)

Gli attributi diventano **privati** e vengono gestiti con metodi pubblici:

```java
class Automobile {
    private String colore;

    public void vernicia(String colore) {
        this.colore = colore;
    }

    public String getColore() {
        return colore;
    }
}

Automobile a = new Automobile();
// a.colore = "Bianco";  // ERRORE: colore è privato
a.vernicia("Verde");     // OK
System.out.println(a.getColore());
```

---

## Conclusione

* **Senza getter e setter** → dati esposti, difficile garantire consistenza.
* **Con getter e setter** → controllo sui dati, rispetto dell’incapsulamento, codice più robusto.

👉 In Java si segue la convenzione:

* `getNomeAttributo()` per leggere.
* `setNomeAttributo(...)` per modificare.
