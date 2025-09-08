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

