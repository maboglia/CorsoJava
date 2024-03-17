# Esercizi Java - Metodi avanzati


## Esercizio  Calcolo del fattoriale ricorsivo

Scrivere un programma che contenga un metodo
ricorsivo per il calcolo del fattoriale.

---

## Esercizio interfacce

A partire dall'**interfaccia Animale**, che definisce
i metodi **faiVerso()** e **dimmiCiboPreferito()**,
implementare le classi **Gatto**, **Cane** e **Topo**
attraverso l'uso delle interfacce.

Ecco come potrebbe essere strutturato il codice per implementare le classi `Gatto`, `Cane` e `Topo` utilizzando un'interfaccia `Animale`:

```java
// Definizione dell'interfaccia Animale
interface Animale {
    void faiVerso();
    String dimmiCiboPreferito();
}

// Implementazione della classe Gatto che implementa l'interfaccia Animale
class Gatto implements Animale {
    @Override
    public void faiVerso() {
        System.out.println("Il gatto fa: Miaoo!");
    }

    @Override
    public String dimmiCiboPreferito() {
        return "Il gatto preferisce il pesce.";
    }
}

// Implementazione della classe Cane che implementa l'interfaccia Animale
class Cane implements Animale {
    @Override
    public void faiVerso() {
        System.out.println("Il cane fa: Bau bau!");
    }

    @Override
    public String dimmiCiboPreferito() {
        return "Il cane preferisce le ossa.";
    }
}

// Implementazione della classe Topo che implementa l'interfaccia Animale
class Topo implements Animale {
    @Override
    public void faiVerso() {
        System.out.println("Il topo fa: Squiiii!");
    }

    @Override
    public String dimmiCiboPreferito() {
        return "Il topo preferisce i semi e i cereali.";
    }
}

// Classe di prova per testare le implementazioni
public class Main {
    public static void main(String[] args) {
        // Creazione di un array di animali
        Animale[] animali = new Animale[3];
        animali[0] = new Gatto();
        animali[1] = new Cane();
        animali[2] = new Topo();

        // Iterazione sull'array e invocazione dei metodi
        for (Animale animale : animali) {
            animale.faiVerso();
            System.out.println(animale.dimmiCiboPreferito());
            System.out.println();
        }
    }
}
```

In questo esempio, l'interfaccia `Animale` definisce i metodi `faiVerso()` e `dimmiCiboPreferito()`. Le classi `Gatto`, `Cane` e `Topo` implementano questa interfaccia e forniscono le rispettive implementazioni per i metodi. Nella classe `Main`, viene creato un array di animali che include istanze di `Gatto`, `Cane` e `Topo`. Viene quindi iterato sull'array e invocati i metodi per ogni animale

---

## Esercizio classi astratte

A partire dalla **classe Animale**, che definisce i
metodi **faiVerso()**, implementare le classi **Gatto**,
**Cane** e **Topo** attraverso l'uso dell'astrazione.

Ecco come potrebbe essere strutturato il codice per implementare le classi `Gatto`, `Cane` e `Topo` utilizzando l'astrazione:

```java
// Definizione della classe astratta Animale
abstract class Animale {
    // Metodo astratto per emettere il verso dell'animale
    public abstract void faiVerso();
}

// Implementazione della classe Gatto che estende la classe astratta Animale
class Gatto extends Animale {
    @Override
    public void faiVerso() {
        System.out.println("Il gatto fa: Miaoo!");
    }
}

// Implementazione della classe Cane che estende la classe astratta Animale
class Cane extends Animale {
    @Override
    public void faiVerso() {
        System.out.println("Il cane fa: Bau bau!");
    }
}

// Implementazione della classe Topo che estende la classe astratta Animale
class Topo extends Animale {
    @Override
    public void faiVerso() {
        System.out.println("Il topo fa: Squiiii!");
    }
}

// Classe di prova per testare le implementazioni
public class Main {
    public static void main(String[] args) {
        // Creazione di un array di animali
        Animale[] animali = new Animale[3];
        animali[0] = new Gatto();
        animali[1] = new Cane();
        animali[2] = new Topo();

        // Iterazione sull'array e invocazione del metodo faiVerso() per ogni animale
        for (Animale animale : animali) {
            animale.faiVerso();
        }
    }
}
```

In questo esempio, la classe `Animale` è stata definita come astratta e contiene il metodo astratto `faiVerso()`. Le classi `Gatto`, `Cane` e `Topo` estendono la classe `Animale` e forniscono le rispettive implementazioni per il metodo `faiVerso()`. Nella classe `Main`, viene creato un array di animali che include istanze di `Gatto`, `Cane` e `Topo`, e viene invocato il metodo `faiVerso()` per ogni animale tramite iterazione sull'array
