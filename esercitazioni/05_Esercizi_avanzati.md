# Esercitazioni Java - Raccolta tracce d'esame

## Gestione di una biblioteca

Una biblioteca ha dato l'incarico di implementare un software per la gestione
dei prestiti di libri. Si costruiscano le seguenti classi:
- Data: serve per costruire "l'orologio" virtuale. Implementare tre
variabili d'istanza e i metodi: int getDay(), int getMonth(), int
getYear(), void setDay(int aDay), void setMonth(int aMonth), void
setYear(int aYear), void nextDay(), Boolean isEqual(Data date).
- Abbonato: costruisce l'oggetto utente. Essa ha due variabili
d'istanza e i seguenti metodi: String getCognome(), String getNome()
- Libro: costruisce l'oggetto libro. Ha tre variabili d'istanza:
titolo, utente a cui è prestato, data scadenza del prestito. Ha
inoltre i relativi metodi accessori.
- Archivio: essa implementa due arrayList, una contenente gli abbonati
alla biblioteca e l'altra i libri presenti, oltre ad un riferimento
alla data, e i seguenti metodi: void nuovoLibro(String unTitolo),
void nuovoUtente(String unNome, String unCognome), int
trovaUtente(String unNome, String unCognome), Data scadenza(Data
date), int presta(Libro unLibro, Abbonato unUtente), void aggiorna()
[si riferisce all'aggiornamento dell'ora], int numLibri(Abbonato
anAbb) [restituisce il numero di libri posseduti da un dato utente]
Consigli:
Le classi Data, Abbonato e Libro non presentano particolari difficoltà
d'esecuzione. La classe Archivio, invece, può risultare di difficile
implementazione, in particolare:
- presta(Libro unLibro, Abbonato unUtente): si passa in rassegna
l'arraylist contenente i libri, se una copia del libro cercato
esiste e non è in prestito, viene assegnata una data di scadenza per
la restituzione e l'utente che l'ha preso in prestito;
- aggiorna(): aggiorna la data, se un libro deve essere restituito nel
medesimo giorno, allora si resettano i dati sull'utente possessore.
- numLibri(Abbonato anAbb): restituisce quanti libri possiede un dato
utente

## Corso di laurea

La segreteria di un corso di laurea desidera sviluppare un archivio elettronico
per la gestione di tutti gli studenti, di tutti gli appelli d'esame, e delle
sessioni di laurea. Implementare le seguenti classi con i relativi metodi
prescritti. Attenzione: non esistono esami diversi con lo stesso nome. Inoltre,
potreste avere bisogno di metodi ausiliari che non ho indicato, per semplificare
il codice: definite tali metodi ogniqualvolta lo ritenete opportuno.

```java
public class Esame {
private String nome;
private int crediti;
private int voto;
public Esame(String unNomeEsame, int numCrediti){...}
public String getNome(){...}
public String getCrediti(){...}
public String getVoto(){...}
public void setVoto(int unVoto){...}
public String toString(){...} }
public class Studente {
private String nome;
private int matricola;
private ArrayList<Esame> esamiSostenuti;
private ArrayList<Esame> pianoStudio;
public Studente(String unNomeStudente, int unaMatricola){...}
public String getNome(){...}
public String getMatricola(){...}
public void aggiungiEsame(String unNomeEsame, int numCrediti){...}
public void promosso(String unNomeEsame, int unVoto){...}
public void cancella(String unNomeEsame){...}
public double media(){...}
public double crediti(){...}
public String toString(){...} }
public class CorsoLaurea {
private String nome;
private ArrayList<Studente> immatricolati;
public static int prossimaMatricola;
public static final int MIN_CREDITI;
public CorsoLaurea(String unNomeStudente){...}
public String getNome(){...}
public void iscrivi(String unNomeStudente){...}
public void ritira(String unNomeStudente){...}
public void appello(String unNomeEsame, ArrayList<Studente> iscritti){...}
public void laurea(){...} }
```

## Gestione di un campo da tennis

Fare una classe Prenotazione (di un campo da tennis) contenente il nome del
cliente e l'ora della sua prenotazione. Implementare una classe Campo in cui ci
sono i seguenti metodi: public boolean addPren(int inizio, int fine, String
unNomeCliente), per prenotare il campo (controlla se i dati inseriti sono giusti
e se il campo è disponibile dopodichè salva la prenotazione e restituisce true
se il campo è stato prenotato); public boolean removePren (int inizio, int fine,
String unNomeCliente), per cancellare una prenotazione (controlla se il campo è
stato prenotato dal cliente che vuole cancellare la prenotazione dopodichè la
cancella e restituisce true se la prenotazione è stata cancellata); public
String toString(); public double utilizzo(), per trovare la percentuale
dell'utilizzo del campo.

## Archivio MP3

Uno studente desidera implementare un archivio elettronico con tutti i brani
musicali in formato mp3 contenuti nel suo pc.
L'archivio tiene traccia di tutti i cd, artisti e generi di pertinenza dei brani
catalogati. Ad esempio, due brani dello stesso cd avranno come variabile
d'istanza album due riferimenti allo stesso cd, contenuto nella variabile
d'istanza cds specificata per la classe Archivio.
Allo stesso modo, due cd dello stesso genere avranno come variabile d'istanza
genere due riferimenti allo stesso genere, contenuto nella variabile d'istanza
generi specificata per la classe Archivio.
Non devono dunque mai essere duplicati i cd, oppure i generi.
Bisogna invece "condividere" questi dati ogni volta che sia possibile.
Quando si deve aggiungere un nuovo brano nell'archivio, vengono specificate
tutte le coordinate: artista, cd e genere.
Se viene trovato il cd a cui il brano appartiene, ci si deve riferire a
quell'oggetto e non duplicarlo.
Se invece tale oggetto non esiste nell'archivio (ovvero si tratta del primo
brano acquisito di questo cd)si deve allora creare anche il nuovo oggetto che
rappresenti il cd.
Stesso discorso vale per il genere e l'artista: si deve creare una nuova istanza
solamente se non ne esiste alcuna.

## concessionario d'auto

Supponiamo di voler gestire i dati relativi ai modelli in vendita presso un
concessionario d'auto.
Per ogni modello occorre tener traccia della marca, del nome, della cilindrata, della capacità del serbatoio e del numero dei chilometri che il modello è in grado di percorrere con un litro di carburante. Il titolare del concessionario vuole calcolare l'autonomia di ogni modello (in chilometri). 
Inoltre, potrebbe essere utile poter costruire facilmente un nuovo modello d'auto che sia del tutto simile ad un modello esistente, ma che abbia una cilindrata diversa.
Progettare ed implementare una classe automobile che sia in grado di soddisfare le esigenze del titolare del concessionario in questione.

## Gestione di una compagnia aerea

Una compagnia aerea desidera gestire elettronicamente le prenotazioni sui
singoli voli. Abbiamo una classe Cliente, con nome unico (si assuma che non ci
siano clienti omonimi). Poi una classe Volo, che contiene due var d'istanza
denominate posti e attesa. Ogni volo ha un numero max di passeggeri (passato
come parametro al costruttore). Quando un cliente prenota il volo, lo mettiamo
in posti se c'è ancora disponibilità, altrimenti lo mettiamo in attesa. Quando
un cliente in posti disdice il suo volo, si libera un posto e prendiamo il primo
elemento di attesa e lo trasferiamo su posti.
Suggerimento: posti è un array di dimensione pari al max numero di passeggeri;
attesa è un ArrayList senza limitazioni sulla dimensione. Per l'array posti,
usate la tecnica della sentinella vista nel cap 8. La sentinella deve essere
anch'essa una variabile d'istanza.


## Tandem

Una stringa è un tandem se è composta da due sequenze esattamente uguali. Ad
esempio, la stringa "toctoc" è un tandem. Si assuma una classe Tandem con una
sola variabile d'istanza private String mystring. Utilizzando la ricorsione, si
implementi un metodo boolean tandem(){...} che restituisce true se mystring è un
tandem, e false altrimenti. Non usare alcuna istruzione di iterazione.



## Semaforo

Si vuole simulare il traffico automobilistico in prossimità di un semaforo
stradale. Si assuma una classe Auto, avente la variabile d'istanza targa
(stringa) e gli usuali metodi (non sviluppare il codice relativo).
La classe Semaforo è così definita:

```java
public class Semaforo {
private boolean rosso, verde;
private int numOsservazioni, totLunghezze;
private ArrayList<Auto> coda;
public Semaforo(){};
public void rosso(); // porto il semaforo a rosso
public int verde(); // porto il semaforo a verde
public void arrivo(String unaTarga); // arrivo auto
public double impaziente();
public double statistica();
public toString();
};
```

Le due variabili verde e rosso sono mutuamente esclusive. Qualora il semaforo
sia rosso, le automobili in arrivo rimangono in coda in attesa del verde.
Inoltre, se la coda ha lunghezza maggiore di 10, l'auto in arrivo decide di
abbandonare la coda con probabilità un mezzo (usare la classe Random). La coda
viene svuotata allo scattare del verde, e viene restituito il numero di auto che
lasciano il semaforo.
Il metodo impaziente causa, da parte di ciascuna auto, l'abbandono della coda
con probabilità un sesto.
Il metodo statistica restituisce il valore medio della lunghezza della coda allo
scattare del verde, calcolato su tutte le osservazioni effettuate da quando il
semaforo è attivo. Utilizzare le variabili d'istanza numOsservazioni e
totLunghezze per tale calcolo.

## magazzino di articoli

Un rivenditore vuole gestire un magazzino di articoli. Sviluppare una classe
Articolo
avente come variabili d’istanza un codice (stringa), un prezzo (intero) ed un
quantitativo di disponibilità a (intero). Definire i relativi metodi di accesso
ed un costruttore. Il magazzino è rappresentato dalla seguente classe:

```java
public class Magazzino {
private ArrayList<Articolo> articoli;
public Magazzino(){...}
public void rifornisciArticolo(String codice, int quantita, int prezzo){...}
public int vendiArticolo(String codice, int quantita){...}
public void aggiornaPrezzi(int percentuale){...}
public int conteggiaArticoli(String prefisso){...}}
```

Nel magazzino non possono essere presenti più articoli aventi lo stesso codice;
inoltre, gli articoli aventi quantitativo pari a zero devono essere cancellati
dal magazzino. Il metodo rifornisciArticolo aggiunge un nuovo articolo al
magazzino, se questo non è presente, oppure aggiorna il quantitativo di un
articolo. Il metodo vendiArticolo preleva dal magazzino una specificata
quantità di un certo articolo, e comunque non oltre esaurimento. Viene
restituito il ricavo totale. Il metodo aggiornaPrezzi aumenta della percentuale
indicata il prezzo di tutti gli articoli disponibili. Il metodo
conteggiaArticoli restituisce la totale quantità di articoli presenti nel
magazzino, aventi codice che inizi con uno specificato prefisso. Sviluppare
tutte le funzioni associate alla classe.


## prenotazione dei posti per un concerto

Un'agenzia per il turismo desidera gestire automaticamente la prenotazione dei
posti per un concerto. Si sviluppi una classe Cliente avente come variabili
d'istanza il nominativo ed numero telefonico del cliente, rappresentati entrambi
come stringhe, con i relativi metodi di accesso ed un costruttore. Si sviluppi
inoltre la seguente classe:

```java
public class Spettacolo {
private Cliente[] prenotazioni;
private int n_prenotazione;
private ArrayList<Cliente> attesa;
public Spettacolo(int n){...}
public boolean libero(){...}
public int trova(String nome, String tel){...}
public void prenota(String nome, String tel){...}
public void disdici(String nome, String tel){...}
public boolean incompleto(){...}
}
```

L'array prenotazioni contiene i clienti che hanno il posto, la lista attesa
contiene i clienti in lista d'attesa. La lista d'attesa deve essere gestita con
la politica primo arrivato, primo servito. Il costruttore inizializza una classe
con un array prenotazioni (inizialmente vuoto) avente lunghezza n specificata
come parametro. Il metodo libero restituisce true solo se vi sono posti ancora
liberi. Il metodo trova restituisce 0 se il cliente specificato ha il posto, 1
se il cliente è in attesa e -1 altrimenti. Il metodo prenota inserisce il
cliente specificato nell'oggetto (eventualmente in attesa). Il metodo disdici
rimuove il cliente specificato dall'oggetto. Nel caso venga liberato un posto in
prenotazioni, viene trasferito il primo cliente da attesa. Infine, il metodo
incompleto restituisce true se esiste almeno un cliente che abbia almeno un
posto ed almeno una prenotazione in attesa; il metodo restituisce false
in caso contrario.

## scuola superiore

Una scuola superiore è organizzata in classi, ciascuna delle quali è composta da un certo numero di studenti. 
Ogni classe ha un nome (che possiamo pensare essere una stringa di caratteri, ad esempio "5A” o""3C”) " ad essa è associato un anno, ossia l'anno di nascita degli studenti che normalmente frequentano tale classe. 
Per ogni studente occorre tener traccia della data e del luogo di nascita, oltre che del cognome e del nome. Il preside della scuola superiore vuole determinare il numero di studenti della classe in questione. 
Inoltre, il preside vuole sapere se di una certa classe fa parte anche qualche studente bocciato. 
Progettare ed implementare una gerarchia di classi che sia in grado di soddisfare le esigenze del preside.

## azienda di trasporti

Si supponga di voler progettare e implementare parte del sistema informativo di una azienda
di trasporti su rotaia. Per ogni treno occorrerà tenere traccia delle stazioni di fermata, della stazione di partenza e di quella di arrivo, oltre che dei relativi orari. Occorre poi che ad ogni treno sia associato il numero dei posti a sedere disponibili e il numero totale di chilometri percorsi.
Nei treni espressi, infine, è previsto anche un servizio ristorante, e anche per questo servizio è necessario tenere traccia del numero di posti disponibili. Un utente di questo sistema informativo vuole determinare il numero di fermate effettuate da ciascun treno. 
Inoltre, chi utilizza tale sistema informativo vuole determinare il massimo ricavo realizzabile nell'erogazione di questo servizio. Tale ricavo dipende chiaramente da un parametro, ovvero dal prezzo che ogni passeggero dovrà pagare per percorrere un chilometro. Nei treni espressi occorrerà tenere conto anche del ricavo che si presume di ottenere in ogni chilometro da ognuno dei posti disponibili nel vagone ristorante (anch'esso fornito come parametro).

## biblioteca

Una biblioteca ha la necessità di tenere traccia dei prestiti dei libri e dei DVD in catalogo. Ad ogni libro o DVD sarà quindi associata una sequenza di prestiti, ad ognuno dei quali corrispondono la data di inizio prestito, la data di riconsegna, il nome e cognome dell'utente. 
Inoltre, per i DVD occorrerà tenere traccia della durata, mentre per i libri occorrerà tenere traccia del numero di pagine. Ad entrambi i tipi di supporti, infine, bisogna associare il titolo e l'anno di pubblicazione.
Il bibliotecario vuole calcolare il periodo più lungo (in giorni) in cui un libro o un DVD è rimasto a prestito ad una persona. Occorre, infinte, permettere al bibliotecario di controllare se nella lista di prestiti relativi ad un libro ad un DVD esistano inconsistenze, ovvero se un prestito nella lista sia iniziato prima che un altro prestito fosse concluso.

## alberi genealogici

Si progetti parte di un programma per la gestione degli alberi genealogici. Per ogni persona occorre tenere traccia del nome, del cognome, della data e del luogo di nascita. 
Non è detto che di ogni persona si conoscano entrambi i genitori: potrebbe essere noto solo uno dei due genitori oppure nessuno dei due. 
Per ogni persona, occorre poi essere in grado di calcolare la dimensione del
rispettivo albero genealogico, ossia il numero di antenati conosciuti. 
Inoltre, dato un numero naturale n e una persona, occorre poter calcolare se sono noti tutti gli antenati della persona vissuti n generazioni prima della generazione corrente. Per esempio, se n è 2, si deve determinare se tutti i nonni della persona in questione sono noti.
Successivamente, si costruiscano un metodo che calcola la lista di tutti gli antenati della persona in questione e un altro metodo, che dato un numero n, calcola la lista di tutti gli antenati vissuti esattamente n generazioni prima della generazione corrente.

## dipendenti azienda

Un'azienda ha bisogno di gestire i dati relativi ai propri dipendenti. Per ogni dipendente, occorre tener traccia del nome, del cognome e della data di nascita, oltre che della data di assunzione. 
Il titolare dell'azienda vuole determinare se un dipendente compia gli anni in un certo mese (per esempio in febbraio) oppure se due dipendenti distinti siano stati assunti nello stesso mese dello stesso anno (per esempio, se entrambi siano stati assunti nel dicembre delloscorso anno). Progettare ed implementare una gerarchia di classi che sia in grado di soddisfare le esigenze dell'azienda.

## parco veicoli

Un'azienda ha bisogno di gestire il suo parco veicoli tramite uno strumento informatico. 
Per ogni veicolo occorrerà tenere traccia della targa, dell'anno di immatricolazione, dei chilometri percorsi e del costo di acquisto. Occorre poi tenere traccia degli interventi di manutenzione effettuati, per ciascuno dei quali occorre ricordare la data e il costo. 
Fornire un metodo per determinare, per ogni veicolo, il totale dei costi sostenuti per il suo acquisto e la sua manutenzione. 
Determinare il totale dei costi sostenuti per l'aquisto e la manutenzione di un veicolo in un dato anno, specificato dall'utente. Progettare ed implementare una gerarchia di classi che sia in grado di soddisfare le esigenze dell'azienda.

## ristorante

Un ristorante offre un certo numero di pietanze, ognuna delle quali ha un nome e un prezzo al pubblico. 
Per ognuna di esse è nota una lista degli ingredienti necessari alla sua preparazione, ognuno dei quali ha un nome e un costo. Nelle pietanze calde, a differenza di quelle fredde, il costo di cottura della pietanza è rilevante e occorre tenerne traccia. Il titolare del ristorante vuole determinare quale sia il guadagno totale atteso dalla vendita di un piatto. Inoltre, Fornire un metodo per determinare il numero di ingredienti necessari alla preparazione di una pietanza. 
Progettare ed implementare una gerarchia di classi che sia in grado di soddisfare le esigenze del ristorante.

## corso di laurea in informatica

Uno studente del corso di laurea in informatica vuole gestire in modo automatizzato il registro degli esami che ha sostenuto. Per ogni esame occorre tenere traccia del nome del corso, della data di superamento dell'esame, del voto conseguito (che si suppone espresso in trentesimi) e dell'eventuale lode. 
Lo studente vuole calcolare la media aritmetica dei voti conseguiti in tutti gli esami sostenuti. Potrebbe poi essere interessato a sapere il numero di esami che ha sostenuto con profitto. 
Progettare ed implementare una gerarchia di classi JAVA che sia in grado di soddisfare le esigenze dello studente.

## punteggi ottenuti dagli studenti 

Il docente di un corso vuole tenere traccia dei punteggi ottenuti dagli studenti in una certa prova scritta. 
La prova scritta è strutturata in tre esercizi, ad ognuno dei quali è attribuito un punteggio. 
La somma dei punteggi ottenuti nei tre esercizi rappresenta poi il voto finale assegnato allo studente (espresso in trentesimi). Il docente potrebbe essere interessato a determinare quanti tra gli studenti abbiano ottenuto un voto sufficiente (quindi maggiore o uguale a 18) nella prova scritta. 
Calcolare la percentuale di studenti con un voto insufficiente sul totale. 
Progettare ed implementare una gerarchia di classi JAVA che sia in grado di soddisfare le esigenze del docente.

## negozio di vestiti

Il titolare di un negozio di vestiti è interessato a realizzare un registro elettronico dei suoi clienti.
Per ogni cliente, occorre tener traccia del nome e dell'indirizzo. Inoltre, occorre tener traccia di tutti gli acquisti effettuati dal cliente presso il negozio. Ciascun acquisto, a sua volta, consterà di una data e di una lista di prodotti. Infine, ogni prodotto ha un prezzo e nome. 
Il negoziante vuole determinare quanti clienti abbiano acquistato prodotti in un certo
mese di un certo anno. 
Inoltre, al negoziante potrebbe interessare sapere la lista di tutti i prodotti
venduti in una certa data. Infine, per il titolare del negozio determinare quante volte un certo prodotto (con un certo nome) sia stato venduto, complessivamente. 
Si progetti e si implementi una gerarchia di classi JAVA che sia in grado di soddisfare le esigenze del negoziante.

---

## Sanita


Sviluppare un programma per la gestione dei medici e dei pazienti.

## R1: Pazienti


Il programma funziona attraverso la classe principale __Sanita__. Il programma permette di
inserire medici e pazienti all'interno del sistema della sanit&agrave;.
I pazienti sono caratterizzati da nome, cognome e codice fiscale.

Le persone possono essere registrate come pazienti presso il sistema
tramite il metodo __aggiugniPersona()__
cher riceve come parametri nome, cognome e codice fiscale.

Per recuperare le informazioni sui pazienti inseriti si pu&ograve;
utilizzare il metodo __getPersona()__
che riceve come parametro il codice fiscale e restituisce un oggetto
che implementa l'interfaccia __Persona__.

Se non esiste nessuna persona con il codice fiscale specificato, viene
generata un'eccezione di __ErrPersonaInesistente__.

Il nome ed il cognome della persona possono essere letti tramite i
metodi __getNome()__ e __getCognome()__ dell'interfaccia
Persona.

Esempio di persone:
Nome | Cognome | Codice Fiscale 
---|---|---
Giovanni | Rossi | RSSGNN33B30F316I
Giuseppe | Verdi | VRDGPP76F09B666I

## R2: Medici


I medici hanno le stesse caratteristiche dei pazienti ed inoltre sono
caratterizzati da una matricola.

E' possibile registrare un medico presso il sistema tramite il metodo __aggiungiMedico()__ che riceve come
parametri matricola, nome, cognome e codiceFiscale.

Per recuperare le informazioni sui medici si pu&ograve; utilizzare il
metodo __getMedico()__ che riceve
come parametro la matricola e restituisce
un oggetto che implementa l'interfaccia __Medico__.Se non c'&egrave; un medico
con la matricola specificata presente nel sistema genera un'eccezione
di __ErrMedicoInesistente__.

E' possibile conoscere la matricola di un medico tramite il metodo __getMatricola()__ dell'interfaccia
Medico.

## R3: Assegnazione Medici

E' possibile assegnare un medico ad un paziente tramite il metodo __assegnaMedico()__ della classe Sanita
che riceve come parametri la matricola del medico ed il codice fiscale
del paziente. Tale metodo genera le opportune eccezioni
(ErrPersonaInesistente, ErrMedicoInesistente) se la matricola o il CF
non corrispondono a medici/pazienti inseriti nel sistema.

Deve essere possibile sapere, data una persona, qual'&egrave; il medico
assegnato tramite il metodo __getMedico()__ dell'interfaccia Persona.

N.B. I medici possono essere a loro volta pazienti di un altro medico.

## R4: Elenco Pazienti

Dato un medico, deve essere possibile ottenere la lista dei pazienti
tramite il metodo __getPazienti()__ dell'interfaccia
Medico.

La lista dei pazienti di un medico deve essere in ordine alfabetico
crescente in base a cognome e nome.

## R5: Caricamento da file

Tramite il metodo __caricaDati()__,
che riceve come parametro il path di un file, deve essere possibile
leggere da file i pazienti ed i medici.

Il file &egrave; organizzato a righe, ogni riga pu&ograve; contenere un
medico o una persona.

Le righe che contengono una persona iniziano con la lettera "P" seguita
da nome, cognome e codice fiscale. Le righe che contengono un medico
iniziano con la lettera "M" seguita da matricola, nome, cognome e
codice fiscale. Gli elementi di ciascuna riga sono separati gli uni
dagli altri tramite il carattere ";".

In caso di errore dei dati presenti su una linea, il metodo deve essere
in grado di ignorarla e passare a quella successiva.

In caso di errori di IO il metodo lancia una IOException.

---