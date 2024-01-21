# Elementi fondamentali JSP

## Utilizzo degli Oggetti Impliciti (Built-in) in JSP

JSP (JavaServer Pages) semplifica la programmazione web fornendo oggetti impliciti, istanziati automaticamente nell'ambiente JSP. Non è necessario importarli o istanziarli manualmente, rendendo più agevole lo sviluppo delle pagine. Per accedervi, è sufficiente utilizzare la sintassi `nomeOggetto.nomeMetodo`.

---

## Oggetti Impliciti Disponibili in Pagine JSP

Gli oggetti impliciti in JSP sono accessibili direttamente nelle pagine senza la necessità di dichiararli. I principali oggetti sono:

* `out`: Per scrivere codice HTML nella risposta (analogamente a System.out di Java).
* `session`: Contiene dati specifici della sessione utente corrente.
* `request`: Fornisce informazioni sulla richiesta HTTP, inclusi attributi, header, cookie, parametri, ecc.
* `page`: Rappresenta la pagina JSP e le sue proprietà.
* `config`: Contiene dati di configurazione per la pagina.
* `response`: Rappresenta la risposta HTTP e le sue proprietà.
* `application`: Contiene dati condivisi da tutte le pagine della web application.
* `exception`: Utilizzato per gestire eventuali eccezioni lanciate dal server, utile per pagine di errore.
* `pageContext`: Fornisce dati di contesto per l'esecuzione della pagina.

---

## Categorie di Oggetti Impliciti in JSP

Gli oggetti impliciti in JSP possono essere suddivisi in diverse categorie:

* **Oggetti legati alla servlet relativa alla pagina JSP**: Come `out` e `page`.
* **Oggetti legati all'input e all'output della pagina JSP**: Come `request` e `response`.
* **Oggetti che forniscono informazioni sul contesto di esecuzione**: Come `session` e `application`.
* **Oggetti risultanti da eventuali errori**: Come `exception`.

Questo approccio semplifica notevolmente la gestione delle informazioni e l'interazione con l'ambiente di esecuzione all'interno delle pagine JSP.

---

## Ambito delle Variabili in JSP

L'ambito definisce dove e per quanto tempo saranno accessibili le variabili, inclusi gli oggetti impliciti, JavaBeans, ecc. In JSP, le variabili possono avere diversi ambiti:

* **`page` (di pagina)**: L'oggetto o la variabile è accessibile solo nella servlet che rappresenta la pagina JSP.
* **`request` (di richiesta)**: L'oggetto viene creato durante la richiesta e distrutto dopo l'uso.
* **`session` (di sessione)**: L'oggetto è accessibile durante tutta la durata della sessione dell'utente.
* **`application` (di applicazione)**: L'oggetto è accessibile nella servlet che rappresenta la pagina ed è condiviso da tutte le richieste della web application.

---

## Ciclo di Vita di una Pagina JSP

Il ciclo di vita di una pagina JSP comprende diverse fasi:

1. **Salvataggio**: La pagina viene salvata nella cartella pubblica del server web alla prima richiesta ricevuta dal Web server.
2. **Traduzione**: La pagina JSP viene automaticamente tradotta in un sorgente Java chiamato **Servlet**.
3. **Compilazione**: La servlet viene compilata come un programma Java.
4. **Esecuzione**: La servlet viene caricata in memoria ed eseguita.
5. **Esecuzione Successiva**: Successivamente, la pagina JSP (la servlet) viene solo eseguita. In fase di debug, il web server verifica se la pagina JSP è più recente del servlet corrispondente.

Rispetto ad altre tecnologie server-side come PHP o ASP, questa differenza è vantaggiosa in termini di velocità di risposta. Dopo la prima esecuzione, il codice è già compilato e disponibile immediatamente. In PHP e ASP, il web server deve interpretare il codice ad ogni richiesta prima di servire la pagina di risposta.

---

## Elementi di una Pagina JSP

Una pagina JSP è costituita da diversi elementi:

* **Codice HTML**: Contenuto HTML normale per la presentazione.
* **Marcatori JSP**: Sono segnali per l'inizio e la fine di porzioni di codice Java all'interno della pagina JSP.
* **Direttive al Server**: `<%@ direttive %>` per fornire informazioni al server, come importazioni e configurazioni.
* **Elementi di Scripting**: `<%! dichiarazioni %>`, `<%= espressioni %>`, `<% scriptlet %>` per inserire codice Java all'interno della pagina.
* **Commenti**: `<%-- commenti --%>` per aggiungere commenti che non saranno visibili nella pagina generata.
* **Azioni Standard**: Utilizzo di tag JSP come `<jsp:include>`, `<jsp:forward>`, `<jsp:param>`, `<jsp:useBean>`, `<jsp:setProperty>`, `<jsp:getProperty>`, `<jsp:plugin>`.
* **Azioni Personalizzate (Custom Tags)**: Utilizzo di tag personalizzati tramite librerie di tag (Tag Libraries), come ad esempio le tag libraries JSTL (JavaServer Pages Standard Tag Library).

Questi elementi consentono di creare pagine dinamiche e interattive, incorporando logica Java all'interno del contenuto HTML.

---

## Inclusioni JSP

![JSP include](https://raw.githubusercontent.com/maboglia/CorsoJava/master/appunti/img/prj_JSP_schema_inclusioni.png)