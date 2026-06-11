# Il package java.time

Il package `java.time`, introdotto in Java 8, fornisce un’API moderna per la gestione di date, orari e zone temporali, sostituendo classi precedenti come `Date` e `Calendar`. Offre classi immutabili e thread-safe, semplificando la gestione e manipolazione di date e orari.

---

### 1. **LocalDate**

- **Descrizione**: Rappresenta una data (anno, mese e giorno) senza informazioni sull’orario e senza fuso orario. Utile per rappresentare compleanni, anniversari, e date specifiche.
- **Principali Metodi**:
  - `now()`: Restituisce la data corrente.
  - `of(int year, int month, int dayOfMonth)`: Crea un’istanza per una data specifica.
  - `plusDays(long days)`: Aggiunge giorni alla data.
  - `getDayOfWeek()`: Restituisce il giorno della settimana.

---

### 2. **LocalTime**

- **Descrizione**: Rappresenta solo un orario (ore, minuti, secondi, nanosecondi) senza data né fuso orario.
- **Principali Metodi**:
  - `now()`: Restituisce l’orario corrente.
  - `of(int hour, int minute)`: Crea un’istanza per un orario specifico.
  - `plusHours(long hours)`: Aggiunge ore all’orario.
  - `getHour()`: Restituisce l’ora.

---

### 3. **LocalDateTime**

- **Descrizione**: Rappresenta una data e un orario senza fuso orario. È una combinazione di `LocalDate` e `LocalTime`.
- **Principali Metodi**:
  - `now()`: Restituisce la data e l’orario corrente.
  - `of(int year, int month, int dayOfMonth, int hour, int minute)`: Crea un’istanza con data e orario specifici.
  - `plusDays(long days)`: Aggiunge giorni alla data.
  - `toLocalDate()`: Estrae solo la data.

---

### 4. **ZonedDateTime**

- **Descrizione**: Rappresenta una data e un orario con informazioni sul fuso orario, utile per rappresentare orari specifici in diverse zone geografiche.
- **Principali Metodi**:
  - `now(ZoneId zone)`: Restituisce la data e orario corrente in una zona specifica.
  - `of(int year, int month, int dayOfMonth, int hour, int minute, ZoneId zone)`: Crea un’istanza con data, orario e zona specifici.
  - `withZoneSameInstant(ZoneId zone)`: Converte l’istanza in una nuova zona mantenendo l’ora istantanea.

---

### 5. **Instant**

- **Descrizione**: Rappresenta un punto preciso sulla linea del tempo (in millisecondi da "Epoch Time", 1 gennaio 1970 UTC).
- **Principali Metodi**:
  - `now()`: Restituisce l’istante corrente.
  - `plusSeconds(long seconds)`: Aggiunge secondi all’istante.
  - `toEpochMilli()`: Restituisce il valore dell’istante in millisecondi.

---

### 6. **Duration**

- **Descrizione**: Rappresenta un intervallo di tempo in ore, minuti, secondi e nanosecondi, utile per misurare intervalli tra due istanti.
- **Principali Metodi**:
  - `between(Temporal startInclusive, Temporal endExclusive)`: Calcola la durata tra due istanti.
  - `plusHours(long hours)`: Aggiunge ore alla durata.
  - `toMinutes()`: Restituisce la durata in minuti.

---

### 7. **Period**

- **Descrizione**: Rappresenta un periodo di tempo in anni, mesi e giorni, utile per rappresentare intervalli come "2 anni e 3 mesi".
- **Principali Metodi**:
  - `ofYears(int years)`: Crea un periodo di un certo numero di anni.
  - `between(LocalDate startDate, LocalDate endDate)`: Calcola il periodo tra due date.
  - `getYears()`: Restituisce gli anni del periodo.

---

### 8. **Year** e **YearMonth**

- **Descrizione**: `Year` rappresenta un anno, mentre `YearMonth` rappresenta una combinazione di anno e mese.
- **Principali Metodi**:
  - `now()`: Restituisce l’anno corrente (per `Year`) o anno e mese corrente (per `YearMonth`).
  - `isLeap()`: Verifica se un anno è bisestile.
  - `atMonth(int month)`: Crea un `YearMonth` a partire da un anno e un mese.

---

### 9. **MonthDay**

- **Descrizione**: Rappresenta una combinazione di mese e giorno, senza anno. È utile per date ricorrenti come compleanni.
- **Principali Metodi**:
  - `now()`: Restituisce il mese e il giorno correnti.
  - `of(int month, int dayOfMonth)`: Crea un’istanza con un mese e giorno specifico.
  - `isValidYear(int year)`: Verifica se la data è valida in un anno specifico (utile per 29 febbraio).

---

### 10. **ZoneId** e **ZoneOffset**

- **Descrizione**: `ZoneId` rappresenta un fuso orario e `ZoneOffset` rappresenta una differenza di ore e minuti rispetto a UTC.
- **Principali Metodi**:
  - `of(String zoneId)`: Restituisce un’istanza di `ZoneId` per un fuso orario specifico.
  - `getAvailableZoneIds()`: Restituisce tutti i fusi orari disponibili.
  - `ofHours(int hours)`: Crea un `ZoneOffset` di un certo numero di ore rispetto a UTC.

---

### 11. **Clock**

- **Descrizione**: Fornisce l’ora corrente, consentendo il controllo dell'ora per test e altre esigenze. Può essere utilizzato per ottenere l'ora corrente di `Instant`, `LocalDateTime`, ecc.
- **Principali Metodi**:
  - `systemUTC()`: Restituisce l’orologio di sistema in UTC.
  - `systemDefaultZone()`: Restituisce l’orologio di sistema nella zona predefinita.
  - `instant()`: Restituisce l’istante corrente dell’orologio.

---

### 12. **TemporalAdjusters**

- **Descrizione**: Classe di utilità che fornisce implementazioni predefinite di `TemporalAdjuster` per manipolare facilmente le date.
- **Principali Metodi**:
  - `firstDayOfMonth()`: Regola una data al primo giorno del mese.
  - `lastDayOfMonth()`: Regola una data all’ultimo giorno del mese.
  - `next(DayOfWeek dayOfWeek)`: Regola una data al prossimo giorno della settimana specificato.

---

Il package `java.time` fornisce una gestione moderna e flessibile del tempo in Java, rendendo semplice e sicuro lavorare con date, orari e fusi orari in modo immutabile e thread-safe.
