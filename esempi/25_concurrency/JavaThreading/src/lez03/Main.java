package lez03;


/*
 * ============================================================
 * MULTITHREADING E JOIN()
 * ============================================================
 *
 * Il multithreading permette a un programma di eseguire
 * più thread in modo concorrente.
 *
 * Un thread è un flusso di esecuzione indipendente:
 * contiene una sequenza di istruzioni che può essere eseguita
 * contemporaneamente rispetto ad altri thread.
 *
 * Il multithreading è particolarmente utile per:
 *
 * - attività eseguite in background;
 * - operazioni che richiedono tempo;
 * - operazioni di input/output;
 * - comunicazioni di rete;
 * - attività che possono essere eseguite contemporaneamente.
 *
 */

public class Main {


    public static void main(String[] args) {


        /*
         * ====================================================
         * CREAZIONE DEL PRIMO THREAD
         * ====================================================
         *
         * Creiamo un oggetto Thread passando al costruttore
         * un oggetto MyRunnable.
         *
         * MyRunnable riceve la stringa "DIN".
         *
         * Il thread sarà quindi responsabile dell'esecuzione
         * del task associato a "DIN".
         */
        Thread thread1 = new Thread(
            new MyRunnable("DIN")
        );


        /*
         * ====================================================
         * CREAZIONE DEL SECONDO THREAD
         * ====================================================
         *
         * Creiamo un secondo thread che eseguirà
         * un'altra istanza di MyRunnable.
         *
         * Questa volta passiamo "DON".
         *
         * Abbiamo quindi due thread distinti:
         *
         *     thread1 -> DIN
         *     thread2 -> DON
         */
        Thread thread2 = new Thread(
            new MyRunnable("DON")
        );


        /*
         * Il thread main visualizza il messaggio iniziale
         * della simulazione.
         */
        System.out.println("GAME START!");


        /*
         * ====================================================
         * AVVIO DEI THREAD
         * ====================================================
         *
         * start() avvia un nuovo flusso di esecuzione.
         *
         * Dopo queste due istruzioni abbiamo tre flussi
         * di esecuzione:
         *
         *     1. main
         *     2. thread1 -> DIN
         *     3. thread2 -> DON
         *
         * I due thread possono essere eseguiti
         * concorrentemente.
         *
         * L'ordine esatto con cui verranno eseguite
         * le istruzioni di thread1 e thread2 NON è garantito.
         */
        thread1.start();

        thread2.start();


        /*
         * ====================================================
         * JOIN()
         * ====================================================
         *
         * join() permette al thread corrente di aspettare
         * la terminazione di un altro thread.
         *
         * In questo caso il thread corrente è "main".
         *
         * Quindi:
         *
         *     thread1.join();
         *
         * significa:
         *
         * "Il thread main aspetta che thread1 termini".
         *
         * Successivamente:
         *
         *     thread2.join();
         *
         * significa:
         *
         * "Il thread main aspetta che thread2 termini".
         *
         * Solo dopo che entrambi i thread sono terminati,
         * il main può continuare ed eseguire:
         *
         *     System.out.println("GAME OVER!");
         */
        try {

            thread1.join();

            thread2.join();

        }


        /*
         * ====================================================
         * INTERRUPTED EXCEPTION
         * ====================================================
         *
         * join() può essere interrotto mentre il thread corrente
         * sta aspettando.
         *
         * In questo caso viene generata una
         * InterruptedException.
         *
         * Gestiamo quindi l'eccezione con try/catch.
         */
        catch (InterruptedException e) {

            System.out.println(
                "Main thread was interrupted"
            );

        }


        /*
         * ====================================================
         * FINE DEL PROGRAMMA
         * ====================================================
         *
         * Questo messaggio viene visualizzato dopo che il main
         * ha terminato di aspettare i thread con join().
         *
         * Possiamo quindi essere sicuri che thread1 e thread2
         * hanno terminato la propria esecuzione.
         */
        System.out.println("GAME OVER!");

    }

}
