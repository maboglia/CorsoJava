# Richieste HTTP in Java

In Java, ci sono diverse opzioni per eseguire richieste HTTP. Alcuni dei modi più comuni includono l'utilizzo di librerie come `HttpURLConnection`, `HttpClient` (introdotto in Java 11), e librerie di terze parti come Apache HttpClient. Di seguito, fornirò esempi di base per entrambi i metodi principali: `HttpURLConnection` e `HttpClient`.

---

### Utilizzando `HttpURLConnection` (Java standard library)

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLConnectionExample {
    public static void main(String[] args) {
        try {
            // URL della richiesta
            URL url = new URL("https://api.example.com/data");

            // Apri la connessione
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Imposta il metodo di richiesta (GET, POST, ecc.)
            connection.setRequestMethod("GET");

            // Leggi la risposta
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            StringBuilder response = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            // Stampa la risposta
            System.out.println("Risposta: " + response.toString());

            // Chiudi la connessione
            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

---

### Utilizzando `HttpClient` (Java 11 e successivi)

```java
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientExample {
    public static void main(String[] args) {
        try {
            // URL della richiesta
            URI uri = URI.create("https://api.example.com/data");

            // Inizializza HttpClient
            HttpClient client = HttpClient.newHttpClient();

            // Crea la richiesta
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(uri)
                    .GET()
                    .build();

            // Esegui la richiesta e ottieni la risposta
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Stampa la risposta
            System.out.println("Risposta: " + response.body());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

Scegliere tra `HttpURLConnection` e `HttpClient` dipende dalle tue esigenze e dalla versione di Java che stai utilizzando. `HttpClient` è generalmente preferito nelle versioni più recenti di Java per la sua API più moderna e flessibile. Tuttavia, `HttpURLConnection` è ancora ampiamente utilizzato nelle versioni più vecchie di Java e può essere adeguato per scenari più semplici.

---

## HttpClient

`HttpClient` è una classe introdotta in Java 11 per semplificare l'invio di richieste HTTP e la gestione delle risposte. La libreria `java.net.http` fornisce un'implementazione basata su flussi reattivi e asincroni per gestire comunicazioni HTTP più efficacemente rispetto a `HttpURLConnection`. Ecco una spiegazione più dettagliata su come utilizzare `HttpClient`.

---

### Creazione di un'istanza di `HttpClient`

```java
HttpClient httpClient = HttpClient.newHttpClient();
```

Puoi personalizzare l'istanza di `HttpClient` passando opzioni come timeout, configurazioni di proxy e altre. Ad esempio:

```java
HttpClient httpClient = HttpClient.newBuilder()
        .connectTimeout(Duration.ofSeconds(10))
        .proxy(ProxySelector.getDefault())
        .build();
```

---

### Esempio di una richiesta GET sincrona

```java
try {
    URI uri = URI.create("https://api.example.com/data");

    HttpRequest request = HttpRequest.newBuilder()
            .uri(uri)
            .GET()
            .build();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

    System.out.println("Status code: " + response.statusCode());
    System.out.println("Response body: " + response.body());
} catch (IOException | InterruptedException e) {
    e.printStackTrace();
}
```

---

### Esempio di una richiesta GET asincrona

```java
URI uri = URI.create("https://api.example.com/data");

HttpRequest request = HttpRequest.newBuilder()
        .uri(uri)
        .GET()
        .build();

CompletableFuture<HttpResponse<String>> futureResponse =
        httpClient.sendAsync(request, HttpResponse.BodyHandlers.ofString());

futureResponse.thenAccept(response -> {
    System.out.println("Status code: " + response.statusCode());
    System.out.println("Response body: " + response.body());
}).join(); // Attendere la conclusione dell'operazione asincrona
```

---

### Esempio di una richiesta POST sincrona

```java
try {
    URI uri = URI.create("https://api.example.com/data");

    HttpRequest request = HttpRequest.newBuilder()
            .uri(uri)
            .header("Content-Type", "application/json")
            .POST(HttpRequest.BodyPublishers.ofString("{\"key\":\"value\"}"))
            .build();

    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

    System.out.println("Status code: " + response.statusCode());
    System.out.println("Response body: " + response.body());
} catch (IOException | InterruptedException e) {
    e.printStackTrace();
}
```

---

### Esempio di una richiesta POST asincrona

```java
URI uri = URI.create("https://api.example.com/data");

HttpRequest request = HttpRequest.newBuilder()
        .uri(uri)
        .header("Content-Type", "application/json")
        .POST(HttpRequest.BodyPublishers.ofString("{\"key\":\"value\"}"))
        .build();

CompletableFuture<HttpResponse<String>> futureResponse =
        httpClient.sendAsync(request, HttpResponse.BodyHandlers.ofString());

futureResponse.thenAccept(response -> {
    System.out.println("Status code: " + response.statusCode());
    System.out.println("Response body: " + response.body());
}).join(); // Attendere la conclusione dell'operazione asincrona
```

---

`HttpClient` fornisce una sintassi più moderna e un'API più flessibile rispetto a `HttpURLConnection`. Può gestire in modo nativo richieste e risposte asincrone, il che è particolarmente utile in scenari in cui è necessario effettuare chiamate HTTP in modo non bloccante. La libreria supporta vari metodi HTTP, gestione delle intestazioni, timeout personalizzati e altre funzionalità che semplificano lo sviluppo di applicazioni web in Java.


`HttpClient` fa uso del design pattern chiamato "Builder Pattern". Il Builder Pattern è un pattern di progettazione creazionale che fornisce un'interfaccia separata per la creazione di un oggetto complesso, permettendo di costruire diverse rappresentazioni di un oggetto utilizzando lo stesso processo di costruzione. Questo design pattern è utile quando un oggetto ha una costruzione complessa e si desidera rendere il codice più leggibile e manutenibile.

`HttpClient` in Java usa un'implementazione di Builder Pattern per costruire le richieste HTTP in modo fluente. Il processo di costruzione della richiesta è diviso in vari metodi chiamati sulla classe `HttpRequest.Builder`, consentendo di specificare diversi dettagli della richiesta in modo chiaro e ordinato.

---

Ecco un esempio che mostra come `HttpClient` utilizza il Builder Pattern per costruire una richiesta GET:

```java
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientBuilderPatternExample {
    public static void main(String[] args) {
        // URL della richiesta
        URI uri = URI.create("https://api.example.com/data");

        // Creazione di un'istanza di HttpClient utilizzando il Builder Pattern
        HttpClient httpClient = HttpClient.newBuilder()
                .connectTimeout(java.time.Duration.ofSeconds(10))
                .build();

        // Creazione di un'istanza di HttpRequest utilizzando il Builder Pattern
        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .GET()  // Metodo della richiesta
                .header("User-Agent", "Java HttpClient")
                .build();

        try {
            // Eseguire la richiesta e ottenere la risposta
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            // Stampare la risposta
            System.out.println("Status code: " + response.statusCode());
            System.out.println("Response body: " + response.body());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

---

In questo esempio, `HttpClient.newBuilder()` restituisce un oggetto `HttpClient.Builder`, su cui è possibile chiamare diversi metodi per configurare le impostazioni desiderate, come il timeout di connessione (`connectTimeout`). Successivamente, `HttpRequest.newBuilder()` restituisce un oggetto `HttpRequest.Builder`, su cui sono chiamati metodi come `uri`, `GET`, e `header` per configurare la richiesta HTTP. Infine, il metodo `build()` viene chiamato per ottenere l'istanza finale di `HttpClient` o `HttpRequest`.

Il [Builder Pattern](./046_builder_pattern.md) rende il codice più leggibile e facilita l'estensione o la modifica delle configurazioni senza dover creare numerose varianti di costruttori o metodi.

---

## HttpURLConnection

`HttpURLConnection` è una classe disponibile nelle librerie standard di Java (`java.net`) ed è stata utilizzata per molti anni per gestire le connessioni HTTP. È una classe più antica rispetto a `HttpClient`, ma può essere ancora utile, specialmente nelle versioni di Java precedenti a Java 11.

Ecco un'illustrazione di come utilizzare `HttpURLConnection` per eseguire una richiesta HTTP:

### Esempio di una richiesta GET sincrona

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLConnectionExample {
    public static void main(String[] args) {
        try {
            // URL della richiesta
            URL url = new URL("https://api.example.com/data");

            // Apri la connessione
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Imposta il metodo di richiesta (GET, POST, ecc.)
            connection.setRequestMethod("GET");

            // Leggi la risposta
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            StringBuilder response = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            // Stampa la risposta
            System.out.println("Status code: " + connection.getResponseCode());
            System.out.println("Response: " + response.toString());

            // Chiudi la connessione
            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

---

### Esempio di una richiesta POST sincrona

```java
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLConnectionPostExample {
    public static void main(String[] args) {
        try {
            // URL della richiesta
            URL url = new URL("https://api.example.com/data");

            // Apri la connessione
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Imposta il metodo di richiesta (GET, POST, ecc.)
            connection.setRequestMethod("POST");
            connection.setDoOutput(true); // Abilita la scrittura nel corpo della richiesta

            // Dati da inviare nel corpo della richiesta POST
            String postData = "{\"key\":\"value\"}";

            // Scrivi i dati nel corpo della richiesta
            try (DataOutputStream wr = new DataOutputStream(connection.getOutputStream())) {
                wr.writeBytes(postData);
            }

            // Leggi la risposta
            int responseCode = connection.getResponseCode();
            System.out.println("Status code: " + responseCode);

            // Chiudi la connessione
            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

---

`HttpURLConnection` fornisce metodi per impostare diversi aspetti della richiesta, come il metodo di richiesta, le intestazioni, il timeout e altri parametri. È importante notare che `HttpURLConnection` è più verboso rispetto a `HttpClient` e richiede un po' più di codice per gestire alcune operazioni comuni.

Mentre `HttpClient` è preferito nelle versioni più recenti di Java per la sua API più moderna e flessibile, `HttpURLConnection` può ancora essere utile nelle situazioni in cui è necessario supportare versioni più vecchie di Java o quando la semplicità è una priorità.
