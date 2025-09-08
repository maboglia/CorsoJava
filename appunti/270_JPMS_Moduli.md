# Cos’è JPMS?

JPMS è un **sistema di modularizzazione** per Java.

* Permette di **organizzare il codice in moduli** invece di pacchetti solo su classpath.
* Migliora:

  * **incapsulamento** → quali classi/esportazioni sono visibili all’esterno
  * **gestione delle dipendenze** → il modulo dichiara cosa richiede
  * **avvio più rapido** e riduzione della **dimensione del runtime**

---

# 🔹 Modulo vs Pacchetto

* **Pacchetto** → raggruppa classi.
* **Modulo** → raggruppa pacchetti e dichiara **cosa esporta e cosa importa**.

---

# 🔹 Struttura di un modulo

Supponiamo di avere un modulo `com.example.greetings`:

```
com.example.greetings/
 ├─ module-info.java
 └─ com/example/greetings/Saluto.java
```

**module-info.java**

```java
module com.example.greetings {
    exports com.example.greetings;  // pacchetti visibili all’esterno
}
```

**Saluto.java**

```java
package com.example.greetings;

public class Saluto {
    public static String messaggio() {
        return "Ciao dal modulo!";
    }
}
```

---

# 🔹 Creazione di un modulo che usa un altro modulo

Supponiamo di avere un modulo `com.example.main` che usa `com.example.greetings`:

**module-info.java**

```java
module com.example.main {
    requires com.example.greetings; // dipendenza
}
```

**Main.java**

```java
package com.example.main;

import com.example.greetings.Saluto;

public class Main {
    public static void main(String[] args) {
        System.out.println(Saluto.messaggio());
    }
}
```

---

# 🔹 Vantaggi principali

1. **Encapsulation forte**: solo i pacchetti esportati sono accessibili.
2. **Dichiarazione delle dipendenze**: il modulo sa cosa richiede e cosa fornisce.
3. **Riduzione della complessità del classpath** → meno conflitti di classi.
4. **Supporto per modular runtime images** (`jlink`) → creare runtime leggeri con solo i moduli necessari.

---

# 🔹 Comandi principali

```bash
# Compilazione modulo
javac -d mods/com.example.greetings src/com.example.greetings/module-info.java src/com.example.greetings/com/example/greetings/Saluto.java

# Esecuzione modulo principale
java --module-path mods -m com.example.main/com.example.main.Main
```

---

JPMS è quindi **il primo vero passo verso Java modulare**, migliorando leggibilità, sicurezza e gestione delle dipendenze rispetto al vecchio classpath.

