import java.util.LinkedList;

class ListaLibri extends LinkedList {
    ListaLibri() {
        super();
    }
    void visualizza() {
        for (int i = 0; i < size(); i++)
            System.out.print(get(i).toString());
    }
}