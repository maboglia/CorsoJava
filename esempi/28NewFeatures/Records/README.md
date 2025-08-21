# 📘 Record in Java – Esempio Pratico

## 🔎 Cosa sono i *record*
I **record** sono stati introdotti in Java per rappresentare in modo semplice e compatto delle **strutture di dati immutabili**.  
A differenza delle classi tradizionali, i record generano automaticamente:
- i campi privati e final
- il **costruttore**
- i metodi `equals()`, `hashCode()` e `toString()`
- i **metodi di accesso** (getter) per ciascun campo

👉 In pratica, sono perfetti quando ci serve una **classe contenitore di dati** senza troppa logica.

---

## 📂 Esempio: Studente e Indirizzo

```java
// Record Studente: contiene nome, matricola e indirizzi
record Studente(String nome, int matricola, List<Indirizzo> indirizzi) {
    static int numeroStudenti; // esempio di variabile statica
}

// Record Indirizzo: contiene via e città
record Indirizzo(String via, String citta) {}
````

---

## ▶️ Programma di esempio

```java
public class RecordsEsempio {
    public static void main(String[] args) {
        Indirizzo indirizzo1 = new Indirizzo("Via Roma 10", "Torino");
        Indirizzo indirizzo2 = new Indirizzo("Corso Italia 25", "Milano");

        Studente studente1 = new Studente("Marco Rossi", 12345, Arrays.asList(indirizzo1, indirizzo2));

        System.out.println("Nome studente: " + studente1.nome());
        System.out.println("Matricola: " + studente1.matricola());
        System.out.println("Indirizzi associati:");
        for (Indirizzo i : studente1.indirizzi()) {
            System.out.println(" - " + i.via() + ", " + i.citta());
        }

        System.out.println("La città del primo indirizzo è: " + studente1.indirizzi().get(0).citta());
    }
}
```

---

## 📋 Output del programma

```
Nome studente: Marco Rossi
Matricola: 12345
Indirizzi associati:
 - Via Roma 10, Torino
 - Corso Italia 25, Milano
La città del primo indirizzo è: Torino
```

---

## ✅ Perché usare i record?

* 🔒 **Immutabilità**: i dati non possono essere modificati dopo la creazione
* ✍️ **Meno codice boilerplate** (niente getter/setter manuali, equals/hashCode già pronti)
* 📚 **Migliore leggibilità**: il codice è più compatto e chiaro
* 🔄 Ideali per DTO (*Data Transfer Objects*), configurazioni e modelli dati semplici

---

## 📌 Nota

I record **non sostituiscono le classi tradizionali**, ma sono molto utili quando vogliamo creare rapidamente contenitori di dati senza logica complessa.
