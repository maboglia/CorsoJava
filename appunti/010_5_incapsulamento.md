# Incapsulamento e visibilità in Java

Due aspetti fondamentali in un software orientato agli oggetti sono:

* **Interfaccia** → l’insieme degli elementi **visibili dall’esterno** (ciò che l’utente o altre classi possono utilizzare).
* **Implementazione** → la parte interna della classe: attributi, logica dei metodi, dettagli nascosti al mondo esterno.

L’**incapsulamento** è uno dei concetti fondamentali della **programmazione orientata agli oggetti (OOP)**.
Consiste nel **nascondere lo stato interno di un oggetto** e nell’esporre solo i metodi necessari per interagirvi, garantendo **controllo, sicurezza e indipendenza tra interfaccia e implementazione**.

---

## Incapsulamento

* Gli **attributi** di un oggetto sono **occultati** (tipicamente `private`).
* Lo stato interno può essere **modificato solo tramite metodi pubblici** appositamente definiti (`getter` e `setter`).
* L’interfaccia deve essere progettata per essere **il più possibile indipendente** dall’implementazione, così da poterla modificare senza impatto sul codice che usa la classe.

👉 Esempio tipico: la proprietà `saldo` di un oggetto `ContoCorrente` non deve essere accessibile liberamente dall’esterno, ma solo tramite metodi di deposito/prelievo che ne garantiscano la coerenza.

---

## Vantaggi dell’incapsulamento

* Codice **debolmente accoppiato** → minore dipendenza tra le classi.
* Maggior **riuso del codice**.
* **Sicurezza** → protezione dei dati da accessi non autorizzati o incoerenti.
* Codice più **robusto e facile da testare**.
* Possibilità di **modificare la rappresentazione interna** senza cambiare l’interfaccia pubblica.

---

## Visibilità in Java

In Java l’incapsulamento si realizza attraverso i **modificatori di accesso**:

* `public` → accessibile da qualsiasi classe.
* `private` → accessibile solo all’interno della stessa classe.
* `protected` → accessibile dalla classe attuale, dalle sottoclassi e dalle classi nello stesso package.
* *(default, package-private)* → se non specifichi nulla, l’elemento è accessibile solo dalle classi dello stesso package.

---

## Accesso agli attributi della classe

* Gli **attributi** fanno parte dell’**implementazione interna** e conviene dichiararli sempre `private`.
* Per renderli accessibili in modo controllato, si usano **getter** e **setter**:

```java
class ContoCorrente {
    private double saldo;

    // getter
    public double getSaldo() {
        return saldo;
    }

    // setter con controllo
    public void setSaldo(double nuovoSaldo) {
        if (nuovoSaldo >= 0) {
            this.saldo = nuovoSaldo;
        } else {
            System.out.println("Errore: saldo non può essere negativo.");
        }
    }
}
```

---

## Vantaggio: modificare la rappresentazione interna

Se in futuro cambiamo la struttura interna della classe, l’interfaccia pubblica può rimanere la stessa.

Esempio:

```java
class Rettangolo {
    private int base;
    private int altezza;

    public int getArea() {
        return base * altezza;
    }
}
```

In futuro potremmo salvare solo l’**area** come attributo, eliminando `base` e `altezza`.
Il codice esterno non dovrà cambiare, perché continuerà a chiamare `getArea()`.

---

## Riepilogo

* **Incapsulamento** = separare interfaccia da implementazione, nascondendo i dettagli interni.
* **Visibilità** = regolare l’accesso con `public`, `private`, `protected`, `package`.
* Gli **attributi** devono essere privati, e accessibili tramite **getter/setter**.
* Vantaggi → sicurezza, indipendenza, riusabilità, manutenibilità.
