# Tabella Serie TV

Ecco un esempio di schema per una tabella MySQL che potrebbe essere utilizzata per memorizzare informazioni sulle serie TV. In questa tabella, includeremo informazioni come l'ID della serie, il titolo, la trama, il genere e la valutazione.

```sql
CREATE TABLE serie_tv (
    id INT PRIMARY KEY AUTO_INCREMENT,
    titolo VARCHAR(255) NOT NULL,
    trama TEXT,
    genere VARCHAR(50),
    valutazione DECIMAL(3,1)
);
```

- `id`: Identificatore univoco per ogni serie TV (chiave primaria).
- `titolo`: Il titolo della serie TV (non può essere nullo).
- `trama`: Una descrizione più lunga o la trama della serie TV (campo di tipo testo per contenuti più estesi).
- `genere`: Il genere della serie TV (può essere una stringa breve come "Drammatico", "Commedia", ecc.).
- `valutazione`: La valutazione della serie TV, ad esempio su una scala da 0 a 10.

Ecco un esempio di come potresti inserire alcuni dati nella tabella:

```sql
INSERT INTO serie_tv (titolo, trama, genere, valutazione) VALUES
    ('Breaking Bad', 'Un insegnante di chimica diventa un produttore di metanfetamine per garantire il futuro finanziario della sua famiglia.', 'Drammatico', 9.5),
    ('Stranger Things', 'Un gruppo di ragazzi affronta eventi soprannaturali nella piccola città di Hawkins.', 'Fantascienza', 8.8),
    ('The Crown', 'La vita della Regina Elisabetta II e gli eventi storici che hanno caratterizzato il suo regno.', 'Drammatico', 8.7),
    ('Friends', 'Un gruppo di amici vive avventure e situazioni comiche nella città di New York.', 'Commedia', 8.9),
    ('Game of Thrones', 'Intrighi e lotte per il potere nel continente di Westeros.', 'Fantasy', 9.3),
    ('The Mandalorian', 'Un cacciatore di taglie in un lontano angolo della galassia in un periodo post-Impero.', 'Fantascienza', 8.7),
    ('Black Mirror', 'Episodi indipendenti che esplorano il lato oscuro della tecnologia e della società.', 'Drammatico', 8.8),
    ('The Witcher', 'Le avventure del cacciatore di mostri Geralt di Rivia, della strega Yennefer e della principessa Ciri.', 'Fantasy', 8.6);
```



