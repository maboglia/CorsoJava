# 🔑 Punti chiave sull’astrazione in OOP

* **Cos’è**: mostrare *solo* i dettagli rilevanti, nascondendo quelli superflui.
* **Obiettivo**: ridurre la complessità → ci concentriamo su *cosa* fa un oggetto, non su *come* lo fa.
* **Mezzi in Java**:

  * **classi astratte** → definiscono attributi e metodi comuni, possono avere metodi implementati e metodi astratti (da implementare nelle sottoclassi).
  * **interfacce** → definiscono un “contratto” di comportamento (solo firme dei metodi, senza implementazione fino a Java 7; da Java 8 anche metodi `default` e `static`).

---

## 📐 Esempio con classe astratta

```java
abstract class Veicolo {
    protected String targa;

    public Veicolo(String targa) {
        this.targa = targa;
    }

    // metodo astratto: non ha corpo
    public abstract void muovi();

    // metodo concreto
    public void mostraTarga() {
        System.out.println("Targa: " + targa);
    }
}

class Automobile extends Veicolo {
    public Automobile(String targa) {
        super(targa);
    }

    @Override
    public void muovi() {
        System.out.println("L'automobile si muove su strada.");
    }
}
```

Uso:

```java
Veicolo v = new Automobile("AB123CD");
v.muovi();          // L'automobile si muove su strada.
v.mostraTarga();    // Targa: AB123CD
```

---

## 📑 Esempio con interfaccia

```java
interface Volante {
    void vola();
}

class Aereo implements Volante {
    @Override
    public void vola() {
        System.out.println("L'aereo vola ad alta quota.");
    }
}
```

Uso:

```java
Volante mezzo = new Aereo();
mezzo.vola();  // L'aereo vola ad alta quota.
```

---

## 📊 Differenza tra **astrazione** e **incapsulamento**

| Concetto           | Obiettivo principale                                                        | Mezzi in Java                                                                 |
| ------------------ | --------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| **Incapsulamento** | Nascondere i dati e controllarne l’accesso                                  | Modificatori di visibilità (`private`, `public`, `protected`) + getter/setter |
| **Astrazione**     | Nascondere i dettagli implementativi e mostrare solo l’interfaccia pubblica | Classi astratte e interfacce                                                  |

