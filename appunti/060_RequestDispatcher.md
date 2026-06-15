# LE SERVLET

---

### **Cos'è una Servlet?**

Una **Servlet** è una classe Java che risponde a richieste provenienti da un client (solitamente un browser) all'interno di un ambiente web. Le Servlet sono una parte fondamentale della tecnologia Java EE (Enterprise Edition) e vengono utilizzate per creare applicazioni web dinamiche. Le Servlet sono gestite da un contenitore di servlet, che è una parte di un server web, come Apache Tomcat, che gestisce le richieste HTTP, le inoltra alle servlet e restituisce le risposte al client.

---

### **Funzionalità di una Servlet**

Le Servlet svolgono un ruolo cruciale in un'applicazione web:

- **Gestire le richieste HTTP**: una servlet riceve una richiesta dal client (come una richiesta GET o POST), la elabora, e invia una risposta (solitamente una pagina HTML).
- **Generare contenuti dinamici**: le servlet possono generare dinamicamente il contenuto delle pagine, come HTML, JSON, XML, ecc., a seconda delle esigenze dell'applicazione.
- **Gestire la logica di business**: una servlet può implementare logiche di business, come l'elaborazione dei dati provenienti da un database, autenticazione degli utenti, e molto altro.

---

### **Ciclo di vita di una Servlet**

Il ciclo di vita di una servlet è gestito dal contenitore di servlet e si compone dei seguenti fasi:

1. **Loading e inizializzazione**:
   - Quando una richiesta arriva per la prima volta per una servlet, il contenitore carica la servlet e chiama il suo metodo `init()`.
   - Il metodo `init()` viene chiamato una sola volta durante la vita della servlet per inizializzare eventuali risorse necessarie.

2. **Elaborazione della richiesta**:
   - Quando una richiesta arriva, il contenitore invoca il metodo `service()`, passando un oggetto `HttpServletRequest` (contenente i dati della richiesta) e un oggetto `HttpServletResponse` (dove la risposta sarà scritta).
   - In base al tipo di richiesta (GET, POST, ecc.), il contenitore chiamerà i metodi appropriati: `doGet()`, `doPost()`, ecc.

3. **Distruzione**:
   - Quando la servlet non è più necessaria o il server viene arrestato, il contenitore invoca il metodo `destroy()`. Questo metodo consente alla servlet di rilasciare eventuali risorse allocate, come connessioni al database o file aperti.

---

### **Metodi principali delle Servlet**

1. **init()**: Inizializza la servlet. Viene chiamato una sola volta quando la servlet viene caricata per la prima volta.
   - Sintassi:

     ```java
     public void init() throws ServletException {
         // Inizializzazione della servlet
     }
     ```

2. **service()**: Elabora una richiesta. È chiamato ogni volta che il contenitore riceve una richiesta per la servlet.
   - Sintassi:

     ```java
     protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         // Gestire la richiesta
     }
     ```

3. **doGet() e doPost()**: Questi metodi elaborano le richieste GET e POST rispettivamente. Possono essere sovrascritti per personalizzare la gestione di queste richieste.
   - Sintassi (per `doGet()`):

     ```java
     protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         // Gestire la richiesta GET
     }
     ```

   - Sintassi (per `doPost()`):

     ```java
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         // Gestire la richiesta POST
     }
     ```

4. **destroy()**: Rilascia le risorse allocate dalla servlet. Viene chiamato quando il contenitore di servlet decide di distruggere la servlet.
   - Sintassi:

     ```java
     public void destroy() {
         // Rilasciare le risorse
     }
     ```

---

### **Esempio di Servlet:**

Immagina di avere una servlet che gestisce una richiesta GET e restituisce un messaggio al client.

```java
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class HelloWorldServlet extends HttpServlet {
    // Metodo di inizializzazione
    public void init() throws ServletException {
        // Inizializzazione della servlet
    }

    // Metodo per elaborare le richieste GET
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Impostazione del tipo di contenuto della risposta
        response.setContentType("text/html");

        // Ottenere un oggetto PrintWriter per scrivere la risposta
        PrintWriter out = response.getWriter();

        // Scrivere la risposta HTML
        out.println("<html><body>");
        out.println("<h1>Ciao, mondo!</h1>");
        out.println("</body></html>");
    }

    // Metodo per distruggere la servlet
    public void destroy() {
        // Rilascio delle risorse
    }
}
```

---

### **Configurazione di una Servlet**

Per configurare una servlet, è necessario definire un mapping della servlet nel file di configurazione `web.xml`, che si trova nella directory `WEB-INF` di una web application. Ecco un esempio di configurazione:

```xml
<web-app xmlns="http://java.sun.com/xml/ns/javaee"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://java.sun.com/xml/ns/javaee 
             http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd"
         version="3.0">

    <servlet>
        <servlet-name>HelloWorldServlet</servlet-name>
        <servlet-class>com.example.HelloWorldServlet</servlet-class>
    </servlet>

    <servlet-mapping>
        <servlet-name>HelloWorldServlet</servlet-name>
        <url-pattern>/hello</url-pattern>
    </servlet-mapping>
    
</web-app>
```

---

### **Servlets e Concorrenza**

Le servlet sono generalmente **thread-safe** in un contenitore multi-thread. Ogni richiesta HTTP è gestita da un thread separato. Questo significa che le variabili e le risorse condivise tra le richieste devono essere trattate con attenzione. Ad esempio, evitare l'uso di variabili di istanza non sincronizzate per gestire i dati delle richieste.

---

### **Conclusioni**

Le servlet sono fondamentali per la creazione di applicazioni web dinamiche in Java. Offrono un modo efficiente per gestire richieste HTTP, eseguire logiche di business e generare risposte dinamiche. Sebbene l'uso di servlet possa sembrare un po' verboso, vengono spesso utilizzate in combinazione con tecnologie come JSP, JSTL e framework come Spring per semplificare lo sviluppo
---

## MVC pattern con le servlet

![servlet](https://raw.githubusercontent.com/maboglia/CorsoJava/master/appunti/img/JSP/model2.jpg)

---

### httpsession

![httpsession](https://raw.githubusercontent.com/maboglia/CorsoJava/master/appunti/img/JSP/httpsession.JPG)

---

## RequestDispatcher

* L'approccio **servlet-centric** prevede di utilizzare le pagine JSP solo per la presentazione e delegare il controllo ad una o ad un gruppo di servlet
* Le `servlet` quindi
* gestiscono le richieste (vengono cioè invocate tramite URL) elaborano i dati necessari a soddisfare le richieste (interagendo con la classe DBMS.java e utilizzando i Java Data Bean come componenti per rappresentare le informazioni di interesse)
* trasferiscono il controllo alla JSP designata a presentare i risultati.

* Se il gruppo di `servlet` che realizzano l'applicazione web viene ristretto a contenere una sola `servlet`, allora l'applicazione ha un solo punto di accesso e questa `servlet` ha i controllo totale sul flusso dell'applicazione.

---

### requestdispatcher

![requestdispatcher](https://raw.githubusercontent.com/maboglia/CorsoJava/master/appunti/img/JSP/requestdispatcher.JPG)

---

## Passaggio dati fra servlet-JSP:

* I Java Data Bean istanziati dalla servlet devono essere passati alla JSP prima di trasferire ad essa il controllo. 

* A tal fine esiste una coppia di metodi della classe `HttpServletRequest` che permettono di gestire un numero arbitrario di oggetti passati comee parametri della `request`. 

__Questi metodi sono:__

* setAttribute(String, Object)
* getAttribute(String)

---

## Trasferimento del controllo dalla servlet alla JSP

* Quando all'interno di una servlet, dopo aver preparato i dati in JDB e averli inseriti nell'oggetto request (parametro del metodo `doGet` o `doPost`), si vuole richiamare una **JSP** per visualizzare i dati, si dice che si trasferisce il controllo (**forward**) alla JSP.
* Per trasferire il controllo è necessario creare un oggetto di tipo `RequestDispatcher` associato alla JSP che si vuole 'invocare'.

* Ci sono due modi equivalenti per definire un oggetto **RequestDispatcher** associato ad una JSP all'interno di una servlet:

```java
RequestDispatcher rd = request.getRequestDispatcher("PathRelativoJSP");
RequestDispatcher rd = getServletContext.getRequestDispatcher("PathAssolutoJSP");
```

* Una volta ottenuto l'oggetto `RequestDispatcher rd`, è sufficiente invocare il suo metodo forward:

```forward(HttpServletRequest, HttpServletResponse)```

per trasferire **MOMENTANEAMENTE** il controllo alla JSP.

```rd.forward(request, response)```

**Non è un browser redirect** e nemmeno una terminazione del metodo doGet o doPost della servlet: è una semplice **chiamata di metodo**.

Perciò tutto il codice eventualmente presente dopo `rd.forward(request, response)` verrà eseguito dopo che la JSP ha finito la sua esecuzione

---

### JSP_include

![JSP_include](https://raw.githubusercontent.com/maboglia/CorsoJava/master/appunti/img/JSP/JSP_include.jpeg)

---

### JSP_forward

![JSP_forward](https://raw.githubusercontent.com/maboglia/CorsoJava/master/appunti/img/JSP/JSP_forward.jpeg)

---
