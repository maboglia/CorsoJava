package lez02;


/*
 * ============================================================
 * MYRUNNABLE
 * ============================================================
 *
 * Implementiamo l'interfaccia Runnable per definire
 * un'attività che potrà essere eseguita da un Thread.
 *
 * Runnable rappresenta il "lavoro" da eseguire.
 *
 * La classe Thread, invece, rappresenta il flusso di esecuzione
 * che eseguirà quel lavoro.
 *
 */

public class MyRunnable implements Runnable {


    /*
     * ========================================================
     * RUN()
     * ========================================================
     *
     * Il metodo run() contiene il codice che verrà eseguito
     * dal thread.
     *
     * Il metodo viene chiamato automaticamente dalla JVM
     * quando viene utilizzato:
     *
     *     thread.start();
     *
     * NON dobbiamo chiamare direttamente run() per avviare
     * un nuovo thread.
     *
     */
    @Override
    public void run() {


        /*
         * ====================================================
         * CONTO ALLA ROVESCIA
         * ====================================================
         *
         * Eseguiamo un ciclo da 1 a 10.
         *
         * Ogni iterazione rappresenta un secondo.
         */
        for (int i = 1; i <= 10; i++) {


            /*
             * =================================================
             * SLEEP
             * =================================================
             *
             * sleep(1000) sospende temporaneamente il thread
             * corrente per 1000 millisecondi, cioè circa 1 secondo.
             *
             * IMPORTANTE:
             *
             * sleep() NON sospende tutti i thread della JVM.
             *
             * Sospende solamente il thread che sta eseguendo
             * questa istruzione.
             *
             * In questo esempio viene quindi sospeso il thread
             * che sta eseguendo MyRunnable.
             *
             */
            try {

                Thread.sleep(1000);

            }


            /*
             * =================================================
             * INTERRUPTED EXCEPTION
             * =================================================
             *
             * Un thread che sta eseguendo sleep() può essere
             * interrotto da un altro thread.
             *
             * In questo caso sleep() genera una
             * InterruptedException.
             *
             * Per questo motivo la chiamata a sleep() deve essere
             * inserita in un blocco try/catch oppure gestita
             * dichiarando l'eccezione.
             *
             */
            catch (InterruptedException e) {

                /*
                 * Informiamo l'utente che il thread è stato
                 * interrotto durante la sua esecuzione.
                 */
                System.out.println("Thread was interrupted");

            }


            /*
             * =================================================
             * FINE DEL CONTO ALLA ROVESCIA
             * =================================================
             *
             * Quando arriviamo alla decima iterazione,
             * sono trascorsi circa 10 secondi.
             */
            if (i == 10) {


                /*
                 * Visualizziamo il messaggio finale.
                 */
                System.out.println("Time's up!");


                

            }

        }

    }

}
