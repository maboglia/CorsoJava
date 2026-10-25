# Scheda didattica — Java e Intelligenza Artificiale

Informatica · Java Backend · AI generativa e Machine Learning

Obiettivo didattico: comprendere come integrare funzionalità di intelligenza artificiale nelle applicazioni Java, conoscere le principali librerie e API e progettare un semplice backend capace di comunicare con un modello AI.

## 1. Perché utilizzare Java per l'AI?

Java è una scelta interessante per integrare l'intelligenza artificiale nelle applicazioni aziendali, soprattutto quando occorre collegare modelli AI a sistemi già esistenti.

- Stabilità: piattaforma consolidata per applicazioni enterprise.
- Integrazione: API, database, servizi cloud e sistemi aziendali.
- Concorrenza: strumenti per gestire richieste simultanee.
- Ecosistema: librerie per machine learning, elaborazione dati e AI generativa.
- Distribuzione: possibilità di realizzare servizi backend, container e microservizi.

Un punto importante: Java non è necessariamente il linguaggio con cui si addestra ogni modello. Spesso il suo ruolo è quello di integrare e rendere utilizzabili i modelli AI all'interno di applicazioni reali.

## 2. I principali ambiti di applicazione

[Smart Ai chat bot communicate with human](https://images.openai.com/static-rsc-4/wlVBF_PHtx4aTEVZxCnHTwvb_iPgQVHnHjSDta9RKL8Y7CqaEWgQa-rJVfm4rEDXbIkahGr0sjl_YRfHu8SYXEeBeZq8xyE7hiT5-CS2VZlPAaZhYTGc47Gmc6K3nuJbh3RCZ75DOaVDdhw_kMwFaJlV9jOfgxZQj44RjjBCg-WpiUx9tI-CPGZ9XkusP_1U?purpose=inline)

AI generativa e chatbot

Java può inviare richieste a modelli linguistici tramite API cloud oppure collegarsi a modelli eseguiti localmente.

Esempi: assistenti virtuali, generazione di testi, supporto agli operatori e sintesi di documenti.

[3D blue document and magnifying glass with robot. Artificial intelligence, automation, machine learning, search, virtual assistant, information processing concept](https://images.openai.com/static-rsc-4/e88XkWXsTUjIbISQsgY124xusI1Y4LFmXskjo9kXsDXFk5RyRwAZbevPo5ggjE3X20_nk4-_5gBJqXrX6P8riLIHagCAJmKsaW75v3Pdv1ehQuUWtIII5cDhkazBuGK98VGdiJDJTnJyroGRGwXWz39LMW3F5i3zeApIv41SABW9Wg69w1FNEl-nqtHZ5e2m?purpose=inline)

Analisi dei documenti

Un'applicazione Java può estrarre testo, classificare documenti, riassumere contenuti e recuperare informazioni.

Esempi: analisi di contratti, gestione di manuali tecnici e ricerca nella documentazione aziendale.

[Nalanet Solution - Software & AI Solutions](https://images.openai.com/static-rsc-4/WsQ_fXmzfR0EoikcRGofDTh5g17KbR_xj39OPLCenm3kDeA7oXfCBNh4cldIRGXMGf9hPSrPvfDHlz4dfXnPs4M9-0xkD3OtvLVjTgqH3bY0OxCIelRFqPojwreDLo2xtM0mzXSJPf7WWUxVqq4pP47TgLda6joruErqvmK8k98?purpose=inline)

Machine Learning e previsione

Le librerie Java possono supportare classificazione, regressione, clustering e inferenza con modelli già addestrati.

Esempi: previsione della domanda, rilevamento di anomalie e analisi dei dati.

[Nintex unveils agentic AI features to boost business automation](https://images.openai.com/static-rsc-4/kJpfQbUH08gM6y1oHPc0Pae_kXQxgamDVhvSz1-kzRazxbwm6dVKNi4BlcYRQFY4a-JAaBw07ZkvbX8p7I607aJf4enX9y1Egp9xhqwZ74MfD9mk82WEcjv-q8yfpjFH4oo-mOHmuFdl_tn_-TqJyrwcYSVkip7BQJjbOmJtSzM?purpose=inline)

Automazione intelligente

L'AI può essere inserita nei processi di un backend per classificare richieste, estrarre dati e assistere gli operatori.

Esempi: smistamento automatico delle email, classificazione dei ticket e generazione di report.

## 3. Le strade per integrare l'AI con Java

| Approccio                 | Come funziona                                                                           | Quando usarlo                                                                           |
| ------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| API di AI generativa      | Java comunica con un servizio remoto via HTTP.                                          | Chatbot, sintesi, generazione di contenuti.                                             |
| Framework di integrazione | Librerie come Spring AI o LangChain4j semplificano l'accesso ai modelli.                | Applicazioni AI integrate con Spring Boot e servizi aziendali.                          |
| Librerie ML Java          | Strumenti come Tribuo, Smile o DJL consentono attività di machine learning e inferenza. | Modelli predittivi e analisi dei dati.                                                  |
| Modelli locali            | Java richiama un runtime locale o un server che ospita il modello.                      | Maggiore controllo sui dati, ambienti isolati o requisiti specifici di privacy.         |
| Modelli ONNX              | Un runtime compatibile esegue modelli esportati nel formato ONNX.                       | Inferenza con modelli supportati, senza dipendere necessariamente da un servizio cloud. |

Non esiste un unico approccio migliore: la scelta dipende dal tipo di modello, dai costi, dai requisiti di sicurezza e dalle prestazioni attese.

## 4. Esempio pratico: chiamare un'API AI da Java

Il seguente esempio mostra il principio fondamentale: un programma Java invia una richiesta HTTP a un servizio di AI generativa e riceve una risposta.

Per semplicità viene utilizzato `HttpClient`, disponibile dalla versione Java 11. L'esempio usa l'API Chat Completions di OpenAI; per nuovi progetti è opportuno valutare anche la Responses API e verificare la documentazione aggiornata.

```
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class AiClient {

    public static void main(String[] args) throws Exception {

        // Legge la chiave API da una variabile d'ambiente.
        String apiKey = System.getenv("OPENAI_API_KEY");

        if (apiKey == null || apiKey.isBlank()) {
            throw new IllegalStateException(
                "Configura la variabile OPENAI_API_KEY"
            );
        }

        // Crea il client HTTP.
        HttpClient client = HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(10))
                .build();

        // Prepara il corpo JSON della richiesta.
        // In un progetto reale, utilizzare una libreria JSON
        // per costruire il payload in modo sicuro.
        String json = """
            {
              "model": "gpt-4.1-mini",
              "messages": [
                {
                  "role": "user",
                  "content": "Spiega in due frasi che cos'è Java."
                }
              ]
            }
            """;

        // Costruisce la richiesta HTTP POST.
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(
                    "https://api.openai.com/v1/chat/completions"))
                .header("Authorization", "Bearer " + apiKey)
                .header("Content-Type", "application/json")
                .timeout(Duration.ofSeconds(60))
                .POST(HttpRequest.BodyPublishers.ofString(json))
                .build();

        // Invia la richiesta e riceve la risposta.
        HttpResponse<String> response = client.send(
                request,
                HttpResponse.BodyHandlers.ofString()
        );

        // Controlla il codice HTTP.
        if (response.statusCode() >= 200
                && response.statusCode() < 300) {
            System.out.println(response.body());
        } else {
            System.err.println(
                "Errore HTTP: " + response.statusCode()
            );
            System.err.println(response.body());
        }
    }
}
```

### Che cosa succede?

1. Java legge la chiave API dall'ambiente.
2. Costruisce un messaggio in formato JSON.
3. Invia una richiesta HTTP autenticata.
4. Riceve una risposta dal servizio AI.
5. Verifica l'esito e stampa il contenuto restituito.

Il codice stampa il JSON completo, non soltanto il testo generato. In un'applicazione reale, occorre deserializzare la risposta in un oggetto Java e gestire timeout, errori, limiti di utilizzo e dati sensibili. Il nome del modello va verificato rispetto ai modelli disponibili per il proprio account.

## 5. Architettura di un'applicazione Java con AI

Client Web o Mobile

Invia una richiesta all'applicazione

Backend Java / Spring Boot

Autenticazione · Regole di business · Validazione

Servizio AI

API cloud o modello locale

Database

Dati e documenti

Risposta elaborata

Il backend controlla e restituisce il risultato al client

Per applicazioni più evolute, il backend può utilizzare un sistema RAG (Retrieval-Augmented Generation): recupera informazioni pertinenti dai documenti o dal database e le fornisce al modello come contesto per generare risposte più aderenti alle fonti disponibili.

## 6. Librerie e strumenti da conoscere

[Building AI-Powered Java Applications with Spring AI | by Ezgi İşçioğlu | Mar, 2026 | Medium](https://images.openai.com/static-rsc-4/a3j6Y-be-GaVS2lLYhBsX0WKmGBpy2zJ9qVwUkA7uaPeiQlB4GkUu25dbfsFtQqEoqw1aNQ0X5cxV8Q-EaRchm-HWBPJuVxepON16KQUP5WNlUv_lZ9ru3MfpQ8B9ufn6aEWzcVHe1KorCrkjMDkHpeuUGg-mRwAceifJZFdhL8?purpose=inline)

Spring AI

Integrazione di modelli AI nelle applicazioni Spring: chat client, embedding, strumenti, output strutturati e funzionalità per RAG, a seconda del provider e della versione.

[Você já conhece o LangChain4j? Java + IA 🔥 - Comunidade Decoder](https://images.openai.com/static-rsc-4/bvzJey2id0fYc2rfqn2k6IS9w-MmtYTzUc_Q8XMKXkQ-p3fvjruBDGL9rQqwE6dHK2euJakl7Fogv-8rn4QYAV68r8QFpUQ1u4nrctf3Z1XSgJY4gH7msPRIL9Y11dhotFybmT6d9G4w-_GBqPKst_gsGvllU2lcsZc0TTVWleE?purpose=inline)

LangChain4j

Libreria Java per integrare modelli linguistici, servizi di embedding, strumenti e architetture di retrieval.

Deep Java Library (DJL)

Framework Java per il deep learning e l'inferenza con motori e modelli supportati.

[ONNX Runtime : High-performance deep learning inference.](https://images.openai.com/static-rsc-4/AW6q2hMtnbqYmHVsIgUHBKRwv-0lx5WRDqky35QTCW-Oa345fEoF768X42rn-YhcfJxDtFHgZBTgqda9i-l0tWzUp4YuYPgz3JF3gzdQvqwMLvLEPTRhFfaMVXfAE09nHi3ypL7KY7aVelYVfrYApBeO9MrIHHdb8BgbEMaHv5M?purpose=inline)

ONNX Runtime

Runtime per eseguire inferenza su modelli compatibili esportati in formato ONNX, con supporto a diversi linguaggi e ambienti.

Per iniziare, è sufficiente scegliere Spring Boot e un'API AI. Dopo aver acquisito familiarità con richieste, risposte, gestione degli errori e sicurezza, si possono introdurre framework specializzati.

## 7. Vantaggi, limiti e attenzioni

### Vantaggi

- Integrazione con sistemi esistenti.
- Ecosistema maturo.
- Applicazioni enterprise scalabili.
- Possibilità di combinare servizi cloud e modelli locali.

### Limiti e rischi

- Costi e limiti delle API.
- Latenza e dipendenza dalla rete.
- Protezione dei dati e delle chiavi.
- Risposte errate o non verificabili.
- Necessità di monitoraggio e valutazione.

Regola fondamentale: l'output di un modello AI non deve essere considerato automaticamente corretto. Le applicazioni professionali devono prevedere validazioni, controlli di accesso, gestione degli errori e verifica dei risultati, soprattutto quando l'AI influenza decisioni importanti.

## 8. Attività di laboratorio

Realizza una piccola applicazione Spring Boot chiamata Java AI Assistant.

Requisiti minimi:

1. Creare un endpoint `POST /api/assistant`.
2. Ricevere una domanda attraverso un DTO Java.
3. Validare la richiesta e applicare limiti alla lunghezza del testo.
4. Chiamare un servizio AI attraverso un client dedicato.
5. Restituire una risposta JSON al client.
6. Gestire gli errori senza esporre chiavi API o dettagli interni.
7. Scrivere test unitari per il servizio, simulando la risposta AI con Mockito.

Estensioni possibili:

- Aggiungere una conversazione con storico.
- Analizzare un documento caricato dall'utente.
- Implementare un sistema RAG su documenti di corso.
- Confrontare un'API cloud con un modello locale.
- Registrare tempi di risposta, errori e consumo delle risorse.

## 9. Quiz di verifica

1\. Qual è un utilizzo comune di Java nell'AI generativa?

Integrare modelli attraverso API e servizi

Sostituire necessariamente Python nell'addestramento

Eliminare la necessità di database

Garantire risposte sempre corrette

2\. Che cosa significa RAG?

Un tipo di compilatore Java

Un approccio che recupera informazioni da usare come contesto per il modello

Un database relazionale

Un sistema di build

3\. A che cosa serve un embedding?

A rappresentare contenuti come vettori numerici

A cifrare automaticamente una password

A compilare un programma

A sostituire ogni database

4\. Perché una chiave API non dovrebbe essere scritta direttamente nel codice?

Perché Java non supporta stringhe

Perché potrebbe essere esposta nel repository o nei log

Perché impedisce la compilazione

Perché rende il modello più lento

5\. Che cosa offre Spring AI?

Strumenti per integrare modelli AI nelle applicazioni Spring

Un sostituto della JVM

Un database NoSQL obbligatorio

Un sistema operativo

6\. Perché è necessario verificare le risposte generate dall'AI?

Perché possono contenere errori o informazioni inventate

Perché ogni risposta è sempre falsa

Perché le API non restituiscono testo

Perché Java non può elaborare JSON

Correggi le risposte

## 10. Riflessione finale

- Quali vantaggi offre Java quando si vuole integrare l'AI in un sistema aziendale esistente?
- Quando è preferibile chiamare un modello tramite API e quando valutare un modello locale?
- Quali controlli sono necessari prima di utilizzare una risposta AI in un processo automatizzato?
- Qual è la differenza tra un chatbot semplice e un'applicazione RAG?

Messaggio chiave: Java e AI non sono mondi separati. Java può fornire la struttura applicativa, la sicurezza, l'accesso ai dati e l'integrazione con i sistemi aziendali, mentre i modelli AI aggiungono capacità di analisi, generazione e supporto alle decisioni. La competenza più importante è saperli combinare in modo affidabile, sicuro e misurabile.
