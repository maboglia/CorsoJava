# Scheda didattica — Java: il connettore universale tra le tecnologie

Informatica · Java Backend · Ecosistemi e integrazione dei sistemi

Obiettivo didattico: comprendere come Java possa essere utilizzato in contesti tecnologici differenti, dalle basi di dati al cloud, dalla gestione dei processi DevOps ai sistemi aziendali, fino alle API e ai microservizi.

## 1. Il concetto chiave

Java non serve soltanto a scrivere programmi autonomi. È anche uno strumento per integrare tecnologie, scambiare dati e realizzare applicazioni distribuite.

Grazie alla JVM, alle librerie, agli SDK e a un ecosistema molto ampio, Java può comunicare con sistemi differenti anche quando questi sono sviluppati con altri linguaggi.

## Applicazioni Java

Logica applicativa · Elaborazione dati · Integrazione

### Librerie, SDK e protocolli

JDBC · HTTP/REST · Client cloud · Connettori · API

Database

Cloud

DevOps

API e servizi

Big Data

Sistemi aziendali

## 2. I principali ambiti di utilizzo

[Apache Spark Architecture Explained](https://images.openai.com/static-rsc-4/Ld1ujnd0gwlrmHmfMddqGJT3iUmZm3HK6IK33JsUkpqhTv8T9KgDuQqOLTuuuVdIaHryf-i4yTgMcxgNT1eqiNzXq0lPnVwGV3Qy7zy0U9drLCcgu0ztvn2A0S2DVV_pyVlWV0SCrbHklN7mFoec3OGrNtDuNTCldS8RGkh3y3M?purpose=inline)

1\. Data Engineering e Big Data

Java può essere utilizzato per elaborare grandi quantità di dati e costruire pipeline di elaborazione.

- Integrazione con Apache Spark e Apache Kafka.
- Elaborazione e trasformazione dei dati.
- Realizzazione di applicazioni distribuite.

Esempio didattico: leggere eventi da Kafka, elaborarli e salvarli in un database.

[Jenkins Pod — Docker outside of Docker Deployment in Kubernetes | by Prasenjit Sarkar | Medium](https://images.openai.com/static-rsc-4/QhQ_YPcRSgcs13_j9dd8kIkOo6k63wkSDC8QGHjWkN3lO5VNVgs2htttreP0lr03-6UdinfEaz2tp2b2d2pNE_t-Hvq24LeutQ-YgNGP4uOJUJ5zXK3r_8QUxHxTR5TUjmyDM4T5VNbs86oMwtOUwsQstTUP1paKgXTGALLiqoQ?purpose=inline)

2\. DevOps e automazione

Java è sia la tecnologia su cui si basa Jenkins sia uno strumento per sviluppare plugin e utility di automazione.

- Creazione di plugin Jenkins.
- Integrazione con pipeline CI/CD.
- Automazione di attività di build, test e distribuzione.
- Interazione con strumenti di containerizzazione e orchestrazione.

Esempio didattico: una pipeline compila un progetto Maven, esegue i test JUnit e crea un'immagine Docker.

[SAP Deutschland](https://images.openai.com/static-rsc-4/IRIfhoV6P-APXIAx3alAZI5hEmzOH_7b60EoOV3tbniHG3wufhKAnYOB3oAGvpRzbh6SAjSCfcaijqyKF10pAsG2z-bS6LxMKDQOLSmwRXN3gGKknqCxYBZbBFLTDIi5UVccfSguNGLy4LrWso9Cm3y3tqCD5BcBmlIfWjGekxc?purpose=inline)

3\. SAP e sistemi gestionali

Java può partecipare all'integrazione con sistemi SAP, in base al prodotto e all'architettura adottata.

- Sviluppo di applicazioni e servizi integrati.
- Utilizzo di API e connettori supportati.
- Scambio di dati con sistemi gestionali aziendali.

Esempio didattico: un servizio Java riceve informazioni da un sistema gestionale e le espone tramite un'API REST.

[Which Cloud Provider You Should I Use | API Ninjas Blog](https://images.openai.com/static-rsc-4/zyRNqetlUzgJmPV6QHP8U9c7GILq6--ckLDKH3bbuNADT_tVsiEITs6DG98mvyz48kQj1nnbA0Fg_mD9rlUwwodjslM4_v3Q-8HczzRJRkMvkrK_FCqalyFebs4CkdN2ElHqiTuhYBxjpAz3gaYk_aCJGXG9NLuwRPDr2V5sCJU?purpose=inline)

4\. Cloud computing

Java dispone di SDK e librerie per interagire con i principali provider cloud.

- AWS SDK for Java.
- Azure SDK per Java.
- Google Cloud client libraries.
- Distribuzione di applicazioni su infrastrutture cloud.

Esempio didattico: un backend Java salva documenti in uno storage cloud e registra i metadati in un database.

[Digisoft](https://images.openai.com/static-rsc-4/vL5x9shfNTa-o58xkC9N9ZOu2TPCho8txRoF_MvUbvKevo4x8IzNcd5Uw_UEqr1RWqa71qQFiLPRgxGAzjUm-rdGsFHDuVU_pCsHc768kplKWbMZWcmiqYb30QEvRocFDcHju5mcl1J1x7GalM9xkOvqja1BDDVLWpdF-mL9qeE?purpose=inline)

5\. Database relazionali e NoSQL

Java può collegarsi a database diversi tramite driver, API standard e librerie specifiche.

- JDBC per i database relazionali.
- JPA e Hibernate per la persistenza a oggetti.
- Driver e client per database NoSQL.
- Operazioni CRUD: creazione, lettura, aggiornamento ed eliminazione.

Esempio didattico: un'applicazione Java salva gli ordini in PostgreSQL e consulta i dati di catalogo in MongoDB.

[I will develop REST APIs using Java Spring Boot | Upwork](https://images.openai.com/static-rsc-4/q2dt_C-avCUwNBttcXSqT2Ypez8Qyb4bsLD5bw69Ypth2mIoZyUyFDU8VnixFr6NnBehAJMkHjBBe7Y5uuefwEvgpPgxh7RXBdzqBlOiFnv2XbwFquTaqKawUvh24cCYxAVDDPyGxEWoodXzf5oDo58BkUzZYqvI37kMROhNWf8?purpose=inline)

6\. API REST e microservizi

Java è molto utilizzato per sviluppare backend che espongono funzionalità tramite servizi web.

- API REST con Spring Boot.
- Serializzazione e deserializzazione JSON.
- Comunicazione tra microservizi tramite HTTP.
- Integrazione con sistemi esterni.

Esempio didattico: un servizio ordini invia una richiesta HTTP a un servizio pagamenti e riceve una risposta JSON.

[Single Sign-On | SSO | Okta](https://images.openai.com/static-rsc-4/NkzLAccOrXOhMquLWFU_Fk4f0__nPlY1wmfbargYmNZFoFX3vF1xmWQJGX4Xl_FSeD1ZuCPeCvd6yoFXkOeAPA0RVx3Zk0kfC9lqIXC9Jz5U6ez6wLl6hfA5zzxsXEbIg1T0FbYnk7z0y8QQeiYoKXN7ZB1DNFmAxMlsLPfcz9Q?purpose=inline)

7\. Applicazioni enterprise

Java può collegare sistemi aziendali esistenti con nuovi servizi e applicazioni.

- Integrazione con CRM, ERP e piattaforme HR.
- Utilizzo di API, middleware e connettori.
- Sviluppo di applicazioni scalabili.
- Interoperabilità tra sistemi legacy e moderni.

Esempio didattico: un'applicazione sincronizza i dati dei clienti con un CRM tramite API autorizzate.

## 3. Le tecnologie da conoscere

| Tecnologia         | Ruolo nell'ecosistema Java                        |
| ------------------ | ------------------------------------------------- |
| JDBC               | Accesso ai database relazionali tramite SQL.      |
| Spring Boot        | Sviluppo rapido di backend e API.                 |
| Apache Kafka       | Trasmissione e gestione di flussi di eventi.      |
| Apache Spark       | Elaborazione distribuita dei dati.                |
| Maven / Gradle     | Gestione delle dipendenze e build.                |
| Docker             | Creazione e distribuzione di container.           |
| Jenkins            | Automazione di build, test e rilascio.            |
| SDK cloud          | Accesso programmatico ai servizi dei provider.    |
| HTTP / REST / JSON | Comunicazione tra applicazioni e sistemi diversi. |

Attenzione: Java non è necessariamente il motore di ogni tecnologia citata. Per esempio, Docker e Kubernetes sono strumenti indipendenti dal linguaggio; Java permette di sviluppare applicazioni che li utilizzano o di automatizzarne alcune operazioni.

## 4. Esempio pratico: un backend Java che integra un sistema esterno

Un'applicazione può ricevere una richiesta HTTP, elaborare i dati e consultarne alcuni in un database. Un semplice esempio mostra come Java comunichi con un servizio esterno attraverso REST.

```
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ClientApi {

    public static void main(String[] args) throws Exception {

        // Crea un client HTTP riutilizzabile.
        HttpClient client = HttpClient.newHttpClient();

        // Prepara una richiesta GET verso un servizio REST.
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(
                    "https://jsonplaceholder.typicode.com/todos/1"))
                .GET()
                .build();

        // Invia la richiesta e riceve la risposta come testo.
        HttpResponse<String> response = client.send(
                request,
                HttpResponse.BodyHandlers.ofString()
        );

        // Mostra il codice HTTP e il contenuto JSON ricevuto.
        System.out.println("Status: " + response.statusCode());
        System.out.println(response.body());
    }
}
```

Questo esempio utilizza l'API `HttpClient`, disponibile da Java 11. Il servizio remoto restituisce un documento JSON, che il programma stampa senza ancora convertirlo in oggetti Java.

Per un'applicazione reale occorre anche gestire errori HTTP, timeout, autenticazione e validazione dei dati.

## 5. Attività pratica per gli studenti

Titolo: Java come ponte tra database e API.

Realizzare una piccola applicazione backend con Spring Boot che gestisca un catalogo di prodotti.

Requisiti:

1. Definire una classe o un `record` per rappresentare un prodotto.
2. Esporre un'API REST con endpoint per elencare e consultare i prodotti.
3. Collegare l'applicazione a un database tramite JDBC oppure Spring Data JPA.
4. Restituire i dati in formato JSON.
5. Eseguire l'applicazione in un container Docker.

Estensione: integrare un servizio esterno oppure pubblicare un evento su Kafka.

### Schema del progetto

Client HTTP

Browser, Postman o altra applicazione

Backend Java + Spring Boot

Controller · Service · Repository

Database

PostgreSQL o MySQL

Docker può essere utilizzato per distribuire il backend e il database in container separati.

## 6. Verifica della comprensione

1\. Quale tecnologia Java permette l'accesso standard ai database relazionali?

JDBC

Docker

Kubernetes

Jenkins

2\. Qual è il ruolo principale di Spring Boot nell'esempio?

Orchestrare container

Sviluppare applicazioni backend e API

Sostituire SQL

Gestire direttamente il sistema operativo

3\. Che cosa permette un'API REST?

Solo esecuzione di programmi locali

Comunicazione tra sistemi attraverso HTTP

Eliminazione delle dipendenze

Compilazione automatica di SQL

4\. Quale affermazione su Docker è corretta?

È un linguaggio Java

È un database NoSQL

È una tecnologia per containerizzare applicazioni

È un framework ORM

5\. Perché Java è utile nell'integrazione aziendale?

Perché tutti i sistemi aziendali usano Java

Perché può comunicare con sistemi diversi tramite API, driver e connettori

Perché non necessita di rete

Perché elimina ogni problema di compatibilità

Correggi il quiz

## 7. Domande di approfondimento

1. Qual è la differenza tra collegarsi direttamente a un database e utilizzare un'API REST?
2. Perché un'applicazione Java può essere eseguita in un container Docker?
3. Quali vantaggi offre un sistema basato su microservizi rispetto a un'unica applicazione monolitica? Quali svantaggi introduce?
4. In che modo Java può essere utilizzato per automatizzare una pipeline CI/CD?
5. Perché, prima di integrare due sistemi aziendali, è necessario verificare autenticazione, formato dei dati, autorizzazioni e compatibilità?

Conclusione: il valore di Java non consiste soltanto nella capacità di realizzare applicazioni, ma anche nella possibilità di far dialogare sistemi differenti. Database, cloud, API, automazione e piattaforme aziendali sono contesti diversi nei quali le competenze Java possono essere riutilizzate.
