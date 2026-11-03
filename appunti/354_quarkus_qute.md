# Qute

In Quarkus puoi utilizzare un Template Engine per generare pagine HTML dinamiche direttamente dal backend Java, proprio come fai con Thymeleaf in Spring Boot.

Quarkus mette a disposizione diverse soluzioni. La più interessante da esplorare è Qute, il template engine nativo del framework.

## 1. Qute: il template engine di Quarkus

[Building Developer-Ready Modes for IBM Bob and Quarkus](https://images.openai.com/static-rsc-4/6U2ph0kWNZ8SZdH4sLex6__J-1EgOmX5o9MfikXw0bViwkm13W3N-2HyzFhQDNZazDcweLZ-Gxoq6vK-9aaEiHNyTD1ZCBYQg7iAQZvgzrFcjX8rz1jdITLjefx5K_OY3F9rHeZMSLdigDWOLT8whWP96uRv-bfeRnLZMGnxGjc?purpose=inline)

Qute

Template Engine integrato nell'ecosistema Quarkus

[Documentazione ufficiale](https://quarkus.io/guides/qute?utm_source=chatgpt.com)

Qute permette di separare:

- La logica applicativa, scritta in Java.
- La presentazione, definita nei template HTML.
- I dati, passati dal backend ai template.

Il funzionamento è concettualmente simile a Thymeleaf, ma Qute ha una propria sintassi.

## 2. Come funziona?

Immaginiamo di voler realizzare una pagina HTML che visualizza l'elenco dei contatti presenti nel database.

Java Resource

Recupera i dati dal Service

Qute Template Engine

Combina dati Java e template HTML

HTML generato

Pagina visualizzata dal browser

## 3. Aggiungere Qute al progetto

Nel `pom.xml` aggiungi la dipendenza:

```
<dependency>
    <groupId>io.quarkus</groupId>
    <artifactId>quarkus-rest-qute</artifactId>
</dependency>
```

Questa estensione integra Qute con Quarkus REST.

## 4. Creare il template HTML

Creiamo il file:

`src/main/resources/templates/contacts.html`

```
<!DOCTYPE html>
<html lang="it">
<head>
    <meta charset="UTF-8">
    <title>ContactManager</title>
</head>
<body>

    <h1>Rubrica contatti</h1>

    <table border="1">
        <thead>
            <tr>
                <th>Nome</th>
                <th>Cognome</th>
                <th>Email</th>
                <th>Azienda</th>
            </tr>
        </thead>

        <tbody>
            {#for contact in contacts}
            <tr>
                <td>{contact.nome}</td>
                <td>{contact.cognome}</td>
                <td>{contact.email}</td>
                <td>{contact.azienda}</td>
            </tr>
            {/for}
        </tbody>
    </table>

</body>
</html>
```

Osserva la sintassi:

- `{contact.nome}`: visualizza una proprietà dell'oggetto.
- `{#for ...}`: ciclo di iterazione.
- `{/for}`: chiusura del ciclo.

È Qute che interpreta queste istruzioni e produce HTML.

## 5. Creare il Resource Java

Aggiungiamo un nuovo Resource, separato dalla REST API JSON.

`resource/ContactPageResource.java`

```
package it.corsojava.resource;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import it.corsojava.service.ContactService;

@Path("/contacts-page")
public class ContactPageResource {

    @Inject
    Template contacts;

    @Inject
    ContactService service;

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance showContacts() {

        return contacts.data(
            "contacts",
            service.findAll()
        );
    }
}
```

Qui avviene il passaggio fondamentale:

```
return contacts.data(
    "contacts",
    service.findAll()
);
```

Passiamo al template una variabile chiamata `contacts`, contenente la lista recuperata dal database.

Qute utilizza il nome del template (`contacts.html`) per risolvere il campo iniettato `contacts`.

## 6. Risultato nel browser

Avviamo Quarkus:

```
mvn quarkus:dev
```

Apriamo:

`http://localhost:8080/contacts-page`

[Tutorial:Create Struts2 Hibernate Example Application in Eclipse](https://images.openai.com/static-rsc-4/b2FRlOB1Jb4OAf0xP5NQsUzpEmkpX9zS8sxNntUWPJrz02GlXGxqvfZPgKOKBS0vPBjroKL5B0V_F2JfOGkAMjPnYC91aubCebbf3a9dV96YqH1L-TWR_Lx9c52eouKOjwwe1lF7_tn7DQxiM6YY9eTjCZwMEQ8ueSPrkcS6tyA?purpose=inline)

[viralpatel.net](https://www.viralpatel.net/tutorial-struts2-hibernate-example-eclipse/?utm_source=chatgpt.com)

Il browser riceverà una pagina HTML generata dinamicamente sulla base dei dati presenti in MySQL.

## 7. Qute e Thymeleaf a confronto

| Concetto          | Qute           | Thymeleaf                              |
| ----------------- | -------------- | -------------------------------------- |
| Framework         | Quarkus        | Spring                                 |
| Template HTML     | Sì             | Sì                                     |
| Variabili         | `{nome}`       | `${nome}`                              |
| Cicli             | `{#for ...}`   | `th:each`                              |
| Condizioni        | `{#if ...}`    | `th:if`                                |
| Layout            | Sì             | Sì, anche con Thymeleaf Layout Dialect |
| Integrazione Java | Nativa Quarkus | Ecosistema Spring                      |

## 8. Quando utilizzare Qute?

Qute è indicato per:

- Applicazioni web con pagine HTML dinamiche.
- Dashboard amministrative.
- Pannelli di gestione.
- Applicazioni server-side rendering.
- Generazione di email HTML.
- Pagine che utilizzano dati provenienti da database.

Una distinzione importante: Quarkus REST + Qute permette di realizzare un'applicazione web tradizionale, mentre Quarkus REST + Jackson permette di realizzare API JSON per frontend separati, come Angular o React.
