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