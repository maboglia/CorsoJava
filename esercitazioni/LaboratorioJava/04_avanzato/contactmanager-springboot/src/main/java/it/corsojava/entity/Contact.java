package it.corsojava.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

/** Entity JPA che rappresenta un contatto della rubrica. */
@Entity
@Table(name = "contacts")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Il nome è obbligatorio")
    @Column(nullable = false, length = 80)
    private String nome;

    @NotBlank(message = "Il cognome è obbligatorio")
    @Column(nullable = false, length = 80)
    private String cognome;

    @NotBlank(message = "L'email è obbligatoria")
    @Email(message = "Indirizzo email non valido")
    @Column(nullable = false, unique = true, length = 150)
    private String email;

    @Column(length = 30)
    private String telefono;

    @Column(length = 120)
    private String azienda;

    @Column(nullable = false)
    private Boolean attivo = true;

    public Contact() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCognome() { return cognome; }
    public void setCognome(String cognome) { this.cognome = cognome; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    public String getAzienda() { return azienda; }
    public void setAzienda(String azienda) { this.azienda = azienda; }
    public Boolean getAttivo() { return attivo; }
    public void setAttivo(Boolean attivo) { this.attivo = attivo; }
}
