package lez07;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

/*
 * ============================================================
 * DOWNLOAD MANAGER
 * ============================================================
 *
 * Gestiamo più download contemporaneamente utilizzando
 * CompletableFuture.
 *
 * Ogni download:
 *
 *     URL
 *      ↓
 *     HTTP request
 *      ↓
 *     timeout
 *      ↓
 *     salvataggio file
 *      ↓
 *     DownloadResult
 *
 * Al termine produciamo un report complessivo.
 *
 */

public class Main {

	/*
	 * ============================================================ STAMPA REPORT
	 * ============================================================
	 *
	 * Riceve la lista dei CompletableFuture e produce il report finale dei
	 * download.
	 *
	 */
	private static void stampaReport(List<CompletableFuture<DownloadResult>> futures) {

		System.out.println();
		System.out.println("================ DOWNLOAD REPORT ================");

		int success = 0;
		int failed = 0;

		/*
		 * A questo punto allDownloads è terminato, quindi tutti i Future sono già
		 * completati.
		 *
		 * join() non deve quindi aspettare il completamento dei singoli download.
		 */
		for (CompletableFuture<DownloadResult> future : futures) {

			DownloadResult result = future.join();

			if (result.success()) {

				System.out.println("OK      " + result.url() + " -> " + result.fileName());

				success++;

			} else {

				System.out.println("ERROR   " + result.url() + " -> " + result.message());

				failed++;
			}
		}

		System.out.println("--------------------------------------------------");

		System.out.println("Totale:       " + futures.size());

		System.out.println("Completati:   " + success);

		System.out.println("Falliti:      " + failed);

		System.out.println("--------------------------------------------------");
	}

	public static void main(String[] args) {

		/*
		 * ==================================================== LISTA DELLE PAGINE
		 * ====================================================
		 */
		List<String> pages = List.of(

				"https://www.example.com",

				"https://www.wikipedia.org",

				"https://www.oracle.com",

				"https://www.github.com",

				"https://www.openai.com",

				"https://torino.repubblica.it/", "https://www.google.com", "https://www.bogliaccino.it/public/home",
				"https://www.its-ictpiemonte.it", "https://www.apple.com", "https://www.ansa.it"

		);

		/*
		 * ==================================================== LISTA DEI FUTURE
		 * ====================================================
		 *
		 * Ogni CompletableFuture rappresenta il risultato futuro di un download.
		 */
		List<CompletableFuture<DownloadResult>> futures = new ArrayList<>();

		/*
		 * ==================================================== AVVIO DEI DOWNLOAD
		 * ====================================================
		 */
		for (int i = 0; i < pages.size(); i++) {

			String url = pages.get(i);

			String fileName = "pagina_" + (i + 1) + ".html";

			/*
			 * Creiamo il downloader.
			 */
			WebPageDownloader downloader = new WebPageDownloader(url, fileName);

			/*
			 * Avviamo il download.
			 *
			 * Il metodo restituisce immediatamente un CompletableFuture.
			 */
			CompletableFuture<DownloadResult> future = downloader.download();

			/*
			 * Salviamo il Future nella lista.
			 */
			futures.add(future);
		}

		/*
		 * ==================================================== ATTESA DI TUTTI I
		 * DOWNLOAD ====================================================
		 *
		 * allOf() crea un nuovo CompletableFuture<Void> che viene completato quando
		 * TUTTI i Future della lista sono terminati.
		 */
		CompletableFuture<Void> allDownloads = CompletableFuture.allOf(futures.toArray(new CompletableFuture[0]));

		/*
		 * ==================================================== REPORT FINALE
		 * ====================================================
		 *
		 * thenRun() viene eseguito quando tutti i download sono terminati.
		 */
		allDownloads.thenRun(() -> {

			System.out.println();
			System.out.println("================ DOWNLOAD REPORT ================");

			/*
			 * Contatori.
			 */
			int success = 0;
			int failed = 0;

			/*
			 * ================================================= RECUPERO DEI RISULTATI
			 * =================================================
			 *
			 * A questo punto tutti i Future sono terminati, quindi getNow() non deve
			 * aspettare.
			 *
			 */
			for (CompletableFuture<DownloadResult> future : futures) {

				DownloadResult result = future.join();

				/*
				 * Visualizziamo il risultato.
				 */
				if (result.success()) {

					System.out.println("OK      " + result.url() + " -> " + result.fileName());

					success++;

				} else {

					System.out.println("ERROR   " + result.url() + " -> " + result.message());

					failed++;
				}
			}

			/*
			 * ================================================= RIEPILOGO
			 * =================================================
			 */
			System.out.println("--------------------------------------------------");

			System.out.println("Totale:       " + futures.size());

			System.out.println("Completati:   " + success);

			System.out.println("Falliti:      " + failed);

			System.out.println("--------------------------------------------------");
		});

		/*
		 * ==================================================== MAIN
		 * ====================================================
		 *
		 * Il main arriva qui immediatamente.
		 *
		 * Non dobbiamo chiamare get() per aspettare ogni singolo download.
		 *
		 * Abbiamo semplicemente definito cosa deve succedere quando i download saranno
		 * terminati.
		 */
		System.out.println("Download avviati...");

		allDownloads.thenRun(() -> {
			stampaReport(futures);
		}).join();
	}
}
