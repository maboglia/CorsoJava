# Core Spring Framework Annotations


## @Required

Questa annotazione viene applicata ai metodi del bean setter. Considerare uno scenario in cui è necessario applicare una proprietà richiesta. L'annotazione` @Required` indica che il bean interessato deve essere popolato al momento della configurazione con la proprietà richiesta. Altrimenti viene generata un'eccezione di tipo BeanInitializationException.

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

## @ComponentScan
Questa annotazione viene utilizzata con l'annotazione `@Configuration` per consentire a Spring di conoscere i pacchetti per scansionare i componenti annotati. @ComponentScan `viene anche usato per specificare i pacchetti base usando gli attributi basePackageClasses o basePackage per scansionare. Se non vengono definiti pacchetti specifici, la scansione verrà eseguita dal pacchetto della classe che dichiara questa annotazione.

Dai un'occhiata a questo post per uno sguardo approfondito all'annotazione di Scansione dei componenti.

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


## @Lazy

Questa annotazione viene utilizzata sulle classi dei componenti. Per impostazione predefinita, tutte le dipendenze autowired vengono create e configurate all'avvio. Ma se vuoi inizializzare un bean pigramente, puoi usare l'annotazione `@Lazy` sulla classe. Ciò significa che il bean verrà creato e inizializzato solo quando viene richiesto per la prima volta. Puoi anche usare questa annotazione sulle classi `@Configuration`. Questo indica che tutti i metodi `@Bean` all'interno di quel `@Configuration` dovrebbero essere inizializzati pigramente.

## @Value

Questa annotazione viene utilizzata a livello di campo, parametro del costruttore e parametro del metodo. L'annotazione` @Value` indica un'espressione di valore predefinita per il campo o il parametro con cui inizializzare la proprietà. Dato che l'annotazione `@Autowired` dice a Spring di iniettare l'oggetto in un altro quando carica il contesto dell'applicazione, puoi anche usare l'annotazione` @Value `per iniettare valori da un file di proprietà nell'attributo di un bean. Supporta segnaposto # {...} e $ {...}.

# Annotazioni stereotipate di Spring Framework

## @Component

Questa annotazione viene utilizzata sulle classi per indicare un componente Spring. L'annotazione` @Component` segna la classe Java come bean o dice componente in modo che il meccanismo di scansione dei componenti di Spring possa essere aggiunto al contesto dell'applicazione.

## @Controller

L'annotazione `@Controller` viene utilizzata per indicare che la classe è un controller Spring. Questa annotazione può essere utilizzata per identificare i controller per Spring MVC o Spring WebFlux.

## @Service

Questa annotazione viene utilizzata su una classe. `@Service` segna una classe Java che esegue alcuni servizi, come eseguire la logica aziendale, eseguire calcoli e chiamare API esterne. Questa annotazione è una forma specializzata dell'annotazione `@Component` destinata ad essere utilizzata nel livello di servizio.

## @Repository

Questa annotazione viene utilizzata su classi Java che accedono direttamente al database. L'annotazione `@Repository` funziona come marker per qualsiasi classe che svolge il ruolo di repository o Data Access Object.

Questa annotazione ha una funzione di traduzione automatica. Ad esempio, quando si verifica un'eccezione in `@Repository` c'è un gestore per quell'eccezione e non è necessario aggiungere un blocco try try.
Annotazioni di avvio a molla

## @EnableAutoConfiguration

Questa annotazione viene generalmente posizionata sulla classe di applicazione principale. L'annotazione `@EnableAutoConfiguration` definisce implicitamente un "pacchetto di ricerca" di base. Questa annotazione dice a Spring Boot di iniziare ad aggiungere bean in base alle impostazioni del percorso di classe, altri bean e varie impostazioni delle proprietà.

## @SpringBootApplication

Questa annotazione viene utilizzata sulla classe dell'applicazione durante l'impostazione di un progetto Spring Boot. La classe che è annotata con `@SpringBootApplication` deve essere mantenuta nel pacchetto base. L'unica cosa che fa `@SpringBootApplication` è una scansione dei componenti. Ma scansionerà solo i suoi sotto-pacchetti. Ad esempio, se metti la classe annotata con` @SpringBootApplication `in com.example, allora` @SpringBootApplication `scansionerà tutti i suoi sotto-pacchetti, come com.example.a, com.example.b e com.example .ascia

`@SpringBootApplication` è una comoda annotazione che aggiunge tutto quanto segue:

```java
    @Configuration
    @EnableAutoConfiguration
    @ComponentScan
```

# Spring MVC and REST Annotations

## @Controller

Questa annotazione viene utilizzata su classi Java che svolgono il ruolo di controller nell'applicazione. L'annotazione `@Controller` consente il rilevamento automatico delle classi di componenti nel percorso di classe e la registrazione automatica delle definizioni dei bean per esse. Per abilitare il rilevamento automatico di tali controller con annotazioni, è possibile aggiungere la scansione dei componenti alla propria configurazione. La classe Java annotata con `@Controller` è in grado di gestire più mapping di richieste.

Questa annotazione può essere utilizzata con Spring MVC e Spring WebFlux.

## @RequestMapping

Questa annotazione viene utilizzata sia a livello di classe che di metodo. L'annotazione` @RequestMapping `è usata per mappare le richieste web su classi di gestori e metodi di gestori specifici. Quando` @RequestMapping `viene utilizzato a livello di classe, crea un URI di base per il quale verrà utilizzato il controller. Quando questa annotazione viene utilizzata sui metodi, ti darà l'URI su cui verranno eseguiti i metodi del gestore. Da ciò si può dedurre che il mapping delle richieste a livello di classe rimarrà lo stesso mentre ogni metodo del gestore avrà il proprio mapping delle richieste.

A volte potresti voler eseguire diverse operazioni in base al metodo HTTP utilizzato, anche se l'URI della richiesta può rimanere lo stesso. In tali situazioni, puoi usare l'attributo method di` @RequestMapping `con un valore del metodo HTTP per restringere i metodi HTTP al fine di invocare i metodi della tua classe.

Ecco un esempio di base su come funzionano un controller e i mapping delle richieste:

```java
    @Controller
    @RequestMapping("/welcome")
    public class WelcomeController{
      @RequestMapping(method = RequestMethod.GET)
      public String welcomeAll(){
        return "welcome all";
      }  
    }
```

In questo esempio solo le richieste GET a / welcome sono gestite dal metodo welcomeAll ().

Questa annotazione può essere utilizzata anche con Spring MVC e Spring WebFlux.

L'annotazione` @RequestMapping `è molto versatile. Si prega di consultare il mio post approfondito su Richiesta Mapping bere.

## @CookieValue

Questa annotazione è usata a livello di parametro del metodo. `@CookieValue `è usato come argomento del metodo di mappatura delle richieste. Il cookie HTTP è associato al parametro `@CookieValue` per un determinato nome di cookie. Questa annotazione viene utilizzata nel metodo annotato con @RequestMapping.
Consideriamo che il seguente valore di cookie viene ricevuto con una richiesta http:

JSESSIONID = 418AB76CD83EF94U85YD34W

Per ottenere il valore del cookie, usa `@CookieValue` in questo modo:

```java
    @RequestMapping("/cookieValue")
      public void getCookieValue(@CookieValue "JSESSIONID" String cookie){
    }
```


## @CrossOrigin
Questa annotazione viene utilizzata sia a livello di classe che di metodo per abilitare le richieste di origine incrociata. In molti casi l'host che serve JavaScript sarà diverso dall'host che serve i dati. In tal caso, la condivisione di risorse tra origini (CORS) consente la comunicazione tra domini. Per abilitare questa comunicazione devi solo aggiungere l'annotazione` @CrossOrigin`.

Per impostazione predefinita, l'annotazione` @CrossOrigin` consente a tutte le origini, tutte le intestazioni, i metodi HTTP specificati nell'annotazione` @RequestMapping `e maxAge di 30 min. È possibile personalizzare il comportamento specificando i valori degli attributi corrispondenti.

Un esempio per usare `@CrossOrigin` sia a livello di controller che di gestore è questo.

```java
    @CrossOrigin(maxAge = 3600)
    @RestController
    @RequestMapping("/account")
    public class AccountController {
    @CrossOrigin(origins = "http://example.com")
    @RequestMapping("/message")
      public Message getMessage() {
          // ...
        }
     
    @RequestMapping("/note")
        public Note getNote() {
            // ...
        }
    }
```

In questo esempio, entrambi i metodi getExample () e getNote () avranno un massimo di 3600 secondi. Inoltre, getExample () consentirà solo le richieste di origine incrociata da http://example.com, mentre getNote () consentirà le richieste di origine incrociata da tutti gli host.
Composto` @RequestMapping `Varianti

Spring Framework 4.3 ha introdotto le seguenti varianti a livello di metodo dell'annotazione` @RequestMapping `per esprimere meglio la semantica dei metodi annotati. L'uso di queste annotazioni è diventato il modo standard di definire gli endpoint. Fanno da wrapper a @RequestMapping.

Queste annotazioni possono essere utilizzate con Spring MVC e Spring WebFlux.

## @GetMapping

Questa annotazione viene utilizzata per mappare le richieste HTTP GET su metodi specifici del gestore. @GetMapping `è un'annotazione composta che funge da collegamento per @RequestMapping (method = RequestMethod.GET)

## @PostMapping

Questa annotazione viene utilizzata per mappare le richieste POST HTTP su metodi specifici del gestore. @PostMapping `è un'annotazione composta che funge da collegamento per @RequestMapping (method = RequestMethod.POST)

## @PutMapping

Questa annotazione viene utilizzata per mappare le richieste HTTP PUT su metodi specifici del gestore. @PutMapping `è un'annotazione composta che funge da scorciatoia per @RequestMapping (method = RequestMethod.PUT)

## @PatchMapping

Questa annotazione viene utilizzata per mappare le richieste PATCH HTTP su metodi specifici del gestore. @PatchMapping `è un'annotazione composta che funge da scorciatoia per @RequestMapping (method = RequestMethod.PATCH)

## @DeleteMapping

Questa annotazione viene utilizzata per mappare le richieste DELETE HTTP su metodi specifici del gestore. @DeleteMapping `è un'annotazione composta che funge da collegamento per @RequestMapping (method = RequestMethod.DELETE)

## @ExceptionHandler

Questa annotazione viene utilizzata a livello di metodo per gestire le eccezioni a livello di controller. L'annotazione `@ExceptionHandler` viene utilizzata per definire la classe di eccezione che verrà catturata. È possibile utilizzare questa annotazione sui metodi che devono essere richiamati per gestire un'eccezione. I valori `@ExceptionHandler` possono essere impostati su una matrice di tipi di eccezione. Se viene generata un'eccezione che corrisponde a uno dei tipi nell'elenco, verrà invocato il metodo annotato con il corrispondente `@ExceptionHandler`.

## @InitBinder

Questa annotazione è un'annotazione a livello di metodo che svolge il ruolo di identificare i metodi che inizializzano WebDataBinder, un DataBinder che lega il parametro di richiesta agli oggetti JavaBean. Per personalizzare l'associazione dei dati dei parametri di richiesta, è possibile utilizzare i metodi annotati `@InitBinder` all'interno del nostro controller. I metodi annotati con` @InitBinder `supportano tutti i tipi di argomenti supportati dai metodi del gestore.
I metodi annotati `@InitBinder` verranno chiamati per ogni richiesta HTTP se non specifichi l'elemento valore di questa annotazione. L'elemento value può essere un nome di modulo singolo o multiplo o richiedere parametri a cui viene applicato il metodo init binder.
## `@Mappings` e @Mapping

Questa annotazione viene utilizzata sui campi. L'annotazione` @Mapping` è una meta annotazione che indica un'annotazione di mappatura web. Quando si mappano nomi di campi diversi, è necessario configurare il campo di origine sul campo di destinazione e per farlo è necessario aggiungere l'annotazione `@Mappings`. Questa annotazione accetta una matrice di `@Mapping` con i campi sorgente e destinazione.

## @MatrixVariable

Questa annotazione viene utilizzata per annotare gli argomenti del metodo del gestore richieste in modo che Spring possa iniettare i bit pertinenti dell'URI della matrice. Le variabili matrice possono apparire su qualsiasi segmento separato da un punto e virgola. Se un URL contiene variabili di matrice, il modello di mapping delle richieste deve rappresentarle con un modello URI. L'annotazione `@MatrixVariable` assicura che la richiesta sia abbinata alle variabili di matrice corrette dell'URI.

## @PathVariable

Questa annotazione viene utilizzata per annotare gli argomenti del metodo del gestore richieste. L'annotazione` @RequestMapping `può essere utilizzata per gestire le modifiche dinamiche nell'URI in cui un determinato valore URI funge da parametro. È possibile specificare questo parametro usando un'espressione regolare. L'annotazione `@PathVariable` può essere utilizzata per dichiarare questo parametro.

## @RequestAttribute

Questa annotazione viene utilizzata per associare l'attributo request a un parametro del metodo del gestore. Spring recupera il valore degli attributi nominati per popolare il parametro annotato con @RequestAttribute. Mentre l'annotazione` @RequestParam `viene utilizzata per legare i valori dei parametri dalla stringa di query, l'``RequestAttribute` viene utilizzata per accedere agli oggetti che sono stati popolati sul lato server.

## @RequestBody

Questa annotazione viene utilizzata per annotare gli argomenti del metodo del gestore richieste. L'annotazione` @RequestBody `indica che un parametro del metodo deve essere associato al valore del corpo della richiesta HTTP. HttpMessageConveter è responsabile della conversione dal messaggio di richiesta HTTP in oggetto.

## @RequestHeader

Questa annotazione viene utilizzata per annotare gli argomenti del metodo del gestore richieste. L'annotazione` @RequestHeader `viene utilizzata per mappare il parametro controller per richiedere il valore dell'intestazione. Quando Spring mappa la richiesta, `@RequestHeader` controlla ilintestazione con il nome specificato nell'annotazione e associa il suo valore al parametro del metodo del gestore. Questa annotazione ti aiuta a ottenere i dettagli dell'intestazione all'interno della classe controller.

## @RequestParam

Questa annotazione viene utilizzata per annotare gli argomenti del metodo del gestore richieste. A volte ottieni i parametri nell'URL della richiesta, principalmente nelle richieste GET. In tal caso, insieme all'annotazione` @RequestMapping `puoi usare l'annotazione` @RequestParam` per recuperare il parametro URL e mapparlo all'argomento del metodo. L'annotazione` @RequestParam `viene utilizzata per associare i parametri di richiesta a un parametro di metodo nel controller.

## @RequestPart

Questa annotazione viene utilizzata per annotare gli argomenti del metodo del gestore richieste. L'annotazione` @RequestPart `può essere usata al posto di` @RequestParam` per ottenere il contenuto di una multipart specifica e legarsi all'argomento del metodo annotato con @RequestPart. Questa annotazione prende in considerazione l'intestazione "Content-Type" nella multipart (parte richiesta).

## @ResponseBody

Questa annotazione viene utilizzata per annotare i metodi del gestore richieste. L'annotazione` @ResponseBody `è simile all'annotazione` @RequestBody`. L'annotazione` @ResponseBody `indica che il tipo di risultato deve essere scritto direttamente nel corpo della risposta in qualunque formato specificato come JSON o XML. Spring converte l'oggetto restituito in un corpo di risposta utilizzando HttpMessageConveter.

## @ResponseStatus

Questa annotazione viene utilizzata su metodi e classi di eccezione. `@ResponseStatus `segna un metodo o una classe di eccezione con un codice di stato e un motivo che deve essere restituito. Quando viene invocato il metodo del gestore, il codice di stato viene impostato sulla risposta HTTP che sovrascrive le informazioni sullo stato fornite con qualsiasi altro mezzo. Una classe di controller può anche essere annotata con` @ResponseStatus` che viene quindi ereditato da tutti i metodi di `@RequestMapping`.

## @ControllerAdvice

Questa annotazione viene applicata a livello di classe. Come spiegato in precedenza, per ciascun controller è possibile utilizzare `@ExceptionHandler` su un metodo che verrà chiamato quando si verifica una determinata eccezione. Ma questo gestisce solo quelle eccezioni che si verificano all'interno del controller in cui è definito. Per ovviare a questo problema ora puoi usare l'annotazione `@ControllerAdvice`. Questa annotazione è usata per definire i metodi @ ExceptionHandler, `@InitBinder` e` @ModelAttribute `che si applicano a tutti i metodi` @RequestMapping `. Pertanto, se si definisce l'annotazione` @ExceptionHandler `su un metodo nella classe` @ControllerAdvice`, verrà applicata a tutti i controller.

## @RestController

Questa annotazione viene utilizzata a livello di classe. L'annotazione `@RestController` segna la classe come controller in cui ogni metodo restituisce un oggetto dominio anziché una vista. Annotando una classe con questa annotazione non è più necessario aggiungere `@ResponseBody` a tutto il metodo RequestMapping. Significa che non usi più i risolutori di vista o invii HTML in risposta. È sufficiente inviare l'oggetto dominio come risposta HTTP nel formato compreso dai consumatori come JSON.

`@RestController` è un'annotazione di praticità che combina `@Controller` e @ResponseBody.


## @RestControllerAdvice

Questa annotazione viene applicata alle classi Java. @RestControllerAdvice `è un'annotazione pratica che combina` @ControllerAdvice `e @ResponseBody. Questa annotazione viene utilizzata insieme all'annotazione `@ExceptionHandler` per gestire le eccezioni che si verificano all'interno del controller.

## @SessionAttribute

Questa annotazione viene utilizzata a livello di parametro del metodo. L'annotazione` @SessionAttribute `viene utilizzata per associare il parametro del metodo a un attributo di sessione. Questa annotazione fornisce un comodo accesso agli attributi di sessione esistenti o permanenti.

## @SessionAttributes

Questa annotazione viene applicata a livello di tipo per un gestore specifico. L'annotazione `@SessionAtrributes` viene utilizzata quando si desidera aggiungere un oggetto JavaBean in una sessione. Viene utilizzato quando si desidera mantenere l'oggetto in sessione per breve durata. @SessionAttributes `viene utilizzato insieme a @ModelAttribute.
Considera questo esempio.

```java
    @ModelAttribute("person")
    public Person getPerson(){} 
    // within the same controller as above snippet
    @Controller
    @SeesionAttributes(value="person", types={Person.class})
    public class PersonController{}
```

Il nome `@ModelAttribute` è assegnato a `@SessionAttributes` come valore. `@SessionAttributes` ha due elementi. L'elemento value è il nome della sessione nel modello e l'elemento types è il tipo di attributi della sessione nel modello.
Annotazioni di Spring Cloud

## @EnableConfigServer

Questa annotazione viene utilizzata a livello di classe. Quando si sviluppa un progetto con una serie di servizi, è necessario disporre di un modo centralizzato e semplice per configurare e recuperare le configurazioni su tutti i servizi che si intende sviluppare. Un vantaggio dell'utilizzo di un server di configurazione centralizzato è che non è necessario sostenere l'onere di ricordare dove ogni configurazione è distribuita su più componenti e distribuiti.

Puoi usare l'annotazione "@EnableConfigServer" di Spring cloud per avviare un server di configurazione con cui le altre applicazioni possano parlare.

## @EnableEurekaServer

Questa annotazione viene applicata alle classi Java. Un problema che potresti riscontrare durante la decomposizione dell'applicazione in microservizi è che diventa difficile per ogni servizio conoscere l'indirizzo di ogni altro servizio da cui dipende. Viene fornito il servizio di rilevamento che è responsabile del monitoraggio delle posizioni di tutti gli altri microservizi.
Eureka di Netflix è un'implementazione di un server di rilevamento e l'integrazione è fornita da Spring Boot. Spring Boot ha semplificato la progettazione di un server Eureka semplicemente annotando la classe di immissione con @EnableEurekaServer.

## @EnableDiscoveryClient

Questa annotazione viene applicata alle classi Java. Per dire a qualsiasi applicazione di registrarsi con Eureka devi solo aggiungere l'annotazione `@EnableDiscoveryClient` al punto di ingresso dell'applicazione. L'applicazione ora registrata con Eureka utilizza l'astrazione di Spring Cloud Discovery Client per interrogare il registro per il proprio host e porta.

## @EnableCircuitBreaker

Questa annotazione viene applicata alle classi Java che possono fungere da interruttore. Il modello dell'interruttore automatico può consentire a un micro servizio di continuare a funzionare in caso di guasto di un servizio correlato, impedendo il guasto in cascata. Ciò consente inoltre al servizio non riuscito di recuperare.

La classe annotata con `@EnableCircuitBreaker` monitorerà, aprirà e chiuderà l'interruttore.

## @HystrixCommand

Questa annotazione viene utilizzata a livello di metodo. La libreria Hystrix di Netflix fornisce l'implementazione del modello Circuit Breaker. Quando si applica l'interruttore a un metodo, Hystrix osserva i guasti del metodo. Una volta che i guasti raggiungono una soglia, Hystrix apre il circuito in modo che anche le chiamate successive falliscano. Ora Hystrix reindirizza le chiamate al metodo e vengono passate ai metodi di fallback specificati.
Hystrix cerca qualsiasi metodo annotato con l'annotazione `@HystrixCommand` e lo avvolge in un proxy collegato a un interruttore in modo che Hystrix possa monitorarlo.

Considera il seguente esempio:

```java
    @Service
    public class BookService{
        private final RestTemplate restTemplate; 
        public BookService(RestTemplate rest){
          this.restTemplate =   rest;
        }                                           
      @HystrixCommand(fallbackMethod = "newList")                                                                     public String bookList(){
        URI uri = URI.create("http://localhost:8081/recommended");                                                      return this.restTemplate.getForObject(uri, String.class);  
      }
      public String newList(){
        return "Cloud native Java";
      }
    }
```

Qui` @HystrixCommand `viene applicato al metodo originale bookList (). L'annotazione `@HystrixCommand` ha newList come metodo di fallback. Quindi, per qualche motivo, se Hystrix apre il circuito su bookList (), avrai un elenco di libri segnaposto pronto per gli utenti.
Spring Framework 5
Scopri Spring Framework 5 con il mio corso Spring Framework 5: dal principiante al guru!
Annotazioni DataAccess di Spring Framework

## @Transactional

Questa annotazione viene posizionata prima di una definizione di interfaccia, un metodo su un'interfaccia, una definizione di classe o un metodo pubblico su una classe. La semplice presenza di `@Transactional` non è sufficiente per attivare il comportamento transazionale. Il `@Transactional` è semplicemente un metadata che può essere utilizzato da alcune infrastrutture di runtime. Questa infrastruttura utilizza i metadati per configurare i bean appropriati con comportamento transazionale.

L'annotazione supporta ulteriormente la configurazione come:
Il tipo di propagazione della transazione
    Il livello di isolamento della transazione
    Un timeout per l'operazione avvolta dalla transazione
    Un flag di sola lettura - un suggerimento per il provider di persistenza che la transazione deve essere di sola lettura
    Le regole di rollback per la transazione

Annotazioni basate sulla cache

## @Cacheable

Questa annotazione viene utilizzata sui metodi. Il modo più semplice di abilitare il comportamento della cache per un metodo è annotarlo con `@Cacheable` e parametrizzarlo con il nome della cache in cui verranno archiviati i risultati.

```java
    @Cacheable ( "Indirizzi")
    public String getAddress (Book book) {...}
```

Nel frammento precedente, il metodo getAddress è associato alla cache denominata indirizzi. Ogni volta che viene chiamato il metodo, la cache viene controllata per vedere se l'invocazione è già stata eseguita e non deve essere ripetuta.

## @CachePut

Questa annotazione viene utilizzata sui metodi. Ogni volta che è necessario aggiornare la cache senza interferire con l'esecuzione del metodo, è possibile utilizzare l'annotazione` @CachePut `. Cioè, il metodo verrà sempre eseguito e il risultato verrà memorizzato nella cache.

```java
    @CachePut ( "Indirizzi")
    public String getAddress (Book book) {...}
```

L'uso di `@CachePut` e` @Cacheable `sullo stesso metodo è fortemente sconsigliato in quanto il primo impone l'esecuzione per eseguire un aggiornamento della cache, il secondo fa sì che l'esecuzione del metodo venga saltata utilizzando la cache.

## @CacheEvict

Questa annotazione viene utilizzata sui metodi. Non è sempre necessario popolare la cache con sempre più dati. A volte potresti voler rimuovere alcuni dati della cache in modo da poter popolare la cache con alcuni nuovi valori. In tal caso, utilizzare l'annotazione` @CacheEvict`.

```java
    @CacheEvict (value = "indirizzi", allEntries = "true")
    public String getAddress (Book book) {...}
```

Qui viene utilizzato un elemento aggiuntivo allEntries insieme al nome della cache da svuotare. È impostato su true in modo che cancelli tutti i valori e si prepari a conservare nuovi dati.

## @CacheConfig

Questa annotazione è un'annotazione a livello di classe. L'annotazione `@CacheConfig` aiuta a semplificare alcune delle informazioni della cache in un unico posto. Posizionare questa annotazione su una classe non attiva alcuna operazione di memorizzazione nella cache. Ciò ti consente di archiviare la configurazione della cache a livello di classe in modo da non dover dichiarare le cose più volte.
Esecuzione di attività e pianificazione delle annotazioni

## @Scheduled

Questa annotazione è un'annotazione a livello di metodo. L'annotazione` @Scheduled` viene utilizzata sui metodi insieme ai metadati del trigger. Un metodo con `@Scheduled` dovrebbe avere un tipo di ritorno vuoto e non dovrebbe accettare alcun parametro.

Esistono diversi modi di usare l'annotazione` @Scheduled `:
```java
    @Scheduled(fixedDelay=5000)
    public void doSomething() {
      // something that should execute periodically   
    }
```

In questo caso, viene fissata la durata tra la fine dell'ultima esecuzione e l'inizio della prossima esecuzione. Le attività attendono sempre fino al termine di quello precedente.
```java
    @Scheduled(fixedRate=5000)
    public void doSomething() { 
      // something that should execute periodically 
    }
```

In questo caso, l'inizio dell'esecuzione dell'attività non attende il completamento dell'esecuzione precedente.
```java
    @Scheduled(initialDelay=1000,fixedRate=5000)
    public void doSomething() { 
     // something that should execute periodically after an initial delay  
    }
```

L'attività viene eseguita inizialmente con un ritardo, quindi continua con la velocità fissa specificata.

## @Async

Questa annotazione viene utilizzata sui metodi per eseguire ciascun metodo in un thread separato. L'annotazione` @Async` viene fornita su un metodo in modo che l'invocazione di quel metodo avvenga in modo asincrono. A differenza dei metodi annotati con @Scheduled, i metodi annotati con `@Async` possono accettare argomenti. Saranno invocati in modo normale dai chiamanti in fase di esecuzione anziché da un'attività pianificata.

`@Async` può essere utilizzato sia con i metodi del tipo restituito vuoto sia con i metodi che restituiscono un valore. Tuttavia, i metodi con valore di ritorno devono avere valori di ritorno tipizzati Future.
Annotazioni di test di Spring Framework

## @BootstrapWith

Questa annotazione è un'annotazione a livello di classe. L'annotazione` @BootstrapWith` viene utilizzata per configurare il modo in cui viene avviato il bootstrap di Spring TestContext Framework. Questa annotazione viene utilizzata come metadata per creare annotazioni composte personalizzate e ridurre la duplicazione della configurazione in una suite di test.

## @ContextConfiguration

Questa annotazione è un'annotazione a livello di classe che definisce i metadati utilizzati per determinare quali file di configurazione utilizzare per caricare ApplicationContext per il test. Più specificamente, @ContextConfiguration `dichiara le classi annotate che verranno utilizzate per caricare il contesto. Puoi anche dire a Spring dove trovare il file.

`@ContextConfiguration (locations = {"example / test-context.xml", loader = Custom ContextLoader.class})`

## @WebAppConfiguration

Questa annotazione è un'annotazione a livello di classe. `@WebAppConfiguration` viene utilizzato per dichiarare che ApplicationContext caricato per un test di integrazione deve essere un WebApplicationContext. Questa annotazione viene utilizzata per creare la versione web del contesto dell'applicazione. È importante notare che questa annotazione deve essere usata con l'annotazione `@ContextConfiguration`. Il percorso predefinito alla radice dell'applicazione web è src / main / webapp. Puoi sovrascriverlo passando un percorso diverso a `<code class = "EnlighterJSRAW" data-Merryighter-language = "java" data-Merryighter-theme = "git"> @ WebAppConfiguration </code>`.

## @Timed

Questa annotazione viene utilizzata sui metodi. L'annotazione` @Timed` indica che il metodo di prova annotato deve terminare la sua esecuzione nel periodo di tempo specificato (in millisecondi). Se l'esecuzione supera il tempo specificato nell'annotazione, il test ha esito negativo.

```java
    @Timed(millis=10000)
    public void testLongRunningProcess() {  ... }
```

In questo esempio, il test fallirà se supera i 10 secondi di esecuzione.

## @Repeat

Questa annotazione viene utilizzata sui metodi di prova. Se si desidera eseguire automaticamente un metodo di prova più volte di seguito, è possibile utilizzare l'annotazione` @Repeat`. Il numero di volte in cui deve essere eseguito il metodo di prova è specificato nell'annotazione.

```java
    @Repeat(10)
    @Test
    public void testProcessRepeatedly() {  ... }
```

In questo esempio, il test verrà eseguito 10 volte.

## @Commit

Questa annotazione può essere utilizzata sia come annotazione a livello di classe che a livello di metodo. Dopo l'esecuzione di un metodo di prova, la transazione del metodo di prova transazionale può essere impegnata usando l'annotazione `@Commit`. Questa annotazione trasmette esplicitamente l'intento del codice. Se utilizzata a livello di classe, questa annotazione definisce il commit per tutti i metodi di test all'interno della classe. Se dichiarato come annotazione a livello di metodo, `@Commit` specifica il commit per metodi di test specifici che hanno la precedenza sul commit a livello di classe.

## @RollBack

Questa annotazione può essere utilizzata sia come annotazione a livello di classe che a livello di metodo. L'annotazione` @RollBack` indica se la transazione di un metodo di test transazionale deve essere ripristinata dopo che il test ha completato la sua esecuzione. Se questo true @Rollback (true), viene eseguito il rollback della transazione. In caso contrario, viene eseguita la transazione. Viene utilizzato @Commit `anziché @RollBack (false).

Se utilizzata a livello di classe, questa annotazione definisce il rollback per tutti i metodi di test all'interno della classe.

Se dichiarato come annotazione a livello di metodo, `@RollBack` specifica il rollback per metodi di test specifici che hanno la precedenza sulla semantica di rollback a livello di classe.

## @DirtiesContext

Questa annotazione viene utilizzata sia come annotazione a livello di classe sia a livello di metodo. @DirtiesContext `indica che Spring ApplicationContext è stato modificato o danneggiato in qualche modo e dovrebbe essere chiuso. Ciò attiverà il ricaricamento del contesto prima dell'esecuzione del test successivo. ApplicationContext è contrassegnato come sporco prima o dopo tale metodo annotato, nonché prima o dopo la classe di test corrente.

L'annotazione` @DirtiesContext `supporta le modalità BEFORE_METHOD, BEFORE_CLASS e BEFORE_EACH_TEST_METHOD per la chiusura di ApplicationContext prima di un test.

NOTA: evitare di utilizzare eccessivamente questa annotazione. È un'operazione costosa e se abusata, può davvero rallentare la tua suite di test.

## @BeforeTransaction

Questa annotazione è usata per annotare i metodi vuoti nella classe di test. I metodi annotati di `@BeforeTransaction `indicano che dovrebbero essere eseguiti prima che qualsiasi transazione inizi ad essere eseguita. Ciò significa che il metodo annotato con` @BeforeTransaction `deve essere eseguito prima di qualsiasi metodo annotato con @Transactional.

## @AfterTransaction

Questa annotazione viene utilizzata per annotare i metodi vuoti nella classe di test. I metodi annotati di `@AfterTransaction `indicano che dovrebbero essere eseguiti al termine di una transazione per i metodi di test. Ciò significa che il metodo annotato con `@AfterTransaction` deve essere eseguito dopo il metodo annotato con @Transactional.

## @Sql

Questa annotazione può essere dichiarata su una classe di test o su un metodo di test per eseguire script SQL su un database. L'annotazione` @Sql` configura il percorso delle risorse per gli script SQL che devono essere eseguiti su un determinato database prima o dopo un metodo di test di integrazione. Quando` @Sql `viene utilizzato a livello di metodo, sostituirà qualsiasi` @Sql` definito a livello di classe.

## @SqlConfig

Questa annotazione viene usata insieme all'annotazione `@Sql`. L'annotazione` @SqlConfig` definisce i metadati usati per determinare come analizzare ed eseguire gli script SQL configurati tramite l'annotazione` @Sql `. Se utilizzata a livello di classe, questa annotazione funge da configurazione globale per tutti gli script SQL all'interno della classe di test. Ma quando usato direttamente con l'attributo config di @ Sql, `@SqlConfig` funge da configurazione locale per gli script SQL dichiarati.

## @SqlGroup

Questa annotazione viene utilizzata sui metodi. L'annotazione` @SqlGroup` è un'annotazione contenitore che può contenere diverse annotazioni` @Sql `. Questa annotazione può dichiarare annotazioni `@Sql` nidificate.
Inoltre, `@SqlGroup` viene utilizzato come meta-annotazione per creare annotazioni composte personalizzate. Questa annotazione può anche essere usata insieme ad annotazioni ripetibili, dove `@Sql` può essere dichiarato più volte sullo stesso metodo o classe.

## @SpringBootTest

Questa annotazione viene utilizzata per avviare il contesto Spring per i test di integrazione. Ciò farà apparire l'intero contesto di autoconfigrazione.

## @DataJpaTest

L'annotazione` @DataJpaTest` fornirà solo l'autoconfigurazione richiesta per testare JPA dati di primavera usando un database in memoria come H2.

Questa annotazione viene utilizzata al posto di @SpringBootTest

## @DataMongoTest

Il `@DataMongoTest` fornirà una configurazione automatica minima e un MongoDB incorporato per l'esecuzione dei test di integrazione con Spring Data MongoDB.

## @WebMVCTest

Il `@WebMVCTest` farà apparire un contesto servlet finto per testare il livello MVC. Servizi e componenti non vengono caricati nel contesto. Per fornire queste dipendenze per i test, viene generalmente utilizzata l'annotazione` @MockBean`.

## @AutoConfigureMockMVC

L'annotazione` @AutoConfigureMockMVC `funziona in modo molto simile all'annotazione` @WebMVCTest`, ma viene avviato il contesto completo di Spring Boot.

## @MockBean

Crea e inietta un Mockito Mock per la dipendenza data.

## @JsonTest

Limita la configurazione automatica di Spring Boot ai componenti rilevanti per l'elaborazione di JSON.

Questa annotazione configurerà inoltre automaticamente un'istanza di JacksonTester o GsonTester.

## @TestPropertySource

Annotazione a livello di classe utilizzata per specificare le origini delle proprietà per la classe di test.

[Original Source](https://springframework.guru/spring-framework-annotations/)