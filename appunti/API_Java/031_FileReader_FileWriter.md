# FileReader e FileWriter

* `FileReader` estende `InputStreamReader`
* `FileWriter` estende `OutputStreamWriter`

C'è somiglianza tra FileReader e FileInputStream, e tra FileWriter e FileOutputStream;
FileReader e FileWriter sono consigliati quando si ha a che fare con del testo, mentre gli stream di tipo classico gestiscono meglio le informazioni binarie.

## FileReader definisce i costruttori

* FileReader(File f)
* FileReader(String pathname)

## FileWriter definisce i costruttori

* FileWriter(File f)
* FileWriter(File f, boolean append)
* FileWriter(String pathname)
* FileWriter(String pathname, boolean append)
