# Esercizio Java: Quiz sui Paesi del Mondo

Realizzate un'applicazione Java che metta alla prova le conoscenze geografiche degli utenti tramite un quiz sui paesi del mondo. Ogni domanda presenterà una domanda relativa a un determinato paese, ad esempio trovare la capitale, e fornirà tre opzioni di risposta, di cui solo una corretta.

## Descrizione del Quiz

Il quiz conterrà una serie di domande riguardanti vari aspetti dei paesi del mondo, come la capitale, la lingua ufficiale, la popolazione, la bandiera, ecc. Ad esempio, una domanda potrebbe essere: "Qual è la capitale dell'Italia?" con le seguenti opzioni di risposta:

1. Roma
2. Madrid
3. Berlino

La risposta corretta sarebbe "Roma".

## Implementazione

1. Definire una classe `Domanda` che rappresenti una singola domanda del quiz. Ogni domanda avrà un testo, un'opzione corretta e due opzioni errate.
2. Creare una classe `Quiz` che gestisca la logica del quiz. Questa classe dovrebbe contenere un elenco di domande e gestire il caricamento delle domande da un file di dati o da una sorgente dati.
3. Implementare una classe `QuizRunner` che gestisca l'interfaccia utente. Questa classe presenterà le domande agli utenti e raccoglierà le loro risposte, fornendo feedback sull'accuratezza delle risposte.
4. Utilizzare un file di dati per memorizzare le domande del quiz. Il file potrebbe essere formattato in modo che ogni riga rappresenti una domanda con il testo della domanda e le tre opzioni di risposta, separate da un delimitatore.

## Funzionalità Aggiuntive

Per arricchire l'esperienza del quiz, potete considerare l'implementazione delle seguenti funzionalità:

- Aggiungere un timer per ogni domanda, dando agli utenti un limite di tempo per rispondere.
- Tenere traccia del punteggio dell'utente e visualizzare il punteggio finale alla fine del quiz.
- Consentire agli utenti di scegliere tra diversi livelli di difficoltà del quiz.
- Aggiungere domande bonus o domande a risposta multipla.
- Implementare una funzionalità di salvataggio dei punteggi migliori per tener traccia delle prestazioni degli utenti nel tempo.

Implementate il quiz seguendo le best practice di programmazione orientata agli oggetti e utilizzando classi, metodi e attributi appropriati per garantire la chiarezza e la manutenibilità del codice.
