# Esempi JSP

## Ciclo DO WHILE

* Ciclo DO WHILE con JSP
 (il ciclo viene eseguito almeno una volta)

```html
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
