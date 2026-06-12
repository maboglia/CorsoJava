# Spring MVC and REST Annotations

---

Spring MVC è un framework leggero che facilita lo sviluppo di applicazioni Web basate su Java. Utilizza il pattern architetturale MVC (Model-View-Controller) per separare la logica di presentazione, la logica di business e la gestione delle richieste.

Ecco alcune delle principali annotazioni utilizzate in Spring MVC:

1. **@Controller**: Utilizzata per annotare una classe che funge da controller. Indica a Spring che la classe contiene metodi di gestione delle richieste HTTP.

2. **@RequestMapping**: Utilizzata per mappare le richieste HTTP a metodi di controller specifici. Può essere applicata a livello di classe per definire un mapping di base per tutti i metodi del controller, o a livello di metodo per definire un mapping specifico per quel metodo.

3. **@GetMapping**, **@PostMapping**, **@PutMapping**, **@DeleteMapping**: Sono annotazioni di convenienza che combinano @RequestMapping con i metodi HTTP GET, POST, PUT e DELETE rispettivamente. Consentono di definire facilmente il tipo di richiesta HTTP gestita da un metodo del controller.

4. **@RequestParam**: Utilizzata per estrarre i parametri della richiesta HTTP. Viene utilizzata per mappare i parametri della richiesta HTTP ai parametri dei metodi del controller.

5. **@PathVariable**: Utilizzata per estrarre i valori delle variabili della richiesta URI. Consente di utilizzare variabili nella parte di percorso dell'URL e mapparle a parametri dei metodi del controller.

6. **@ResponseBody**: Utilizzata per indicare che il valore restituito da un metodo del controller deve essere serializzato direttamente nella risposta HTTP come corpo della risposta.

7. **@ModelAttribute**: Utilizzata per aggiungere un oggetto al modello di dati del controller. Può essere utilizzata per passare dati dal client al server o per preparare dati per la visualizzazione nel modello.

8. **@PathVariable**: Utilizzata per estrarre i valori delle variabili della richiesta URI. Consente di utilizzare variabili nella parte di percorso dell'URL e mapparle a parametri dei metodi del controller.

Queste sono solo alcune delle annotazioni più comuni utilizzate in Spring MVC. Oltre a queste, ci sono molte altre annotazioni utili per configurare e personalizzare il comportamento del framework.

---

## @Controller


Questa annotazione viene utilizzata su classi Java che svolgono il ruolo di controller nell'applicazione. L'annotazione `@Controller` consente il rilevamento automatico delle classi di componenti nel percorso di classe e la registrazione automatica delle definizioni dei bean per esse. Per abilitare il rilevamento automatico di tali controller con annotazioni, è possibile aggiungere la scansione dei componenti alla propria configurazione. La classe Java annotata con `@Controller` è in grado di gestire più mapping di richieste.

Questa annotazione può essere utilizzata con Spring MVC e Spring WebFlux.

---

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

---

## ` @RequestMapping `Varianti


Spring Framework 4.3 ha introdotto le seguenti varianti a livello di metodo dell'annotazione` @RequestMapping `per esprimere meglio la semantica dei metodi annotati. L'uso di queste annotazioni è diventato il modo standard di definire gli endpoint. Fanno da wrapper a @RequestMapping.

Queste annotazioni possono essere utilizzate con Spring MVC e Spring WebFlux.

---

## @GetMapping


Questa annotazione viene utilizzata per mappare le richieste HTTP GET su metodi specifici del gestore. @GetMapping `è un'annotazione composta che funge da collegamento per @RequestMapping (method = RequestMethod.GET)

---

## @PostMapping


Questa annotazione viene utilizzata per mappare le richieste POST HTTP su metodi specifici del gestore. @PostMapping `è un'annotazione composta che funge da collegamento per @RequestMapping (method = RequestMethod.POST)

---

## @PutMapping


Questa annotazione viene utilizzata per mappare le richieste HTTP PUT su metodi specifici del gestore. @PutMapping `è un'annotazione composta che funge da scorciatoia per @RequestMapping (method = RequestMethod.PUT)

---

## @PatchMapping


Questa annotazione viene utilizzata per mappare le richieste PATCH HTTP su metodi specifici del gestore. @PatchMapping `è un'annotazione composta che funge da scorciatoia per @RequestMapping (method = RequestMethod.PATCH)

---

## @DeleteMapping


Questa annotazione viene utilizzata per mappare le richieste DELETE HTTP su metodi specifici del gestore. @DeleteMapping `è un'annotazione composta che funge da collegamento per @RequestMapping (method = RequestMethod.DELETE)

---

## @ExceptionHandler


Questa annotazione viene utilizzata a livello di metodo per gestire le eccezioni a livello di controller. L'annotazione `@ExceptionHandler` viene utilizzata per definire la classe di eccezione che verrà catturata. È possibile utilizzare questa annotazione sui metodi che devono essere richiamati per gestire un'eccezione. I valori `@ExceptionHandler` possono essere impostati su una matrice di tipi di eccezione. Se viene generata un'eccezione che corrisponde a uno dei tipi nell'elenco, verrà invocato il metodo annotato con il corrispondente `@ExceptionHandler`.

---

## @InitBinder


Questa annotazione è un'annotazione a livello di metodo che svolge il ruolo di identificare i metodi che inizializzano WebDataBinder, un DataBinder che lega il parametro di richiesta agli oggetti JavaBean. Per personalizzare l'associazione dei dati dei parametri di richiesta, è possibile utilizzare i metodi annotati `@InitBinder` all'interno del nostro controller. I metodi annotati con` @InitBinder `supportano tutti i tipi di argomenti supportati dai metodi del gestore.
I metodi annotati `@InitBinder` verranno chiamati per ogni richiesta HTTP se non specifichi l'elemento valore di questa annotazione. L'elemento value può essere un nome di modulo singolo o multiplo o richiedere parametri a cui viene applicato il metodo init binder.
---

## `@Mappings` e @Mapping


Questa annotazione viene utilizzata sui campi. L'annotazione` @Mapping` è una meta annotazione che indica un'annotazione di mappatura web. Quando si mappano nomi di campi diversi, è necessario configurare il campo di origine sul campo di destinazione e per farlo è necessario aggiungere l'annotazione `@Mappings`. Questa annotazione accetta una matrice di `@Mapping` con i campi sorgente e destinazione.

---

## @MatrixVariable


Questa annotazione viene utilizzata per annotare gli argomenti del metodo del gestore richieste in modo che Spring possa iniettare i bit pertinenti dell'URI della matrice. Le variabili matrice possono apparire su qualsiasi segmento separato da un punto e virgola. Se un URL contiene variabili di matrice, il modello di mapping delle richieste deve rappresentarle con un modello URI. L'annotazione `@MatrixVariable` assicura che la richiesta sia abbinata alle variabili di matrice corrette dell'URI.

---

## @PathVariable


Questa annotazione viene utilizzata per annotare gli argomenti del metodo del gestore richieste. L'annotazione` @RequestMapping `può essere utilizzata per gestire le modifiche dinamiche nell'URI in cui un determinato valore URI funge da parametro. È possibile specificare questo parametro usando un'espressione regolare. L'annotazione `@PathVariable` può essere utilizzata per dichiarare questo parametro.

---

## @RequestAttribute


Questa annotazione viene utilizzata per associare l'attributo request a un parametro del metodo del gestore. Spring recupera il valore degli attributi nominati per popolare il parametro annotato con @RequestAttribute. Mentre l'annotazione` @RequestParam `viene utilizzata per legare i valori dei parametri dalla stringa di query, l'``RequestAttribute` viene utilizzata per accedere agli oggetti che sono stati popolati sul lato server.

---

## @RequestBody


Questa annotazione viene utilizzata per annotare gli argomenti del metodo del gestore richieste. L'annotazione` @RequestBody `indica che un parametro del metodo deve essere associato al valore del corpo della richiesta HTTP. HttpMessageConveter è responsabile della conversione dal messaggio di richiesta HTTP in oggetto.

---

## @RequestHeader


Questa annotazione viene utilizzata per annotare gli argomenti del metodo del gestore richieste. L'annotazione` @RequestHeader `viene utilizzata per mappare il parametro controller per richiedere il valore dell'intestazione. Quando Spring mappa la richiesta, `@RequestHeader` controlla ilintestazione con il nome specificato nell'annotazione e associa il suo valore al parametro del metodo del gestore. Questa annotazione ti aiuta a ottenere i dettagli dell'intestazione all'interno della classe controller.

---

## @RequestParam


Questa annotazione viene utilizzata per annotare gli argomenti del metodo del gestore richieste. A volte ottieni i parametri nell'URL della richiesta, principalmente nelle richieste GET. In tal caso, insieme all'annotazione` @RequestMapping `puoi usare l'annotazione` @RequestParam` per recuperare il parametro URL e mapparlo all'argomento del metodo. L'annotazione` @RequestParam `viene utilizzata per associare i parametri di richiesta a un parametro di metodo nel controller.

---

## @RequestPart


Questa annotazione viene utilizzata per annotare gli argomenti del metodo del gestore richieste. L'annotazione` @RequestPart `può essere usata al posto di` @RequestParam` per ottenere il contenuto di una multipart specifica e legarsi all'argomento del metodo annotato con @RequestPart. Questa annotazione prende in considerazione l'intestazione "Content-Type" nella multipart (parte richiesta).

---

## @ResponseBody


Questa annotazione viene utilizzata per annotare i metodi del gestore richieste. L'annotazione` @ResponseBody `è simile all'annotazione` @RequestBody`. L'annotazione` @ResponseBody `indica che il tipo di risultato deve essere scritto direttamente nel corpo della risposta in qualunque formato specificato come JSON o XML. Spring converte l'oggetto restituito in un corpo di risposta utilizzando HttpMessageConveter.

---

## @ResponseStatus


Questa annotazione viene utilizzata su metodi e classi di eccezione. `@ResponseStatus `segna un metodo o una classe di eccezione con un codice di stato e un motivo che deve essere restituito. Quando viene invocato il metodo del gestore, il codice di stato viene impostato sulla risposta HTTP che sovrascrive le informazioni sullo stato fornite con qualsiasi altro mezzo. Una classe di controller può anche essere annotata con` @ResponseStatus` che viene quindi ereditato da tutti i metodi di `@RequestMapping`.

---

## @ControllerAdvice


Questa annotazione viene applicata a livello di classe. Come spiegato in precedenza, per ciascun controller è possibile utilizzare `@ExceptionHandler` su un metodo che verrà chiamato quando si verifica una determinata eccezione. Ma questo gestisce solo quelle eccezioni che si verificano all'interno del controller in cui è definito. Per ovviare a questo problema ora puoi usare l'annotazione `@ControllerAdvice`. Questa annotazione è usata per definire i metodi @ ExceptionHandler, `@InitBinder` e` @ModelAttribute `che si applicano a tutti i metodi` @RequestMapping `. Pertanto, se si definisce l'annotazione` @ExceptionHandler `su un metodo nella classe` @ControllerAdvice`, verrà applicata a tutti i controller.

---

## @RestController


Questa annotazione viene utilizzata a livello di classe. L'annotazione `@RestController` segna la classe come controller in cui ogni metodo restituisce un oggetto dominio anziché una vista. Annotando una classe con questa annotazione non è più necessario aggiungere `@ResponseBody` a tutto il metodo RequestMapping. Significa che non usi più i risolutori di vista o invii HTML in risposta. È sufficiente inviare l'oggetto dominio come risposta HTTP nel formato compreso dai consumatori come JSON.

`@RestController` è un'annotazione di praticità che combina `@Controller` e @ResponseBody.


---

## @RestControllerAdvice


Questa annotazione viene applicata alle classi Java. @RestControllerAdvice `è un'annotazione pratica che combina` @ControllerAdvice `e @ResponseBody. Questa annotazione viene utilizzata insieme all'annotazione `@ExceptionHandler` per gestire le eccezioni che si verificano all'interno del controller.

---

## @SessionAttribute


Questa annotazione viene utilizzata a livello di parametro del metodo. L'annotazione` @SessionAttribute `viene utilizzata per associare il parametro del metodo a un attributo di sessione. Questa annotazione fornisce un comodo accesso agli attributi di sessione esistenti o permanenti.

---

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

---

## @CookieValue

Questa annotazione è usata a livello di parametro del metodo. `@CookieValue`è usato come argomento del metodo di mappatura delle richieste. Il cookie HTTP è associato al parametro `@CookieValue` per un determinato nome di cookie. Questa annotazione viene utilizzata nel metodo annotato con @RequestMapping.
Consideriamo che il seguente valore di cookie viene ricevuto con una richiesta http:

JSESSIONID = 418AB76CD83EF94U85YD34W

Per ottenere il valore del cookie, usa `@CookieValue` in questo modo:

```java
    @RequestMapping("/cookieValue")
      public void getCookieValue(@CookieValue "JSESSIONID" String cookie){
    }
```

---

## @CrossOrigin

Questa annotazione viene utilizzata sia a livello di classe che di metodo per abilitare le richieste di origine incrociata. In molti casi l'host che serve JavaScript sarà diverso dall'host che serve i dati. In tal caso, la condivisione di risorse tra origini (CORS) consente la comunicazione tra domini. Per abilitare questa comunicazione devi solo aggiungere l'annotazione`@CrossOrigin`.

Per impostazione predefinita, l'annotazione`@CrossOrigin` consente a tutte le origini, tutte le intestazioni, i metodi HTTP specificati nell'annotazione` @RequestMapping `e maxAge di 30 min. È possibile personalizzare il comportamento specificando i valori degli attributi corrispondenti.

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

In questo esempio, entrambi i metodi getExample () e getNote () avranno un massimo di 3600 secondi. Inoltre, getExample () consentirà solo le richieste di origine incrociata da <http://example.com>, mentre getNote () consentirà le richieste di origine incrociata da tutti gli host.
