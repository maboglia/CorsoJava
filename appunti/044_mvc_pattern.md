# MVC design pattern - model view controller

![MVC](https://github.com/maboglia/CorsoJava/raw/master/appunti/img/mvc_pattern_uml_diagram.jpeg)

---

## Design Pattern

Una soluzione progettuale generale a un problema ricorrente

Un pattern è caratterizzato da:

* Nome - rappresentativa del pattern stesso
* Problema - la situazione (o condizione) alla quale si può applicare il pattern
* Soluzione – la configurazione degli elementi adatta a risolvere il problema
* Conseguenze, vantaggi (risultati) e svantaggi (vincoli) che derivano dall'applicazione del pattern

---

## MVC

MVC più che un design pattern tradizionale, è (anche) un modello di
progettazione: buone pratiche alle quali gli sviluppatori ed i progettisti si possono attenere

Model-View-Controller

Disaccoppia

* Presentazione (vista),
* Dati (modello)
* Comportamento dell’applicazione (controllore)

Definisce _confini_ precisi fra

* Contenuti presentati all’utente
* I dati su cui tali presentazioni si basano
* Il comportamento dell’applicazione che supporta le presentazioni

---

## Model (M)

* Rappresenta i dati
* Rappresenta la logica business che agisce sui dati
* Informa la vista quando vi sono variazioni nello stato dei dati
* rappresenta lo stato della nostra applicazione web (data-base, file, informazioni di sessione, etc.)
* Model è il cuore dell'applicazione. Definisce i dati e le operazioni che possono essere eseguiti su essi. Fornisce delle funzioni per l'accesso e l'aggiornamento.
* Può inoltre avere la responsabilità di notificare ai componenti della View eventuali aggiornamenti verificatisi inseguito a richieste del Controller, al fine di permettere alle View di presentare agli occhi degli utenti dati sempre aggiornati.

---

## View (V)

* Visualizza i dati del modello
* Supporta l’interazione con l’utente
* Riceve gli aggiornamenti dal modello
* View è l'interfaccia grafica (GUI) con cui l'utente interagisce.
* Normalmente avrò molte viste a fronte di un solo controller

---

## Controller (C)

L’architettura MVC si basa su tre componenti principali:

* una serie di applicazioni che racchiudono la logica applicativa del nostro sito, attraverso delle modifiche al modello.
* Seleziona le viste
* Invia gli input dell’utente al modello (cambiamenti di stato)
* Agisce come intermediario fra vista e modello
* Il Controller ha la responsabilità di trasformare le interazioni dell'utente della View in azioni eseguite dal Model. Realizzando il collegamento tra input dell'utente e processi eseguiti dal Model, il Controller implementa la logica di controllo dell'applicazione.

---

![MVC](https://github.com/maboglia/CorsoJava/blob/master/appunti/img/mvc_schema.jpg)
