# Esercizi OOP

## Esercizio media aritmetica incrementale

* costruire un programma che chieda in input l'altezza degli studenti di una classe (altezza espressa in cm )
* il programma accetta un numero indeterminato di valori in input e restituisce la media aritmetica incrementale ogni volta
* inserire una condizione per uscire dal ciclo e informare l'utente della stringa da inserire

---

## Gioco dei Dadi

Simulare un gioco di dadi, vince chi lancia il numero più alto.
Ci sono due giocatori, ognuno con il suo dado che lanciano a turno.
Il vincitore vince 1.00 €, il perdente lo perde.

---

## Conti Correnti

Simulare un Conto Corrente Generico. Ogni conto corrente ha un saldo su cui è
possibile: prelevare, depositare, verificarne la disponibilità.
Oltre ad un conto corrente generico ad un utente possono anche essere assegnati altri
due tipi di conti:
– Conto Corrente con Interessi:
oltre al versamento normale vi è la possibilità di un versamento con
interessi; ci deve quindi essere la possibilità di stabilire un tasso di interesse
e ci deve essere una nuova operazione di versamento con interesse, in cui la
quantità di soldi versata viene incrementata del 3%.
– Conto Corrente con Spese:
oltre al versamento normale vi è la possibilità di un versamento con spese,
ovvero ad ogni operazione di prelievo vi è una spesa di 1€.

---

## Esercizio centro di formazione

La direttrice di un centro di formazione ha bisogno di un programma per formare le classi per il nuovo anno formativo:

* tampare o visualizzare il numero di classi che si possono ottenere con un gruppo di studenti di cui si conosce l'anno di nascita.
* Le classi devono essere omogenee per età e possono contenere max 16 studenti.


---

## Esercizio statistica sugli stipendi

Un azienda vuole effettuare una statistica sugli stipendi pagati mensilmente ai dipendenti. Di
ciascun dipendente si conoscono i seguenti dati:

* cognome e nome,
* tipendio mensile.

Dopo aver stampato il tabulato, si vogliono ottenere i seguenti dati statistici:

* tipendio mensile medio,
* numero dipendenti con stipendio mensile maggiore di € 2.000,
* cognome, nome e stipendio del dipendente che percepisce lo stipendio più alto.

---

## Esercizio temperature massime e minime

Per N città vengono registrate le temperature massime e minime di una giornata.
Stampare una tabella con:

* nome della città,
* temperatura massima,
* temperatura minima
* ed alla fine stampare il nome della città più calda e di quella più fredda.

---

## Concessionario d'auto

Supponiamo di voler gestire i dati relativi ai modelli in vendita presso un concessionario d'auto. 


Per ogni modello occorre tener traccia 

* della marca, 
* del nome, 
* della cilindrata, 
* della capacità del serbatoio e 
* del numero dei chilometri che il modello è in grado di percorrere con un litro di carburante. 

Il titolare del concessionario potrebbe essere interessato a calcolare l'autonomia di ogni modello (in chilometri). 

Inoltre, potrebbe essere utile poter costruire facilmente un nuovo modello d'auto che sia del tutto simile ad un modello esistente, ma che abbia una cilindrata diversa. 

Si progetti e si implementi una classe automobile che sia in grado di soddisfare le esigenze del titolare del concessionario in questione.

---

## Classi scuola superiore

Una scuola superiore è organizzata in classi, ciascuna delle quali è composta da un certo numero di studenti. 

Ogni classe ha un nome (che possiamo pensare essere una stringa di caratteri, ad esempio “5A” o “3C”) e ad essa è associato un anno, ossia l'anno di nascita degli studenti che normalmente frequentano tale classe. 

Per ogni studente occorre tener traccia della data e del luogo di nascita, oltre che del cognome e del nome. 

Il preside della scuola superiore potrebbe essere interessato a determinare il numero di studenti della classe in questione. 

Inoltre, il preside potrebbe essere interessato a sapere se di una certa classe fa parte anche qualche studente bocciato. 

Si progetti e si implementi una gerarchia di classi che sia in grado di soddisfare le esigenze del preside.

---

## Azienda di trasporti

Si supponga di voler progettare e implementare parte del sistema informativo di una azienda di trasporti su rotaia. 

Per ogni treno occorrerà tenere traccia 
* delle stazioni di fermata, 
* della stazione di partenza e 
* di quella di arrivo, 
* oltre che dei relativi orari. 
* Occorre poi che ad ogni treno sia associato il numero dei posti a sedere disponibili e il numero totale di chilometri percorsi. 

Nei treni espressi, infine, è previsto anche un servizio ristorante, e anche per questo servizio è necessario tenere traccia del numero di posti disponibili. 

Un utente di questo sistema informativo potrebbe essere interessato a determinare il numero di fermate effettuate da ciascun treno. 

Inoltre, chi utilizza tale sistema informativo potrebbe essere interessato a determinare il massimo ricavo realizzabile nell'erogazione di questo servizio. Tale ricavo dipende chiaramente da un parametro, ovvero dal prezzo che ogni passeggero dovrà pagare per percorrere un chilometro. 

Nei treni espressi occorrerà tenere conto anche del ricavo che si presume di ottenere in ogni chilometro da ognuno dei posti disponibili nel vagone ristorante (anch'esso fornito come parametro).

---

## Biblioteca

Una biblioteca ha la necessità di tenere traccia dei prestiti dei libri e dei DVD in catalogo. 

Ad ogni libro o DVD sarà quindi associata una sequenza di prestiti, ad ognuno dei quali corrispondono la 1data di inizio prestito, la data di riconsegna, il nome e cognome dell'utente. 

Inoltre, per i DVD occorrerà tenere traccia della durata, mentre per i libri occorrerà tenere traccia del numero di pagine. 

Ad entrambi i tipi di supporti, infine, bisogna associare il titolo e l'anno di pubblicazione. 

Il bibliotecario potrebbe essere interessato a calcolare il periodo più lungo (in giorni) in cui un libro o un DVD è rimasto a prestito ad una persona. 

Occorre, infinte, permettere al bibliotecario di controllare se nella lista di prestiti relativi ad un libro ad un DVD esistano inconsistenze, ovvero se un prestito nella lista sia iniziato prima che un altro prestito fosse concluso.

---

## Gestione degli alberi genealogici

Si progetti parte di un programma per la gestione degli alberi genealogici. 

Per ogni persona occorre tenere traccia del nome, del cognome, della data e del luogo di nascita. 

Non è detto che di ogni persona si conoscano entrambi i genitori: potrebbe essere noto solo uno dei due genitori oppure nessuno dei due. 

Per ogni persona, occorre poi essere in grado di calcolare la dimensione del rispettivo albero genealogico, ossia il numero di antenati conosciuti. 

Inoltre, dato un numero naturale n e una persona, occorre poter calcolare se sono noti tutti gli antenati della persona vissuti n generazioni prima della generazione corrente. 

Per esempio, se n è 2, si deve determinare se tutti i nonni della persona in questione sono noti.

Infine, si costruiscano 

* un metodo che calcola la lista di tutti gli antenati della persona in questione 
* e un altro metodo, che dato un numero n, calcola la lista di tutti gli antenati vissuti esattamente n generazioni prima della generazione corrente. 

---

## Parco veicoli

Un'azienda ha bisogno di gestire il suo parco veicoli tramite uno strumento informatico.

Per ogni veicolo occorrerà tenere traccia 
* della targa, 
* dell'anno di immatricolazione, 
* dei chilometri percorsi 
* e del costo di acquisto. 
  
Occorre poi tenere traccia degli interventi di manutenzione effettuati, per ciascuno dei quali occorre ricordare la data e il costo. 

Potrebbe essere necessario determinare, per ogni veicolo, il totale dei costi sostenuti per il suo acquisto e la sua manutenzione. 

Similarmente, potrebbe essere interessante determinare il totale dei costi sostenuti per l'aquisto e la manutenzione di un veicolo in un dato anno, specificato dall'utente. 

Si progetti e si implementi una gerarchia di classi che sia in grado di soddisfare le esigenze dell'azienda.

---

## Ristorante

Un ristorante offre un certo numero di pietanze, ognuna delle quali ha un nome e un prezzo al pubblico. 

* Per ognuna di esse è nota una lista degli ingredienti necessari alla sua preparazione, ognuno dei quali ha un nome e un costo. 

* Nelle pietanze calde, a differenza di quelle fredde, il costo di cottura della pietanza è rilevante e occorre tenerne traccia. 

* Il titolare del ristorante potrebbe essere interessato a determinare quale sia il guadagno totale atteso dalla vendita di un piatto. 

* Inoltre, potrebbe essere necessario determinare il numero di ingredienti necessari alla preparazione di una pietanza. 

* i progetti e si implementi una gerarchia di classi che sia in grado di soddisfare le esigenze del ristorante.

---

## Registro degli esami

Uno studente del corso di laurea in informatica vuole gestire in modo automatizzato il registro degli esami che ha sostenuto. 

* Per ogni esame occorre tenere traccia del nome del corso, della data di superamento dell'esame, del voto conseguito (che si suppone espresso in trentesimi) e dell'eventuale lode. 

* Lo studente potrebbe essere interessato a calcolare la media aritmetica dei voti conseguiti in tutti gli esami sostenuti. 

* Potrebbe poi essere interessato a sapere il numero di esami che ha sostenuto con profitto. 

* i progetti e si implementi una gerarchia di classi JAVA che sia in grado di soddisfare le esigenze dello studente.

---

## Punteggi ottenuti dagli studenti

Il docente del corso di Analisi Matematica vuole tenere traccia dei punteggi ottenuti dagli studenti in una certa prova scritta. 

* La prova scritta ? strutturata in tre esercizi, ad ognuno dei quali ? attributi un punteggio. 

* La somma dei punteggi ottenuti nei tre esercizi rappresenta poi il voto finale assegnato allo studente (espresso in trentesimi). 

* Il docente potrebbe essere interessato a determinare quanti tra gli studenti abbiano ottenuto un voto sufficiente (quindi maggiore o uguale a 18) nella prova scritta. 

* Potrebbe essere infine interessante, per il docente, poter calcolare la percentuale di studenti con un voto insufficiente sul totale. 

* i progetti e si implementi una gerarchia di classi JAVA che sia in grado di soddisfare le esigenze del docente.

---

## Registro elettronico

Il titolare di un negozio di vestiti è interessato a realizzare un registro elettronico dei suoi clienti. 

* Per ogni cliente, occorre tener traccia del nome e dell'indirizzo. 

* Inoltre, occorre tener traccia di tutti gli acquisti effettuati dal cliente presso il negozio. 

* Ciascun acquisto, a sua volta, consterà di una data e di una lista di prodotti. 

* Infine, ogni prodotto ha un prezzo e nome. 

* Il negoziante potrebbe essere interessato a determinare quanti clienti abbiano acquistato prodotti in un certo mese di un certo anno. 

* Inoltre, al negoziante potrebbe interessare sapere la lista di tutti i prodotti venduti in una certa data. 

* Infine, potrebbe essere interessante per il titolare del negozio determi- nare quante volte un certo prodotto (con un certo nome) sia stato venduto, complessivamente. 

* i progetti e si implementi una gerarchia di classi JAVA che sia in grado di soddisfare le esigenze del negoziante.

---

## Semaforo

Si vuole simulare il traffico automobilistico in prossimità di un semaforo
stradale. 

* Si assuma una classe Auto, avente la variabile d'istanza targa
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

Le due variabili verde e rosso sono mutuamente esclusive. 

* Qualora il semaforo sia rosso, le automobili in arrivo rimangono in coda in attesa del verde.
Inoltre, se la coda ha lunghezza maggiore di 10, l'auto in arrivo decide di
abbandonare la coda con probabilità un mezzo (usare la classe Random). 

* La coda
viene svuotata allo scattare del verde, e viene restituito il numero di auto che
lasciano il semaforo.
Il metodo impaziente causa, da parte di ciascuna auto, l'abbandono della coda
con probabilità un sesto.
Il metodo statistica restituisce il valore medio della lunghezza della coda allo
scattare del verde, calcolato su tutte le osservazioni effettuate da quando il
semaforo è attivo. 

* Utilizzare le variabili d'istanza numOsservazioni e
totLunghezze per tale calcolo.

---

## magazzino di articoli

Un rivenditore vuole gestire un magazzino di articoli. 
* Sviluppare una classe
Articolo avente come variabili d’istanza un codice (stringa), un prezzo (intero) ed un
quantitativo di disponibilità a (intero). 
* Definire i relativi metodi di accesso
ed un costruttore. 
* Il magazzino è rappresentato dalla seguente classe:

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
dal magazzino. 
* Il metodo rifornisciArticolo aggiunge un nuovo articolo al
magazzino, se questo non è presente, oppure aggiorna il quantitativo di un
articolo. 
* Il metodo vendiArticolo preleva dal magazzino una specificata
quantità di un certo articolo, e comunque non oltre esaurimento. 
* Viene
restituito il ricavo totale. 
* Il metodo aggiornaPrezzi aumenta della percentuale
indicata il prezzo di tutti gli articoli disponibili. 
* Il metodo
conteggiaArticoli restituisce la totale quantità di articoli presenti nel
magazzino, aventi codice che inizi con uno specificato prefisso. 
* Sviluppare
tutte le funzioni associate alla classe.

---

## prenotazione dei posti per un concerto

Un'agenzia per il turismo desidera gestire automaticamente la prenotazione dei
posti per un concerto. 
* Si sviluppi una classe Cliente avente come variabili
d'istanza il nominativo ed numero telefonico del cliente, rappresentati entrambi
come stringhe, con i relativi metodi di accesso ed un costruttore. 
* Si sviluppi
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
contiene i clienti in lista d'attesa. 
* La lista d'attesa deve essere gestita con
la politica primo arrivato, primo servito. 
* Il costruttore inizializza una classe
con un array prenotazioni (inizialmente vuoto) avente lunghezza n specificata
come parametro. 
* Il metodo libero restituisce true solo se vi sono posti ancora
liberi. 
* Il metodo trova restituisce 0 se il cliente specificato ha il posto, 1
se il cliente è in attesa e -1 altrimenti. 
* Il metodo prenota inserisce il
cliente specificato nell'oggetto (eventualmente in attesa). 
* Il metodo disdici
rimuove il cliente specificato dall'oggetto. 
* Nel caso venga liberato un posto in
prenotazioni, viene trasferito il primo cliente da attesa. 
* Infine, il metodo
incompleto restituisce true se esiste almeno un cliente che abbia almeno un
posto ed almeno una prenotazione in attesa; il metodo restituisce false
in caso contrario.

---



## Gestione fotocopiatrice

Per ogni libro è indicato il numero di pagine, un editore, un autore ed un genere.
Ho due tipologie di libri: libri fotocopiati a colori e libri fotocopiati in B/N.
Per ogni tipologia di libro ho il prezzo di ogni pagina; deve inoltre essere possibile
calcolare il prezzo di un tot di pagine ed il prezzo totale del libro.
Per ogni editore è nota solo la ragione sociale.
Per ogni autore ho semplicemente nome e cognome.
Per ogni genere ho il nome ed una breve descrizione.
Ho poi una fotocopiatrice di cui conosco il numero di fogli a disposizione ed il
guadagno che mi produce fotocopiando i libri.
Tale fotocopiatrice quindi, indicato un libro ed il numero di pagine da fotocopiare,
decrementa il numero di fogli a disposizione ed incrementa l'indicatore dei miei
guadagni.
Vi è infine la possibilità di controllare se sono finiti i fogli ed in tal caso caricarne
altri.

---

## Centro d'Assistenza

Simulare un centro d'assistenza per auto.
Tale centro ha un nome ed un proprietario.
E' composto da un meccanico (che ripara l'auto), da un carrozziere (che la rivernicia),
da un autolavaggio (che la lava).
Quando da assistenza all'auto verifica se questa è da riparare, riverniciare o lavare ed
affida il lavoro rispettivamente al meccanico (che la ripara), al carrozziere (che la
rivernicia) o all'autolavaggio (che la lava).
Per ogni auto conosco il nome del modello e posso verificare se è rotta, con la
vernice rovinata o se è sporca.

---

## Parcheggio

Si desidera simulare un parcheggio a pagamento per autovetture. 

* i sviluppi la classe Vettura, avente le variabili d’istanza private int targa, private short oraArrivo, private short oraScadenza, dove le ore sono interi compresi tra 0 e 23. 

* Implementare i relativi metodi di accesso e riscrittura per tali variabili, più un costruttore. 

* Il parcheggio è rappresentato mediante la classe Parcheggio. 

* Il costruttore inizializza un parcheggio con massima capienza numPosti e 0 vetture. 

* I metodi entraVettura ed esceVettura aggiungono e rimuovono, rispettivamente, le vetture dei clienti del parcheggio. 

* Viene restituito il valore true solo nel caso l’operazione possa essere eseguita. 

* Il metodo aggiornaOra incrementa di una unità l’ora corrente, e sposta nella zona rimozione tutte le vetture il cui tempo sia scaduto. 

* Il metodo promozione offre gratuitamente oreGratuite ore a tutte le vetture nel parcheggio il cui numero di targa termini con le cifre codice, dove codice deve essere un numero di due cifre. 

* Il metodo statVetture restituisce una arraylist con tutte le vetture che hanno il più alto numero di ore di parcheggio pagato. 

* viluppare tutti i metodi della classe.


---

[esercizi Java SE](https://github.com/maboglia/CorsoJava/blob/master/esercitazioni/0_Tracce/JavaSE)
