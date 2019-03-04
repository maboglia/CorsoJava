# Streams 

## programmazione funzionale
Gli stream portano  in Java la programmazione funzionale
### vantaggi
* un codice più efficiente
* uso delle espressioni Lambda
* uso semplificato dei thread attraverso i `ParallelStreams`
* uno stream pipeline consiste in una sorgente, seguita da zero o più operazioni intermedie ed una unica operazione terminale

## sorgente Stream
* Gli steam possono essere creati a partire da Collections, Lists, Set, int, long, double, array, righe di un file
* le operazioni sugli stream possono essere intermedie o terminali
  * *intermedie* come filter, map o sort, ritornano  uno stream: possiamo così concatenarle per raffinare i risultati
  * *terminali* come forEach, collect, o reduce: *queste non ritornano uno stream*!

## Operazioni intermedie
* Sono permesse zero o più operazioni intermedie
* L'rodine delle operazioni è importante, specialmente per dataset di grandi dimensioni: prima applica i filtri, quindi ordina o rimappa
* se i dataseto sono di grandissime dimensioni, puoi usare  `ParallelStreams`
* le operazioni intermedie:
  * anyMatch
  * distinct
  * filter
  * findFirst
  * flatmap
  * map
  * skip
  * sorted

## Operazioni terminali
è permessa una sola operazione terminale.
* `forEach` applica la stessa operazione  su ciascun elemento
* `collect` salva gli elementi in una nuova collezione
* altre opzioni riducono lo stream ad un singolo elemento sommario
* `count()`, `max()`, `min()`, `reduce()`, `summaryStatistics()`
## Intstream
![Java 8 Stream](img/Java8_Streams_05.jpg)
## skip
![Java 8 Stream](img/Java8_Streams_06.jpg)
## findfirst
![Java 8 Stream](img/Java8_Streams_07.jpg)
## sorted
![Java 8 Stream](img/Java8_Streams_08.jpg)
## array
![Java 8 Stream](img/Java8_Streams_09.jpg)
## average
![Java 8 Stream](img/Java8_Streams_10.jpg)
## List
![Java 8 Stream](img/Java8_Streams_11.jpg)
## text file
![Java 8 Stream](img/Java8_Streams_12.jpg)

## collect
![Java 8 Stream](img/Java8_Streams_14.jpg)
## file e count
![Java 8 Stream](img/Java8_Streams_15.jpg)
## split e foreach
![Java 8 Stream](img/Java8_Streams_16.jpg)
## rimappa su hashmap
![Java 8 Stream](img/Java8_Streams_17.jpg)
## reduce
![Java 8 Stream](img/Java8_Streams_18.jpg)
## summaryStatistics
![Java 8 Stream](img/Java8_Streams_19.jpg)
