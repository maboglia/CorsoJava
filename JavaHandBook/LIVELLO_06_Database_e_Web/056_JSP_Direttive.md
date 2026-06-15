
# JSP - Le direttive

Le direttive permettono di definire la struttura di tutto il documento JSP. 
Indicano gli aspetti principali del servlet in cui sarà convertito il file JSP.
Sono processati al momento della conversione in servlet: a compile-time, cioè a tempo di compilazione.

## Le direttive esistenti sono: page, include e taglib.

* ```<%@ page ... %>```
* ```<%@ include file="path - percorso relativo al file" %>```
* ```<%@ taglib ...%>```

Introdotte dal simbolo `@` possono contenere diversi attributi, in alcuni casi concatenabili come per la direttiva import.

### direttiva page
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

---

### direttiva include

Indica al motore JSP di includere  il contenuto del file corrispondente, inserendolo al posto della direttiva nella pagina JSP.
Il contenuto del file incluso è analizzato al momento della traduzione del file JSP e si include una copia del file stesso nel servlet generato.
Una volta incluso, se si modifica il file non sarà ricompilato nel servlet.

Il tipo di file da includere può essere un
* file html (statico)
* file jsp  (dinamico)
* Sintassi:    ```<%@ include file="nome del file" %>```

---

###  esempio

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

---

## direttiva taglib

Permette estendere i marcatori di JSP con etichette o marcatori generati dall'utente (etichette personalizzate).

Sintassi

```<%@ taglib uri="taglibraryURI" prefix="tagPrefix" %>```

Esempi librerie standard

* JSTL core
* JSTL sql
* JSTL function

### Esempio JSTL Core

JSTL e EL
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

### Esempio JSTL Functions

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
