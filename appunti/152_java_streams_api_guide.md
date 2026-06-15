# 8. Programmazione Funzionale con le Collezioni

### 8.1 Interfacce Funzionali (@FunctionalInterface)

Le interfacce funzionali sono la base della programmazione funzionale in Java. Contengono un solo metodo astratto e possono essere implementate usando lambda expressions.

#### Interfacce Funzionali Personalizzate

```java
// Interfacce funzionali per operazioni bibliotecarie

@FunctionalInterface
interface CercaLibro {
    boolean cerca(String titolo, String criterio);
}

@FunctionalInterface
interface CalcolaMulta {
    double calcola(int giorni_ritardo);
}

@FunctionalInterface
interface OperazioneLibri {
    int elabora(int disponibili, int prestiti);
}

@FunctionalInterface
interface StampaReport {
    void stampa(String titolo, String autore, int copie);
}

public class InterfacceFunzionaliBiblioteca {
    public static void main(String[] args) {
        // Lambda senza parametri
        StampaReport intestazione = () -> 
            System.out.println("=== SISTEMA BIBLIOTECARIO ===");
        intestazione.stampa("", "", 0);
        
        // Lambda con un parametro  
        CercaLibro ricerca_titolo = titolo -> 
            titolo.toLowerCase().contains("nome");
        System.out.println("Contiene 'nome': " + 
            ricerca_titolo.cerca("Il Nome della Rosa", "nome"));
        
        // Lambda con più parametri
        StampaReport dettaglio_libro = (titolo, autore, copie) -> 
            System.out.println(titolo + " di " + autore + " (" + copie + " copie)");
        dettaglio_libro.stampa("1984", "George Orwell", 3);
        
        // Lambda con corpo complesso
        CalcolaMulta multa_ritardo = giorni -> {
            if (giorni <= 7) return 0.0;
            else if (giorni <= 14) return giorni * 0.5;
            else return giorni * 1.0;
        };
        System.out.println("Multa per 10 giorni: €" + multa_ritardo.calcola(10));
        
        // Uso di lambda come parametro di metodo
        System.out.println("Libri disponibili: " + 
            calcolaDisponibilita((disponibili, prestiti) -> disponibili - prestiti, 10, 3));
    }
    
    private static int calcolaDisponibilita(OperazioneLibri operazione, int disp, int prest) {
        return operazione.elabora(disp, prest);
    }
}
```

### 8.2 Stream API - Elaborazione Funzionale delle Collezioni

Gli Stream permettono di elaborare collezioni in modo funzionale, con operazioni concatenabili e leggibili.

#### Stream Basics con IntStream

```java
import java.util.stream.IntStream;
import java.util.IntSummaryStatistics;

public class BibliotecaIntStream {
    public static void main(String[] args) {
        System.out.println("=== ANALISI CODICI ISBN ===");
        
        // Genera e filtra codici ISBN (simulati come numeri)
        System.out.println("ISBN pari dal 1000 al 9999:");
        IntStream.range(1000, 10000)
            .filter(isbn -> isbn % 2 == 0)
            .limit(10) // Solo i primi 10
            .forEach(isbn -> System.out.println("ISBN: " + isbn));
        
        // Conta ISBN validi
        long isbn_pari = IntStream.range(1000, 10000)
            .filter(isbn -> isbn % 2 == 0)
            .count();
        System.out.println("Totale ISBN pari: " + isbn_pari);
        
        // Statistiche sui numeri di pagine dei libri
        System.out.println("\n=== STATISTICHE PAGINE LIBRI ===");
        IntSummaryStatistics stats = IntStream.of(320, 450, 180, 650, 280, 390)
            .summaryStatistics();
        
        System.out.println("Statistiche pagine: " + stats);
        System.out.println("Media pagine: " + stats.getAverage());
        System.out.println("Libro più lungo: " + stats.getMax() + " pagine");
        System.out.println("Libro più corto: " + stats.getMin() + " pagine");
    }
}
```

#### Stream con Arrays e Stream.of()

```java
import java.util.Arrays;
import java.util.stream.Stream;

public class BibliotecaStreamArrays {
    public static void main(String[] args) {
        // Stream da array di generi letterari
        String[] generi = {"Romanzo", "Fantascienza", "Giallo", "Biografia", 
                          "Horror", "Commedia", "Drammatico"};
        
        System.out.println("=== ANALISI GENERI LETTERARI ===");
        
        // Trova il primo genere che inizia con 'G'
        Arrays.stream(generi)
            .filter(genere -> genere.startsWith("G"))
            .findFirst()
            .ifPresent(genere -> System.out.println("Primo genere con G: " + genere));
        
        // Generi corti (meno di 8 caratteri) in ordine alfabetico
        System.out.println("\nGeneri corti (< 8 caratteri):");
        Arrays.stream(generi)
            .filter(genere -> genere.length() < 8)
            .sorted()
            .forEach(System.out::println);
        
        // Elaborazione numerica: numero di pagine medie per categoria
        int[] pagine_per_genere = {320, 280, 250, 400, 200, 180, 350};
        
        System.out.println("\n=== ANALISI PAGINE PER GENERE ===");
        double media_pagine = Arrays.stream(pagine_per_genere)
            .map(pagine -> pagine + 50) // Aggiunge 50 pagine per appendici
            .average()
            .orElse(0.0);
        
        System.out.println("Media pagine (con appendici): " + media_pagine);
        
        // Stream.of() per titoli selezionati
        System.out.println("\n=== TITOLI SELEZIONATI ===");
        Stream.of("Il Nome della Rosa", "1984", "Orgoglio e Pregiudizio", "Don Chisciotte")
            .sorted()
            .forEach(titolo -> System.out.println("📚 " + titolo));
    }
}
```

### 8.3 Stream su Collezioni Complesse

#### Stream con List e operazioni avanzate

```java
import java.util.*;
import java.util.stream.Collectors;

class LibroCompleto {
    private String titolo;
    private String autore;
    private String genere;
    private int pagine;
    private int anno;
    private double prezzo;
    
    public LibroCompleto(String titolo, String autore, String genere, 
                        int pagine, int anno, double prezzo) {
        this.titolo = titolo;
        this.autore = autore;
        this.genere = genere;
        this.pagine = pagine;
        this.anno = anno;
        this.prezzo = prezzo;
    }
    
    // Getters
    public String getTitolo() { return titolo; }
    public String getAutore() { return autore; }
    public String getGenere() { return genere; }
    public int getPagine() { return pagine; }
    public int getAnno() { return anno; }
    public double getPrezzo() { return prezzo; }
    
    @Override
    public String toString() {
        return titolo + " (" + autore + ", " + anno + ")";
    }
}

public class BibliotecaStreamComplessi {
    public static void main(String[] args) {
        List<LibroCompleto> biblioteca = Arrays.asList(
            new LibroCompleto("Il Nome della Rosa", "Umberto Eco", "Romanzo", 520, 1980, 15.90),
            new LibroCompleto("1984", "George Orwell", "Fantascienza", 280, 1949, 12.50),
            new LibroCompleto("Orgoglio e Pregiudizio", "Jane Austen", "Romanzo", 320, 1813, 10.90),
            new LibroCompleto("Il Processo", "Franz Kafka", "Drammatico", 180, 1925, 13.20),
            new LibroCompleto("Brave New World", "Aldous Huxley", "Fantascienza", 250, 1932, 11.80),
            new LibroCompleto("Emma", "Jane Austen", "Romanzo", 380, 1815, 12.90)
        );
        
        System.out.println("=== ANALISI COLLEZIONE BIBLIOTECARIA ===");
        
        // 1. Libri per autore in maiuscolo
        System.out.println("Autori (maiuscolo):");
        biblioteca.stream()
            .map(libro -> libro.getAutore().toUpperCase())
            .distinct()
            .sorted()
            .forEach(autore -> System.out.println("👤 " + autore));
        
        // 2. Libri del XX secolo, ordinati per anno
        System.out.println("\nLibri del XX secolo:");
        biblioteca.stream()
            .filter(libro -> libro.getAnno() >= 1900 && libro.getAnno() < 2000)
            .sorted(Comparator.comparing(LibroCompleto::getAnno))
            .forEach(libro -> System.out.println(libro.getAnno() + ": " + libro.getTitolo()));
        
        // 3. Verifica se esistono libri con condizioni specifiche
        boolean esisteLibroLungo = biblioteca.stream()
            .anyMatch(libro -> libro.getPagine() > 500);
        System.out.println("\nEsiste libro > 500 pagine: " + esisteLibroLungo);
        
        // 4. Raccolta in nuove collezioni
        List<String> titoli_fantascienza = biblioteca.stream()
            .filter(libro -> "Fantascienza".equals(libro.getGenere()))
            .map(LibroCompleto::getTitolo)
            .collect(Collectors.toList());
        
        System.out.println("\nLibri Fantascienza: " + titoli_fantascienza);
        
        // 5. Statistiche numeriche
        double prezzo_medio = biblioteca.stream()
            .mapToDouble(LibroCompleto::getPrezzo)
            .average()
            .orElse(0.0);
        
        int totale_pagine = biblioteca.stream()
            .mapToInt(LibroCompleto::getPagine)
            .sum();
        
        System.out.println("\nPrezzo medio: €" + String.format("%.2f", prezzo_medio));
        System.out.println("Totale pagine biblioteca: " + totale_pagine);
    }
}
```

### 8.4 Operazioni Stream Avanzate

#### Grouping, Partitioning e Joining

```java
import java.util.*;
import java.util.stream.Collectors;

public class BibliotecaStreamAvanzati {
    public static void main(String[] args) {
        List<LibroCompleto> biblioteca = Arrays.asList(
            new LibroCompleto("Il Nome della Rosa", "Umberto Eco", "Romanzo", 520, 1980, 15.90),
            new LibroCompleto("1984", "George Orwell", "Fantascienza", 280, 1949, 12.50),
            new LibroCompleto("Orgoglio e Pregiudizio", "Jane Austen", "Romanzo", 320, 1813, 10.90),
            new LibroCompleto("Il Processo", "Franz Kafka", "Drammatico", 180, 1925, 13.20),
            new LibroCompleto("Brave New World", "Aldous Huxley", "Fantascienza", 250, 1932, 11.80),
            new LibroCompleto("Emma", "Jane Austen", "Romanzo", 380, 1815, 12.90)
        );
        
        System.out.println("=== OPERAZIONI STREAM AVANZATE ===");
        
        // 1. Raggruppamento per genere
        Map<String, List<LibroCompleto>> per_genere = biblioteca.stream()
            .collect(Collectors.groupingBy(LibroCompleto::getGenere));
        
        System.out.println("Libri raggruppati per genere:");
        per_genere.forEach((genere, libri) -> {
            System.out.println("📖 " + genere + ":");
            libri.forEach(libro -> System.out.println("  - " + libro.getTitolo()));
        });
        
        // 2. Raggruppamento con calcolo prezzo medio per genere
        Map<String, Double> prezzo_medio_genere = biblioteca.stream()
            .collect(Collectors.groupingBy(
                LibroCompleto::getGenere,
                Collectors.averagingDouble(LibroCompleto::getPrezzo)
            ));
        
        System.out.println("\nPrezzo medio per genere:");
        prezzo_medio_genere.forEach((genere, prezzo) -> 
            System.out.println(genere + ": €" + String.format("%.2f", prezzo)));
        
        // 3. Partitioning (divisione in due gruppi)
        Map<Boolean, List<LibroCompleto>> per_lunghezza = biblioteca.stream()
            .collect(Collectors.partitioningBy(libro -> libro.getPagine() > 300));
        
        System.out.println("\nLibri lunghi (>300 pagine): " + per_lunghezza.get(true).size());
        System.out.println("Libri corti (≤300 pagine): " + per_lunghezza.get(false).size());
        
        // 4. Joining - Concatenazione di stringhe
        String tutti_titoli = biblioteca.stream()
            .map(LibroCompleto::getTitolo)
            .collect(Collectors.joining(", "));
        System.out.println("\nTutti i titoli: " + tutti_titoli);
        
        String catalogo_formattato = biblioteca.stream()
            .map(libro -> libro.getTitolo() + " - " + libro.getAutore())
            .collect(Collectors.joining("\n📚 ", "📚 ", "\n"));
        System.out.println("\nCatalogo formattato:");
        System.out.println(catalogo_formattato);
    }
}
```

#### FlatMap e Distinct per Gestioni Complesse

```java
import java.util.*;
import java.util.stream.Collectors;

class Lettore {
    private String nome;
    private List<String> libri_letti;
    
    public Lettore(String nome, String... libri) {
        this.nome = nome;
        this.libri_letti = Arrays.asList(libri);
    }
    
    public String getNome() { return nome; }
    public List<String> getLibriLetti() { return libri_letti; }
    
    @Override
    public String toString() { return nome; }
}

public class BibliotecaFlatMap {
    public static void main(String[] args) {
        List<Lettore> lettori = Arrays.asList(
            new Lettore("Marco", "1984", "Il Nome della Rosa", "Don Chisciotte"),
            new Lettore("Anna", "Orgoglio e Pregiudizio", "Emma", "1984"),
            new Lettore("Luigi", "Il Nome della Rosa", "Il Processo", "Brave New World"),
            new Lettore("Sofia", "Don Chisciotte", "Emma", "Il Nome della Rosa", "1984")
        );
        
        System.out.println("=== ANALISI LETTURE CON FLATMAP ===");
        
        // 1. Tutti i libri letti (con duplicati)
        System.out.println("Tutti i libri letti:");
        lettori.stream()
            .flatMap(lettore -> lettore.getLibriLetti().stream())
            .forEach(libro -> System.out.println("📖 " + libro));
        
        // 2. Libri unici letti da tutti i lettori
        Set<String> libri_unici = lettori.stream()
            .flatMap(lettore -> lettore.getLibriLetti().stream())
            .collect(Collectors.toSet());
        
        System.out.println("\nLibri unici nella biblioteca (letti da qualcuno): " + 
                          libri_unici.size());
        libri_unici.stream()
            .sorted()
            .forEach(libro -> System.out.println("📚 " + libro));
        
        // 3. Libro più popolare (più letto)
        Map<String, Long> popolarita = lettori.stream()
            .flatMap(lettore -> lettore.getLibriLetti().stream())
            .collect(Collectors.groupingBy(
                libro -> libro,
                Collectors.counting()
            ));
        
        System.out.println("\nPopolarità libri:");
        popolarita.entrySet().stream()
            .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
            .forEach(entry -> System.out.println(entry.getKey() + 
                     ": letto da " + entry.getValue() + " persone"));
        
        // 4. Lettori che hanno letto libri specifici
        String libro_cercato = "1984";
        List<String> lettori_1984 = lettori.stream()
            .filter(lettore -> lettore.getLibriLetti().contains(libro_cercato))
            .map(Lettore::getNome)
            .collect(Collectors.toList());
        
        System.out.println("\nLettori di '" + libro_cercato + "': " + lettori_1984);
    }
}
```

### 8.5 Reduce Operations e Operazioni Terminali

```java
import java.util.*;
import java.util.stream.Collectors;

public class BibliotecaReduce {
    public static void main(String[] args) {
        List<LibroCompleto> biblioteca = Arrays.asList(
            new LibroCompleto("Il Nome della Rosa", "Umberto Eco", "Romanzo", 520, 1980, 15.90),
            new LibroCompleto("1984", "George Orwell", "Fantascienza", 280, 1949, 12.50),
            new LibroCompleto("Orgoglio e Pregiudizio", "Jane Austen", "Romanzo", 320, 1813, 10.90),
            new LibroCompleto("Il Processo", "Franz Kafka", "Drammatico", 180, 1925, 13.20),
            new LibroCompleto("Brave New World", "Aldous Huxley", "Fantascienza", 250, 1932, 11.80)
        );
        
        System.out.println("=== OPERAZIONI REDUCE ===");
        
        // 1. Libro con titolo più lungo
        String titolo_piu_lungo = biblioteca.stream()
            .map(LibroCompleto::getTitolo)
            .reduce((t1, t2) -> t1.length() > t2.length() ? t1 : t2)
            .orElse("Nessun libro");
        
        System.out.println("Titolo più lungo: " + titolo_piu_lungo);
        
        // 2. Somma di tutte le pagine usando reduce
        int totale_pagine = biblioteca.stream()
            .mapToInt(LibroCompleto::getPagine)
            .reduce(0, (p1, p2) -> p1 + p2);
        
        System.out.println("Totale pagine (con reduce): " + totale_pagine);
        
        // 3. Concatenazione di tutti gli autori
        String tutti_autori = biblioteca.stream()
            .map(LibroCompleto::getAutore)
            .reduce((a1, a2) -> a1 + " | " + a2)
            .orElse("Nessun autore");
        
        System.out.println("Tutti gli autori: " + tutti_autori);
        
        // 4. Libro più costoso usando reduce
        Optional<LibroCompleto> libro_costoso = biblioteca.stream()
            .reduce((l1, l2) -> l1.getPrezzo() > l2.getPrezzo() ? l1 : l2);
        
        libro_costoso.ifPresent(libro -> 
            System.out.println("Libro più costoso: " + libro.getTitolo() + 
                             " (€" + libro.getPrezzo() + ")"));
        
        // 5. Operazioni terminali varie
        System.out.println("\n=== OPERAZIONI TERMINALI ===");
        
        // Count
        long libri_dopo_1900 = biblioteca.stream()
            .filter(libro -> libro.getAnno() > 1900)
            .count();
        System.out.println("Libri dopo il 1900: " + libri_dopo_1900);
        
        // Min/Max
        Optional<LibroCompleto> libro_piu_antico = biblioteca.stream()
            .min(Comparator.comparing(LibroCompleto::getAnno));
        
        libro_piu_antico.ifPresent(libro -> 
            System.out.println("Libro più antico: " + libro.getTitolo() + 
                             " (" + libro.getAnno() + ")"));
        
        // findFirst/findAny
        Optional<LibroCompleto> primo_romanzo = biblioteca.stream()
            .filter(libro -> "Romanzo".equals(libro.getGenere()))
            .findFirst();
        
        primo_romanzo.ifPresent(libro -> 
            System.out.println("Primo romanzo trovato: " + libro.getTitolo()));
    }
}
```

### 8.6 Method References

I method references sono una sintassi più concisa delle lambda expressions quando si fa riferimento a metodi esistenti.

```java
import java.util.*;
import java.util.function.Predicate;

class UtilitaBiblioteca {
    
    // Metodo statico per confrontare età di pubblicazione
    public static int confrontaPerAnno(LibroCompleto libro1, LibroCompleto libro2) {
        return Integer.compare(libro1.getAnno(), libro2.getAnno());
    }
    
    // Metodo statico per informazioni libro
    public static String getInfoLibro(LibroCompleto libro) {
        return libro.getTitolo() + " - " + libro.getAutore() + 
               " (" + libro.getAnno() + ")";
    }
    
    // Metodo di istanza per confronto per prezzo
    public int confrontaPerPrezzo(LibroCompleto libro1, LibroCompleto libro2) {
        return Double.compare(libro1.getPrezzo(), libro2.getPrezzo());
    }
}

public class BibliotecaMethodReferences {
    public static void main(String[] args) {
        List<LibroCompleto> biblioteca = Arrays.asList(
            new LibroCompleto("Il Nome della Rosa", "Umberto Eco", "Romanzo", 520, 1980, 15.90),
            new LibroCompleto("1984", "George Orwell", "Fantascienza", 280, 1949, 12.50),
            new LibroCompleto("Orgoglio e Pregiudizio", "Jane Austen", "Romanzo", 320, 1813, 10.90),
            new LibroCompleto("Il Processo", "Franz Kafka", "Drammatico", 180, 1925, 13.20)
        );
        
        System.out.println("=== METHOD REFERENCES ===");
        
        // 1. Method reference a metodo statico
        System.out.println("Ordinamento per anno (method reference statico):");
        biblioteca.stream()
            .sorted(UtilitaBiblioteca::confrontaPerAnno)
            .forEach(libro -> System.out.println(
                UtilitaBiblioteca.getInfoLibro(libro))); // Altro method reference statico
        
        // 2. Method reference a metodo di istanza di oggetto specifico
        UtilitaBiblioteca utility = new UtilitaBiblioteca();
        System.out.println("\nOrdinamento per prezzo (method reference istanza):");
        biblioteca.stream()
            .sorted(utility::confrontaPerPrezzo)
            .forEach(libro -> System.out.println(libro.getTitolo() + 
                     " - €" + libro.getPrezzo()));
        
        // 3. Method reference a metodo di istanza di tipo arbitrario
        System.out.println("\nTitoli in maiuscolo:");
        biblioteca.stream()
            .map(LibroCompleto::getTitolo)  // Equivale a: libro -> libro.getTitolo()
            .map(String::toUpperCase)       // Equivale a: titolo -> titolo.toUpperCase()
            .forEach(System.out::println);  // Equivale a: titolo -> System.out.println(titolo)
        
        // 4. Constructor reference
        System.out.println("\nCreazione array da stream:");
        String[] titoli = biblioteca.stream()
            .map(LibroCompleto::getTitolo)
            .toArray(String[]::new);  // Constructor reference per array
        
        System.out.println("Array creato: " + Arrays.toString(titoli));
        
        // 5. Confronto sintassi: Lambda vs Method Reference
        System.out.println("\n=== CONFRONTO SINTASSI ===");
        
        // Con lambda
        biblioteca.stream()
            .filter(libro -> libro.getPagine() > 300)
            .map(libro -> libro.getTitolo())
            .forEach(titolo -> System.out.println("Lambda: " + titolo));
        
        // Con method reference (più conciso)
        biblioteca.stream()
            .filter(libro -> libro.getPagine() > 300)  // Qui lambda è necessaria
            .map(LibroCompleto::getTitolo)             // Method reference
            .forEach(System.out::println);             // Method reference
    }
}
```

### 8.7 Stream Paralleli

```java
import java.util.*;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BibliotecaStreamParalleli {
    public static void main(String[] args) {
        // Crea una grande collezione per test performance
        List<LibroCompleto> grande_biblioteca = new ArrayList<>();
        
        String[] titoli_base = {"Il Nome della Rosa", "1984", "Orgoglio e Pregiudizio", 
                               "Il Processo", "Brave New World"};
        String[] autori_base = {"Umberto Eco", "George Orwell", "Jane Austen", 
                               "Franz Kafka", "Aldous Huxley"};
        
        // Genera 100,000 libri per test
        for (int i = 0; i < 100_000; i++) {
            int idx = i % titoli_base.length;
            grande_biblioteca.add(new LibroCompleto(
                titoli_base[idx] + " Vol." + (i/5 + 1),
                autori_base[idx],
                "Genere" + (i % 10),
                200 + (i % 300),
                1900 + (i % 120),
                10.0 + (i % 20)
            ));
        }
        
        System.out.println("=== STREAM PARALLELI ===");
        System.out.println("Biblioteca con " + grande_biblioteca.size() + " libri");
        
        // 1. Confronto performance: Sequential vs Parallel
        long start = System.currentTimeMillis();
        
        // Stream sequenziale
        long libri_costosi_seq = grande_biblioteca.stream()
            .filter(libro -> libro.getPrezzo() > 20.0)
            .count();
        
        long time_seq = System.currentTimeMillis() - start;
        
        start = System.currentTimeMillis();
        
        // Stream parallelo
        long libri_costosi_par = grande_biblioteca.parallelStream()
            .filter(libro -> libro.getPrezzo() > 20.0)
            .count();
        
        long time_par = System.currentTimeMillis() - start;
        
        System.out.println("Libri costosi (>€20): " + libri_costosi_seq);
        System.out.println("Tempo sequenziale: " + time_seq + "ms");
        System.out.println("Tempo parallelo: " + time_par + "ms");
        System.out.println("Miglioramento: " + (time_seq > 0 ? 
            String.format("%.1fx", (double)time_seq/time_par) : "N/A"));
        
        // 2. Operazioni parallel-safe
        System.out.println("\n=== OPERAZIONI PARALLEL-SAFE ===");
        
        // Raccolta thread-safe con Collectors
        ConcurrentMap<String, Long> generi_count = grande_biblioteca.parallelStream()
            .collect(Collectors.groupingByConcurrent(
                LibroCompleto::getGenere,
                Collectors.counting()
            ));
        
        System.out.println("Distribuzione per genere (parallela):");
        generi_count.entrySet().stream()
            .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
            .limit(5)
            .forEach(entry -> System.out.println(entry.getKey() + 
                     ": " + entry.getValue() + " libri"));
        
        // 3. Esempio con IntStream parallelo
        System.out.println("\n=== INTSTREAM PARALLELO ===");
        
        start = System.currentTimeMillis();
        long pari_seq = IntStream.rangeClosed(1, 10_000_000)
            .filter(n -> n % 2 == 0)
            .count();
        long time_int_seq = System.currentTimeMillis() - start;
        
        start = System.currentTimeMillis();
        long pari_par = IntStream.rangeClosed(1, 10_000_000)
            .parallel()
            .filter(n -> n % 2 == 0)
            .count();
        long time_int_par = System.currentTimeMillis() - start;
        
        System.out.println("Numeri pari da 1 a 10M: " + pari_seq);
        System.out.println("Tempo sequenziale: " + time_int_seq + "ms");
        System.out.println("Tempo parallelo: " + time_int_par + "ms");
        
        // 4. Quando NON usare stream paralleli
        System.out.println("\n=== ATTENZIONE: NON sempre i paralleli sono migliori ===");
        
        // Per collezioni piccole, il parallelo può essere più lento
        List<String> piccola_lista = Arrays.asList("Libro1", "Libro2", "Libro3", "Libro4");
        
        start = System.nanoTime();
        piccola_lista.stream()
            .map(String::toUpperCase)
            .collect(Collectors.toList());
        long nano_seq = System.nanoTime() - start;
        
        start = System.nanoTime();
        piccola_lista.parallelStream()
            .map(String::toUpperCase)
            .collect(Collectors.toList());
        long nano_par = System.nanoTime() - start;
        
        System.out.println("Lista piccola - Sequenziale: " + nano_seq + "ns");
        System.out.println("Lista piccola - Parallelo: " + nano_par + "ns");
        System.out.println("Per collezioni piccole, sequenziale è spesso più veloce");
    }
}
```

### 8.8 Interfacce Funzionali Standard

Java 8 fornisce molte interfacce funzionali predefinite nel package `java.util.function`.

```java
import java.util.*;
import java.util.function.*;

public class BibliotecaInterfacceFunzionali {
    public static void main(String[] args) {
        List<LibroCompleto> biblioteca = Arrays.asList(
            new LibroCompleto("Il Nome della Rosa", "Umberto Eco", "Romanzo", 520, 1980, 15.90),
            new LibroCompleto("1984", "George Orwell", "Fantascienza", 280, 1949, 12.50),
            new LibroCompleto("Orgoglio e Pregiudizio", "Jane Austen", "Romanzo", 320, 1813, 10.90),
            new LibroCompleto("Il Processo", "Franz Kafka", "Drammatico", 180, 1925, 13.20)
        );
        
        System.out.println("=== INTERFACCE FUNZIONALI STANDARD ===");
        
        // 1. Predicate<T> - test booleano
        Predicate<LibroCompleto> libro_moderno = libro -> libro.getAnno() > 1950;
        Predicate<LibroCompleto> libro_lungo = libro -> libro.getPagine() > 300;
        Predicate<LibroCompleto> libro_economico = libro -> libro.getPrezzo() < 13.0;
        
        System.out.println("Libri moderni e lunghi:");
        biblioteca.stream()
            .filter(libro_moderno.and(libro_lungo))  // Combina predicati
            .forEach(libro -> System.out.println("📚 " + libro.getTitolo()));
        
        System.out.println("\nLibri economici o antichi:");
        biblioteca.stream()
            .filter(libro_economico.or(libro_moderno.negate()))  // OR e negazione
            .forEach(libro -> System.out.println("💰 " + libro.getTitolo()));
        
        // 2. Function<T,R> - trasformazione
        Function<LibroCompleto, String> libro_to_info = libro -> 
            libro.getTitolo() + " (" + libro.getAnno() + ")";
        
        Function<String, String> aggiungi_emoji = info -> "📖 " + info;
        
        System.out.println("\nInformazioni libri con trasformazione:");
        biblioteca.stream()
            .map(libro_to_info.andThen(aggiungi_emoji))  // Compone funzioni
            .forEach(System.out::println);
        
        // 3. Consumer<T> - azione senza ritorno
        Consumer<LibroCompleto> stampa_dettagli = libro -> {
            System.out.println("Titolo: " + libro.getTitolo());
            System.out.println("Pagine: " + libro.getPagine());
            System.out.println("Prezzo: €" + libro.getPrezzo());
            System.out.println("---");
        };
        
        System.out.println("\nDettagli libri economici:");
        biblioteca.stream()
            .filter(libro_economico)
            .forEach(stampa_dettagli);
        
        // 4. Supplier<T> - fornisce valori
        Supplier<String> genera_codice_prestito = () -> 
            "PREST-" + System.currentTimeMillis() % 10000;
        
        System.out.println("Codici prestito generati:");
        for (int i = 0; i < 3; i++) {
            System.out.println(genera_codice_prestito.get());
        }
        
        // 5. UnaryOperator<T> - Function<T,T>
        UnaryOperator<String> formato_titolo = titolo -> 
            "\"" + titolo.toUpperCase() + "\"";
        
        System.out.println("\nTitoli formattati:");
        biblioteca.stream()
            .map(LibroCompleto::getTitolo)
            .map(formato_titolo)
            .forEach(System.out::println);
        
        // 6. BinaryOperator<T> - BiFunction<T,T,T>
        BinaryOperator<Integer> somma_pagine = (p1, p2) -> p1 + p2;
        
        int totale_pagine = biblioteca.stream()
            .map(LibroCompleto::getPagine)
            .reduce(0, somma_pagine);
        
        System.out.println("\nTotale pagine (con BinaryOperator): " + totale_pagine);
        
        // 7. BiFunction<T,U,R> - due input, un output
        BiFunction<String, Integer, String> crea_descrizione = 
            (titolo, anno) -> titolo + " è stato pubblicato nel " + anno;
        
        System.out.println("\nDescrizioni generate:");
        biblioteca.stream()
            .map(libro -> crea_descrizione.apply(libro.getTitolo(), libro.getAnno()))
            .forEach(System.out::println);
    }
}
```

### 8.9 Optional - Gestione Valori Null

```java
import java.util.*;
import java.util.stream.Collectors;

class CatalogoBiblioteca {
    private Map<String, LibroCompleto> catalogo;
    
    public CatalogoBiblioteca() {
        catalogo = new HashMap<>();
        // Popola catalogo
        List<LibroCompleto> libri = Arrays.asList(
            new LibroCompleto("Il Nome della Rosa", "Umberto Eco", "Romanzo", 520, 1980, 15.90),
            new LibroCompleto("1984", "George Orwell", "Fantascienza", 280, 1949, 12.50),
            new LibroCompleto("Orgoglio e Pregiudizio", "Jane Austen", "Romanzo", 320, 1813, 10.90)
        );
        
        libri.forEach(libro -> catalogo.put(libro.getTitolo(), libro));
    }
    
    // Ritorna Optional invece di null
    public Optional<LibroCompleto> cercaLibro(String titolo) {
        return Optional.ofNullable(catalogo.get(titolo));
    }
    
    // Trova libri per autore
    public Optional<List<LibroCompleto>> libriPerAutore(String autore) {
        List<LibroCompleto> risultati = catalogo.values().stream()
            .filter(libro -> libro.getAutore().equalsIgnoreCase(autore))
            .collect(Collectors.toList());
        
        return risultati.isEmpty() ? Optional.empty() : Optional.of(risultati);
    }
}

public class BibliotecaOptional {
    public static void main(String[] args) {
        CatalogoBiblioteca catalogo = new CatalogoBiblioteca();
        
        System.out.println("=== GESTIONE CON OPTIONAL ===");
        
        // 1. Uso base di Optional
        String titolo_cercato = "1984";
        Optional<LibroCompleto> libro_trovato = catalogo.cercaLibro(titolo_cercato);
        
        // Modo tradizionale (evitare)
        if (libro_trovato.isPresent()) {
            System.out.println("Trovato: " + libro_trovato.get().getTitolo());
        } else {
            System.out.println("Libro non trovato");
        }
        
        // Modo funzionale (preferito)
        catalogo.cercaLibro(titolo_cercato)
            .ifPresent(libro -> System.out.println("📚 Trovato: " + libro.getTitolo()));
        
        catalogo.cercaLibro("Libro Inesistente")
            .ifPresentOrElse(
                libro -> System.out.println("Trovato: " + libro.getTitolo()),
                () -> System.out.println("❌ Libro non trovato nel catalogo")
            );
        
        // 2. Optional con trasformazioni
        System.out.println("\n=== TRASFORMAZIONI CON OPTIONAL ===");
        
        String info_libro = catalogo.cercaLibro("Il Nome della Rosa")
            .map(libro -> libro.getTitolo() + " - " + libro.getAutore())
            .map(info -> "📖 " + info)
            .orElse("Informazioni non disponibili");
        
        System.out.println(info_libro);
        
        // 3. Optional con filtri
        System.out.println("\n=== FILTRI CON OPTIONAL ===");
        
        catalogo.cercaLibro("1984")
            .filter(libro -> libro.getAnno() < 1950)
            .ifPresentOrElse(
                libro -> System.out.println("Libro antico: " + libro.getTitolo()),
                () -> System.out.println("1984 non è un libro antico (pre-1950)")
            );
        
        // 4. Optional con valori di default
        System.out.println("\n=== VALORI DEFAULT ===");
        
        String autore = catalogo.cercaLibro("Libro Inesistente")
            .map(LibroCompleto::getAutore)
            .orElse("Autore Sconosciuto");
        
        System.out.println("Autore: " + autore);
        
        // OrElseGet per lazy evaluation
        String titolo_default = catalogo.cercaLibro("Altro Libro Inesistente")
            .map(LibroCompleto::getTitolo)
            .orElseGet(() -> {
                System.out.println("Generando titolo di default...");
                return "Titolo Non Disponibile";
            });
        
        System.out.println("Titolo: " + titolo_default);
        
        // 5. Optional con eccezioni
        try {
            LibroCompleto libro = catalogo.cercaLibro("Libro Inesistente")
                .orElseThrow(() -> new RuntimeException("Libro non trovato!"));
        } catch (RuntimeException e) {
            System.out.println("⚠️ Eccezione catturata: " + e.getMessage());
        }
        
        // 6. Concatenazione di Optional
        System.out.println("\n=== CONCATENAZIONE OPTIONAL ===");
        
        Optional<String> genere_preferito = catalogo.cercaLibro("Orgoglio e Pregiudizio")
            .map(LibroCompleto::getGenere)
            .filter(genere -> genere.equals("Romanzo"));
        
        genere_preferito.ifPresent(genere -> 
            System.out.println("Genere preferito confermato: " + genere));
        
        // 7. Optional con Stream
        System.out.println("\n=== OPTIONAL CON STREAM ===");
        
        List<String> titoli_trovati = Arrays.asList("1984", "Libro Inesistente", "Il Nome della Rosa")
            .stream()
            .map(catalogo::cercaLibro)
            .filter(Optional::isPresent)
            .map(Optional::get)
            .map(LibroCompleto::getTitolo)
            .collect(Collectors.toList());
        
        System.out.println("Titoli trovati: " + titoli_trovati);
        
        // Java 9+: Optional.stream()
        /* 
        List<String> autori_trovati = Arrays.asList("George Orwell", "Autore Inesistente")
            .stream()
            .map(catalogo::libriPerAutore)
            .flatMap(Optional::stream)  // Java 9+
            .flatMap(List::stream)
            .map(LibroCompleto::getAutore)
            .distinct()
            .collect(Collectors.toList());
        */
    }
}
```

### 8.10 Esempio Completo - Sistema Bibliotecario Funzionale

```java
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

class SistemaBibliotecarioFunzionale {
    private final Map<String, LibroCompleto> catalogo;
    private final Map<String, Set<String>> prestiti_attivi; // utente -> libri prestati
    private final Map<String, Integer> popolarita; // titolo -> numero prestiti
    
    public SistemaBibliotecarioFunzionale() {
        this.catalogo = new HashMap<>();
        this.prestiti_attivi = new HashMap<>();
        this.popolarita = new HashMap<>();
        inizializzaSistema();
    }
    
    private void inizializzaSistema() {
        List<LibroCompleto> libri_iniziali = Arrays.asList(
            new LibroCompleto("Il Nome della Rosa", "Umberto Eco", "Romanzo", 520, 1980, 15.90),
            new LibroCompleto("1984", "George Orwell", "Fantascienza", 280, 1949, 12.50),
            new LibroCompleto("Orgoglio e Pregiudizio", "Jane Austen", "Romanzo", 320, 1813, 10.90),
            new LibroCompleto("Il Processo", "Franz Kafka", "Drammatico", 180, 1925, 13.20),
            new LibroCompleto("Brave New World", "Aldous Huxley", "Fantascienza", 250, 1932, 11.80),
            new LibroCompleto("Emma", "Jane Austen", "Romanzo", 380, 1815, 12.90)
        );
        
        libri_iniziali.forEach(libro -> {
            catalogo.put(libro.getTitolo(), libro);
            popolarita.put(libro.getTitolo(), 0);
        });
    }
    
    // Interfacce funzionali personalizzate
    @FunctionalInterface
    interface FiltroLibri extends Predicate<LibroCompleto> {}
    
    @FunctionalInterface  
    interface TrasformatoreLibri extends Function<LibroCompleto, String> {}
    
    @FunctionalInterface
    interface AzioneLibro extends Consumer<LibroCompleto> {}
    
    // Metodi funzionali del sistema
    public Optional<LibroCompleto> cercaLibro(String titolo) {
        return Optional.ofNullable(catalogo.get(titolo));
    }
    
    public List<LibroCompleto> filtraLibri(FiltroLibri filtro) {
        return catalogo.values().stream()
            .filter(filtro)
            .collect(Collectors.toList());
    }
    
    public <R> List<R> trasformaLibri(Function<LibroCompleto, R> trasformazione) {
        return catalogo.values().stream()
            .map(trasformazione)
            .collect(Collectors.toList());
    }
    
    public void applicaAzione(FiltroLibri filtro, AzioneLibro azione) {
        catalogo.values().stream()
            .filter(filtro)
            .forEach(azione);
    }
    
    public Map<String, List<LibroCompleto>> raggruppaLibri(Function<LibroCompleto, String> classificatore) {
        return catalogo.values().stream()
            .collect(Collectors.groupingBy(classificatore));
    }
    
    // Operazioni di prestito funzionali
    public boolean eseguiPrestito(String utente, String titolo) {
        return cercaLibro(titolo)
            .filter(libro -> !isLibroPrestato(utente, titolo))
            .map(libro -> {
                prestiti_attivi.computeIfAbsent(utente, k -> new HashSet<>()).add(titolo);
                popolarita.compute(titolo, (k, v) -> v + 1);
                return true;
            })
            .orElse(false);
    }
    
    private boolean isLibroPrestato(String utente, String titolo) {
        return prestiti_attivi.getOrDefault(utente, Collections.emptySet()).contains(titolo);
    }
    
    public static void main(String[] args) {
        SistemaBibliotecarioFunzionale sistema = new SistemaBibliotecarioFunzionale();
        
        System.out.println("=== SISTEMA BIBLIOTECARIO FUNZIONALE ===");
        
        // 1. Filtri funzionali predefiniti
        FiltroLibri libri_moderni = libro -> libro.getAnno() > 1950;
        FiltroLibri libri_lunghi = libro -> libro.getPagine() > 300;
        FiltroLibri libri_economici = libro -> libro.getPrezzo() < 13.0;
        
        System.out.println("Libri moderni e lunghi:");
        sistema.filtraLibri(libri_moderni.and(libri_lunghi))
            .forEach(libro -> System.out.println("📚 " + libro.getTitolo()));
        
        // 2. Trasformazioni funzionali
        TrasformatoreLibri formato_catalogo = libro -> 
            String.format("%-25s | %s | %d | €%.2f", 
                libro.getTitolo(), libro.getAutore(), libro.getAnno(), libro.getPrezzo());
        
        System.out.println("\n=== CATALOGO FORMATTATO ===");
        sistema.trasformaLibri(formato_catalogo)
            .forEach(System.out::println);
        
        // 3. Azioni sui libri
        System.out.println("\n=== LIBRI ECONOMICI - PROMOZIONE ===");
        AzioneLibro applica_sconto = libro -> 
            System.out.println("🏷️ OFFERTA: " + libro.getTitolo() + 
                " - Prezzo scontato: €" + String.format("%.2f", libro.getPrezzo() * 0.8));
        
        sistema.applicaAzione(libri_economici, applica_sconto);
        
        // 4. Raggruppamenti avanzati
        System.out.println("\n=== STATISTICHE PER GENERE ===");
        Map<String, List<LibroCompleto>> per_genere = sistema.raggruppaLibri(LibroCompleto::getGenere);
        
        per_genere.entrySet().stream()
            .sorted(Map.Entry.<String, List<LibroCompleto>>comparingByValue(
                Comparator.comparing(List::size)).reversed())
            .forEach(entry -> {
                String genere = entry.getKey();
                List<LibroCompleto> libri = entry.getValue();
                double prezzo_medio = libri.stream()
                    .mapToDouble(LibroCompleto::getPrezzo)
                    .average().orElse(0.0);
                
                System.out.printf("%s: %d libri, prezzo medio €%.2f%n", 
                    genere, libri.size(), prezzo_medio);
            });
        
        // 5. Sistema di raccomandazioni funzionale
        Function<LibroCompleto, Double> punteggio_raccomandazione = libro -> {
            double punteggio = 0.0;
            punteggio += (2024 - libro.getAnno()) * 0.01; // Preferenza per moderni
            punteggio += Math.min(libro.getPagine() / 100.0, 5.0); // Lunghezza moderata
            punteggio += (20.0 - libro.getPrezzo()) * 0.1; // Prezzo accessibile
            return punteggio;
        };
        
        System.out.println("\n=== TOP 3 RACCOMANDAZIONI ===");
        sistema.catalogo.values().stream()
            .sorted(Comparator.comparing(punteggio_raccomandazione).reversed())
            .limit(3)
            .forEach(libro -> {
                double punteggio = punteggio_raccomandazione.apply(libro);
                System.out.printf("⭐ %s (Punteggio: %.2f)%n", 
                    libro.getTitolo(), punteggio);
            });
        
        // 6. Simulazione prestiti
        System.out.println("\n=== SIMULAZIONE PRESTITI ===");
        String[] utenti = {"Alice", "Bob", "Charlie"};
        String[] libri_richiesti = {"1984", "Il Nome della Rosa", "Emma", "Libro Inesistente"};
        
        Arrays.stream(utenti)
            .forEach(utente -> 
                Arrays.stream(libri_richiesti)
                    .forEach(titolo -> {
                        boolean successo = sistema.eseguiPrestito(utente, titolo);
                        System.out.printf("%s richiede '%s': %s%n", 
                            utente, titolo, successo ? "✅ Prestito OK" : "❌ Non disponibile");
                    })
            );
        
        // 7. Analisi popolarità
        System.out.println("\n=== CLASSIFICA POPOLARITÀ ===");
        sistema.popolarita.entrySet().stream()
            .filter(entry -> entry.getValue() > 0)
            .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
            .forEach(entry -> 
                System.out.printf("📈 %s: %d prestiti%n", 
                    entry.getKey(), entry.getValue()));
    }
}
```

---

## 9. Riepilogo Programmazione Funzionale

### Best Practices per Stream e Lambda

1. **Preferire Stream per operazioni complesse**: Usare stream quando si hanno più operazioni concatenate
2. **Method references quando possibile**: `String::toUpperCase` invece di `s -> s.toUpperCase()`
3. **Evitare side effects**: Le lambda dovrebbero essere pure (senza effetti collaterali)
4. **Usare Optional per evitare null**: Gestione elegante di valori assenti
5. **Stream paralleli solo per grandi dataset**: Per collezioni piccole sono più lenti
6. **Collectors per trasformazioni complesse**: Preferire ai loop manuali

### Interfacce Funzionali Più Comuni

| Interfaccia | Metodo | Uso Tipico | Esempio |
|-------------|--------|------------|---------|
| `Predicate<T>` | `test(T)` | Filtri, condizioni | `libro -> libro.getAnno() > 2000` |
| `Function<T,R>` | `apply(T)` | Trasformazioni | `libro -> libro.getTitolo()` |
| `Consumer<T>` | `accept(T)` | Azioni, side effects | `System.out::println` |
| `Supplier<T>` | `get()` | Generazione valori | `() -> new ArrayList<>()` |
| `UnaryOperator<T>` | `apply(T)` | Trasformazioni stesso tipo | `s -> s.toUpperCase()` |
| `BinaryOperator<T>` | `apply(T,T)` | Riduzione, combinazione | `Integer::sum` |

### Quando Usare Programmazione Funzionale

✅ **Usare Stream quando:**
- Operazioni su collezioni (filter, map, reduce)
- Trasformazioni dati complesse
- Aggregazioni e statistiche
- Elaborazioni parallele su grandi dataset

❌ **Evitare Stream quando:**
- Semplici iterazioni con side effects
- Performance critiche su piccole collezioni
- Logica imperativa complessa
- Debugging intensivo necessario

