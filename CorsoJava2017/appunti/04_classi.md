#Introduzione alla Programmazione Orientata agli Oggetti (Object Oriented Programming – OOP)
                      
                 
#Programmazione imperativa (1)
Abbiamo visto come programmare utilizzando i seguenti tipi di dati:

* Tipi di dato primitivi (int, double, char, boolean, ecc...) 
* Le stringhe
* Gli array

I programmi fatti fino ad ora consistevano di una sequenza di comandi
strutture di controllo (cicli, scelte condizionali, ecc...) ed eventualmente metodi ausiliari
che consentivano di manipolare i dati per calcolare il risultato voluto.
Questo modo di programmare prende il nome di
_PROGRAMMAZIONE IMPERATIVA_
      (nota: imperativa in quanto basata su comandi)
                     
##Programmazione imperativa (2)
Nella programmazione imperativa:
Un programma prevede uno stato globale costituito dai valori delle sue variabili
I comandi del programma modificano lo stato fino a raggiungere uno stato finale (che include il risultato)
                        
##Programmazione imperativa (3)
Ad esempio, il seguente programma (che calcola il prodotto di x e y):
ha la seguente dinamica:
                               int x=10, y=3, p=0;
for (int i=0; i<y; i++)
p+=x;
                 
##Programmazione orientata agli oggetti (1)
Sebbene sia possibile scrivere programmi interessanti con i tipi di dato visti fino ad ora, spesso i programmi hanno bisogno di manipolare strutture dati che rappresentano più fedelmente le entità del mondo reale.
Ad esempio, immaginate di dover scrivere programmi per la gestione di...
Conti bancari: ogni conto bancario ha un proprio saldo, un proprio intestatario, una propria lista di movimenti, ecc...
Dipendenti: ogni dipendente di un’azienda ha una propria matricola, un proprio stipendio, un proprio orario di lavoro, ecc...
Parchi macchine: ogni automobile ha la propria targa, il proprio contachilometri, il proprio storico delle manutenzioni, ecc...
Rettangoli: ogni rettangolo ha la propria base, altezza e posizione nel piano.
Scrivere un programma di questo tipo usando solo interi, array e strighe pùo diventare abbastanza complicato...
                         
##Programmazione orientata agli oggetti (2)
Notate che ogni entità del mondo reale (e.g. il conto bancario) prevede un proprio stato interno (e.g. saldo, ecc...) e delle proprie funzionalità (e.g. versamento, prelievo, ecc...)
Per questo motivo un linguaggio di programmazione ORIENTATO AGLI OGGETTI (tipo Java) fornisce meccanismi per definire nuovi tipi di dato basati sul concetto di classe
Una classe definisce un insieme di oggetti (conti bancari, dipendenti, automobili, rettangoli, ecc...).
Un oggetto è una struttura dotata di:
proprie variabili (che rappresentano il suo stato) propri metodi (che realizzano le sue funzionalità)
                        
##Primo esempio di programmazione con oggetti (1)
Scriviamo un programma che usa un conto corrente
Consiste di due classi:
UsaConto che contiene il main del programma
ContoCorrente che descrive gli oggetti che rappresentano i conti
correnti
public class UsaConto {
public static void main(String[] args) {
// crea un nuovo conto corrente inizializzato con 1000 euro
ContoCorrente cc = new ContoCorrente(1000); // versa 700 euro
cc.versa(700);
// fa un po’ di prelievi, controllando prima il saldo
if (cc.saldo>200) cc.preleva(200); if (cc.saldo>900) cc.preleva(900);
System.out.println("Saldo finale: " + cc.saldo); }
                                                                       }
                           
##Primo esempio di programmazione con oggetti (2)
public class ContoCorrente {
// variabile che memorizza lo stato del conto
public double saldo;
// costruttore della classe
public ContoCorrente(double saldoIniziale) { saldo=saldoIniziale;
}
// metodo per il versamento di somme
public void versa(double somma) { saldo+=somma;
}
// metodo per il prelievo di somme
public void preleva(double somma) { saldo-=somma;
} }
                                                                  
##Primo esempio di programmazione con oggetti (3)
Osservazioni:
La classe UsaConto non è molto diversa dai programmi che abbiamo scritto fino ad ora...
In UsaConto:
I cc.versa() è una invocazione di un metodo, cc.saldo è una lettura di una variabile
In ContoCorrente:
I non c’è il main (ce n’e’ uno solo per tutto il programma)
I c’è una variabile (saldo) che rappresenta lo stato del conto
I ci sono due metodi (versa() e preleva()) che descrivono le
funzionalità del conto
I c’e’ un metodo speciale (ContoCorrente()) che inizializza il conto I il metodo ContoCorrente() è detto costruttore e viene richiamato
quando si usa il comano new (non prevede tipo di ritorno)
I i metodi e la variabile sono pubblici (public) quindi possono essere
usati anche da altre classi (e.g. UsaConto)
I nei metodi non si usa il modificatore static (capiremo più avanti
   perch ́e)
                      
##Primo esempio di programmazione con oggetti (4)
Vediamo ora come gestire più conti correnti
public class UsaDueConti {
public static void main(String[] args) {
// crea un nuovo conto corrente inizializzato con 1000 euro
ContoCorrente conto1 = new ContoCorrente(1000);
// crea un nuovo conto corrente inizializzato con 200 euro
ContoCorrente conto2 = new ContoCorrente(200); // preleva 700 euro dal primo conto...
conto1.preleva(700);
// ...e li versa nel secondo
conto2.versa(700);
System.out.println("Saldo primo conto: " + conto1.saldo);
System.out.println("Saldo secondo conto: " + conto2.saldo); }
}
                                                                     
##L’esecuzione di un programma a oggetti (1))
In un programma basato su oggetti, lo stato
non è più uno stato unico globale (come nel caso della
programmazione imperativa)
ma è composto da tutti gli stati interni di tutti gli oggetti attivi
                        
##L’esecuzione di un programma a oggetti (2)
Per descrivere l’esecuzione di un programma a oggetti
ci si pùo concentrare sulle invocazioni di metodi dei vari oggetti trascurando i dettagli della loro implementazione (i singoli comandi che contengono)
Un diagramma come questo fa capire che il metodo pagaStipendio() di della classe Dipendente richiama il metodo versa() di ContoCorrente
                        
##OOP e Ingegneria del Software
La programmazione orientata agli oggetti semplifica la realizzazione di programmi complessi:
1. Si identificano le varie entità da rappresentare tramite classi e oggetti
2. Si specificano le variabili e i metodi di ogni classe accessibili dalle
altre classi (ossia l’interfaccia pubblica della classe)
3. Si implementano le varie classi separatamente, concentrandosi su una
per volta
4. Le varie classi possono essere implementate da persone diverse indipendentemente
La disciplina che si occupa di organizzare questo lavoro è l’Ingegneria del Software
Definisce notazioni (diagrammi), metodologie e procedure che rendono il processo di sviluppo di software complessi più e ciente e a dabile.
                       
 Sommario
 1 Programmazione Orientata agli Oggetti: concetti
2 Programmazione Orientata agli Oggetti: highlights
                      
##OOP Highlights (1)
Riprendiamo l’esempio del conto corrente:
public class ContoCorrente {
public double saldo;
public ContoCorrente(double saldoIniziale) { saldo=saldoIniziale;
}
public void versa(double somma) { saldo+=somma;
}
public void preleva(double somma) { saldo-=somma;
} }
                                                                                                
##OOP Highlights (2)
Riprendiamo anche il primo main che abbiamo considerato:
public class UsaConto {
public static void main(String[] args) {
// crea un nuovo conto corrente inizializzato con 1000 euro
ContoCorrente cc = new ContoCorrente(1000); // versa 700 euro
cc.versa(700);
// fa un po’ di prelievi, controllando prima il saldo
if (cc.saldo>200) cc.preleva(200); if (cc.saldo>900) cc.preleva(900);
System.out.println("Saldo finale: " + cc.saldo); }
}
                                                                                                
##OOP Highlights (3)
Arricchiamo un po’ il comportamento dei metodi:
Tracciamo i movimenti stampando dei messaggi
public class ContoCorrente {
public double saldo;
public ContoCorrente(double saldoIniziale) { saldo=saldoIniziale;
}
public void versa(double somma) {
saldo+=somma;
System.out.println("Versati: " + somma + " euro");
}
public void preleva(double somma) {
saldo-=somma;
System.out.println("Prelevati: " + somma + " euro");
} }
                                                                      
##OOP Highlights (4)
Abbiamo modificato la classe... dobbiamo mettere mano anche al main (e/o alle altre classi che la usano)?
NO!
Highlight: se non modifichiamo l’interfaccia pubblica (nomi dei metodi, parametri, valori di ritorno) possiamo modificare la classe senza compromettere il resto del programma
Più facile fare manutenzione e aggiornamenti a parti del programma!
                        
##OOP Highlights (5)
Modifiche all’interfaccia pubblica richiedono invece di modificare anche i chiamanti (in questo caso il main)
Esempio: consentiamo il prelievo solo se c’e’ la disponibilità
public class ContoCorrente {
public double saldo;
public ContoCorrente(double saldoIniziale) { saldo=saldoIniziale;
}
public void versa(double somma) {
saldo+=somma;
System.out.println("Versati: " + somma + " euro");
}
// restituisce false se non ci sono abbastanza soldi
public boolean preleva(double somma) { if (saldo<somma) return false;
else {
saldo-=somma;
System.out.println("Prelevati: " + somma + " euro"); return true;
} }
                                                     }
                        
##OOP Highlights (6)
Modifichiamo di conseguenza il main: public class UsaConto {
public static void main(String[] args) {
// crea un nuovo conto corrente inizializzato con 1000 euro
ContoCorrente cc = new ContoCorrente(1000); // versa 700 euro
cc.versa(700);
// fa un po’ di prelievi, controllando prima il saldo. // posso tenere conto o meno del risultato (true/false) if (!cc.preleva(200)) System.out.println("Fallito"); cc.preleva(900);
System.out.println("Saldo finale: " + cc.saldo); }
}
                                                                  
OOP Highlights (7)
Prima abbiamo aggiunto la stampa dei messaggi per tracciare le operazioni sul conto...
ma chi vieta all’utilizzatore di questa classe di modificare a mano il saldo?
                              cc.saldo=10000000;
         
##OOP Highlights (8)
Il saldo è pubblico (public)
se vogliamo evitare che sia modificabile dall’esterno della classe lo dobbiamo trasformare in privato (private)
public class ContoCorrente {
// ora e’ visibile solo all’interno di questa classe
private double saldo;
public ContoCorrente(double saldoIniziale) { saldo=saldoIniziale;
}
public void versa(double somma) {
saldo+=somma;
System.out.println("Versati: " + somma + " euro");
}
public boolean preleva(double somma) { if (saldo<somma) return false;
else {
saldo-=somma;
System.out.println("Prelevati: " + somma + " euro"); return true;
} }
                                                     }
                        
##OOP Highlights (9)
Ora siamo sicuri che le modifiche al saldo avverranno solo tramite i metodi
Ma.... come farà il main a stampare il saldo? Idee?
                       
##OOP Highlights (10)
Soluzione: Aggiungiamo un metodo public class ContoCorrente {
private double saldo;
public ContoCorrente(double saldoIniziale) { saldo=saldoIniziale;
}
public void versa(double somma) {
saldo+=somma;
System.out.println("Versati: " + somma + " euro");
}
public boolean preleva(double somma) { if (saldo<somma) return false;
else {
saldo-=somma;
System.out.println("Prelevati: " + somma + " euro"); return true;
} }
// restituisce il saldo a chi ne ha bisogno
public double ottieniSaldo() { return saldo;
} }
                                                              
##OOP Highlights (11)
Il metodo che abbiamo aggiunto consente di accedere al saldo solo “in lettura”
In questo modo il valore del saldo è sempre sotto controllo dei metodi
Highlight: la proprietà per cui i dati che rappresentano lo stato interno di un oggetto possono essere accessibili solo tramite i metodi dell’oggetto stesso è detta INCAPSULAMENTO
L’incapsulamento consente di gestire un oggetto come una “scatola nera” (black box).
Dall’esterno si sa cosa fa un oggetto, ma non come lo fa...
                        
#Gestione della Memoria nella Programmazione Orientata agli Oggetti

* 1 Condivisione di variabili tra classi (variabili statiche)
2 Gestione della memoria nella Java Virtual Machine
3 Riferimenti a oggetti
4 Un esempio complesso (da vedere a casa...)
 
###Esempio: conti correnti (1)
Riprendiamo l’esempio del conto corrente
public class ContoCorrente {
private double saldo;
public ContoCorrente(double saldoIniziale) { saldo=saldoIniziale;
}
public void versa(double somma) {
saldo+=somma;
System.out.println("Versati: " + somma + " euro");
}
public boolean preleva(double somma) { if (saldo<somma) return false;
else {
saldo-=somma;
System.out.println("Prelevati: " + somma + " euro"); return true;
} }
public double ottieniSaldo() { return saldo;
} }
                                                            
###Esempio: conti correnti (2)
E un relativo main
public class UsaDueConti {
public static void main(String[] args) {
// crea un nuovo conto corrente inizializzato con 1000 euro
ContoCorrente conto1 = new ContoCorrente(1000);
// crea un nuovo conto corrente inizializzato con 200 euro
ContoCorrente conto2 = new ContoCorrente(200); // preleva 700 euro dal primo conto...
conto1.preleva(700);
// ...e li versa nel secondo
conto2.versa(700);
System.out.println("Saldo primo conto: " + conto1.ottieniSaldo())
System.out.println("Saldo secondo conto: " + conto2.ottieniSaldo( }
}
                                                  ; )
##Condividere variabili (1)
Supponiamo ora di voler attribuire ad ogni conto un numero identificativo
il numero del conto....
dobbiamo aggiungere una variabile alla classe!
  
##Condividere variabili (2)
        public class ContoCorrente { private double saldo;
// memorizza il numero del conto
private int numero;
// inizializza anche il numero del conto
public ContoCorrente(double saldoIniziale, int numeroConto) { saldo=saldoIniziale;
numero=numeroConto;
}
public void versa(double somma) { ...come prima... } public boolean preleva(double somma) { ...come prima... } public double ottieniSaldo() { return saldo; }
// fornisce il numero del conto
public double ottieniNumero() { return numero; } }
                                                
##Condividere variabili (3)
Modifichiamo di conseguenza il main public class UsaDueConti {
public static void main(String[] args) {
// crea un nuovo conto NUMERO 10001 con 1000 euro
ContoCorrente conto1 = new ContoCorrente(1000,10001); // crea un nuovo conto NUMERO 10002 con 200 euro
ContoCorrente conto2 = new ContoCorrente(200,10002); // preleva 700 euro dal primo conto...
conto1.preleva(700);
// ...e li versa nel secondo
conto2.versa(700);
// ORA QUI POSSIAMO USARE IL NUMERO
System.out.print("Conto " + conto1.ottieniNumero()); System.out.println(" saldo : "+conto1.ottieniSaldo()); System.out.print("Conto " + conto2.ottieniNumero()); System.out.println(" saldo : "+conto2.ottieniSaldo());
} }
                                                        
##Variabili statiche (1)
In questo modo il numero del conto deve essere deciso dal chiamante (e.g. main)
Il main è responsabile di gestire i numeri dei conti
Che succede se il main attribuisce lo stesso numero a due conti
diversi?
Sarebbe meglio se al momento della creazione un conto potesse generare il proprio numero da se
Ad esempio incrementando di uno il numero dell’ultimo conto corrente creato
   
##Variabili statiche (2)
Per rendere possibile ci`o è necessaria un’informazione condivisa da oggetti ContoCorrente diversi
Serve una variabile contatore che sia visibile a tutti gli oggetti
    ContoCorrente
Tale variabile “condivisa” conterrà il numero dell’ultimo conto creato
Un nuovo oggetto incrementerà la variabile condivisa di 1 e userà tale valore come proprio numero di conto
Una variabile condivisa da tutti gli oggetti di una certa classe la si ottiene con il modificatore static
   
##Variabili statiche (3)
public class ContoCorrente { private double saldo;
// memorizza il numero del conto
private int numero;
// variabile condivisa (inizializzata a 1000) private static int numeroUltimoContoCreato = 1000;
// il numero del conto viene inizializzato usando la variabile cond
public ContoCorrente(double saldoIniziale) { saldo=saldoIniziale; numeroUltimoContoCreato++; numero=numeroUltimoContoCreato;
}
public void versa(double somma) { ...come prima... } public boolean preleva(double somma) { ...come prima... } public double ottieniSaldo() { return saldo; }
// fornisce il numero del conto
public double ottieniNumero() { return numero; } }
                                                              i
##Variabili statiche (4)
public class UsaDueConti {
public static void main(String[] args) {
// crea un nuovo conto (NUMERO AUTOMATICO) con 1000 euro
ContoCorrente conto1 = new ContoCorrente(1000);
// crea un nuovo conto (NUMERO AUTOMATICO) con 200 euro
ContoCorrente conto2 = new ContoCorrente(200); // preleva 700 euro dal primo conto...
conto1.preleva(700);
// ...e li versa nel secondo
conto2.versa(700);
System.out.print("Conto " + conto1.ottieniNumero()); System.out.println(" saldo : "+conto1.ottieniSaldo()); System.out.print("Conto " + conto2.ottieniNumero()); System.out.println(" saldo : "+conto2.ottieniSaldo());
} }
                                              
##Variabili statiche (5)
Altro esempio di uso di static
Supponiamo di voler aggiungere al nostro programma la gestione
degli interessi maturati nei conti
Dobbiamo memorizzare il tasso da applicare al conto corrente
  
##Variabili statiche (6)
public class ContoCorrente {
private double saldo;
private int numero;
private static int numeroUltimoContoCreato = 1000;
// memorizza il tasso di interesse (inizializzato a 0.02)
// lo dichiaro pubblico per renderlo modificabile dall’esterno public double tasso = 0.02;
public ContoCorrente(double saldoIniziale) { ...come prima... } public void versa(double somma) { ...come prima... }
public boolean preleva(double somma) { ...come prima... }
public double ottieniSaldo() { return saldo; }
public double ottieniNumero() { return numero; }
// aggiorna il saldo aggiungendo gli interessi
public maturaInteressi() { saldo += saldo*tasso;
} }
                                              
##Variabili statiche (7)
Ma... supponiamo che il tasso sia lo stesso per tutti i conti correnti.
oppure (vedremo dopo) che ci siano delle “categorie” di tasso (ad esempio: tasso family e tasso business)
Per cambiare i tassi di interesse devo prendere un conto corrente per volta e aggiornare la sua variabile tasso
 Anche in questo caso sarebbe più pratico se la variabile tasso fosse condivisa da tutte le classi (quindi static)
        // supponendo che contiGestiti sia un array di conti correnti
for (ContoCorrente cc : contiGestiti) cc.tasso+=0.01;
                 
##Variabili statiche (8)
public class ContoCorrente {
private double saldo;
private int numero;
private static int numeroUltimoContoCreato = 1000;
// aggiungo static per condividere questa variabile
public static double tasso = 0.02;
public ContoCorrente(double saldoIniziale) { ...come prima... } public void versa(double somma) { ...come prima... }
public boolean preleva(double somma) { ...come prima... }
public double ottieniSaldo() { return saldo; }
public double ottieniNumero() { return numero; }
// aggiorna il saldo aggiungendo gli interessi
public maturaInteressi() { saldo += saldo*tasso;
} }
                                            
##Variabili statiche (9)
Ora per cambiare i tassi di interesse in tutti i conti correnti è su ciente fare:
Note:
Le variabili statiche possono essere riferite usando il nome della classe invece che il nome di un oggetto
Si pùo comunque usare anche il nome di un oggetto (es. cc.tasso+=0.01)
La variabile tasso pùo essere usata anche se non esistono oggetti di tipo ContoCorrente
           ContoCorrente.tasso+=0.01;
         
Metodi statici
Anche un metodo puo` essere dichiarato static
Un metodo “statico” pùo accedere solo a variabili “statiche”
non pùo utilizzare variabili d’istanza (ossia, non static)
 Di solito i metodi statici vengono creati per funzionalità che non hanno bisogno di uno stato (state-less)
Quindi non hanno bisogno di creare oggetti
Possono essere invocati usando il nome della classe Tipicamente sono metodi che ricevono i parametri ed eseguono qualche calcolo generico su essi
Abbiamo visto esempi di metodi statici nella classe Math Math.random()
    Math.pow()
          public static int somma(int x, int y) { return x+y; }
         .....
 Gestione memoria nella JVM (1)
Per capire meglio come funzionano classi e oggetti diamo uno sguardo “sotto il cofano” della Java Virtual Machine (JVM)
La memoria usata dalla JVM è concettualmente divisa in tre parti
Ambiente delle classi: area di memoria in cui vengono caricate (allocate) tutte le classi che costituiscono il programma
Stack: area di memoria in cui vengono caricati (allocati) i record di attivazione dei metodi, e quindi tutte le variabili locali
Heap: area di memoria in cui vengono caricati (allocati) tutti i vari oggetti creati nel programma, man mano che vengono creati.
   

####Nell’ambiente delle classi

* vengono memorizzati il codice dei metodi e le variabili statiche di tutte
le classi del programma
* sono le parti condivise dai vari oggetti della classe
* le variabili statiche sono utilizzabili anche in assenza di oggetti

####Nello stack

* vengono memorizzate le variabili locali dei metodi in esecuzione
* per le variabili di tipi primitivi viene memorizzato il valore (esempio:
somma)
* per le variabili di tipo classe viene memorizzato un riferimento
(indirizzo di memoria di un oggetto) Nell’heap
* per ogni oggetto creato vengono memorizzate le variabili d’istanza (ossia, le variabili non statiche)
* ogni oggetto nell’heap contiene anche il nome della classe di appartenenza
   
##Riferimenti (1)
I riferimenti meritano un approfondimento.
Abbiamo visto che una variabile di un tipo primitivo contiene direttamente il valore del dato
La dichirazione della variabile x alloca la memoria necessaria per contenere un int
Un assegnamento alla variabile x scrive un valore nella memoria precedentemente allocata
L’assegnamento di x a y copia il contenuto della variabile (il valore)
La modifica di y non modifica x y = 40;
          int x;
                  x = 33;
                  int y = x;
           
##Riferimenti (2)

Una variabile di un tipo classe contiene invece un riferimento a un oggetto La dichirazione della variabile primo di tipo Rettangolo alloca la
memoria necessaria per contenere un riferimento (inizializzato a null)
La creazione dell’oggetto primo alloca un nuovo oggetto e assegna un riferimento alla variabile
           Rettangolo primo;
                   primo = new Rettangolo(10,30)
        
##Riferimenti (3)
L’assegnamento di primo a secondo copia il contenuto della variabile (il riferimento)
La modifica di secondo modifica l’oggetto riferito anche da primo
           Rettangolo secondo = primo;
                   secondo.base = 15;
        
##Riferimenti (4)
Lo stesso discorso vale anche quando si passa un oggetto a un metodo come parametro
Viene passato il riferimento
Ogni modifica fatta all’oggetto all’interno del metodo non viene persa alla quando il metodo termina (il chiamante vedrà l’oggetto modificato)
Lo stesso discorso vale per gli array (gli array sono in realtà oggetti!)
   
##Riferimenti (5)
Una conseguenza del fatto che le variabili di tipo classe contengono riferimenti, è che l’opearatore di confronto == non si comporta (con gli oggetti) come uno si potrebbe aspettare...
Infatti oggetto1 == oggetto2 vale true solo se oggetto1 e oggetto2 sono (riferimenti al) lo stesso oggetto.
Esempio:
Abbiamo che:
        Rettangolo r1 = new Rettangolo(10,12); Rettangolo r2 = r1;
Rettangolo r3 = new Rettangolo(10,12);
                        System.out.println(r1==r2); // stampa true System.out.println(r1==r3); // stampa false
             
##Riferimenti (6)
Una soluzione a questo problema pùo essere il metodo equals.
Tutti gli oggetti (capiremo perchè) dispongono di alcuni metodi di base
Uno di questi è equals, e permette di confrontare due oggetti Lo abbiamo visto nelle stringhe
  Nelle classi più comuni della Libreria Standard di Java, il metodo equals è implementato in modo da confrontare una per una tutte le variabili interne di una coppia di oggetti
Anche nelle proprie classi si pùo implementare tale metodo (vedremo...)
        s1.equals(s2);
         
##Garbage collection (1)
Un’altra conseguenza del fatto che le operazioni (lettura, assegnamento, copia, ...) su variabili di tipo classe lavorino su riferimenti è che si possono ottenere oggetti orfani (privi di riferimenti).
Ad esempio:
supponiamo di creare due oggetti di tipo Rettangolo
          Rettangolo primo = new Rettangolo(10,30); Rettangolo secondo = new Rettangolo(20,50);
             
##Garbage collection (2)
ora assegniamo secondo a primo
come è possibile accedere al vecchio valore di primo (il rettangolo di dimensioni 10 e 30) ???
Il vecchio oggetto è rimasto orfano... (nessun riferimento ad esso)
            Rettangolo primo = secondo;
         
##Garbage collection (3)
Il vecchio oggetto non è più utilizzabile!!! (è garbage, spazzatura)
Il linguaggio Java (come molti linguaggi moderni) prevede un meccanismo di rimozione degli oggetti privi di riferimenti detto Garbage Collector
Il garbage collector viene eseguito periodicamente dalla Java Virtual Machine. Interrompe per un attimo l’esecuzione del programma e pulisce la memoria dagli oggetti privi di riferimenti
    

