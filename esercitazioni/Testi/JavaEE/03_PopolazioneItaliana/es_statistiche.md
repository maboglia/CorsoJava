# Esercitazione - Statistiche sulla Popolazione Italiana

Realizzare un'applicazione web che consenta di visualizzare informazioni statistiche sulla popolazione italiana. I dati sono memorizzati in un database MySQL, con fonte dati proveniente dall'ISTAT.

L'applicazione web è composta dalle seguenti pagine (viste):

1. **Home Page**: Questa vista mostra due collegamenti: uno per la selezione per regione e l'altro per la selezione per età.

2. **Pagina 1**: Qui viene mostrato un selettore per scegliere la regione tra quelle disponibili nella tabella.

3. **Pagina 2**: Questa vista mostra un selettore condizionale per scegliere tra le province della regione selezionata nella Pagina 1.

4. **Pagina 3**: Qui viene visualizzato il grafico della distribuzione della popolazione tra maschi e femmine per il comune selezionato nella Pagina 2.

5. **Pagina 4**: In questa vista vengono mostrati i selettori per scegliere l'intervallo di età. Dopo aver premuto il pulsante "Trova", vengono visualizzati i risultati della ricerca con una tabella e un grafico correlati all'intervallo selezionato.

Il database MySQL contiene due tabelle con i dati corrispondenti: popolazione per provincia e popolazione per età. La struttura e i dati sono allegati al progetto.

Requisiti:

- Applicare i principi dell'architettura REST nell'implementazione del progetto.
- Implementare con un linguaggio di back-end le API per restituire i dati contenuti nel DB in formato JSON.
- Implementare l'interfaccia utilizzando i metodi disponibili in JavaScript, come XHR, fetch API, Jquery.ajax(), ecc.
