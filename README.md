# Corso Java

Il linguaggio di programmazione Java è ampiamente utilizzato per lo sviluppo di applicazioni aziendali, applicazioni mobili Android e molto altro ancora. Ecco una guida di base per iniziare:

1. **Installazione di Java:**
   - Prima di tutto, è necessario installare il JDK (Java Development Kit) sul tuo computer. Puoi scaricarlo dal sito ufficiale di Oracle o utilizzare una distribuzione come OpenJDK.

2. **Ambiente di sviluppo (IDE):**
   - Puoi scegliere un ambiente di sviluppo integrato (IDE) per scrivere il tuo codice Java. Alcuni IDE popolari includono Eclipse, IntelliJ IDEA e NetBeans. Questi strumenti offrono funzionalità avanzate per la scrittura, il debug e il testing del codice.

3. **Hello World in Java:**
   - Comincia con il classico esempio "Hello World" per comprendere la struttura di base di un programma Java.

    ```java
    public class HelloWorld {
        public static void main(String[] args) {
            System.out.println("Hello, World!");
        }
    }
    ```

4. **Fondamenti del linguaggio:**
   - Impara i concetti fondamentali di Java, come variabili, tipi di dati, operatori, strutture di controllo (if, else, switch), cicli (for, while), e altro ancora.

5. **OOP (Programmazione Orientata agli Oggetti):**
   - Java è un linguaggio di programmazione orientato agli oggetti. Impara i concetti chiave come classi, oggetti, ereditarietà, incapsulamento e polimorfismo.

6. **Gestione delle eccezioni:**
   - Comprendi come gestire le eccezioni in Java per scrivere codice robusto e gestire situazioni impreviste.

7. **Collezioni:**
   - Studia le collezioni standard come liste, insiemi e mappe, e impara come usarle per manipolare dati in modo efficiente.

8. **File e IO:**
   - Conosci come leggere e scrivere su file, gestire lo stream di input/output e gestire le risorse esterne.

9. **Thread e Concorrenza:**
   - Comprendi i concetti di threading e come gestire la concorrenza in Java.

10. **Java API e Librerie:**
    - Esplora le ampie librerie Java standard (Java API) che forniscono funzionalità pronte per l'uso.

11. **Framework:**
    - Esplora i framework Java come Spring, Hibernate o Apache Struts, a seconda delle tue esigenze di sviluppo.

12. **Progetti Pratici:**
    - Applica ciò che hai imparato attraverso progetti pratici. Questo ti darà un'esperienza pratica e ti aiuterà a consolidare le tue conoscenze.

Ricorda che la pratica è fondamentale nella programmazione. Scrivi regolarmente codice per acquisire esperienza e migliorare le tue abilità. Ci sono anche molte risorse online, tutorial e corsi che possono aiutarti ad approfondire i tuoi studi su Java.

---

## Appunti, dispense, tutorial

* [appunti](https://github.com/maboglia/CorsoJava/tree/master/appunti)
* [dispense e altro materiale java](https://github.com/maboglia/CorsoJavaRisorse)
* [altre risorse per programmare](https://github.com/maboglia/ProgrammingResources)


* [001_Caratteristiche_Java](./appunti/001_Caratteristiche_Java.md)

### Tipi di dato, espressioni, strutture di controllo

* [I tipi](./appunti/004_tipi.md)
* [Gli operatori](./appunti/002_operatori.md)
* [Le variabili e le costanti](./appunti/003_variabili.md)
* [Le espressioni](./appunti/002_espressioni.md)
* [Le stringhe](./appunti/007_stringhe.md)
* [Gli array](./appunti/006_array.md)
* [I varargs](./appunti/019_varargs.md)
* [Le strutture di controllo](./appunti/005_cicli.md)
* [Cast: la conversione del tipo](./appunti/008_cast.md)
* [La gestione della memoria](./appunti/090_tipi_memoria.md)
* [Le Proprietà dell'ambiente](./appunti/021_Proprieta_ambiente_java.md)

### Tipi reference: classi e oggetti

* [Le classi](./appunti/010_classi.md)
* [Classi istanziabili e non](./appunti/010_1_classi_doppia_natura.md)
* [La keyword static](./appunti/013_classi_static.md)
* [I metodi](./appunti/009_metodi.md)
* [Gli oggetti](./appunti/010_2_classi_istanze.md)
* [I metodi costruttori](./appunti/010_3_classi_costruttori.md)
* [I metodi getter setter](./appunti/010_4_classi_metodi_getter_setter.md)
* [Typecasting: la conversione del tipo](./appunti/010_6_classi_typecasting.md)

### Principi OOP in Java
* [Associazione](./appunti/010_7_associazione.md)
* [Aggregazione](./appunti/010_8_aggregazione.md)
* [Composizione](./appunti/010_9_composizione.md)
* [Astrazione](./appunti/010_6_astrazione.md)
* [Incapsulamento](./appunti/010_5_incapsulamento.md)
* [Ereditarieta](./appunti/011_classi_ereditarieta.md)
* [Polimorfismo](./appunti/012_classi_polimorfismo.md)

### Advanced Class Design: classi astratte, interfacce, eccezioni

* [Classi_astratte](./appunti/014_classi_astratte.md)
* [Interfacce](./appunti/015_interfacce.md)
* [Interfacce_funzionali](./appunti/018_interfacce_funzionali.md)
* [Eccezioni](./appunti/017_eccezioni.md)
* [Annotazioni](./appunti/030_annotazioni.md)

### Java Packages

* [JavaPackages](./appunti/020_JavaPackages.md)
* [Classi_wrapper](./appunti/021_Classi_wrapper.md)

* [Il package java.lang](021_java_lang.md)
  * [java_lang_System.](021_java_lang_System.md)
  * [java_lang_Math](021_java_lang_Math.md)
  * [java_lang_Object](021_java_lang_Object.md)
  * [java.lang.Runtime](java.lang.Runtime.md)
  * [API Java Stringhe](021_API_Java_Stringhe.md)
  * [java.lang.String](java.lang.StringBuffer.md)
* [La casse Random](022_java_util_Membri_classe_Random.md)
* [API_Java_date_time](022_API_Java_date_time.md)
* [classe_File](024_classe_File.md)
* [InputStream_OutputStream](028_InputStream_OutputStream.md)
* [InputStream](025_InputStream.md)
* [OutputStream](026_OutputStream.md)
* [InputStreamReader_Output](029_InputStreamReader_OutputStreamReader.md)
* [Reader_Writer](027_Reader_Writer.md)
* [BufferedReader_BufferedWriter](030_BufferedReader_BufferedWriter.md)
* [PrintStream](032_PrintStream.md)
* [FileReader_FileWriter](031_FileReader_FileWriter.md)

### Collezioni

* [JCFLike_Map](./appunti/022_JCFLike_Map.md)
* [JCF_AlgoritmiCollections](./appunti/022_JCF_AlgoritmiCollections.md)
* [JCF_List](./appunti/022_JCF_List.md)
* [JCF_Queue](./appunti/022_JCF_Queue.md)
* [JCF_Set](./appunti/022_JCF_Set.md)
* [JCF_collezioni](./appunti/022_JCF_collezioni.md)
* [JCF_generics](./appunti/022_JCF_generics.md)

### design pattern

* [SOLID](./appunti/043_SOLID.md)
* [Design patterns](./appunti/032_design_patterns.md)
* [Singleton pattern](./appunti/033_singleton_pattern.md)
* [Decorator pattern](./appunti/034_decorator_pattern.md)
* [Factory pattern](./appunti/035_factory_pattern.md)
* [Dao pattern](./appunti/036_dao_pattern.md)
* [Mvc pattern](./appunti/044_mvc_pattern.md)


### Input/output: gestione dei file con Java

* [FileIO](./appunti/038_FileIO.md)
* [FileIO_esempi](./appunti/040_FileIO_esempi.md)
* [File_NIO_esempi](./appunti/041_File_NIO_esempi.md)
* [JSON_Java](./appunti/061_JSON_Java.md)
* [JSON_leggi_Java8](./appunti/062_JSON_leggi_Java8.md)

### Java Database: JDBC

* [Java per il Web e DataBase](./appunti/049_JavaWebeDB.md)
* [Java JDBC](./appunti/050_Java_Database.md)
* [Java Statement](./appunti/051_Java_Database.md)
* [Java ResultSet](./appunti/052_Java_Database.md)
* [Connection Pooling](./appunti/048_JDBC_ConnectionPooling.md)


## Java Web: JSP e Servlet

* [JSP Fondamenti](./appunti/053_JSP_Fondamenti.md)
* [JSP Azioni](./appunti/054_JSP_Azioni.md)
* [JSP Dichiarazioni](./appunti/055_JSP_Dichiarazioni.md)
* [JSP Direttive](./appunti/056_JSP_Direttive.md)
* [JSP 1](./appunti/058_JSP_1.md)
* [JSP 2](./appunti/059_JSP_2.md)
* [Java Servlet](./appunti/060_RequestDispatcher.md)
* [Servlet LeggiFile](./appunti/058_Servlet_LeggiFile.md)
* [JSP appunti](./appunti/jsp_appunti.md)
* [JSP appunti](./appunti/057_JSP_appunti.md)


## Framework Java: Spring 
* [Spring framework](./appunti/069_spring_framework.md)
* [Spring core_boot](./appunti/070_spring_core_boot.md)
* [Spring mvc](./appunti/071_spring_mvc.md)
* [Spring cloud](./appunti/072_spring_cloud.md)
* [Spring test_cache](./appunti/073_spring_test_cache.md)
* [Spring snippets](./appunti/074_spring_snippets.md)
* [Spring ddl-auto](./appunti/075_spring-data-ddl-auto.md)
* [Spring application_properties](./appunti/076_spring_application_properties.md)
* [Spring JPA_Hibernate](./appunti/077_Spring_JPA_Hibernate.md)
* [Thymeleaf](./appunti/079_thymeleaf.md)
* [Spring thymeleaf](./appunti/100_spring_thymeleaf.md)
* [Thymeleaf Expressions in SpringBoot](./appunti/078_ThymeleafExpressionsinSpringBoot.md)

### approfondimenti

* [Espressioni Regolari - Regexp](./appunti/039_regexp.md)
* [Moduli](./appunti/042_moduli.md)
* [Algoritmi_sort](./appunti/096_algoritmi_sort.md)
* [Eclipse](./appunti/101_eclipse.md)
* [Ricorsione](./appunti/097_ricorsione.md)
* [Locale](./appunti/023_locale.md)
* [Serializzazione](./appunti/031_Serializzazione.md)
* [Programma Java](./appunti/000_programma_Java.md)
* [Programma OCA](./appunti/000_programma_UF.md)
* [Programma OCP](./appunti/000_programma_UF_OCP.md)

## sito web

Sul mio sito trovi tutti gli appunti anche in formato slide

[bogliaccino.it](http://www.mauro.bogliaccino.it/public/java)


---

## esempi codice Java

* [variabili e costanti](https://github.com/maboglia/CorsoJava/blob/master/esempi/00_variabili_costanti.md)
* [operatori e tipi](https://github.com/maboglia/CorsoJava/blob/master/esempi/01_Operatori_Tipi.md)
* [tipi primitivi](https://github.com/maboglia/CorsoJava/blob/master/esempi/02_tipi_primitivi.md)
* [control flow: condizioni e cicli](https://github.com/maboglia/CorsoJava/blob/master/esempi/03_Condizioni_Cicli.md)
* [stringhe](https://github.com/maboglia/CorsoJava/blob/master/esempi/04_Stringhe.md)
* [array](https://github.com/maboglia/CorsoJava/blob/master/esempi/05_Array.md)
* [metodi ausiliari](https://github.com/maboglia/CorsoJava/blob/master/esempi/06_MetodiAusiliari.md)
* [classi](https://github.com/maboglia/CorsoJava/blob/master/esempi/07_Classi.md)
* [Eccezioni](https://github.com/maboglia/CorsoJava/blob/master/esempi/10_eccezioni.md)
* [typecasting](https://github.com/maboglia/CorsoJava/blob/master/esempi/09_typecasting.md)

---

## esercizi

* [esercitazioni, progetti](https://github.com/maboglia/CorsoJava/tree/master/esercizi)
* [Esercizi Controlflow](https://github.com/maboglia/CorsoJava/blob/master/esercizi/00_esercizi_controlflow.md)
* [Esercizi MetodiAusiliari](https://github.com/maboglia/CorsoJava/blob/master/esercizi/01_EserciziMetodiAusiliari.md)
* [Esercizi stringhe](https://github.com/maboglia/CorsoJava/blob/master/esercizi/02_esercizi_stringhe.md)
* [Esercizi array](https://github.com/maboglia/CorsoJava/blob/master/esercizi/03_Esercizi_array.md)
* [Esercizi file](https://github.com/maboglia/CorsoJava/blob/master/esercizi/04_esercizi_file.md)
* [Esercizi avanzati](https://github.com/maboglia/CorsoJava/blob/master/esercizi/05_Esercizi_avanzati.md)
* [Esercizi OOP](https://github.com/maboglia/CorsoJava/blob/master/esercizi/06_EserciziOOP.md)
* [Esercizi eccezioni](https://github.com/maboglia/CorsoJava/blob/master/esercizi/07_es_eccezioni.md)

---

## Esercitazioni

- [Repo esercitazioni](https://github.com/maboglia/esercitazioni)
- [Altre Risorse Java](https://github.com/maboglia/CorsoJavaRisorse)
