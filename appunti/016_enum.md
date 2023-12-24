# Enum

In Java, le enum (abbreviazione di "enumeration") sono un tipo di dato speciale che rappresenta un insieme di costanti. Le enum sono state introdotte in Java 5 per consentire la dichiarazione di un tipo di dato che consiste in un insieme fisso di valori ben noti. Le enum forniscono un modo pulito e leggibile per rappresentare costanti nel codice.

Ecco alcune caratteristiche chiave delle enum in Java:

1. **Dichiarazione:**
   Puoi dichiarare un tipo enum utilizzando la parola chiave `enum`. Ad esempio:

   ```java
   public enum Days {
       MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
   }
   ```

   In questo esempio, `Days` è una enum con sette costanti rappresentanti i giorni della settimana.

2. **Valori della Enum:**
   Gli elementi di una enum sono chiamati valori della enum. Nel caso dell'esempio sopra, i valori sono `MONDAY`, `TUESDAY`, ecc.

3. **Uso delle Enum:**
   Puoi utilizzare le enum in dichiarazioni di variabili, switch statement, e altri contesti in cui sono richiesti valori costanti.

   ```java
   Days today = Days.MONDAY;

   switch (today) {
       case MONDAY:
           System.out.println("Inizia la settimana!");
           break;
       case FRIDAY:
           System.out.println("Giorno del weekend!");
           break;
       // Altri casi...
   }
   ```

4. **Metodi nelle Enum:**
   Puoi aggiungere campi e metodi alle enum. Ad esempio, ogni valore di una enum può avere attributi associati.

   ```java
   public enum Days {
       MONDAY("Start of the week"), TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

       private String description;

       // Costruttore
       Days(String description) {
           this.description = description;
       }

       // Metodo per ottenere la descrizione
       public String getDescription() {
           return description;
       }
   }
   ```

   Ora puoi ottenere la descrizione di un giorno:

   ```java
   System.out.println(Days.MONDAY.getDescription()); // Stampa "Start of the week"
   ```

5. **Metodo `values()` e `valueOf()`:**
   Le enum forniscono metodi utili come `values()`, che restituisce un array di tutte le costanti di una enum, e `valueOf(String)`, che restituisce la costante con il nome specificato.

   ```java
   Days[] allDays = Days.values(); // Restituisce un array di tutte le costanti
   Days aDay = Days.valueOf("MONDAY"); // Restituisce la costante con il nome specificato
   ```

Le enum sono utili quando devi rappresentare un insieme fisso e ben noto di valori correlati, come giorni della settimana, mesi, ecc. Forniscono un codice più leggibile e robusto rispetto all'utilizzo di costanti intere o stringhe.




---

**Domande:**

1. **Domanda:** Vero o falso: un tipo Enum può essere una sottoclasse di java.lang.String.

   - **Risposta:** Falso. Tutti gli enum estendono implicitamente java.lang.Enum. Poiché una classe può estendere solo un genitore, il linguaggio Java non supporta l'ereditarietà multipla dello stato e quindi un enum non può estendere nient'altro.

**Esercizi:**

1. **Esercizio:** Riscrivi la classe Card dall'esercizio in Questions and Exercises: Classes in modo che rappresenti il rango e il seme di una carta con tipi Enum.

   - **Risposta:** Vedi [Card3.java](in un file di origine .java), [Suit.java](in un file di origine .java) e [Rank.java](in un file di origine .java).

2. **Esercizio:** Riscrivi la classe Deck.

   - **Risposta:** Vedi [Deck3.java](in un file di origine .java).
