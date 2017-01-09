#Date e orari

Sicuramente una delle problematiche ricorrenti di un programmatore è la manipolazione delle date e delle ore. 
Purtroppo le date sono degli oggetti molto complesse da gestire, che assumono forme diverse a seconda del luogo geografico in cui ci troviamo.

La classe principale per gestire date e orari è Calendar (che ha sostituito la classe deprecata Date). 
Altre classi utili sono GregorianCalendar, TimeZone e SimpleTimeZone. 

La complessità è aumentata dal fatto che, oltre a queste classi, è molto probabile che serva utilizzarne altre quali DateFormat e SimpleDateFormat, le quali permettono la trasformazione da stringa a data e viceversa.

Visto che sarebbe impossibile analizzare tutte le proprietà e tutti i metodi di queste classi, riportiamo una serie di esempi che ci aiuteranno a prendere confidenza con tali classi.

Nel primo esempio stampiamo semplicemente la data odierna con l’orario attuale.
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

La classe GregorianCalendar è molto semplice da utilizzare. 
Sono disponibili diversi costruttori. Il costruttore senza parametri inizializza l’oggetto con la data e l’ora attuale. 
Con il metodo get(), ereditato da Calendar, è possibile trarre tutte le informazioni disponibili.

Java ha messo a disposizione la classe SimpleDateFormat che permette di trattare le date nel formato più adatto alla nostra esigenza.
Col prossimo esempio vediamo come stampare la data odierna usando la classe descritta.
```java

GregorianCalendar calendario = new GregorianCalendar();
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy – HH:mm:ss);
System.out.println(sdf.format(calendario.getTime()));

Il costruttore della classe SimpleDateFormat prende in ingresso una stringa che rappresenta il formato della data che vogliamo stampare. 
Il metodo getTime() della classe GregorianCalendar restituisce un’istanza di Date. 
Il metodo format() della classe SimpleDateFormat, che restituisce in ingresso una Date, restituisce una stringa che corrisponde al formato che abbiamo impostato.
E’ possibile sfruttare la classe SimpleDateFormat anche per ottenere un’istanza della classe Calendar.

SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy – HH:mm:ss);
String miaData = "15/04/1988";
GregorianCalendar calendario = new GregorianCalendar();
try {
	calendario.setTime(sdf.parse(miaData));
} catch(ParseException exc) {
	exc.printStackTrace();
}
```

Il metodo parse() della classe SimpleDateFormat riceve in ingresso una stringa e restituisce un oggetto Date.
Il metodo setTime della classe GregorianCalendar ci permette di impostare la data. 
Abbiamo utilizzato il blocco try-catch perché questa operazione potrebbe sollevare una ParseException, nel caso in cui una stringa passata al metodo parse(), non rappresenti una data convertibile.


Come ultimo esempio vediamo come convertire una data dal formato americano in quello italiano utilizzando le tecniche analizzate in precedenza.
```java
SimpleDateFormat formatIT = new SimpleDateFormat("dd/MM/yyyy"); 
SimpleDateFormat formatUS = new SimpleDateFormat("yyyy/MM/dd");

Date dataIT;
try {
	dataIT = formatUS.parse("2007/04/05");
	String dataUS = formatIT.format(dataIT);
	System.out.println(dataUS);
} catch(ParseException exc) {
	exc.printStackTrace();
}
``
Volendo confrontare due date possiamo utilizzare i metodi after(), before() e equals() presenti nella classe Date.
```java
GregorianCalendar c1 = 
new gregorianCalendar(2013, GregorianCalendar.FEBRUARY, 05);
GregorianCalendar c2 = 
new gregorianCalendar(2013, GregorianCalendar.FEBRUARY, 05);

Date data1 = c1.getTime();
Date data2 = c2.getTime();
``
Il metodo:
data1.after(data2) 	restituirà false
data1.equals(data2) 	restituirà false
data1.before(data2)	restituirà true