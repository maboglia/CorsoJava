# interfacce funzionali



```java

Studente studente = getUtente(1);

//passo i dati come argomento
BigDecimal mediaVoti = calcolaMedia(studente);


//passaggio come funzionalità
ExecutorService thread = Executors.newFixedThreadPool(4);

//funzionalità da eseguire
RUnnable calcolaMedia = new Runnable(){
    public void run(){
        //calcola media voti
    }
}

//passo la funzionalità come argomento
thread.submit(calcolaMedia);

//la funzionalità è descritta nel metodo run()
public interface Runnable {
    void run();
}

```

---

## Le interfacce funzionali rappresentano funzionalità invece di dati

Per esempio

* Runnable
  * void run()
* Callable<V>
  * V call() throws Exception
* Comparator<T>
  * int compare(T o1, T o2)

Queste interfacce, già presenti in Java da molto tempo, possono essere definite interfacce funzionali.
Da Java 8 si possono usare con tali interfacce le **Espressioni Lambda**

---

## Espressioni Lambda

```java
Comparator<Utente> comparator = new Comparator<Utente>(){
    @Override
    public int compare(Utente u1, Utente u2){
        return u1.getId.compareTo(u2.getId());
    }
};
```

con le Lambda diventa

```java
Comparator<Utente> comparator = (u1, u2) -> u1.getId.compareTo(u2.getId());
```

---

## Nuove interfacce funzionali in Java 8
* Predicate<T>
  * boolean test(T t)
* Consumer<T>
  * void accept(T t)
* Supplier<T>
  * T get()
* Function<T, R>
  * R apply(T t)

### Esempio uso Predicate<T>

```java
        List<Utente> utenti = Utente.getAllUsers();
        utenti.removeIf(new Predicate<Utente>() {
            @Override
            public boolean test(Utente utente) {
                return !utente.isAssente();
            }
        });
        //con le Lambda diventa
        utenti.removeIf(utente->!utente.isAssente());

```

---

### Esempio uso Consumer<T>

```java

    static void stampaUtente(Utente u){
        System.out.println(u);
    }

    public static void main(String[] args) {

        List<Utente> utenti = Utente.getAllUsers();
        utenti.removeIf(new Predicate<Utente>() {
            @Override
            public boolean test(Utente utente) {
                return !utente.isAssente();
            }
        });

        utenti.stream().forEach(utente->stampaUtente(utente));


    }

```
