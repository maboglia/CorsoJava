# Tipi di espressione in Thymeleaf

1. Panoramica

Thymeleaf è un motore di template popolare nell'ecosistema Java. Aiuta a associare i dati dal livello del controller al livello di visualizzazione. Gli attributi Thymeleaf vengono impostati utilizzando le espressioni. In questo tutorial, discuteremo i tipi di espressione con esempi.
2. Installazione di esempio

Useremo una semplice applicazione web Bulba come esempio. È una semplice app Web per creare un profilo di Bulbasauro.

Innanzitutto, creiamo una classe modello per il nostro Bulbasauro:

classe pubblica Bulba {
     ID int privato;
     nome della stringa privata;
     // costruttori
     // getter e setter
}

Successivamente, creiamo una classe controller:

@Controller
public class BulbaController {

     @RequestMapping("/")
     public String BulbaList(modello modello) {
         Bulba Bulbas = new Bulba(1, "alpha", "red", 50);
         model.addAttribute("Bulbas", Bulbasauri);
         restituire "indice";
     }
}

Con la nostra configurazione di esempio, saremo in grado di iniettare un'istanza di Bulba nei nostri file modello.
freestar
3. Espressione variabile

L'espressione variabile aiuta a inserire i dati dal controller nel file modello. Espone gli attributi del modello alla visualizzazione Web.

La sintassi dell'espressione variabile è una combinazione di simbolo del dollaro e parentesi graffe. Il nome della nostra variabile risiede all'interno delle parentesi graffe:

${...}

Iniettiamo i nostri dati Bulba nel file modello:

<span th:text="${Bulbas.id}"></span>
<span th:text="${Bulbas.name}"></span>

I condizionali e l'iterazione possono anche utilizzare un'espressione variabile:

<!-- per iterare -->
<div th:each="Bulbas : ${Bulbas}">

<!-- nei condizionali -->
<div th:if="${Bulbas.id == 2}">

4. Espressione di selezione
L'espressione di selezione opera su un oggetto scelto in precedenza. Ci aiuta a selezionare il figlio dell'oggetto scelto.

La sintassi dell'espressione di selezione è una combinazione di asterisco e parentesi graffe. Il nostro oggetto figlio risiede all'interno delle parentesi graffe:
freestar

*{...}

Selezioniamo l'id e il nome della nostra istanza Bulba e inseriamolo nel nostro file modello:

<div th:object="${Bulbas}">
     <p th:text="*{id}">
     <p th:text="*{name}">
</div>

Inoltre, l'espressione di selezione viene utilizzata principalmente all'interno di un modulo in HTML. Aiuta a associare gli input del modulo con gli attributi del modello.

A differenza dell'espressione variabile, non è necessario trattare ogni elemento di input individualmente. Usando la nostra app web Bulba come esempio, creiamo una nuova istanza di Bulba e leghiamola al nostro attributo modello:

<form action="#" th:action="@{/Bulba}" th:object="${Bulbas}" method="post">
     <p>Id: <input type="text" th:field="*{id}" /></p>
     <p>Nome: <input type="text" th:field="*{name}" /></p>
</form>

5. Espressione del messaggio

Questa espressione aiuta a portare il testo esternalizzato nel nostro file modello. Si chiama anche esternalizzazione del testo.

La fonte esterna in cui risiede il nostro testo potrebbe essere un file .properties. Questa espressione è dinamica quando ha uno o più segnaposto.

La sintassi dell'espressione del messaggio è una combinazione di hash e parentesi graffe. La nostra chiave risiede all'interno delle parentesi graffe:

# {...}

Ad esempio, supponiamo di voler visualizzare un messaggio specifico in tutte le pagine della nostra app Web Bulba. Possiamo inserire il messaggio in un file messages.properties:

welcome.message=benvenuto nel mondo Bulba.

Per associare il messaggio di benvenuto ai nostri modelli di visualizzazione, possiamo fare riferimento ad esso tramite la sua chiave:

<h2 th:text="#{welcome.message}"></h2>

Possiamo fare in modo che l'espressione del messaggio accetti i parametri aggiungendo un segnaposto nel nostro file esterno:

Bulba.color=il rosso è il mio preferito, il mio è {0}

Nel nostro file modello, faremo riferimento al messaggio e aggiungeremo un valore al segnaposto:

<h2 th:text="#{Bulba.color('blue')}"></h2>

Inoltre, possiamo rendere dinamico il segnaposto inserendo un'espressione variabile come valore del segnaposto:

<h2 th:text="#{Bulba.color(${Bulba.color})}"></h2>

Questa espressione è anche chiamata internazionalizzazione. Può aiutarci ad adattare la nostra applicazione web per adattarsi a lingue diverse.
6. Espressione di collegamento
Le espressioni di collegamento sono parte integrante della creazione di URL. Questa espressione si collega all'URL specificato.

La sintassi dell'espressione di collegamento è una combinazione del segno "chiocciola" e delle parentesi graffe. Il nostro collegamento risiede all'interno delle parentesi graffe:

@{...}

Gli URL possono essere assoluti o relativi. Quando si utilizza un'espressione di collegamento con URL assoluti, si lega all'URL completo che inizia con "http(s)":

<a th:href="@{http://www.example.com}"> Casa example</a>

Un collegamento relativo, invece, si lega al contesto del nostro server web. Possiamo facilmente navigare attraverso i nostri file modello come definito nel controller:
freestar

@RequestMapping("/create")
public String BulbaCreate(modello modello) {
     model.addAttribute("Bulbas", new Bulba());
     return "modulo";
}

Possiamo richiedere la pagina come specificato in @RequestMapping:

<a th:href="@{/create}">Invia un altro Bulbasauro</a>

Può accettare parametri tramite variabili di percorso. Supponiamo di voler fornire un collegamento per modificare un'entità esistente. Possiamo invocare l'oggetto we vogliamo modificare attraverso il suo id. Le espressioni di collegamento possono accettare l'id come parametro:

<a th:href="/@{'/edit/' + ${Bulba.id}}">Modifica</a>

Le espressioni di collegamento possono impostare URL relativi al protocollo. Il protocollo relativo è come un URL assoluto. L'URL utilizzerà lo schema del protocollo HTTP o HTTPS, a seconda del protocollo del server:

<a th:href="@{//example.com}">example</a>

7. Espressione del frammento

L'espressione del frammento può aiutarci a spostare i markup tra i nostri file modello. L'espressione ci consente di generare un frammento di markup mobile.

La sintassi dell'espressione del frammento è una combinazione di tilde e parentesi graffe. Il nostro frammento risiede all'interno delle parentesi graffe:

~{...}

Per la nostra app web Bulba, creiamo un piè di pagina nel nostro file index.html con un attributo fragment:

<div th:fragment="footer">
     <p>Copyright 2022</p>
</div>

Ora possiamo inserire il piè di pagina in altri file modello:

<div th:replace="~{index :: footer}"></div>

