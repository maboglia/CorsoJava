
# Corso JSP

## Corso JSP - Le direttive
### corso-jsp-le-direttive
Corso JSP - Le direttive
Le direttive permettono di definire la struttura di tutto il documento JSP. Indicano gli aspetti principali del servlet in cui sarà convertito il file JSP.

Sono processati al momento della conversione in servlet: a compile-time, cioè a tempo di compilazione.

Le direttive esistenti sono: page, include e taglib.

* ```<%@ page ... %>```
* ```<%@ include file="path - percorso relativo al file" %>```
* ```<%@ taglib ...%>```

Introdotte dal simbolo @ possono contenere diversi attributi, in alcuni casi concatenabili come per la direttiva import.

direttiva page
```<%@ page attributi %> ```

dove attributi sono coppie:  nome="valore"
Esempio:
```<%@   page language=”Java” import="java.sql.*,java.util.*" session="true" buffer="10kb" %>```
Esiste una lista di attributi che possono essere usati, ne elenco alcuni:

```import ="package.class"```

Lista di package o classes, separati da virgola, che saranno importati per essere utilizzati nel codice java.

```session ="true | false"```
specifica se la pagina fa parte di una sessione HTTP. Se si inizializza a true, è disponibile l'oggetto implicito sessione.

```buffer ="dimensionekb"```
specifica la dimensione di un buffer di uscita di tipo stream, per il client.



```errorPage="url"```
specifica una pagina JSP che sarà processata nel caso si verifichi un errore.

```isErrorPage="true|false"```
Indica che la pagina è una pagina di errore JSP e può mostrare a video l'output dell'errore verificatosi. Per default è settata false.


```contentType = "MIME-Type"```
oppure
```contentType = "MIME-Type; charset = Character-Set"```
Il valore MIME di default è text/html
direttiva include
Indica al motore JSP di includere  il contenuto del file corrispondente, inserendolo al posto della direttiva nella pagina JSP.
Il contenuto del file incluso è analizzato al momento della traduzione del file JSP e si include una copia del file stesso nel servlet generato.
Una volta incluso, se si modifica il file non sarà ricompilato nel servlet.
Il tipo di file da includere può essere un
file html (statico)
file jsp  (dinamico)
Sintassi:    ```<%@ include file="nome del file" %>```
esempio
```html
<html>

<head>

<title> pagina di prova Direttive  </title>

</head>

<body>

<h1> pagina di prova Direttive inclusione  </h1>

      <%@ include file="/hello_world.html" %>

      <%@ include file=”/login.jsp” %>

</body>

</html>
```
direttiva taglib
Permette estendere i marcatori di JSP con etichette o marcatori generati dall'utente (etichette personalizzate).

Sintassi

```<%@ taglib uri="taglibraryURI" prefix="tagPrefix" %>```

Esempi librerie standard

* JSTL core
* JSTL sql
* JSTL function

## Corso JSP - Le variabili

### corso-jsp-le-variabili

Corso JSP - Le variabili
Le variabili  in Java devono essere definite e tipizzate, i tipi principali sono (utilizzati negli esempi)

* String,
* int,
* boolean,
* float,

poi ci sono

* long,
* short,
* double,
* char,
* byte.

Per l'elenco completo delle variabili e dei tipi primitivi fare riferimento alla documentazione di Java.

Esempi di uso delle variabili nelle Java Server Pages:
Copia codice
```html
<%--
Document : variabili
Created on : 3-giu-2013, 11.19.17
Author : mauro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
<h1>variabile stringa</h1>
<%
 String stVar = "Questa è una stringa!";
 %>
variabile stringa: <%=stVar%>
<h1>variabile intera</h1>
<%
 int iVar=25;
 %>
variabile intera: <%=iVar%>
<h1>variabile float</h1>
<%
float fVar=123.456f;
%>
variabile float: <%=fVar%>

<h1>variabile booleana</h1>
<%
boolean checkBoolean=false;
if(checkBoolean==true)
{
out.print("La condizione è vera");
}
else
{
out.print("La condizione è falsa");//stamperà la condizione è falsa
}
%>
</body>
</html>
```

## Corso JSP - In breve
### corso-jsp-introduzione
- [Corso JSP](#corso-jsp)
	- [Corso JSP - Le direttive](#corso-jsp---le-direttive)
		- [corso-jsp-le-direttive](#corso-jsp-le-direttive)
	- [Corso JSP - Le variabili](#corso-jsp---le-variabili)
		- [corso-jsp-le-variabili](#corso-jsp-le-variabili)
	- [Corso JSP - In breve](#corso-jsp---in-breve)
		- [corso-jsp-introduzione](#corso-jsp-introduzione)
	- [Corso JSP - argomenti](#corso-jsp---argomenti)
		- [corso-jsp-argomenti](#corso-jsp-argomenti)
	- [Corso JSP - jsp:forward](#corso-jsp---jspforward)
	- [Corso JSP - Le dichiarazioni](#corso-jsp---le-dichiarazioni)
		- [corso-jsp-dichiarazioni](#corso-jsp-dichiarazioni)
	- [Corso JSP - Ciclo DO WHILE](#corso-jsp---ciclo-do-while)
		- [corso-jsp-ciclo-do-while](#corso-jsp-ciclo-do-while)
	- [Corso JSP - Funzione contatore accessi + esempio uso dichiarazioni e espressioni](#corso-jsp---funzione-contatore-accessi-esempio-uso-dichiarazioni-e-espressioni)
		- [corso-jsp-dichiarazioni-espressioni](#corso-jsp-dichiarazioni-espressioni)
	- [Corso JSP - Esempio JSTL Core](#corso-jsp---esempio-jstl-core)
		- [corso-jsp-esempio-jstl-core](#corso-jsp-esempio-jstl-core)
	- [Corso JSP - Esempio JSTL Functions](#corso-jsp---esempio-jstl-functions)
		- [corso-jsp-esempio-jstl-functions](#corso-jsp-esempio-jstl-functions)
	- [Corso JSP - Esempio Java Server Faces](#corso-jsp---esempio-java-server-faces)
		- [corso-jsp-java-server-faces](#corso-jsp-java-server-faces)


* JSP è una specifica di Sun Microsystems, poi acquistata da Oracle leggi qui la storia
* Serve per creare e gestire pagine web dinamiche
* Permette di mescolare in una pagina codice HTML per generare la parte statica, con contenuto dinamico generato a partire da marcatori speciali <% ....  %>
* Il contenuto dinamico si ottiene grazie alla possibilità di incorporare nella pagina codice Java di differenti forme
* L’obiettivo finale è separare l’interfaccia (presentazione visuale) dalla implementazione (logica di esecuzione)

pagina JSP -> Servlet


* La pagina JSP si converte in un servlet (il servlet o la servlet? leggi qui la discussione funny )
* La conversione la realizza il motore o contenitore JSP (tomcat, glassfish, ...), la prima volta che si sollecita la pagina JSP
* Questo servlet generato processa qualsiasi richiesta per questa pagina JSP
* Se si modifica il codice della pagina JSP, allora si rigenera e ricompila automaticamente il servlet e si ricarica la volta successiva

oggetti impliciti
JSP utilizza gli oggetti impliciti (built-in)



* Gli oggetti impliciti sono oggetti istanziati automaticamente dall’ambiente JSP, non dobbiamo preoccuparci di importarli e istanziarli.
* Per utilizzarli è sufficiente usare la sintassi nomeOggetto.nomeMetodo



questi oggetti sono disponibili per l’uso in pagine JSP e sono:


* out: per scrivere codice HTML nella risposta (System.out di Java)
* session: dati specifici della sessione utente corrente
* request: richiesta HTTP ricevuta e i suoi attributi, header, cookie, parametri, etc.
* page: la pagina e le sue proprietà.
* config: dati di configurazione
* response: risposta HTTP e le sue proprietà.
* application: dati condivisi da tutte le pagine della web application
* exception: eventuali eccezioni lanciate dal server; utile per pagine di errore
* pageContext: dati di contesto per l’esecuzione della pagina


Gli oggetti impliciti possono essere 


* oggetti legati alla servlet relativa alla pagina JSP
* oggetti legati all’input e all’output della pagina JSP
* oggetti che forniscono informazioni sul contesto in cui la JSP viene eseguita
* oggetti risultanti da eventuali errori

Ambito
Definisce dove e per quanto tempo saranno accessibili gli oggetti: oggetti impliciti, JavaBeans, ...





* di pagina: l'oggetto è accessibile dal servlet che rappresenta la pagina
* di richiesta:  l'oggetto viene creato e poi distrutto  dopo l'uso
* di sessione: l'oggetto è accessibile durante tutta la sessione
* di applicazione: l'oggetto è accessibile dal servlet che rappresenta la pagina


Ciclo di vita di una pagina JSP
La pagina viene salvata in una cartella pubblica del server web

alla prima richiesta ricevuta dal Web server la pagina JSP è automaticamente:


* tradotta in un sorgente Java chiamato Servlet
* compilata come programma Java
* caricata in memoria ed eseguita


successivamente la pagina JSP (la servlet) viene solo eseguita.
In fase di debug il web server verifica se la pagina JSP è più recente del servlet corrispondente.

Rispetto ad altre tecnologie server side come PHP o ASP, questa è una differenza vantaggiosa in termini di velocità di risposta: dopo la prima esecuzione, il codice risulterà già compilato e disponibile immediatamente. Con PHP e ASP il webserver interpreterà il codice ad ogni richiesta prima di servire la pagina di risposta.


Elementi di una pagina JSP


* codice HTML
* marcatori JSP

* direttive al server

* ```<%@ direttive %>```


* elementi di scripting

* ```<%! dichiarazioni %>```
* ```<%= espressioni %>```
* ```<% scriptlet %>```
* ```<%-- commenti --%>```


* azioni standard

* ```<jsp:include>```
* ```<jsp:forward>```
* ```<jsp:param>```
* ```<jsp:useBean>```
* ```<jsp:setProperty>```
* ```<jsp:getProperty>```
* ```<jsp:plugin>```


* azioni personalizzate - custom tags (vedi sotto tag libraries)




Costrutti del linguaggio
Supporta i costrutti e la sintassi standard di Java, ecco alcuni esempi:


esempi disponibili:

* variabili
* costrutti condizionali (if, if else, switch case) 
* cicli for
* cicli while
* cicli while, do-while
* eccezioni e blocchi try catch
* array

* array di stringhe
* array tipo intero
* array tipo List
* array tipo Vector
* array multidimensionale




JDBC e interazione con database

* Leggi scrivi su file di testo
* Leggi e scrivi su database
* Applicazione CRUD con JSP

Le Tag Libraries

* JSTL

* core
* xml
* frm
* sql
* functions


* Librerie di Tag personalizzate
* EL - expressions language - espressioni dinamiche

 Uso avanzato

* Hello World con JSF - Java Server Faces
* Hibernate, JSTL e MySql
* Esempio di filtri

Post su JSP
[su_post post_id="4311"]

Edizione del corso

* Anno formativo 2015-2016 - "Tecnico di sviluppo software", Torino
* Anno formativo 2013 - "Programmazione web server-side con JSP" - corso IFTS - ITIS Pininfarina (TO)

 

---


## Corso JSP - argomenti
### corso-jsp-argomenti
Corso JSP - argomenti delle lezioni
Primo approccio a JSP


* Cos’è e a cosa serve JSP
* Hello World con JSP
* Primo esempio stampare la data corrente a video
* Uso degli oggetti impliciti ed esempi


->Esercizio: installazione ed esecuzione della prima pagina JSP

* Installazione dell' SDK di Java e di Tomcat configurazione dell’IDE e prima pagina Hello world con JSP
* Esplorazione dell’ambiente di sviluppo, creazione, modifica pagine JSP, passaggio dei dati tra pagine
* Oggetti impliciti, oggetti principali, uso di Request, Out, etc.
* Inclusione di file, primo utilizzo delle direttive.
* Tipi di tag JSP: dichiarazioni, espressioni, scriptlet, direttive.
* Compile-time e Request-time

 

Elementi fondamentali di JSP - Sintassi e caratteristiche degli oggetti principali: scriptlet, azioni standard, servlet



* Direttive <%@   (page | includi | taglib)
* Codice Java <%  (dichiarazioni | java | espressioni)
* jsp:action (include | forward | usebean | getproperty | setproperty)


-> Esercizio esempi di utilizzo degli elementi fondamentali

* Ciclo di vita di una pagina Jsp, Scriptlet: usare i costrutti del linguaggio JAVA nelle JSP
* Cookie e gestione delle sessioni – Impostare una procedura di login da riutilizzare
* Teoria ed esercizi sulle standard actions - jsp:forward
* Standard action JavaBeans: estendere le funzionalità della web application, separare la logica dell'app;
* Standard action: come usare le altre azioni standard
* Lavorare con le date in JSP.

-> Esercizio utilizzo di JavaBeans

Lavorare con i database

* Correzione in aula dell'esercitazione e individuazione best practices.
* Approfondimento ed esercizi con i JavaBeans. Introduzione database con JSP.
* Uso di JDBC nelle JSP. Creazione database, accesso alla base dati.
* Esercizi sulla base dati, applicazione CRUD in JSP.
* Progetto ed implementazione di un'applicazione web complessa con JSP: creare un sito web per acquisti on line, sviluppo di un carrello della spesa.
* Lettura e scrittura di file, utilizzo database nell'applicazione web. Hibernate, JSTL, servlet e MySql. MVC pattern. Persistenza in JSP.

Elementi Avanzati di una pagina JSP


* Azioni personalizzate (etichette)
* Definizione della struttura (libreria.tld e in web.xml)
* Nome, classe controller, attributi, corpo, etc.
* Definizione della funzionalità (JavaBean che deriva da taglib)
* Dichiarazioni nella pagina con <%@taglib e uso avanzato


-> Esercizio uso di Etichette personalizzate

* Esercitazione guidata Hibernate e JSTL. Le TagLibraries.
* Esercitazione guidata JSTL: core, xml, fmt, sql, functions.
* JSP2 - JSF - EL expression language. Panoramica framework principali JSP.
* Esercitazione guidata Java Server Faces
---


## Corso JSP - jsp:forward


L'azione forward, come intuibile, serve per trasferire l'utente da una pagina jsp ad un'altra. Come l'azione jsp:include è possibile utlizzare forward con o senza parametri. In quest'ultimo caso occorre terminare l'istruzione inserendo / prima della parentesi angolare di chiusura tag :

```<jsp:forward page="URL" />```
Nel caso si vogliano utilizare dei parametri, invece, utilizzeremo il tag di chiusura del blocco di codice </jsp:forward> :

```html
<jsp:forward page="URL" > 
<jsp:param name="ParamName1" value="ParamValue1" /> 
<jsp:param name="ParamName2" value="ParamValue2" /> 
</jsp:forward>
```
Esempio di codice (incluso in tomcat 7)
per trovarne altri, dopo l'indirizzo del server (es. localhost:8080) scrivi /examples/jsp/

```html
<html>
<%
   double freeMem = Runtime.getRuntime().freeMemory();
   double totlMem = Runtime.getRuntime().totalMemory();
   double percent = freeMem/totlMem;
   if (percent < 0.5) {
%>

<jsp:forward page="one.jsp"/>

<% } else { %>

<jsp:forward page="two.html"/>

<% } %>

</html>
```


## Corso JSP - Le dichiarazioni
### corso-jsp-dichiarazioni

* JSP: usare le dichiarazioni ```<%! ... %>```
* le espressioni ```<%= ... %>```
 

Racchiuse tra i tag ```<%! ... %>```, contengono codice Java e sono utilizzate per definire metodi e proprietà della classe generata. Le dichiarazioni sono esterne al servlet, a differenza degli scriptlet. Queste variabili o metodi dichiarati diventeranno variabili di istanza della classe servlet generata. Questo significa che saranno globali a tutto il servlet generato per la pagina. Può servire per definire dei metodi da usarsi con il servlet, dichiarare attibuti (variabili di oggetto) del servlet.
Sintassi
```<%! Dichiarazione %>```

esempio
Copia e completa il codice
```html
<%@page contentType="text/html" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>JSP Page</title>
</head>
<body>
<h1>Corso JSP - Le dichiarazioni: crea una funzione per stampare 5 numeri random</h1>
<h2>NB: non ci sono i controlli per ordinare i numeri e verificare l'assenza di duplicati, prova a completare il codice usando gli array</h2>
<%!
 private String lottoGame() {
 return ("<h2>" + (int)Math.floor(Math.random() * 90 +1 )+ "</h2>");
 }
 %>
<%= lottoGame() %>
<%= lottoGame() %>
<%= lottoGame() %>
<%= lottoGame() %>
<%= lottoGame() %>
</body>
</html>
```

## Corso JSP - Ciclo DO WHILE 

### corso-jsp-ciclo-do-while

* Ciclo DO WHILE con JSP
 (il ciclo viene eseguito almeno una volta)

```html
<%--
Document : CicloDOWhile
Created on : 28-mag-2013, 16.43.59
Author : mauro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Corso JSP</title>
</head>
<body>
<h1>Corso JSP - Uso del ciclo DO WHILE</h1>

<h2>Uso dell'oggetto implicito OUT per stampare il valore a video</h2>
<table >
<tr>
<td></td>
<td>numero</td>
<td>aggiungo +1 al numero base </td>
<td>moltiplico *2 il numero base </td>
</tr>
<%
  int i=0;
  do{
  out.print("<tr><td>numero</td><td>"+i+"</td>"+"<td>"+(i+1)+"</td>"+"<td>"+(i*2)+"</td></tr>");
  i++;
  }
  while(i<=10);
  %>
</body>
</html>
```

## Corso JSP - Funzione contatore accessi + esempio uso dichiarazioni e espressioni

### corso-jsp-dichiarazioni-espressioni

* Corso JSP - Funzione contatore accessi + esempio uso dichiarazioni e espressioni

```html

<%--
Document : contatore
Created on : 7-mag-2013, 15.47.29
Author : mauro
--%>

<%@page contentType="text/html" pageEncoding="utf-8" language="java"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>

<%! int conta = 0; %>
<%! public void contatore()
 {
 conta ++;
 }
 %>
Questa pagina è stata caricata <%= conta %> volte.
<% contatore(); %>
</body>
</html>
```

## Corso JSP - Esempio JSTL Core

### corso-jsp-esempio-jstl-core


Corso JSP - JSTL e EL
JSP Standard Tag Library e Expression Language

```html
<%-- 
    Document   : core
    Created on : 26-giu-2013, 15.16.15
    Author     : mauro
--%>
<!-- collega la taglib e assegna il prefisso, in questo caso usa la lettera c -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Esempi core</title>
</head>
<body>
    <h1>Esempio con tag: out</h1>
<!-- la lettera del prefisso permette di accedere agli oggetti ed ai metodi definiti nella taglib vedi gli esempi -->
<c:out value="${'<body> , %'}"/>

    <h1>Esempio con tag: set</h1>
<c:set var="prodotto" scope="session" value="${2000*2}"/>
<c:out value="${prodotto}"/>
    <h1>Esempio con tag: remove</h1>
<c:remove var="prodotto"/>
<c:out value="${prodotto}"/>

    <h1>Esempio con tag: catch e if</h1>
<c:catch var ="catchException">
   <% int x = 10/0;%>
</c:catch>

<c:if test = "${catchException != null}">
   <p>The exception is : ${catchException} <br />
   There is an exception: ${catchException.message}</p>
</c:if>
    <h1>Esempio con tag: choose</h1>

    <c:set var="prodotto" scope="session" value="${5000+500+50+5}"/>

<c:choose>
    <c:when test="${prodotto <= 0}">
       Il valore del prodotto è minore di 0.
    </c:when>
    <c:when test="${prodotto > 1000}">
       Il valore del prodotto è maggiore di 1000.
    </c:when>
    <c:otherwise>
        <c:out value="${prodotto}"/>
    </c:otherwise>
</c:choose>   

<h2>Esempio con import: importa il sorgente di una pagina web con JSTL</h2>
<%--<c:import var="data" url="http://www.bogliaccino.it"/>--%>
<h2>stampa il codice importato</h2>
<%--<c:out value="${data}"/>--%>

</body>
</html>
```

## Corso JSP - Esempio JSTL Functions
### corso-jsp-esempio-jstl-functions
Corso JSP - JSTL

```html
<%-- 
    Document   : newjspfucntions
    Created on : 26-giu-2013, 16.27.22
    Author     : mauro
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
<h2>la funzione replace fn:replace()</h2>
<c:set var="stringa1" value="Questa è la prima stringa."/>
<c:out value="${stringa1}"/>
<c:set var="stringa2" value="${fn:replace(stringa1, 
                                'prima', 'seconda')}" />

<p>Stringa modificata: ${stringa2}</p>
<h2>la funzione split e la funzione join fn:split() fn:join()</h2>
<c:set var="stringa1" value="Questa è la prima stringa."/>
<c:set var="stringa2" value="${fn:split(stringa1, ' ')}" />
<c:set var="stringa3" value="${fn:join(stringa2, '|')}" />

<p>Stringa (3) : ${stringa3}</p>

<c:set var="stringa4" value="${fn:split(stringa3, '|')}" />
<c:set var="stringa5" value="${fn:join(stringa4, ' ')}" />

<p>Stringa (5) : ${stringa5}</p>
    </body>
</html>
```

## Corso JSP - Esempio Java Server Faces

### corso-jsp-java-server-faces


Corso JSP - Java Server Faces - Hello world JSF con Netbeans 7.3

* Crea un nuovo progetto Java Web - > Web Application
* Assegna un nome al progetto e salvalo sul disco
* Scegli un server web
* Scegli il framework Java Server Faces
* Clicca su 'Fine'

In Source Packages aggiungi un nuovo package (p.es login ), all'interno del package aggiungi una classe java (p. es accesso.java)

Incolla il codice seguente

```java
package login;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
*
* @author mauro
*/

@ManagedBean
@RequestScoped
public class accesso {
public String login;

public String getLogin() {
return login;
}

public void setLogin(String login) {
this.login = login;
}

public accesso() {
}
}
```

Il file index.xhtml contiene il form per l'invio del nome utente, incolla il codice all'interno dei tag h:body

```html
<h:form>

<h2>login</h2>
Login: <h:inputText id="login" size="30" required="true" requiredMessage="inserisci nome utente" value="#{accesso.login}" />

<h:/form>
Iinfine crea il file login.xhtml che visualizza il testo inviato. Attenzione! Anche questo codice dovrà compreso all'interno dei tag h:form, così come il campo input per l'invio del testo.
    
<h:form>

Benvenuto: <h:outputText value="#{accesso.login}" />
            <h:commandLink value="torna alla home" action="index"/>

<h:/form>---
```

