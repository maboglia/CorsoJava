class Autore {
    String nome;
    ListaLibri libri = new ListaLibri();
    Autore() {
    }
    public boolean equals(Object node) {
        return nome.equals(((Autore) node).nome);
    }
    void visualizza() {
        System.out.println(nome);
        libri.visualizza();
    }
}