# Java e i DBMS: il JDBC

---

Una delle operazioni più comuni in un’applicazione web è la gestione di dati
immagazzinati in un database.
L'accesso ai dati in Java si effettua usando il package JDBC (Java DataBase
Connectivity). 


---

## Un uso tipico delle classi JDBC prevede i seguenti passi:

* Si rende disponibile il driver JDBC per il DBMS in uso nel classpath di Java.
* Si carica il driver facendo riferimento alla classe che lo implementa tramite metodo
Class.forName
* Si procede con la creazione dell'oggetto Connenction tramite il metodo statico getConnetion
della classe DriverManager.
* I tre parametri del metodo sono il nome utente e password da usare per l'accesso al DBMS e la
stringa di connessione JDBC, che specifica l'indirizzo del DBMS e il database da selezionare:
Questa stringa ha un formato che varia a seconda del DBMS in uso.

---

* Si crea un oggetto Statement sulla connessione, usando il metodo createStatement.
* Si invia la query SQL, sotto forma di stringa, al DBMS tramite lo Statement creato e il suo
metodo executeQuery.
* L'oggetto restituito, di tipo ResultSet, permette di navigare tra i risultati della query.
* Se invece si desidera inviare una query che non restituisce risultati, ad esempio di inserimento
o aggiornamento, si usa il metodo executeUpdate. In questo caso, il valore restituito è un intero
che rappresenta il numero di record interessati dalla query stessa.

---

* Una volta prelevati i risultati, si libera lo spazio a loro riservato chiamando il metodo close
dello Statement.
Infine, terminato l'uso della base di dati, si può chiudere la connessione corrispondente
chiamando il metodo close della Connection.
Tutte le istruzioni JDBC, in caso di errore, sollevano eccezioni derivate da
SQLException.

---

Java e i DBMS: il JDBC
Esempio
import java.sql.*;
Class.forName (“com.mysql.jdbc.Driver”);

---

Connection con = DriverManager.getConnection(
“jdbc:mysql://localhost/webdb”,”user”, ”pass”);
Statement stmt1 = con.createStatement();
ResultSet rs = stmt1.executeQuery(
“SELECT * FROM test”);
...
rs.close();
stmt1.close();
Statement stmt2 = con.createStatement();
int rc = stmt.executeUpdate(“DELETE FROM test”);
stmt2.close();
con.close();

---

In questo esempio, si crea una
connessione a un database MySQL.
La classe del driver JDBC, scaricato
dal sito del produttore del DBMS, è
com.mysql.jdbc.Driver
La stringa di connessione specifica
il tipo di DBMS (mysql) il punto di
ascolto del DBMS (localhost), e il
database da selezionare (webdb).
Alla connessione vengono anche
passati la username e la password
dell’utente con cui autenticarsi nel
DBMS.
Viene eseguita prima una query di
selezione tramite executeQuery e
poi una di cancellamento tramite
executeUpdate;

---

## Java e i DBMS: il JDBC

I ResultSet

---

Tramite il ResultSet restituito dal metodo executeQuery è
possibile leggere le colonne di ciascun record restituito da
una query di selezione.
I record devono essere letti uno alla volta: in ogni
momento, il ResultSet punta (tramite un cursore) a uno
dei record restituiti (record corrente).
I valori dei vari campi del record corrente possono essere
letti tramite i metodi getX(nome_colonna), dove X è il tipo
base Java per il dato da estrarre (ad esempio getString,
getInt, ...) e nome_colonna è il nome del campo del record
da leggere.
Per spostare il cursore del RecordSet al record successivo,
si usa il metodo next. Il metodo restituisce false quando i
record sono esauriti.

---

Java e i DBMS: il JDBC
I ResultSet - Esempio
import java.sql.*;
Class.forName (“com.mysql.jdbc.Driver”);
Connection con = DriverManager.getConnection(
“jdbc:mysql://localhost/webdb”,”user”, ”pass”);
Statement stmt1 = con.createStatement();
ResultSet rs = stmt1.executeQuery(
“SELECT* FROM test”);
while (rs.next()) {
System.out.println(“nome = ”+ rs.getString(“nome”));
}
rs.close();
stmt1.close();
con.close();

* In questo esempio, utilizziamo un
ciclo while per iterare tra i
risultati di una query di selezione.
Per ogni record viene stampato il
valore del campo nome, di tipo
stringa.

---

Java e i DBMS: il JDBC

## Limiti del metodo d’uso “standard”

---

In un’applicazione web data intensive, in cui gli
accessi al database sono molti e spesso concorrenti
(più utenti connessi all’applicazione
contemporaneamente), il “normale” pattern d’uso de
JDBC presenta notevoli problemi.
Infatti, l’apertura di una connessione al database è
di solito un’operazione costosa, in quanto come si è
visto richiede

---

Caricamento driver
Connessione al DBMS server
Autenticazione
E’ necessario limitare l’overhead dovuto a queste
operazioni, per rendere la web application più veloce
possibile.

---

Il Connection Pooling

* Il connection pooling è una tecnica che permette di
snellire le procedure di apertura delle connessioni JDBC
utilizzando una cache di connessioni, chiamata
connection pool.

---

* Il pool mantiene una serie di connessioni al database già aperte e
inizializzate.
Quando l’applicazione vuole connettersi, preleva dal pool una
connessione già pronta, sulla quale può operare direttamente.
Quando l’applicazione chiude la connessione, questa in realtà
rimane aperta e viene reinserita nel pool, in attesa di essere
riutilizzata per altre richieste.
Il pool viene inizialmente riempito con un certo numero di
connessioni pronte. Tuttavia, se il pool si svuota (cioè tutte le sue
connessioni sono in uso) e c’è richiesta di nuove connessioni,
queste vengono create automaticamente, allargando il pool.
Le connessioni lasciate inutilizzate nel pool per troppo tempo
possono venir chiuse automaticamente per liberate le
corrispondenti risorse del DBMS.

---

Il Connection Pooling
Supporto negli application server

---

* Il supporto al connection pooling, incorporato nelle
più recenti versioni del JDBC, deve ovviamente avere
supporto da parte del software (proprio come con i
driver JDBC).
Tutti i più diffusi application server forniscono
un’implementazione del connection pooling, ed
esistono anche librerie esterne utilizzabili per
aggiungere questo supporto al di fuori degli
application server.
Attenzione: ogni application server fornisce sistemi
proprietari per configurare il connection pooling.
Vedremo in particolare come si utilizza il connection
pooling su Tomcat.

---

Il Connection Pooling
Uso con Tomcat

* Per configurare il connection pooling in Tomcat, si
procede come segue:

---

* Si configura la connessione al database nel contesto della
web application, agendo sul server.xml (globale) o, meglio,
sul context.xml (configurazione specifica dell’applicazione).
Si inserisce nel deployment descriptor (web.xml) un
riferimento alla connessione, che diventa così una risorsa
dell’applicazione di tipo DataSource.
Nel codice, si preleva un riferimento al DataSource
utilizzando lo standard Java Naming and Directory Interface
(JNDI).
Si crea una normale connessione JDBC attraverso il
DataSource.
Si chiude la connessione al termine del suo uso.

---

Il Connection Pooling
Configurazione del contesto dell’applicazione (context.xml) per Tomcat
<Context path="/Esempio_Database_Pooling">
<Resource
name="jdbc/webdb2"
type="javax.sql.DataSource"
auth="Container"
driverClassName="com.mysql.jdbc.Driver"
url="jdbc:mysql://localhost/webdb"
username="website"
password="webpass"
maxActive="10"
maxIdle="5"
maxWait="10000"
/>
</Context>

---

* La connessione è configurata all’interno di un
elemento Resource, che ne contiene tutte le
caratteristiche, compreso il driver, la
username, la password e la stringa di
connessione.
Il type deve essere indicato come
javax.sql.DataSource. L’attributo auth va
impostato su “container”.
Gli attributi maxActive, maxIdle e maxWait
servono a dimensionare il pool, indicando

---

Quante connessioni al massimo il pool dovrà
contenere
Quante connessioni inutilizzate sono ammesse
nel pool in ogni momento
Quanto tempo attendere perché una nuova
connessione diventi disponibile
Attenzione: il driver indicato andrà copiato
nella directory lib di Tomcat. Se lo si copia
semplicemente nella WEB-INF/lib
dell’applicazione (come parte del
deployment), esso sarà invisibile al class
loader usato per il pooling!

---

Il Connection Pooling
Configurazione del deployment descriptor (web.xml)
<web-app version="2.5"
xmlns="http://java.sun.com/xml/ns/javaee"
xmlns:xsi="<http://www.w3.org/2001/XMLSchema->
instance"
xsi:schemaLocation="<http://java.sun.com/xml/ns/javaee>
<http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd>">
...
<resource-ref>
<res-ref-name>jdbc/webdb2</res-ref-name>
<res-type>javax.sql.DataSource</res-type>
<res-auth>Container</res-auth>
<res-sharing-scope>Shareable</res-sharing-scope>
</resource-ref>
...
</web-app>

---

Nel deployment descriptor si
inserisce un riferimento alla
risorsa JNDI con un elemento
resource-ref.
Gli attributi res-type e res-
auth rispecchiano quelli type
e res scritti nella definizione
della Resource
res-sharing-scope dovrebbe
generalmente essere posto a
“Shareable”
L’attributo res-ref-name
indica il nome JNDI utilizzato
per la risorsa all’interno del
codice. Le risorse di tipo
DataSource hanno
convenzionalmente un nome
che inizia con “jdbc/”.

---

Il Connection Pooling
Uso nel codice Java
try {
//preleviamo un riferimento al naming context
InitialContext ctx = new InitialContext();
//e otteniamo un riferimento al DataSource
DataSource ds =
(DataSource) ctx.lookup(“java:comp/env/jdbc/webdb2”);
//connessione al database locale
connection = ds.getConnection();
//...usiamo la connessione...
} catch (NamingException ex) {
//eccezione sollevata nel caso la risorsa richiesta non
esista
} catch (SQLException ex) {
//eccezione standard per le operazione JDBC
} finally {
//alla fine le connessione DEVE essere chiusa!
try { connection.close(); } catch (SQLException ex) {}
}

---

* Si crea un JNDI naming context
(InitialContext)
Si ricerca nel contesto la risorsa
necessaria. Notare che al nome
configurato nel deployment descriptor
va aggiunto sempre il prefisso
“java:comp/env/”. Può essere utile
usare un parametro della web
application per configurare questo nome
al di fuori del codice.
Si fa un cast dell’oggetto restituito sul
tipo effettivo della risorsa (DataSource)
Si crea la Connection JDBC usando il
metodo getConnection() del
DataSource.
Dopo aver operato sulla connessione, la
si chiude normalmente, determinandone
il reinserimento nel pool. Attenzione:
se non si chiude, la connessione non
rientrerà nel pool!

---

ServletContextListener

---

* Per rendere ancora più rapido il connection pooling è possibile
eseguire la procedura di lookup della risorsa una sola volta,
all’avvio dell’applicazione.
A questo scopo possiamo servirci di un context listener, utile in
generale anche per eseguire ogni operazione di “inizializzazione
globale” (non specifica per una particolare servlet) della web
application.
Oggetti che implementano l’interfaccia ServletContextListener
possono essere associati all’applicazione dichiarandoli
opportunamente nel deployment descriptor (web.xml).
I due metodi contextInitialized e contextDestroyed di questi
oggetti vengono chiamati rispettivamente all’avvio e alla
chiusura della web application.
I metodi possono, tra l’altro, leggere modificare il
ServletContext che verrà poi passato a tutte le servlet in fase di
esecuzione.

---

ServletContextListener
Uso in associazione col Connection Pooling - Esempio
public class ContextInitializer implements
ServletContextListener {
public void contextInitialized(ServletContextEvent sce) {
try {
InitialContext ctx = new InitialContext();
DataSource ds = (DataSource)
ctx.lookup(“java:comp/env/jdbc/webdb2”);
sce.getServletContext().setAttribute("datasource", ds);
} catch (NamingException ex) { ... }
}
public void contextDestroyed(ServletContextEvent sce)
{ //niente da fare (il datasource si chiude da solo)
}
}

---

* <listener>

<listener-class>
it.univaq.f4i.iw.examples.ContextInitializer
</listener-class>
</listener>
Questo context listener
esegue le operazioni di
lookup del DataSource
all’avvio della web
application, e pone un
riferimento al DataSource
risultante come attributo nel
ServletContext.
Le singole servlet potranno
prelevarlo semplicemente
con un’istruzione del tipo
getServletContext().getAttri
bute(“datasource”)
Perché il listener sia
elaborato, è sufficiente
aggiungere il frammento in
basso, che ne specifica la
classe, nel web.xml.

---

Riferimenti
Servlet API
<http://docs.oracle.com/cd/E17802_01/products/>
products/servlet/2.5/docs/servlet-2_5-
mr2/overview-summary.html

* Servlet Tutorial
<http://docs.oracle.com/javaee/6/tutorial/doc/bn>
afd.html
* JDBC Tutorial
<http://docs.oracle.com/javase/tutorial/jdbc/inde>
x.html
*
