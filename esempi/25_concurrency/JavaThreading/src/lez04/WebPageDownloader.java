package lez04;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;

/*
 * ============================================================
 * WEB PAGE DOWNLOADER
 * ============================================================
 *
 * Ogni istanza di questa classe rappresenta un TASK:
 *
 *     scaricare una pagina Web
 *     e salvarne il contenuto in un file.
 *
 * Il task implementa Runnable, quindi potrà essere eseguito
 * da un Thread.
 *
 */

public class WebPageDownloader implements Runnable {

    private final String url;
    private final String fileName;

    /*
     * HttpClient può essere riutilizzato per effettuare
     * più richieste HTTP.
     */
    private final HttpClient client;


    /*
     * Costruttore.
     *
     * url      = indirizzo della pagina da scaricare
     * fileName = nome del file in cui salvare il contenuto
     */
    public WebPageDownloader(String url, String fileName) {

        this.url = url;
        this.fileName = fileName;

        this.client = HttpClient.newHttpClient();
    }


    /*
     * ========================================================
     * RUN()
     * ========================================================
     *
     * Questo metodo verrà eseguito dal Thread.
     */
    @Override
    public void run() {

        /*
         * Visualizziamo il thread che sta eseguendo il download.
         */
        System.out.println(
            Thread.currentThread().getName()
            + " -> download: " + url
        );


        try {

            /*
             * Creiamo una richiesta HTTP GET.
             */
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();


            /*
             * Inviamo la richiesta.
             *
             * BODY_HANDLING.STRING indica che vogliamo
             * ricevere il contenuto della pagina come String.
             */
            HttpResponse<String> response =
                    client.send(
                        request,
                        HttpResponse.BodyHandlers.ofString()
                    );


            /*
             * Verifichiamo il codice HTTP restituito dal server.
             *
             * 200 = richiesta completata correttamente.
             */
            if (response.statusCode() == 200) {

                /*
                 * Salviamo il contenuto della pagina nel file.
                 */
                Files.writeString(
                    Path.of(fileName),
                    response.body()
                );

                System.out.println(
                    Thread.currentThread().getName()
                    + " -> completato: " + fileName
                );

            } else {

                System.out.println(
                    Thread.currentThread().getName()
                    + " -> errore HTTP: "
                    + response.statusCode()
                );
            }

        } catch (IOException | InterruptedException e) {

            System.out.println(
                Thread.currentThread().getName()
                + " -> errore: " + e.getMessage()
            );
        }
    }
}