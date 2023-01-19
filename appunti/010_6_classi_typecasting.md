# Type Casting di Oggetti

È possibile modificare il tipo di un riferimento ad oggetto soltanto tra tipi in relazione di ereditarietà
L'oggetto rimane invariato

---

## Upcasting

* È sempre affidabile (è sempre vero che un auto elettrica è un auto)
* È automatico

### upcast su Object

Poichè ogni classe è (direttamente o indirettamente) sottoclasse di
Object è sempre possibile fare upcast di qualsiasi oggetto su Object

```java
QualcheClasse a = new QualcheClasse();
Object o;
o = a;
```

---

## Downcasting

* Non è automatico (richiede cast esplicito)
* Può non essere affidabile
  * Non tutte le auto sono autoelettriche
  * Un downcasting può provocare un errore run-time

### usare instanceof

Per evitare un errore a run time

* `instanceof (Run Time Type Identification)`

```java
Automobile a = new Automobile();
AutoElettrica ae;
if (a instanceof AutoElettrica){
ae = (AutoElettrica) a;
ae.ricarica();
}
```
