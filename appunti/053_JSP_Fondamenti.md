# Elementi fondamentali JSP

## JSP utilizza gli oggetti impliciti (built-in)

* Gli oggetti impliciti sono oggetti istanziati automaticamente dall’ambiente JSP, non dobbiamo preoccuparci di importarli e istanziarli.
* Per utilizzarli è sufficiente usare la sintassi nomeOggetto.nomeMetodo

---

## questi oggetti sono disponibili per l’uso in pagine JSP e sono

* `out`: per scrivere codice HTML nella risposta (System.out di Java)
* `session`: dati specifici della sessione utente corrente
* `request`: richiesta HTTP ricevuta e i suoi attributi, header, cookie, parametri, etc.
* `page`: la pagina e le sue proprietà.
* `config`: dati di configurazione
* `response`: risposta HTTP e le sue proprietà.
* `application`: dati condivisi da tutte le pagine della web application
* `exception`: eventuali eccezioni lanciate dal server; utile per pagine di errore
* `pageContext`: dati di contesto per l’esecuzione della pagina

---

## Gli oggetti impliciti possono essere

* oggetti legati alla servlet relativa alla pagina JSP
* oggetti legati all’input e all’output della pagina JSP
* oggetti che forniscono informazioni sul contesto in cui la JSP viene eseguita
* oggetti risultanti da eventuali errori

---

## Ambito

Definisce dove e per quanto tempo saranno accessibili gli oggetti: oggetti impliciti, JavaBeans, ...

* `page` di **pagina**: l'oggetto è accessibile dal servlet che rappresenta la pagina
* `request` di **richiesta**: l'oggetto viene creato e poi distrutto dopo l'uso
* `session` di **sessione**: l'oggetto è accessibile durante tutta la sessione
* `application` di **applicazione**: l'oggetto è accessibile dal servlet che rappresenta la pagina

---

## Ciclo di vita di una pagina JSP

La pagina viene salvata in una cartella pubblica del server web alla prima richiesta ricevuta dal Web server la pagina JSP è automaticamente:

* tradotta in un sorgente Java chiamato **Servlet**
* compilata come programma Java
* caricata in memoria ed eseguita

successivamente la pagina JSP (la servlet) viene solo eseguita. In fase di debug il web server verifica se la pagina JSP è più recente del servlet corrispondente.

Rispetto ad altre tecnologie server side come PHP o ASP, questa è una differenza vantaggiosa in termini di velocità di risposta: dopo la prima esecuzione, il codice risulterà già compilato e disponibile immediatamente.

Con PHP e ASP il webserver interpreterà il codice ad ogni richiesta prima di servire la pagina di risposta.

---

## Elementi di una pagina JSP

* codice HTML

* marcatori JSP

* direttive al server

* `<%@ direttive %>`

* elementi di scripting

* `<%! dichiarazioni %>`

* `<%= espressioni %>`

* `<% scriptlet %>`

* `<%-- commenti --%>`

* azioni standard

  * `<jsp:include>`

  * `<jsp:forward>`

  * `<jsp:param>`

  * `<jsp:useBean>`

  * `<jsp:setProperty>`

  * `<jsp:getProperty>`

  * `<jsp:plugin>`

* azioni personalizzate - custom tags (vedi sotto tag libraries)

---

## Inclusioni JSP

![JSP include](https://raw.githubusercontent.com/maboglia/CorsoJava/master/appunti/img/prj_JSP_schema_inclusioni.png)