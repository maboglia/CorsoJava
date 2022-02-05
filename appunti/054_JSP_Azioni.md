# JSP: Azioni standard

### jsp:include

Chiama una pagina JSP da un'altra

Al termine, la pagina di destinazione restituisce il controllo alla pagina chiamante.

```java
<jsp:include page="path" flush="true"/>
<jsp:include page="path" flush="true">
<jsp:param name="paramName" value="paramValue" /> ..
</jsp:include>
```

### jsp:forward

Chiama una pagina JSP da un'altra

L'esecuzione della pagina chiamante viene terminata dalla chiamata

```java
<jsp:forward page="path" />
<jsp:forward page="path">
<jsp:param name="paramName" value="paramValue" /> ..
</jsp:forward>
```

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



---

### jsp:plugin

* `type="bean|applet"`

opzionali

* `code="objectCode"`
* `codebase="objectCodebase"`
* `align="alignment"`
* `archive="archiveList"`
* `height="height"`
* `hspace="hspace"`
* `jreversion="jreversion"`
* `name="componentName"`
* `vspace="vspace"`
* `width="width"`
* `nspluginurl="url"`
* `iepluginurl="url"`

sintassi alternativa

* `<jsp:params><jsp:param name="paramName"value="paramValue" /></jsp:params>`
* `<jsp:fallback>testo in caso di fallimento del plugin</jsp:fallback>  >`

---

## Utilizzo di JavaBeans

### jsp:useBean

Definisce un'istanza di Java bean.
<jsp:useBean id="name" scope="page|request|session|application" typeSpec />
<jsp:useBean id="name" scope="page|request|session|application"typeSpec >body</jsp:useBean>

dove `typespec` è una delle seguenti possibilità:

* `class="className"`
* `class="className" type="typeName"`
* `beanName="beanName" type=" typeName"`
* `type="typeName"`

---

### jsp:setProperty

Imposta il valore di una o più proprietà in un bean.

<jsp:setPropertyname="beanName" prop_expr />

dove `prop_expr` è una delle seguenti possibilità:

* `property="*"`
* `property="propertyName"`
* `property="propertyName" param="parameterName"`
* `property="propertyName" value="propertyValue"`

### jsp:getProperty

Scrive il valore di una proprietà bean come stringa nell'oggetto out.
<jsp:getProperty name="name" property="propertyName" />
