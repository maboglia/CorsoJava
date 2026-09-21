package lez05;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.Callable;


/*
 * ============================================================
 * WEB PAGE DOWNLOADER
 * ============================================================
 *
 * Questa volta implementiamo Callable invece di Runnable.
 *
 * Runnable:
 *
 *     run()
 *
 * esegue un'attività ma non restituisce un risultato.
 *
 * Callable<T>:
 *
 *     call()
 *
 * esegue un'attività e restituisce un risultato di tipo T.
 *
 * In questo esempio il risultato sarà un DownloadResult.
 *
 */

public class WebPageDownloader
        implements Callable<DownloadResult> {


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

        this.client = HttpClient.newHttpClient();
    }


    /*
     * ========================================================
     * CALL()
     * ========================================================
     *
     * Callable richiede di implementare il metodo call().
     *
     * A differenza di run(), call():
     *
     *     - restituisce un valore;
     *     - può dichiarare eccezioni.
     *
     */
    @Override
    public DownloadResult call() {

        /*
         * Recuperiamo il nome del thread che sta eseguendo
         * il download.
         */
        String threadName =
                Thread.currentThread().getName();


        System.out.println(
            threadName + " -> download: " + url
        );


        try {

            /*
             * Creiamo la richiesta HTTP.
             */
            HttpRequest request =
                    HttpRequest.newBuilder()
                        .uri(URI.create(url))
                        .GET()
                        .build();


            /*
             * Inviamo la richiesta al server.
             */
            HttpResponse<String> response =
                    client.send(
                        request,
                        HttpResponse.BodyHandlers.ofString()
                    );


            /*
             * Controlliamo il codice HTTP.
             */
            if (response.statusCode() == 200) {

                /*
                 * Salviamo il contenuto della pagina.
                 */
                Files.writeString(
                    Path.of(fileName),
                    response.body()
                );


                System.out.println(
                    threadName
                    + " -> completato: "
                    + fileName
                );


                /*
                 * Restituiamo un risultato positivo.
                 */
                return new DownloadResult(
                    url,
                    fileName,
                    true,
                    "Download completato"
                );

            }


            /*
             * Il server ha restituito un codice HTTP
             * diverso da 200.
             */
            return new DownloadResult(
                url,
                fileName,
                false,
                "HTTP " + response.statusCode()
            );


        } catch (IOException | InterruptedException e) {


            /*
             * In caso di errore restituiamo comunque
             * un risultato.
             */
            return new DownloadResult(
                url,
                fileName,
                false,
                e.getMessage()
            );
        }
    }
}