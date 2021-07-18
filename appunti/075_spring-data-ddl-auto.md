# Spring funzionalità per la generazione di DDL

In **Spring/Spring-Boot**, il database **SQL** può essere inizializzato in modi diversi a seconda dello stack.

**JPA** ha funzionalità per la generazione di **DDL** e queste possono essere impostate per l'esecuzione all'avvio sul database. Questo è controllato attraverso due proprietà esterne:

* `spring.jpa.generate-ddl` (boolean) attiva e disattiva la funzionalità ed è indipendente dal fornitore di DB.
* `spring.jpa.hibernate.ddl-auto` (enum) è una funzionalità di Hibernate che controlla il comportamento in modo più dettagliato. Vedi sotto per maggiori dettagli.

I valori della proprietà di Hibernate sono: `create`, `update`, `create-drop`, `validate` e `none`:

* `create` – Hibernate prima elimina le tabelle esistenti, quindi crea nuove tabelle
* `update` – il modello a oggetti creato sulla base dei mapping (annotazioni o XML) viene confrontato con lo schema esistente, quindi Hibernate aggiorna lo schema in base al diff. Non elimina mai le tabelle o le colonne esistenti anche se non sono più richieste dall'applicazione
* `create-drop` – simile a `create`, con l'aggiunta che Hibernate eliminerà il database dopo che tutte le operazioni sono state completate. Tipicamente utilizzato per il test dell'unità
* `validate` - Hibernate convalida solo se le tabelle e le colonne esistono, altrimenti genera un'eccezione
* `none`: questo valore disattiva effettivamente la generazione DDL

**Spring Boot** imposta internamente questo valore di parametro su `create-drop` se non è stato rilevato alcun gestore di schemi, altrimenti `none` per tutti gli altri casi.

---

la proprietà `spring.jpa.hibernate.ddl-auto` è specifica di Spring Data JPA ed è il loro modo per specificare un valore che verrà eventualmente passato a Hibernate sotto la proprietà che conosce, hibernate.hbm2ddl.auto.

I valori `create`, `create-drop`, `validate` e `update` influenzano sostanzialmente il modo in cui la gestione dello strumento dello schema manipolerà lo schema del database all'avvio.

Ad esempio, l'operazione di `update` interrogherà l'API del driver JDBC per ottenere i metadati del database e quindi Hibernate confronterà il modello a oggetti che crea in base alla lettura delle classi annotate o delle mappature XML HBM e tenterà di regolare lo schema al volo.

L'operazione di `update`, ad esempio, tenterà di aggiungere nuove colonne, vincoli e così via, ma non rimuoverà mai una colonna o un vincolo che potrebbe esistere in precedenza ma che non fa più parte del modello a oggetti di un'esecuzione precedente.

In genere negli scenari di **test case**, probabilmente utilizzerai `create-drop` in modo da creare il tuo schema, il tuo test case aggiunge alcuni dati fittizi, esegui i tuoi test e quindi durante la pulizia del test case, gli oggetti dello schema vengono eliminati, lasciando un banca dati vuota.

In **fase di sviluppo**, è spesso comune vedere gli sviluppatori utilizzare `update` per modificare automaticamente lo schema per aggiungere nuove aggiunte al riavvio. Ma ancora una volta capisci, questo non rimuove una colonna o un vincolo che potrebbe esistere dalle precedenti esecuzioni che non è più necessario.

In produzione, è spesso altamente consigliato non utilizzare `none` o semplicemente non specificare questa proprietà. Questo perché è pratica comune per i DBA rivedere gli script di migrazione per le modifiche al database, in particolare se il database è condiviso tra più servizi e applicazioni.

[fonte stackoverflow]
