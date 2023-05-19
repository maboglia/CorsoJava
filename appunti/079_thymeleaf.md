# Thymeleaf - Standard dialects

## Dialetti standard

Thymeleaf è molto, molto estensibile e ti consente di definire i tuoi set di attributi del modello (o anche tag) con i nomi che desideri, valutando le espressioni che desideri nella sintassi che desideri e applicando la logica che desideri. È più simile a un framework del motore di template.

Fuori dagli schemi, tuttavia, viene fornito con qualcosa chiamato dialetti standard (denominati Standard e SpringStandard) che definiscono un insieme di funzionalità che dovrebbero essere più che sufficienti per la maggior parte degli scenari. Puoi identificare quando questi dialetti standard vengono utilizzati in un modello perché conterrà attributi che iniziano con il prefisso th, come <span th:text="...">.

Si noti che i dialetti Standard e SpringStandard sono quasi identici, tranne per il fatto che SpringStandard include funzionalità specifiche per l'integrazione nelle applicazioni Spring MVC (come, ad esempio, l'utilizzo di Spring Expression Language per la valutazione delle espressioni invece di OGNL).

Nota anche che di solito ci riferiamo a caratteristiche nei dialetti standard quando parliamo di Thymeleaf senza essere più specifici.
Sintassi delle espressioni standard

La maggior parte degli attributi Thymeleaf consentono di impostare i loro valori come o contenenti espressioni, che chiameremo espressioni standard a causa dei dialetti in cui sono utilizzate. Questi possono essere di cinque tipi:

* `${...}` : Espressioni variabili.
* `*{...}` : Espressioni di selezione.
* `#{...}` : Espressioni messaggio (i18n).
* `@{...}` : espressioni di collegamento (URL).
* `~{...}` : Espressioni di frammenti.


## Espressioni variabili

Le espressioni variabili sono espressioni OGNL, o Spring EL se stai integrando Thymeleaf con Spring, eseguite sulle variabili di contesto, chiamate anche attributi del modello nel gergo di Spring. Sembrano così:

${sessione.nome.utente}

E li troverai come valori di attributo o come parte di essi, a seconda dell'attributo:

<span th:text="${libro.autore.name}">

L'espressione sopra è equivalente (sia in OGNL che in SpringEL) a:

((Libro)contesto.getVariable("libro")).getAuthor().getName()

Ma possiamo trovare espressioni variabili in scenari che non coinvolgono solo l'output, ma elaborazioni più complesse come condizionali, iterazione...

<li th:each="libro : ${libri}">

Qui ${libri} seleziona la variabile chiamata libri dal contesto e la valuta come un iterabile da utilizzare in un ciclo th:each.
## Espressioni di selezione

Le espressioni di selezione sono proprio come le espressioni di variabili, tranne per il fatto che verranno eseguite su un oggetto selezionato in precedenza anziché sull'intera mappa delle variabili di contesto. Sembrano così:

*{Nome del cliente}

L'oggetto su cui agiscono è specificato da un attributo th:object:

```html
<div th:object="${libro}">
   ...
   <span th:text="*{title}">...</span>
   ...
</div>
```

Quindi sarebbe equivalente a:

```java
{
   // th:object="${libro}"
   final Libro selection = (Libro) context.getVariable("libro");
   // th:text="*{titolo}"
   output(selezione.getTitle());
}
```


## Espressioni messaggio (i18n).

Le espressioni di messaggio (spesso chiamate esternalizzazione del testo, internazionalizzazione o i18n) ci consentono di recuperare messaggi specifici della locale da fonti esterne (file .properties), facendovi riferimento da una chiave e (facoltativamente) applicando una serie di parametri.

Nelle applicazioni Spring, questo si integrerà automaticamente con il meccanismo MessageSource di Spring.

* `# {titolo principale}`

* `# {messaggio.entrycreated(${entryId})}`

Puoi trovarli in modelli come:

```html
<table>
   ...
   <th th:text="#{header.address.city}">...</th>
   <th th:text="#{header.address.country}">...</th>
   ...
</table>
```

Nota che puoi usare le espressioni variabili all'interno delle espressioni del messaggio se vuoi che la chiave del messaggio sia determinata dal valore di una variabile di contesto, o vuoi specificare le variabili come parametri:

* `# {${config.adminWelcomeKey}(${session.user.name})}`

## Espressioni di collegamento (URL).

Le espressioni di collegamento hanno lo scopo di creare URL e aggiungere informazioni utili sul contesto e sulla sessione (un processo solitamente chiamato riscrittura degli URL).

Quindi, per un'applicazione web distribuita nel contesto /myapp del tuo server web, un'espressione come:

* `<a th:href="@{/order/list}">...</a>`

Potrebbe essere convertito in qualcosa del genere:

* `<a href="/myapp/order/list">...</a>`

O anche questo, se dobbiamo mantenere le sessioni e i cookie non sono abilitati (o il server non lo sa ancora):

* `<a href="/myapp/order/list;jsessionid=23fa31abd41ea093">...</a>`

Gli URL possono anche accettare parametri:

* `<a th:href="@{/order/details(id=${orderId},type=${orderType})}">...</a>`

Il risultato è qualcosa del genere:

<!-- Notare che le e commerciali (&) devono avere caratteri di escape HTML negli attributi dei tag... -->
* `<a href="/myapp/order/details?id=23&amp;type=online">...</a>`

Le espressioni di collegamento possono essere relative, nel qual caso nessun contesto dell'applicazione sarà preceduto dall'URL:

* `<a th:href="@{../documents/report}">...</a>`

Anche relativo al server (di nuovo, nessun contesto dell'applicazione da prefissare):

* `<a th:href="@{~/contents/main}">...</a>`

E relativo al protocollo (proprio come gli URL assoluti, ma il browser utilizzerà lo stesso protocollo HTTP o HTTPS utilizzato nella pagina visualizzata):

* `<a th:href="@{//static.mycompany.com/res/initial}">...</a>`

E, naturalmente, le espressioni Link possono essere assolute:

* `<a th:href="@{http://www.mycompany.com/main}">...</a>`

Ma aspetta, in un URL assoluto (o relativo al protocollo)... quale valore aggiunge l'espressione link Thymeleaf? facile: la possibilità di riscrittura degli URL definita dai filtri di risposta: in un'applicazione web basata su Servlet, per ogni URL in output (relativo al contesto, relativo, assoluto...) Thymeleaf chiamerà sempre il meccanismo HttpServletResponse.encodeUrl(...) prima di visualizzare l'URL. Ciò significa che un filtro può eseguire la riscrittura dell'URL personalizzata per l'applicazione mediante il wrapping dell'oggetto HttpServletResponse (un meccanismo comunemente utilizzato).


## Espressioni di frammenti

Le espressioni di frammenti sono un modo semplice per rappresentare frammenti di markup e spostarli nei modelli. Grazie a queste espressioni, i frammenti possono essere replicati, passati ad altri template come argomenti e così via.

L'uso più comune è per l'inserimento di frammenti utilizzando th:insert o th:replace:

```html
<div th:insert="~{commons :: main}">...</div>
```

Ma possono essere usati ovunque, proprio come qualsiasi altra variabile:

```html
<div th:with="frag=~{footer :: #main/text()}">
   <p th:insert="${frag}">
</div>
```

Le espressioni di frammenti possono avere argomenti:
Letterali e operazioni

Sono disponibili un buon gruppo di tipi di letterali e operazioni:

* Letterali:
  * Valori letterali di testo: 'un testo', 'Un altro!',…
  * Valori letterali numerici: 0, 34, 3.0, 12.3,…
  * Valori letterali booleani: vero, falso
  * Letterale nullo: nullo
  * Token letterali: one, sometext, main,...
* Operazioni di testo:
  * Concatenazione di stringhe: +
  * Sostituzioni letterali: |Il nome è ${nome}|
* Operazioni aritmetiche:
  * Operatori binari: +, -, *, /, %
  * Segno meno (operatore unario): -
* Operazioni booleane:
  * Operatori binari: e, o
  * Negazione booleana (operatore unario): !, not
* Confronti e uguaglianza:
  * Comparatori: >, <, >=, <= (gt, lt, ge, le)
  * Operatori di uguaglianza: ==, != (eq, ne)
* Operatori condizionali:
  * If-then: (if) ? (then)
  * If-then-else: (if) ? (then) : (else)
  * Default: (value) ?: (defaultvalue)

## Preelaborazione delle espressioni

Un'ultima cosa da sapere sulle espressioni è che c'è qualcosa chiamato preelaborazione delle espressioni, specificato tra `__`, che assomiglia a questo:

* `# {selezione.__${sel.codice}__}`

Quello che stiamo vedendo è un'espressione variabile (`${sel.code}`) che verrà eseguita per prima e il cui risultato – diciamo, "ALL" – verrà utilizzato come parte dell'espressione reale da eseguire successivamente, in questo caso uno di internazionalizzazione (che cercherebbe il messaggio con il tasto selection.ALL).
Alcuni attributi di base

Diamo un'occhiata a un paio degli attributi più basilari nel dialetto standard. A partire da th:text, che sostituisce semplicemente il corpo di un tag (notare nuovamente le capacità di prototipazione qui):

* `<p th:text="#{msg.welcome}">Benvenuti a tutti!</p>`

Ora th:each, che ripete l'elemento in cui si trova tante volte quante specificate dall'array o dall'elenco restituito dalla sua espressione, creando anche una variabile interna per l'elemento di iterazione con una sintassi equivalente a quella di un'espressione Java foreach:

* `<li th:each="book : ${books}" th:text="${book.title}">En las Orillas del Sar</li>`

Infine, Thymeleaf include molti attributi per specifici attributi XHTML e HTML5 che valutano semplicemente le loro espressioni e impostano il valore di questi attributi sul loro risultato. I loro nomi imitano quelli degli attributi che impostano i valori:

* `<form th:action="@{/createOrder}">`

* `<input type="button" th:value="#{form.submit}" />`

* `<a th:href="@{/admin/users}">`
