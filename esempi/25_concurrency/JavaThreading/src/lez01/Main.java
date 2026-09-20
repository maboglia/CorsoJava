package lez01;

/*
 * ============================================================
 * THREAD IN JAVA
 * ============================================================
 *
 * Un thread è un flusso di esecuzione all'interno di un programma
 * (una sorta di "CPU virtuale").
 *
 * La JVM permette a un'applicazione di avere più thread
 * in esecuzione contemporaneamente.
 *
 * Ogni thread può eseguire parti del codice in parallelo
 * rispetto al thread principale (main).
 *
 * Ogni thread ha una priorità.
 *
 * I thread con priorità più alta vengono segnalati allo scheduler
 * come preferibili rispetto ai thread con priorità più bassa.
 *
 * La JVM continua a eseguire i thread fino a quando:
 *
 * 1. viene chiamato il metodo exit() della classe Runtime;
 * 2. tutti i thread utente (non-daemon) terminano.
 *
 * Quando la JVM viene avviata, viene creato un thread che
 * esegue il metodo main().
 *
 * Questo thread viene chiamato "main".
 *
 * Un Daemon Thread è un thread che lavora in background
 * per svolgere attività di servizio.
 *
 * Un esempio è il garbage collector della JVM.
 *
 * La JVM termina automaticamente quando tutti i thread utente
 * (non-daemon) hanno terminato la propria esecuzione.
 *
 */

public class Main {

    public static void main(String[] args) throws InterruptedException {

        /*
         * activeCount()
         *
         * Restituisce una stima del numero di thread attivi
         * nel thread group corrente.
         *
         * All'inizio del programma normalmente è presente
         * almeno il thread "main".
         */
        System.out.println(Thread.activeCount());


        /*
         * currentThread()
         *
         * Restituisce il riferimento al thread che sta eseguendo
         * il codice corrente.
         *
         * In questo caso è il thread "main".
         *
         * setName()
         *
         * Permette di assegnare un nome al thread.
         */
        Thread.currentThread().setName("MAIN");


        /*
         * getName()
         *
         * Restituisce il nome del thread.
         */
        System.out.println(Thread.currentThread().getName());


        /*
         * setPriority()
         *
         * Imposta la priorità del thread.
         *
         * La priorità può assumere valori compresi tra:
         *
         * 1  -> priorità minima
         * 5  -> priorità normale
         * 10 -> priorità massima
         *
         * ATTENZIONE:
         * la priorità NON garantisce che un thread venga eseguito
         * prima degli altri. È un'indicazione per lo scheduler.
         */
        Thread.currentThread().setPriority(10);


        /*
         * getPriority()
         *
         * Restituisce la priorità del thread corrente.
         */
        System.out.println(Thread.currentThread().getPriority());


        /*
         * isAlive()
         *
         * Restituisce true se il thread è stato avviato
         * e non ha ancora terminato la propria esecuzione.
         *
         * In questo punto il thread main è ancora in esecuzione.
         */
        // System.out.println(Thread.currentThread().isAlive());


        /*
         * Esempio di pausa del thread corrente.
         *
         * sleep(1000) sospende temporaneamente il thread
         * per circa 1000 millisecondi = 1 secondo.
         *
         * IMPORTANTE:
         * sleep() NON crea un nuovo thread.
         * Sospende semplicemente il thread che sta eseguendo
         * il codice.
         *
         * sleep() può generare InterruptedException,
         * per questo il metodo main dichiara:
         *
         * throws InterruptedException
         */
        for (int i = 3; i > 0; i--) {

            System.out.println(i);

            // Sospende il thread main per 1 secondo
            Thread.sleep(1000);
        }


        /*
         * Dopo le tre pause il thread main continua
         * la propria esecuzione.
         */
        System.out.println("You are done!");


        /*
         * CREAZIONE DI UN NUOVO THREAD
         *
         * Creiamo un oggetto della classe MyThread.
         *
         * ATTENZIONE:
         * la semplice creazione dell'oggetto NON avvia il thread.
         *
         * Il thread verrà realmente avviato solo chiamando:
         *
         * thread2.start();
         */
        MyThread thread2 = new MyThread();


        /*
         * setDaemon(true)
         *
         * Trasforma il thread in un Daemon Thread.
         *
         * Un daemon thread lavora in background e NON impedisce
         * alla JVM di terminare.
         *
         * Se tutti i thread utente terminano, la JVM termina
         * anche se esistono ancora daemon thread in esecuzione.
         */
        // thread2.setDaemon(true);


        /*
         * isDaemon()
         *
         * Restituisce true se il thread è un daemon thread,
         * false altrimenti.
         */
        // System.out.println(thread2.isDaemon());


        /*
         * START DEL THREAD
         *
         * start() avvia il nuovo thread.
         *
         * NON bisogna chiamare direttamente run().
         *
         * start() chiede alla JVM di creare un nuovo flusso
         * di esecuzione e successivamente viene eseguito
         * il metodo run().
         */
        // thread2.start();


        /*
         * isAlive()
         *
         * Verifica se il thread è attualmente in esecuzione
         * (più precisamente, se è stato avviato e non è ancora
         * terminato).
         *
         * ATTENZIONE:
         * poiché start() è commentato, in questo momento
         * il thread2 NON è ancora vivo.
         */
        System.out.println(thread2.isAlive());


        /*
         * MODIFICA DEL NOME DEL THREAD
         *
         * Ogni thread può avere un nome.
         * Il nome è particolarmente utile durante il debugging
         * e quando si lavora con molti thread contemporaneamente.
         */
        thread2.setName("2nd thread");


        /*
         * Recuperiamo il nome assegnato al thread.
         */
        System.out.println(thread2.getName());


        /*
         * È possibile assegnare una priorità anche al nuovo thread.
         *
         * 1 = priorità minima
         * 5 = priorità normale
         * 10 = priorità massima
         */
        // thread2.setPriority(1);


        /*
         * Visualizza la priorità del thread.
         */
        // System.out.println(thread2.getPriority());


        /*
         * activeCount()
         *
         * Visualizza il numero stimato di thread attivi.
         *
         * Se thread2.start() fosse stato eseguito,
         * il numero dei thread attivi potrebbe aumentare.
         */
        // System.out.println(Thread.activeCount());

    }
}

