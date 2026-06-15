# Facade Pattern

Il **Facade Pattern** è un design pattern strutturale che fornisce un'interfaccia unificata semplice per un insieme di interfacce in un sistema. Lo scopo principale di questo pattern è quello di nascondere la complessità di un sistema fornendo un'interfaccia semplificata per l'utente.

### Componenti del Facade Pattern:

1. **Facade (Facciata):**
   - Questa è la classe che fornisce l'interfaccia semplificata per l'utente.
   - Nasconde la complessità interna del sistema e fornisce un punto di ingresso unificato.

2. **Sottosistemi:**
   - Sono le classi o sottosistemi che contengono la logica complessa.
   - Il Facade utilizza questi sottosistemi per soddisfare le richieste dell'utente.

### Esempio Pratico:

Supponiamo di avere un sistema complesso con diverse classi e sottosistemi. Invece di costringere l'utente a interagire direttamente con tutte queste classi, possiamo fornire una Facciata che semplifica l'interazione. Ad esempio, consideriamo un sistema di home theater con molte componenti come Amplificatore, Lettore DVD, Luci, Proiettore, ecc.

```java
// Interfaccia complessa
class Amplificatore {
    void accendi() { /* implementazione */ }
    void spegni() { /* implementazione */ }
    void regolaVolume(int livello) { /* implementazione */ }
    // Altre operazioni complesse...
}

// Interfaccia complessa
class LettoreDVD {
    void accendi() { /* implementazione */ }
    void spegni() { /* implementazione */ }
    void inserisciDVD() { /* implementazione */ }
    // Altre operazioni complesse...
}

// Interfaccia complessa
class Luci {
    void accendi() { /* implementazione */ }
    void spegni() { /* implementazione */ }
    void regolaIntensita(int intensita) { /* implementazione */ }
    // Altre operazioni complesse...
}

// Facciata semplificata
class HomeTheaterFacade {
    private Amplificatore amplificatore;
    private LettoreDVD lettoreDVD;
    private Luci luci;

    public HomeTheaterFacade(Amplificatore amplificatore, LettoreDVD lettoreDVD, Luci luci) {
        this.amplificatore = amplificatore;
        this.lettoreDVD = lettoreDVD;
        this.luci = luci;
    }

    // Metodi semplificati per l'utente
    public void accendi() {
        amplificatore.accendi();
        lettoreDVD.accendi();
        luci.accendi();
        // Altre operazioni...
    }

    public void spegni() {
        amplificatore.spegni();
        lettoreDVD.spegni();
        luci.spegni();
        // Altre operazioni...
    }

    public void riproduciFilm(String film) {
        amplificatore.regolaVolume(5);
        lettoreDVD.inserisciDVD();
        // Altre operazioni...
    }
}

// Utilizzo della Facciata
public class Cliente {
    public static void main(String[] args) {
        Amplificatore amp = new Amplificatore();
        LettoreDVD dvd = new LettoreDVD();
        Luci luci = new Luci();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, dvd, luci);

        // Utilizzo semplificato
        homeTheater.accendi();
        homeTheater.riproduciFilm("Interstellar");
        homeTheater.spegni();
    }
}
```

In questo esempio, la `HomeTheaterFacade` semplifica l'utilizzo del sistema home theater combinando le operazioni complesse delle varie componenti in metodi più semplici e comprensibili per l'utente. Questo riduce la complessità e migliora la manutenibilità del codice.