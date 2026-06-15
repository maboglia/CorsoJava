# Le proprietà automaticamente disponibili nell'ambiente Java

Chiave|Valore
---|---
java.version|La versione di Java in uso.
java.vendor|Il produttore della versione di Java in uso.
java.vendor.url|L'URL del produttore della versione di Java in uso.
java.home|La directory di installazione di Java.
java.vm.specification.version|La versione delle specifiche della macchina virtuale in uso.
java.vm.specification.vendor|Il produttore delle specifiche della macchina virtuale in uso.
java.vm.specification.name|Il nome delle specifiche della macchina virtuale in uso.
java.vm.version|La versione della macchina virtuale in uso.
java.vm.vendor|Il produttore della macchina virtuale in uso.
java.vm.name|Il nome della macchina virtuale in uso.
java.specification.version|La versione delle specifiche di Java in uso.
java.specification.vendor|Il produttore delle specifiche di Java in uso.
java.specification.name|Il nome delle specifiche di Java in uso.
java.class.version|La versione delle classi di Java.

---

Chiave|Valore
---|---
java.class.path|Il percorso delle classi di Java.
java.library.path|Il percorso delle librerie di Java.
java.io.tmpdir|Il percorso della directory dei file temporanei.
java.ext.dirs|I percorsi delle directory che contengono le estensioni di Java.
os.name|Il nome del sistema operativo in uso.
os.arch|L'architettura del sistema operativo in uso.
os.version|La versione del sistema operativo in uso.
file.separator|La sequenza per la separazione degli elementi dei percorsi nel sistema in uso.
path.separator|La sequenza per la separazione dei percorsi nel sistema in uso.
line.separator|La sequenza impiegata dal sistema in uso per esprimere il ritorno a capo.
user.name|Il nome dell'utente che sta usando l'applicazione.
user.home|La home directory dell'utente che sta usando l'applicazione.
user.dir|L'attuale cartella di lavoro dell'utente che sta usando l'applicazione.

---

## codice `System.getProperty("java.version")`

```java
  String[] keys = {
   "java.version","java.vendor","java.vendor.url",
   "java.home","java.vm.specification.version",
   "java.vm.specification.vendor","java.vm.specification.name",
   "java.vm.version","java.vm.vendor","java.vm.name",
   "java.specification.version","java.specification.vendor",
   "java.specification.name","java.class.version",
   "java.class.path","java.library.path","java.io.tmpdir",
   "java.exist.dirs","os.name","os.arch","os.version",
   "file.separator","path.separator","line.separator",
   "user.name","user.home","user.id"
  };
  for(int i=0; i<keys.length; i++){
   System.out.println(
    "[" + keys[i] + "] " + System.getProperty(keys[i]));
  }

```
