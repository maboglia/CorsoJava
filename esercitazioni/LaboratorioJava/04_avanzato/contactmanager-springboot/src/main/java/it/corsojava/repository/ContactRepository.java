package it.corsojava.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import it.corsojava.entity.Contact;

/** Spring Data JPA genera automaticamente l'implementazione CRUD. */
public interface ContactRepository extends JpaRepository<Contact, Long> {
    List<Contact> findByCognomeContainingIgnoreCase(String cognome);
    Contact findByEmail(String email);
}
