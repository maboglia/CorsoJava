# Combination Lock Project (Java + Selenium)

Esercitazione didattica: applicazione web "lucchetto a 4 cifre" + test automatici Selenium.

## Moduli
- **lock-webapp** → Web app Spring Boot con interfaccia utente per indovinare il codice.
- **lock-selenium** → Test automatici Selenium + JUnit 5.

## Avvio rapido

### 1. Avviare il server
```bash
cd lock-webapp
mvn spring-boot:run
```

### 2. Eseguire i test
```bash
cd ../lock-selenium
mvn test
```

### 3. Aprire manualmente la pagina
- [http://localhost:8080/](http://localhost:8080/) (gioco normale)
- [http://localhost:8080/?test=true](http://localhost:8080/?test=true) (modalità test)

---
**Docente/Autore**: Esercitazione Java + Selenium — *“Sblocca il lucchetto”*
