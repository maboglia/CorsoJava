

# Annotazioni DataAccess di Spring Framework

## @Transactional

Questa annotazione viene posizionata prima di una definizione di interfaccia, un metodo su un'interfaccia, una definizione di classe o un metodo pubblico su una classe. La semplice presenza di `@Transactional` non è sufficiente per attivare il comportamento transazionale. Il `@Transactional` è semplicemente un metadata che può essere utilizzato da alcune infrastrutture di runtime. Questa infrastruttura utilizza i metadati per configurare i bean appropriati con comportamento transazionale.

L'annotazione supporta ulteriormente la configurazione come:
Il tipo di propagazione della transazione
    Il livello di isolamento della transazione
    Un timeout per l'operazione avvolta dalla transazione
    Un flag di sola lettura - un suggerimento per il provider di persistenza che la transazione deve essere di sola lettura
    Le regole di rollback per la transazione

# Annotazioni basate sulla cache

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

# Annotazioni di test di Spring Framework

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