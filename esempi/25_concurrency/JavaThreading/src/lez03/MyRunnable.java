package lez03;


/*
 * ============================================================
 * MYRUNNABLE
 * ============================================================
 *
 * Questa classe rappresenta il TASK che verrà eseguito
 * dai thread.
 *
 * Implementiamo Runnable invece di estendere Thread.
 *
 * In questo modo separiamo:
 *
 *     - il lavoro da eseguire -> MyRunnable
 *     - il thread che esegue il lavoro -> Thread
 *
 * Nel nostro esempio utilizziamo la stessa classe
 * MyRunnable per creare due attività differenti:
 *
 *     new MyRunnable("PING")
 *     new MyRunnable("PONG")
 *
 */

public class MyRunnable implements Runnable {


    /*
     * ========================================================
     * CAMPO text
     * ========================================================
     *
     * Contiene il testo che il thread dovrà stampare.
     *
     * private:
     *     il campo è accessibile solamente all'interno
     *     della classe MyRunnable.
     *
     * final:
     *     il riferimento non può essere modificato dopo
     *     essere stato inizializzato.
     *
     * In pratica, una volta creato l'oggetto:
     *
     *     MyRunnable("PING")
     *
     * il suo text rimarrà "PING".
     *
     */
    private final String text;


    /*
     * ========================================================
     * COSTRUTTORE
     * ========================================================
     *
     * Il costruttore riceve il testo che vogliamo associare
     * a questa particolare istanza di MyRunnable.
     *
     * Esempio:
     *
     *     new MyRunnable("PING")
     *
     * significa che:
     *
     *     this.text = "PING";
     *
     * Mentre:
     *
     *     new MyRunnable("PONG")
     *
     * significa:
     *
     *     this.text = "PONG";
     *
     */
    MyRunnable(String text) {

        /*
         * this.text indica il campo dell'oggetto.
         *
         * text indica invece il parametro del costruttore.
         */
        this.text = text;

    }


    /*
     * ========================================================
     * RUN()
     * ========================================================
     *
     * Il metodo run() contiene il codice che verrà eseguito
     * dal thread.
     *
     * Quando nel Main scriviamo:
     *
     *     thread.start();
     *
     * la JVM avvia il thread e successivamente esegue
     * questo metodo.
     *
     */
    @Override
    public void run() {


        /*
         * ====================================================
         * CICLO
         * ====================================================
         *
         * Ogni thread esegue il ciclo 5 volte.
         *
         * Ad ogni iterazione:
         *
         *     1. aspetta un secondo;
         *     2. stampa il proprio testo.
         *
         */
        for (int i = 1; i <= 5; i++) {


            /*
             * sleep() può generare InterruptedException,
             * quindi dobbiamo gestire l'eccezione con try/catch.
             */
            try {


                /*
                 * =================================================
                 * SLEEP
                 * =================================================
                 *
                 * Sospende il thread corrente per circa
                 * 1000 millisecondi, cioè 1 secondo.
                 *
                 * IMPORTANTE:
                 *
                 * sleep() sospende SOLO il thread corrente.
                 *
                 * Se thread1 sta eseguendo sleep(), thread2
                 * può continuare la propria esecuzione.
                 *
                 */
                Thread.sleep(1000);


                /*
                 * Dopo la pausa viene stampato il testo
                 * associato a questa istanza di MyRunnable.
                 *
                 * Se l'oggetto è stato creato con:
                 *
                 *     new MyRunnable("PING")
                 *
                 * verrà stampato:
                 *
                 *     PING
                 *
                 * Se invece è stato creato con:
                 *
                 *     new MyRunnable("PONG")
                 *
                 * verrà stampato:
                 *
                 *     PONG
                 *
                 */
                System.out.println(text);

            }


            /*
             * =================================================
             * INTERRUPTED EXCEPTION
             * =================================================
             *
             * Se il thread viene interrotto mentre è in sleep(),
             * viene generata una InterruptedException.
             *
             */
            catch (InterruptedException e) {

                /*
                 * Informiamo l'utente che il thread
                 * è stato interrotto.
                 */
                System.out.println(
                    "Thread was interrupted"
                );

            }

        }

    }

}
