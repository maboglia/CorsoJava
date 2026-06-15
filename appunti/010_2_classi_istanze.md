# 🔹 1. Istanze di una Classe: gli Oggetti

In **programmazione orientata agli oggetti (OOP)**, un **oggetto** è l’elemento centrale: rappresenta un’entità del mondo reale con **stato** e **comportamenti**.

* **Stato** → definito dai valori dei campi (attributi).
* **Comportamenti** → definiti dai metodi.
* Ogni oggetto è un’**istanza di una classe**, cioè un esempio concreto del modello astratto definito dalla classe.
* Un oggetto **occupa spazio in memoria** e può **comunicare** con altri oggetti tramite lo scambio di messaggi (invocazione di metodi).

Questa capacità di interazione è uno dei pilastri di OOP e permette la costruzione di sistemi complessi e dinamici.

---

## 🔹 1.1. Cos’è un oggetto?

* È un’entità concreta derivata da una classe.
* Ha **stato** (valori degli attributi) e **comportamenti** (metodi).
* Occupa memoria.
* Può interagire con altri oggetti.

Ogni oggetto è caratterizzato da:

1. **Classe di appartenenza** → definisce attributi e metodi.
2. **Stato** → i valori attuali dei campi.
3. **Identificatore univoco** → il riferimento (reference) che permette di accedere a quell’oggetto.

---

## 🔹 1.2. Creazione di un oggetto

La creazione di un oggetto richiede due passaggi:

1. **Dichiarazione** → crea una variabile di tipo reference, inizialmente `null`.
2. **Allocazione e inizializzazione** → con `new` si riserva memoria e si inizializza l’oggetto.

```java
Persona p;                // dichiarazione (reference nullo)
p = new Persona("Luca");  // allocazione e inizializzazione
```

---

## 🔹 1.3. Notazione puntata

Si usa il **punto** (`.`) per accedere ad attributi e metodi:

```java
System.out.println("Hello World!");
```

* `System` → classe del package `java.lang`.
* `out` → variabile di classe (reference a `PrintStream`).
* `println()` → metodo di `PrintStream`.

---

## 🔹 1.4. Operazioni sui reference (`==`, `!=`)

* In Java i **reference** puntano agli oggetti in memoria.
* `==` e `!=` confrontano i **reference**, non i contenuti degli oggetti.
* Non esiste l’aritmetica dei puntatori (a differenza di C/C++).

Esempio:

```java
String s1 = new String("ciao");
String s2 = new String("ciao");

System.out.println(s1 == s2);      // false (reference diversi)
System.out.println(s1.equals(s2)); // true  (contenuto uguale)
```

---

## 🔹 1.5. Operazioni sulle istanze

Con una variabile di tipo reference si può:

* **Assegnare** un nuovo oggetto → `p = new Persona("Anna");`
* **Confrontare** reference o contenuti (`==`, `equals()`).
* **Invocare metodi** → `p.saluta();`.

Una variabile può riferirsi a oggetti diversi in momenti diversi.
Se il reference vale `null`, la variabile non punta ad alcun oggetto.

---

## 🔹 1.6. Accesso ad attributi e metodi non static

Dentro un metodo **non statico**:

* Posso usare direttamente gli attributi e metodi della stessa classe.
* L’oggetto implicito è quello su cui è stato invocato il metodo.

Esempio:

```java
public class Persona {
    private String nome;

    public Persona(String nome) { this.nome = nome; }

    public void saluta() {
        System.out.println("Ciao, sono " + nome); // implicito this.nome
    }
}
```

---

## 🔹 1.7. Oggetti e riferimenti

* Gli oggetti **non hanno nome**, ma vengono manipolati tramite variabili reference.
* Un oggetto può avere **più variabili** che lo referenziano.
* Quando un oggetto non è più referenziato, diventa irraggiungibile → il **garbage collector** libera la memoria.

```java
Persona p1 = new Persona("Luca");
Persona p2 = p1;  // p2 e p1 puntano allo stesso oggetto
```

---

## 🔹 1.8. Confronti con `null`

* Se una variabile vale `null`, non punta ad alcun oggetto.
* Il confronto `variabile != null` è usato per verificare se esiste un riferimento valido.

```java
if (p1 != null) {
    p1.saluta();
}
```

---

## 🔹 1.9. Confronto tra reference vs contenuto

* `==` → confronta se due variabili puntano **allo stesso oggetto**.
* `equals()` → confronta il **contenuto logico** degli oggetti.

Esempio con `String`:

```java
String s1 = "Java";
String s2 = "Java";

System.out.println(s1 == s2);      // true (ottimizzazione string pool)
System.out.println(s1.equals(s2)); // true
```

---

📌 [Esempi sulle classi](https://github.com/maboglia/CorsoJava/blob/master/esempi/05_OOP/)

---

## Domande

---

Che cos’è un oggetto in Java?
A. Una funzione che ritorna un valore
B. Un’entità con stato e comportamento
C. Una classe con soli metodi statici
D. Una variabile primitiva

---

Che cosa significa che un oggetto è un’istanza di una classe?
A. È una copia della classe
B. È un esempio concreto creato a partire da una classe
C. È il riferimento alla classe stessa
D. È un metodo che appartiene alla classe

---

Cosa rappresentano i campi (attributi) di un oggetto?
A. Le azioni che un oggetto può compiere
B. Lo stato dell’oggetto
C. I metodi di una classe
D. I reference agli oggetti

---

Quale parola chiave si usa in Java per creare un nuovo oggetto?
A. class
B. new
C. void
D. this

---

Cosa confronta l’operatore == applicato a due oggetti in Java?
A. I contenuti logici degli oggetti
B. I loro attributi
C. I riferimenti in memoria
D. I valori dei metodi toString()

---

Quale metodo si usa per confrontare il contenuto logico di due oggetti?
A. compare()
B. isEqual()
C. equals()
D. ==

---

Cosa succede a un oggetto quando nessuna variabile fa più riferimento ad esso?
A. Rimane in memoria fino al riavvio del programma
B. Viene automaticamente eliminato dal garbage collector
C. Genera un errore di compilazione
D. Si trasforma in un array vuoto

---

Cosa significa se una variabile di tipo reference vale null?
A. Non è stata dichiarata
B. Non punta ad alcun oggetto
C. Punta a un oggetto vuoto
D. È un valore booleano speciale

---

Come si accede a un attributo o metodo di un oggetto?
A. Con la parentesi quadra []
B. Con l’operatore ->
C. Con l’operatore .
D. Con la keyword this

---

Quale delle seguenti affermazioni è corretta?
A. In Java è possibile fare aritmetica dei reference
B. Due reference possono puntare allo stesso oggetto
C. Ogni oggetto ha sempre un solo riferimento
D. Un oggetto non può contenere metodi
