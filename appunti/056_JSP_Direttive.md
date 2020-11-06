
## Corso JSP - Le direttive
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


## direttiva taglib
Permette estendere i marcatori di JSP con etichette o marcatori generati dall'utente (etichette personalizzate).

Sintassi

```<%@ taglib uri="taglibraryURI" prefix="tagPrefix" %>```

Esempi librerie standard

* JSTL core
* JSTL sql
* JSTL function