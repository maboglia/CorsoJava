# Negozio di abbigliamento

Per la gestione del negozio di abbigliamento, possiamo progettare un'applicazione web utilizzando Spring Framework. Utilizzeremo Spring Boot per avviare rapidamente il progetto e semplificare la configurazione. Inoltre, useremo Spring MVC per implementare il pattern Model-View-Controller, consentendo una gestione efficiente delle richieste HTTP.

**Progettazione del database:**

Per gestire i dati dell'applicazione, possiamo utilizzare le seguenti tabelle MySQL:

1. Tabella `Cliente`:
   - `idCliente` (primary key)
   - `nome`
   - `indirizzo`

2. Tabella `Acquisto`:
   - `idAcquisto` (primary key)
   - `idCliente` (foreign key verso la tabella Cliente)
   - `data`

3. Tabella `Prodotto`:
   - `idProdotto` (primary key)
   - `nome`
   - `prezzo`

4. Tabella `DettaglioAcquisto`:
   - `idDettaglio` (primary key)
   - `idAcquisto` (foreign key verso la tabella Acquisto)
   - `idProdotto` (foreign key verso la tabella Prodotto)
   - `quantita`

**Implementazione dell'applicazione:**

1. Configurazione di Spring Boot per avviare l'applicazione.
2. Creazione delle entità JPA (Cliente, Acquisto, Prodotto) per rappresentare le tabelle del database.
3. Implementazione di un repository JPA per l'accesso ai dati del database.
4. Implementazione dei controller Spring MVC per gestire le richieste HTTP:
   - Gestire le richieste relative ai clienti (aggiunta, modifica, cancellazione).
   - Gestire le richieste relative agli acquisti (aggiunta, ricerca per mese/anno).
   - Gestire le richieste relative ai prodotti (aggiunta, ricerca per data).
5. Creazione di viste Thymeleaf per interagire con l'utente e visualizzare i dati.
6. Implementazione dei servizi necessari per gestire la logica di business (ad esempio, calcolare le statistiche richieste dal negoziante).

**Considerazioni aggiuntive:**

- Implementare la sicurezza dell'applicazione, ad esempio utilizzando Spring Security per gestire l'autenticazione degli utenti.
- Testare l'applicazione in modo approfondito, sia a livello unitario che integrativo, utilizzando framework come JUnit e Mockito per i test di unità e SpringBootTest per i test di integrazione.
- Assicurarsi di gestire correttamente le eccezioni e di fornire messaggi di errore significativi all'utente in caso di problemi.
- Documentare adeguatamente il codice sorgente e fornire istruzioni di utilizzo per l'applicazione.

## Esempio

Ecco un esempio di dati di prova per le tabelle richieste:

**Tabella Cliente:**

| idCliente | nome       | indirizzo           |
|-----------|------------|---------------------|
| 1         | Mario Rossi| Via Roma, 123       |
| 2         | Laura Bianchi| Via Garibaldi, 45  |
| 3         | Luca Verdi | Corso Italia, 67    |

**Tabella Acquisto:**

| idAcquisto | idCliente | data       |
|------------|-----------|------------|
| 1          | 1         | 2024-03-17 |
| 2          | 2         | 2024-03-16 |
| 3          | 3         | 2024-03-15 |

**Tabella Prodotto:**

| idProdotto | nome          | prezzo |
|------------|---------------|--------|
| 1          | Maglietta     | 20.00  |
| 2          | Pantaloni     | 30.00  |
| 3          | Scarpe        | 50.00  |
| 4          | Giacca        | 70.00  |

**Tabella DettaglioAcquisto:**

| idDettaglio | idAcquisto | idProdotto | quantita |
|-------------|------------|------------|----------|
| 1           | 1          | 1          | 2        |
| 2           | 1          | 2          | 1        |
| 3           | 2          | 3          | 1        |
| 4           | 3          | 4          | 1        |
| 5           | 3          | 2          | 2        |


