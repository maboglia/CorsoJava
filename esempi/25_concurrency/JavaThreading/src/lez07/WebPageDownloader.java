package lez07;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;


/*
 * ============================================================
 * WEB PAGE DOWNLOADER
 * ============================================================
 *
 * Questa classe rappresenta il task che scarica una pagina
 * Web e salva il contenuto in un file.
 *
 */

public class WebPageDownloader {

    private final String url;
    private final String fileName;

    private final HttpClient client;


    /*
     * Costruttore.
     */
    public WebPageDownloader(
            String url,
            String fileName) {

        this.url = url;
        this.fileName = fileName;

        client = HttpClient.newHttpClient();
    }


    /*
     * ========================================================
     * DOWNLOAD ASINCRONO
     * ========================================================
     *
     * Restituisce un CompletableFuture.
     *
     * Il risultato sarà disponibile in futuro.
     */
    public CompletableFuture<DownloadResult> download() {


        /*
         * Creiamo la richiesta HTTP.
         */
        HttpRequest request =
                HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();


        /*
         * ====================================================
         * SEND ASYNC
         * ====================================================
         *
         * La richiesta viene eseguita in modo asincrono.
         */
        return client
            .sendAsync(
                request,
                HttpResponse.BodyHandlers.ofString()
            )


            /*
             * =================================================
             * TIMEOUT
             * =================================================
             *
             * Se il CompletableFuture non viene completato
             * entro 10 secondi, viene completato
             * eccezionalmente con TimeoutException.
             *
             * IMPORTANTE:
             *
             * orTimeout() non significa:
             *
             *     "aspetta 10 secondi"
             *
             * ma:
             *
             *     "questo Future non può rimanere
             *      incompleto per più di 10 secondi".
             */
            .orTimeout(10, TimeUnit.SECONDS)


            /*
             * =================================================
             * THEN APPLY
             * =================================================
             *
             * Quando arriva la risposta HTTP,
             * trasformiamo HttpResponse<String>
             * in DownloadResult.
             */
            .thenApply(response -> {


                /*
                 * Controlliamo il codice HTTP.
                 */
                if (response.statusCode() != 200) {

                    return new DownloadResult(
                        url,
                        fileName,
                        false,
                        "HTTP " + response.statusCode()
                    );
                }


                try {

                    /*
                     * Salviamo il contenuto della pagina.
                     */
                    Files.writeString(
                        Path.of(fileName),
                        response.body()
                    );


                    /*
                     * Download completato.
                     */
                    return new DownloadResult(
                        url,
                        fileName,
                        true,
                        "Download completato"
                    );


                } catch (IOException e) {

                    /*
                     * Errore durante la scrittura del file.
                     */
                    return new DownloadResult(
                        url,
                        fileName,
                        false,
                        "Errore scrittura file: "
                        + e.getMessage()
                    );
                }

            })

            /*
             * =================================================
             * GESTIONE DEGLI ERRORI
             * =================================================
             *
             * exceptionally() viene eseguito se una delle
             * operazioni precedenti termina con un'eccezione.
             *
             * Esempi:
             *
             * - timeout
             * - errore di rete
             * - errore HTTP gestito come eccezione
             *
             */
            .exceptionally(error -> {


                /*
                 * Recuperiamo il messaggio dell'errore.
                 */
                String message =
                        error.getClass().getSimpleName()
                        + ": "
                        + error.getMessage();


                /*
                 * Restituiamo comunque un DownloadResult.
                 *
                 * In questo modo il programma può produrre
                 * il report finale anche se un download fallisce.
                 */
                return new DownloadResult(
                    url,
                    fileName,
                    false,
                    message
                );
            });
    }
}
