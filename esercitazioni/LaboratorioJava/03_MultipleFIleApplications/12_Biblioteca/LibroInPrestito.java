class LibroInPrestito {
    Autore autore = null;
    Libro libro = null;
    LibroInPrestito() {
    }
    public boolean equals(Object node) {
        return libro.titolo.equals(((LibroInPrestito) node).libro.titolo) &&
               autore.nome.equals(((LibroInPrestito) node).autore.nome);
    }
    public String toString() {
        return "    * " + autore.nome + ", " + libro.titolo + "\n";
    }
}