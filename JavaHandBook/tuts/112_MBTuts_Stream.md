# Stream e programmazione funzionale

## programmazione funzionale

Gli stream portano  in Java la programmazione funzionale

---

### vantaggi
* un codice più efficiente
* uso delle espressioni Lambda
* uso semplificato dei thread attraverso i `ParallelStreams`
* uno stream pipeline consiste in una sorgente, seguita da zero o più operazioni intermedie ed una unica operazione terminale

---

## sorgente Stream
* Gli stream possono essere creati a partire da Collections, Lists, Set, int, long, double, array, righe di un file
* le operazioni sugli stream possono essere intermedie o terminali
  * *intermedie* come filter, map o sort, ritornano  uno stream: possiamo così concatenarle per raffinare i risultati
  * *terminali* come forEach, collect, o reduce: *queste non ritornano uno stream*!

---

## Operazioni intermedie
* Sono permesse zero o più operazioni intermedie
* L'ordine delle operazioni è importante, specialmente per dataset di grandi dimensioni: prima applica i filtri, quindi ordina o rimappa
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

---

## Operazioni terminali
è permessa una sola operazione terminale.
* `forEach` applica la stessa operazione  su ciascun elemento
* `collect` salva gli elementi in una nuova collezione
* altre opzioni riducono lo stream ad un singolo elemento sommario
* `count()`, `max()`, `min()`, `reduce()`, `summaryStatistics()`

---

## Intstream

```java
//IntStream
		IntStream.range(1, 91).filter(e -> e%2==0).forEach(n -> System.out.println(n));
		long somma = IntStream.range(1, 91).filter(e -> e%2==0).count();
		System.out.println(somma);
```

---

## skip

```java
//stream di interi
		IntStream.range(1, 11).skip(3).forEach(System.out::println);
```

---

## findfirst

```java
//		Stream.of("do","re","mi", "fa","sol", "la","si")
//			.sorted()
//			.findFirst().ifPresent(System.out::println);
//		

//		String[] note = { "do","re","mi", "fa","sol", "la","si"};
//		Arrays.stream(note).filter(nota -> nota.startsWith("r")).forEach(System.out::print);
//		
		Arrays.stream(new int[] {1,3,5,7,9}).map(x -> x * 3).forEach(System.out::print);
```

```java
Stream.of("pino", "gino", "lino", "nino").findFirst().ifPresent(System.out::println);
```

---

## sorted

```java
		Stream.of("pino", "gino", "lino", "nino").sorted().forEach(System.out::println);
```

---

## array

![Java 8 Stream](https://raw.githubusercontent.com/maboglia/CorsoJava/master/appunti/img/Java8_Streams_09.jpg)

---

## average

```java
		Arrays.stream(new int[] {1,3,5,7,9}).map(x -> x * 3).average().ifPresent(m->System.out.println( "media: " +m ));
```
---

## List

```java
List<String> moto = Arrays.asList("Yamaha", "BMW", "Honda", "Ducati");
		moto.stream().map(String::toUpperCase).filter(m->m.endsWith("A")).forEach(System.out::println);
		//un plus per biagio, che ci è arrivato subito, dimostrando incredibili doti ddi osservazione e perspicacia, oltre ad una inngegabile conoscenza del linguaggio java, anche nella sua evoluzione funzionale. ma chi è quest'uomo!?
		Stream<String> versi = Files.lines(Paths.get("divina.txt"), Charset.forName("Cp1252"));
		//versi.filter(s -> s.contains("disgusto")).sorted().forEach(System.out::println);
		
		List<String> versiBiagio = versi.filter(v -> v.contains("selva")).collect(Collectors.toList());
		versiBiagio.forEach(System.out::println);
		
		Stream<String> ore = Files.lines(Paths.get("aula.txt"), Charset.forName("Cp1252"));
		ore.map(s->s.split(",")).forEach(as -> System.out.println(as[0] + as[1]));
```

---

## text file

![Java 8 Stream](https://raw.githubusercontent.com/maboglia/CorsoJava/master/appunti/img/Java8_Streams_12.jpg)

---

## collect

```java
Stream<String> studenti = Files.lines(Paths.get("aula.txt"), Charset.forName("Cp1252"));
		Map<Object, Object[]> mappa = new HashMap<>();
		
		mappa = studenti
				.map(x -> x.split(","))				
				.collect(Collectors.toMap(x -> x[0], x -> Arrays.copyOfRange(x, 1, 22)));
```

---

## file e count

![Java 8 Stream](https://raw.githubusercontent.com/maboglia/CorsoJava/master/appunti/img/Java8_Streams_15.jpg)

---

## split e foreach

![Java 8 Stream](https://raw.githubusercontent.com/maboglia/CorsoJava/master/appunti/img/Java8_Streams_16.jpg)

---

## rimappa su hashmap

```java
Stream<String> studenti = Files.lines(Paths.get("aula.txt"), Charset.forName("Cp1252"));
		Map<Object, Object[]> mappa = new HashMap<>();
		
		mappa = studenti
				.map(x -> x.split(","))				
				.collect(Collectors.toMap(x -> x[0], x -> Arrays.copyOfRange(x, 1, 22)));

		Set<Object> keySet = mappa.keySet();
		for (Object object : keySet) {
			String chiave = (String) object;
			System.out.println(chiave);
			Object[] valori = mappa.get(chiave);
			Stream<Object> valori2 = Stream.of(mappa.get(chiave));
			Stream.of(valori).forEach(voto -> {
				double v = Double.parseDouble((String) voto);
				System.out.print(v);
				});
			
				
			System.out.println("----------------");
		}
```

---

## reduce

![Java 8 Stream](https://raw.githubusercontent.com/maboglia/CorsoJava/master/appunti/img/Java8_Streams_18.jpg)

---

## summaryStatistics

```java
IntSummaryStatistics stats = IntStream.of(1,2,5,78,9,45).summaryStatistics();
System.out.println(stats);
```
