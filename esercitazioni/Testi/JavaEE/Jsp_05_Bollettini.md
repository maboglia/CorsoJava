# Bollettini  

## Livello Base  

Scrivere un’applicazione Web che consente di pagare bollettini di conto corrente postale.
L’applicazione deve consentire di eseguire il seguente caso d’uso.

### “Utente paga bollettino”

Scenario Principale
- L’utente accede ad uno schermo iniziale (index.jsp) nel quale viene visualizzata una maschera per
specificare i dati del bollettino da pagare. E' necessario specificare il conto corrente postale su cui
effettuare il versamento (un numero di 6 cifre), il codice prestampato del bollettino (una sequenza di
lettere e cifre), la causale del versamento e l'importo in euro (es: pagamento del bollettino di codice
1453hdf6x sul conto corrente n. 345678 con la causale "pagamento bolletta").
- Il sistema verifica che il conto corrente postale sia tra quelli abilitati al pagamento. I conti correnti
abilitati sono memorizzati in una tabella ContiCorrenti  della base di dati che contiene il codice del
conto corrente e il nome dell'intestatario (es: conto corrente n. 345678 intestato a Telecom Italia).  
- Se il conto corrente è tra quelli abilitati, l’utente accede ad uno schermo (pagamento.jsp) nel quale sono
riassunti i dati relativi al bollettino; lo schermo contiene inoltre una maschera attraverso la quale l’utente
fornisce (a) il suo nome e cognome; (b) il codice della sua carta di credito, ed un collegamento allo
schermo finale (uscita.jsp) per abbandonare l'applicazione.
- Procedendo al pagamento, il sistema registra i dati in una tabella Bollettini in cui, per ciascun
pagamento sono registrati il codice del bollettino, l'importo, la causale, il codice del conto del
destinatario, il nome del pagatore ed il numero di carta di credito. L’utente accede ad uno schermo
(conferma.jsp) nel quale vengono riassunti i risultati dell’operazione (dati del bollettino); lo schermo
contiene un collegamento allo schermo iniziale nel caso l’utente voglia eseguire un ulteriore acquisto, ed
un collegamento allo schermo finale (uscita.jsp) per uscire dall'applicazione.
- Lo schermo finale (uscita.jsp) contiene un messaggio di uscita ed un collegamento allo schermo iniziale
(index.jsp).
Scenario alternativo: Il conto corrente del destinatario non è tra quelli abilitati
- L’utente accede ad uno schermo (errore.jsp) in cui viene visualizzato un messaggio di errore ed un
collegamento allo schermo principale per effettuare una nuova operazione
## Livello Intermedio

Scrivere un’applicazione Web che consente di pagare bollettini di conto corrente postale.
L’applicazione deve consentire di eseguire il seguente caso d’uso.

### “Utente paga bollettini”

Scenario Principale
- L’utente accede ad uno schermo iniziale (index.jsp) che contiene un messaggio di benvenuto ed un
pulsante per entrare nell'applicazione.
- Entrando nell'applicazione, all'utente viene assegnato un carrello degli acquisti, inizialmente vuoto.
L'utente accede ad uno schermo (datiBollettino.jsp) nel quale viene visualizzato (a) lo stato del carrello
fino a quel punto, (b) un collegamento allo schermo finale (uscita.jsp) attraverso cui l'utente può
abbandonare l'applicazione (c) una maschera per specificare i dati di un bollettino da pagare, ovvero: il
conto corrente postale su cui effettuare il versamento (un numero di 6 cifre), il codice prestampato del
bollettino (una sequenza di 8 caratteri), la causale del versamento e l'importo in euro (es: pagamento del
bollettino di codice 1453hdf6 sul conto corrente n. 345678 con la causale "pagamento bolletta").
- Il sistema convalida i dati forniti e verifica che il conto corrente postale sia tra quelli abilitati al
pagamento. I conti correnti abilitati sono memorizzati in una tabella ContiCorrenti  della base di dati
che contiene il codice del conto corrente e il nome dell'intestatario (es: conto corrente n. 345678
intestato a Telecom Italia).  
- Se i dati forniti sono corretti e il conto corrente è tra quelli abilitati, l’utente accede ad uno schermo
(conferma.jsp) in cui sono riassunti i dati del bollettino; lo schermo contiene inoltre (a) un
collegamento allo schermo iniziale (datiBollettino.jsp) per procedere ad altri acquisti (b) un
collegamento ad uno schermo (pagamento.jsp) che consente di procedere al pagamento di tutti i
bollettini contenuti nel carrello; (c) un collegamento allo schermo di uscita (uscita.jsp) attraverso il
quale l’utente può abbandonare l’applicazione senza effettuare l’acquisto
- Se l'utente decide di procedere con il pagamento, accede allo schermo (pagamento.jsp) nel quale sono
riassunti i dati relativi al carrello degli acquisti; lo schermo contiene inoltre una maschera attraverso la
quale l’utente fornisce (a) il suo nome e cognome; (b) il codice della sua carta di credito.
- Sottomettendo la maschera, il sistema registra i pagamenti in una tabella Bollettini in cui, per ciascun
pagamento sono registrati (a) il codice del bollettino, (b) l'importo, (c) la causale, (d) il riferimento al
conto del destinatario, (d) il nome del pagatore ed (f) il numero di carta di credito. L’utente accede ad
uno schermo (confermaPagamento.jsp) nel quale vengono riassunti i risultati dell’operazione di
pagamento; lo schermo contiene inoltre (a) un collegamento allo schermo finale (uscita.jsp) attraverso il
quale l’utente può abbandonare l’applicazione; (b) un collegamento allo schermo (index.jsp) nel caso
l’utente voglia ricominciare daccapo.
Scenario alternativo: I dati del bollettino sono scorretti o il conto corrente del destinatario non è abilitato
- L’utente ritorna allo schermo di immissione (datiBollettino.jsp) in cui viene visualizzato un messaggio
di errore.
