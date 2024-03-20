# Esercizio MVC: Gestione di una Struttura Sanitaria

Realizzate un'applicazione Java per la gestione di una struttura sanitaria, seguendo il modello MVC (Model-View-Controller). L'applicazione dovrà consentire agli operatori sanitari di gestire i pazienti, le visite mediche e altre attività pertinenti.

## Modello (Model)

Il modello sarà costituito dalle classi che rappresentano i concetti principali della struttura sanitaria, come pazienti, medici, visite mediche e reparti. Ogni classe avrà i suoi attributi e metodi per gestire le informazioni pertinenti.

Ad esempio, la classe `Paziente` potrebbe avere attributi come nome, cognome, codice fiscale, data di nascita e reparto di appartenenza. La classe `Medico` potrebbe avere attributi come nome, cognome, specializzazione e lista di pazienti assegnati. La classe `VisitaMedica` potrebbe avere attributi come data, medico responsabile, paziente e diagnosi.

## Vista (View)

La vista sarà costituita da un'interfaccia utente che consentirà agli operatori sanitari di interagire con il sistema. Potrebbe includere form per l'inserimento dei dati dei pazienti, dei medici e delle visite mediche, nonché schermate per visualizzare e modificare queste informazioni.

## Controllore (Controller)

Il controllore sarà responsabile di gestire le interazioni tra la vista e il modello. Riceverà gli input dell'utente dalla vista, elaborerà le richieste utilizzando il modello e restituirà i risultati alla vista.

## Metodi e Funzionalità

Le funzionalità dell'applicazione includeranno:

1. Inserimento di nuovi pazienti: gli operatori sanitari potranno inserire i dati dei nuovi pazienti nel sistema, compresi nome, cognome, data di nascita, codice fiscale e reparto di appartenenza.
2. Assegnazione di medici ai pazienti: gli operatori sanitari potranno assegnare medici ai pazienti per visite mediche e trattamenti.
3. Registrazione di visite mediche: gli operatori sanitari potranno registrare le visite mediche effettuate, includendo la data, il medico responsabile, il paziente e la diagnosi.
4. Visualizzazione delle informazioni: gli operatori sanitari potranno visualizzare le informazioni sui pazienti, i medici, le visite mediche e altri dati pertinenti.
5. Altre funzionalità a vostra scelta, come la modifica e l'eliminazione di dati, la generazione di report e la gestione delle prescrizioni.

Implementate l'applicazione seguendo il modello MVC, separando la logica di business (modello) dalla visualizzazione e dall'interazione dell'utente (vista e controllore). Utilizzate classi, metodi e attributi appropriati per garantire la modularità e la manutenibilità del codice.
