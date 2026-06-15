# La gestione dei file con Java

La gestione dei file in Java è affidata principalmente al package `java.nio.file`, introdotto a partire da Java 7. Questo package fornisce un insieme di classi e interfacce per lavorare con file e directory in modo più flessibile e potente rispetto alle funzionalità offerte dalle vecchie classi come `File` nel package `java.io`.

Ecco alcune delle classi principali e operazioni comuni per la gestione dei file in Java:

---

### 1. **Classe `Path`:**
   La classe `Path` rappresenta un percorso del file o della directory. Può essere ottenuta utilizzando il metodo `Paths.get()`.

   ```java
   Path percorso = Paths.get("path/del/file.txt");
   ```

---

### 2. **Lettura e Scrittura di File:**
   - **Lettura con `Files.readAllLines()`:**
     ```java
     List<String> linee = Files.readAllLines(percorso);
     ```

   - **Scrittura con `Files.write()`:**
     ```java
     List<String> linee = Arrays.asList("Linea 1", "Linea 2", "Linea 3");
     Files.write(percorso, linee, StandardCharsets.UTF_8);
     ```

---

### 3. **Creazione e Eliminazione di File e Directory:**
   - **Creazione di File con `Files.createFile()`:**
     ```java
     Path nuovoFile = Paths.get("nuovofile.txt");
     Files.createFile(nuovoFile);
     ```

   - **Creazione di Directory con `Files.createDirectory()`:**
     ```java
     Path nuovaDirectory = Paths.get("nuovadirectory");
     Files.createDirectory(nuovaDirectory);
     ```

   - **Eliminazione di File o Directory con `Files.delete()`:**
     ```java
     Files.delete(percorso);
     ```

---

### 4. **Copiare e Spostare File:**
   - **Copia di File con `Files.copy()`:**
     ```java
     Path destinazione = Paths.get("copiafile.txt");
     Files.copy(percorso, destinazione, StandardCopyOption.REPLACE_EXISTING);
     ```

   - **Spostamento di File con `Files.move()`:**
     ```java
     Path destinazione = Paths.get("nuova/posizione/file.txt");
     Files.move(percorso, destinazione, StandardCopyOption.REPLACE_EXISTING);
     ```

---

### 5. **Verifica dell'Esistenza e dei Dettagli del File:**
   - **Verifica dell'Esistenza con `Files.exists()`:**
     ```java
     boolean esiste = Files.exists(percorso);
     ```

   - **Recupero dei Dettagli con `Files.isDirectory()` e `Files.isRegularFile()`:**
     ```java
     boolean isDirectory = Files.isDirectory(percorso);
     boolean isFile = Files.isRegularFile(percorso);
     ```

---

### 6. **Recupero dell'Informazione sui File:**
   - **Recupero delle Informazioni con `Files.size()`:**
     ```java
     long dimensione = Files.size(percorso);
     ```

   - **Recupero della Data di Ultima Modifica con `Files.getLastModifiedTime()`:**
     ```java
     FileTime dataModifica = Files.getLastModifiedTime(percorso);
     ```

---

### 7. **Operazioni su Directory:**
   - **Elenco dei File in una Directory con `Files.list()`:**
     ```java
     try (Stream<Path> elencoFiles = Files.list(directory)) {
         elencoFiles.forEach(System.out::println);
     } catch (IOException e) {
         e.printStackTrace();
     }
     ```

---

### 8. **Gestione di Percorsi Relativi e Assoluti:**
   - **Ottenere il Percorso Assoluto con `toAbsolutePath()`:**
     ```java
     Path percorsoAssoluto = percorso.toAbsolutePath();
     ```

   - **Ottenere un Percorso Relativo con `relativize()`:**
     ```java
     Path percorsoRelativo = percorsoAssoluto.relativize(percorso);
     ```

Questi sono solo alcuni esempi delle operazioni comuni di gestione dei file in Java. L'utilizzo di `java.nio.file` offre molte più funzionalità, come la gestione delle operazioni atomiche, la gestione dei link simbolici e altro ancora. La gestione dei file in Java è diventata più potente e flessibile grazie a queste nuove funzionalità introdotte.