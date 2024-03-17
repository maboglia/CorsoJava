# Web Application per la Gestione della Playlist di Canzoni

Realizzate una web application per la gestione di una playlist di canzoni, seguendo il pattern architetturale Model-View-Controller (MVC) e il pattern DAO (Data Access Object) per interagire con il database.

### Modello

Il modello sarà costituito dalle seguenti classi:

1. **Canzone**: rappresenta un singolo brano musicale e conterrà i seguenti attributi:
   - `id`: identificatore univoco della canzone
   - `titolo`: titolo della canzone
   - `cantante`: nome del cantante o della band che ha eseguito la canzone

2. **Playlist**: rappresenta una collezione di brani musicali e avrà i seguenti attributi:
   - `id`: identificatore univoco della playlist
   - `nome`: nome della playlist
   - `canzoni`: elenco delle canzoni presenti nella playlist

### Controller

Il controller sarà responsabile di gestire le richieste degli utenti e di coordinare il flusso di dati tra il modello e la vista. Le principali funzionalità del controller includeranno:

1. Aggiunta di una nuova canzone alla playlist
2. Rimozione di una canzone dalla playlist
3. Visualizzazione dell'elenco completo delle canzoni presenti nella playlist
4. Ricerca di una canzone per titolo o per cantante
5. Creazione di una nuova playlist e registrazione nel database

### Vista

La vista sarà responsabile di presentare i dati all'utente in modo chiaro e comprensibile. Le viste richieste includeranno:

1. Pagina principale con le opzioni per aggiungere, rimuovere, visualizzare e cercare canzoni nella playlist
2. Form per aggiungere una nuova canzone alla playlist
3. Elenco delle canzoni presenti nella playlist
4. Form per cercare una canzone per titolo o per cantante
5. Pagina per creare una nuova playlist e salvarla nel database

### DAO (Data Access Object)

Il DAO sarà responsabile di interagire con il database per eseguire operazioni di lettura e scrittura. Le operazioni principali includeranno:

1. Recupero dell'elenco completo delle canzoni dal database
2. Aggiunta di una nuova canzone al database
3. Rimozione di una canzone dal database
4. Ricerca di una canzone per titolo o per cantante nel database
5. Creazione di una nuova playlist e registrazione nel database

Implementate la web application utilizzando tecnologie come Spring MVC per il controller, Thymeleaf per la vista e JDBC per il DAO per interagire con il database. Assicuratevi che l'applicazione sia intuitiva e facile da usare per gli utenti, consentendo loro di gestire la propria playlist in modo efficiente e piacevole.
