package lez04;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        /*
         * ====================================================
         * LISTA DELLE PAGINE DA SCARICARE
         * ====================================================
         */
        List<String> pages = List.of(
            "https://www.example.com",
            "https://www.google.com",
            "https://www.wikipedia.org"
        );


        /*
         * Creiamo un thread per ogni pagina.
         */
        for (int i = 0; i < pages.size(); i++) {

            String url = pages.get(i);

            /*
             * Generiamo un nome per il file.
             */
            String fileName = "pagina_" + (i + 1) + ".html";


            /*
             * Creiamo il task.
             */
            WebPageDownloader downloader =
                    new WebPageDownloader(url, fileName);


            /*
             * Creiamo il thread associato al task.
             */
            Thread thread = new Thread(
                downloader,
                "Downloader-" + (i + 1)
            );


            /*
             * Avviamo il thread.
             *
             * Il download viene eseguito in parallelo
             * rispetto agli altri thread.
             */
            thread.start();
        }

        System.out.println("Download avviati.");
    }
}