# JPA

JPA, acronimo di Java Persistence API, è una specifica Java per l'accesso, la gestione e la persistenza dei dati tra oggetti Java e database relazionali. Fa parte delle piattaforme Java EE (Enterprise Edition) e Java SE (Standard Edition) e fornisce un modo standardizzato per le applicazioni Java interagire con i database relazionali.

Ecco alcuni concetti chiave e caratteristiche di JPA:

---

1. **Entity:** Un'entità in JPA è un oggetto di dominio persistente e leggero. Rappresenta tipicamente una tabella in un database relazionale.

---

2. **EntityManager:** `EntityManager` è l'interfaccia principale per interagire con il contesto di persistenza. È responsabile delle operazioni CRUD (Create, Read, Update, Delete) sulle entità, nonché della gestione del ciclo di vita delle entità.

---

3. **Persistence Unit:** Un'unità di persistenza è un insieme di classi di entità gestite come gruppo. Viene definita in un file persistence.xml e include informazioni sul sorgente dati, classi di entità e altri dettagli di configurazione.

---

4. **EntityManagerFactory:** `EntityManagerFactory` è responsabile della creazione e gestione delle istanze di `EntityManager`. Viene tipicamente creata una sola volta durante l'avvio dell'applicazione.

---

5. **JPQL (Java Persistence Query Language):** JPQL è un linguaggio di query utilizzato per eseguire operazioni sul database sulle entità. È simile a SQL ma opera sugli oggetti Java piuttosto che sulle tabelle del database.

Ecco un esempio semplice di utilizzo di JPA in Java:

---

1. **Define an Entity Class:**
   ```java
   import javax.persistence.Entity;
   import javax.persistence.Id;

   @Entity
   public class User {
       @Id
       private Long id;
       private String username;
       private String email;

       // getters and setters
   }
   ```

---

2. **Create a Persistence Unit (persistence.xml):**
   ```xml
   <persistence-unit name="myPersistenceUnit" transaction-type="RESOURCE_LOCAL">
       <class>com.example.User</class>
       <properties>
           <property name="javax.persistence.jdbc.driver" value="your_database_driver"/>
           <property name="javax.persistence.jdbc.url" value="your_database_url"/>
           <property name="javax.persistence.jdbc.user" value="your_database_username"/>
           <property name="javax.persistence.jdbc.password" value="your_database_password"/>
       </properties>
   </persistence-unit>
   ```

---

3. **Use EntityManager in Your Code:**

```java
   import javax.persistence.EntityManager;
   import javax.persistence.EntityManagerFactory;
   import javax.persistence.Persistence;

   public class Main {
       public static void main(String[] args) {
           EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");
           EntityManager em = emf.createEntityManager();

           // Perform CRUD operations using EntityManager

           em.close();
           emf.close();
       }
   }
```

---

Questa è solo un'introduzione di base a JPA. In un'applicazione del mondo reale, eseguiresti operazioni più complesse come le query, la gestione delle transazioni e la gestione delle relazioni tra le entità. Inoltre, framework come Hibernate ed EclipseLink sono implementazioni popolari di JPA.

---

## Hibernate

Hibernate è un framework di Object-Relational Mapping (ORM) ampiamente utilizzato per Java che semplifica le interazioni con il database mappando gli oggetti Java sulle tabelle del database. Ecco una guida di base su come utilizzare Hibernate in un'applicazione Java:

---

### Passo 1: Configurare il Tuo Progetto

1. **Aggiungi le Dipendenze di Hibernate:**
   Includi le dipendenze necessarie di Hibernate nel tuo progetto. Se stai utilizzando uno strumento di build come Maven o Gradle, aggiungi le seguenti dipendenze al tuo file di configurazione del progetto:

   Maven:
   ```xml
   <dependencies>
       <!-- Hibernate ORM -->
       <dependency>
           <groupId>org.hibernate</groupId>
           <artifactId>hibernate-core</artifactId>
           <version>5.6.3.Final</version> <!-- Utilizza l'ultima versione disponibile -->
       </dependency>

       <!-- Driver del Database (es. per MySQL) -->
       <dependency>
           <groupId>mysql</groupId>
           <artifactId>mysql-connector-java</artifactId>
           <version>8.0.26</version> <!-- Utilizza l'ultima versione disponibile -->
       </dependency>
   </dependencies>
   ```

   Gradle:
   ```groovy
   dependencies {
       // Hibernate ORM
       implementation 'org.hibernate:hibernate-core:5.6.3.Final' // Utilizza l'ultima versione disponibile

       // Driver del Database (es. per MySQL)
       implementation 'mysql:mysql-connector-java:8.0.26' // Utilizza l'ultima versione disponibile
   }
   ```

---

2. **Configura Hibernate:**
   Crea un file `hibernate.cfg.xml` per configurare Hibernate. Questo file include tipicamente dettagli sulla connessione al database, il dialetto e altre impostazioni. Posizionalo nella directory `src/main/resources`.

   Esempio di `hibernate.cfg.xml` per MySQL:

   ```xml
   <?xml version="1.0" encoding="utf-8"?>
   <!DOCTYPE hibernate-configuration PUBLIC "-//Hibernate/Hibernate Configuration DTD 3.0//EN" "http://hibernate.sourceforge.net/hibernate-configuration-3.0.dtd">
   <hibernate-configuration>
       <session-factory>
           <!-- Impostazioni di Connessione al Database -->
           <property name="hibernate.connection.driver_class">com.mysql.cj.jdbc.Driver</property>
           <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/tuo_database</property>
           <property name="hibernate.connection.username">tuo_username</property>
           <property name="hibernate.connection.password">tua_password</property>

           <!-- Dialetto per MySQL -->
           <property name="hibernate.dialect">org.hibernate.dialect.MySQLDialect</property>

           <!-- Abilita la gestione automatica del contesto di sessione di Hibernate -->
           <property name="hibernate.current_session_context_class">thread</property>

           <!-- Stampa tutte le istruzioni eseguite su stdout -->
           <property name="hibernate.show_sql">true</property>
       </session-factory>
   </hibernate-configuration>
   ```

---

### Passo 2: Crea Classi Entità

Definisci le tue classi Java come entità che rappresentano tabelle del database. Annotale con le annotazioni di Hibernate.

Esempio di classe entità:
```java
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    private Long id;
    private String username;
    private String email;

    // metodi getter e setter
}
```

---

### Passo 3: Utilizza Hibernate nel Tuo Codice

```java
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        // Crea una SessionFactory
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        // Crea una sessione
        Session session = sessionFactory.openSession();

        // Inizia una transazione
        Transaction transaction = session.beginTransaction();

        // Esegui operazioni CRUD utilizzando Hibernate

        // Conferma la transazione
        transaction.commit();

        // Chiudi la sessione
        session.close();

        // Chiudi la SessionFactory (tipicamente fatto allo spegnimento dell'applicazione)
        sessionFactory.close();
    }
}
```

All'interno del blocco della transazione, puoi eseguire varie operazioni come salvataggio di entità, recupero di entità per ID, aggiornamento di entità ed eliminazione di entità utilizzando l'API di Hibernate.

Questa è una panoramica di base, e in uno scenario del mondo reale, di solito si gestiscono le eccezioni, si utilizzano blocchi try-catch e si gestiscono le transazioni in modo più efficace. Inoltre, potresti esplorare funzionalità più avanzate di Hibernate, come l'utilizzo del linguaggio di query Hibernate (HQL) o dell'API dei criteri per le operazioni di query.

---

Affrontiamo le operazioni CRUD di base (Create, Read, Update, Delete) utilizzando Hibernate. In questo esempio, continueremo con l'entità `User` dagli esempi precedenti.

---

Per eseguire una query personalizzata in Hibernate, è possibile utilizzare HQL (Hibernate Query Language), query SQL native o l'API dei criteri. Di seguito, ti mostrerò un esempio usando HQL per eseguire una query personalizzata.

Assumendo di avere un'entità `User` e di voler recuperare gli utenti con una condizione specifica, come ad esempio quelli con un particolare nome utente, è possibile creare una query HQL personalizzata.

```java
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.List;

public class HibernateCustomQueryExample {
    public static void main(String[] args) {
        // Crea una SessionFactory
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        // Crea una sessione
        Session session = sessionFactory.openSession();

        // Inizia una transazione
        Transaction transaction = session.beginTransaction();

        // Esegui una query HQL personalizzata
        String usernameDaCercare = "john_doe";
        String hql = "FROM User WHERE username = :username";
        List<User> userList = session.createQuery(hql, User.class)
                .setParameter("username", usernameDaCercare)
                .getResultList();

        // Visualizza il risultato della query personalizzata
        System.out.println("Utenti con nome utente '" + usernameDaCercare + "':");
        for (User user : userList) {
            System.out.println(user);
        }

        // Conferma la transazione
        transaction.commit();

        // Chiudi la sessione
        session.close();

        // Chiudi la SessionFactory
        sessionFactory.close();
    }
}
```

In questo esempio, la query HQL personalizzata è `"FROM User WHERE username = :username"`. Recupera tutte le istanze di `User` con un nome utente specifico e il metodo `setParameter` viene utilizzato per impostare dinamicamente il valore del parametro.

Ricorda di adattare la query personalizzata in base alle tue specifiche esigenze. Se hai query più complesse o devi sfruttare SQL nativo, puoi utilizzare le query SQL native con il metodo `createNativeQuery` o utilizzare l'API dei criteri per un approccio di costruzione delle query programmatico e sicuro dal punto di vista del tipo.

Ogni approccio ha i suoi punti di forza e casi d'uso, quindi scegli quello che meglio si adatta alle tue esigenze.

### annotazioni Hibernate

Hibernate utilizza varie annotazioni per mappare le classi Java agli oggetti di database e definire il comportamento di persistenza. Di seguito sono riportate alcune delle principali annotazioni di Hibernate:

1. **`@Entity`**
   - Utilizzata per dichiarare una classe come entità. Un'entità rappresenta una tabella del database.

   ```java
   @Entity
   public class User {
       // ...
   }
   ```

2. **`@Id`**
   - Definisce la chiave primaria di un'entità. Può essere applicata a un campo o a un metodo getter.

   ```java
   @Id
   private Long id;
   ```

3. **`@GeneratedValue`**
   - Specifica come generare i valori della chiave primaria automaticamente. Può essere utilizzata insieme a `@Id`.

   ```java
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   ```

4. **`@Column`**
   - Consente di specificare le proprietà di una colonna del database, come il nome, la lunghezza massima, e così via.

   ```java
   @Column(name = "user_name", length = 50)
   private String username;
   ```

5. **`@OneToMany`**
   - Indica una relazione uno-a-molti tra due entità. Utilizzata per mappare relazioni di tipo "uno a molti".

   ```java
   @OneToMany(mappedBy = "user")
   private List<Order> orders;
   ```

6. **`@ManyToOne`**
   - Indica una relazione molti-a-uno tra due entità. Utilizzata per mappare relazioni di tipo "molti a uno".

   ```java
   @ManyToOne
   @JoinColumn(name = "user_id")
   private User user;
   ```

7. **`@JoinColumn`**
   - Utilizzata per specificare la colonna nella tabella del database che è utilizzata per la join.

   ```java
   @ManyToOne
   @JoinColumn(name = "user_id")
   private User user;
   ```

8. **`@NamedQuery`**
   - Definisce una query HQL (Hibernate Query Language) nominata, che può essere utilizzata più volte nell'applicazione.

   ```java
   @NamedQuery(name = "User.findByUsername", query = "SELECT u FROM User u WHERE u.username = :username")
   ```

9. **`@NamedNativeQuery`**
   - Definisce una query SQL nativa con un nome, che può essere utilizzata più volte nell'applicazione.

   ```java
   @NamedNativeQuery(name = "User.findByUsernameNative", query = "SELECT * FROM users WHERE username = :username", resultClass = User.class)
   ```

Queste sono solo alcune delle annotazioni più comuni di Hibernate. La scelta delle annotazioni dipende dalle specifiche esigenze dell'applicazione e dalla struttura del database sottostante.