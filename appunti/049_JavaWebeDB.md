# Java Servlets

## Introduzione alle Servlet

Le servlet sono speciali classi Java progettate per essere eseguite su server web appositamente configurati, noti come servlet containers. Esse sono accessibili come risorse web standard grazie a una URL specifica. Il loro funzionamento si basa sulla modalità tradizionale di richiesta e risposta (request/response) nel contesto dello scripting lato server. Quando un utente richiede una servlet tramite la URL associata, il server attiva la servlet, la esegue e restituisce il risultato come contenuto della risorsa.

Le API delle servlet in Java consentono di sviluppare in modo indipendente dalle caratteristiche specifiche del server, del client e del protocollo di trasferimento. Il codice delle servlet è scritto in Java standard e può sfruttare tutte le librerie e le utilità del linguaggio, inclusa la connessione a database tramite JDBC, l'uso di XML tramite JAXP, e altro ancora. Le servlet rappresentano un avanzamento rispetto ai classici CGI, offrendo un alto livello di sicurezza, versatilità e astrazione per il programmatore.

## Dove e Come Eseguire una Servlet

Per eseguire una servlet, è necessario avere un server in grado di fungere da container, fornendo il supporto necessario per l'attivazione ed esecuzione delle servlet. Tra i server più utilizzati a tale scopo nel mondo gratuito ci sono Tomcat (Apache group) e JBoss.

Mentre il tradizionale server Apache non è progettato per ospitare servlet, è possibile integrarlo con un'installazione di Tomcat mediante un opportuno connettore. Il requisito essenziale per l'esecuzione di questi server è la presenza di una valida installazione di Java (spesso è sufficiente anche la Standard Edition).

## Configurazione di Apache Tomcat

### Installazione

* Apache Tomcat, disponibile per tutte le piattaforme (essendo esso stesso un programma Java), può essere scaricato dal sito [Tomcat Apache](http://tomcat.apache.org/).
* L'installazione su Windows e Unix è semplificata grazie all'uso di script di installazione completamente automatici.

### Configurazione Iniziale

* Su entrambe le piattaforme, è possibile scegliere di avviare il server come servizio (Windows) o demone (Unix), in automatico o manualmente.
* È essenziale che l'installazione di Java (o preferibilmente del JRE) sia individuabile dallo script di installazione di Tomcat. Per fare ciò, verificare che la variabile di ambiente `JAVA_HOME` sia correttamente impostata.
* Una volta avviato, Tomcat risponde di default alla porta 8080.
* La configurazione del server può essere gestita attraverso un'applicazione web collegandosi a <http://localhost:8080/host-manager/html>.
* È possibile monitorare lo stato delle web application in esecuzione sul server collegandosi a <http://localhost:8080/manager/html>.
* Prima di accedere all'amministrazione, è necessario creare un utente con privilegi amministrativi. Aggiungere la seguente riga al file `conf/tomcat-users.xml`:

  ```xml
  <user username="admin" password="adminadmin" roles="admin,manager"/>
  ```

### Creazione di un Nuovo Contesto

* Le applicazioni web in Tomcat sono eseguite in contesti, ognuno corrispondente a una directory configurata nel server e associata a una URL specifica.
* Per creare manualmente un nuovo contesto, basta creare una sottodirectory nella directory `webapps` di Tomcat, con il nome del contesto.
* Per testare il nuovo contesto, è possibile inserire un file HTML nella directory creata e provare a caricarlo con la URL <http://localhost:8080/PATH/NOMEFILE>, dove "PATH" è il nome del contesto (ad esempio <http://localhost/progetto/index.html>).
* All'interno della directory creata, è necessario organizzare una struttura specifica di sottodirectory e file per rendere completamente funzionale la web application. I principali elementi di questa struttura saranno illustrati di seguito.
* Tuttavia, il metodo consigliato per l'installazione di web application è l'uso di un IDE (come Netbeans) per sviluppare l'applicazione e confezionarla in un file WAR (Web ARchive), che può quindi essere copiato direttamente nella directory `webapps` di Tomcat.

## Struttura di un Contesto in Apache Tomcat

Le directory corrispondenti a un'applicazione web in Tomcat seguono una struttura base che facilita l'accesso alle risorse dinamiche (servlet, JSP) e statiche (HTML, CSS, immagini, ecc.). In particolare:

* La sottodirectory `WEB-INF` contiene alcuni file di configurazione, inclusi il descrittore di distribuzione dell'applicazione web (`web.xml`).
* La sottodirectory `WEB-INF/classes` contiene le classi Java dell'applicazione, comprese le servlet. Le classi vengono organizzate secondo la convenzione dei package Java.
* La sottodirectory `WEB-INF/lib` contiene le librerie JAR necessarie all'applicazione, comprese quelle di terze parti come i driver JDBC.
* Tutte le altre sottodirectory del contesto, compresa la root directory, contengono file normali come pagine HTML, fogli di stile, immagini o pagine JSP.

Configurazione di Apache Tomcat

### Inserimento di una Servlet in un Contesto

Per rendere una classe Java disponibile come risorsa di tipo servlet, è necessario configurarne le caratteristiche tramite un file denominato "web application deployment descriptor". Questo file, chiamato `web.xml`, deve essere posizionato nella directory `WEB-INF` dell'applicazione.

Ecco un esempio semplice del descrittore:

```xml
<?xml version="1.0" encoding="ISO-8859-1"?>
<!DOCTYPE web-app PUBLIC "-//Sun Microsystems, Inc.//DTD Web Application 2.3//EN" "http://java.sun.com/dtd/web-app_2_3.dtd">
<web-app>
    <display-name>Progetto IW</display-name>
    <description>Progetto X</description>

    <!-- Configurazione della servlet -->
    <servlet>
        <servlet-name>Servlet1</servlet-name>
        <servlet-class>example.class1</servlet-class>
        <description>Questa servlet implementa la funzione Y</description>
    </servlet>

    <!-- Mappatura della servlet a una URL -->
    <servlet-mapping>
        <servlet-name>Servlet1</servlet-name>
        <url-pattern>/funzione1</url-pattern>
    </servlet-mapping>

    <!-- Configurazione della sessione -->
    <session-config>
        <session-timeout>30</session-timeout>
    </session-config>
</web-app>
```

L'URL per accedere alla servlet sarà quindi composto come segue: `<http://[indirizzo-server]/[contesto]/[url-pattern]>`

---

## Le Classi Base per le Servlet

Alla base dell'implementazione di una servlet si trova l'interfaccia `Servlet`, la quale è implementata da diverse classi base, tra cui `HttpServlet`. Tutte le servlet create estenderanno quest'ultima. Le altre due classi fondamentali per la creazione di una servlet sono `ServletRequest` e `ServletResponse`.

Un'istanza di `ServletRequest` viene passata dal contesto alla servlet quando questa viene invocata e contiene tutte le informazioni relative alla richiesta effettuata dal client. Queste informazioni includono, ad esempio, i parametri GET e POST inviati dal client, le variabili di ambiente del server, gli header e il payload della richiesta HTTP. Un'istanza di `ServletResponse` viene passata alla servlet quando si richiede di restituire del contenuto da inviare al client. I metodi di questa classe consentono di scrivere su uno stream che verrà poi indirizzato al client, modificare gli header della risposta HTTP, ecc. Altre classi incluse nelle servlet API, di cui non ci occuperemo qui, consentono, ad esempio, la gestione automatica delle sessioni.

---

## Il Ciclo di Vita di una Servlet

Il ciclo di vita di una servlet è scandito da una serie di chiamate effettuate dal container a particolari metodi dell'interfaccia Servlet.

1. **Inizializzazione:** Quando il container carica la servlet, chiama il suo metodo `init`. Tipicamente, questo metodo viene utilizzato per stabilire connessioni a database e preparare il contesto per le richieste successive. A seconda delle impostazioni del contesto e/o del contenitore, la servlet può essere caricata immediatamente all'avvio del server, ad ogni richiesta, ecc.

2. **Servizio:** Le richieste dei client vengono gestite dal container tramite chiamate al metodo `service`. Richieste concorrenti corrispondono a esecuzioni di questo metodo in thread distinti. L'implementazione dovrebbe quindi essere thread-safe. Il metodo `service` riceve le richieste dell'utente sotto forma di una `ServletRequest` e invia la risposta tramite una `ServletResponse`.

3. **Finalizzazione:** Quando il container decide di rimuovere la servlet, chiama il suo metodo `destroy`. Quest'ultimo viene solitamente utilizzato per chiudere connessioni a database o scaricare altre risorse persistenti attivate dal metodo `init`.

La classe `HttpServlet` specializza questo sistema per la comunicazione HTTP, fornendo in particolare due metodi: `doGet` e `doPost`, corrispondenti alle due richieste più comuni in HTTP. Il metodo `service` della classe `HttpServlet` provvede automaticamente a smistare le richieste al metodo opportuno.

## Scrivere una Classe Servlet

Per implementare una semplice servlet, è necessario creare una classe che estenda `javax.servlet.http.HttpServlet`. La logica di funzionamento della servlet va codificata nei metodi corrispondenti al verbo HTTP a cui devono rispondere.

Tutti questi metodi hanno la stessa firma: prendono come argomenti la coppia `(HttpServletRequest, HttpServletResponse)` e restituiscono `void`.

* `doGet` viene chiamato in risposta a richieste GET e HEAD.
* `doPost` viene chiamato in risposta a richieste POST.
* `doPut` viene chiamato in risposta a richieste PUT.
* `doDelete` viene chiamato in risposta a richieste DELETE.

Le classi `HttpServletRequest` e `HttpServletResponse` sono specializzazioni di `ServletRequest` e `ServletResponse` specifiche per il protocollo HTTP. La classe `HttpServlet` fornisce un'implementazione di default di tutti i metodi appena descritti, che si limita a generare un errore 400 (BAD REQUEST). La classe servlet contiene altri metodi utili, come `getServletContext`, tramite il quale si possono leggere molte informazioni sul contesto di esecuzione della servlet stessa.

Per compilare una servlet, è necessario che nel CLASSPATH sia inclusa la libreria che definisce il package javax.servlet. Una copia di questa libreria, chiamata `servlet-api.jar`, è presente nella directory `common/lib` di Tomcat.

### Esempio di una Classe Servlet

```java
package example;

import javax.servlet.*;
import javax.servlet.http.*;

public class ExampleServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        // Logica della servlet per gestire le richieste HTTP GET
        // ...
    }
}
```

Una servlet di base estende la classe `javax.servlet.http.HttpServlet`. Per gestire le richieste HTTP, si sovrascrivono opportunamente i metodi corrispondenti. Nell'esempio sopra, il metodo `doGet` verrà chiamato per gestire le richieste HTTP GET.

## Fornire Informazioni sulla Servlet

È possibile, anche se non obbligatorio, fornire informazioni sulla servlet che possono essere utili per il container o gli sviluppatori.

Le informazioni potrebbero includere dettagli come l'autore e la versione della servlet. A questo scopo, è sufficiente sovrascrivere il metodo `getServletInfo()` dell'interfaccia `Servlet`, che nella sua implementazione di default in `HttpServlet` si limita a restituire `null`. Il metodo non richiede alcun argomento e deve restituire una stringa.

### Esempio

```java
package example;

import javax.servlet.*;
import javax.servlet.http.*;

public class ExampleServlet extends HttpServlet {
    public String getServletInfo() {
        return "Servlet di esempio, versione 1.0";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        // Logica della servlet per gestire le richieste HTTP GET
        // ...
    }
}
```

La stringa restituita da `getServletInfo` verrà utilizzata dal container per fornire informazioni sulla servlet.

## Inizializzare e Finalizzare la Servlet

L'inizializzazione di una servlet avviene nel suo metodo `init`, che ha come parametro un oggetto `ServletConfig`.

La prima cosa che il metodo deve fare è chiamare `super.init()` passandogli il suo parametro `ServletConfig`. Successivamente, è possibile eseguire tutto il codice di inizializzazione necessario, eventualmente impostando campi della classe con dati che verranno utilizzati dai metodi di servizio.

Se la servlet è stata attivata con dei parametri di inizializzazione esterni (che vengono specificati in una maniera dipendente dal container), è possibile leggerli tramite il metodo `getInitParameter` di `HttpServlet`. Questo metodo prende come argomento il nome del parametro e restituisce una stringa.

Se l'inizializzazione incontra dei problemi, è possibile generare un'eccezione (`ServletException`) per segnalarlo al container.

La finalizzazione di una servlet avviene nel suo metodo `destroy`. È necessario sovrascrivere questo metodo solo se esistono effettivamente operazioni da eseguire prima della distruzione della servlet.

## Inizializzare e Finalizzare la Servlet - Esempio

```java
package example;

import javax.servlet.*;
import javax.servlet.http.*;

public class ExampleServlet extends HttpServlet {
    private int parameter1;

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        parameter1 = 1;
    }

    public String getServletInfo() {
        return "Servlet di esempio, versione 1.0";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        // Logica della servlet per gestire le richieste HTTP GET
        // Utilizzo di parameter1 inizializzato nel metodo init
        // ...
    }
}
```

Il metodo `init`, dopo aver chiamato lo stesso metodo della classe superiore, può procedere con l'inizializzazione della servlet. Se ci sono problemi di inizializzazione, viene generata una `ServletException`.

## Leggere la Richiesta - Esempio

```java
package example;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ExampleServlet extends HttpServlet {
    // ...

    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        String parameterValue = request.getParameter("p1");
        // Utilizzo del parametro p1 nella logica della servlet
        // ...
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        try {
            Reader reader = request.getReader();
            // Lettura del payload raw da reader...
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

Nell'esempio, il metodo `doGet` legge il valore del parametro "p1" dalla richiesta HTTP GET utilizzando il metodo `getParameter`. Nel metodo `doPost`, viene aperto uno stream (`Reader`) per leggere il payload raw della richiesta.

## Scrivere la Risposta

I metodi **doGet** e **doPost** possono leggere i parametri interpretati della richiesta tramite `getParameter()` e `getParameterValues()`. `doGet` può leggere la stringa di query in maniera raw chiamando `getQueryString()`. `doPost` può leggere il payload del messaggio in maniera raw tramite gli stream restituiti da `getReader()` (testuale) e `getInputStream()` (binario).

---

## Scrivere la Risposta

L’oggetto **HttpServletResponse** fornito a tutti i metodi di servizio permette di costruire la risposta da inviare al client.

Il metodo `setContentType(String)` permette di dichiarare il tipo restituito (ad esempio “text/xml”). Il metodo `setHeader(String,String)` permette di aggiungere headers alla richiesta. Il metodo `sendRedirect(String)` permette di ridirezionare il browser verso una nuova URL. I metodi `getWriter()` e `getOutputStream()` permettono di aprire un canale, testuale o binario, su cui scrivere il contenuto della risposta. Vanno chiamati dopo aver (eventualmente) impostato il content type e gli altri headers. Altri metodi (che non tratteremo in questa sede) permettono di gestire, ad esempio, i cookie.

---

### Scrivere la Risposta - Esempio

```java
package example;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ExampleServlet extends HttpServlet {
    // ...

    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/xml");
        try {
            Writer writer = response.getWriter();
            writer.write("pippo");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

Nel caso comune in cui si debba restituire dell’XHTML al client, è sufficiente prelevare il **Writer** della response tramite il metodo `getWriter()` e scrivervi sopra tutto il testo da restituire dal browser. Qualunque altro parametro della risposta (in questo caso, il tipo) deve essere impostato prima di richiedere il canale di output.

## Le Sessioni

Il concetto di sessione è ampiamente utilizzato nella programmazione lato server, consentendo l'associazione di informazioni di stato alle richieste di un utente e superando la caratteristica stateless del protocollo HTTP. Di solito, per gestire le sessioni, si utilizza un identificatore unico (session identifier) assegnato all'utente all'ingresso nell'applicazione web, trasmesso con ogni richiesta HTTP e invalidato al logout o dopo un periodo di inattività.

Il session identifier, generalmente generato con algoritmi random basati sulla data/ora corrente, viene trasmesso mediante due approcci comuni:

1. **Cookies**: Stringhe inviate dal server al browser, ritrasmesse automaticamente con ogni richiesta. I cookie di sessione, cancellati alla chiusura del browser, contengono il session identifier. Sebbene semplici, sono soggetti alle politiche di sicurezza del browser.

2. **URL rewriting**: Inserimento del session identifier nelle URL come parte del path o come parametro GET. È una soluzione più generica, richiedendo la generazione dinamica delle pagine.

---

## Gestire le Sessioni con i Cookie

Nelle servlet, la creazione e l'uso di una sessione tramite i cookie sono semplici. La sessione è gestita da oggetti **HttpSession**, e le variabili di sessione sono stringhe associate a valori di tipo Object. Seguono i passaggi principali:

1. **Creazione della Sessione**: Utilizzando `HttpServletRequest.getSession(boolean)`, si ottiene un riferimento all'oggetto sessione. Se il parametro è `true`, viene creata una nuova sessione se non ne esiste già una valida. In caso contrario, potrebbe restituire `null`.

   * **Nota**: La chiamata a questo metodo può modificare gli headers della risposta e deve essere eseguita prima dell'inizio dell'output della risposta.

2. **Metodi di HttpSession**:
   * `isNew()`: Restituisce `true` se la sessione è appena stata creata, consentendo l'inizializzazione delle variabili di stato.
   * `getAttribute(String)`: Restituisce l'oggetto associato al nome specificato nella sessione.
   * `setAttribute(String, Object)`: Associa al nome dato l'oggetto specificato, creando o aggiornando la variabile di stato.
   * `removeAttribute(String)`: Rimuove la variabile di stato indicata.
   * `invalidate()`: Chiude la sessione ed elimina tutte le informazioni di stato associate.

---

## Gestire le Sessioni con i Cookie

### Esempio 1

```java
package example;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class class1 extends HttpServlet {
    //...
    public void doGet(HttpServletRequest in, HttpServletResponse out) {
        HttpSession session = in.getSession(true);

        if (session.isNew()) {
            session.setAttribute("pagine", new Integer(1));
        }

        int numPagine = ((Integer)session.getAttribute("pagine")).intValue();
        session.setAttribute("pagine", new Integer(numPagine + 1));

        try {
            Writer writer = out.getWriter();
            writer.write("Pagine visitate in questa sessione: " + numPagine);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
```

Ad ogni richiesta GET alla servlet, se una sessione non è attiva, ne viene creata una e al suo interno viene inserita una variabile denominata "pagine" inizializzata a 1 (notare l’uso della classe `Integer`). Il numero di pagine visitate durante la sessione viene quindi incrementato e stampato in output.

### Esempio 2

```java
package example;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class class1 extends HttpServlet {
    //...
    public void doGet(HttpServletRequest in, HttpServletResponse out) {
        HttpSession session = in.getSession(true);
        session.setAttribute("user", in.getParameter("username"));
    }
}
```

Questa semplice servlet mostra come salvare all'interno della sessione il valore del parametro "username" prelevato dalla richiesta (probabilmente proveniente da una form). Si tratta di una tipica operazione effettuata per concludere una procedura di login, tenendo traccia dell'utente attivato nella sessione corrente.

## Gestire le Sessioni con le URL

### Esempio

```java
package example;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class class1 extends HttpServlet {
    //...
    public void doGet(HttpServletRequest in, HttpServletResponse out) {
        HttpSession session = in.getSession(true);

        try {
            Writer writer = out.getWriter();
            // encodeUrl aggiunge il session identifier alla URL se necessario
            writer.write(out.encodeUrl(in.getServletPath()));
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
```

In questo esempio, viene creata (se necessario) una sessione, e sulla pagina viene stampata la URL della servlet corrente riscritta da `encodeURL` per includere il session identifier. Se il browser supporta i cookies, la URL non verrà modificata.

Questo approccio è utile nei casi in cui i cookie non sono supportati o sono disabilitati nel browser, e la gestione della sessione deve avvenire attraverso il passaggio esplicito del session identifier nella URL.
