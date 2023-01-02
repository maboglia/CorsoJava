# Core Spring Framework Annotations

---


## @Autowired

Questa annotazione viene applicata su campi, metodi setter e costruttori. L'annotazione` @Autowired `inietta implicitamente la dipendenza dell'oggetto.

Quando usi `@Autowired` sui campi e passi i valori per i campi usando il nome della proprietà, Spring assegnerà automaticamente i campi con i valori passati.

Puoi anche usare `@Autowired` su proprietà private, come mostrato di seguito. (Non è una buona idea!)

```java
    public class Customer {
       ` @Autowired `                              
        private Person person;                   
        private int type;
    }
```
 

Quando usi `@Autowired` sui metodi setter, Spring prova a eseguire l'autowiring per tipo sul metodo. Stai dicendo a Spring che dovrebbe iniziare questa proprietà usando il metodo setter in cui puoi aggiungere il tuo codice personalizzato, come inizializzare qualsiasi altra proprietà con questa proprietà.

```java

    public class Customer {                                                                                         
        private Person person;
       ` @Autowired `                                                                                                     
        public void setPerson (Person person) {
         this.person=person;
        }
    }
```

---

Prendi in considerazione uno scenario in cui hai bisogno dell'istanza della classe A, ma non memorizzi A nel campo della classe. Basta usare A per ottenere l'istanza di B e si sta memorizzando B in questo campo. In questo caso il metodo setter autowiring ti farà meglio. Non avrai campi inutilizzati a livello di classe.

Quando usi `@Autowired` su un costruttore, l'iniezione del costruttore avviene al momento della creazione dell'oggetto. Indica il costruttore da autowire quando usato come bean. Una cosa da notare qui è che solo un costruttore di qualsiasi classe bean può portare l'annotazione `@Autowired`.

```java

    @Component
    public class Customer {
        private Person person;
        @Autowired
        public Customer (Person person) {          
          this.person=person;
        }
    }
```

NOTA: A partire dalla primavera 4.3, `@Autowired` è diventato facoltativo per le classi con un solo costruttore. Nell'esempio sopra, Spring avrebbe comunque iniettato un'istanza della classe Person se avessi omesso l'annotazione `@Autowired`.

---

## @Qualifier

Questa annotazione viene utilizzata insieme all'annotazione `@Autowired`. Quando è necessario un maggiore controllo del processo di iniezione delle dipendenze, è possibile utilizzare `@Qualifier`. @Qualifier `può essere specificato su singoli argomenti del costruttore o parametri del metodo. Questa annotazione viene utilizzata per evitare confusione che si verifica quando si crea più di un bean dello stesso tipo e si desidera cablare solo uno di essi con una proprietà.

Si consideri un esempio in cui un'interfaccia BeanInterface è implementata da due bean BeanB1 e BeanB2.

```java
    @Component
    public class BeanB1 implements BeanInterface {
      //
    }
    @Component
    public class BeanB2 implements BeanInterface {
      //
    }
```

---

Ora se BeanA autorizza questa interfaccia, Spring non saprà quale delle due implementazioni iniettare.
Una soluzione a questo problema è l'uso dell'annotazione `@Qualifier`.

```java
    @Component
    public class BeanA {
      @Autowired
      @Qualifier("beanB2")
      private BeanInterface dependency;
      ...
    }
```
Con l'annotazione `@Qualifier` aggiunta, Spring ora saprà quale bean autowire dove beanB2 è il nome di BeanB2.

---

## @Configuration

Questa annotazione viene utilizzata su classi che definiscono bean. `@Configuration `è un analogo per il file di configurazione XML - è la configurazione che utilizza la classe Java. La classe Java annotata con `@Configuration` è una configurazione a sé stante e avrà metodi per creare un'istanza e configurare le dipendenze.

Ecco un esempio:
```java
    @Configuration
    public class DataConfig{ 
      @Bean
      public DataSource source(){
        DataSource source = new OracleDataSource();
        source.setURL();
        source.setUser();
        return source;
      }
      @Bean
      public PlatformTransactionManager manager(){
        PlatformTransactionManager manager = new BasicDataSourceTransactionManager();
        manager.setDataSource(source());
        return manager;
      }
    }
```

---

## @ComponentScan

Questa annotazione viene utilizzata con l'annotazione `@Configuration` per consentire a Spring di conoscere i pacchetti per scansionare i componenti annotati. @ComponentScan `viene anche usato per specificare i pacchetti base usando gli attributi basePackageClasses o basePackage per scansionare. Se non vengono definiti pacchetti specifici, la scansione verrà eseguita dal pacchetto della classe che dichiara questa annotazione.

Dai un'occhiata a questo post per uno sguardo approfondito all'annotazione di Scansione dei componenti.

---

## @Bean

Questa annotazione è usata a livello di metodo.` @Bean `annotation funziona con` @Configuration` per creare Spring bean. Come accennato in precedenza, "@Configuration" avrà metodi per istanziare e configurare le dipendenze. Tali metodi verranno annotati con @Bean. Il metodo annotato con questa annotazione funziona come ID bean e crea e restituisce il bean effettivo.

Per esempio:

```java

    @Configuration
    public class AppConfig{
      @Bean
      public Person person(){
        return new Person(address());
      }
      @Bean
      public Address address(){
        return new Address();
      }
    }
```

---

## @Required

Questa annotazione viene applicata ai metodi del bean setter. Considerare uno scenario in cui è necessario applicare una proprietà richiesta. L'annotazione`@Required` indica che il bean interessato deve essere popolato al momento della configurazione con la proprietà richiesta. Altrimenti viene generata un'eccezione di tipo BeanInitializationException.

---

## @EnableAutoConfiguration

Questa annotazione viene generalmente posizionata sulla classe di applicazione principale. L'annotazione `@EnableAutoConfiguration` definisce implicitamente un "pacchetto di ricerca" di base. Questa annotazione dice a Spring Boot di iniziare ad aggiungere bean in base alle impostazioni del percorso di classe, altri bean e varie impostazioni delle proprietà.

---

## @Lazy

Questa annotazione viene utilizzata sulle classi dei componenti. Per impostazione predefinita, tutte le dipendenze autowired vengono create e configurate all'avvio. Ma se vuoi inizializzare un bean pigramente, puoi usare l'annotazione `@Lazy` sulla classe. Ciò significa che il bean verrà creato e inizializzato solo quando viene richiesto per la prima volta. Puoi anche usare questa annotazione sulle classi `@Configuration`. Questo indica che tutti i metodi `@Bean` all'interno di quel `@Configuration` dovrebbero essere inizializzati pigramente.

---

## @Value

Questa annotazione viene utilizzata a livello di campo, parametro del costruttore e parametro del metodo. L'annotazione` @Value` indica un'espressione di valore predefinita per il campo o il parametro con cui inizializzare la proprietà. Dato che l'annotazione `@Autowired` dice a Spring di iniettare l'oggetto in un altro quando carica il contesto dell'applicazione, puoi anche usare l'annotazione` @Value `per iniettare valori da un file di proprietà nell'attributo di un bean. Supporta segnaposto # {...} e $ {...}.

---

## Annotazioni stereotipate di Spring Framework

---

## @Component

Questa annotazione viene utilizzata sulle classi per indicare un componente Spring. L'annotazione` @Component` segna la classe Java come bean o dice componente in modo che il meccanismo di scansione dei componenti di Spring possa essere aggiunto al contesto dell'applicazione.

---

## @Controller

L'annotazione `@Controller` viene utilizzata per indicare che la classe è un controller Spring. Questa annotazione può essere utilizzata per identificare i controller per Spring MVC o Spring WebFlux.

---

## @Service

Questa annotazione viene utilizzata su una classe. `@Service` segna una classe Java che esegue alcuni servizi, come eseguire la logica aziendale, eseguire calcoli e chiamare API esterne. Questa annotazione è una forma specializzata dell'annotazione `@Component` destinata ad essere utilizzata nel livello di servizio.

---

## @Repository

Questa annotazione viene utilizzata su classi Java che accedono direttamente al database. L'annotazione `@Repository` funziona come marker per qualsiasi classe che svolge il ruolo di repository o Data Access Object.

Questa annotazione ha una funzione di traduzione automatica. Ad esempio, quando si verifica un'eccezione in `@Repository` c'è un gestore per quell'eccezione e non è necessario aggiungere un blocco try catch.

---

## Annotazioni di Spring Boot

---

## @SpringBootApplication

Questa annotazione viene utilizzata sulla classe dell'applicazione durante l'impostazione di un progetto Spring Boot. La classe che è annotata con `@SpringBootApplication` deve essere mantenuta nel pacchetto base. L'unica cosa che fa `@SpringBootApplication` è una scansione dei componenti. Ma scansionerà solo i suoi sotto-pacchetti. Ad esempio, se metti la classe annotata con` @SpringBootApplication `in com.example, allora` @SpringBootApplication `scansionerà tutti i suoi sotto-pacchetti, come com.example.a, com.example.b e com.example .ascia

`@SpringBootApplication` è una comoda annotazione che sostituisce le annotazioni:

```java
    @Configuration
    @EnableAutoConfiguration
    @ComponentScan
```
