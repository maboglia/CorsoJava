# Convertire da Java a JSON e da JSON a Java


## libreria GSON Dependency nel pom.xml

```xml
    <!-- https://mvnrepository.com/artifact/com.google.code.gson/gson -->
    <dependency>
        <groupId>com.google.code.gson</groupId>
        <artifactId>gson</artifactId>
        <version>2.8.0</version>
    </dependency>

```

## Crea un JSON in Java

```java
    JsonObject person = new JsonObject();
    person.addProperty("nome", "Mauro");
    person.addProperty("cognome", "Bogliaccino");
    System.out.println(person.toString());

```

## Crea Inner/Nested JSON

```java
    JsonObject person = new JsonObject();
    person.addProperty("nome", "Mauro");
    person.addProperty("cognome", "Bogliaccino");
    
    // Inner JSON Object 
    JsonObject address = new JsonObject();
    address.addProperty("paese", "it");
    address.addProperty("citta", "Torino");
    person.add("address", address);
    System.out.println(person.toString());

```

## Crea nuovo JSON Array

```java
    // Crea nuovo JSON Array 
    JsonArray languages = new JsonArray();
    languages.add("Java");
    languages.add("Php");
    languages.add("Javascript");
    System.out.println(languages.toString());

```

## Crea  Array JSON a partire da String

```java
    // Crea  Array JSON a partire da String
    String jsonString = "{\"nome\":\"Mauro\",\"cognome\":\"Bogliaccino\"}";
    JsonParser jsonParser = new JsonParser();
    JsonObject objectFromString = jsonParser.parse(jsonString).getAsJsonObject();
     
    System.out.println(objectFromString.toString());

```

## Convertire JSON Array di  String in JSON Array

```java
    JsonParser jsonParser = new JsonParser();
    // Convertire JSON Array di  String in JSON Array 
    String jsonArrayString = "[\"Java\",\"Php\",\"Javascript\"]";
    JsonArray arrayFromString = jsonParser.parse(jsonArrayString).getAsJsonArray();
    System.out.println(arrayFromString.toString())

```

## Convertire JSON Array di String in Java Array List

```java
    // Convertire JSON Array di String in Java Array List
     String jsonArrayString = "[\"Java\",\"Php\",\"Javascript\"]";
     Gson googleJson = new Gson();
     ArrayList javaArrayListFromGSON = googleJson.fromJson(arrayFromString, ArrayList.class);
     
     System.out.println(javaArrayListFromGSON);

```

## Convertire Java POJO in JSON

```java
    //Convertire Java POJO in JSON
    Person personPojo = new Person();
    personPojo.setnome("Mauro");
    personPojo.setcognome("Bogliaccino");
    Gson gsonBuilder = new GsonBuilder().create();
    String jsonFromPojo = gsonBuilder.toJson(personPojo);
    System.out.println(jsonFromPojo);

```

## Convertire Java Map in JSON

```java
     Gson gsonBuilder = new GsonBuilder().create();
    // Convertire Java Map in JSON 
     Map personMap = new HashMap();
     personMap.put("nome", "Mauro");
     personMap.put("cognome", "Bogliaccino");
     String jsonFromJavaMap = gsonBuilder.toJson(personMap);
     
     System.out.println(jsonFromJavaMap);

```

## Convertire Java ArrayList in JSON

```java
    Gson gsonBuilder = new GsonBuilder().create();
    // Convertire Java ArrayList in JSON
    List languagesArrayList = new ArrayList();
    languagesArrayList.add("Java");
    languagesArrayList.add("Php");
    languagesArrayList.add("Javascript");
    String jsonFromJavaArrayList = gsonBuilder.toJson(languagesArrayList);
    System.out.println(jsonFromJavaArrayList);

```

## tutti gli esempi in un solo file 

```java

    import com.google.gson.Gson;
    import com.google.gson.GsonBuilder;
    import com.google.gson.JsonArray;
    import com.google.gson.JsonObject;
    import com.google.gson.JsonParser;
    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;
     
    public class App {
        public static void main(String[] args) {
            
            // Crea nuovo oggetto JSON
            JsonObject person = new JsonObject();
            person.addProperty("nome", "Mauro");
            person.addProperty("cognome", "Bogliaccino");
            System.out.println(person.toString());
            // Crea JSON Innestato 
            JsonObject address = new JsonObject();
            address.addProperty("paese", "it");
            address.addProperty("citta", "Torino");
            person.add("address", address);
            System.out.println(person.toString());
            // Crea nuovo JSON Array 
            JsonArray languages = new JsonArray();
            languages.add("Java");
            languages.add("Php");
            languages.add("Javascript");
            System.out.println(languages.toString());
            // Crea  Array JSON a partire da String
            String jsonString = "{\"nome\":\"Mauro\",\"cognome\":\"Bogliaccino\"}";
            JsonParser jsonParser = new JsonParser();
            JsonObject objectFromString = jsonParser.parse(jsonString).getAsJsonObject();
     
            System.out.println(objectFromString.toString());
            
            // Convertire JSON Array di  String in JSON Array 
            String jsonArrayString = "[\"Java\",\"Php\",\"Javascript\"]";
            JsonArray arrayFromString = jsonParser.parse(jsonArrayString).getAsJsonArray();
            
            System.out.println(arrayFromString.toString());
            
            
            // Convertire JSON Array di String in Java Array List
             Gson googleJson = new Gson();
             ArrayList javaArrayListFromGSON = googleJson.fromJson(arrayFromString, ArrayList.class);
             
             System.out.println(javaArrayListFromGSON);
            
            //Convertire Java POJO in JSON
            Person personPojo = new Person();
            personPojo.setnome("Mauro");
            personPojo.setcognome("Bogliaccino");
            Gson gsonBuilder = new GsonBuilder().create();
            String jsonFromPojo = gsonBuilder.toJson(personPojo);
            
            System.out.println(jsonFromPojo);
            // Convertire Java Map in JSON 
            Map personMap = new HashMap();
            personMap.put("nome", "Mauro");
            personMap.put("cognome", "Bogliaccino");
            String jsonFromJavaMap = gsonBuilder.toJson(personMap);
            
            System.out.println(jsonFromJavaMap);
            // Convert Java Array into JSON
            List languagesArrayList = new ArrayList();
            languagesArrayList.add("Java");
            languagesArrayList.add("Php");
            languagesArrayList.add("Javascript");
            
            String jsonFromJavaArrayList = gsonBuilder.toJson(languagesArrayList);
            
            System.out.println(jsonFromJavaArrayList);
           
        }
    }
```

* http://appsdeveloperblog.com/java-into-json-json-into-java-all-possible-examples/