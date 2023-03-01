import java.io.*;

class Biblioteca {
    static ListaAutori[] catalogo = new ListaAutori[(int)('Z'+1)];
    static ListaPersone[] gente = new ListaPersone[(int)('Z'+1)];
    static String input;
    static InputStreamReader cin = new InputStreamReader(System.in);
    static BufferedReader buffer = new BufferedReader(cin);
    static String getString(String msg) {
        System.out.print(msg + " ");
        System.out.flush();
        try {
            input = buffer.readLine();
        } catch(IOException io) {
        }
        return input.substring(0,1).toUpperCase() + input.substring(1);
    }
    static void situazione() {
        System.out.println("La libreria ha i seguenti libri:\n ");
        for (int i = (int) 'A'; i <= (int) 'Z'; i++)
            if (!catalogo[i].isEmpty())
                catalogo[i].visualizza();
        System.out.println("\nI seguenti signori sono iscritti in libreria:\n ");
        for (int i = (int) 'A'; i <= (int) 'Z'; i++)
            if (!gente[i].isEmpty())
                gente[i].visualizza();
    }
    static void inserisciLibro() {
        Autore nuovoAutore = new Autore();
        int vecchioAutore;
        Libro nuovoLibro = new Libro();
        nuovoAutore.nome = getString("Inserisci il nome dell'autore:");
        nuovoLibro.titolo  = getString("Inserisci il titolo del libro:");
        vecchioAutore = catalogo[(int) nuovoAutore.nome.charAt(0)].indexOf(nuovoAutore);
        if (vecchioAutore == -1) {
             nuovoAutore.libri.add(nuovoLibro);
             catalogo[(int) nuovoAutore.nome.charAt(0)].add(nuovoAutore);
        }
        else ((Autore)catalogo[(int) nuovoAutore.nome.charAt(0)].get(vecchioAutore)).
                libri.add(nuovoLibro);
    }
    static void libroInPrestito() {
        Persona persona = new Persona(), personaRef = new Persona();
        Autore autore = new Autore(), autoreRef = new Autore();
        Libro   libro   = new Libro(), libroRef = new Libro();
        int indicePersona, indiceLibro = -1, indiceAutore = -1;
        LibroInPrestito libroDaDareInPrestito = new LibroInPrestito();
        persona.nome = getString("Inserisci il nome della persona:");
        while (indiceAutore == -1) {
            autore.nome = getString("Inserisci il nome dell'autore:");
            indiceAutore = catalogo[(int) autore.nome.charAt(0)].indexOf(autore);
            if (indiceAutore == -1)
                System.out.println("Nome autore sbagliato");
        }
        while (indiceLibro == -1) {              
            libro.titolo = getString("Inserisci il titolo del libro:");
            autoreRef = (Autore) catalogo[(int) autore.nome.charAt(0)].get(indiceAutore);
            indiceLibro = autoreRef.libri.indexOf(libro);
            if (indiceLibro == -1)
                System.out.println("Titolo sbagliato");
        }
        libroRef = (Libro) autoreRef.libri.get(indiceLibro);
        libroDaDareInPrestito.autore = autoreRef;
        libroDaDareInPrestito.libro  = libroRef;
        indicePersona = gente[(int) persona.nome.charAt(0)].indexOf(persona);
        if (indicePersona == -1) { // Una nuova persona in biblioteca
             persona.libri.add(libroDaDareInPrestito);
             gente[(int) persona.nome.charAt(0)].add(persona);
             libroRef.persona = (Persona) gente[(int) persona.nome.charAt(0)].getFirst();
        }
        else {
             personaRef = (Persona) gente[(int) persona.nome.charAt(0)].get(indicePersona);
             personaRef.libri.add(libroDaDareInPrestito);
             libroRef.persona = personaRef;
        }
    }
    static void libroRestituito() {
        Persona persona = new Persona();
        LibroInPrestito libroInPrestito = new LibroInPrestito();
        Libro libro = new Libro();
        Autore autore = new Autore(), autoreRef = new Autore();
        int indicePersona = -1,  indiceLibro = -1, indiceAutore = -1;
        while (indicePersona == -1) {
            persona.nome = getString("Inserisci il nome della persona:");
            indicePersona = gente[(int) persona.nome.charAt(0)].indexOf(persona);
            if (indicePersona == -1)
                System.out.println("Nome persona sbagliato");
        }
        while (indiceAutore == -1) {
            autore.nome = getString("Inserisci il nome dell'autore:");
            indiceAutore = catalogo[(int) autore.nome.charAt(0)].indexOf(autore);
            if (indiceAutore == -1)
                System.out.println("Nome autore sbagliato");
        }
        while (indiceLibro == -1) {
            libro.titolo = getString("Inserisci il titolo del libro:");
            autoreRef = (Autore) catalogo[(int) autore.nome.charAt(0)].get(indiceAutore);
            indiceLibro = autoreRef.libri.indexOf(libro);
            if (indiceLibro == -1)
                System.out.println("Titolo sbagliato");
        }
        libroInPrestito.autore = autoreRef;
        libroInPrestito.libro  = (Libro) autoreRef.libri.get(indiceLibro);
        ((Libro)autoreRef.libri.get(indiceLibro)).persona = null;
        ((Persona)gente[(int) persona.nome.charAt(0)].get(indicePersona)).
                libri.remove(libroInPrestito);
    }
    static char menu() {
        return getString("\nSeleziona una delle seguenti opzioni:\n" +
              "1. Inserisci un libro nel catalogo\n" +
              "2. Dai in prestito un libro\n" +
              "3. Registra la restituzione di un libro\n4. Situazione prestiti\n5. Uscita\n" +
              "La tua scelta:").charAt(0);
    }
    public static void main(String args[]) {
        for (int i = 0; i <= (int) 'Z'; i++) {
            catalogo[i] = new ListaAutori();
            gente[i] = new ListaPersone();
        }
        while (true)
            switch (menu()) {
                case '1': inserisciLibro();  break;
                case '2': libroInPrestito(); break;
                case '3': libroRestituito();   break;
                case '4': situazione();       break;
                case '5': return;
                default: System.out.println("Scelta sbagliata, riprova.");
            }
    }
}
