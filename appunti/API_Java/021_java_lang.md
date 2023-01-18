# Package java.lang

* Il package java.lang è il package più importante dell’API di Java
* contiene moltissime classi e interfacce fondamentali per la programmazione Java
* questo package viene importato in automatico in tutti i programmi

Astrazioni di classe, oggetto, sistema, ...

* [Object](https://github.com/maboglia/CorsoJava/blob/master/appunti/API_Java/021_java_lang_Object.md)
* [System](https://github.com/maboglia/CorsoJava/blob/master/appunti/API_Java/021_java_lang_System.md)
* Package
* Class
* ClassLoader
* ClassValue

---

[Classi wrapper](https://github.com/maboglia/CorsoJava/blob/master/appunti/API_Java/021_Classi_wrapper.md) e gestione tipi

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

---

Gestire le Stringhe

* [String](https://github.com/maboglia/CorsoJava/blob/master/appunti/API_Java/007_stringhe.md) 
* [StringBuffer](https://github.com/maboglia/CorsoJava/blob/master/appunti/007_stringhe.md)
* [StringBuilder](https://github.com/maboglia/CorsoJava/blob/master/appunti/007_stringhe.md)

Gestire i numeri - Math

* [Math](https://github.com/maboglia/CorsoJava/blob/master/appunti/API_Java/021_java_lang_Math.md)
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

---

## Classe Runtime

* Questa classe astrae il concetto di `runtime` (esecuzione) del programma. Non ha costruttori pubblici e una sua istanza si ottiene chiamando il metodo factory `getRuntime()`.
* Caratteristica interessante di questa classe è permette di eseguire comandi del sistema operativo direttamente da Java, come ad esempio `exec` (di cui esistono più versioni).
* Bisogna tener conto che l’uso della classe Runtime potrebbe **compromettere la portabilità** delle applicazioni, infatti questa classe dipende fortemente dal sistema operativo.