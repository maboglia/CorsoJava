# Cos’è un Virtual Thread?

_introdotti definitivamente in **Java 21** come parte del **Project Loom**. 🚀_

Un **Virtual Thread** è un **thread leggero** gestito dalla JVM invece che dal sistema operativo.

* Consente di **creare migliaia di thread** senza consumare molte risorse.
* Mantiene la compatibilità con l’API `java.lang.Thread` esistente.
* Ideale per applicazioni **concorrenziali e I/O-bound**, come server web o client HTTP multipli.

---

## Differenza tra Thread tradizionale e Virtual Thread

| Tipo Thread         | OS Thread | Creazione    | Scalabilità                   |
| ------------------- | --------- | ------------ | ----------------------------- |
| **Platform Thread** | Sì        | Lento        | Limitato (migliaia max)       |
| **Virtual Thread**  | No        | Molto veloce | Scalabile (milioni possibili) |

---

## Creare un Virtual Thread

```java
Thread vt = Thread.ofVirtual().start(() -> {
    System.out.println("Ciao dal Virtual Thread!");
});

vt.join(); // aspetta il completamento
```

* `Thread.ofVirtual()` → builder per creare Virtual Threads.
* `.start()` avvia il thread immediatamente.

---

## Esecuzione con Executor

```java
ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();

executor.submit(() -> System.out.println("Task 1 in Virtual Thread"));
executor.submit(() -> System.out.println("Task 2 in Virtual Thread"));

executor.shutdown();
```

* `newVirtualThreadPerTaskExecutor()` crea un executor dove **ogni task ha un virtual thread dedicato**.
* Perfetto per **I/O parallelo**, HTTP client, scraping, ecc.

---

## Con Virtual Thread + HttpClient

```java
HttpClient client = HttpClient.newHttpClient();
ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();

List<String> urls = List.of(
    "https://jsonplaceholder.typicode.com/posts/1",
    "https://jsonplaceholder.typicode.com/posts/2"
);

urls.forEach(url -> executor.submit(() -> {
    try {
        HttpRequest request = HttpRequest.newBuilder(URI.create(url)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body().substring(0, 50) + "...");
    } catch (Exception e) {
        e.printStackTrace();
    }
}));

executor.shutdown();
```

* Crea **decine o centinaia di richieste simultanee** senza saturare il sistema.

---

## Benefici principali

* **Alta scalabilità** per applicazioni concorrenti.
* **Sintassi familiare** → stessi metodi di `Thread`/`Executor`.
* Riduce la complessità rispetto a **CompletableFuture** o **Reactive Streams** per I/O parallelo.
* Ottimo per **server, API client, scraping, testing parallelo**.

