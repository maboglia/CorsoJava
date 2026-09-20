package lez01;

/*
 * ============================================================
 * MYTHREAD
 * ============================================================
 *
 * Per creare un nuovo tipo di thread possiamo estendere
 * la classe Thread.
 *
 * La classe Thread appartiene al package:
 *
 *     java.lang
 *
 * quindi non è necessario importarla esplicitamente.
 *
 */

public class MyThread extends Thread {


    /*
     * ========================================================
     * RUN()
     * ========================================================
     *
     * Il metodo run() contiene il codice che verrà eseguito
     * dal nuovo thread.
     *
     * La classe Thread definisce già un metodo run().
     *
     * Noi lo sovrascriviamo (@Override) per definire
     * il comportamento specifico del nostro thread.
     *
     * ATTENZIONE:
     *
     *     thread.start();
     *
     * avvia un nuovo thread e, successivamente, la JVM
     * esegue il metodo run().
     *
     * Mentre:
     *
     *     thread.run();
     *
     * è una normale chiamata di metodo e NON crea un nuovo
     * thread di esecuzione.
     *
     */
    @Override
    public void run() {


        /*
         * ====================================================
         * VERIFICA DEL TIPO DI THREAD
         * ====================================================
         *
         * isDaemon()
         *
         * Restituisce:
         *
         *     true  -> se il thread è un daemon thread
         *     false -> se il thread è un user thread
         *
         * Il valore dipende da come il thread è stato configurato
         * prima di essere avviato.
         *
         * Esempio:
         *
         *     thread2.setDaemon(true);
         *
         * trasforma thread2 in un daemon thread.
         *
         * IMPORTANTE:
         * setDaemon(true) deve essere chiamato PRIMA di start().
         *
         */
        if (this.isDaemon()) {


            /*
             * Questo messaggio viene visualizzato se il thread
             * è stato configurato come daemon.
             */
            System.out.println(
                "This is a daemon thread that is running"
            );

        }

        else {


            /*
             * Questo messaggio viene visualizzato se il thread
             * è un normale user thread (non-daemon).
             *
             * Un user thread contribuisce a mantenere in vita
             * la JVM.
             *
             * Quando non rimangono più user thread in esecuzione,
             * la JVM può terminare.
             */
            System.out.println(
                "This is a user thread that is running"
            );
        }
    }
}
