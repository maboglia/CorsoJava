
# Annotazioni di Spring Cloud

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