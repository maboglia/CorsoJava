# Convertire LocalDate a java.sql.Date

```java
import java.sql.Date;
//...
LocalDate locald = LocalDate.of(1969, 07, 28);
Date date = Date.valueOf(locald); 
r.setDateOfBirth(date);
```

## l'operazione contraria è
```java
Date date = r.getDate();
LocalDate localD = date.toLocalDate();
```

r è il record e .getDate() il metodo per farsi ritornare la data. 
Se avessi un campo dataNascita ilmetodo dovrebbe chiamarsi getDateNascita().

Usa le classi del package java.time invece di java.util.Date e java.sql.Date con JDBC 4.2 o superiore.

## Esempio con PreparedStatement

```java
myPreparedStatement.setObject( 
    … ,                                         // qui passa il numero ordinale dell'argomento.
    myJavaUtilDate.toInstant()                  // Converti da `java.util.Date` nel più moderno `java.time.Instant` (UTC).
        .atZone( ZoneId.of( "Africa/Tunis" ) )  // Sette un time zone particolare, per determinare la data. Instanziando un `ZonedDateTime`.
        .toLocalDate()                          // Estrai la data di tipo `java.time.LocalDate` dall'oggetto.
)
```
### esempi
```java
LocalDate todayLocalDate = LocalDate.now( ZoneId.of( "America/Montreal" ) );  // Use proper "continent/region" time zone names; never use 3-4 letter codes like "EST" or "IST".

LocalDate localDate = ResultSet.getObject( 1 , LocalDate.class );

//la questione è irrelevante in JDBC 4.2 o successive.
```

## Converti a java.sql.Date

```java
java.sql.Date sqlDate = java.sql.Date.valueOf( todayLocalDate );

//viceversa

LocalDate localDate = sqlDate.toLocalDate();
```

### Nuovi metodi di java.util.Date 
* java.util.Date.from( Instant ) 
* java.util.Date::toInstant.

```java
Instant instant = myUtilDate.toInstant();

ZoneId zoneId = ZoneId.of ( "America/Montreal" );
ZonedDateTime zdt = ZonedDateTime.ofInstant ( instant , zoneId );
LocalDate localDate = zdt.toLocalDate();
```

```java
public class MainClass {

  public static void main(String[] args) {
    java.util.Date utilDate = new java.util.Date();
    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
    System.out.println("utilDate:" + utilDate);
    System.out.println("sqlDate:" + sqlDate);

  }

}

//http://www.java2s.com/Tutorial/Java/0040__Data-Type/ConvertfromajavautilDateObjecttoajavasqlDateObject.htm
```
