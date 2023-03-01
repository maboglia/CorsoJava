import java.util.LinkedList;

class ListaPersone extends LinkedList {
    ListaPersone() {
        super();
    }
    void visualizza() {
        for (java.util.Iterator it = iterator(); it.hasNext(); )
             ((Persona)it.next()).visualizza();
    }
}