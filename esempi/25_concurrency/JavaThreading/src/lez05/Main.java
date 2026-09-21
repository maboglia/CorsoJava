package lez05;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;


/*
 * ============================================================
 * CALLABLE + FUTURE
 * ============================================================
 *
 * Callable permette di eseguire un task concorrente
 * che restituisce un risultato.
 *
 * Future rappresenta il risultato che sarà disponibile
 * in futuro.
 *
 */

public class Main {

    public static void main(String[] args) {


        /*
         * Lista delle pagine da scaricare.
         */
        List<String> pages = List.of(
            "https://torino.repubblica.it/",
            "https://www.google.com",
            "https://www.bogliaccino.it/public/home",
            "https://www.its-ictpiemonte.it",
            "https://www.apple.com",
            "https://www.ansa.it"
        );


        /*
         * Creiamo un Thread Pool con 3 thread.
         */
        ExecutorService executor =
                Executors.newFixedThreadPool(3);


        /*
         * ====================================================
         * LISTA DEI FUTURE
         * ====================================================
         *
         * Ogni Future rappresenta il risultato futuro
         * di un Callable.
         */
        List<Future<DownloadResult>> futures =
                new java.util.ArrayList<>();


        /*
         * ====================================================
         * SUBMIT
         * ====================================================
         *
         * Per ogni URL creiamo un Callable e lo consegniamo
         * all'ExecutorService.
         *
         * submit() restituisce immediatamente un Future.
         *
         * Il download potrebbe non essere ancora terminato.
         */
        for (int i = 0; i < pages.size(); i++) {

            String url = pages.get(i);

            String fileName =
                    "pagina_" + (i + 1) + ".html";


            WebPageDownloader downloader =
                    new WebPageDownloader(
                        url,
                        fileName
                    );


            /*
             * submit() restituisce:
             *
             *     Future<DownloadResult>
             *
             */
            Future<DownloadResult> future =
                    executor.submit(downloader);


            /*
             * Conserviamo il Future per poter recuperare
             * successivamente il risultato.
             */
            futures.add(future);
        }


        /*
         * Non accettiamo altri task.
         */
        executor.shutdown();


        /*
         * ====================================================
         * RECUPERO DEI RISULTATI
         * ====================================================
         *
         * Future.get() restituisce il risultato del Callable.
         *
         * ATTENZIONE:
         *
         * se il task non è ancora terminato,
         * get() BLOCCA il thread corrente fino a quando
         * il risultato non è disponibile.
         */
        for (Future<DownloadResult> future : futures) {

            try {

                DownloadResult result =
                        future.get();

                System.out.println(result);
                /*
                 * Visualizziamo il risultato.
                 */
                System.out.println(
                    result.url()
                    + " -> "
                    + result.message()
                );


            } catch (Exception e) {

                System.out.println(
                    "Errore: " + e.getMessage()
                );
            }
        }


        /*
         * Aspettiamo che il Thread Pool termini
         * completamente.
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
        }
    }
}