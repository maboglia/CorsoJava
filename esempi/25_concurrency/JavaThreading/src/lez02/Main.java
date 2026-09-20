package lez02;

import java.util.Scanner;


/*
 * ============================================================
 * THREAD CON L'INTERFACCIA RUNNABLE
 * ============================================================
 *
 * Il multithreading (o threading) permette a un programma
 * di eseguire più attività in modo concorrente.
 *
 * Può essere particolarmente utile per attività che richiedono
 * tempo, ad esempio:
 *
 * - operazioni di input/output (File I/O)
 * - comunicazioni di rete
 * - elaborazioni in background
 * - operazioni che potrebbero bloccare il programma principale
 *
 *
 * Esistono principalmente due approcci per creare un thread:
 *
 * 1. estendere la classe Thread
 *
 *        class MyThread extends Thread
 *
 * 2. implementare l'interfaccia Runnable
 *
 *        class MyRunnable implements Runnable
 *
 * L'approccio con Runnable è generalmente più flessibile.
 *
 */

public class Main {


    public static void main(String[] args) {


        /*
         * ====================================================
         * SCANNER
         * ====================================================
         *
         * Creiamo uno Scanner per leggere l'input
         * dell'utente dalla console.
         *
         * System.in rappresenta lo standard input,
         * normalmente la tastiera.
         */
        Scanner scanner = new Scanner(System.in);


        /*
         * ====================================================
         * CREAZIONE DEL TASK
         * ====================================================
         *
         * Creiamo un oggetto MyRunnable.
         *
         * MyRunnable NON è un Thread.
         *
         * È un oggetto che contiene il codice che vogliamo
         * eseguire all'interno di un thread.
         *
         * La classe MyRunnable implementa infatti
         * l'interfaccia Runnable.
         */
        MyRunnable myRunnable = new MyRunnable();


        /*
         * ====================================================
         * CREAZIONE DEL THREAD
         * ====================================================
         *
         * Creiamo un oggetto Thread passando al costruttore
         * il nostro oggetto Runnable.
         *
         * In questo modo separiamo:
         *
         *     COSA FARE
         *     MyRunnable
         *
         * da:
         *
         *     CHI LO ESEGUE
         *     Thread
         *
         * Il metodo run() di MyRunnable verrà eseguito
         * dal thread quando verrà chiamato start().
         */
        Thread thread = new Thread(myRunnable);


        /*
         * ====================================================
         * DAEMON THREAD
         * ====================================================
         *
         * Impostiamo il thread come daemon.
         *
         * Un daemon thread esegue attività in background
         * e non impedisce alla JVM di terminare.
         *
         * ATTENZIONE:
         *
         * setDaemon(true) deve essere chiamato PRIMA
         * di start().
         *
         * Se il thread fosse già stato avviato,
         * questa istruzione genererebbe un'eccezione.
         */
        thread.setDaemon(true);


        /*
         * ====================================================
         * AVVIO DEL THREAD
         * ====================================================
         *
         * start() avvia il nuovo thread.
         *
         * La JVM creerà un nuovo flusso di esecuzione
         * e chiamerà il metodo run() dell'oggetto Runnable.
         *
         * Da questo momento abbiamo almeno due flussi
         * di esecuzione concorrenti:
         *
         *     1. thread "main"
         *     2. thread appena creato
         *
         * IMPORTANTE:
         *
         * Non dobbiamo chiamare direttamente:
         *
         *     thread.run();
         *
         * perché in quel caso run() sarebbe eseguito
         * dal thread corrente.
         */
        thread.start();


        /*
         * ====================================================
         * THREAD MAIN
         * ====================================================
         *
         * Il thread main continua la propria esecuzione
         * indipendentemente dal nuovo thread.
         *
         * Mentre il thread creato sopra esegue il codice
         * contenuto in MyRunnable, il thread main può
         * continuare con le proprie istruzioni.
         */
        System.out.println(
            "You have 10 seconds to enter your name"
        );


        /*
         * Chiediamo all'utente di inserire il proprio nome.
         */
        System.out.print("Enter your name: ");


        /*
         * ====================================================
         * INPUT DA TASTIERA
         * ====================================================
         *
         * nextLine() è un'operazione bloccante:
         *
         * il thread main rimane in attesa finché l'utente
         * non inserisce una riga e preme INVIO.
         *
         * Nel frattempo il thread daemon può continuare
         * la propria esecuzione in background.
         */
        String name = scanner.nextLine();


        /*
         * Il thread main riprende l'esecuzione dopo che
         * l'utente ha inserito il nome.
         */
        System.out.println("Hello " + name);


        /*
         * ====================================================
         * CHIUSURA DELLO SCANNER
         * ====================================================
         *
         * Chiudiamo lo Scanner perché non è più necessario.
         *
         * Questo libera la risorsa associata allo standard input.
         */
        scanner.close();

    }

}
