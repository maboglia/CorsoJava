# Thymeleaf Expressions in SpringBoot

Thymeleaf ci consente di creare viste dinamiche tramite un ampio uso di espressioni nei file template. La forma semplice delle espressioni rientra in quattro categorie principali.
Espressioni variabili

Le espressioni variabili sono quelle più comunemente utilizzate nei templates di thymeleaf. Queste espressioni aiutano a legare i dati dal contesto del template (model) nell'html risultante (vista). Ad esempio, il seguente frammento inserisce il valore di userInfo.getFirstName() come testo all'interno del div. Allo stesso modo, il flag attivo decide se la casella di controllo è selezionata o meno.

```html
<div th:text="${userInfo.firstName}"></div>
<input type="checkbox" name="active" th:checked="${userInfo.active}"/>

```

Qui, l'espressione ${userInfo.firstName} è un'espressione OGNL equivalente a

((UserInfo)context.getVariable("userInfo")).getFirstName()
Linguaggio del codice: CSS (css)

Espressioni di selezione Thymeleaf

L'espressione di selezione ti consente di selezionare uno specifico attributo figlio dal contesto corrente di thymeleaf. Per usare queste espressioni devi prima definire un attributo th:object. Successivamente, è possibile utilizzare le espressioni di selezione per estrapolare i campi appropriati.

Diciamo che abbiamo un oggetto userInfo che contiene firstName e lastName. Quindi, invece di fare ${userInfo.firstName} ogni volta, puoi fare qualcosa del genere.

```html
<div th:object="userInfo">
     <div th:text="*{firstName}"></div>
     <div th:text="*{lastName}"></div>
</div>
```

Il frammento di cui sopra è equivalente al seguente.

```html
<div>
     <div th:text="${userInfo.firstName}"></div>
     <div th:text="${userInfo.lastName}"></div>
</div>
```

Le espressioni di selezione sono migliori se utilizzate insieme agli elementi del modulo. Poiché gli input del modulo sono mappati su un @ModelAttribute, è più facile associarli senza doversi preoccupare di gestire ogni singolo elemento di input. Ecco un esempio per questo.

```html
<form method="post" th:action="@{/}" th:object="${userInfo}">
     <input type="text" th:field="*{firstName}"/>
     <input type="text" th:field="*{lastName}"/>
     <input type="submit" value="Crea utente">
</form>
```

Se vuoi saperne di più sulla gestione dei moduli, dai un'occhiata a Gestione dei moduli Thymeleaf in Spring Boot.
Espressioni di messaggi nelle viste Thymeleaf

Le espressioni di messaggio consentono di esternalizzare testi comuni in un file delle proprietà. Questi valori possono quindi essere indicati nel template come #{message.property.key}. Supponiamo che tu abbia un messaggio di benvenuto che vuoi mostrare su ogni visualizzazione. Tuttavia, l'hardcoding di questo messaggio su tutte queste visualizzazioni è una cattiva idea. Quindi creiamo un message.properties.

welcome.text=Saluti collega utente..!

Thymeleaf cercherà questo file (posizionalo sotto src/main/resources/) nel percorso di classe e risolverà i loro valori. Ecco un semplice esempio per questa espressione.

```html
<h1 th:text="#{welcome.text}">Ciao utente!</h1>
```

Un altro aspetto positivo dell'espressione del messaggio è che possono avere segnaposto. Quindi è possibile anche quanto segue.

`welcome.text=Saluti {0}..!`

Con questa impostazione delle proprietà è possibile quanto segue.
messaggi con segnaposto statici

È possibile passare un semplice valore letterale stringa per riempire i segnaposto. Anche se questo è possibile, non c'è alcun uso pratico per questa implementazione.

```html
<h1 th:text="#{welcome.text('User')}">Ciao utente!</h1>
```

Il caso ideale con messaggi contenenti segnaposto sarebbe utilizzare un'espressione variabile. Ad esempio, la configurazione seguente darebbe il benvenuto all'utente con il suo nome attuale.

```html
<h1 th:text="#{welcome.text(${userInfo.firstName})}">Ciao utente!</h1>
```

Una singola voce message.properties può contenere più di un segnaposto. In tali casi, i parametri possono essere un elenco separato da virgole proprio come una chiamata al metodo.
Espressioni di collegamento per la ricerca del controller

Per una vista html, gli URL sono molto importanti. Per questo motivo, thymeleaf fornisce espressioni URL per valutarle nei percorsi del controller utilizzando il formato` @{expression}`. Nei templates thymeleaf, un URL può essere uno dei seguenti.

* URL assoluti che sono URL completi. Ad esempio, https://example.com/tags/thymeleaf/
* URL relativi che sono,
  * Relativo alla pagina corrente. Ad esempio gestire/modificare
  * Relativo al percorso di contesto. Ad esempio, /users/manage/edit Se il server dispone di un percorso di contesto (server.servlet.context-path), verrà aggiunto al valore.
  * Relativo alla radice del server. Ad esempio ~/some/path/ Questo caso si verifica quando l'applicazione è ospitata insieme ad altre applicazioni nello stesso dominio o IP.
  * Infine, Protocollo relativo. Ad esempio //cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.3/css/bootstrap.min.css. Questo è simile all'URL assoluto, tranne per il fatto che l'URL avrà lo schema http o https per il protocollo basato sul protocollo del server.

L'esempio seguente rappresenta ciascuna di queste implementazioni di URL.

```html
<a th:href="@{<https://example.com/tags/thymeleaf/}">exampleSite</a>
<a th:href="@{//example.com/tags/thymeleaf/}">exampleSite Ma relativo al protocollo del server</a>
<a th:href="@{manage/edit}">Modifica pagina</a>
<a th:href="@{/users/manage/edit}">Un altro modo per modificare la pagina</a>
<a th:href="@{~/corporate/contact-us/}">Contattaci</a>
```

Ad un certo punto questi URL possono contenere variabili di percorso. In questi casi, puoi utilizzare i segnaposto per valutarli proprio come i controller mvc come mostrato di seguito.

```html
<a th:href="@{/users/{userId}/edit(userId=${userInfo.id})}">Visualizza utente per ID</a>
```

Qui {userId} è il segnaposto. Riempi questo segnaposto tramite espressioni usando (userId=${userInfo.id}). Se il tuo URL contiene più segnaposto, puoi utilizzare la mappatura separata da virgole. Ad esempio, supponiamo che currentOperation prenda i valori tra "Visualizza", "Aggiorna" e "Elimina". In questo modo possiamo personalizzare ulteriormente il link sopra come mostrato di seguito.

```html
<a th:href="@{/users/{userId}/{operation(userId=${userInfo.id},operation=${currentOperation})}"
    th:text="${currentOperation + ' user by Id'">
</a>
```

Conclusione

Per concludere, queste sono le categorie importanti di espressioni di thymeleaf in Spring Boot. Puoi saperne di più su thymeleaf e Spring Boot dai seguenti post.
