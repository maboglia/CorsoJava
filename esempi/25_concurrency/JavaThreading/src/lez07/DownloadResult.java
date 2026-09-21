package lez07;


/*
 * ============================================================
 * DOWNLOAD RESULT
 * ============================================================
 *
 * Questa classe rappresenta il risultato di un download.
 *
 * Contiene:
 *
 *     url       -> pagina richiesta
 *     fileName  -> file prodotto
 *     success   -> true se il download è riuscito
 *     message   -> messaggio descrittivo
 *
 */

public record DownloadResult(
        String url,
        String fileName,
        boolean success,
        String message) {
}