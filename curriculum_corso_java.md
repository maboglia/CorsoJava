# Curriculum del corso Java

## Obiettivo formativo

Il corso ha l'obiettivo di far acquisire allo studente le competenze fondamentali per sviluppare applicazioni Java in modo corretto, testabile e sostenibile, partendo dai concetti di base e arrivando alle architetture web e alle tecnologie moderne del linguaggio.

## Prerequisiti

- conoscenza base di logica e algoritmi;
- capacità di usare un editor o IDE;
- nozione di file system e terminale;
- interesse allo sviluppo software.

## Risultati attesi

Al termine del percorso lo studente sarà in grado di:
- scrivere programmi Java con sintassi corretta;
- usare tipi, variabili, condizioni, cicli e metodi;
- modellare dati con classi e oggetti;
- applicare concetti OOP: incapsulamento, ereditarietà, polimorfismo, astrazione;
- usare collezioni, Optional, streams, java.time e file I/O;
- gestire errori con eccezioni;
- leggere/scrivere dati da database con JDBC;
- costruire applicazioni web con Servlet/JSP e Spring MVC;
- scrivere test unitari e usare JUnit/Mockito;
- comprendere Java moderno: records, lambdas, pattern matching, virtual threads.

## Struttura del corso

### Modulo 1 — Fondamenti di Java
Durata: 2-3 settimane

Argomenti:
- sintassi e struttura di un programma Java;
- variabili, costanti e tipi primitivi;
- operatori, espressioni e cast;
- condizioni, cicli, array, stringhe;
- metodi, passaggio parametri e scope.

Materiale:
- `appunti/001_Caratteristiche_Java.md`
- `appunti/002_operatori.md`
- `appunti/003_variabili.md`
- `appunti/004_tipi.md`
- `appunti/005_cicli.md`
- `appunti/006_array.md`
- `appunti/007_stringhe.md`
- `appunti/009_metodi.md`

### Modulo 2 — Programmazione orientata agli oggetti
Durata: 2-3 settimane

Argomenti:
- classi e oggetti;
- costruttori e getter/setter;
- incapsulamento, astrazione;
- ereditarietà e polimorfismo;
- classi astratte e interfacce;
- enumerazioni.

Materiale:
- `appunti/010_0_classi.md`
- `appunti/010_2_classi_istanze.md`
- `appunti/010_3_classi_costruttori.md`
- `appunti/010_5_incapsulamento.md`
- `appunti/011_classi_ereditarieta.md`
- `appunti/012_classi_polimorfismo.md`
- `appunti/014_classi_astratte.md`
- `appunti/015_interfacce.md`
- `appunti/016_enum.md`

### Modulo 3 — API Java standard
Durata: 2 settimane

Argomenti:
- Object, System, Math;
- classi wrapper;
- collezioni e generics;
- Optional;
- streams e collectors;
- java.time;
- file I/O.

Materiale:
- `appunti/021_java_lang.md`
- `appunti/021_java_lang_Object.md`
- `appunti/021_java_lang_System.md`
- `appunti/021_java_lang_Math.md`
- `appunti/022_JCFLike_Map.md`
- `appunti/023_java.time.md`
- `appunti/024_classe_File.md`
- `appunti/140_Optional.md`
- `appunti/150_StreamApi.md`
- `appunti/154_collectors.md`

### Modulo 4 — Eccezioni, design e architettura
Durata: 2 settimane

Argomenti:
- handling delle eccezioni;
- SOLID;
- design patterns;
- DAO e MVC;
- organizzazione del codice.

Materiale:
- `appunti/017_eccezioni.md`
- `appunti/032_design_patterns.md`
- `appunti/043_SOLID.md`
- `appunti/035_factory_pattern.md`
- `appunti/036_dao_pattern.md`
- `appunti/044_mvc_pattern.md`

### Modulo 5 — File, JSON e database
Durata: 2 settimane

Argomenti:
- File I/O e NIO;
- JSON in Java;
- JDBC;
- Statement, ResultSet;
- connessioni e pooling.

Materiale:
- `appunti/038_FileIO.md`
- `appunti/041_File_NIO_esempi.md`
- `appunti/061_JSON_Java.md`
- `appunti/050_Java_Database.md`
- `appunti/051_Java_Database.md`
- `appunti/052_Java_Database.md`
- `appunti/048_JDBC_ConnectionPooling.md`

### Modulo 6 — Java Web
Durata: 2-3 settimane

Argomenti:
- concetti base di web;
- JSP e Servlet;
- request/response e sessioni;
- Spring Framework;
- Spring MVC;
- Spring Boot;
- JPA/Hibernate;
- Thymeleaf.

Materiale:
- `appunti/053_JSP_Fondamenti.md`
- `appunti/060_RequestDispatcher.md`
- `appunti/063_JavaWeb-servlet.md`
- `appunti/069_spring_framework.md`
- `appunti/070_spring_core_boot.md`
- `appunti/071_spring_mvc.md`
- `appunti/077_Spring_JPA_Hibernate.md`
- `appunti/079_thymeleaf.md`

### Modulo 7 — Testing e qualità
Durata: 1-2 settimane

Argomenti:
- test unitari;
- JUnit;
- Mockito;
- TDD e BDD;
- test end-to-end;
- CI/CD.

Materiale:
- `appunti/082_junit.md`
- `appunti/083_mockito.md`
- `appunti/093_test_unitari.md`
- `appunti/094_BDD.md`
- `appunti/095_TDD.md`
- `appunti/097_CICD.md`

### Modulo 8 — Java moderno e professionale
Durata: 1-2 settimane

Argomenti:
- lambda e functional interfaces;
- streams professionali;
- records;
- pattern matching;
- sealed classes;
- virtual threads;
- Java 21/25.

Materiale:
- `appunti/130_Lambda_Functional.md`
- `appunti/230_Records.md`
- `appunti/240_pattern_matching.md`
- `appunti/250_SealedClasses.md`
- `appunti/260_VirtualThreads.md`
- `appunti/java25/README.md`

## Percorso consigliato

Sequenza ottimale:
1. fondamenti;
2. OOP;
3. API standard;
4. eccezioni/design;
5. database;
6. web; 
7. testing;
8. Java moderno.

## Valutazione

La valutazione può essere composta da:
- esercizi pratici;
- mini-progetti;
- analisi di codice;
- implementazione di un'applicazione web completa;
- test di qualità e refactoring.

## Nota metodologica

Il repository è ricco e utile, ma richiede una selezione didattica. Il corso dovrebbe privilegiare un percorso lineare e progressivo, lasciando argomenti più avanzati o altamente specializzati come approfondimenti opzionali.

## File chiave del repository

- [README.md](./README.md)
- [appunti](./appunti)
- [esempi](./esempi)
- [esercizi](./esercizi)
- [esercitazioni](./esercitazioni)

---

Questo curriculum è pensato per costruire un percorso didattico coerente e moderno, evitando la frammentazione del materiale presente nel repository.
