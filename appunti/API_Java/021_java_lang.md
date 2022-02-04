# Package java.lang
* Il package java.lang è il package più importante dell’API di Java, in quanto contiene moltissime classi e interfacce fondamentali per la programmazione Java, tanto che questo package viene importato in automatico in tutti i programmi.

Astrazioni di classe, oggetto, sistema, ...
* [Object](./021_java_lang_Object.md)
* [System](./021_java_lang_System.md)
* Package
* Class
* ClassLoader
* ClassValue

[Classi wrapper](./021_Classi_wrapper.md) e gestione tipi

* Boolean
* Byte
* Character
* Double
* Float
* Integer
* Long
* Short
* Void
* Enum

Stringhe
* [String](./007_stringhe.md) 
* [StringBuffer](./007_stringhe.md)
* [StringBuilder](./007_stringhe.md)

Matematica
* [Math](./021_java_lang_Math.md)
* StrictMath
* Number

Altre funzionalità
* Compiler
* Process
* Runtime
* SecurityManager
* StackTraceElement
* Thread
* Throwable


### Classe Runtime
* Questa classe astrae il concetto di runtime (esecuzione) del programma. Non ha costruttori pubblici e una sua istanza si ottiene chiamando il metodo factory getRuntime().
* Caratteristica interessante di questa classe è permette di eseguire comandi del sistema operativo direttamente da Java, come ad esempio exec (di cui esistono più versioni).
* Bisogna tener conto che l’uso della classe Runtime potrebbe compromettere la portabilità delle applicazioni, infatti questa classe dipende fortemente dal sistema operativo.