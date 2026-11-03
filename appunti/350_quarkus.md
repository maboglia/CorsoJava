# Scheda didattica – Quarkus

JAVA BACKEND DEVELOPMENT · FRAMEWORK JAVA

[Quarkus, why you should explore it | by Silas Candiolli | abbeal’s tech blog | Medium](https://images.openai.com/static-rsc-4/wF2wVzT0nlJeU3o4S6hYPyfZPMMIcbQujSpKUnd8GpHaup-HekEcc8NMRb1HNL_oObnm1u8Ovt8P4rJaETzlLzGvNcKUJUgQ4UyYPKQ_9LojlikKHGU-AtG5TJ5STYhGLN9hRn_N3UaDfX47d-NzoSyj_bFOHTakDb-15V_RszY?purpose=inline)

[Quarkus Super-Heroes Workshop: 2025-10-21 Quarkus 3.27.0](https://images.openai.com/static-rsc-4/Ru3jlpv-G1TXvtL3YhJ8-TiPvNdJnj-WepHAUkVhP6w9N-gYWiCZIlpICVq_Y6ZTQMEl6fJqsuvQ3Umbwblxf_PNLt6-uyBtzUGw3F_06GByDWaXQsxQF5qv7eA_PT_LOEbNxI-nM6M3y90DT1QkWk13o9AtU2wvi3XBrLCkXBE?purpose=inline)

[Developing serverless Applications with Quarkus | Niklas Heidloff](https://images.openai.com/static-rsc-4/cmMRahM6aV3s2E16JieBN34OodQqyIBhycdsvTOsPz9ZDpBHfAaRR2fgq128v_Vlr1cwlPmYD98YkcNYvRmmH1fdTw9Ud93ela4PMULnfrGxQb8ju57ihUwED0UoP6WLpYlpEHnUOAgLO6njLhY9IlRjIEdfEp9qB2URzJGAoCM?purpose=inline)

8

## 1. Che cos'è Quarkus?

Quarkus è un framework open source per lo sviluppo di applicazioni Java, progettato per realizzare applicazioni moderne, microservizi e sistemi cloud-native.

Nasce con l'obiettivo di rendere Java particolarmente efficiente negli ambienti containerizzati e Kubernetes, riducendo:

- Tempi di avvio delle applicazioni.
- Consumo di memoria.
- Tempi di build e deployment.
- Complessità nella realizzazione di microservizi.

È spesso definito Supersonic Subatomic Java, uno slogan che richiama la sua attenzione verso prestazioni ed efficienza.

## 2. Perché utilizzare Quarkus?

I framework Java tradizionali sono stati storicamente progettati per applicazioni server di grandi dimensioni, spesso eseguite all'interno di application server.

Quarkus nasce invece con una filosofia moderna: ottimizzare Java per il cloud e per ambienti distribuiti.

Avvio rapido

Riduzione dei tempi di startup delle applicazioni.

Basso consumo

Utilizzo efficiente della memoria RAM.

Cloud Native

Integrazione con Docker e Kubernetes.

Developer Experience

Hot reload e strumenti per velocizzare lo sviluppo.

## 3. Caratteristiche principali

| Caratteristica            | Descrizione                                                  |
| ------------------------- | ------------------------------------------------------------ |
| Java                      | Supporta Java e il relativo ecosistema                       |
| Supersonic Subatomic Java | Ottimizzazione per startup e memoria                         |
| Live Coding               | Modifiche al codice visibili rapidamente durante lo sviluppo |
| GraalVM Native Image      | Possibilità di compilare applicazioni in eseguibili nativi   |
| Kubernetes                | Integrazione con ambienti containerizzati                    |
| Extensions                | Architettura modulare basata su estensioni                   |
| Reactive Programming      | Supporto alla programmazione reattiva                        |
| REST API                  | Realizzazione di servizi REST                                |

## 4. Architettura e tecnologie

Quarkus non è semplicemente un framework per creare API REST: mette a disposizione un ecosistema di componenti integrabili.

[Quarkus fundamentals - DEV Community](https://images.openai.com/static-rsc-4/XlgWDTsNyYeTxPEGQq_qJ4xjIKiHqTLglQt_KV8tE9HkzRO6W1rjhys8tW5qoZI-BmoTBDX1227U9X1sePiUMub2ZO5mly6RokiAEqxLksbyf-TSLo1mT17d3jN2eeLYbOPj1v9k2CFHqkn5GNnuAAmKdcqEovv94v66gcxR34s?purpose=inline)

[dev.to](https://dev.to/pierregmn/quarkus-fundamentals-n77?utm_source=chatgpt.com)

Alcune tecnologie importanti:

- Quarkus REST: sviluppo di servizi REST.
- Hibernate ORM with Panache: gestione della persistenza e interazione con database relazionali.
- Hibernate Validator: validazione dei dati.
- ArC (CDI): dependency injection e gestione dei componenti.
- SmallRye: implementazioni e integrazioni per specifiche tecnologie cloud-native e reactive.
- MicroProfile: standard per lo sviluppo di microservizi Java.
- OpenAPI: documentazione delle API REST.

## 5. Quarkus e Spring Boot a confronto

Quarkus e Spring Boot sono due soluzioni molto diffuse per lo sviluppo backend Java.

| Aspetto              | Quarkus            | Spring Boot                 |
| -------------------- | ------------------ | --------------------------- |
| Linguaggio           | Java               | Java                        |
| Applicazioni REST    | Sì                 | Sì                          |
| Dependency Injection | CDI / ArC          | Spring IoC                  |
| ORM                  | Hibernate ORM      | Spring Data JPA / Hibernate |
| Microservizi         | Sì                 | Sì                          |
| Docker               | Sì                 | Sì                          |
| Kubernetes           | Forte integrazione | Forte integrazione          |
| Native compilation   | GraalVM            | GraalVM                     |
| Ecosistema           | Quarkus Extensions | Spring Ecosystem            |

Differenza fondamentale: Quarkus punta fortemente sull'ottimizzazione per cloud-native e container, mentre Spring Boot offre un ecosistema molto ampio e consolidato, utilizzabile in numerosi contesti applicativi.

Non significa che uno sia sempre più veloce dell'altro: le prestazioni dipendono dall'applicazione, dalla configurazione e dall'ambiente di esecuzione.

## 6. Il modello di sviluppo

Un'applicazione Quarkus può essere organizzata secondo una classica architettura a livelli:

## REST Controller

Endpoint HTTP · JAX-RS

## Service Layer

Logica applicativa · CDI

## Repository / Entity

Hibernate ORM · Panache

Database

MySQL · PostgreSQL · altri database supportati

Questa organizzazione è molto simile a quella che si può realizzare con Spring Boot.

## 7. Esempio pratico: una REST API

Un semplice endpoint REST con Quarkus:

```
package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class HelloResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from Quarkus!";
    }
}
```

Analizziamo le annotazioni:

- `@Path`: definisce il percorso dell'endpoint.
- `@GET`: associa il metodo alla richiesta HTTP GET.
- `@Produces`: specifica il formato della risposta.
- `hello()`: restituisce il contenuto della risposta.

Avviando l'applicazione in modalità sviluppo, l'endpoint sarà disponibile normalmente all'indirizzo:

```
http://localhost:8080/hello
```

## 8. Strumenti di sviluppo

[Quarkus Logo & Brand Assets (SVG, PNG and vector) - Brandfetch](https://images.openai.com/static-rsc-4/uS37cafOkYXvF5kGfEgk9s-kKq_K9R676N8pz7AzHCFilbhrLsi3mjb1tWyq6X8mjAIXA5-JTDMV7eh4AtYAJHHaz-IzPOEy_kwD6QbfM5RsPm18RqPEHYm6sxoRe7uwv3iBNoxvOOhtWhbpJDRoNK2-wosqWx9bLEd9D-Zb4t0?purpose=inline)

Quarkus CLI

Creazione e gestione dei progetti.

[Maven Original Wordmark PNG Logo — Download Free Transparent Logo](https://images.openai.com/static-rsc-4/3o9RvMCnZ-hcDAAH0dEqrWmuFa_HO39e8xzxfWq3fN8A0DPzLSPfcE50huUWREdxOp64v10xFA_UsIg6NeFJ7fMU4TiDZW2oFAN62pJ2Dt6tgt2IehFVHcyp2kdzzTMJoFNiCAZmNfxmoMa3FvlavQxZn6A1F1AgNQJv1o7Bh8I?purpose=inline)

Maven / Gradle

Gestione delle dipendenze e build.

[GraalVM Logo PNG Vector (SVG) Free Download](https://images.openai.com/static-rsc-4/eS4EDcOkXLWF0arKKo6tfvi4WclV8rgdxmnZl_6lIzBkogWPmMUJNJ5amHYrxyf2p5loVlBjdP8WBQ_XHaDHsc_Dk0zYe2DSD6lMp8WdvM9TZkqc-AyYVitBb0fMUS_B0yjVCooS8CzeNAjNXQ2ziFCsaHHMc479S7vVgm_ptRo?purpose=inline)

GraalVM

Compilazione nativa delle applicazioni.

[Learn How to Develop, Deploy, and Run Your Application with Docker | by Neeraj Kushwaha | Medium](https://images.openai.com/static-rsc-4/vpeCahKUt8HLTzNJcfyZuraqvPe4DYkQcZ6H_bYFxktcjGE9IzKNCy_2wzufjFg1CV4gCPUSKqyNqOP1LsjwqsGi_Ptm9bXovNu4KVQgDh00UrSckl0PXpeQz3Fy185kJss3Wgjsqi7965WWyoiWi3LAsk2u_qRKHUOJ4rIUl0s?purpose=inline)

Docker

Creazione ed esecuzione dei container.

Quarkus può essere sviluppato con IDE come IntelliJ IDEA, Eclipse e Visual Studio Code.

## 9. Quando utilizzare Quarkus?

Quarkus è particolarmente indicato per:

- Microservizi Java.
- API REST e backend applicativi.
- Applicazioni distribuite.
- Architetture cloud-native.
- Applicazioni basate su Docker e Kubernetes.
- Sistemi serverless.
- Applicazioni che richiedono avvio rapido e contenimento delle risorse.

## 10. Quarkus e AI

Quarkus può essere utilizzato anche per sviluppare applicazioni backend che integrano funzionalità di Intelligenza Artificiale.

Attraverso estensioni e librerie dedicate è possibile:

- Integrare API di modelli linguistici (LLM).
- Realizzare chatbot.
- Sviluppare applicazioni RAG (Retrieval-Augmented Generation).
- Integrare database vettoriali.
- Realizzare servizi AI esposti tramite REST API.

Un progetto interessante è Quarkus LangChain4j, che permette di integrare modelli linguistici e funzionalità AI nelle applicazioni Java.

## 11. Riepilogo: concetti da ricordare

- Quarkus è un framework Java moderno.
- È progettato per applicazioni cloud-native.
- Supporta REST API, ORM, CDI e programmazione reattiva.
- Si integra con Docker e Kubernetes.
- Permette la compilazione nativa tramite GraalVM.
- Può essere utilizzato per sviluppare microservizi e applicazioni AI.
- È un'alternativa a Spring Boot, con caratteristiche e filosofia differenti.

## 12. Domande di verifica

Test di autovalutazione

0/4 risposte

1\. Qual è l'obiettivo principale di Quarkus?

Sviluppare esclusivamente applicazioni desktop

Ottimizzare Java per cloud-native e container

Sostituire il linguaggio Java

2\. Quale tecnologia permette la compilazione nativa?

GraalVM Native Image

JDBC

Maven

3\. A cosa serve Hibernate ORM with Panache?

Gestire la persistenza dei dati

Creare interfacce grafiche

Gestire le richieste HTTP

4\. Quale annotazione definisce un endpoint REST?

@Override

@Path

@Entity

Verifica le risposte

Risorse ufficiali per approfondire

- [Quarkus – Sito ufficiale](https://quarkus.io/?utm_source=chatgpt.com)
- [Quarkus – Guide e documentazione](https://quarkus.io/guides/?utm_source=chatgpt.com)
- [Quarkus – Generatore di progetti](https://code.quarkus.io/?utm_source=chatgpt.com)
- [Getting Started – Prima applicazione](https://quarkus.io/guides/getting-started?utm_source=chatgpt.com)

