# One-to-Many

Ecco un esempio di relazione One-to-Many utilizzando Spring Boot e JPA. Considereremo una relazione tra due entità: `Azienda` e `Dipendente`, dove un'azienda può avere molti dipendenti, ma un dipendente può appartenere solo a un'azienda.

### 1. Definizione delle Entità

#### Azienda.java

```java
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Azienda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany(mappedBy = "azienda", cascade = CascadeType.ALL)
    private List<Dipendente> dipendenti = new ArrayList<>();

    // Costruttori, getter e setter
}
```

#### Dipendente.java

```java
import javax.persistence.*;

@Entity
public class Dipendente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToOne
    @JoinColumn(name = "azienda_id")
    private Azienda azienda;

    // Costruttori, getter e setter
}
```

### 2. Configurazione del Repository

#### AziendaRepository.java

```java
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AziendaRepository extends JpaRepository<Azienda, Long> {
}
```

#### DipendenteRepository.java

```java
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DipendenteRepository extends JpaRepository<Dipendente, Long> {
}
```

### 3. Implementazione del Servizio

#### AziendaServizio.java

```java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AziendaServizio {

    @Autowired
    private AziendaRepository aziendaRepository;

    public Azienda salvaAzienda(Azienda azienda) {
        return aziendaRepository.save(azienda);
    }

    public List<Azienda> tutteLeAziende() {
        return aziendaRepository.findAll();
    }
}
```

### 4. Utilizzo nel Controller

#### AziendaController.java

```java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aziende")
public class AziendaController {

    @Autowired
    private AziendaServizio aziendaServizio;

    @PostMapping("/aggiungi")
    public Azienda aggiungiAzienda(@RequestBody Azienda azienda) {
        return aziendaServizio.salvaAzienda(azienda);
    }

    @GetMapping("/tutte")
    public List<Azienda> tutteLeAziende() {
        return aziendaServizio.tutteLeAziende();
    }
}
```

In questo esempio, abbiamo definito le entità `Azienda` e `Dipendente` con una relazione One-to-Many, dove ogni azienda può avere molti dipendenti. Abbiamo configurato i repository per ciascuna entità e implementato un servizio per salvare un'azienda e recuperare tutte le aziende. Infine, abbiamo utilizzato il servizio nel controller per aggiungere un'azienda e ottenere tutte le aziende tramite richieste POST e GET.
