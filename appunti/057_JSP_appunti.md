# Esempi JSP

## jsp:forward


L'azione forward serve per trasferire l'utente da una pagina jsp ad un'altra. Come l'azione jsp:include è possibile utlizzare forward con o senza parametri. In quest'ultimo caso occorre terminare l'istruzione inserendo / prima della parentesi angolare di chiusura tag :

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


## Le dichiarazioni

* JSP: usare le dichiarazioni ```<%! ... %>```
* le espressioni ```<%= ... %>```
 

Racchiuse tra i tag ```<%! ... %>```, contengono codice Java e sono utilizzate per definire metodi e proprietà della classe generata. Le dichiarazioni sono esterne al servlet, a differenza degli scriptlet. Queste variabili o metodi dichiarati diventeranno variabili di istanza della classe servlet generata. Questo significa che saranno globali a tutto il servlet generato per la pagina. Può servire per definire dei metodi da usarsi con il servlet, dichiarare attibuti (variabili di oggetto) del servlet.
Sintassi
```<%! Dichiarazione %>```

### esempio

```html
<%@page contentType="text/html" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>JSP Page</title>
</head>
<body>
<h1>Le dichiarazioni: crea una funzione per stampare 5 numeri random</h1>
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

## Ciclo DO WHILE 

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
<h1>Uso del ciclo DO WHILE</h1>

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

## Funzione contatore accessi + esempio uso dichiarazioni e espressioni

* Funzione contatore accessi + esempio uso dichiarazioni e espressioni

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

### Esempio Java Server Faces

Java Server Faces - Hello world JSF con Netbeans 7.3

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
Infine crea il file login.xhtml che visualizza il testo inviato. Attenzione! Anche questo codice dovrà compreso all'interno dei tag h:form, così come il campo input per l'invio del testo.
    
<h:form>

Benvenuto: <h:outputText value="#{accesso.login}" />
            <h:commandLink value="torna alla home" action="index"/>

<h:/form>---
```