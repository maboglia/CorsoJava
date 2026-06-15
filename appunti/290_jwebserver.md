# 🌐 Simple Web Server (`jwebserver`)

## 🔹 Cos’è

* È un **server HTTP statico** minimale, incluso nella **JDK** a partire da **Java 18**.
* Pensato per lo **sviluppo, il debug e i test locali**, non per la produzione.
* Permette di servire file statici (HTML, CSS, JS, immagini, ecc.) in pochi secondi, senza configurazioni complesse.

---

## 🔹 Come si avvia

Basta il comando:

```bash
jwebserver
```

🔧 Per default:

* Porta: `8000`
* Directory servita: la directory corrente (`.`)
* Protocollo: HTTP 1.1

📌 Dopo l’avvio, puoi aprire `http://localhost:8000` nel browser.

---

## 🔹 Opzioni principali

```bash
jwebserver [opzioni]
```

| Opzione          | Significato                                                    |       |                                  |
| ---------------- | -------------------------------------------------------------- | ----- | -------------------------------- |
| `-p <porta>`     | Specifica la porta (default: 8000)                             |       |                                  |
| `-b <indirizzo>` | Interfaccia di binding (es. `0.0.0.0` per tutte le interfacce) |       |                                  |
| `-d <directory>` | Directory root dei file statici                                |       |                                  |
| \`-o verbose     | info                                                           | off\` | Livello di log (default: `info`) |
| `-h`             | Mostra l’help                                                  |       |                                  |

---

## 🔹 Esempi pratici

### 1. Servire la cartella corrente sulla porta 8080

```bash
jwebserver -p 8080
```

### 2. Servire una cartella specifica

```bash
jwebserver -d /home/user/sito -p 9000
```

### 3. Avviare senza log

```bash
jwebserver -o off
```

---

## 🔹 Funzionalità

* Serve solo file statici (no JSP, no Servlet, no API REST).
* Rispetta i MIME type di base (`.html`, `.css`, `.js`, `.png`, ecc.).
* Supporta la **directory listing** (se non c’è un `index.html`, mostra il contenuto della cartella).
* Semplice da integrare in pipeline di test o esercitazioni didattiche.

---

## 🔹 Quando usarlo

✅ Utile per:

* Far vedere velocemente un prototipo web.
* Fare esercitazioni di front-end in classe senza configurare Tomcat o altri server.
* Testare contenuti statici (HTML/CSS/JS).
* Condividere file statici in rete locale.

❌ Non adatto a:

* Produzione.
* Applicazioni dinamiche (servlet, JSP, framework web).

---

## 🔹 Demo in classe

1. Creare una cartella `public/` con dentro `index.html` e `style.css`.
2. Lanciare:

   ```bash
   jwebserver -d public -p 8080
   ```

3. Aprire `http://localhost:8080` → gli studenti vedono subito il sito.

