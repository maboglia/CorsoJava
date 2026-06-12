# OneToOne

Esempio di relazione One-to-One utilizzando Spring Boot e JPA. In questo esempio, considereremo una relazione tra due entità: `Studente` e `LibrettoUniversitario`, dove ogni studente ha un solo libretto universitario e ogni libretto universitario è associato a uno studente.

### 1. Definizione delle Entità

#### Studente.java

```java
import javax.persistence.*;

@Entity
public class Studente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToOne(mappedBy = "studente", cascade = CascadeType.ALL)
    private LibrettoUniversitario librettoUniversitario;

    // Costruttori, getter e setter
}
```

#### LibrettoUniversitario.java

```java
import javax.persistence.*;

@Entity
public class LibrettoUniversitario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numeroMatricola;

    @OneToOne
    @JoinColumn(name = "studente_id")
    private Studente studente;

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

#### LibrettoUniversitarioRepository.java

```java
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibrettoUniversitarioRepository extends JpaRepository<LibrettoUniversitario, Long> {
}
```

### 3. Implementazione del Servizio

#### StudenteServizio.java

```java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudenteServizio {

    @Autowired
    private StudenteRepository studenteRepository;

    @Autowired
    private LibrettoUniversitarioRepository librettoUniversitarioRepository;

    public Studente salvaStudenteConLibretto(Studente studente, LibrettoUniversitario libretto) {
        libretto.setStudente(studente);
        studente.setLibrettoUniversitario(libretto);
        return studenteRepository.save(studente);
    }
}
```

### 4. Utilizzo nel Controller

#### StudenteController.java

```java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/studenti")
public class StudenteController {

    @Autowired
    private StudenteServizio studenteServizio;

    @PostMapping("/aggiungi")
    public Studente aggiungiStudente(@RequestBody Studente studente, @RequestBody LibrettoUniversitario libretto) {
        return studenteServizio.salvaStudenteConLibretto(studente, libretto);
    }
}
```

In questo esempio, abbiamo definito le entità `Studente` e `LibrettoUniversitario` con una relazione One-to-One. Abbiamo configurato i repository per ciascuna entità e implementato un servizio per salvare uno studente con il suo libretto universitario. Infine, abbiamo utilizzato il servizio nel controller per aggiungere uno studente con il suo libretto tramite una richiesta POST.
