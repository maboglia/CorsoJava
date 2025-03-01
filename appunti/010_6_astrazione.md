# Astrazione 

* L'astrazione è uno dei concetti fondamentali di OOP.
* L'astrazione è il concetto di esporre all'utente solo quelle cose che sono rilevanti per lui e nascondere il resto dei dettagli.
* L'astrazione consente all'utente di concentrarsi su ciò che fa l'applicazione invece che su come lo fa.
* L'astrazione si ottiene in Java tramite classi e interfacce astratte.

---

L'astrazione è uno dei principali concetti OOP che si sforzano di rendere le cose il più semplici possibile per l'utente. In altre parole, l'astrazione espone l'utente solo alle cose che sono rilevanti per lui e nasconde il resto dei dettagli. In termini OOP, diciamo che un oggetto dovrebbe esporre ai suoi utenti solo un insieme di operazioni di alto livello, mentre l'implementazione interna di tali operazioni è nascosta. 

---

Quindi, l'astrazione consente all'utente di concentrarsi su ciò che fa l'applicazione invece che su come lo fa. In questo modo, l'astrazione riduce la complessità dell'esposizione delle cose, aumenta la riusabilità del codice, evita le duplicazioni del codice e sostiene un basso accoppiamento e un'elevata coesione. Inoltre, mantiene la sicurezza e la discrezione dell'applicazione esponendo solo i dettagli importanti.

---

## In ingegneria del software

Nell'ingegneria del software e nell'informatica, l'astrazione è:

Il processo di rimozione o generalizzazione di dettagli o attributi fisici, spaziali o temporali nello studio di oggetti o sistemi per focalizzare l'attenzione su dettagli di maggiore importanza; è di natura simile al processo di generalizzazione;

la creazione di oggetti-concetto astratti rispecchiando caratteristiche o attributi comuni di vari oggetti o sistemi di studio non astratti – il risultato del processo di astrazione.

---

## Modellare la realtà

L'astrazione, in generale, è un concetto fondamentale nell'informatica e nello sviluppo del software. Il processo di astrazione può anche essere definito modellazione ed è strettamente correlato ai concetti di teoria e progettazione. I modelli possono anche essere considerati tipi di astrazioni per la loro generalizzazione di aspetti della realtà.

---

L'astrazione in informatica è strettamente correlata all'astrazione in matematica a causa della loro comune attenzione alla costruzione di astrazioni come oggetti, ma è anche correlata ad altre nozioni di astrazione utilizzate in altri campi come l'arte.

---

La pratica consiste nel presentare il sistema, ad esempio un pezzo di codice sorgente o uno scambio di trasmissioni di dati, in maniera ridotta ai soli dettagli considerati essenziali all'interesse specifico, ad esempio raggruppando il codice in una funzione o formalizzando un protocollo di comunicazione.

---

## Codice astratto

Astrazione indica anche quanto il codice scritto in un linguaggio di programmazione si distacca dalle istruzioni in linguaggio macchina che ad esso corrisponderanno dopo l'operazione di compilazione. 

---

Delle istruzioni scritte in Java, per esempio, sono molto più vicine al linguaggio comprensibile all'uomo piuttosto che a quello comprensibile dalla macchina (alto livello di astrazione). 

---

Viceversa delle istruzioni scritte in Assembly sono abbastanza vicine (ma non uguali) alle istruzioni in formato comprensibile alla macchina (basso livello di astrazione).

---

La seguente definizione di astrazione aiuta a capire come questo termine viene applicato all'informatica:

    «Astrazione - Un concetto o un'idea non associata a nessuna istanza specifica.»

---

## Astrazione matematica

Il concetto è originato mediante l'analogia con l'astrazione in matematica. La tecnica matematica dell'astrazione comincia con definizioni matematiche; Ad esempio, sia in Informatica che in Matematica i numeri sono concetti nei linguaggi di programmazione. I dettagli dell'implementazione dipendono dall'hardware e dal software, ma non è una restrizione, poiché il concetto di numero in Informatica è ancora basato sul concetto matematico.

Le astrazioni possono anche riferirsi a oggetti e sistemi del mondo reale, regole di sistemi computazionali o regole di linguaggi di programmazione che portano o utilizzano caratteristiche dell'astrazione stessa, come:

---

l'utilizzo di tipi di dati per eseguire l'astrazione dei dati per separare l'utilizzo dalle rappresentazioni funzionanti delle strutture di dati all'interno dei programmi;

---

il concetto di procedure, funzioni o subroutine che rappresentano una specifica dell'implementazione del flusso di controllo nei programmi;
le regole comunemente denominate "astrazione" che generalizzano le espressioni utilizzando variabili libere e vincolate nelle varie versioni del calcolo lambda;

---

il processo di riorganizzazione del comportamento comune da classi non astratte in "classi astratte" utilizzando l'ereditarietà per astrarre su sottoclassi come si vede nei linguaggi di programmazione C++ e Java orientati agli oggetti.

---

## Strutture di controllo e strutture dati

In programmazione, l'astrazione può essere applicata a strutture di controllo o a strutture di dati.

* L'astrazione di strutture di controllo implica l'uso di sottoprogrammi e di altri concetti relativi a queste.
* Le strutture di dati astratte permettono di maneggiare i dati in maniere significanti.

---

Il fatto che i programmatori utilizzino le astrazioni quando possibile per evitare duplicazioni (solitamente di codice) è noto come principio di astrazione.

---

## Astrazione nella programmazione orientata agli oggetti

Nella teoria della programmazione orientata agli oggetti, l'astrazione implica la possibilità di definire oggetti che rappresentano "attori" astratti che possono eseguire lavori, riferire e cambiare il loro stato e "comunicare" con altri oggetti nel sistema. Il termine incapsulamento si riferisce all'occultamento dei dettagli dello stato, ma l'estensione del concetto di tipo di dati dai linguaggi di programmazione precedenti per associare il comportamento in modo più forte ai dati e standardizzare il modo in cui interagiscono diversi tipi di dati è l'inizio dell'astrazione.

---

Quando l'astrazione procede nelle operazioni definite, consentendo la sostituzione di oggetti di tipo diverso, si parla di **polimorfismo**. Quando si procede in direzione opposta, all'interno dei tipi o delle classi, strutturandoli per semplificare un insieme complesso di relazioni, si parla di delega o **ereditarietà**.

---

Vari linguaggi di programmazione orientati agli oggetti offrono strutture simili per l'astrazione, il tutto per supportare una strategia generale di polimorfismo nella programmazione orientata agli oggetti, che include la sostituzione di un tipo con un altro nello stesso ruolo o simile.

---

## ADT

Un Tipo di Dato Astratto o Abstract Data Type - ADT è, per definizione, un nuovo tipo di dato che estende i tipi nativi forniti dal linguaggio di programmazione. Un ADT è caratterizzato da un insieme di:

* dati;
* operazioni che agiscono sui dati, leggengoli/scrivendoli;

---

Anche i linguaggi procedurali, come per esempio C, consentono di definire un ADT.
Ma, mentre per tali linguaggi chiunque può avere accesso ai dati e modificarli, i linguaggi Object Oriented ne garantiscono la loro
riservatezza.

---

La classe consente di implementare gli ADT attraverso il meccanismo di incapsulamento: 
i dati devono rimanere privati insieme all’implementazione e solo l’interfaccia delle operazioni è resa pubblica all’esterno della classe.

---

Questo approccio è fondamentale per garantire che nessuno possa accedere alle informazioni della classe e quindi, dal punto di vista del programmatore, è una garanzia per non fare errori nella stesura del codice
Quindi una classe implementa un ADT (un sinonimo di classe è proprio tipo) attraverso il meccanismo di incapsulamento.

---

## La classe

La descrizione di una classe deve elencare:

* i dati (o attributi): contengono le informazioni di un oggetto;
* le operazioni (o metodi): consentono di leggere/scrivere gli attributi di un oggetto;

Quando si scrive una applicazione è buona norma iniziare con la progettazione
dell’applicazione stessa:

* identificare le classi;
* identificare le funzionalità di queste classi;
* trovare le relazioni fra le classi;

---

## L’oggetto

Per definizione, diciamo che un oggetto è una istanza di una classe. Quindi un
oggetto deve essere conforme alla descrizione di una classe.

Un oggetto pertanto è contraddistinto da:

1. attributi;
2. metodi;
3. identità;

---

[esempi classi](https://github.com/maboglia/CorsoJava/blob/master/esempi/05_OOP/)
