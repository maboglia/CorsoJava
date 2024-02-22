# Treni in ritardo

Un pendolare che viaggia quotidianamente tra le città A e B, esasperato dai continui ritardi, vuole fare causa
alla società ferroviaria.

Per tale motivo decide di raccogliere, servendosi di un sito web, le informazioni sui ritardi accumulati da lui e dagli altri pendolari sulla stessa
tratta nell'arco di diversi mesi.
Il sito conosce gli orari ufficiali di partenza ed arrivo dei treni tra A e B (per il viaggio di andata) e tra B ed A (per il ritorno).

Gli utenti registrati possono collegarsi al sito, indicare quale treno hanno preso, e specificare quale è stato l’effettivo orario di partenza e
l’effettivo orario d’arrivo.

Il sito si regge su un database “Ritardi” così organizzato:
- treno( numtreno, orapartenza, oraarrivo, AR )
- viaggio( idviaggio, idutente, numtreno, data, veraorapartenza, veraoraarrivo, commento )
- utente( idutente, cognome, nome )
in cui il campo AR vale “A” per il viaggio di andata e “R” per il ritorno.

Si precisa che i numeri di treno (numtreno) sono tutti diversi, per cui un treno nel verso di andata avrà un numero diverso rispetto allo stesso
treno nel verso di ritorno.

Si vuole realizzare in tecnologia Java Web una porzione del sito, che comprenda le seguenti funzionalità:

1. Una pagina inserisciViaggio.jsp che, se l’utente è correttamente autenticato al sito, gli permetta di inserire i dati relativi ad un viaggio
effettuato. L’utente deve selezionare un treno dall’elenco dei treni disponibili ed inserire la reale ora di partenza e di arrivo, oltre ad un
commento opzionale. Si assuma che la data del viaggio sia quella del giorno corrente.
2. Una pagina tuttiRitardi.jsp, accessibile a tutti gli utenti (anche non registrati) che mostri due elenchi di treni (un elenco per le corse di
andata ed uno per le corse di ritorno), e a fianco di ciascun treno indichi il ritardo medio sull’orario di partenza ed il ritardo medio sull’orario di
arrivo. La media va calcolata tenendo conto delle segnalazioni di tutti gli utenti.
3. Una pagina mieiRitardi.jsp, accessibile ai soli utenti autenticati al sito, che riporti le stesse informazioni della pagina precedente, ma
facendo riferimento alle sole segnalazioni fornite dall’utente
stesso.

In particolare, si richiede di:
- identificare, a partire dalle specifiche precedenti, le componenti necessarie (pagine jsp, servlet, bean, ...) a
realizzare le funzionalità sopra descritte secondo il paradigma MVC
- implementare tali pagine e classi.
