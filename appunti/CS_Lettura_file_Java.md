# La lettura dei file in Java

La lettura dei file in Java coinvolge l'utilizzo di classi fornite dal package `java.nio.file` e `java.io`. Ecco una breve panoramica su come leggere i file in Java utilizzando diverse approccio.

---

### 1. Lettura di un File Testuale con `BufferedReader`:

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample {
    public static void main(String[] args) {
        String filePath = "path/to/your/file.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

---

### 2. Lettura di un File Binario con `FileInputStream` e `BufferedInputStream`:

```java
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadBinaryFileExample {
    public static void main(String[] args) {
        String filePath = "path/to/your/binary/file.bin";

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath))) {
            int data;
            while ((data = bis.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

---

### 3. Lettura di un File con `Files` (Java 7 e successivi):

```java
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;

public class ReadFileUsingFilesExample {
    public static void main(String[] args) {
        String filePath = "path/to/your/file.txt";
        Path path = Paths.get(filePath);

        try {
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

---

### 4. Lettura di un File con `Scanner`:

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileWithScannerExample {
    public static void main(String[] args) {
        String filePath = "path/to/your/file.txt";

        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
```

---

### 5. Lettura di un File con `Files.lines()` (Java 8 e successivi):

```java
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFileLinesExample {
    public static void main(String[] args) {
        String filePath = "path/to/your/file.txt";
        Path path = Paths.get(filePath);

        try {
            Files.lines(path).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

Ricorda sempre di gestire le eccezioni durante la lettura dei file e di chiudere correttamente le risorse utilizzando le istruzioni `try-with-resources` o chiudendo manualmente le risorse nei blocchi `finally`. Inoltre, assicurati di specificare il percorso corretto del file nel tuo sistema.