# Registro Esami

Realizzate un programma chiamato "Registro Esami" che permetta agli utenti di accedere a diverse funzionalità attraverso un menu interattivo.

### Funzionalità del programma

1. **Inserisci studente**
   - Questa opzione consente di inserire un nuovo studente nel registro. L'utente deve fornire nome e cognome separati da spazio, mentre la matricola viene generata automaticamente dal programma.

2. **Aggiungi esame a carriera studente**
   - Consente di aggiungere un esame alla carriera di uno studente. L'utente deve fornire nome, cognome, materia e voto separati da virgola. L'esame verrà memorizzato nel registro con la data odierna. Se lo studente non esiste, verrà segnalato un errore.

3. **Visualizza media voti globale**
   - Mostra la media dei voti di tutti gli studenti nel registro.

4. **Visualizza tutti i dati inseriti**
   - Visualizza tutti i dati inseriti nel registro, inclusi gli esami di ciascuno studente. I commenti non vengono mostrati.

5. **Aggiungi commento a esame**
   - Permette di aggiungere un commento a un esame. L'utente deve fornire la matricola dello studente, la materia dell'esame e il commento da aggiungere.

6. **Visualizza media voti studente**
   - Mostra la media dei voti di uno studente specifico. L'utente deve fornire la matricola dello studente.

7. **Visualizza media voti periodo**
   - Mostra la media dei voti di tutti gli esami sostenuti durante un periodo specificato dall'utente.

8. **Visualizza media voti studente periodo**
   - Mostra la media dei voti di uno studente specifico durante un periodo specificato dall'utente.

9. **Visualizza dati studente**
   - Visualizza tutti i dati relativi a uno studente specificato dall'utente, inclusi i suoi esami.

10. **Visualizza commenti esame**
    - Visualizza i commenti registrati per un esame specificato dall'utente.

11. **Esci**
    - Chiude il programma.

Il programma deve essere in grado di gestire studenti, esami e commenti, consentendo agli utenti di effettuare varie operazioni in modo semplice ed efficiente.

## Esempio soluzione

```java
import java.util.*;

class Studente {
    private String nome;
    private String cognome;
    private String matricola;

    public Studente(String nome, String cognome, String matricola) {
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
    }

    public String getMatricola() {
        return matricola;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Cognome: " + cognome + ", Matricola: " + matricola;
    }
}

class Esame {
    private String materia;
    private int voto;
    private Date data;
    private List<String> commenti;

    public Esame(String materia, int voto) {
        this.materia = materia;
        this.voto = voto;
        this.data = new Date();
        this.commenti = new ArrayList<>();
    }

    public void aggiungiCommento(String commento) {
        commenti.add(commento);
    }

    @Override
    public String toString() {
        return "Materia: " + materia + ", Voto: " + voto + ", Data: " + data + ", Commenti: " + commenti;
    }
}

class RegistroEsami {
    private Map<String, Studente> studenti;
    private Map<String, List<Esame>> esami;

    public RegistroEsami() {
        studenti = new HashMap<>();
        esami = new HashMap<>();
    }

    public void inserisciStudente(String nome, String cognome) {
        String matricola = "M" + UUID.randomUUID().toString().substring(0, 6).toUpperCase();
        Studente studente = new Studente(nome, cognome, matricola);
        studenti.put(matricola, studente);
        esami.put(matricola, new ArrayList<>());
    }

    public void aggiungiEsame(String matricola, String materia, int voto) {
        if (studenti.containsKey(matricola)) {
            Esame esame = new Esame(materia, voto);
            esami.get(matricola).add(esame);
        } else {
            System.out.println("Errore: Studente non trovato.");
        }
    }

    public void aggiungiCommentoEsame(String matricola, String materia, String commento) {
        List<Esame> listaEsami = esami.get(matricola);
        if (listaEsami != null) {
            for (Esame esame : listaEsami) {
                if (esame.getMateria().equals(materia)) {
                    esame.aggiungiCommento(commento);
                    return;
                }
            }
        }
        System.out.println("Errore: Esame non trovato.");
    }

    public void visualizzaMediaVotiGlobale() {
        // Implementazione della media voti globale
    }

    public void visualizzaTuttiIDatiInseriti() {
        // Implementazione visualizzazione tutti i dati inseriti
    }

    public void visualizzaMediaVotiStudente(String matricola) {
        // Implementazione visualizzazione media voti studente
    }

    public void visualizzaMediaVotiPeriodo(Date dataInizio, Date dataFine) {
        // Implementazione visualizzazione media voti periodo
    }

    public void visualizzaMediaVotiStudentePeriodo(String matricola, Date dataInizio, Date dataFine) {
        // Implementazione visualizzazione media voti studente periodo
    }

    public void visualizzaDatiStudente(String matricola) {
        // Implementazione visualizzazione dati studente
    }

    public void visualizzaCommentiEsame(String matricola, String materia) {
        // Implementazione visualizzazione commenti esame
    }
}

public class Main {
    public static void main(String[] args) {
        // Implementazione del menu e chiamate ai metodi del RegistroEsami
    }
}
```
