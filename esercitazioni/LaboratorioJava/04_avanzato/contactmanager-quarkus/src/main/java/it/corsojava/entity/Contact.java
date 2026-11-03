package it.corsojava.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Entity JPA che rappresenta un contatto della rubrica.
 *
 * In questo esempio didattico i campi sono public:
 * Panache supporta questo stile e semplifica l'accesso ai dati.
 */
@Entity
@Table(name = "contacts")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(nullable = false, length = 80)
    public String nome;

    @Column(nullable = false, length = 80)
    public String cognome;

    @Column(nullable = false, unique = true, length = 150)
    public String email;

    @Column(length = 30)
    public String telefono;

    @Column(length = 120)
    public String azienda;

    @Column(nullable = false)
    public Boolean attivo = true;

    // Costruttore vuoto richiesto da JPA.
    public Contact() {
    }
}
