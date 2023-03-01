import java.util.LinkedList;

class ListaAutori extends LinkedList {
    ListaAutori() {
        super();
    }
    void visualizza() {
        Object[] autori = toArray();
        for (int i = 0; i < autori.length; i++)
            ((Autore)autori[i]).visualizza();
    }
}