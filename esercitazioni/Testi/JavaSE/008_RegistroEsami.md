# Registro Esami

Realizzate un programma “Registro esami” che presenti il seguente menu all’utente e fornisca le
corrispondenti funzionalità:

1. inserisci studente
2. aggiungi esame a carriera studente
3. visualizza media voti globale
4. visualizza tutti i dati inseriti
5. aggiungi commento a esame
6. visualizza media voti studente
7. visualizza media voti periodo
8. visualizza media voti studente periodo
9. visualizza dati studente
10. visualizza commenti esame
11. esci


Gli **studenti** hanno nome, cognome, e matricola

* la matricola viene generata dal programma e non deve essere modificabile da nessuno


Gli **esami** hanno una materia di riferimento, un voto, la data in cui sono stati sostenuti, e dei commenti

* i commenti sono opzionali e possono essere aggiunti dall’utente più volte e in qualunque momento
* supponiamo i voti non abbiano la lode


Il **registro** traccia gli studenti e gli esami sostenuti

* data la matricola di uno studente, lo studente e i suoi esami devono essere direttamente
recuperabili

#### Inserisci studente

* dati nome e cognome separati da spazio, lo studente viene creato e memorizzato nel registro

#### Aggiungi esame a carriera studente

* dati nome e cognome separati da spazio, e materia e voto separati da virgola, l’esame viene creato
e memorizzato nel registro con data odierna
* se lo studente non esiste, l’esito dell’invocazione a metodo segnala un errore

#### Visualizza media voti globale


#### Visualizza tutti i dati inseriti

* visualizza gli esami per ogni studente, a meno dei commenti

#### Aggiungi commento a esame

* data la matricola dello studente, la materia dell’esame e il commento, questo viene aggiunto ai
commenti di quell’esame

#### Visualizza media voti studente

* data la matricola dello studente, la sua media voti viene visualizzata

#### Visualizza media voti periodo

* date le date (:D) di inizio e fine del periodo da considerare, la media voti globale di quel periodo
viene visualizzata

#### Visualizza media voti studente periodo

* l’intersezione dei punti 6 e 7

#### Visualizza dati studente

* data la matricola dello studente, visualizzare i suoi dati e la lista di esami sostenuti (a meno dei
commenti)

#### Visualizza commenti esame

* data la matricola dello studente e la materia dell’esame, i commenti registrati vengono visualizzati
