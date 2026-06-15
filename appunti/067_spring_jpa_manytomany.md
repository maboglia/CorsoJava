# Many-to-Many

Ecco un esempio di relazione Many-to-Many utilizzando Spring Boot e JPA. Considereremo una relazione tra due entità: `Studente` e `Corso`, dove uno studente può essere iscritto a molti corsi e un corso può avere molti studenti.

### 1. Definizione delle Entità

#### Studente.java

```java
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Studente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "iscrizione",
            joinColumns = { @JoinColumn(name = "studente_id") },
            inverseJoinColumns = { @JoinColumn(name = "corso_id") }
    )
    Set<Corso> corsi = new HashSet<>();

    // Costruttori, getter e setter
}
```

#### Corso.java

```java
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Corso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToMany(mappedBy = "corsi")
    private Set<Studente> studenti = new HashSet<>();

    // Costruttori, getter e setter
}
```

### 2. Configurazione del Repository

#### StudenteRepository.java

```java
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudenteRepository extends JpaRepository<Studente, Long> {
}
```

#### CorsoRepository.java

```java
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CorsoRepository extends JpaRepository<Corso, Long> {
}
```

### 3. Implementazione del Servizio

#### StudenteServizio.java

```java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudenteServizio {

    @Autowired
    private StudenteRepository studenteRepository;

    public Studente salvaStudente(Studente studente) {
        return studenteRepository.save(studente);
    }

    public List<Studente> tuttiGliStudenti() {
        return studenteRepository.findAll();
    }
}
```

#### CorsoServizio.java

```java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CorsoServizio {

    @Autowired
    private CorsoRepository corsoRepository;

    public Corso salvaCorso(Corso corso) {
        return corsoRepository.save(corso);
    }

    public List<Corso> tuttiICorsi() {
        return corsoRepository.findAll();
    }
}
```

### 4. Utilizzo nel Controller

#### StudenteController.java

```java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/studenti")
public class StudenteController {

    @Autowired
    private StudenteServizio studenteServizio;

    @PostMapping("/aggiungi")
    public Studente aggiungiStudente(@RequestBody Studente studente) {
        return studenteServizio.salvaStudente(studente);
    }

    @GetMapping("/tutti")
    public List<Studente> tuttiGliStudenti() {
        return studenteServizio.tuttiGliStudenti();
    }
}
```

#### CorsoController.java

```java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/corsi")
public class CorsoController {

    @Autowired
    private CorsoServizio corsoServizio;

    @PostMapping("/aggiungi")
    public Corso aggiungiCorso(@RequestBody Corso corso) {
        return corsoServizio.salvaCorso(corso);
    }

    @GetMapping("/tutti")
    public List<Corso> tuttiICorsi() {
        return corsoServizio.tuttiICorsi();
    }
}
```

In questo esempio, abbiamo definito le entità `Studente` e `Corso` con una relazione Many-to-Many, dove uno studente può essere iscritto a molti corsi e un corso può avere molti studenti. Abbiamo configurato i repository per ciascuna entità e implementato due servizi per salvare uno studente e un corso e recuperare tutti gli studenti e tutti i corsi. Infine, abbiamo utilizzato i servizi nei controller per aggiungere uno studente e un corso e ottenere tutti gli studenti e tutti i corsi tramite richieste POST e GET.
