# Gestione date e tempo

## la classe Date (parzialmente deprecata)

```java
import java.util.Date;
...
	Date d = new Date();
	System.out.println(d);
```

## la classe GregorianCalendar

```java
import java.util.GregorianCalendar;
import java.text.DateFormat;
import java.util.Date;

...
GregorianCalendar gc = new GregorianCalendar(2016, 11, 25);
System.out.println(gc.getTime());

gc.add(GregorianCalendar.DATE,  7);
Date d2 = gc.getTime();
System.out.println(d2);

DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
System.out.println(df.format(gc.getTime()));
```


```java
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
...
LocalDateTime ldt = LocalDateTime.now();
System.out.println(ldt);

DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d/M/yyyy");
System.out.println(dtf.format(ld));
		
```