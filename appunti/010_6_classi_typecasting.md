# **type casting di oggetti** in Java

## 🔑 Concetti base

* Il **casting** modifica solo il **tipo del riferimento**, non l’oggetto.
* Funziona **solo tra classi in relazione di ereditarietà** (superclasse ↔ sottoclasse).
* Se il cast non è valido → **ClassCastException a runtime**.

---

## 🟢 Upcasting

* **Da sottoclasse a superclasse**
* È **sicuro** e avviene anche **implicitamente**.

Esempio:

```java
class Veicolo {}
class Automobile extends Veicolo {}
class AutoElettrica extends Automobile {}

AutoElettrica tesla = new AutoElettrica();
Automobile auto = tesla;  // upcasting implicito
Veicolo v = tesla;        // valido: una Tesla è un Veicolo
```

---

## 🔴 Downcasting

* **Da superclasse a sottoclasse**
* È **esplicito** e può fallire.

Esempio corretto:

```java
Veicolo v = new AutoElettrica();
AutoElettrica ae = (AutoElettrica) v;  // ok
ae.ricarica();
```

Esempio pericoloso:

```java
Veicolo v = new Automobile();
// Compila, ma a runtime lancia ClassCastException
AutoElettrica ae = (AutoElettrica) v;
```

---

## ✅ Uso di `instanceof` per la sicurezza

```java
Veicolo v = new Automobile();

if (v instanceof AutoElettrica) {
    AutoElettrica ae = (AutoElettrica) v;
    ae.ricarica();
} else {
    System.out.println("Non è un'auto elettrica!");
}
```

---

## 📊 Tabella riassuntiva

| Operazione      | Direzione                 | Sicurezza     | Cast esplicito? | Note               |
| --------------- | ------------------------- | ------------- | --------------- | ------------------ |
| **Upcasting**   | Sottoclasse → Superclasse | Sempre sicuro | No              | Automatico         |
| **Downcasting** | Superclasse → Sottoclasse | Può fallire   | Sì              | Usare `instanceof` |

