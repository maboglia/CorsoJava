package it.corsojava.controller;

import java.net.URI;
import java.util.List;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import it.corsojava.entity.Contact;
import it.corsojava.service.ContactService;

/** REST Controller: espone gli endpoint HTTP della rubrica. */
@RestController
@RequestMapping("/api/contacts")
public class ContactController {
    private final ContactService service;

    public ContactController(ContactService service) {
        this.service = service;
    }

    @GetMapping
    public List<Contact> findAll(@RequestParam(required = false) String cognome) {
        if (cognome != null && !cognome.isBlank()) {
            return service.findByCognome(cognome);
        }
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        Contact contact = service.findById(id);
        if (contact == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(new ErrorMessage("Contatto con id " + id + " non trovato"));
        }
        return ResponseEntity.ok(contact);
    }

    @PostMapping
    public ResponseEntity<Contact> create(@Valid @RequestBody Contact contact) {
        Contact created = service.create(contact);
        return ResponseEntity.created(URI.create("/api/contacts/" + created.getId()))
                .body(created);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id,
                                    @Valid @RequestBody Contact data) {
        Contact updated = service.update(id, data);
        if (updated == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(new ErrorMessage("Contatto con id " + id + " non trovato"));
        }
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        if (!service.delete(id)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(new ErrorMessage("Contatto con id " + id + " non trovato"));
        }
        return ResponseEntity.noContent().build();
    }

    public record ErrorMessage(String message) {}
}
