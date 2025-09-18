# Guida Completa alle Collezioni Java

## Introduzione alle Collezioni

Le collezioni in Java sono strutture dati che permettono di memorizzare e manipolare gruppi di oggetti. Il Java Collections Framework fornisce interfacce e implementazioni per gestire efficacemente diversi tipi di raccolta dati.

Per tutti gli esempi useremo un sistema bibliotecario che gestisce libri, autori e operazioni tipiche di una biblioteca.

---

## 1. LIST - Collezioni Ordinate con Duplicati

### Caratteristiche delle List

- **Ordinate**: mantengono l'ordine di inserimento
- **Indicizzate**: accesso tramite indice numerico
- **Duplicati permessi**: possono contenere elementi uguali
- **Interfaccia**: `List<T>`

### ArrayList - Lista Dinamica

```java
import java.util.ArrayList;
import java.util.Arrays;

public class BibliotecaArrayList {
    public static void main(String[] args) {
        // Creazione lista libri
        ArrayList<String> libri = new ArrayList<>();
        
        // Aggiunta libri singolarmente
        libri.add("Il Nome della Rosa");
        libri.add("1984");
        libri.add("Orgoglio e Pregiudizio");
        
        // Aggiunta multipla
        libri.addAll(Arrays.asList("Don Chisciotte", "Moby Dick", "Il Grande Gatsby"));
        
        System.out.println("Catalogo biblioteca:");
        for (int i = 0; i < libri.size(); i++) {
            System.out.println((i + 1) + ". " + libri.get(i));
        }
        
        // Accesso e modifica per indice
        System.out.println("\nLibro in posizione 3: " + libri.get(2));
        libri.set(2, "Guerra e Pace");
        System.out.println("Libro aggiornato in posizione 3: " + libri.get(2));
        
        // Rimozione
        libri.remove(1); // Rimuove "1984"
        libri.remove("Moby Dick"); // Rimuove per valore
        
        System.out.println("\nCatalogo dopo rimozioni:");
        for (String libro : libri) {
            System.out.println("- " + libro);
        }
        
        System.out.println("Totale libri: " + libri.size());
    }
}
```

### LinkedList - Lista Collegata

```java
import java.util.LinkedList;

public class BibliotecaLinkedList {
    public static void main(String[] args) {
        LinkedList<String> coda_prestiti = new LinkedList<>();
        
        // Operazioni tipiche di coda (FIFO)
        coda_prestiti.addLast("Il Nome della Rosa");
        coda_prestiti.addLast("1984");
        coda_prestiti.addLast("Don Chisciotte");
        
        System.out.println("Coda prestiti: " + coda_prestiti);
        
        // Primo libro da restituire
        String prossimo_rientro = coda_prestiti.removeFirst();
        System.out.println("Libro in rientro: " + prossimo_rientro);
        
        // Operazioni tipiche di stack (LIFO)
        LinkedList<String> stack_letture = new LinkedList<>();
        stack_letture.push("Orgoglio e Pregiudizio");
        stack_letture.push("Il Grande Gatsby");
        stack_letture.push("Guerra e Pace");
        
        System.out.println("Stack letture: " + stack_letture);
        System.out.println("Ultima lettura: " + stack_letture.pop());
    }
}
```

---

## 2. SET - Collezioni Senza Duplicati

### Caratteristiche dei Set

- **Senza duplicati**: ogni elemento appare una sola volta
- **Controllo unicità**: basato su `equals()` e `hashCode()`
- **Interfaccia**: `Set<T>`

### HashSet - Set Non Ordinato

```java
import java.util.HashSet;
import java.util.Arrays;

public class BibliotecaHashSet {
    public static void main(String[] args) {
        HashSet<String> autori_disponibili = new HashSet<>();
        
        // Aggiunta autori (duplicati ignorati automaticamente)
        autori_disponibili.add("Umberto Eco");
        autori_disponibili.add("George Orwell");
        autori_disponibili.add("Jane Austen");
        autori_disponibili.add("Miguel de Cervantes");
        autori_disponibili.add("George Orwell"); // Duplicato - ignorato
        
        System.out.println("Autori in biblioteca (" + autori_disponibili.size() + "):");
        for (String autore : autori_disponibili) {
            System.out.println("- " + autore);
        }
        
        // Verifica presenza
        String cerca_autore = "Jane Austen";
        if (autori_disponibili.contains(cerca_autore)) {
            System.out.println("\n" + cerca_autore + " è disponibile!");
        }
        
        // Rimozione
        autori_disponibili.remove("Miguel de Cervantes");
        System.out.println("\nAutori dopo rimozione: " + autori_disponibili.size());
    }
}
```

### LinkedHashSet - Set con Ordine di Inserimento

```java
import java.util.LinkedHashSet;

public class BibliotecaLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> generi_letterari = new LinkedHashSet<>();
        
        // Mantiene l'ordine di inserimento
        generi_letterari.add("Romanzo");
        generi_letterari.add("Fantascienza");
        generi_letterari.add("Giallo");
        generi_letterari.add("Biografia");
        generi_letterari.add("Romanzo"); // Duplicato - ignorato
        
        System.out.println("Generi letterari disponibili (in ordine di catalogazione):");
        int numero = 1;
        for (String genere : generi_letterari) {
            System.out.println(numero++ + ". " + genere);
        }
        
        System.out.println("Totale generi unici: " + generi_letterari.size());
    }
}
```

### TreeSet - Set Ordinato

```java
import java.util.TreeSet;
import java.util.Comparator;

public class BibliotecaTreeSet {
    public static void main(String[] args) {
        // TreeSet con ordinamento naturale (alfabetico)
        TreeSet<String> libri_ordinati = new TreeSet<>();
        libri_ordinati.add("Il Nome della Rosa");
        libri_ordinati.add("1984");
        libri_ordinati.add("Orgoglio e Pregiudizio");
        libri_ordinati.add("Don Chisciotte");
        
        System.out.println("Libri in ordine alfabetico:");
        for (String libro : libri_ordinati) {
            System.out.println("- " + libro);
        }
        
        // TreeSet con comparatore personalizzato (per lunghezza titolo)
        Comparator<String> comparatore_lunghezza = new Comparator<String>() {
            @Override
            public int compare(String libro1, String libro2) {
                int diff = libro1.length() - libro2.length();
                return diff != 0 ? diff : libro1.compareTo(libro2); // Se stessa lunghezza, ordine alfabetico
            }
        };
        
        TreeSet<String> libri_per_lunghezza = new TreeSet<>(comparatore_lunghezza);
        libri_per_lunghezza.add("Il Nome della Rosa");
        libri_per_lunghezza.add("1984");
        libri_per_lunghezza.add("Orgoglio e Pregiudizio");
        libri_per_lunghezza.add("Don Chisciotte della Mancia");
        
        System.out.println("\nLibri ordinati per lunghezza titolo:");
        for (String libro : libri_per_lunghezza) {
            System.out.println("- " + libro + " (" + libro.length() + " caratteri)");
        }
    }
}
```

---

## 3. QUEUE - Collezioni FIFO (First In, First Out)

### Caratteristiche delle Queue

- **FIFO**: primo entrato, primo uscito
- **Metodi principali**: `offer()`, `poll()`, `peek()`
- **Interfaccia**: `Queue<T>`

### Metodi Principali Queue

| Metodo | Descrizione | Comportamento se vuota |
|--------|-------------|----------------------|
| `offer(element)` | Inserisce elemento in coda | - |
| `add(element)` | Inserisce elemento in coda | Lancia eccezione se fallisce |
| `poll()` | Rimuove e restituisce primo elemento | Restituisce `null` |
| `remove()` | Rimuove e restituisce primo elemento | Lancia eccezione |
| `peek()` | Restituisce primo elemento senza rimuoverlo | Restituisce `null` |
| `element()` | Restituisce primo elemento senza rimuoverlo | Lancia eccezione |

### PriorityQueue - Coda con Priorità

```java
import java.util.PriorityQueue;
import java.util.Comparator;

public class BibliotecaPriorityQueue {
    public static void main(String[] args) {
        // Coda con priorità per urgenza prestiti
        // Priorità basata sulla lunghezza del titolo (titoli più corti = priorità maggiore)
        Comparator<String> priorita_urgenza = (libro1, libro2) -> libro1.length() - libro2.length();
        
        PriorityQueue<String> coda_urgenze = new PriorityQueue<>(priorita_urgenza);
        
        // Aggiunta richieste
        coda_urgenze.offer("Il Nome della Rosa");
        coda_urgenze.offer("1984");
        coda_urgenze.offer("Orgoglio e Pregiudizio");
        coda_urgenze.offer("Don Chisciotte della Mancia");
        
        System.out.println("Gestione richieste urgenti (titoli corti = priorità alta):");
        
        // Elaborazione in ordine di priorità
        while (!coda_urgenze.isEmpty()) {
            String prossima_richiesta = coda_urgenze.poll();
            System.out.println("Elaborando: " + prossima_richiesta);
        }
        
        // Esempio con priorità numerica
        PriorityQueue<Integer> coda_posti = new PriorityQueue<>(); // Min-heap per default
        coda_posti.offer(15);
        coda_posti.offer(3);
        coda_posti.offer(8);
        coda_posti.offer(1);
        
        System.out.println("\nAssegnazione posti sala lettura (dal più basso):");
        while (!coda_posti.isEmpty()) {
            System.out.println("Posto n.: " + coda_posti.poll());
        }
    }
}
```

---

## 4. DEQUE - Double Ended Queue

### Caratteristiche dei Deque

- **Accesso doppio**: inserimento/rimozione da entrambe le estremità
- **Versatilità**: può fungere da Stack o Queue
- **Interfaccia**: `Deque<T>`

```java
import java.util.ArrayDeque;
import java.util.Deque;

public class BibliotecaDeque {
    public static void main(String[] args) {
        Deque<String> scaffale_mobile = new ArrayDeque<>();
        
        // Uso come coda FIFO
        System.out.println("=== USO COME CODA FIFO ===");
        scaffale_mobile.offerLast("Il Nome della Rosa");    // In fondo
        scaffale_mobile.offerLast("1984");                  // In fondo
        scaffale_mobile.offerLast("Orgoglio e Pregiudizio"); // In fondo
        
        System.out.println("Scaffale: " + scaffale_mobile);
        System.out.println("Primo libro da prestare: " + scaffale_mobile.pollFirst());
        System.out.println("Dopo prestito: " + scaffale_mobile);
        
        // Reset per esempio stack
        scaffale_mobile.clear();
        
        // Uso come stack LIFO
        System.out.println("\n=== USO COME STACK LIFO ===");
        scaffale_mobile.push("Don Chisciotte");      // In cima
        scaffale_mobile.push("Moby Dick");           // In cima
        scaffale_mobile.push("Il Grande Gatsby");    // In cima
        
        System.out.println("Stack libri: " + scaffale_mobile);
        System.out.println("Ultimo inserito: " + scaffale_mobile.pop());
        System.out.println("Dopo rimozione: " + scaffale_mobile);
        
        // Accesso senza rimozione
        System.out.println("\n=== CONTROLLO SENZA RIMOZIONE ===");
        System.out.println("Primo libro: " + scaffale_mobile.peekFirst());
        System.out.println("Ultimo libro: " + scaffale_mobile.peekLast());
        System.out.println("Scaffale invariato: " + scaffale_mobile);
        
        // Inserimento in posizioni specifiche
        System.out.println("\n=== INSERIMENTO MIRATO ===");
        scaffale_mobile.offerFirst("Guerra e Pace");  // All'inizio
        scaffale_mobile.offerLast("Delitto e Castigo"); // Alla fine
        
        System.out.println("Scaffale finale: " + scaffale_mobile);
        System.out.println("Totale libri: " + scaffale_mobile.size());
    }
}
```

---

## 5. MAP - Collezioni Chiave-Valore

### Caratteristiche delle Map

- **Coppie chiave-valore**: ogni chiave univoca associata a un valore
- **Chiavi uniche**: non possono esserci chiavi duplicate
- **Interfaccia**: `Map<K,V>`

### HashMap - Mappa Non Ordinata

```java
import java.util.HashMap;
import java.util.Map;

public class BibliotecaHashMap {
    public static void main(String[] args) {
        // Mappa ISBN -> Titolo libro
        HashMap<String, String> catalogo = new HashMap<>();
        
        // Inserimento libri
        catalogo.put("978-88-452-0000-1", "Il Nome della Rosa");
        catalogo.put("978-88-452-0000-2", "1984");
        catalogo.put("978-88-452-0000-3", "Orgoglio e Pregiudizio");
        catalogo.put("978-88-452-0000-4", "Don Chisciotte");
        
        // Ricerca per ISBN
        String isbn_cercato = "978-88-452-0000-2";
        String titolo_trovato = catalogo.get(isbn_cercato);
        System.out.println("Libro con ISBN " + isbn_cercato + ": " + titolo_trovato);
        
        // Iterazione completa
        System.out.println("\nCatalogo completo:");
        for (Map.Entry<String, String> entry : catalogo.entrySet()) {
            System.out.println("ISBN: " + entry.getKey() + " -> " + entry.getValue());
        }
        
        // Verifica esistenza
        if (catalogo.containsKey("978-88-452-0000-5")) {
            System.out.println("Libro trovato!");
        } else {
            System.out.println("ISBN non presente nel catalogo");
        }
        
        // Statistiche
        System.out.println("\nStatistiche catalogo:");
        System.out.println("Totale libri: " + catalogo.size());
        System.out.println("Tutti gli ISBN: " + catalogo.keySet());
        System.out.println("Tutti i titoli: " + catalogo.values());
    }
}
```

### LinkedHashMap - Mappa con Ordine di Inserimento

```java
import java.util.LinkedHashMap;
import java.util.Map;

public class BibliotecaLinkedHashMap {
    public static void main(String[] args) {
        // Storico prestiti mantenendo ordine cronologico
        LinkedHashMap<String, String> storico_prestiti = new LinkedHashMap<>();
        
        storico_prestiti.put("2024-01-15", "Il Nome della Rosa");
        storico_prestiti.put("2024-01-18", "1984");
        storico_prestiti.put("2024-01-22", "Orgoglio e Pregiudizio");
        storico_prestiti.put("2024-01-25", "Don Chisciotte");
        
        System.out.println("Storico prestiti (ordine cronologico):");
        for (Map.Entry<String, String> prestito : storico_prestiti.entrySet()) {
            System.out.println("Data: " + prestito.getKey() + " -> Libro: " + prestito.getValue());
        }
        
        // Accesso diretto
        System.out.println("\nPrestito del 2024-01-18: " + storico_prestiti.get("2024-01-18"));
        
        // Rimozione mantenendo ordine
        storico_prestiti.remove("2024-01-18");
        System.out.println("\nDopo rimozione prestito 2024-01-18:");
        storico_prestiti.forEach((data, libro) -> 
            System.out.println("Data: " + data + " -> Libro: " + libro));
    }
}
```

### TreeMap - Mappa Ordinata

```java
import java.util.TreeMap;
import java.util.Map;
import java.util.Comparator;

public class BibliotecaTreeMap {
    public static void main(String[] args) {
        // Mappa autori -> numero opere (ordinata alfabeticamente per autore)
        TreeMap<String, Integer> autori_opere = new TreeMap<>();
        
        autori_opere.put("Umberto Eco", 15);
        autori_opere.put("George Orwell", 8);
        autori_opere.put("Jane Austen", 6);
        autori_opere.put("Miguel de Cervantes", 12);
        
        System.out.println("Autori e opere (ordine alfabetico):");
        for (Map.Entry<String, Integer> entry : autori_opere.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " opere");
        }
        
        // TreeMap con comparatore personalizzato (per numero opere)
        Comparator<String> per_popolarita = (autore1, autore2) -> {
            Integer opere1 = autori_opere.get(autore1);
            Integer opere2 = autori_opere.get(autore2);
            if (opere1 == null) opere1 = 0;
            if (opere2 == null) opere2 = 0;
            
            int diff = opere2.compareTo(opere1); // Ordine decrescente
            return diff != 0 ? diff : autore1.compareTo(autore2); // Se stesso numero, alfabetico
        };
        
        TreeMap<String, Integer> per_numero_opere = new TreeMap<>(per_popolarita);
        per_numero_opere.putAll(autori_opere);
        
        System.out.println("\nAutori ordinati per numero opere (dal più prolifico):");
        for (Map.Entry<String, Integer> entry : per_numero_opere.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " opere");
        }
        
        // Navigazione TreeMap
        System.out.println("\nPrimo autore (alfabeticamente): " + autori_opere.firstKey());
        System.out.println("Ultimo autore (alfabeticamente): " + autori_opere.lastKey());
        
        // Sottomappa
        System.out.println("\nAutori dalla G alla Z:");
        Map<String, Integer> sottomappa = autori_opere.subMap("G", "Z");
        sottomappa.forEach((autore, opere) -> 
            System.out.println(autore + ": " + opere + " opere"));
    }
}
```

---

## 6. Esempio Completo - Sistema Bibliotecario Integrato

```java
import java.util.*;

public class SistemaBibliotecario {
    
    // Catalogo principale: ISBN -> Informazioni libro
    private Map<String, String> catalogo;
    
    // Disponibilità: Titolo -> Numero copie disponibili  
    private Map<String, Integer> disponibilita;
    
    // Coda prestiti in attesa
    private Queue<String> coda_prestiti;
    
    // Storico prestiti
    private LinkedHashMap<String, String> storico_prestiti;
    
    // Autori unici
    private Set<String> autori;
    
    // Generi letterari
    private TreeSet<String> generi;
    
    public SistemaBibliotecario() {
        catalogo = new HashMap<>();
        disponibilita = new HashMap<>();
        coda_prestiti = new LinkedList<>();
        storico_prestiti = new LinkedHashMap<>();
        autori = new HashSet<>();
        generi = new TreeSet<>();
        
        inizializzaCatalogo();
    }
    
    private void inizializzaCatalogo() {
        // Popola il sistema con dati di esempio
        aggiungiLibro("978-88-452-0001", "Il Nome della Rosa", "Umberto Eco", "Romanzo Storico", 3);
        aggiungiLibro("978-88-452-0002", "1984", "George Orwell", "Fantascienza", 2);
        aggiungiLibro("978-88-452-0003", "Orgoglio e Pregiudizio", "Jane Austen", "Romanzo", 4);
        aggiungiLibro("978-88-452-0004", "Don Chisciotte", "Miguel de Cervantes", "Avventura", 1);
    }
    
    public void aggiungiLibro(String isbn, String titolo, String autore, String genere, int copie) {
        catalogo.put(isbn, titolo);
        disponibilita.put(titolo, copie);
        autori.add(autore);
        generi.add(genere);
        System.out.println("Aggiunto: " + titolo + " (" + copie + " copie)");
    }
    
    public void richiediPrestito(String titolo) {
        if (disponibilita.containsKey(titolo) && disponibilita.get(titolo) > 0) {
            // Prestito immediato
            disponibilita.put(titolo, disponibilita.get(titolo) - 1);
            String data = "2024-" + (new Random().nextInt(12) + 1) + "-" + (new Random().nextInt(28) + 1);
            storico_prestiti.put(data, titolo);
            System.out.println("✓ Prestito confermato: " + titolo);
        } else {
            // In coda di attesa
            coda_prestiti.offer(titolo);
            System.out.println("⏳ Libro in coda di attesa: " + titolo);
        }
    }
    
    public void restituisciLibro(String titolo) {
        disponibilita.put(titolo, disponibilita.get(titolo) + 1);
        
        // Verifica coda di attesa
        if (coda_prestiti.contains(titolo)) {
            coda_prestiti.remove(titolo);
            disponibilita.put(titolo, disponibilita.get(titolo) - 1);
            System.out.println("✓ Libro restituito e assegnato da coda di attesa: " + titolo);
        } else {
            System.out.println("✓ Libro restituito: " + titolo);
        }
    }
    
    public void mostraStatistiche() {
        System.out.println("\n=== STATISTICHE BIBLIOTECA ===");
        System.out.println("Totale libri in catalogo: " + catalogo.size());
        System.out.println("Autori unici: " + autori.size());
        System.out.println("Generi disponibili: " + generi);
        System.out.println("Prestiti in coda: " + coda_prestiti.size());
        
        System.out.println("\nDisponibilità corrente:");
        disponibilita.entrySet().stream()
            .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
            .forEach(entry -> System.out.println("- " + entry.getKey() + ": " + entry.getValue() + " copie"));
        
        System.out.println("\nUltimi prestiti:");
        storico_prestiti.entrySet().stream()
            .skip(Math.max(0, storico_prestiti.size() - 3))
            .forEach(entry -> System.out.println("- " + entry.getKey() + ": " + entry.getValue()));
    }
    
    public static void main(String[] args) {
        SistemaBibliotecario biblioteca = new SistemaBibliotecario();
        
        // Simulazione operazioni
        biblioteca.richiediPrestito("Il Nome della Rosa");
        biblioteca.richiediPrestito("1984");
        biblioteca.richiediPrestito("Il Nome della Rosa"); // Seconda copia
        biblioteca.richiediPrestito("Il Nome della Rosa"); // Terza copia
        biblioteca.richiediPrestito("Il Nome della Rosa"); // In coda - non disponibile
        
        biblioteca.restituisciLibro("Il Nome della Rosa");
        
        biblioteca.mostraStatistiche();
    }
}
```

---

## 7. Riepilogo e Best Practices

### Quando Usare Ogni Collezione

| Tipo | Quando Usare | Esempio Bibliotecario |
|------|--------------|----------------------|
| **ArrayList** | Accesso frequente per indice, dimensione variabile | Lista libri ordinata per catalogo |
| **LinkedList** | Inserimenti/rimozioni frequenti, uso come coda/stack | Coda prestiti, stack letture recenti |
| **HashSet** | Controllo duplicati, ricerca veloce | Elenco autori unici |
| **LinkedHashSet** | Controllo duplicati + ordine inserimento | Generi nell'ordine di catalogazione |
| **TreeSet** | Collezione ordinata senza duplicati | Libri in ordine alfabetico |
| **PriorityQueue** | Elaborazione in ordine di priorità | Richieste urgenti |
| **ArrayDeque** | Coda/stack efficiente | Scaffale mobile |
| **HashMap** | Ricerca veloce chiave-valore | Catalogo ISBN->Titolo |
| **LinkedHashMap** | Ricerca + ordine inserimento | Storico prestiti cronologico |
| **TreeMap** | Mappa ordinata per chiave | Autori ordinati alfabeticamente |

### Performance Comparison

| Operazione | ArrayList | LinkedList | HashSet | TreeSet | HashMap | TreeMap |
|------------|-----------|------------|---------|---------|---------|---------|
| **Accesso per indice** | O(1) | O(n) | N/A | N/A | N/A | N/A |
| **Ricerca elemento** | O(n) | O(n) | O(1) | O(log n) | O(1) | O(log n) |
| **Inserimento** | O(1)* | O(1) | O(1) | O(log n) | O(1) | O(log n) |
| **Rimozione** | O(n) | O(1)** | O(1) | O(log n) | O(1) | O(log n) |

*Amortized, può essere O(n) per ridimensionamento
**Se si ha il riferimento al nodo

### Considerazioni Memoria

- **ArrayList**: Più efficiente per memoria, array contiguo
- **LinkedList**: Overhead per puntatori, ma flessibile
- **HashMap**: Hash table + bucket, ottimo compromesso
- **TreeMap**: Struttura ad albero, più memoria per nodi
