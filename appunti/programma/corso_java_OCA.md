## Argomenti della lezione

- Programmare in Java
- Un esempio elementare
- Gli strumenti di Java
- Struttura di un programma Java
- Metodi statici
- Variabili
- Tipi elementari
- Istruzioni principali
   
---

## Il linguaggio Java

- Formalismo ad alto livello...
- Permette di descrivere programmi basandosi su concetti primitivi “sofisticati” (file, finestre, tabelle, liste, ecc.)
...basato su una notazione testuale familiare
- Codice sorgente
- Simile, nella sintassi e nelle istruzioni al linguaggio C

---

## Codice Sorgente

- I programmi Java sono suddivisi in “classi”
- Le classi sono descritte all’interno di file di testo con estensione “.java”
- Ogni file contiene una sola classe
- Il nome file deve coincidere con il nome della classe

---

## Gli strumenti di Java

- La macchina virtuale
- Il compilatore 
- Gli ambienti di sviluppo
- La documentazione
- Il debugger

---

## Macchina virtuale 

- Astrazione di un elaboratore “generico” 
- Ambiente di esecuzione delle applicazioni Java
- Esempio:
- java Hello
- Responsabilità:
- Caricamento classi dal disco
- Verifica consistenza codice
- Esecuzione applicazione

---

## Il compilatore

- Traduzione dei sorgenti testuali in bytecode
- Linguaggio della macchina virtuale Java
- Esempio:
	javac Hello.java

---

## Ambienti di sviluppo

- Il codice sorgente Java è 
- composto da testo
- Un editor qualsiasi è sufficiente

---

## Si possono usare ambienti integrati per lo sviluppo (IDE)

- Offrono strumenti per la redazione,  la compilazione, l’esecuzione e  la ricerca degli errori

---

## Esempi

- Eclipse
- http://www.eclipse.org
- JCreator 
- http://www.jcreator.com
- BlueJ
- http://www.bluej.org
- IntelliJIdea

---

## Documentazione

- Strumento necessario 
- alla sopravvivenza del programmatore Java!!
- Raccolta di informazioni relative alle classi appartenenti alle librerie standard di Java
- http://java.sun.com/docs/

---

## Documentazione

- Per ogni classe:
- Descrizione funzionale
- Elenco di attributi: 
- funzionalità, caratteristiche
- Elenco dei metodi:
- funzionalità, parametri in ingresso, valori di ritorno, …

---

## Il debugger

- Strumento ausiliario
- Monitorare l’esecuzione
- di una applicazione
- Analisi dei valori assunti dalle variabili, i metodi della classe, …
- Comando jdb.exe

---

## Dove si usa Java?

- Java nei sistemi Client
- Vantaggi
- Facilità di realizzazione delle interfacce grafiche
- Indipendenza dalla piattaforma di sviluppo e di utilizzo
- Ciclo di sviluppo rapido 
- Distribuzione immediata, a richiesta, tramite web
- Svantaggi
- Prestazioni limitate rispetto ad applicazioni native
- Ambienti di esecuzione in forte evoluzione
- Java nei sistemi Server
- Varie tipologie di utilizzo:
- Servlet / Java Server Pages / Java Server Faces
- EnterpriseJavaBean
- Application server
È il contesto in cui Java sta ottenendo il massimo successo
“Programmazione in ambienti distribuiti”

---

## Java nei sistemi Embedded

- Segmento di mercato in forte crescita:
- Milioni di PC connessi ad Internet
- Centinaia di milioni di telefoni cellulari
- Miliardi di elettrodomestici
- Vengono usate librerie specifiche
- JavaCard, Java Micro Edition, …

---

## Installare Java

- Java Software 
- Development KIT 
(J2SE SDK) 
- Versione utilizzata nel corso 
- compilatore, librerie standard, macchina 
- virtuale, …

---

## Installare Java

- Necessario modificare la variabile d’ambiente
- PATH= ... ;<JAVA_HOME>/bin
- per invocare i comandi java (compilatore, macchina virtuale, debugger, ...)
- Pannello di controllo  
- Sistema  Avanzate 
- Variabili d’ambiente

---

## Struttura dei file

<File>.java
- Contengono il codice sorgente Java
<File>.class
- Contengono il risultato della compilazione
- Espressi in bytecode (formato binario)
- All’interno sono presenti le istruzioni, la tabella dei simboli, le informazioni ausiliarie necessarie all’esecuzione

---

## Struttura dei file

<File>.jar
- Archivi compressi che 
- consentono di aggregare più file 
- Contengono una o più classi Java, risorse e ulteriori informazioni ausiliarie (documentazione, parametri di configurazione, …)
<File>.properties
- Coppie chiave – valore
- proprietà del sistema o dell’applicazione
- Si usano per configurare il sistema

---

## Programmi Java

- Java è un linguaggio ad oggetti
- L’unità minima di programmazione è la classe
- Un programma Java utilizza una o più classi
- Per ora, consideriamo programmi formati da una sola classe
- Un solo file sorgente
- Il nome del file coincide con il nome della classe
- L’estensione del file è “.java”

---

## Formato generale

- main(…): la porta 
- sul mondo Java
- public static void 
	main(String[] args){
	/* istruzioni ... */
}
- Punto di ingresso di ogni applicazione
- Invocato automaticamente dalla VM Java 

---

## Metodi statici

- Sequenze di istruzioni che svolgono un determinato compito
- Hanno un nome
- Possono avere dei parametri
- Possono ritornare un valore
- Dovrebbero avere un commento!

---



---

## Commenti

- Servono a documentare un programma 
(o una sua parte)
- Racchiusi da “/*” e “*/”
“//” inizia un commento che termina a fine riga
- Usati sempre troppo poco!

---

## Variabili locali

- I metodi possono utilizzare variabili:
- Servono a memorizzare 
- risultati intermedi
- Dichiarate nel corpo del metodo
- Durata temporanea: quando il metodo ritorna, la variabile è distrutta

---

## Tipi: una forma per i dati

- Variabili, parametri, 
- valori ritornati hanno 
- un tipo che ne precisa
/limita l’uso
- Possono contenere solo valori conformi al proprio tipo
- Esistono tipi
- Semplici (primitivi)
- Composti (classi) – descritti nelle lezioni successive

---

## Tipi primitivi

- Numerici interi
- byte, short, int, long
- Numerici reali
- float, double
- Non numerici
- boolean, char

---

## Tipi numerici interi (1)

- Valori ammissibili
- byte {-128 ... 127}
- short {-32768 ... 32767}
- int {-2147483648 ... 2147483647}
- long {-9.22 E18 ... 9.22E18}

---

## Tipi numerici interi (2)

- Operazioni consentite
- aritmetiche 
+, -, *, /, %, ++,  --, >>
- logiche (bit a bit)
^, &, |, ~, <<, >>>
- confronto 
==, !=, >, >=, <, <=

---

## Tipi numerici reali

- Valori
- float {±3.403E38} 
	6 cifre significative
- double {±1.798E308} 
	15 cifre significative
- Operazioni
- aritmetiche (+, -, *, /)
- confronto (==, !=,
>, >=, <, <=)

---

## Tipi non numerici: boolean

- Valori
{false, true}
- Operazioni
- logiche (&&, ||, !)
- confronto (==, !=)

---

## Tipi non numerici: char

- Rappresentazione 
- dei caratteri secondo 
- lo standard Unicode
- Lettere di vari alfabeti
- arabo, armeno, bengalese, cirillico,
- greco, latino, ...
- Simboli
- diacritici, punteggiatura, 
- matematici, tecnici, ...

---

## Tipi non numerici: char

- Rappresentazione su due byte
- Le costanti sono indicate tra apici semplici (‘a’)
- I valori non stampabili sono rappresentati nel formato unicode (‘\u27AF’)
- Operazioni 
- confronto 
(==, !=, >,>=, <, <=)

---

## Dichiarazioni

- Introducono l’utilizzo di una variabile
- Formato generale
<Tipo> <Nome> ‘;’
<Tipo> <Nome> ‘=’ <ValoreIniziale> ‘;’
- Esempi
- char c;
- int i = 10;
- long l1, l2;
- La mancata dichiarazione è un errore sintattico

---

## Usare le variabili (1)

- Si può dichiarare una variabile ovunque nel codice di un metodo
- Bisogna farlo, però, prima di usarla
- Visibilità limitata al blocco di istruzioni in cui è dichiarata
- Le variabili devono essere inizializzate!
- int a;
- int b = a; 

---

## Usare le variabili (2)

- Ad una variabile può essere assegnato:
- Un valore costante
- Il risultato di una formula
- Esempi
- int i = 1, j = 5; 
- i = (5*j) % 10;
- long l = 10L;
- char c1 = ‘a’, c2 = ‘\u0062’;
- boolean b = false; 

---

## Argomenti della lezione

- Modellare la realtà
- Le classi: il modello
- Attributi e metodi
- Gli oggetti: il mattone
- Costruzione e accesso
- Riferimenti
- Ciclo di vita degli oggetti

---

## Convenzioni sui nomi

- Le classi hanno nomi che iniziano con la lettera maiuscola
- Metodi, attributi e variabili hanno l’iniziale minuscola
- Se un nome è composto da più parole giustapposte, l’iniziale di ogni parola successiva alla prima è maiuscola
- int contatoreNumeroOccorrenze = 0;
- class CentraleTelefonica { }

---

## Modellare la realtà

- Stato
- L’insieme dei parametri caratteristici che contraddistinguono un oggetto in un dato istante
- Modellato come insieme di attributi
- Comportamento
- Descrive come si modifica lo stato a fronte degli stimoli provenienti dal mondo esterno
- Modellato come insieme di metodi

---


## Classi

- La classe costituisce il “progetto” di un oggetto
- Specifica gli attributi
- Descrive i metodi
- Indica lo stato iniziale
- Ogni classe ha un nome
- Deve essere univoco

---

## Oggetti

- Data una classe, è possibile costruire uno o più oggetti
- Gli oggetti vengono detti “istanze” della classe
- In Java si utilizza la notazione 
	new NomeClasse ( );
- Ogni oggetto “vive” all’interno della memoria del calcolatore
- Qui viene memorizzato il suo stato
- Oggetti differenti occupano posizioni differenti

---

## Oggetti

- Stato di un oggetto
- Ogni oggetto ha un proprio stato:
- Insieme dei valori assunti dagli attributi dell’oggetto
- Operando sui metodi, si può modificare lo stato
- All’atto della costruzione di un oggetto, occorre assegnare un valore ai diversi attributi
È il compito di un metodo particolare, detto costruttore

---

## Costruttore

- Metodo che inizializza gli attributi di una classe
- Sintassi particolare:
- Ha lo stesso nome della classe
- Non indica nessun tipo ritornato

---

## Costruire oggetti

- Costruttore e parametri
- Normalmente un costruttore assegna valori “standard” agli attributi
- Se ha dei parametri, può differenziare gli oggetti costruiti
- Chi invoca il costruttore deve fornire 
- i parametri richiesti
- Una classe può avere molti costruttori
- Occorre che siano distinguibili attraverso il numero ed il tipo di parametri richiesti

---

## Costruttore e parametri

- Riferimenti
- Si opera su un oggetto attraverso un riferimento
- Indica la posizione in memoria occupata dall’oggetto
- All’atto della costruzione, l’operatore new: 
- Alloca un blocco di memoria sufficiente a contenere l’oggetto
- Invoca il costruttore, determinandone la corretta inizializzazione
- Restituisce il riferimento (indirizzo) del blocco inizializzato

---

## Riferimenti

- Variabili
- I riferimenti possono essere memorizzati all’interno di variabili locali
- Devono avere un tipo compatibile con il tipo di riferimento che si intende memorizzare al loro interno
- Devono essere dichiarate prima di essere usate

---

## Variabili

- Variabili
- Ciclo di vita 
- delle variabili locali
- Le variabili locali “esistono” finché il metodo (blocco di codice) che le definisce è in esecuzione
- Quando si incontra la loro definizione, il sistema riserva un’area di memoria per ospitarne il contenuto
- Quando il metodo (blocco) termina, l’area viene rilasciata ed il contenuto della variabile perso
- La memoria viene prelevata da una zona apposita detta “stack” (quella in cui si trovano gli oggetti, invece, si chiama “heap”)
- Ciclo di vita 
- delle variabili locali
- Riferimenti multipli
- Uno stesso oggetto può essere denotato da più variabili
- Succede quando si assegna ad un variabile il valore contenuto in un’altra variabile
- Le variabili condividono il riferimento allo stesso oggetto
- Se si opera sull’oggetto attraverso la prima variabile, le modifiche sono visibili da tutte le altre variabili coinvolte

---

## Riferimenti multipli

- Variabili elementari
- Non tutte le variabili contengono un riferimento
- Le informazioni più semplici possono essere memorizzate direttamente nella variabile
È il caso delle variabili il cui tipo è elementare (detto anche primitivo)

---

## Variabili elementari

- Variabili elementari
- Copia di variabili elementari
- Se si assegna ad una variabile elementare il valore di un’altra variabile viene eseguita una copia del valore
- I due valori diventano disgiunti e potranno evolvere indipendentemente

---

## Variabili elementari

- Riferimenti nulli
- Nel caso di variabili di tipo classe, a volte occorre indicare che non contengono nessun valore
- Si usa la parola chiave null
- Se una variabile vale null, non è possibile accedere ai metodi o agli attributi

---

## Riferimenti nulli

- Riferimenti nulli
- Accedere agli oggetti
- Noto il riferimento ad un oggetto, è possibile invocarne i metodi
- Si usa la notazione
		variabile.metodo(...);
- Nelle parentesi si indicano gli eventuali parametri
- Se la variabile contiene un riferimento nullo si genera un errore di esecuzione
- Il metodo è costituito da un insieme di istruzioni
- Il comportamento è simile ad una chiamata a procedura
- Il chiamante attende il completamento del metodo, poi prosegue la propria elaborazione

---

## Parametri

- Un metodo può avere parametri
- Internamente, appaiono come variabili locali
- Il loro valore, però, è fornito dal chiamante
- Come le variabili, i parametri hanno un tipo
- Elementare
- Complesso
- Nel caso di parametri di tipo elementare
- All’interno del parametro viene memorizzata una copia del valore indicato dal chiamante
- Eventuali modifiche compiute dal metodo sul valore non si ripercuotono sul chiamante
- Se il tipo è complesso
- Il parametro contiene una copia del riferimento all’oggetto passato come parametro
- Le eventuali modifiche sullo stato dell’oggetto sono visibili al chiamante
- Invocare metodi
- Valori di ritorno
- Alcuni metodi restituiscono un valore
- Il tipo del valore ritornato viene dichiarato prima del nome del metodo
- double calcolaPerimetro() { … }
- Il valore ritornato può essere assegnato ad una variabile
- Occorre che la variabile sia compatibile con il tipo del valore ritornato
- Altri metodi non ritornano nulla
- In questo caso dichiarano di ritornare il tipo predefinito void
- void setRaggio(double r) { … }

---

## Valori di ritorno

- Valori di ritorno
- Tipologie di metodi
- Un metodo, in generale, può operare liberamente sull’oggetto su cui viene invocato…
- Modificandone lo stato
- Invocando metodi su altri oggetti conosciuti
- Effettuando calcoli
- Restituendo risultati
- Spesso, però, si progettano metodi specializzati in una delle funzioni citate

---

## Tipologie di metodi

- Modificatori (mutator)
- Servono ad alterare, in modo controllato, lo stato dell’oggetto (o una sua parte specifica)
- Di solito hanno parametri e non ritornano nulla
- Per convenzione, in Java, hanno un nome simile a
- void setXyz(…);
- Lettori (accessor)
- Permettono di conoscere lo stato (o una sua parte specifca) di un oggetto
- Di solito, non hanno parametri, e ritornano il valore letto
- Per convenzione, in Java, hanno un nome simile a 
<tipoRitornato> getXyz();

---

## Attributi

- Come le variabili, anche gli attributi possono avere tipi
- Elementari
- Complessi (riferimenti ad oggetti)
- Un attributo di tipo elementare 
- Contiene direttamente il valore
- Un attributo di tipo complesso
- Contiene il riferimento ad un oggetto (oppure null)

---

## Esempio

- Attributi e costruttore
- All’atto dell’invocazione del costruttore, tutti gli attributi hanno un valore di default
- Gli attributi semplici valgono 0 (false, nel caso dei valori booleani)
- Quelli complessi, valgono null
È compito del costruttore assegnare valori opportuni se quelli di default non sono adatti
- Questo può comportare anche la creazione di oggetti

---

## Attributi e costruttore

- Ciclo di vita di un oggetto
- L’operatore new, su richiesta del programmatore, alloca la memoria necessaria a contenere un oggetto
- D1: quando viene rilasciata?
- R1: quando l’oggetto non serve più!
- D2: chi decide che non serve più?
- R2: l’ambiente di esecuzione (!?!)

---


## Accessibilità

- Un oggetto è accessibile fino a che ne esiste un riferimento
- Nel momento in cui non esistano più riferimenti, l’oggetto può essere eliminato
- Rilasciando la memoria che occupa
- I riferimenti sono memorizzati in variabili e attributi
- Si cancellano quando la variabile cessa di esistere (fine del blocco) 
- Oppure assegnando esplicitamente il valore null

---


## Riferimenti nulli

- Conteggio dei riferimenti
- All’interno di ogni oggetto, Java mantiene un contatore nascosto
- Indica il numero di riferimenti esistenti a quello specifico oggetto
- Quando il suo valore scende a 0, indica che l’oggetto può essere eliminato, rilasciando la memoria che occupa
- Un particolare sottosistema, il garbage collector, si occupa, periodicamente, di riciclare la memoria degli oggetti eliminati
- Viene eseguito automaticamente dalla macchina virtuale Java

---

## Costrutti di programmazione

- Istruzioni semplici
- Scelta
- Ripetizione
- Salto strutturato
- Invocazione di metodi
- Trattata più in dettaglio 
- successivamente
- Blocchi di istruzioni
- Racchiusi tra parentesi 
- graffe {…}

---

## Istruzioni di scelta (1)

- Verifica della condizione
- Vera si esegue l’istruzione o il blocco di istruzioni successivo
- Falsa si salta all’istruzione successiva oppure viene eseguito il blocco “else”

---

## Istruzioni di scelta (2)

- Struttura di selezione multipla
- Valutazione del valore di una variabile
- val1, …, valN: 
- espressioni costanti  (interi o caratteri)

---

## Istruzioni di ripetizione (1)

- espr1: inizializzazione variabile/i di controllo
- espr2: condizione di continuazione
- espr3: modifica della/e variabili di controllo

---

## Istruzioni di ripetizione (2)

- Esecuzione di un blocco di istruzioni finché la condizione rimane vera
- do/while garantisce almeno una iterazione

---

## Salto strutturato

- Istruzioni che permettono di alterare il flusso di esecuzione:
- break : provoca l’uscita immediata dal blocco
- continue: salto delle rimanenti istruzioni del blocco, procede con l’interazione successiva del ciclo
- Usati nei costrutti while, do/while, for, switch (quest’ultimo, solo break)

---

## Oggetti e utilizzatori

- Non tutte le caratteristiche di un oggetto devono essere visibili dall’esterno
- Rischio di manomissioni indebite
- Occorre separare l’interfaccia dall’implementazione
- Si realizza l’incapsulamento utilizzando un modificatore di visibilità
- Metodi e attributi possono preceduti da una parola chiave che indica il livello di privilegio loro associato

---

## Modificatori di visibilità

- Private
- Indica che si può accedere all’elemento solo da altri metodi appartenenti alla stessa classe
- Public
- Indica che l’elemento può essere utilizzato da metodi di qualsiasi classe
[Nulla]
- In assenza di indicazioni, l’elemento è accessibile alle altre classi dello stesso “gruppo” (package)

---

## Visibilità delle classi

- Anche le classi possono essere precedute da un modificatore di visibilità
- In questo caso, “private” non ha senso
- Se una classe è dichiarata pubblica, può essere utilizzata da classi appartenenti a qualsiasi gruppo (package)
- Altrimenti, può essere usata solo nell’ambito del gruppo in cui è stata definita

---

## Incapsulamento

- Per massimizzare il riuso, solo l’informazione minima necessaria al funzionamento deve essere accessibile
- Di solito:
- Attributi privati
- Metodi pubblici
- Costruttori pubblici

---

## Incapsulamento

- Metodi e attributi statici
- Oggetti appartenenti ad una stessa classe hanno lo stesso insieme di attributi
- Ogni oggetto ha però i propri valori, indipendenti dagli altri
- Un metodo opera sui valori dell’oggetto su cui è invocato
- L’evoluzione dello stato di un oggetto è indipendente da quella di altri oggetti della stessa classe

---

## Attributi statici

- Talora, si vuole memorizzare un’informazione comune a tutti gli oggetti di una data classe
- Si utilizzano gli attributi “statici”
- Il loro valore viene conservato in un blocco di memoria separato, relativo alla classe
- Sono analoghi a variabili globali in altri linguaggi (C, C++)

---

## Uso degli attributi statici

- Si può fare accesso ad un attributo statico anche in mancanza di un oggetto specifico
- double d= Cerchio.pi/2;
- Gli attributi statici devono essere inizializzati
- Non si può fare nel costruttore!
- Occorre farlo all’atto della dichiarazione
- static double pi = 3.14 ;

---

## Metodi statici

- Non fanno riferimento a nessun attributo specifico di un oggetto
- Preceduti dal modificatore “static”
- Equivalenti a procedure e funzioni di altri linguaggi
- Possono essere invocati a partire dal nome della classe

---

## Esempi

- La classe “Math” contiene metodi statici per le principali operazioni matematiche
- double d1,d2;
- d1 = Math.sqrt( 2.0 );
- d2 = Math.sin( Math.PI / 2.0 );
- La classe “System” contiene, sotto forma di attributi statici, oggetti che modellano le interazioni con la console di sistema
- System.out 	//output su schermo
- System.in	//input da tastiera

---

## Il metodo main()

- Quando un programma inizia, non può esistere ancora nessun oggetto
- Il punto di ingresso deve essere un metodo statico e pubblico
- Perché?
- Convenzione Java:
- public static void 
	main(String[ ] args)

---

## La classe String

- Classe che modella sequenze immutabili di caratteri
- Sintassi semplificata
- String s1=  “Hello” ;
- String s2 = s1+ “ Java”
- Offre molti metodi
- Confronto, ricerca, derivazione di nuove stringhe, informazioni generali, …

---

## Confronto e ricerca

- public boolean equals(String s)
- Restituisce true se il parametro contiene gli stessi caratteri dell’oggetto corrente
- public boolean equalsIgnoreCase(String s)
- Idem, trascurando la differenza tra maiuscole e minuscole
- public int indexOf(String s)
- Restituisce la posizione, all’interno della sequenza di caratteri, in cui inizia la stringa indicata come parametro (-1 se non esiste)

---

## Derivazione e informazioni

- public String toUpperCase()
- Restituisce una nuova stringa contenente gli stessi caratteri in versione maiuscola
- public String replace(char oldChar, char newChar)
- Restituisce una nuova stringa in cui tutte le occorrenze di oldChar sono sostituite con newChar
- public String substring(int beginIndex, int endIndex)
- Restituisce una nuova stringa formata dai caratteri che iniziano alla posizione beginIndex fino a endIndex escluso
- public int length()
- Restituisce la lunghezza in caratteri della stringa corrente

---

## Argomenti della lezione

- Raggruppare le classi 
- in package
- Struttura dei package
- delle API Java
- Il package
- java.lang

---

## Nomi delle classi

- La metodologia ad oggetti favorisce il riuso delle classi 
- Il nome della classe dovrebbe suggerirne la semantica
- A volte bisogna utilizzare nello stesso progetto classi già esistenti, di provenienza diversa ed aventi lo stesso nome
- Occorre poter differenziare ulteriormente tali classi

---

## Package: 

- un cognome per le classi
- Le classi possono essere raggruppate in “package”
- Ogni package ha un nome
- Viene scelto in modo da essere univoco
- Una classe è denotata:
- Dal nome proprio
- Dal package di appartenenza

---

## Package: appartenenza

- Le classi che appartengono ad uno stesso package formano un gruppo
- Come nel caso di una famiglia, c’è un rapporto privilegiato:
- Accessibilità a tutti i componenti non privati (public, protected, <vuoto>)

---

## Il nome dei package

- Sequenza di parole separate da ‘.’
- Dovrebbe suggerire lo scopo comune del gruppo di classi
- Per evitare collisioni, spesso inizia con il nome DNS in ordine inverso
- it.polito.didattica.esempi

---

## Sintassi

- La parola chiave “package” denota il gruppo di appartenenza
È seguita dal nome del package
- Deve essere posta all’inizio del file sorgente

---

## Sintassi

- Le classi dello stesso package si “conoscono”
- Basta usare il nome proprio della classe
- Tra package diversi occorre usare il nome completo
- Anche nei costruttori

---



---

## Importare riferimenti

- L’uso di nomi completi è scomodo
- Gli amici si chiamano per nome
- Il costrutto “import” permette di definire le classi note
- Queste vengono indicate solo per nome
- Serve solo in fase di compilazione!

---

## Importare riferimenti

- Si possono includere un numero qualsiasi di clausole import
- Devono sempre  precedere la definizione della classe
- Per importare tutte le classi di un package, si usa la sintassi
- import NomePackage.* ;

---

## Gerarchia di package

- Il nome di un package può essere formato da molti segmenti
- Package che condividono lo stesso prefisso, possono avere funzionalità “collegate”
- java.awt
- java.awt.event
- Per Java, sono gruppi totalmente separati

---

## Package anonimo

- Le classi che non dichiarano in modo esplicito il proprio package appartengono al package “anonimo”
- A partire dalla versione 1.4, le classi del package anonimo non possono essere utilizzate da classi appartenenti ad altri package

---

## Compilare ed eseguire

- Per poter utilizzare una classe all’interno di un’altra non basta “risolverne” il nome
- Occorre localizzare il codice ad essa associato
- Altrimenti viene lanciato l’errore “NoClassDefFoundError”

---

## Rappresentazione su disco

- Ad ogni classe, corrisponde un file “.class” che contiene il codice eseguibile
- Questo deve risiedere in una (gerarchia di) cartella il cui nome coincide con quello del package
- Le classi del package anonimo si trovano nella cartella radice

---

## La variabile CLASSPATH

- Variabile d’ambiente del sistema operativo
- Specifica un insieme di cartelle radice in cui cercare i file “.class” o le sottocartelle dei package
- Può contenere direttori compressi (file “.jar”)

---

## File Jar

- Gerarchie di cartelle e file compressi
- Analoghi a file “.zip”
- Possono essere manipolati con il comando “jar”
- Facilitano la distribuzione di interi package

---

## API Java

- Application Programming Interface
- Insieme di meccanismi per interagire con il sistema ospitante
- Progettati interamente ad oggetti
- Offrono 
- Funzioni di libreria
- Interfaccia verso il sistema operativo
- Versione 1.4.2:
135 package
- Oltre 2700 classi

---

## Package principali 

- java.awt
- Abstract Windowing Toolkit
- Classi per creare interfacce utente di tipo grafico
- java.io
- Input/Output
- Classi per accedere a a flussi di dati, file e altri meccanismi di comunicazione

---

## Package principali

- java.lang
- Contiene le classi fondamentali del linguaggio
- java.math
- Estensioni matematiche
- Classi per modellare numeri interi e reali con precisione illimitata
- java.net
- Meccanismi di accesso alla rete 
- Socket, URL, connessioni HTTP, …

---

## Package principali

- java.nio
- New Input/Output
- Meccanismi di basso livello per interfacciarsi con il mondo esterno
- java.security
- Classi che implementano il modello di sicurezza di Java 
- java.sql
- Accesso a basi dati relazionali

---

## Package principali

- java.text
- Trattamento multiculturale di numeri, date, testo
- java.util
- Insieme variegato di classi ad uso generale

---

## java.lang: l’ABC delle applicazioni Java

- Fornisce le classi fondamentali 
- per la programmazione Java 
- Importato automaticamente dal compilatore in tutti i programmi
- Contiene – tra le altre – le classi 
- Object, Throwable, String

---

## java.lang.StringBuffer

- Analoga alla classe String
- Ma permette di modificare i caratteri contenuti
- Principali operazioni
- append(…)
- insert(…)
- replace(…)
- toString()

---

## Classi “wrapper”

- Utilizzate per trasformare in oggetti dati elementari
- Il dato contenuto è immutabile
- Pattern generale
- dell’ingegneria
- del software

---

## Classi “wrapper”

- Wrapper numerici
- Sottoclassi di Number
- Metodi per
- Trasformare una stringa 
- in un numero e viceversa
- Trasformare un numero in formati diversi (con possibile troncamento)
- Rappresentazione testuale ottale, esadecimale, binaria

---

## Character, Boolean

- Character 
- Maiuscolo / minuscolo 
- Valore Unicode
- Confronto
…
- Boolean
- Conversione da/verso stringa 
- Confronto
…

---

## java.lang.System

- Contiene attributi e metodi statici, utilizzati per:
- Interazione con il sistema
- Acquisizione di informazioni
- Caricamento di librerie
- Accesso a standard input e output
…
- Non può essere istanziata

---

## System: i metodi (1)

- exit(…)
- terminazione della JVM 
- currentTimeMillis()
- Numero di millisecondi trascorsi dal 1 gennaio 1970
- setProperties(…)/getProperties(…)
- assegnazione e acquisizione delle proprietà di sistema

---

## System: i metodi (2)

- gc()
- invocazione del garbage collector
- load(…) / loadLibrary(…)
- carica dinamicamente un file o una libreria
- setIn(…), setOut(…), setErr(…)
- riassegnazione dei flussi standard

---

## java.lang.Math

- Mette a disposizione gli
- strumenti necessari per le operazioni matematiche base
- Contiene solo metodi e attributi statici
- valore assoluto, logaritmo, potenza, trigonometrici, minimo, massimo, …
- Math.pow(2,10); //210

---

## java.lang.Runtime

- Singola istanza per ogni applicazione
- Consente di interfacciarsi con il sistema operativo
- Metodi 
- Alcuni analoghi a System: exit, gc, …
- Esecuzione di un processo, memoria disponibile,…

---

## Array

- All’interno di un programma può essere necessario gestire collezioni di dati:
- Il modo più semplice per organizzarli, se sono di tipo omogeneo, è attraverso il concetto di array o vettore
- Array in Java: oggetti che incapsulano sequenze ordinate di dati
- Hanno dimensione fissa, definita all’atto della creazione
- Sintassi semplificata per accedere ai singoli elementi

---

## Tipologie di array

- Esistono due gruppi di array
- Quelli che modellano sequenze di tipi elementari (interi, reali, caratteri, booleani)
- Quelli che modellano sequenze di oggetti
- Qualunque sia il gruppo di appartenenza, gli array sono sempre oggetti complessi
- Vengono creati tramite l’operatore new
- Si accede ad essi attraverso un riferimento in memoria

---

## Inizializzare un array

- Nel caso di array di tipi elementari, all’atto della creazione vengono assegnati valori di default
0 per i numeri (interi e reali)
- false per i valori logici
‘\000’ per i caratteri
- A volte si conosce a priori l’intero contenuto dell’array
- Java offre una sintassi semplificata per la sua inizializzazione

---


## Uso degli array

- Per accedere ad un singolo elemento, si utilizza la sintassi
- nome_array [ indice ]
- L’indice deve essere compreso tra 0 e il numero di elementi presenti nell’array
- Un array può contenere anche tipi complessi (oggetti)
- In questo caso, nelle singole posizioni sono memorizzati i riferimenti agli oggetti specifici
- All’atto della creazione del vettore, tutti i riferimenti contenuti valgono null

---



---

## Array a più dimensioni

È anche possibile creare matrici
- int [ ] [ ] matrice=   new int [3] [3];
- Si tratta di “array di array”
- Il primo indice si riferisce alla riga, il secondo alla colonna
- Non c’è limite al numero di dimensioni dell’array
- Se non la memoria disponibile…

---


## Argomenti della lezione

- I concetti principali
- Ereditarietà in Java
- La classe Object
- Classi astratte 
- e interfacce

---

## Riusare il software

- A volte si incontrano classi con funzionalità simili
- In quanto sottendono concetti semanticamente “vicini”
- Una mountain bike assomiglia ad una bicicletta tradizionale
È possibile creare classi disgiunte replicando le porzione di stato/comportamento condivise
- L’approccio “Taglia&Incolla”, però, non è una strategia vincente
- Difficoltà di manutenzione correttiva e perfettiva
- Meglio “specializzare” codice funzionante
- Sostituendo il minimo necessario

---

## Ereditarietà

- Meccanismo per definire una nuova classe (classe derivata) come specializzazione di un’altra (classe base)
- La classe base modella un concetto generico
- La classe derivata modella un concetto più specifico
- La classe derivata:
- Dispone di tutte le funzionalità (attributi e metodi) di quella base
- Può aggiungere funzionalità proprie
- Può ridefinirne il funzionamento di metodi esistenti (polimorfismo) 

---

## Astrazione

- Il processo di analisi e progettazione del software di solito procede per raffinamenti successivi
- Spesso capita che le similitudini tra classi non siano colte inizialmente
- In una fase successiva, si coglie l’esigenza/opportunità di introdurre un concetto più generico da cui derivare classi specifiche
- Processo di astrazione
- Si introduce la superclasse che “astrae” il concetto comune condiviso  dalle diverse sottoclassi 
- Le sottoclassi vengono “spogliate” delle funzionalità comuni che migrano nella superclasse

---


## Tipi ed ereditarietà

- Ogni classe definisce un tipo:
- Un oggetto, istanza di una sotto-classe, è formalmente compatibile con il tipo della classe base
- Il contrario non è vero!
- Esempio
- Un’automobile è un veicolo
- Un veicolo non è (necessariamente) un’automobile
- La compatibilità diviene effettiva se 
- I metodi ridefiniti nella sotto-classe rispettano la semantica della superclasse
- L’ereditarietà gode delle proprietà transitiva
- Un tandem è un veicolo (poiché è una bicicletta, che a sua volta è un veicolo)
- Vantaggi dell’ereditarietà
- Evitare la duplicazione 
- di codice
- Permettere il riuso 
- di funzionalità
- Semplificare la costruzione 
- di nuove classi
- Facilitare la manutenzione
- Garantire la consistenza delle interfacce

---

## Ereditarietà in Java

- Si definisce una classe derivata attraverso la parola chiave “extends”
- Seguita dal nome della classe base
- Gli oggetti della classe derivata sono, a tutti gli effetti, estensioni della classe base
- Anche nella loro rappresentazione in memoria

---


## Meccanismi

- Costruzione di oggetti di classi derivate
- Accesso alle funzionalità della superclasse
- Ri-definizione di metodi

---

## Costruzione

- Per realizzare un’istanza di una classe derivata, occorre – innanzi tutto – costruire l’oggetto base
- Di solito, provvede automaticamente il compilatore, invocando – come prima operazione di ogni costruttore della classe derivata – il costruttore anonimo della superclasse
- Si può effettuare in modo esplicito, attraverso il costrutto super(…)
- Eventuali ulteriori inizializzazioni possono essere effettuate solo successivamente

---

## Accedere alla superclasse

- L’oggetto derivato contiene tutti i componenti (attributi e metodi) dell’oggetto da cui deriva
- Ma i suoi metodi non possono operare direttamente su quelli definiti privati
- La restrizione può essere allentata:
- La super-classe può definire attributi e metodi con visibilità “protected” 
- Questi sono visibili alle sottoclassi

---

## Ridefinire i metodi

- Una sottoclasse può ridefinire metodi presenti nella superclasse
- A condizione che abbiano
- Lo stesso nome
- Gli stessi parametri (tipo, numero, ordine)
- Lo stesso tipo di ritorno
(La stessa semantica!)
- Per le istanze della sottoclasse, il nuovo metodo nasconde l’originale

---

## Ridefinire i metodi

- A volte, una sottoclasse vuole “perfezionare” un metodo ereditato, non sostituirlo in toto
- Per invocare l’implementazione presente nella super-classe, si usa il costrutto 
- super.<nomeMetodo> ( … )

---

## Compatibilità formale

- Un’istanza di una classe derivata è formalmente compatibile con il tipo della super-classe
- Base b = new Derivata( ); 
- Il tipo della variabile “b” (Base) limita le operazioni che possono essere eseguite  sull’oggetto contenuto
- Anche se questo ha una classe più specifica (Derivata), in grado di offrire un maggior numero di operazioni
- Altrimenti viene generato un errore di compilazione

---

## Polimorfismo

- Java mantiene traccia della classe effettiva di un dato oggetto
- Seleziona sempre il metodo più specifico…
…anche se la variabile che lo contiene appartiene ad una classe più generica!
- Una variabile generica può avere “molte forme” 
- Contenere oggetti di sottoclassi differenti
- In caso di ridefinizione, il metodo chiamato dipende dal tipo effettivo dell’oggetto

---


## Polimorfismo

- Per sfruttare questa tecnica:
- Si definiscono, nella super-classe, metodi con implementazione generica…
…sostituiti, nelle sottoclassi, da implementazioni specifiche
- Si utilizzano variabili aventi come tipo quello della super-classe
- Meccanismo estremamente potente e versatile, alla base di molti “pattern” di programmazione

---

## La classe java.lang.Object

- In Java:
- Gerarchia di ereditarietà semplice
- Ogni classe ha una sola super-classe
- Se non viene definita esplicitamente una super-classe, il compilatore usa la classe predefinita Object
- Object non ha super-classe!

---


## Metodi di Object

- Object definisce un certo numero di metodi pubblici
- Qualunque oggetto di qualsiasi classe li eredita
- La loro implementazione base è spesso minimale
- La tecnica del polimorfismo permette di ridefinirli
- public boolean equals(Object o)
- Restituisce “vero” se l’oggetto confrontato è identico (ha lo stesso riferimento) a quello su cui viene invocato il metodo
- Per funzionare correttamente, ogni sottoclasse deve fornire la propria implementazione polimorfica

---

## Metodi di Object

- public String toString()
- Restituisce una rappresentazione stampabile dell’oggetto
- L’implementazione base fornita indica il nome della classe seguita dal riferimento relativo all’oggetto (java.lang.Object@10878cd)
- public int hashCode()
- Restituisce un valore intero legato al contenuto dell’oggetto
- Se i dati nell’oggetto cambiano, deve restituire un valore differente
- Oggetti “uguali” devono restituire lo stesso valore, oggetti diversi possono restituire valori diversi 
- Utilizzato per realizzare tabelle hash

---

## Controllare l’ereditarietà

- In alcuni casi, si vuole impedire esplicitamente l’utilizzo della tecnica del polimorfismo
- Ad esempio, per motivi di sicurezza o per garantire il mantenimento di una data proprietà del sistema
- Si utilizza la parola chiave “final”
- Un metodo “final” non può essere ridefinito da una sottoclasse
- Una classe “final” non può avere sottoclassi
- Un attributo “final” non può essere modificato
- Non c’entra nulla con l’ereditarietà!

---

## Controllare l’ereditarietà

- In altri casi si vuole obbligare l’utilizzo del polimorfismo
- Si introducono metodi privi di implementazione
- Facendoli precedere dalla parola chiave “abstract”
- Una classe che contiene metodi astratti
- Deve essere, a sua volta, dichiarata abstract
- Non può essere istanziata direttamente
- Occorre definire una sottoclasse che fornisca l’implementazione dei metodi mancanti

---

## Classi astratte

- Interfacce
- Una classe astratta può contenere metodi non astratti
- A beneficio delle proprie sottoclassi
- In alcuni casi, si vogliono definire metodi astratti senza vincolare la gerarchia di ereditarietà delle classi che li implementeranno
- Si utilizzano le interfacce:
- Insiemi di metodi astratti e costanti (attributi static final)
- Pubblici per definizione
- Una classe può implementare un’interfaccia
- Fornendo il codice relativo a tutti i metodi dichiarati nell’interfaccia

---

## Interfacce e tipi

- Analogamente alle classi, ogni interfaccia definisce un tipo
- Un oggetto che implementa una data interfaccia ha come tipo anche il tipo dell’interfaccia 
- Un oggetto può implementare molte interfacce
- Di conseguenza può avere molti tipi
- Si può verificare se un oggetto ha un dato tipo con l’operatore “instanceof”
- if (myObject instanceof Comparable) …

---

## Interfacce vuote

- Alcune interfacce non hanno metodi
- Servono solo come “marcatori” o indicatori di tipo
- Indicano che gli oggetti delle classi che le implementano godono di qualche proprietà

---



---

## Percorso

- Eventi eccezionali
- Identificazione, 
- descrizione e 
- segnalazione
- Eccezioni in Java
- I meccanismi offerti
- Le classi principali
- Modellare le eccezioni

---

## Affidabilità di un programma

- Un programma esegue una sequenza di operazioni su un calcolatore
- Alcune direttamente, altre attraverso le funzionalità offerte dal sistema operativo
- Talvolta qualche operazione non può essere effettuata
- Il programma deve accorgersene e reagire di conseguenza

---



---

## Le ragioni del fallimento

- Mancanza di risorse
- Memoria esaurita, disco pieno, autorizzazioni insufficienti, …
- Parametri errati
- Divisione per 0, riferimenti a risorse inesistenti (file, URL), …
- Sequenza illecita di operazioni
- Utilizzo di riferimenti nulli, scrittura su file 
- chiuso, …

---


## Le ragioni del fallimento

- Alcune dipendono dal programmatore
- Altre, dal contesto di esecuzione
- In ogni caso, quando si rileva un’anomalia
- Non è possibile concludere l’operazione in corso
- Il programma, nel suo complesso, viene a trovarsi in uno stato incoerente
- Per garantire l’affidabilità del sistema, occorre mettere in atto una strategia di rilevazione e gestione delle eccezioni

---

## Strategie

- Tutte le operazioni che possono fallire, devono indicare:
- Se sono terminate con successo o meno
- L’eventuale anomalia riscontrata
- Alcuni linguaggi si basano su valori di ritorno
- Occorre verificarli
- Il diagramma di flusso si complica notevolmente
- Se si omette un test, si compromette la capacità di valutare l’integrità del sistema

---


## Semplice procedura:

- Tre operazioni 
- in successione
- Ciascuna può fallire

---

## Complessità

- Rapidamente, il codice associato ad una procedura semplice diventa ingestibile
- La reazione comune consiste nell’omettere i test
- Cosa fare quando si rileva un malfunzionamento?

---


## Contesto

- Spesso, ci si accorge dei fallimenti all’interno di procedure generiche
- Non si sa quali contromisure prendere
- Occorrerebbe segnalare il malfunzionamento al chiamante
- Fornendo la descrizione più accurata possibile di quanto successo
- Il chiamante può gestire l’eccezione o rimandarne la gestione al proprio chiamante, ricorsivamente…

---

## La risposta di Java

- Un’insieme di classi per modellare l’anomalia riscontrata
- Fa capo alla classe Throwable
- Meccanismi per
- Segnalare
- Gestire
- Propagare
	un’anomalia, attraverso la catena di invocazione dei metodi

---


## Sintassi

- Un metodo che può fallire deve segnalarlo nella propria dichiarazione
- Attraverso la parola chiave “throws”
- Seguita dal tipo (o dai tipi) di eccezione che si può verificare durante l’esecuzione
- Chi invoca tale metodo deve:
- Cercare di gestire la possibile anomalia attraverso il costrutto “try” / “catch”
- Oppure, segnalare che a propria volta può generare la stessa anomalia: l’eccezione si propaga al chiamante del chiamante

---

## Try/Catch

- Costrutto utilizzato per il controllo delle eccezioni
- Isola le parti di codice che possono provocare anomalie

---

## Try/Catch

È possibile reagire in modo differente a tipi diversi di eccezioni mettendo più clausole “catch” in sequenza
- Avendo cura di indicare dapprima le anomalie più specifiche

---


## La clausola “finally”

- finally indica le istruzioni che devono essere eseguite comunque
- Tanto nel caso in cui il codice controllato sia stato eseguito correttamente
- Quanto nel caso in cui si sia verificata un’eccezione

---

## Problemi

- Il codice del blocco catch selezionato dovrebbe ripristinare la coerenza nel sistema
- Non è detto sia possibile!
È possibile che si verifichi un’eccezione durante l’esecuzione del blocco catch
- Può dare origine ad una struttura di programmazione alquanto complessa
- Può essere indice di cattiva progettazione

---


## Gestire le eccezioni

- Stampare un messaggio di errore
- Non risolve nulla, ma aiuta il debugging
- Generare una nuova eccezione
- Permette di aggiungere informazioni sul contesto in cui si è verificata l’anomalia originale
- Rilanciare la stessa eccezione
- Avendo compiuto qualche azione a margine 
- Correggere l’anomalia…
...e riprovare l’azione 
- Facendo attenzione ai cicli infiniti
- Ripristinare uno stato precedente…
…disfacendo eventuali azioni non terminate (rollback)
- Gestire le eccezioni
- Interrompere l’esecuzione
- Disastro irreparabile!
- Gestire le eccezioni
- Non fare nulla
- La peggior scelta possibile!
- Da non fare mai

---


## Modellare le eccezioni

- Java prevede che un’anomalia sia descritta da un oggetto di tipo Throwable
- Classe radice della gerarchia delle eccezioni
- Offre vari metodi per la gestione dell’anomalia
- Le sue sottoclassi modellano diversi tipi di malfunzionamenti

---

## La classe Throwable

- String getMessage()
- Restituisce la stringa che descrive l’anomalia
- Inizializzata nel costruttore a partire da un parametro
- void printStackTrace()
- Stampa la posizione in cui si è verificata l’eccezione e la sequenza dei metodi chiamanti ad essa relativi
- Riporta anche, se disponibili, i riferimenti alle righe, nei file sorgente, in cui si sono verificate le successive invocazioni

---

## Tipologie di anomalie

- Errori della macchina virtuale
- Fanno capo alla classe Error
- Non possono essere recuperati 
- Memoria esaurita, stack overflow, …
- Errori di programma
- Fanno capo alla classe Exception
- Per lo più, devono essere gestiti in modo esplicito, dichiarandone l’eventualità nei metodi che li possono generare e utilizzando costrutti di tipo “try”
- Alcuni possono capitare pressoché sempre (RuntimeException): non occorre dichiarare esplicitamente la possibilità che si verifichino

---


## Gerarchia delle eccezioni

- Definire nuove eccezioni
È possibile creare classi di eccezioni personalizzate
- Spesso non contengono nessun metodo né attributo
- Di solito, hanno un costruttore anonimo, che associa all’oggetto una descrizione generica ed un costruttore che accetta una stringa, che permette di dettagliare l’anomalia verificatasi

---


## Argomenti della lezione

- Flussi di dati
- Lettura e scrittura
- Interagire con 
- il file system
- File ad accesso 
- casuale

---

## Flussi di dati

- Sequenze continue e monodirezionali di informazioni che transitano da un’entità ad un’altra
- Attraverso un flusso possono scorrere dati di qualsiasi tipo:
- Omogenei / eterogenei
- Semplici / composti
- Un programma costituisce la sorgente o la destinazione di un flusso
- L’altra estremità può essere un altro programma, il disco, lo schermo o la tastiera, …

---

## Classi Java per I/O

- Modellano l’interazione di un programma con flussi dati
- Ingresso o uscita
- Binari o testuali 
- Organizzate in una struttura di ereditarietà
- Le sottoclassi estendono e specializzano le funzionalità base
- Fanno capo al package java.io

---

## Struttura generale

- InputStream
- Modella le operazioni di lettura da un flusso binario
- Opera su sequenze di byte
- Classe astratta
- Offre metodi per leggere i singoli byte
- Tutti i metodi possono lanciare IOException

---

## Metodi principali

- int read()
- Attende il prossimo byte, dopodiché ne restituisce il valore (0-255)
- Ritorna -1 se il flusso è terminato
- int available()
- Ritorna il numero di byte leggibili senza attesa

---

## Metodi principali

- long skip(long n)
- Scarta i prossimi “n” byte dal flusso, se esistono
- Ritorna il numero di caratteri scartati
- void close()
- Chiude il flusso e rilascia le risorse di sistema associate
- Occorre ricordarsi di chiamarlo!

---

## Sorgenti

- InputStream offre funzionalità minimali:
- Non indica da dove provengano i dati letti
- Sottoclassi “sorgente”
- Modellano la lettura di byte da supporti specifici
- File, array di byte, StringBuffer, …

---

## FileInputStream

- Permette di leggere il contenuto di un file
- Parametro del costruttore
- Deve esistere ed essere leggibile
- Lettura sequenziale
- Dall’inizio alla fine

---

## Filtri

- InputStream offre funzionalità minimali:
- Permette solo di leggere byte
- Classi “filtro”
- Arricchiscono le funzionalità o le prestazioni, interponendosi ad altre sorgenti o filtri

---

## Classi filtro

- Richiedono un InputStream da cui prelevare i dati
- Deve essere passato nel costruttore
- Trasformano i dati letti da tale flusso
- Conversione di formato, memoria tampone, reinserimento, …

---



---

## Composizione

- Il meccanismo dei filtri è molto flessibile
- Più filtri possono essere concatenati (in che ordine?)
- Si possono costruire oggetti con tutte e sole le funzionalità richieste

---

## Gerarchia di ereditarietà

- OutputStream
- Modella le operazioni di scrittura su un flusso binario
- Classe astratta
- Offre metodi per scrivere i singoli byte
- Tutti i metodi possono lanciare IOException

---

## Metodi principali

- void write(int b)
- Scrive il valore b (troncato ad 8 bit) sul flusso
- void flush()
- Forza l’invio effettivo di byte temporaneamente accodati all’interno dell’oggetto
- void close()
- Chiude il flusso e rilascia le risorse di sistema associate
- Una volta chiuso, il flusso non può essere riaperto né può ricevere ulteriori dati
- Occorre ricordarsi di chiamarlo

---

## Destinazioni

- Anche OutputStream offre funzionalità minimali:
- Non indica dove scrivere i dati letti
- Sottoclassi “destinazione”
- Modellano la scrittura di byte su supporti specifici
- File, array di byte, …

---

## FileOutputStream

- Permette di scrivere un file
- Parametro del costruttore
- Può non esistere
- Occorre poterlo creare / modificare (diritto di scrittura)
- Scrittura sequenziale
- Dall’inizio alla fine
- Il contenuto precedente viene cancellato

---

## Filtri

- Insieme di classi che estendono le capacità di OutputStream
- Inserimento di un buffer
- Scrittura di dati elmentari ed oggetti
- Scrittura di sequenze di caratteri ASCII

---

## Gerarchia di ereditarietà

- Reader & Writer
- Classi duali di InputStream e OutputStream
- Modellano operazioni su flussi di caratteri UNICODE
- Classi astratte
- Rispetto ai flussi binari, cambiano i tipi dei parametri

---

## Codifica dei caratteri

- Un carattere UNICODE è rappresentato su 16 bit
- Esistono vari modi per trasformarlo in una sequenza di byte
- InputStreamReader e OutputStreamWriter hanno, all’interno, il codice necessario alla conversione in byte
- Nel costruttore si può indicare la codifica da adottare

---

## Leggere da console

- La classe File
- Modella il nome di file e cartelle in modo indipendente dal sistema operativo:
- Il file corrispondente può non esistere
- Permette di creare, cancellare, rinominare, … file e cartelle

---

## Creazione e cancellazione

- boolean createNewFile();
- boolean mkdir();
- boolean renameTo(File dest);
- boolean delete();
- void deleteOnExit();

---


## Proprietà di un file

- boolean canRead();
- boolean canWrite();
- boolean isDirectory();
- boolean isFile();
- File getParentFile();
- long length();
- String[] list();

---

## Ulteriori funzionalità

- static File[] listRoots();
- Elenca le possibili radici del filesystem corrente (“a:”, “c:”, …)
- static String separator;
- Indica il carattere che separa il nome di cartelle e file (‘\’ o ‘/’)

---

## File ad accesso casuale

- In alcune situazioni occorre operare su un file, procedendo in modo non sequenziale
- Lettura e scrittura possono avvenire in qualsiasi posizione del file
- indipendentemente dall’operazione precedente
- La classe RandomAccessFile modella il file come fosse un array di byte
- Memorizzato su disco, invece che in memoria
- Mantiene un puntatore di posizione interno che tiene traccia del prossimo byte a cui accedere
- Modificabile dal programmatore
È possibile operare sia in lettura che in scrittura
- Si specifica in fase di costruzione

---

## Operare in lettura

- void seek(long pos)
- Posiziona il puntatore interno a pos byte dall’inizio del file
- long getFilePointer( )
- Restituisce la posizione corrente del puntatore interno rispetto all’inizio del file
- String readLine( )
- Legge una sequenza di caratteri ASCII terminata da newline e la converte in formato Unicode
- String readUTF( )
- Legge una sequenza di caratteri Unicode codificati nel formato UTF-8 (che contiene la lunghezza della stringa)
- Altri metodi dell’interfaccia DataInput
- Permettono di leggere tipi elementari (numeri interi, numeri in virgola mobile, caratteri e booleani)

---

## Operare in scrittura

- void writeBytes(String s)
- Scrive la sequenza di byte meno significativi corrispondenti ai caratteri contenuti in “s”
- void writeChars(String s)
- Scrive la sequenza di caratteri (due byte ciascuno) contenuti in “s”
- void writeUTF(String s)
- Scrive la rappresentazione della stringa “s” nel formato UTF-8
- Altri metodi dell’interfaccia DataOutput
- Permettono la scrittura di dati elementari