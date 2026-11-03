package it.corsojava.repository;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

import it.corsojava.entity.Contact;

/**
 * Repository Panache: eredita le operazioni CRUD di base.
 */
@ApplicationScoped
public class ContactRepository implements PanacheRepository<Contact> {

    public List<Contact> findByCognome(String cognome) {
        return list("lower(cognome) like lower(?1)", "%" + cognome + "%");
    }

    public Contact findByEmail(String email) {
        return find("email", email).firstResult();
    }
}
