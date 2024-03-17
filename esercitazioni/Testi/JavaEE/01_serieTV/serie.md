Realizzazione di un'applicativo web per la ricerca di informazioni sulle serie TV.

### Database

1. Costruire un database MySQL contenente almeno due tabelle (entities): `serietv` e `genere`.
2. Aggiungere una tabella (opzionale e successiva, relazionale) `watch-list`: serie TV guardate, giudicate (assegnazione di una valutazione alla serie TV).

### Applicativo MVC e RESTful

1. Costruire un servizio backend con Spring (alternativamente servlet + JSP).
2. Il servizio deve permettere la gestione delle viste JSP (MVC).
3. Costruire le viste JSP per permettere agli utenti l'interazione con il database.
4. Implementare un servizio REST per la fruizione e gestione del database da parte di un client REST (endpoint per Angular, jQuery, Postman, ecc.).

### Requisiti

1. Le viste devono rispettare il wireframe fornito in allegato.
2. È possibile implementare un collegamento REST a <http://api.tvmaze.com/search/shows?q=>
3. È possibile allegare al progetto consegnato una relazione relativa all'implementazione/uso dell'applicativo.

Se necessario, fornire ulteriori dettagli sul wireframe fornito e sulla struttura del database.

## DB

Ecco le definizioni delle tabelle SQL per il database delle serie TV:

```sql
CREATE TABLE serietv (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titolo VARCHAR(255) NOT NULL,
    descrizione TEXT,
    anno_lancio INT,
    genere_id INT,
    FOREIGN KEY (genere_id) REFERENCES genere(id)
);

CREATE TABLE genere (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL
);

CREATE TABLE watch_list (
    id INT AUTO_INCREMENT PRIMARY KEY,
    serie_id INT,
    valutazione INT,
    FOREIGN KEY (serie_id) REFERENCES serietv(id)
);
```

Questo script SQL crea tre tabelle:

1. `serietv`: contiene informazioni sulle serie TV, tra cui il titolo, la descrizione, l'anno di lancio e l'ID del genere associato.
2. `genere`: contiene i generi delle serie TV.
3. `watch_list`: rappresenta la lista delle serie TV guardate dall'utente, con la relativa valutazione e l'ID della serie TV associata.

Assicurati di modificare queste definizioni in base alle esigenze specifiche del tuo progetto e del tuo database.

## Viste web

Ecco un esempio di vista HTML per la ricerca delle serie TV e la visualizzazione dei risultati:

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ricerca Serie TV</title>
</head>
<body>
    <h1>Ricerca Serie TV</h1>
    <form action="/search" method="GET">
        <label for="search">Cerca Serie TV:</label>
        <input type="text" id="search" name="query" required>
        <button type="submit">Cerca</button>
    </form>
    <hr>
    <h2>Risultati:</h2>
    <ul>
        <!-- Inserisci qui i risultati della ricerca -->
        <li>Titolo della serie TV</li>
        <!-- Ripeti questo elemento per ogni risultato -->
    </ul>
</body>
</html>
```

Questo codice HTML rappresenta una semplice pagina web con un modulo di ricerca per le serie TV. I risultati della ricerca verranno visualizzati sotto forma di elenco non ordinato `<ul>`.

Ricorda di sostituire il placeholder "Titolo della serie TV" con i veri titoli delle serie TV restituiti dalla tua applicazione.

---

Ecco un esempio di form HTML per l'inserimento di nuovi dati delle serie TV:

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Inserimento Serie TV</title>
</head>
<body>
    <h1>Inserimento Serie TV</h1>
    <form action="/insert" method="POST">
        <label for="title">Titolo:</label>
        <input type="text" id="title" name="title" required><br><br>
        
        <label for="genre">Genere:</label>
        <select id="genre" name="genre">
            <option value="Action">Action</option>
            <option value="Comedy">Comedy</option>
            <option value="Drama">Drama</option>
            <!-- Aggiungi altri generi qui -->
        </select><br><br>

        <label for="seasons">Numero di Stagioni:</label>
        <input type="number" id="seasons" name="seasons" min="1" required><br><br>

        <button type="submit">Inserisci Serie TV</button>
    </form>
</body>
</html>
```

Questo form HTML permette agli utenti di inserire nuove serie TV. I campi richiesti sono il titolo, il genere e il numero di stagioni. Una volta compilato il form, i dati verranno inviati al server per l'elaborazione tramite il metodo POST. Assicurati di aggiungere ulteriori opzioni al menu a discesa per il campo del genere in base alle tue esigenze.
