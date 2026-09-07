# Esercitazione 4 – Automobile e guidatore

Realizzare in Java un'applicazione che simuli le operazioni fondamentali di un'automobile e del suo guidatore.

Definire una classe `Automobile` con almeno:
- marca;
- modello;
- cilindrata;
- anno;
- velocità corrente;
- velocità massima;
- stato acceso/spento.

Prevedere metodi per:
- accendere e spegnere l'automobile;
- accelerare;
- frenare;
- leggere e modificare i dati dell'automobile;
- verificare se l'automobile è accesa.

L'accelerazione deve rispettare la velocità massima e le operazioni di marcia devono essere consentite solo quando le condizioni sono corrette. La velocità non può mai diventare negativa.

Definire una classe `Guidatore` associata a un'automobile, con operazioni per:
- salire e scendere dall'automobile;
- accendere e spegnere l'automobile;
- accelerare e frenare tramite il guidatore;
- verificare se il guidatore si trova nell'automobile.

Realizzare un programma interattivo da console con un semplice menu di comandi, ad esempio `sali`, `scendi`, `accendi`, `spegni`, `accelera`, `frena`, `stato` e `q`.

Gestire correttamente le situazioni non consentite, come tentare di scendere mentre l'auto è in movimento o accendere l'auto senza essere a bordo.
