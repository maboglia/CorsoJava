# Tipi di memoria

### Si differenziano per la durata di esistenza degli elementi che vi sono memorizzati
* Memoria statica
  * Contiene gli elementi che esistono per tutta la durata del programma
* Heap o memoria dinamica
  * Contiene gli elementi creati durante il programma
  * qui agisce il Garbage Collector
* Stack
  * Contiene gli elementi creati durante una chiamata di procedura

## Memorizzazione oggetti

* Gli oggetti vengono allocati nella memoria heap

## Memorizzazione delle Variabili

### Variabili di istanza
* Memorizzate all'interno degli oggetti (nell'heap)

### Variabili automatiche ( locali )
* Memorizzate nello stack

### Variabili statiche
* Memorizzate in aree statiche


## Variabili di istanza

* Dichiarate all'interno di una classe

(attributi)
`Class Window {
boolean visible;
`...

* Memorizzate in ogni istanza della classe

* Create/inizializzate alla creazione di ogni istanza della classe

## Variabili automatiche (locali)

### Dichiarate all'interno dei metodi
Class Window {
...
void resize () {
int i;
for (i=0; i<5; i++)
...

### Memorizzate nello stack

### Create/inizializzate automaticamente
all'ingresso del blocco in cui sono
dichiarate

### Distrutte automaticamente all'uscita
Variabili statiche

### Dichiarate nelle classi o nei metodi con
qualificatore
static Class ColorWindow {
static String color;
...

### Memorizzate in copia unica
* associate alla classe => anche dette

## variabili di classe

### Memorizzate in aree statiche

### Create/inizializzate al caricamento della
classe

## Static area

## Distruzione di Oggetti

### Non viene fatta in modo esplicito
* Il programmatore non deve preoccuparsi di distruggere gli oggetti

### Viene eseguita automaticamente
*  Garbage collector
  * Componente del Run Time che ha il compito di recuperare lo spazio nella memoria heap
  * Quando necessario (per esempio quando si esaurisce lo spazio disponibile in memoria principale) esegue un'analisi dei riferimenti e distrugge gli oggetti per i quali non esistono più riferimenti