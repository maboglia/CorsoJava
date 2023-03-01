class Persona {
    String nome;
    ListaLibri libri = new ListaLibri();
    Persona() {
    }
    public boolean equals(Object node) {
        return nome.equals(((Persona) node).nome);
    }
    void visualizza() {
        if (!libri.isEmpty()) {
             System.out.println(nome + " ha i seguenti libri:");
             libri.visualizza();
        }
        else System.out.println(nome + " non ha libri");
    }
}