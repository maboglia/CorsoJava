# Associations in JPA and Hibernate

## application.properties

# Hibernate

```text

spring.datasource.url=jdbc:mysql://localhost:3306/test
spring.datasource.username=root
spring.datasource.password=
spring.datasource.driver-class-name=com.mysql.jdbc.Driver

# The SQL dialect makes Hibernate generate better SQL for the chosen database
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5InnoDBDialect

# Hibernate ddl auto (create, create-drop, validate, update)
spring.jpa.hibernate.ddl-auto = update

# Logging
logging.level.org.hibernate.SQL=DEBUG
logging.level.org.hibernate.type=TRACE
```

---

## Entity - Ruolo dell'entità

In ogni associazione ci sono **due entità che sono correlate tra loro**, ciascuna entità svolge un ruolo che è Entità **Proprietaria** o Entità **Non Proprietaria**.

Il lato proprietario dell'entità è stato determinato facendo riferimento a entrambe le entità nel modello di dati e identificando l'entità contenente la chiave esterna. Quindi il ruolo dell'entità Credentials è Owing Entity e l'altra entità User role è Non-Owning Entity o inverse side of entity .

---

## Cascade

Ogni volta che le righe nella tabella padre vengono manipolate (inserite, aggiornate, eliminate), verranno manipolate anche le rispettive righe della tabella figlio con una colonna chiave corrispondente. Questo si chiama Cascade nel database.

JPA traduce le transizioni dello stato dell'entità in istruzioni DML del database.

JPA consente operazioni _a cascata_ (SELECT, INSERT, UPDATE, DELETE) per **propagare le modifiche** allo stato dell'entità da entità proprietarie a entità non proprietarie.

I tipi di cascade JPA sono **PERSIST, MERGE, REFRESH, REMOVE, DETACH, ALL**.

* `CascadeType.PERSIST` : persiste l'entità proprietaria e anche l'entità non proprietaria associata viene mantenuta.
* `CascadeType.MERGE` : unisce l'entità proprietaria e anche l'entità non proprietaria associata viene unita.
* `CascadeType.REFRESH` : aggiorna l'entità proprietaria e l'entità non proprietaria associata viene aggiornata in modo implicito.
* `CascadeType.REMOVE` : rimuove tutte le entità non proprietarie associate correlate se l'entità proprietaria è stata rimossa.
* `CascadeType.DETACH` : scollega tutte le entità non proprietarie correlate se un'entità proprietaria è stata scollegata.
* `CascadeType.ALL` : cascade = ALL significa { PERSIST, MERGE, REMOVE, REFRESH, DETACH }

---

## FetchType

FetchType definisce le strategie per il recupero dei dati dal database. Ci sono 2 strategie EAGER e LAZY.

* `FetchType.EAGER`: la strategia **EAGER** è un requisito per il runtime del provider di persistenza che i dati devono essere recuperati con anticipatamente (fetch in una query).
  * Se la strategia EAGER utilizza EntityManager, recupera i risultati in una query (padre e figlio).
* `FetchType.LAZY`: la strategia **LAZY** è un suggerimento per il runtime del provider di persistenza che i dati dovrebbero essere recuperati in modo ritardato al primo accesso (recuperare quando necessario come sottoquery).
  * EntityManager recupera prima i dati dell'entità padre, quindi recupera i dati dell'entità figlio su richiesta.

---

## Direction

Le relazioni possono essere **unidirezionali** o **bidirezionali**.

* **Unidirezionale** è una relazione in cui una parte **non è a conoscenza** della relazione.
* In una relazione **bidirezionale** entrambe le parti **conoscono** l'altra parte.
* La relazione **bidirezionale** fornisce l'accesso alla navigazione in entrambe le direzioni, in modo da poter accedere all'altro lato senza richieste esplicite.  

---

## mappedBy

L'elemento `mappedBy` definisce una relazione **bidirezionale**.
Questo attributo consente di fare riferimento alle entità associate da entrambi i lati.

---

## Join Column

`@JoinColumn` Specifica una colonna per unire un'associazione di entità o una raccolta di elementi.

L'annotazione `@JoinColumn` indica che questa entità è il **proprietario della relazione**.

Cioè la tabella corrispondente ha una colonna con una chiave esterna alla tabella di riferimento.
L'entità proprietaria **ha sempre** il mapping **joincolumn**.

---

## Join Table

`@JoinTable` Utilizzato nella mappatura delle associazioni. È specificato **sul lato proprietario** di un'associazione.
`@JoinTable` può essere utilizzato anche con tipi incorporabili (`@Embeddable`).

Quando una tabella di join viene utilizzata per mappare una relazione con una classe incorporabile sul lato proprietario della relazione, **l'entità che la contiene** anziché la classe incorporabile viene considerata il proprietario della relazione.

---

## Inverse Join Columns

Le **colonne della chiave esterna** della tabella di join che fanno riferimento alla tabella primaria dell'entità che non possiede l'associazione. 
Corrisponde **all'altro lato** dell'associazione.

---

## Spring Data JPA One-to-One Unidirectional Mapping

```java

    @Column(name="date_created")
    @CreationTimestamp
    private Date dateCreated;

    @Column(name="last_updated")
    @UpdateTimestamp
    private Date lastUpdated;

    // Unidirectional
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "billing_address_id", referencedColumnName = "id")
    private Address billingAddress;

```

---

## Spring Data JPA One to One Bidirectional Mapping

```java


    @OneToOne(cascade = CascadeType.ALL, mappedBy = "order", fetch = FetchType.LAZY)
    private Address billingAddress;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private Order order;


```

---

## Spring Data JPA One to Many Unidirectional Mapping

```java


    // one to many unidirectional mapping
    // default fetch type for OneToMany: LAZY
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private Set<OrderItem> orderItems = new HashSet<>();

```

---

## Spring Data JPA One to Many Bidirectional Mapping

```java

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "order")
    private Set<OrderItem> orderItems = new HashSet<>();



    @OneToOne
    @JoinColumn(name="product_id")
    private Product product;

 // default fetch type for ManyToOne: EAGER
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;    
```

---

## Spring Data JPA Many to Many Unidirectional Mapping

```java
@Table(
        name = "users",
        uniqueConstraints = @UniqueConstraint(
                name = "unique_email",
                columnNames = "email"
        )
)

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(
                    name = "user_id", referencedColumnName = "id"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "id"
            )
    )
    private Set<Role> roles = new HashSet<>();



```

---

## Spring Data JPA Many to Many Bidirectional Mapping

```java

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(
                    name = "user_id", referencedColumnName = "id"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "id"
            )
    )
    private Set<Role> roles = new HashSet<>();

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    }, fetch = FetchType.EAGER,
    mappedBy = "roles")
    private Set<User> users = new HashSet<>();    
```
