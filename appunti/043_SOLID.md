# SOLID

Cinque famosi design patterns per scrivere classi – the SOLID principles

* S: Single Responsibility Principle
* O: Open Closed Principle
* L: Liskov's Substitution Principle
* I: Interface Segregation Principle
* D: Dependency Inversion Principle

SOLID è l'acronimo dei primi cinque principi di Object-Oriented Design (OOD) enunciati da **Robert C. Martin**, noto anche come Uncle Bob

---

## S

* S sta per Single Responsibility Principle (SRP).
* S sta per Una classe dovrebbe avere una e una sola responsabilità.
* S ci dice di scrivere una classe per un solo obiettivo.
* S sostiene un'elevata manutenibilità e controllo della visibilità attraverso i moduli dell'applicazione.

S è il primo principio di SOLID ed è noto come Single Responsibility Principle (SRP). Questo principio si traduce nel fatto che una classe dovrebbe avere una e una sola responsabilità. Questo è un principio molto importante che dovrebbe essere seguito in qualsiasi tipo di progetto per qualsiasi tipo di classe (modello, servizio, controller, classe manager e così via). Finché scriviamo una classe per un solo obiettivo, sosterremo un'elevata manutenibilità e controllo della visibilità attraverso i moduli dell'applicazione. In altre parole, sostenendo un'elevata manutenibilità, questo principio ha un impatto aziendale significativo e, fornendo il controllo della visibilità attraverso i moduli dell'applicazione, questo principio sostiene l'incapsulamento.

---

## O

* O sta per Open Closed Principle (OCP).
* O sta per I componenti software dovrebbero essere aperti per l'estensione, ma chiusi per la modifica.
* O sostiene il fatto che le nostre classi non dovrebbero contenere vincoli che richiedano ad altri sviluppatori di modificare le nostre classi per svolgere il loro lavoro - altri sviluppatori dovrebbero solo estendere le nostre classi per svolgere il loro lavoro.
* O supporta l'estensibilità del software in modo versatile, intuitivo e non dannoso.

O è il secondo principio di SOLID ed è noto come Open Closed Principle (OCP). Questo principio sta per I componenti software dovrebbero essere aperti per l'estensione, ma chiusi per la modifica. Ciò significa che le nostre classi dovrebbero essere progettate e scritte in modo tale che altri sviluppatori possano modificare il comportamento di queste classi semplicemente estendendole. Quindi, le nostre classi non dovrebbero contenere vincoli che richiedano ad altri sviluppatori di modificare le nostre classi per svolgere il loro lavoro - altri sviluppatori dovrebbero solo estendere le nostre classi per svolgere il loro lavoro.

---

## L

* L sta per principio di sostituzione di Liskov (LSP).
* L sta per I tipi derivati devono essere completamente sostituibili per i loro tipi di base.
* L sostiene il fatto che gli oggetti delle sottoclassi devono comportarsi allo stesso modo degli oggetti delle superclassi.
* L è utile per l'identificazione del tipo di runtime seguita dal cast.

L è il terzo principio di SOLID ed è noto come principio di sostituzione di Liskov (LSP). Questo principio sta per I tipi derivati devono essere completamente sostituibili per i loro tipi di base. Ciò significa che le classi che estendono le nostre classi dovrebbero essere utilizzabili in tutta l'applicazione senza causare errori. Più precisamente, questo principio sostiene il fatto che gli oggetti delle sottoclassi devono comportarsi allo stesso modo degli oggetti delle superclassi, quindi ogni sottoclasse (o classe derivata) dovrebbe essere in grado di sostituire la propria superclasse senza problemi. Il più delle volte, questo è utile per l'identificazione del tipo di runtime seguita dal cast.

---

## I

* I sta per il principio di segregazione dell'interfaccia (ISP).
* I sta per I clienti non dovrebbero essere costretti a implementare metodi non necessari che non useranno.
* I suddivide un'interfaccia in due o più interfacce fino a quando i client non sono costretti a implementare metodi che non utilizzeranno.

È il quarto principio di SOLID ed è noto come Principio di segregazione dell'interfaccia (ISP). Questo principio sta per I client non dovrebbero essere costretti a implementare metodi non necessari che non useranno. In altre parole, dovremmo dividere un'interfaccia in due o più interfacce finché i client non sono obbligati a implementare metodi che non useranno.

## D

* D sta per il principio di inversione delle dipendenze (DIP).
* D sta per Dipende dalle astrazioni, non dalle concrezioni.
* D sostiene l'uso di strati astratti per legare insieme moduli concreti invece di avere moduli concreti che dipendono da altri moduli concreti.
* D sostiene il disaccoppiamento dei moduli in calcestruzzo.

D è l'ultimo principio di SOLID ed è noto come principio di inversione delle dipendenze (DIP). Questo principio sta per dipendere da astrazioni, non da concrezioni. Ciò significa che dovremmo fare affidamento su strati astratti per legare insieme moduli concreti invece di avere moduli concreti che dipendono da altri moduli concreti. Per ottenere ciò, tutti i moduli concreti dovrebbero esporre solo astrazioni. In questo modo, i moduli in calcestruzzo consentono l'estensione della funzionalità o il plug-in in un altro modulo in calcestruzzo mantenendo il disaccoppiamento dei moduli in calcestruzzo. Comunemente, si verifica un elevato accoppiamento tra moduli in calcestruzzo di alto livello e moduli in calcestruzzo di basso livello.
