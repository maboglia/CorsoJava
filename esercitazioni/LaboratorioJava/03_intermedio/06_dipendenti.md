# Esercitazione 6 – Gestione dei dipendenti e polimorfismo

Realizzare in Java un sistema per la gestione di una piccola azienda.

Definire una classe base `Dipendente` o `Lavoratore` contenente almeno il nominativo e un metodo per il calcolo dello stipendio.

Prevedere almeno tre categorie di lavoratori:
- impiegato;
- fattorino;
- dirigente.

Ogni categoria deve calcolare lo stipendio secondo una regola differente, ridefinendo il metodo della classe base.

Per esempio, è possibile stabilire una paga base oraria e applicare maggiorazioni o premi differenti alle varie categorie. Il fattorino può inoltre avere un numero di ore giornaliere diverso dagli altri dipendenti.

Nel programma principale:
- creare diversi dipendenti;
- inserirli in una collezione avente come tipo quello della classe base;
- calcolare e visualizzare lo stipendio di ciascuno sfruttando il polimorfismo;
- calcolare il totale degli stipendi.

Estendere poi l'esercizio introducendo la gestione dello stipendio su più mesi dell'anno, tenendo conto del numero di giorni lavorativi di ciascun mese.

L'obiettivo è utilizzare correttamente classi astratte, ereditarietà, overriding, polimorfismo e collezioni di oggetti.
