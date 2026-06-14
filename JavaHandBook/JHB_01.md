# Capitolo 1: Fondamenti di Java

## 1. 🚀 Introduzione e Caratteristiche del Linguaggio

Java non è solo un linguaggio di programmazione, ma un ecosistema ingegneristico maturo, evolutosi dal 1995 per dominare lo sviluppo enterprise, i microservizi e il cloud computing.

Sintesi delle Caratteristiche Chiave

L'architettura di Java si fonda su otto pilastri che ne garantiscono la resilienza e la modernità:

* Orientato agli oggetti (OOP): Implementa rigorosamente incapsulamento, ereditarietà, polimorfismo e astrazione. L'introduzione di Record, Pattern Matching e Sealed Classes permette oggi una modellazione del dominio più sicura e concisa.
* Gestione automatica della memoria: Grazie al Garbage Collector (GC), Java gestisce l'allocazione e la deallocazione degli oggetti, sollevando lo sviluppatore da compiti manuali rischiosi.
* Portabilità e compatibilità: Il mantra "Write Once, Run Anywhere" è garantito dalla JVM. La retrocompatibilità rimane un punto di forza unico per la stabilità industriale.
* Sicurezza e robustezza: Basato su un controllo rigoroso dei tipi, gestione delle eccezioni e verifica del bytecode per prevenire accessi non autorizzati alla memoria.
* Concorrenza e Parallelismo: Evolutosi dai thread classici ai moderni Virtual Threads, che permettono di gestire milioni di unità di esecuzione con un overhead di sistema trascurabile.
* Programmazione Funzionale: Integrazione fluida di Lambda Expressions e Stream API per elaborazioni dati dichiarative ed espressive.
* Ecosistema Enterprise: Supporto totale tramite framework standard come Spring Boot e Jakarta EE per applicazioni scalabili.
* Cloud e Microservizi: Ottimizzato per containerizzazione (Docker) e orchestrazione (Kubernetes), con focus su osservabilità e scalabilità orizzontale.

La Filosofia Java

Il principio "Write Once, Run Anywhere" (WORA) definisce l'essenza di Java. Il codice sorgente viene compilato in un formato intermedio universale denominato bytecode. Questo non viene eseguito direttamente dall'hardware, ma dalla Java Virtual Machine (JVM). Questo strato di astrazione permette lo sviluppo su una piattaforma e l'esecuzione su qualsiasi architettura (Windows, Linux, macOS, sistemi embedded) dotata di una JVM compatibile.

## 2. 📅 Evoluzione e Versioni LTS

Java segue un ciclo di rilascio semestrale, ma per gli ambienti di produzione si prediligono le versioni LTS (Long-Term Support), che garantiscono supporto e stabilità prolungati.

Tabella Versioni LTS

Versione	Rilascio
Java SE 8	Marzo 2014
Java SE 11	Settembre 2018
Java SE 17	Settembre 2021
Java SE 21	Settembre 2023
Java SE 25	Settembre 2025 (Previsto)

Innovazioni Recenti (Java 17 - 21)

Il linguaggio ha accelerato la sua modernizzazione includendo:

* Pattern Matching: Per semplificare i controlli di tipo e l'estrazione dei dati.
* Sequenced Collections: Interfacce uniformi per collezioni con ordine di incontro definito.
* String Templates (Preview): Interpolazione sicura e leggibile di variabili nelle stringhe.
* Record Patterns: De-strutturazione immediata dei dati per un codice più pulito.
* Virtual Threads (Project Loom): Rivoluzione nel modello di concorrenza per applicazioni ad alto throughput.

## 3. 📦 Variabili, Costanti e Scope

Definizioni Core

* Variabile: Un'area di memoria allocata, identificata da un nome, destinata a contenere dati di un tipo specifico.
* Dichiarazione: L'atto di definire il tipo e l'identificatore (nome) della variabile.
* Inizializzazione: L'assegnazione del primo valore alla variabile, obbligatoria prima di qualsiasi utilizzo.
* Assegnazione: L'operazione tramite l'operatore = che memorizza un valore o il risultato di un'espressione nella variabile.

Costanti

L'utilizzo della parola chiave final blocca la ri-assegnazione di una variabile, rendendola di fatto una costante. A livello architettonico, final ha implicazioni profonde:

* Variabili: Il valore non può essere cambiato dopo l'inizializzazione.
* Metodi: Impedisce l'overriding (ridefinizione) nelle sottoclassi.
* Classi: Impedisce l'estensione (ereditarietà), rendendo la classe "foglia".

Ambito (Scope)

La visibilità di una variabile dipende da dove viene dichiarata:

* Variabili Locali: Dichiarate all'interno di un blocco o metodo; esistono solo durante l'esecuzione del blocco stesso.
* Variabili Globali (Livello Classe): Dichiarate all'interno della classe ma fuori dai metodi; definiscono lo stato degli oggetti o della classe.

## 4. 🔢 Tipi di Dato Primitivi

I tipi primitivi sono i mattoni fondamentali del linguaggio. Essendo allocati nello stack, offrono prestazioni superiori rispetto agli oggetti.

Analisi Tecnica dei Tipi Primitivi

Tipo	Dimensione	Intervallo / Scopo
byte	8 bit	Da -128 a ## 127. Ottimizzazione memoria per grandi array binari.
short	16 bit	Da -32,768 a 32,## 767. Utilizzato in contesti embedded.
int	32 bit	Da ~-2 miliardi a ~2 miliardi. Tipo intero standard.
long	64 bit	Valori interi estremamente grandi.
float	32 bit	Decimale a singola precisione. Usato in calcoli grafici.
double	64 bit	Decimale a doppia precisione. Standard per calcoli scientifici.
char	16 bit	Singolo carattere Unicode (0 a 65,535).
boolean	~1 bit	Valori logici true o false.

Nota sull'Efficienza (2024)

Sebbene Java sia un linguaggio ad alto livello, i tipi primitivi rimangono essenziali per le prestazioni computazionali. Nelle versioni moderne (Java 21), la JVM è stata ottimizzata per gestire queste strutture in ambiti ad alta intensità di dati come il Machine Learning (ML) e l'Intelligenza Artificiale (AI), dove l'efficienza nell'elaborazione di array primitivi è determinante.

## 5. ⌨️ Input Utente: La classe Scanner

Per l'interazione dinamica, Java fornisce la classe Scanner (package java.util). È necessario istanziarla collegandola al flusso di input standard: Scanner input = new Scanner(System.in); Questo strumento permette di leggere dati di tipo diverso (int, double, stringhe) inseriti dall'utente durante il runtime, facilitando la creazione di programmi interattivi.

## 6. ➗ Operatori ed Espressioni

Un'espressione è una combinazione sintattica di operandi e operatori che la JVM valuta per produrre un valore.

Classificazione Operatori

* Aritmetici: +, -, *, /, % (resto della divisione).
* Confronto/Relazionali: ==, !=, >, <, >=, <=. Producono risultati booleani.
* Logici: && (AND), || (OR), ! (NOT), ^ (XOR). Operano esclusivamente su booleani.
* Assegnazione: = (semplice) e composti (+=, -=, *=, /=, %=).
* Incremento/Decremento: ++x (pre-incremento) vs x++ (post-incremento).
* Bitwise: Operazioni bit a bit (&, |, ^, <<, >>).
* Ternario: condizione ? valore_se_vero : valore_se_falso.
* Speciali: instanceof (verifica del tipo) e il punto . per l'accesso ai membri dei reference.

Regole di Valutazione

L'ordine di valutazione segue regole di Precedenza (es. la moltiplicazione precede l'addizione) e Associatività. Mentre la maggior parte degli operatori è associativa da sinistra a destra, l'operatore di assegnazione è associativo da destra.

* Esempio di associatività da destra: a = b = c = 100; (il valore 100 viene assegnato a c, poi c a b, infine b ad a).

## 7. 🔄 Controllo del Flusso

Strutture di Selezione

* if-else: Gestisce biforcazioni logiche basate su condizioni booleane.
* switch-case: Tradizionalmente usato per scelte multiple. Nelle versioni moderne, lo Switch Expression permette di restituire direttamente un valore (es. String res = switch(val) { ... };) e supporta il Pattern Matching, rendendo il codice più sicuro e leggibile rispetto alle catene di if-else if.

Strutture Iterative

* for: Per cicli definiti, dove il numero di iterazioni è noto a priori.
* while: Per cicli indefiniti, legati al permanere di una condizione.
* do-while: Garantisce sempre almeno un'esecuzione del blocco, poiché il controllo avviene in coda.

Logiche Avanzate

* break interrompe il ciclo; continue salta l'iterazione corrente.
* Pattern comuni: Cicli con filtro (selezione di elementi), con accumulatore (somma/conteggio progressivo) e cicli annidati (es. per matrici).

## 8. 📊 Array e Strutture Dati Lineari

Gli array in Java sono oggetti allocati nell'area Heap, non semplici puntatori.

Natura degli Array

* Hanno dimensione fissa stabilita al runtime tramite new.
* Supportano il bounds checking automatico: l'accesso a un indice fuori limite lancia una ArrayIndexOutOfBoundsException.

Tipologie e Utility

Oltre agli array mono-dimensionali, Java supporta array multi-dimensionali (matrici), che possono essere irregolari (ogni riga può avere lunghezza diversa). Per la gestione efficiente, la classe java.util.Arrays e la classe System forniscono:

* sort(): Ordinamento ottimizzato.
* binarySearch(): Ricerca rapida in array ordinati.
* System.arraycopy(): Metodo nativo ad alte prestazioni per copiare porzioni di array, preferibile ai cicli manuali per efficienza computazionale.

## 9. 🔤 Gestione delle Stringhe e Caratteri

Immutabilità

La classe String è immutabile e final. Ogni modifica a una stringa esistente produce in realtà un nuovo oggetto in memoria. Questa scelta garantisce sicurezza e permette l'ottimizzazione tramite lo String Pool.

Supporto e Modernità

* StringBuilder: Da usare per concatenazioni intensive (es. entro cicli) per evitare la proliferazione di oggetti temporanei.
* StringBuffer: Versione thread-safe di StringBuilder.
* Text Blocks (Java 13+): Delimitati da """, facilitano la scrittura di stringhe multilinea (JSON, SQL, HTML).
* String Templates (Java 21): Permettono l'interpolazione diretta di variabili (es. STR."Valore: \{x}").

Caratteri Speciali (Escape)

Literal	Significato
\n	Nuova riga
\t	Tabulazione
\b	Backspace
\r	Carriage return
\f	Form feed
\\	Backslash
\"	Doppie virgolette
\udddd	Carattere Unicode

## 10. 🔄 Casting e Promotion

Conversioni Primitive

* Promotion: Conversione automatica verso un tipo con capacità maggiore (es. int -> double). È sicura e non richiede sintassi speciale.
* Casting Esplicito: Richiesto per conversioni verso tipi più piccoli (es. (int) myDouble). Comporta il rischio di perdita di precisione o troncamento.
* Nota: Non è mai possibile effettuare un cast tra boolean e tipi numerici.

Conversioni Reference

Richiedono un legame di ereditarietà:

* Upcasting: (Sottoclasse -> Superclasse) Sempre automatico e sicuro.
* Downcasting: (Superclasse -> Sottoclasse) Richiede cast esplicito. Pericoloso se l'oggetto non è effettivamente del tipo target (rischio ClassCastException).

## 11. 📦 Metodi e Astrazione Funzionale

Anatomia del Metodo

Un metodo è definito da: modificatori, tipo di ritorno, nome, parametri formali, clausola throws e corpo del metodo.

Overloading e Varargs

* Overloading: Più metodi con lo stesso nome ma firme (signature) differenti per tipo o numero di parametri. Il tipo di ritorno non fa parte della firma.
* Varargs: Sintassi tipo... nome per accettare argomenti variabili.
  * Sicurezza Architetturale: È critico che il riferimento all'array creato dai varargs non sfugga mai al metodo (non deve essere restituito o assegnato a variabili esterne). Questo perché i varargs espongono un array interno che, se manipolato all'esterno, violerebbe l'incapsulamento e l'integrità dello stato dell'oggetto.

## 12. 📐 Gestione Numerica e Formattazione

Per presentare i dati o eseguire calcoli critici:

* Formattazione: String.format() e printf() usano placeholder (es. %,.2f per separatore migliaia e due decimali). DecimalFormat permette pattern personalizzati.
* Alta Precisione: Per applicazioni finanziarie, l'uso di float o double è proibito a causa degli errori di arrotondamento binario; si utilizza BigDecimal.
* Math: La classe java.lang.Math fornisce funzioni statiche per potenze, radici e trigonometria.

## 13. 🧠 Gestione della Memoria e Garbage Collection

Architettura della Memoria

* Heap Memory: Dove risiedono tutti gli oggetti. È il dominio d'azione del GC.
* Stack Memory: Dove vengono memorizzate le chiamate ai metodi e le variabili locali. È estremamente veloce e di dimensioni ridotte.
* Metaspace: Area che contiene i metadati delle classi e le costanti statiche.

Garbage Collector (GC)

Il GC automatizza la gestione del ciclo di vita degli oggetti (Creazione -> Utilizzo -> De-referenziamento -> Raccolta). La scelta dell'algoritmo è una decisione architettonica:

* G1 (Garbage First): Bilanciamento standard tra latenza e throughput.
* ZGC / Shenandoah: Progettati per carichi di lavoro moderni, garantiscono tempi di pausa (stop-the-world) sub-millisecondi, ideali per applicazioni real-time o con heap massivi.

Best Practices

Per ottimizzare la memoria: preferire StringBuilder, limitare lo scope delle variabili e assicurare la chiusura delle risorse esterne (file, socket) tramite il pattern try-with-resources.
