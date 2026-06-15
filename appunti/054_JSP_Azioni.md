# JSP: Azioni standard

In JSP, le **azioni standard** sono tag speciali che forniscono funzionalità predefinite e semplificano le operazioni comuni come l'inclusione di contenuti, la gestione dei JavaBean e l'inoltro di richieste. Questi tag offrono un modo dichiarativo per eseguire attività server-side senza dover scrivere codice Java direttamente nella pagina JSP.

---

### Principali Azioni Standard di JSP

1. **<jsp:include>**
   - **Descrizione**: Include dinamicamente il contenuto di un'altra pagina JSP o file all'interno della pagina corrente.
   - **Quando usare**: Quando si vuole includere una risorsa esterna (come un'intestazione o un piè di pagina) ed eseguire l'aggiornamento in tempo reale durante la richiesta.
   - **Sintassi**:

     ```jsp
     <jsp:include page="header.jsp" />
     ```

   - **Esempio con passaggio parametri**:

     ```jsp
     <jsp:include page="header.jsp">
         <jsp:param name="utente" value="Mario Rossi" />
     </jsp:include>
     ```

2. **<jsp:forward>**
   - **Descrizione**: Inoltra la richiesta corrente a un'altra pagina JSP, servlet o risorsa. La pagina che riceve l'inoltro gestirà la risposta al client.
   - **Quando usare**: Quando si vuole redirigere il flusso a una nuova risorsa, come un'altra pagina JSP, senza inviare una risposta immediata al client.
   - **Sintassi**:

     ```jsp
     <jsp:forward page="nuovaPagina.jsp" />
     ```

   - **Esempio con passaggio parametri**:

     ```jsp
     <jsp:forward page="login.jsp">
         <jsp:param name="messaggio" value="Accesso necessario" />
     </jsp:forward>
     ```

3. **<jsp:useBean>**
   - **Descrizione**: Crea o individua un JavaBean, che può quindi essere utilizzato per archiviare dati o per eseguire logiche applicative.
   - **Quando usare**: Quando si vuole istanziare o accedere a un JavaBean nella pagina JSP per gestire dati persistenti, come un oggetto di un form.
   - **Sintassi**:

     ```jsp
     <jsp:useBean id="utente" class="com.example.Utente" scope="session" />
     ```

4. **<jsp:setProperty>**
   - **Descrizione**: Imposta il valore di una proprietà di un JavaBean creato con `<jsp:useBean>`.
   - **Quando usare**: Quando si vuole assegnare valori a proprietà di un JavaBean, ad esempio dati di input utente.
   - **Sintassi**:

     ```jsp
     <jsp:setProperty name="utente" property="nome" value="Mario" />
     ```

   - **Esempio di impostazione multipla**:

     ```jsp
     <jsp:setProperty name="utente" property="*" />
     ```

5. **<jsp:getProperty>**
   - **Descrizione**: Recupera il valore di una proprietà da un JavaBean per visualizzarlo nella pagina.
   - **Quando usare**: Quando si vuole visualizzare il valore di una proprietà precedentemente impostata in un JavaBean.
   - **Sintassi**:

     ```jsp
     <jsp:getProperty name="utente" property="nome" />
     ```

6. **<jsp:param>**
   - **Descrizione**: Utilizzato con `<jsp:include>`, `<jsp:forward>`, e `<jsp:plugin>`, permette di passare parametri a una risorsa JSP o servlet.
   - **Quando usare**: Quando è necessario trasferire parametri insieme a un'azione di inclusione o inoltro.
   - **Sintassi**:

     ```jsp
     <jsp:include page="header.jsp">
         <jsp:param name="utente" value="Mario" />
     </jsp:include>
     ```

7. **<jsp:plugin>**
   - **Descrizione**: Rende possibile l'integrazione di applet Java, includendo tag HTML specifici per visualizzare un'applicazione.
   - **Quando usare**: Quando si vuole includere e gestire un'applet Java in una pagina JSP.
   - **Sintassi**:

     ```jsp
     <jsp:plugin type="applet" code="MyApplet.class" width="300" height="200">
         <jsp:param name="param1" value="valore1" />
     </jsp:plugin>
     ```

---

### Esempio Completo di Uso delle Azioni JSP

Questa pagina JSP utilizza `<jsp:useBean>`, `<jsp:setProperty>`, e `<jsp:getProperty>` per creare un oggetto `Utente`, impostare le sue proprietà e visualizzarle.

```jsp
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Profilo Utente</title>
</head>
<body>

<jsp:useBean id="utente" class="com.example.Utente" scope="session" />
<jsp:setProperty name="utente" property="nome" value="Mario" />
<jsp:setProperty name="utente" property="cognome" value="Rossi" />

<h1>Profilo Utente</h1>
<p>Nome: <jsp:getProperty name="utente" property="nome" /></p>
<p>Cognome: <jsp:getProperty name="utente" property="cognome" /></p>

</body>
</html>
```

---

### Riepilogo delle Azioni Standard di JSP

| Tag             | Funzione                                               | Esempio                        |
|-----------------|--------------------------------------------------------|--------------------------------|
| `<jsp:include>` | Include dinamicamente un'altra risorsa JSP o file      | `<jsp:include page="header.jsp" />` |
| `<jsp:forward>` | Inoltra la richiesta a un'altra pagina                 | `<jsp:forward page="login.jsp" />` |
| `<jsp:useBean>` | Crea o individua un JavaBean                           | `<jsp:useBean id="utente" class="com.example.Utente" />` |
| `<jsp:setProperty>` | Imposta una proprietà di un JavaBean               | `<jsp:setProperty name="utente" property="nome" value="Mario" />` |
| `<jsp:getProperty>` | Recupera una proprietà da un JavaBean              | `<jsp:getProperty name="utente" property="nome" />` |
| `<jsp:param>`   | Passa parametri a una risorsa JSP o servlet            | `<jsp:param name="utente" value="Mario" />` |
| `<jsp:plugin>`  | Integra un’applet Java nella pagina                    | `<jsp:plugin type="applet" code="MyApplet.class" />` |

---

### Conclusioni

Le azioni standard JSP sono strumenti potenti che rendono più semplice l’inclusione di risorse, la gestione di JavaBean e la manipolazione di dati. La loro sintassi dichiarativa consente di ridurre il codice Java nella pagina JSP, migliorando la leggibilità e la manutenibilità del codice.
