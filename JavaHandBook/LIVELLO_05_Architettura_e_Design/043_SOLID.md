# the SOLID principles

#### **SOLID** è un acronimo che rappresenta un insieme di cinque principi di progettazione orientata agli oggetti che mirano a migliorare la struttura e la manutenibilità del codice. Questi principi sono stati introdotti da Robert C. Martin e sono ampiamente utilizzati come linee guida per scrivere codice OOP di qualità. Ecco una panoramica di ciascun principio SOLID:

1. **Single Responsibility Principle (SRP) - Principio di Singola Responsabilità:**
   - Una classe dovrebbe avere un solo motivo per essere modificata. In altre parole, una classe dovrebbe avere una sola responsabilità o motivo di cambiamento. Questo principio promuove la coesione e facilita la manutenibilità del codice.

2. **Open/Closed Principle (OCP) - Principio di Apertura/Chiusura:**
   - Un modulo (classe, funzione, ecc.) dovrebbe essere aperto per l'estensione, ma chiuso per la modifica. Ciò significa che dovremmo poter estendere il comportamento di un modulo senza dover modificarne il codice sorgente. L'uso di interfacce e classi astratte è spesso coinvolto per applicare questo principio.

3. **Liskov Substitution Principle (LSP) - Principio di Sostituzione di Liskov:**
   - Gli oggetti di una superclasse dovrebbero essere sostituibili con gli oggetti delle sue sottoclassi senza influire sulla correttezza del programma. In sostanza, se una classe A è una sottoclasse di B, ogni istanza di B dovrebbe essere sostituibile con un'istanza di A senza alterare il comportamento del programma.

4. **Interface Segregation Principle (ISP) - Principio di Segregazione delle Interfacce:**
   - Un cliente non dovrebbe essere costretto a dipendere da interfacce che non utilizza. In altre parole, una classe non dovrebbe essere costretta a implementare interfacce con metodi che non utilizza. Questo principio promuove la creazione di interfacce specifiche per le esigenze dei clienti.

5. **Dependency Inversion Principle (DIP) - Principio di Inversione delle Dipendenze:**
   - I moduli di alto livello non dovrebbero dipendere da moduli di basso livello. Entrambi dovrebbero dipendere da astrazioni. Inoltre, le astrazioni non dovrebbero dipendere dai dettagli, ma i dettagli dovrebbero dipendere dalle astrazioni. Questo principio promuove l'uso di interfacce o classi astratte per ridurre le dipendenze dirette tra classi.

### Applicazione di SOLID:

L'applicazione di SOLID durante la progettazione e l'implementazione di un sistema software promuove una struttura di codice più flessibile, estensibile e manutenibile. Seguire questi principi aiuta a evitare code fragili, facilita l'aggiunta di nuove funzionalità senza dover modificare il codice esistente e promuove una progettazione orientata agli oggetti coesa.

In generale, l'adozione di SOLID contribuisce a sviluppare codice più robusto, adattabile e facilmente comprensibile. Tuttavia, è importante notare che SOLID è un insieme di linee guida generali e la loro applicazione può variare in base al contesto specifico del progetto.

---

### Traduzione

#### **Primi anni 2000**  
Robert C. Martin (conosciuto come Uncle Bob) ha delineato i principi nel suo articolo *"Design Principles and Design Patterns"*.  
(Anche se all'epoca non erano ancora noti come SOLID).  

#### **2004**  
Michael Feathers ha coniato l'acronimo SOLID.

---

### **S - Single Responsibility Principle (Principio di Responsabilità Unica)**  

- Una classe dovrebbe avere una e una sola ragione per cambiare, ovvero dovrebbe occuparsi di un unico compito.  
- Ogni classe o modulo dovrebbe gestire una singola responsabilità ben definita.  
- Questo favorisce una migliore organizzazione e manutenzione del codice.  

---

### **O - Open/Closed Principle (Principio Aperto/Chiuso)**  

- Le entità software (classi, moduli, funzioni, ecc.) dovrebbero essere aperte all'estensione ma chiuse alla modifica.  
- Dovresti poter aggiungere nuove funzionalità estendendo una classe (ad esempio tramite ereditarietà o composizione) senza modificare il codice esistente.  
- Questo mantiene il codice di base stabile e meno incline a bug quando vengono introdotti cambiamenti.

---

### **L - Liskov Substitution Principle (Principio di Sostituzione di Liskov)**  

- Le funzioni che utilizzano puntatori o riferimenti a classi base devono essere in grado di utilizzare oggetti delle classi derivate senza accorgersene.  
- Le sottoclassi dovrebbero poter sostituire le loro classi genitore senza rompere la funzionalità del programma.  
- Questo principio sottolinea l'importanza di gerarchie di ereditarietà corrette.

---

### **I - Interface Segregation Principle (Principio di Segregazione delle Interfacce)**  

- È meglio avere molte interfacce specifiche per il cliente piuttosto che un'unica interfaccia generica.  
- Le interfacce dovrebbero essere suddivise in più interfacce più piccole e specifiche in base alle esigenze del cliente, anziché essere grandi e sovraccariche.

---

### **D - Dependency Inversion Principle (Principio di Inversione delle Dipendenze)**  

- I moduli di alto livello non dovrebbero dipendere da moduli di basso livello. Entrambi dovrebbero dipendere da astrazioni.  
- Le astrazioni non dovrebbero dipendere dai dettagli. I dettagli dovrebbero dipendere dalle astrazioni.

---

### Vantaggi principali dei principi SOLID

---

#### **Manutenibilità**  

- Il codice ben strutturato secondo i principi SOLID è più facile da leggere, comprendere e modificare nel tempo.

---

#### **Flessibilità**  

- Seguire i principi SOLID favorisce il *loose coupling* (bassa dipendenza tra i componenti) e la modularità.  
- È possibile modificare parti del sistema senza causare errori a cascata o richiedere ampie attività di refactoring.  
- Questo rende il software più adattabile a requisiti in evoluzione.

---

#### **Estendibilità**  

- Il Principio Aperto/Chiuso (Open/Closed Principle) aiuta a progettare sistemi che possono essere facilmente ampliati con nuove funzionalità o comportamenti senza modificare il codice esistente.  
- Questo mantiene stabile il codice principale e favorisce una migliore organizzazione.

---

#### **Testabilità**  

- La separazione dei componenti e la progettazione basata su interfacce (come suggerito dal Principio di Inversione delle Dipendenze) rende molto più semplice il testing unitario.  
- È possibile isolare singoli componenti del codice e testarli indipendentemente dalle loro dipendenze.

---

#### **Riutilizzabilità**  

- Concentrandosi su alta coesione e bassa dipendenza, i componenti del codice diventano più riutilizzabili.  
- La creazione di nuove funzionalità può spesso essere realizzata riutilizzando componenti esistenti ben definiti.

Ecco una traduzione adattata in italiano, con una breve spiegazione ed esempi coerenti con un capitolo Java/OOP. Ho corretto anche “Listov” → **Liskov** e “principal” → **principle**.

---

# Conclusione — Principi SOLID e buone pratiche di progettazione

I principi **SOLID** rappresentano un insieme di linee guida per scrivere codice orientato agli oggetti più semplice da mantenere, estendere e testare.

Non sono regole assolute, ma strumenti per ridurre l'accoppiamento tra classi e migliorare la qualità del progetto.

---

## S — Single Responsibility Principle (SRP)

### Principio di singola responsabilità

> Non mettere tutte le uova nello stesso paniere.
> Una classe dovrebbe avere un solo motivo per cambiare.

Una classe dovrebbe occuparsi di **una sola responsabilità**.
Quando una classe fa troppe cose, ogni modifica rischia di introdurre errori in parti non correlate.

### ❌ Esempio non corretto

```java
public class Report {

    public void generaReport() {
        System.out.println("Creo il report");
    }

    public void salvaSuFile() {
        System.out.println("Salvo il file");
    }

    public void inviaEmail() {
        System.out.println("Invio email");
    }
}
```

La classe `Report` si occupa di:

- creare il report
- salvarlo
- inviarlo

Ha troppe responsabilità.

### ✔ Soluzione

Separiamo i compiti:

```java
public class Report {

    public void genera() {
        System.out.println("Creo il report");
    }
}


public class ReportRepository {

    public void salva(Report report) {
        System.out.println("Salvo report");
    }
}


public class EmailService {

    public void invia(Report report) {
        System.out.println("Invio report");
    }
}
```

Ogni classe ora ha un solo motivo per cambiare.

---

# O — Open/Closed Principle (OCP)

### Principio aperto/chiuso

> Non modificare continuamente la stessa classe.
> Se succede spesso, probabilmente devi astrarre ciò che cambia.

Una classe dovrebbe essere:

- **aperta all'estensione**
- **chiusa alla modifica**

Dovremmo poter aggiungere nuovi comportamenti senza cambiare codice già funzionante.

### ❌ Esempio

```java
class CalcolatoreSconto {

    double calcola(String tipoCliente) {

        if(tipoCliente.equals("VIP"))
            return 20;

        if(tipoCliente.equals("STANDARD"))
            return 5;

        return 0;
    }
}
```

Ogni nuovo tipo di cliente richiede una modifica della classe.

### ✔ Soluzione

Usiamo il polimorfismo:

```java
interface Sconto {
    double calcola();
}


class ScontoVip implements Sconto {

    public double calcola() {
        return 20;
    }
}


class ScontoStandard implements Sconto {

    public double calcola() {
        return 5;
    }
}
```

Per aggiungere uno sconto nuovo creiamo una nuova classe senza modificare quelle esistenti.

---

# L — Liskov Substitution Principle (LSP)

### Principio di sostituzione di Liskov

> Una sottoclasse deve poter sostituire la classe padre senza rompere il programma.

Una classe figlia deve rispettare il comportamento previsto dalla classe base.

I metodi ridefiniti dovrebbero mantenere:

- stesso significato
- stessi vincoli
- stesso tipo restituito (o compatibile)

### ❌ Esempio

```java
class Uccello {

    void vola() {
        System.out.println("Sto volando");
    }
}


class Pinguino extends Uccello {

    void vola() {
        throw new RuntimeException(
            "Non posso volare"
        );
    }
}
```

Tecnicamente funziona, ma viola il principio: un `Pinguino` non può sostituire correttamente un `Uccello`.

### ✔ Soluzione

Separiamo i comportamenti:

```java
interface Volante {

    void vola();

}


class Aquila implements Volante {

    public void vola() {
        System.out.println("Volo");
    }
}


class Pinguino {

    public void cammina() {
        System.out.println("Cammino");
    }
}
```

---

# I — Interface Segregation Principle (ISP)

### Principio di segregazione delle interfacce

> Non creare interfacce enormi con molti metodi.
> È un segnale che stai facendo troppe cose nello stesso punto.

Meglio avere tante piccole interfacce specifiche invece di una generale.

### ❌ Esempio

```java
interface Stampante {

    void stampa();

    void scannerizza();

    void inviaFax();

}
```

Una stampante semplice sarebbe costretta a implementare metodi inutili.

```java
class StampanteBase 
        implements Stampante {

    public void stampa(){}

    public void scannerizza(){
        // non supportato
    }

    public void inviaFax(){
        // non supportato
    }
}
```

### ✔ Soluzione

```java
interface Stampabile {

    void stampa();

}


interface Scanner {

    void scannerizza();

}


interface Fax {

    void inviaFax();

}
```

Ogni classe implementa solo quello che realmente usa.

---

# D — Dependency Inversion Principle (DIP)

### Principio di inversione delle dipendenze

> Dipendi da interfacce e astrazioni, non da classi concrete.

Le classi di alto livello non dovrebbero conoscere direttamente i dettagli delle classi più basse.

### ❌ Esempio

```java
class MySQLDatabase {

    void salva(){
        System.out.println("Salvo su MySQL");
    }
}


class UserService {

    private MySQLDatabase db =
            new MySQLDatabase();

}
```

`UserService` è legato a MySQL.

Cambiare database significa modificare la classe.

### ✔ Soluzione

```java
interface Database {

    void salva();

}


class MySQLDatabase implements Database {

    public void salva(){
        System.out.println("MySQL");
    }
}


class UserService {

    private Database db;

    UserService(Database db){
        this.db = db;
    }
}
```

Ora possiamo sostituire MySQL con PostgreSQL, MongoDB o altro senza cambiare `UserService`.

---

# Encapsulate What Varies

### Incapsula ciò che cambia

> Astrarre solo ciò che può realmente variare.

Non tutto deve diventare un'interfaccia o una gerarchia complicata.

L'obiettivo è isolare le parti soggette a cambiamento.

### Esempio

Supponiamo che oggi inviamo notifiche solo via email:

```java
class EmailSender {

    void send(String msg){
        System.out.println("Email: " + msg);
    }
}
```

Se sappiamo che domani potrebbero arrivare:

- SMS
- WhatsApp
- notifiche push

conviene astrarre:

```java
interface NotificationSender {

    void send(String message);

}


class EmailSender 
        implements NotificationSender {

    public void send(String message){
        System.out.println("Email");
    }
}


class SmsSender 
        implements NotificationSender {

    public void send(String message){
        System.out.println("SMS");
    }
}
```

Abbiamo isolato ciò che cambia.

Se invece una classe è stabile e non cambierà mai, aggiungere astrazioni inutili aumenta solo la complessità.

---

## In sintesi

| Principio               | Idea principale                           |
| ----------------------- | ----------------------------------------- |
| SRP                     | Una classe, una responsabilità            |
| OCP                     | Estendi senza modificare                  |
| LSP                     | Le sottoclassi devono essere sostituibili |
| ISP                     | Interfacce piccole e specifiche           |
| DIP                     | Dipendi da astrazioni                     |
| Encapsulate What Varies | Isola solo ciò che cambia                 |

Questi principi sono alla base di molti framework moderni Java, in particolare **Spring**, dove l'uso di interfacce, dependency injection e separazione delle responsabilità deriva direttamente da queste idee.
