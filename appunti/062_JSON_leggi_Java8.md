# Librerie Java - JSON

In Java, ci sono diverse librerie che puoi utilizzare per convertire oggetti Java in formato JSON e viceversa. Due delle librerie più comuni sono Gson e Jackson. Di seguito ti fornisco esempi su come utilizzare entrambe le librerie per eseguire queste conversioni.

---

### Utilizzando Gson

1. **Convertire un oggetto Java in JSON:**

```java
import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        // Creare un oggetto Java
        Person person = new Person("John", 25);

        // Inizializzare Gson
        Gson gson = new Gson();

        // Convertire l'oggetto Java in JSON
        String json = gson.toJson(person);

        // Stampare il risultato
        System.out.println("Oggetto JSON: " + json);
    }
}
```

---

2. **Convertire JSON in oggetto Java:**

```java
import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        // Stringa JSON
        String json = "{\"name\":\"John\",\"age\":25}";

        // Inizializzare Gson
        Gson gson = new Gson();

        // Convertire JSON in oggetto Java
        Person person = gson.fromJson(json, Person.class);

        // Stampare il risultato
        System.out.println("Oggetto Java: " + person);
    }
}
```

---

### Utilizzando Jackson

1. **Convertire un oggetto Java in JSON:**

```java
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws Exception {
        // Creare un oggetto Java
        Person person = new Person("John", 25);

        // Inizializzare ObjectMapper
        ObjectMapper objectMapper = new ObjectMapper();

        // Convertire l'oggetto Java in JSON
        String json = objectMapper.writeValueAsString(person);

        // Stampare il risultato
        System.out.println("Oggetto JSON: " + json);
    }
}
```

---

2. **Convertire JSON in oggetto Java:**

```java
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws Exception {
        // Stringa JSON
        String json = "{\"name\":\"John\",\"age\":25}";

        // Inizializzare ObjectMapper
        ObjectMapper objectMapper = new ObjectMapper();

        // Convertire JSON in oggetto Java
        Person person = objectMapper.readValue(json, Person.class);

        // Stampare il risultato
        System.out.println("Oggetto Java: " + person);
    }
}
```

Assicurati di avere le librerie Gson o Jackson nel tuo progetto per eseguire questi esempi. Inoltre, nel caso degli esempi sopra, è necessario avere una classe `Person` con i relativi getter e setter.

---

## JSON.org

JSON.org fornisce una libreria Java semplice e leggera chiamata JSON-java, che puoi utilizzare per manipolare oggetti JSON. Di seguito sono forniti esempi di come convertire oggetti Java in JSON e viceversa utilizzando JSON-java:

### Utilizzando JSON-java (json.org)

1. **Convertire un oggetto Java in JSON:**

```java
import org.json.JSONObject;

public class Main {
    public static void main(String[] args) {
        // Creare un oggetto Java
        Person person = new Person("John", 25);

        // Convertire l'oggetto Java in JSON
        JSONObject jsonObject = new JSONObject(person);

        // Stampare il risultato
        System.out.println("Oggetto JSON: " + jsonObject.toString());
    }
}
```

---

2. **Convertire JSON in oggetto Java:**

```java
import org.json.JSONObject;

public class Main {
    public static void main(String[] args) {
        // Stringa JSON
        String jsonString = "{\"name\":\"John\",\"age\":25}";

        // Convertire JSON in oggetto Java
        JSONObject jsonObject = new JSONObject(jsonString);
        Person person = new Person(jsonObject.getString("name"), jsonObject.getInt("age"));

        // Stampare il risultato
        System.out.println("Oggetto Java: " + person);
    }
}
```

Ricorda che per eseguire questi esempi, è necessario includere la libreria JSON-java nel tuo progetto. Puoi scaricarla dal sito ufficiale di JSON.org o includerla come dipendenza nel tuo sistema di gestione delle dipendenze (ad esempio, Maven o Gradle). Assicurati di avere i permessi necessari per l'utilizzo della libreria nel tuo progetto.

---

## eseguire operazioni CRUD su servizi RESTful

Per eseguire operazioni CRUD (Create, Read, Update, Delete) con Java e JSON su servizi RESTful, solitamente utilizziamo librerie come `HttpClient` per inviare richieste HTTP. Di seguito, fornirò un esempio di come eseguire operazioni CRUD con Java utilizzando una risorsa JSON remota. In questo caso, useremo il servizio [JSONPlaceholder](https://jsonplaceholder.typicode.com/) come esempio di API REST.

```java
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RestCrudExample {
    private static final String BASE_URL = "https://jsonplaceholder.typicode.com/users";

    // Metodo per eseguire una richiesta GET
    public static void doGetRequest() throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE_URL))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("GET Response:");
        System.out.println(response.body());
    }

    // Metodo per eseguire una richiesta POST
    public static void doPostRequest() throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE_URL))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString("{\"name\":\"John\",\"email\":\"john@example.com\"}"))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("POST Response:");
        System.out.println(response.body());
    }

    // Metodo per eseguire una richiesta PUT
    public static void doPutRequest() throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE_URL + "/1"))
                .header("Content-Type", "application/json")
                .PUT(HttpRequest.BodyPublishers.ofString("{\"name\":\"Updated Name\",\"email\":\"updated@example.com\"}"))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("PUT Response:");
        System.out.println(response.body());
    }

    // Metodo per eseguire una richiesta DELETE
    public static void doDeleteRequest() throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE_URL + "/1"))
                .DELETE()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("DELETE Response:");
        System.out.println(response.body());
    }

    public static void main(String[] args) {
        try {
            // Eseguiamo una richiesta GET
            doGetRequest();

            // Eseguiamo una richiesta POST
            doPostRequest();

            // Eseguiamo una richiesta PUT
            doPutRequest();

            // Eseguiamo una richiesta DELETE
            doDeleteRequest();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

In questo esempio, stiamo interagendo con la risorsa "users" di JSONPlaceholder. Modifica le richieste e i dati JSON di input/output in base alle tue esigenze specifiche. Assicurati di gestire le eccezioni e di considerare la sicurezza quando lavori con chiamate RESTful in un'applicazione del mondo reale.

---

## deserializzare oggetti Json

Quando ricevi una risposta JSON da una richiesta GET, devi deserializzarla in un oggetto Java per poterla manipolare più agevolmente. In questo esempio, useremo la libreria Gson per eseguire la deserializzazione dell'oggetto JSON in un oggetto Java. Assicurati di aggiungere la libreria Gson al tuo progetto.

---

Ecco come potrebbe apparire l'aggiornamento del metodo `doGetRequest()` nell'esempio precedente per includere la deserializzazione:

```java
import com.google.gson.Gson;

public class RestCrudExample {
    // ... altri metodi ...

    // Metodo per eseguire una richiesta GET e deserializzare la risposta in un oggetto Java
    public static void doGetRequestAndDeserialize() throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE_URL))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Deserializzare la risposta JSON in un oggetto Java
        Gson gson = new Gson();
        Person[] users = gson.fromJson(response.body(), Person[].class);

        // Stampare il risultato
        System.out.println("GET Response deserializzato:");
        for (Person user : users) {
            System.out.println(user);
        }
    }

    // ... altri metodi ...
}
```

Nell'esempio sopra, stiamo usando `fromJson` di Gson per convertire la risposta JSON in un array di oggetti `Person`. Assicurati che la struttura dell'oggetto Java (`Person` nel tuo caso) corrisponda alla struttura del JSON restituito dal servizio REST.

---

## Jackson vs Gson

La scelta tra Gson e Jackson dipende dalle esigenze specifiche del tuo progetto e dalle tue preferenze. Entrambe le librerie sono ampiamente utilizzate e supportate nella comunità Java. Ecco alcune considerazioni che potrebbero aiutarti a prendere una decisione:

---

### Gson

1. **Semplicità d'uso:** Gson è noto per la sua semplicità e facilità d'uso. Ha un'API intuitiva che rende la serializzazione e la deserializzazione degli oggetti Java in JSON (e viceversa) abbastanza diretta.
2. **Leggibilità del codice:** L'API di Gson è spesso considerata più pulita e facile da leggere rispetto a Jackson, il che può essere vantaggioso soprattutto per i principianti.
3. **Performance:** In alcuni casi, Gson potrebbe essere leggermente più veloce di Jackson in operazioni di serializzazione e deserializzazione.

---

### Jackson

1. **Flessibilità:** Jackson è noto per essere molto flessibile e potente. Ha un'ampia gamma di funzionalità avanzate che possono essere utili in scenari più complessi.
2. **Performance avanzate:** In alcuni benchmark, Jackson è risultato essere più veloce di Gson, specialmente in scenari di grandi volumi di dati. Tuttavia, le differenze di prestazioni potrebbero variare a seconda del contesto e delle operazioni effettuate.
3. **Supporto di Jackson Annotations:** Jackson fornisce un sistema di annotazioni potente per personalizzare il processo di serializzazione e deserializzazione, offrendo maggiore controllo su come vengono gestiti i dati.

In sintesi, se la semplicità e la leggibilità del codice sono prioritarie per il tuo progetto, potresti optare per Gson. Se hai esigenze più avanzate, necessiti di funzionalità particolari o desideri massimizzare le prestazioni, potresti preferire Jackson. Inoltre, talvolta, le esigenze specifiche del tuo progetto o dell'ecosistema in cui stai lavorando possono influenzare la scelta tra queste due librerie.

---

### Gson

Gson è una libreria Java sviluppata da Google per la serializzazione e la deserializzazione degli oggetti Java in formato JSON e viceversa. Di seguito, una panoramica delle caratteristiche principali di Gson:

### Caratteristiche Principali

1. **Semplicità d'uso:** Gson è progettato per essere intuitivo e facile da usare. La sua API è chiara e concisa, rendendo agevole la conversione tra oggetti Java e JSON.

2. **Supporto per tipi complessi:** Gson gestisce automaticamente la serializzazione e deserializzazione di tipi complessi, inclusi array, collezioni e tipi generici.

3. **Personalizzazione:** Se necessario, è possibile personalizzare il comportamento di Gson utilizzando annotazioni o specificando istruzioni di configurazione. Ad esempio, è possibile ignorare campi specifici o cambiare il nome di un campo nel JSON risultante.

4. **Gestione automatica di oggetti nidificati:** Gson gestisce automaticamente la serializzazione e deserializzazione di oggetti nidificati, semplificando il processo di manipolazione di strutture dati complesse.

5. **Integrazione con JSON e XML:** Gson offre supporto per la conversione tra formati JSON e XML, consentendo una maggiore flessibilità nel trattamento dei dati.

6. **Compatibilità con Android:** Essendo sviluppato da Google, Gson è ampiamente utilizzato nello sviluppo Android ed è incluso nella libreria Android SDK.

7. **Community attiva:** Gson gode di un'ampia adozione nella community Java e ha un buon supporto online. È ben documentato e ha una community attiva che può aiutare in caso di problemi o domande.

---

### Esempio di Utilizzo

Ecco un esempio di base che mostra come utilizzare Gson per convertire un oggetto Java in JSON e viceversa:

```java
import com.google.gson.Gson;

public class GsonExample {
    public static void main(String[] args) {
        // Creare un oggetto Java
        Person person = new Person("John", 25);

        // Inizializzare Gson
        Gson gson = new Gson();

        // Convertire l'oggetto Java in JSON
        String json = gson.toJson(person);
        System.out.println("Oggetto Java convertito in JSON: " + json);

        // Convertire JSON in oggetto Java
        Person personFromJson = gson.fromJson(json, Person.class);
        System.out.println("JSON convertito in Oggetto Java: " + personFromJson);
    }
}
```

---

### Installazione

Puoi includere Gson nel tuo progetto Maven aggiungendo la seguente dipendenza al tuo file `pom.xml`:

```xml
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.8.9</version> <!-- Verifica la versione più recente su Maven Central -->
</dependency>
```

Oppure, se stai utilizzando Gradle, puoi aggiungere la seguente dipendenza al tuo file `build.gradle`:

```gradle
implementation 'com.google.code.gson:gson:2.8.9' // Verifica la versione più recente su Maven Central
```

Gson è una libreria popolare e affidabile per la manipolazione di dati JSON in applicazioni Java e Android. La sua semplicità d'uso e la flessibilità la rendono una scelta comune per progetti di varie dimensioni e complessità.

---

## Leggi un file Json con Java 

...anche qualsiasi altro file :)

```java
package post.json;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class ProvaConnessione {

	private static HttpURLConnection connessione;
	
	public static void main(String[] args) {
		
		BufferedReader reader;
		String line;
		StringBuilder sb = new StringBuilder();
		try {
			URL url = new URL("https://jsonplaceholder.typicode.com/users");
			connessione = (HttpURLConnection) url.openConnection();
			
			//richiesta
			connessione.setRequestMethod("GET");
			connessione.setConnectTimeout(5000);
			connessione.setReadTimeout(5000);
			
			int status = connessione.getResponseCode();
			
			if (status > 299) {
				reader = new BufferedReader(new InputStreamReader(connessione.getErrorStream()));
				while ((line = reader.readLine())!=null) {
					sb.append(line);
					
				}
				reader.close();
			} else {
				reader = new BufferedReader(new InputStreamReader(connessione.getInputStream()));
				while ((line = reader.readLine())!=null) {
					sb.append(line);
					
				}
				reader.close();
			}
			System.out.println(sb.toString());
		} catch (MalformedURLException e) {
			// TODO: handle exception
		}  catch (IOException e) {
			// TODO: handle exception
		} finally {
			connessione.disconnect();
		}
		
	}
}

```

## processa il JSON

[Scarica org.json jar](https://github.com/stleary/JSON-java)

```java


import org.json.JSONArray;
import org.json.JSONObject;
	
	public static String parse(String response) {
		JSONArray utenti = new JSONArray(response);
		for (int i = 0; i < utenti.length(); i++) {
			JSONObject utente = utenti.getJSONObject(i);
			int id =  utente.getInt("id");
			String username = utente.getString("username");
			System.out.println(username);
			
		}
		return null;
	}
```

---

## con Java 11 puoi usare un altro metodo per fare richieste

```java

package post.json;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ProvaLetturaJSON {
	
	public static void main(String[] args) {
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest richiesta = HttpRequest.newBuilder().uri(URI.create("https://jsonplaceholder.typicode.com/users")).build();
		client.sendAsync(richiesta, HttpResponse.BodyHandlers.ofString())
		.thenApply(HttpResponse::body)
		.thenAccept(System.out::println)
		.join();
	}

}


```