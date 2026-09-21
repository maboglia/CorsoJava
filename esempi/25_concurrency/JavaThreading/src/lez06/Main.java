package lez06;

import java.util.List;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutionException;


/*
 * ============================================================
 * EXECUTOR COMPLETION SERVICE
 * ============================================================
 *
 * ExecutorCompletionService permette di:
 *
 * 1. inviare più Callable a un Thread Pool;
 * 2. eseguire i task in modo concorrente;
 * 3. recuperare i risultati nell'ordine in cui i task
 *    TERMINANO.
 *
 * Questo è diverso da utilizzare semplicemente una lista
 * di Future.
 *
 */

public class Main {

    public static void main(String[] args) {


        /*
         * ====================================================
         * LISTA DELLE PAGINE
         * ====================================================
         */
        List<String> pages = List.of(
            "https://www.example.com",
            "https://www.google.com",
            "https://www.wikipedia.org",
            "https://www.oracle.com",
            "https://www.github.com",
            "https://www.openai.com"
        );


        /*
         * ====================================================
         * THREAD POOL
         * ====================================================
         *
         * Creiamo un pool con 3 thread.
         */
        ExecutorService executor =
                Executors.newFixedThreadPool(3);


        /*
         * ====================================================
         * COMPLETION SERVICE
         * ====================================================
         *
         * Creiamo un ExecutorCompletionService associato
         * al nostro ExecutorService.
         *
         * I Callable verranno eseguiti dal Thread Pool.
         *
         * I risultati dei task completati verranno messi
         * in una coda interna.
         */
        CompletionService<DownloadResult> completionService =
                new ExecutorCompletionService<>(executor);


        /*
         * ====================================================
         * SUBMIT DEI TASK
         * ====================================================
         *
         * Inviamo tutti i download al CompletionService.
         */
        for (int i = 0; i < pages.size(); i++) {

            String url = pages.get(i);

            String fileName =
                    "pagina_" + (i + 1) + ".html";


            /*
             * Creiamo il Callable.
             */
            WebPageDownloader downloader =
                    new WebPageDownloader(
                        url,
                        fileName
                    );


            /*
             * submit() inserisce il task nel Thread Pool.
             *
             * Non ci interessa conservare il Future restituito:
             * recupereremo successivamente i task completati
             * tramite completionService.take().
             */
            completionService.submit(downloader);
        }


        /*
         * Non accettiamo più nuovi task.
         */
        executor.shutdown();


        /*
         * ====================================================
         * RECUPERO DEI RISULTATI
         * ====================================================
         *
         * Abbiamo inviato:
         *
         *     pages.size()
         *
         * task.
         *
         * Quindi dobbiamo recuperare lo stesso numero
         * di risultati.
         */
        for (int i = 0; i < pages.size(); i++) {

            try {

                /*
                 * =================================================
                 * TAKE()
                 * =================================================
                 *
                 * take() restituisce il Future del primo task
                 * che ha TERMINATO la propria esecuzione.
                 *
                 * Se nessun task è ancora terminato,
                 * take() BLOCCA il thread corrente.
                 *
                 * Appena un task termina, take() restituisce
                 * immediatamente il suo Future.
                 */
                DownloadResult result =
                        completionService
                            .take()
                            .get();


                /*
                 * Visualizziamo immediatamente il risultato
                 * del task appena terminato.
                 */
                System.out.println(
                    "COMPLETATO: "
                    + result.url()
                    + " -> "
                    + result.fileName()
                    + " -> "
                    + result.message()
                );


            } catch (InterruptedException e) {

                /*
                 * Il thread main è stato interrotto mentre
                 * aspettava un risultato.
                 */
                System.out.println(
                    "Main thread interrupted"
                );

                /*
                 * Ripristiniamo lo stato di interruzione
                 * del thread.
                 */
                Thread.currentThread().interrupt();

                break;


            } catch (ExecutionException e) {

                /*
                 * Il Callable ha generato un'eccezione.
                 */
                System.out.println(
                    "Errore nel download: "
                    + e.getCause()
                );
            }
        }


        /*
         * ====================================================
         * ATTESA DELLA TERMINAZIONE DEL POOL
         * ====================================================
         */
        try {

            if (executor.awaitTermination(
                    60,
                    TimeUnit.SECONDS)) {

                System.out.println(
                    "Tutti i download sono terminati."
                );

            }

        } catch (InterruptedException e) {

            System.out.println(
                "Main thread interrupted"
            );

            Thread.currentThread().interrupt();
        }

    }
}
