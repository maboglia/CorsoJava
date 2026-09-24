# Corso Java — percorso didattico aggiornato

Questo repository raccoglie un vasto insieme di appunti, esempi e esercizi per imparare Java in modo progressivo, da fondamenti a architetture web e framework moderni.

## Obiettivo del corso

Costruire una base solida in Java con attenzione a:
- sintassi e logica di programmazione;
- programmazione orientata agli oggetti;
- collezioni e API standard;
- gestione di file, JSON e database;
- applicazioni web con Servlet/JSP e Spring;
- testing e automazione;
- Java moderno (streams, lambda, records, concurrency, Java 21/25).

## Learning path consigliato

### 1. Fondamenti di programmazione
- `appunti/001_Caratteristiche_Java.md`
- `appunti/002_operatori.md`
- `appunti/002_espressioni.md`
- `appunti/003_variabili.md`
- `appunti/004_tipi.md`
- `appunti/005_cicli.md`
- `appunti/006_array.md`
- `appunti/007_stringhe.md`
- `appunti/008_cast.md`
- `appunti/009_metodi.md`

Obiettivo: imparare la sintassi, il controllo del flusso e il pensiero imperativo.

### 2. Programmazione orientata agli oggetti
- `appunti/010_0_classi.md`
- `appunti/010_2_classi_istanze.md`
- `appunti/010_3_classi_costruttori.md`
- `appunti/010_4_classi_metodi_getter_setter.md`
- `appunti/010_5_incapsulamento.md`
- `appunti/010_6_astrazione.md`
- `appunti/011_classi_ereditarieta.md`
- `appunti/012_classi_polimorfismo.md`
- `appunti/013_classi_static.md`
- `appunti/014_classi_astratte.md`
- `appunti/015_interfacce.md`
- `appunti/016_enum.md`

Obiettivo: modellare dati e comportamenti con classi, ereditarietà, incapsulamento e polimorfismo.

### 3. API Java standard e collezioni
- `appunti/021_java_lang.md`
- `appunti/021_java_lang_Object.md`
- `appunti/021_java_lang_System.md`
- `appunti/021_java_lang_Math.md`
- `appunti/021_API_Java_Stringhe.md`
- `appunti/022_JCFLike_Map.md`
- `appunti/022_java_util_Dizionari_e_mappe.md`
- `appunti/023_java.time.md`
- `appunti/024_classe_File.md`
- `appunti/140_Optional.md`
- `appunti/150_StreamApi.md`
- `appunti/154_collectors.md`

Obiettivo: imparare le classi standard, le collezioni, i tipi di data e il trattamento funzionale dei dati.

### 4. Eccezioni, design e architettura
- `appunti/017_eccezioni.md`
- `appunti/032_design_patterns.md`
- `appunti/043_SOLID.md`
- `appunti/033_singleton_pattern.md`
- `appunti/034_decorator_pattern.md`
- `appunti/035_factory_pattern.md`
- `appunti/036_dao_pattern.md`
- `appunti/044_mvc_pattern.md`

Obiettivo: costruire codice robusto, leggibile e organizzato.

### 5. File, JSON e database
- `appunti/038_FileIO.md`
- `appunti/040_FileIO_esempi.md`
- `appunti/041_File_NIO_esempi.md`
- `appunti/061_JSON_Java.md`
- `appunti/062_JSON_leggi_Java8.md`
- `appunti/050_Java_Database.md`
- `appunti/051_Java_Database.md`
- `appunti/052_Java_Database.md`
- `appunti/048_JDBC_ConnectionPooling.md`

Obiettivo: integrare Java con fonti dati esterne e persistenza.

### 6. Web Java (tradizionale e moderno)
- `appunti/053_JSP_Fondamenti.md`
- `appunti/054_JSP_Azioni.md`
- `appunti/060_RequestDispatcher.md`
- `appunti/063_JavaWeb-servlet.md`
- `appunti/069_spring_framework.md`
- `appunti/070_spring_core_boot.md`
- `appunti/071_spring_mvc.md`
- `appunti/077_Spring_JPA_Hibernate.md`
- `appunti/079_thymeleaf.md`

Obiettivo: capire la programmazione web Java, da Servlet/JSP a Spring Boot e MVC.

### 7. Test, qualità e automazione
- `appunti/080_testing.md`
- `appunti/081_testing_in_java.md`
- `appunti/082_junit.md`
- `appunti/083_mockito.md`
- `appunti/085_selenium.md`
- `appunti/093_test_unitari.md`
- `appunti/094_BDD.md`
- `appunti/095_TDD.md`
- `appunti/097_CICD.md`

Obiettivo: garantire qualità, testabilità e automazione di processo.

### 8. Java moderno e avanzato
- `appunti/130_Lambda_Functional.md`
- `appunti/150_StreamApi.md`
- `appunti/230_Records.md`
- `appunti/240_pattern_matching.md`
- `appunti/250_SealedClasses.md`
- `appunti/260_VirtualThreads.md`
- `appunti/java25/README.md`
- `appunti/300_SequencedCollections.md`

Obiettivo: aggiornare la formazione alle evoluzioni moderne del linguaggio.

## Struttura del repository

- `appunti/`: materiale teorico, per argomento e livello.
- `esempi/`: esempi pratici e mini-casi di studio.
- `esercizi/`: esercitazioni da svolgere in ordine.
- `esercitazioni/`: progetti e laboratori.

## Punti di forza

- Ampia copertura dei fondamenti di Java.
- Materiale molto dettagliato su OOP, JDBC, Spring e testing.
- Presenza di contenuti moderni su Java 21/25 e nuove feature.
- Ampia varietà di esempi ed esercitazioni.

## Percorso consigliato per uno studente junior

1. Fondamenti: tipi, variabili, costrutti, array, stringhe, metodi.
2. OOP: classi, oggetti, ereditarietà, polimorfismo, incapsulamento.
3. API standard: collections, Optional, streams, java.time, file.
4. Eccezioni e design: error handling, SOLID, pattern.
5. Database: JDBC, DAO, SQL basic.
6. Web Java: servlet/jsp basics, poi Spring Boot MVC.
7. Testing: JUnit, Mockito, TDD/BDD.
8. Java moderno: records, patterns, virtual threads, Java 21/25.

## Suggerimento di revisione

Per rendere il repo più professionale, dovrebbe essere organizzato in due livelli:
- Corso base (obbligatorio): fondamenti + OOP + Java standard + JDBC + web + testing.
- Approfondimenti (opzionali): Java moderno, Docker/Kubernetes, Selenium, Appium, JMeter, architetture avanzate.

## Collegamenti utili

- [Appunti](./appunti)
- [Esempi](./esempi)
- [Esercizi](./esercizi)
- [Esercitazioni](./esercitazioni)
- [Curriculum del corso](./curriculum_corso_java.md)


