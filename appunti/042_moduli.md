# Moduli

In Java, i moduli sono una caratteristica introdotta a partire da Java 9 per migliorare la modularità e l'organizzazione del codice. Consentono di organizzare le classi e i pacchetti in unità logiche più grandi chiamate moduli. Questi moduli possono essere definiti all'interno di un'applicazione Java utilizzando un file speciale chiamato `module-info.java`.

Ecco una spiegazione più dettagliata dei moduli in Java:

1. **Moduli**: Un modulo è una collezione logica di classi e pacchetti che formano un'unità funzionale separata all'interno di un'applicazione Java. I moduli consentono di definire le dipendenze tra i moduli stessi, in modo che l'applicazione possa essere suddivisa in componenti più gestibili.

2. **File `module-info.java`**: Ogni modulo è definito all'interno di un file chiamato `module-info.java`. Questo file viene collocato nella radice del modulo e contiene le informazioni chiave sul modulo, come il suo nome, le dipendenze da altri moduli e quali pacchetti espone o nasconde.

3. **Esportazione e Apertura dei Pacchetti**: Il file `module-info.java` può specificare quali pacchetti del modulo sono esportati e quindi accessibili da altri moduli. Può anche specificare pacchetti che sono aperti per la riflessione, consentendo l'accesso ai loro membri da parte di altri moduli.

4. **Dipendenze tra Moduli**: Un modulo può dichiarare le sue dipendenze da altri moduli nel file `module-info.java`. Questo garantisce che i moduli dipendenti abbiano accesso ai pacchetti esportati dal modulo dipendente.

5. **Classpath vs. Modulo Path**: In Java, è possibile eseguire un'applicazione utilizzando il classpath tradizionale o il modulo path introdotto con i moduli. L'uso dei moduli path offre un migliore isolamento tra i moduli e un controllo più rigoroso sulle dipendenze.

Ecco un esempio semplice di un file `module-info.java`:

```java
module mioModulo {
    requires altroModulo;
    exports com.mioModulo.pacchetto;
    opens com.mioModulo.pacchetto.reflection;
}
```

In questo esempio:

- Il modulo `mioModulo` richiede il modulo `altroModulo`.
- Il modulo `mioModulo` esporta il pacchetto `com.mioModulo.pacchetto` in modo che altri moduli possano accedervi.
- Il pacchetto `com.mioModulo.pacchetto.reflection` è aperto per la riflessione.

L'introduzione dei moduli in Java è stata una risposta alla necessità di creare applicazioni più modulari e di gestire meglio le dipendenze tra le librerie. Ciò aiuta a migliorare la manutenibilità e la sicurezza delle applicazioni Java.


---

Un modulo è un gruppo di pacchetti e risorse strettamente correlati insieme a un nuovo file descrittore del modulo.

In altre parole, è un'astrazione "pacchetto di pacchetti Java" che ci permette di rendere il nostro codice ancora più riutilizzabile.

---

## pacchetti

I pacchetti all'interno di un modulo sono identici ai pacchetti Java che abbiamo utilizzato sin dall'inizio di Java.

Quando creiamo un modulo, organizziamo il codice internamente in pacchetti proprio come abbiamo fatto in precedenza con qualsiasi altro progetto.

Oltre a organizzare il nostro codice, i pacchetti vengono utilizzati per determinare quale codice è pubblicamente accessibile al di fuori del modulo.

---

## Risorse

Ogni modulo è responsabile delle proprie risorse, come i file multimediali o di configurazione.

In precedenza, mettevamo tutte le risorse nel livello principale del nostro progetto e gestivamo manualmente quali risorse appartenevano a parti diverse dell'applicazione.

Con i moduli, possiamo spedire immagini e file XML richiesti con il modulo che ne ha bisogno, rendendo i nostri progetti molto più facili da gestire.

---

## Descrittore del modulo

Quando creiamo un modulo, includiamo un file descrittore che definisce diversi aspetti del nostro nuovo modulo:

* Nome: il nome del nostro modulo
* Dipendenze: un elenco di altri moduli da cui dipende questo modulo
* Pacchetti pubblici: un elenco di tutti i pacchetti che vogliamo accessibili dall'esterno del modulo
* Servizi offerti: possiamo fornire implementazioni di servizi che possono essere utilizzate da altri moduli
* Servizi consumati: consente al modulo corrente di essere un consumatore di un servizio
* Autorizzazioni di _reflection_: consente esplicitamente ad altre classi di utilizzare la _reflection_ per accedere ai membri privati ​​di un pacchetto

Le regole di denominazione dei moduli sono simili a come denominiamo i pacchetti (i punti sono consentiti, i trattini no). È molto comune fare nomi in stile progetto (mio.modulo) o Reverse-DNS (it.bogliaccino.miomodulo).

Dobbiamo elencare tutti i pacchetti che vogliamo che siano pubblici perché per impostazione predefinita tutti i pacchetti sono privati ​​del modulo.

Lo stesso vale per la _reflection_. Per impostazione predefinita, non possiamo usare la _reflection_ sulle classi che importiamo da un altro modulo.

Più avanti nell'articolo, vedremo esempi di come utilizzare il file descrittore del modulo.

---

## Tipi di modulo

Esistono **quattro** tipi di moduli nel nuovo sistema di moduli:

* **Moduli di sistema** - Questi sono i moduli elencati quando eseguiamo il comando list-modules sopra. Includono i moduli Java SE e JDK.
* **Moduli dell'applicazione**: questi moduli sono ciò che di solito vogliamo creare quando decidiamo di utilizzare i moduli. Sono denominati e definiti nel file module-info.class compilato incluso nel JAR assemblato.
* **Moduli automatici**: possiamo includere moduli non ufficiali aggiungendo file JAR esistenti al percorso del modulo. Il nome del modulo sarà derivato dal nome del JAR. I moduli automatici avranno pieno accesso in lettura a ogni altro modulo caricato dal percorso.
* **Modulo senza nome**: quando una classe o un JAR viene caricata nel percorso di classe, ma non nel percorso del modulo, viene automaticamente aggiunto al modulo senza nome. È un modulo generico per mantenere la compatibilità con le versioni precedenti del codice Java scritto in precedenza.

---

## Distribuzione

I moduli possono essere distribuiti in due modi: come file JAR o come progetto compilato "esploso". Questo, ovviamente, è uguale a qualsiasi altro progetto Java, quindi non dovrebbe sorprendere.

Possiamo creare progetti multi-modulo composti da una “applicazione principale” e diversi moduli di libreria.

Dobbiamo stare attenti però perché possiamo avere solo un modulo per file JAR.

Quando impostiamo il nostro file di build, dobbiamo assicurarci di raggruppare ogni modulo nel nostro progetto come un jar separato.

---

### Moduli predefiniti

Quando installiamo Java 9, possiamo vedere che JDK ora ha una nuova struttura.

Hanno preso tutti i pacchetti originali e li hanno spostati nel nuovo sistema di moduli.

Possiamo vedere cosa sono questi moduli digitando nella riga di comando:

`java --list-modules`

Questi moduli sono suddivisi in quattro gruppi principali: java, javafx, jdk e Oracle.

I moduli java sono le classi di implementazione per la specifica del linguaggio SE principale.

I moduli javafx sono le librerie dell'interfaccia utente FX.

Tutto ciò che serve al JDK stesso è conservato nei moduli jdk.

Infine, tutto ciò che è specifico di Oracle è nei moduli Oracle.

---

## Dichiarazioni del modulo

Per impostare un modulo, abbiamo bisogno di mettere un file speciale alla radice dei nostri pacchetti chiamato `module-info.java`

Questo file è noto come descrittore del modulo e contiene tutti i dati necessari per creare e utilizzare il nostro nuovo modulo.

Costruiamo il modulo con una dichiarazione il cui corpo è vuoto o composto da direttive del modulo:

```java
module myModuleName {
// tutte le direttive sono facoltative
}
```

Iniziamo la dichiarazione del modulo con la parola chiave module seguita dal nome del modulo.

Il modulo funzionerà con questa dichiarazione, ma normalmente avremo bisogno di più informazioni.

È qui che entrano in gioco le direttive del modulo.

[leggi tutto](https://www.baeldung.com/java-9-modularity)

---

### require

La nostra prima direttiva è necessaria. Questa direttiva del modulo ci consente di dichiarare le dipendenze del modulo:

```java
module mio.modulo {
require modulo.nome;
}
```

Ora, mio.modulo ha sia una dipendenza runtime che una dipendenza in fase di compilazione da modulo.nome.

E tutti i tipi pubblici esportati da una dipendenza sono accessibili dal nostro modulo quando usiamo questa direttiva.

---

### require statico

A volte scriviamo codice che fa riferimento a un altro modulo, ma che gli utenti della nostra libreria non vorranno mai usare.

Ad esempio, potremmo scrivere una funzione di utilità che stampi abbastanza il nostro stato interno quando è presente un altro modulo di registrazione. Ma non tutti i consumatori della nostra libreria vorranno questa funzionalità e non vogliono includere una libreria di registrazione aggiuntiva.

In questi casi, vogliamo utilizzare una dipendenza opzionale. Utilizzando la direttiva require static, creiamo una dipendenza solo in fase di compilazione:

```java
module mio.modulo {
require statico modulo.nome;
}
```

---

### require Transitive

Di solito lavoriamo con le biblioteche per semplificarci la vita.

Tuttavia, dobbiamo assicurarci che qualsiasi modulo che introduce il nostro codice introduca anche queste dipendenze "transitive" aggiuntive o non funzionerà.

Fortunatamente, possiamo utilizzare la direttiva transitiva richiede per costringere qualsiasi consumatore a valle a leggere anche le nostre dipendenze richieste:

```java
module mio.modulo {
require transitivo modulo.nome;
}
```

Ora, quando uno sviluppatore richiede mio.modulo, non dovrà anche dire richiede modulo.nome affinché il nostro modulo funzioni ancora.

---

### Esportazioni

Per impostazione predefinita, un modulo non espone nessuna delle sue API ad altri moduli. Questo forte incapsulamento è stato uno dei motivi principali per la creazione del sistema di moduli in primo luogo.

Il nostro codice è significativamente più sicuro, ma ora dobbiamo aprire esplicitamente la nostra API al mondo intero se vogliamo che sia utilizzabile.

Usiamo la direttiva export per esporre tutti i membri pubblici del pacchetto denominato:

```java
module mio.modulo {
esporta com.my.package.name;
}
```

Ora, quando qualcuno richiede mio.modulo, avrà accesso ai tipi pubblici nel nostro pacchetto com.my.package.name, ma non a qualsiasi altro pacchetto.

---

### Esportazioni ... in

Possiamo usare le esportazioni ... per aprire le nostre classi pubbliche al mondo.

Ma cosa succede se non vogliamo che il mondo intero acceda alla nostra API?

Possiamo limitare quali moduli hanno accesso alle nostre API utilizzando le esportazioni ... alla direttiva.

Analogamente alla direttiva sulle esportazioni, dichiariamo un pacchetto come esportato. Ma elenchiamo anche quali moduli stiamo consentendo di importare questo pacchetto come richiesto. Vediamo come appare:

```java
module mio.modulo {
esporta com.my.package.name in com.specific.package;
}
```

---

### uses

Un servizio è un'implementazione di un'interfaccia specifica o di una classe astratta che può essere utilizzata da altre classi.

Designiamo i servizi che il nostro modulo consuma con la direttiva uses.

Nota che il nome della classe che usiamo è l'interfaccia o la classe astratta del servizio, non la classe di implementazione:

```java
module mio.modulo {
uses class.name;
}
```

Dovremmo notare qui che c'è una differenza tra una direttiva require e la direttiva uses.

Potremmo richiedere un modulo che fornisce un servizio che vogliamo utilizzare, ma quel servizio implementa un'interfaccia da una delle sue dipendenze transitive.

Invece di forzare il nostro modulo a richiedere tutte le dipendenze transitive per ogni evenienza, usiamo la direttiva uses per aggiungere l'interfaccia richiesta al percorso del modulo.

[leggi tutto](https://www.baeldung.com/java-9-modularity)