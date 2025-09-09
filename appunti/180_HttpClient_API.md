# 🔹 Perché un nuovo HttpClient?

Prima di Java 11, le alternative standard erano:

* **`HttpURLConnection`** → molto verboso e datato.
* Librerie esterne (Apache HttpClient, OkHttp).

Con Java 11 arriva un **HttpClient moderno**, che supporta:

* HTTP/1.1 e **HTTP/2**.
* Richieste **sincrone** e **asincrone**.
* API fluente e leggibile.

---

# 🔹 Creazione di un HttpClient

```java
HttpClient client = HttpClient.newHttpClient();
```

Puoi anche configurarlo:

```java
HttpClient client = HttpClient.newBuilder()
        .version(HttpClient.Version.HTTP_2) // Forza HTTP/2
        .followRedirects(HttpClient.Redirect.NORMAL)
        .build();
```

---

# 🔹 GET Sincrono

```java
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpExample {
    public static void main(String[] args) throws Exception {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts/1"))
                .build();

        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("Status: " + response.statusCode());
        System.out.println("Body: " + response.body());
    }
}
```

---

# 🔹 GET Asincrono

```java
HttpClient client = HttpClient.newHttpClient();

HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create("https://jsonplaceholder.typicode.com/posts/1"))
        .build();

client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
      .thenApply(HttpResponse::body)
      .thenAccept(System.out::println)
      .join();
```

---

# 🔹 POST con JSON

```java
String json = """
    {
        "title": "Java 11 HttpClient",
        "body": "Funziona!",
        "userId": 1
    }
    """;

HttpClient client = HttpClient.newHttpClient();

HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
        .header("Content-Type", "application/json")
        .POST(HttpRequest.BodyPublishers.ofString(json))
        .build();

HttpResponse<String> response =
        client.send(request, HttpResponse.BodyHandlers.ofString());

System.out.println("Status: " + response.statusCode());
System.out.println("Response: " + response.body());
```

---

# 🔹 Vantaggi per i junior

* Sintassi moderna e semplice.
* Supporto integrato a **HTTP/2** e asincronia.
* Non serve più dipendere da librerie esterne per le chiamate più comuni.

---

# 🧩 **Esercizi su `HttpClient` (Java 11+)**

---

## 🔹 Esercizio 1 — GET semplice

Scrivi un programma che esegue una richiesta **GET** a `https://jsonplaceholder.typicode.com/posts/1` e stampa il body della risposta.

👉 Hint:

```java
HttpClient client = HttpClient.newHttpClient();
HttpRequest request = HttpRequest.newBuilder(URI.create("...")).build();
HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
```

---

## 🔹 Esercizio 2 — POST con JSON

Invia una richiesta **POST** a `https://jsonplaceholder.typicode.com/posts` con un JSON nel body, ad esempio:

```json
{
  "title": "Corso Java",
  "body": "HttpClient esercizio",
  "userId": 1
}
```

e stampa la risposta.

👉 Hint: `HttpRequest.BodyPublishers.ofString(json)`

---

## 🔹 Esercizio 3 — Richiesta asincrona

Fai una richiesta **GET** asincrona (`sendAsync`) e stampa la risposta quando arriva.

👉 Hint: `CompletableFuture<HttpResponse<String>>`

---

## 🔹 Esercizio 4 — Headers

Fai una GET a `https://httpbin.org/headers` e stampa tutti gli **header di risposta**.

👉 Hint: `response.headers().map().forEach(...)`

---

## 🔹 Esercizio 5 — Redirects

Crea un client che segua automaticamente i redirect.
Esegui una GET a `http://httpbin.org/redirect/1` e verifica il risultato.

👉 Hint: `HttpClient.newBuilder().followRedirects(HttpClient.Redirect.ALWAYS)`

---

## 🔹 Esercizio 6 — Timeout

Imposta un **timeout di 2 secondi** su una richiesta e provala contro `http://httpbin.org/delay/5`.
Deve generare `HttpTimeoutException`.

👉 Hint: `HttpRequest.newBuilder().timeout(Duration.ofSeconds(2))`

---

## 🔹 Esercizio 7 — Download in file

Scarica una pagina HTML (`https://www.example.com`) e salvala in un file `output.html`.

👉 Hint: `HttpResponse.BodyHandlers.ofFile(Paths.get("output.html"))`

---

## 🔹 Esercizio 8 — Client personalizzato

Crea un `HttpClient` con:

* HTTP/2
* Proxy disabilitato
* Versione forzata

👉 Hint: `HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).build()`

---

## 🔹 Esercizio 9 — API JSON parsing

Fai una GET a `https://jsonplaceholder.typicode.com/users/1`, ricevi un JSON, estrai e stampa il campo `"username"`.

👉 Hint: puoi usare `org.json` o `com.fasterxml.jackson.databind.ObjectMapper` (se disponibili) oppure fare parsing manuale.

---

## 🔹 Esercizio 10 — Più richieste parallele

Esegui 3 GET asincrone su:

* `/posts/1`
* `/posts/2`
* `/posts/3`
  Aspetta che tutte completino (`CompletableFuture.allOf(...)`) e stampa i risultati.

