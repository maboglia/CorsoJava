# Esercitazione 17 – Controllo degli accessi a un impianto sciistico

Realizzare in Java un sistema per il controllo degli accessi agli skilift di un impianto sciistico.

Ogni sciatore possiede una tessera identificata da un numero intero di 6 cifre.

Ogni skilift possiede:
- un identificatore numerico di 2 cifre;
- un tempo minimo di attesa `Delta`, espresso in secondi.

I valori di `Delta` devono essere letti da un file fornito come primo parametro sulla riga di comando, con il formato:

`id_skilift,ritardo_delta`

Esempio:

`01,20`

Il sistema deve fornire un'operazione del tipo:

`boolean auth(long cardId, int skiliftId)`

L'autorizzazione deve essere concessa se la tessera non è già stata utilizzata sullo stesso skilift negli ultimi `Delta` secondi.

Se la stessa tessera viene presentata nuovamente allo stesso skilift prima che sia trascorso il tempo minimo previsto, l'accesso deve essere negato.

Se viene richiesto uno skilift inesistente, il metodo deve segnalare l'errore tramite una specifica eccezione, ad esempio `BadSkiliftIdException`.

### Vincoli

- Il numero di tessere non è noto a priori e cresce durante la giornata.
- Possono essere presenti da alcune centinaia fino a 50.000–100.000 tessere.
- Il numero di skilift non è noto a compile time ed è dell'ordine delle centinaia.
- Il numero degli skilift diventa noto dopo la lettura del file di configurazione.
- La soluzione deve utilizzare la quantità di memoria strettamente necessaria.

### Requisiti progettuali

Progettare strutture dati efficienti per:
- associare ogni skilift al proprio `Delta`;
- memorizzare l'ultima lettura valida di una tessera su ciascuno skilift;
- effettuare rapidamente il controllo durante ogni passaggio.

Per rappresentare il tempo utilizzare il timestamp corrente ottenuto dal sistema operativo. Il confronto deve essere effettuato in secondi.

Il programma deve inoltre verificare la validità degli identificativi e gestire correttamente tessere mai viste prima.

L'obiettivo principale dell'esercitazione è progettare una soluzione efficiente sia dal punto di vista temporale sia dal punto di vista dell'occupazione di memoria, considerando una quantità elevata e crescente di dati.
