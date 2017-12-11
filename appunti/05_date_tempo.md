# Date e orari

Le date sono degli oggetti molto complesse da gestire: assumono forme diverse a seconda del luogo geografico in cui ci troviamo.
La  manipolazione delle date e delle ore è una delle attività ricorrenti di un programmatore. 

Se lavoriamo con Java 7, a classe principale per gestire date e orari è Calendar (che ha sostituito la classe Date, dichiarata **deprecata__). 

Altre classi utili sono __GregorianCalendar__, SimpleTimeZone e SimpleTimeZone. 
Inoltre sono disponibili le più moderne LocalDate e LocalDateTime.

Oltre a queste classi, è molto probabile che serva utilizzarne altre quali: DateFormat e SimpleDateFormat, 
che permettono la trasformazione da stringa a data e viceversa.

La classe __GregorianCalendar__ è molto semplice da utilizzare. 

Sono disponibili diversi costruttori. 
Il costruttore senza parametri inizializza l’oggetto con la data e l’ora attuale. 
Con il metodo get(), ereditato da Calendar, è possibile ricevere tutte le informazioni disponibili per l'oggetto di tipo data.


### Primo esempio 
stampiamo semplicemente la data odierna con l’orario attuale.

```java
GregorianCalendar calendario = new GregorianCalendar();
int anno = calendario.get(Calendar.YEAR);
int mese = calendario.get(Calendar.MONTH) + 1;
int giorno = calendario.get(Calendar.DATE);
int ore = calendario.get(Calendar.HOUR);
int min = calendario.get(Calendar.MINUTE);
int sec = calendario.get(Calendar.SECOND);

System.out.println(giorno + "/" + mese + "/" + anno);
System.out.println(ore + ":" + minuti + ":" + secondi);
```


## Formattare la data: SimpleDateFormat

	la classe SimpleDateFormat che permette di trattare le date nel formato più adatto alla nostra esigenza.

### Secondo esempio 
come stampare la data odierna usando __SimpleDateFormat__ per formattare l'output.

```java

GregorianCalendar calendario = new GregorianCalendar();
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy – HH:mm:ss");
System.out.println(sdf.format(calendario.getTime()));
```

	- Il costruttore della classe SimpleDateFormat prende in ingresso una stringa che rappresenta il formato della data che vogliamo stampare. 
	- Il metodo getTime() della classe GregorianCalendar restituisce un’istanza di Date. 
	- Il metodo format() della classe SimpleDateFormat, che restituisce in ingresso una Date, restituisce una stringa che corrisponde al formato che abbiamo impostato.
	- E’ possibile sfruttare la classe SimpleDateFormat anche per ottenere un’istanza della classe Calendar.

```java
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy – HH:mm:ss");
String miaData = "15/04/1988";
GregorianCalendar calendario = new GregorianCalendar();
try {
	calendario.setTime(sdf.parse(miaData));
} catch(ParseException exc) {
	exc.printStackTrace();
}
```

	Il metodo __parse()__ della classe SimpleDateFormat riceve in ingresso una stringa e restituisce un oggetto Date.
	Il metodo __setTime()__ della classe GregorianCalendar ci permette di impostare la data.

Bisogna utilizzare un blocco try-catch perché potrebbe essere sollevata una __ParseException__, nel caso in cui una stringa passata al metodo parse(), non rappresenti una data convertibile.


## Terzo esempio 
come convertire una data dal formato americano in quello italiano utilizzando le tecniche analizzate in precedenza.

```java
SimpleDateFormat formatIT = new SimpleDateFormat("dd/MM/yyyy"); 
SimpleDateFormat formatUS = new SimpleDateFormat("yyyy/MM/dd");

Date dataIT;
try {
	dataIT = formatUS.parse("2017/12/25");
	String dataUS = formatIT.format(dataIT);
	System.out.println(dataUS);
} catch(ParseException exc) {
	exc.printStackTrace();
}
```

Volendo confrontare due date possiamo utilizzare i metodi 
	- __after()__
	- __before()__
	- __equals()__ 
presenti nella classe Date.

```java
GregorianCalendar c1 = 
new gregorianCalendar(2013, GregorianCalendar.FEBRUARY, 05);
GregorianCalendar c2 = 
new gregorianCalendar(2013, GregorianCalendar.FEBRUARY, 05);

Date data1 = c1.getTime();
Date data2 = c2.getTime();
```

Il metodo:

```java
data1.after(data2) 	restituirà false
data1.equals(data2) restituirà false
data1.before(data2)	restituirà true
```

## Novità in Java 8: LocalDate, LocalTime, LocalDateTime

```java
      LocalDate oggi = LocalDate.now(); // Data di oggi
      System.out.println("oggi: " + oggi);

      //settare una data precisa (mese 1-based)
      LocalDate mauroBirthday = LocalDate.of(1969, 7, 28);
      //Per il mese possiamo usare le costanti di Month
      mauroBirthday = LocalDate.of(1969, Month.JULY, 28);
      
      System.out.println("mauroBirthday: " + mauroBirthday);

      LocalDate inizioCorsi = LocalDate.of(2017, Month.OCTOBER, 12);
      LocalDate natale = LocalDate.of(2017, Month.DECEMBER, 25);

      System.out.println("Fino a  natale: " + inizioCorsi.until(natale));
      System.out.println("Fino a  natale: " + inizioCorsi.until(natale, ChronoUnit.DAYS));
```

