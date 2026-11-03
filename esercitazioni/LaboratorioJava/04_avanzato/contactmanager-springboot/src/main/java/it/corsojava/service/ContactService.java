package it.corsojava.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import it.corsojava.entity.Contact;
import it.corsojava.repository.ContactRepository;

/** Service Layer: contiene la logica applicativa. */
@Service
public class ContactService {
    private final ContactRepository repository;

    // Constructor Injection: Spring passa automaticamente il repository.
    public ContactService(ContactRepository repository) {
        this.repository = repository;
    }

    public List<Contact> findAll() { return repository.findAll(); }

    public Contact findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public List<Contact> findByCognome(String cognome) {
        return repository.findByCognomeContainingIgnoreCase(cognome);
    }

    @Transactional
    public Contact create(Contact contact) {
        return repository.save(contact);
    }

    @Transactional
    public Contact update(Long id, Contact data) {
        Contact contact = repository.findById(id).orElse(null);
        if (contact == null) return null;

        contact.setNome(data.getNome());
        contact.setCognome(data.getCognome());
        contact.setEmail(data.getEmail());
        contact.setTelefono(data.getTelefono());
        contact.setAzienda(data.getAzienda());
        if (data.getAttivo() != null) contact.setAttivo(data.getAttivo());

        // L'entity è managed: Hibernate rileva le modifiche al commit.
        return contact;
    }

    @Transactional
    public boolean delete(Long id) {
        if (!repository.existsById(id)) return false;
        repository.deleteById(id);
        return true;
    }
}
