# Runtime


* Questa classe astrae il concetto di `runtime` (esecuzione) del programma. Non ha costruttori pubblici e una sua istanza si ottiene chiamando il metodo factory `getRuntime()`.
* Caratteristica interessante di questa classe è permette di eseguire comandi del sistema operativo direttamente da Java, come ad esempio `exec` (di cui esistono più versioni).
* Bisogna tener conto che l’uso della classe Runtime potrebbe **compromettere la portabilità** delle applicazioni, infatti questa classe dipende fortemente dal sistema operativo.

---

## Classe Runtime

Puoi eseguire un comando di sistema, per esempio

* `Runtime.getRuntime().exec("<command>")` 
* `Runtime.getRuntime().exec("tree")` 

Funziona solo per i comandi compresi nel path di ambiente, non funziona con comandi come echo, del, ... 

Per eseguire questi comandi usa `cmd /c` prima del comando. Per esempio
* `Runtime.getRuntime().exec("cmd /c echo echo")`


```java
public static void main(String[] args) {
    String command="netstat";
    try {
        Process process = Runtime.getRuntime().exec(command);
        System.out.println("output stream: "+process.getOutputStream());
        BufferedReader reader=new BufferedReader( new InputStreamReader(process.getInputStream()));
        String s; 
        while ((s = reader.readLine()) != null){
            System.out.println("input stream: " + s);
        }                   
    } catch (IOException e) {
        e.printStackTrace();
    }
}
```