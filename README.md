# Corso Java

Materiale didattico per imparare Java in modo progressivo: dai fondamenti della programmazione allo sviluppo di applicazioni web, al testing e alle funzionalità moderne della piattaforma.

## Da dove iniziare

Il percorso ufficiale e ordinato è disponibile nella cartella [`corso/`](./corso/).

### Learning path

1. [Fondamenti](./corso/01_fondamenti/README.md)
2. [Programmazione orientata agli oggetti](./corso/02_programmazione_oggetti/README.md)
3. [API standard e collezioni](./corso/03_api_standard/README.md)
4. [Design del software](./corso/04_design_del_software/README.md)
5. [Database e JDBC](./corso/05_database/README.md)
6. [Web e Spring](./corso/06_web/README.md)
7. [Testing e qualità](./corso/07_testing/README.md)
8. [Java moderno](./corso/08_java_moderno/README.md)
9. [Progetti](./corso/09_progetti/README.md)

Ogni modulo contiene obiettivi, ordine consigliato e collegamenti agli appunti originali, agli esempi e agli esercizi pertinenti.

## Obiettivi formativi

Al termine del percorso lo studente dovrebbe saper:

- scrivere programmi Java usando tipi, variabili, operatori, condizioni, cicli e metodi;
- modellare un dominio con classi e oggetti;
- applicare incapsulamento, composizione, ereditarietà, polimorfismo, astrazione e interfacce;
- usare collezioni, generics, `Optional`, lambda, Stream API e `java.time`;
- leggere e scrivere file e dati JSON;
- gestire errori ed eccezioni in modo appropriato;
- interagire con database relazionali tramite JDBC e JPA/Hibernate;
- comprendere HTTP e realizzare applicazioni web con Spring Boot;
- scrivere test con JUnit e Mockito;
- riconoscere e utilizzare, quando appropriato, records, pattern matching, sealed classes e virtual threads.

## Struttura del repository

| Cartella | Scopo |
|---|---|
| [`corso/`](./corso/) | Percorso didattico ufficiale, ordinato per prerequisiti e livello. |
| [`appunti/`](./appunti/) | Raccolta originale e completa degli appunti. Gli URL esistenti vengono mantenuti per compatibilità. |
| [`approfondimenti/`](./approfondimenti/) | Argomenti opzionali, avanzati, specialistici o legacy. |
| [`esempi/`](./esempi/) | Esempi di codice e mini-casi di studio. |
| [`esercizi/`](./esercizi/) | Esercizi organizzati per argomento. |
| [`esercitazioni/`](./esercitazioni/) | Laboratori e progetti pratici. |

## Appunti originali

La cartella [`appunti/`](./appunti/) non è stata eliminata né rinominata: conserva i percorsi storici utilizzati da libri, dispense e collegamenti pubblicati online.

Per seguire un itinerario progressivo è preferibile partire da [`corso/`](./corso/); gli appunti restano disponibili come materiale completo di riferimento.

## Approfondimenti

La cartella [`approfondimenti/`](./approfondimenti/) raccoglie contenuti che non sono prerequisiti del percorso base, tra cui:

- Java avanzato, reflection, networking e concorrenza;
- JSP e Servlet come tecnologie legacy;
- Selenium, TestNG, JMeter e Appium;
- Docker, Kubernetes e Jenkins;
- Swing e sviluppo GUI/mobile;
- Spring Cloud e altri argomenti specialistici.

## Versione Java

Per il percorso principale è consigliato utilizzare una versione LTS del JDK, ad esempio Java 21. Gli argomenti relativi a Java 25 e alle funzionalità preview sono raccolti negli [appunti dedicati](./appunti/java25/README.md) e devono essere studiati verificando sempre la versione effettiva del JDK e lo stato della feature.

## Metodo di studio consigliato

Per ogni modulo:

1. leggere gli obiettivi e rispettare l'ordine delle lezioni;
2. consultare l'appunto collegato;
3. eseguire e modificare gli esempi;
4. svolgere gli esercizi;
5. consolidare le conoscenze con un mini-progetto;
6. aggiungere test e documentazione al codice prodotto.

## Curriculum e competenze

- [Curriculum del corso](./curriculum_corso_java.md)
- [Competenze di base](./competenze_base.md)

## Risorse esterne

- [CorsoJavaRisorse](https://github.com/maboglia/CorsoJavaRisorse)
- [ProgrammingResources](https://github.com/maboglia/ProgrammingResources)
- [Esercitazioni](https://github.com/maboglia/esercitazioni)

## Nota sul materiale

Il repository è una raccolta ampia, costruita nel tempo. Alcuni documenti trattano lo stesso argomento da prospettive diverse o fanno riferimento a versioni precedenti della piattaforma. La separazione tra `corso/`, `appunti/` e `approfondimenti/` consente di mantenere il materiale esistente e, allo stesso tempo, offrire un percorso più chiaro e aggiornabile.
