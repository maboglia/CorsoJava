class Libro {
    String titolo;
    Persona persona = null;
    Libro() {
    }
    public boolean equals(Object node) {
        return titolo.equals(((Libro) node).titolo);
    }
    public String toString() {
        return "    * " + titolo +
           (persona != null ? " - prestato a " + persona.nome : "") + "\n";
    }
}