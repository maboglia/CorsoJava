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

---

## LocalDate

```java
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
...
 LocalDate ld = LocalDate.now();
 System.out.println(ld);
 
 LocalDate ld2 = LocalDate.of(2017,12,25);
 
 DateTimeFormatter df3 = DateTimeFormatter.ofPattern("d.M.yyyy");
 System.out.println(df3.format(ld2));
  
```

---

## LocalDateTime

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

---

## Conversioni tra formati data

```java
 public static void main(String[] args) {
 

 Date d = new Date();
 System.out.println(   d.getDate()   );
 
 GregorianCalendar gc = new GregorianCalendar(2017,0,28);
 gc.add(GregorianCalendar.DAY_OF_MONTH, 180);
 Date d2 = gc.getTime();
 System.out.println(d2);

 DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
 DateFormat dg = DateFormat.getDateInstance(DateFormat.SHORT);
 DateFormat dh = DateFormat.getDateInstance(DateFormat.MEDIUM);
 
 System.out.println(df.format(d2));
 System.out.println(dg.format(d2));
 System.out.println(dh.format(d2));
 

 
 }

```
